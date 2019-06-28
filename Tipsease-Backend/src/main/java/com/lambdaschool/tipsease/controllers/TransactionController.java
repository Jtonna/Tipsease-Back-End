package com.lambdaschool.tipsease.controllers;

import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Tipping%20Actions", produces = "MediaType.APPLICATION_JSON_VALUE", tags = {"Tipping Actions"})
@RestController
@PreAuthorize("hasAuthority('ROLE_USER')")
@RequestMapping(value = "/transactions")
public class TransactionController
{

    // used for sending transactions

}
