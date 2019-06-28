package com.lambdaschool.tipsease.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Restaurant%20Actions", produces = "MediaType.APPLICATION_JSON_VALUE", tags = {"Restaurant Actions"})
@RestController
@PreAuthorize("hasAuthority('ROLE_USER')")
@RequestMapping("/restaurants")
public class ResturantsController {
    private static final Logger logger = LoggerFactory.getLogger(ResturantsController.class);

    // returns a list of restaurants and the service workers (employees/users) associated with them

    @ApiOperation(value = "This returns a list of restaurants and the users associated with them.")
    @GetMapping(value = "/restaurants", produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<?> getCurrentUser(Authentication authentication) {
        return null;
    }


}
