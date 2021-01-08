package com.chijarira.Nipate.KaziNipate.controller;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarouselController {
	
    @GetMapping(value = "/api/image/carousel")
    public ResponseEntity<InputStreamResource> getImage(@RequestParam("background") String background) throws IOException {

    	ClassPathResource imgFile;
    	
    	switch(background){
    		case "chef":
    			imgFile = new ClassPathResource("image/chef.png");
    			break;
    		case "receptionist":
    			imgFile = new ClassPathResource("image/receptionist.png");
    			break;
    		case "mechanic":
    			imgFile = new ClassPathResource("image/mechanic.png");
    			break;
    		default:
    			imgFile = new ClassPathResource("image/jsa_about_img_white_background.png");
    	}
    	
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}