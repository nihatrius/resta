package com.trius.resta.rest;


import com.trius.resta.dto.UserDTO;
import com.trius.resta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 *
 **/

@RestController
@RequestMapping("/api/user")
public class UserRestController implements Serializable {

    @Autowired
    UserService userService;

    @GetMapping("/{contact_id}")
    public ResponseEntity<?> getContact(@PathVariable("contact_id") Integer contact_id) {
        try {

            // return new ResponseEntity<ContactDTO>(convertToContactDTO(contact),HttpStatus.OK);
            return new ResponseEntity<String>("Kullanıcı Bulunamadı.", HttpStatus.NOT_FOUND);

        } catch (Exception e) {

            return new ResponseEntity<String>("Kullanıcı Bulunamadı.", HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<?> addContact(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<String>("Kullanıcı Bulunamadı.", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{contact_id}")
    public ResponseEntity<?> updateContact(@PathVariable("contact_id") Integer contactId, @RequestBody UserDTO userDTO) {
        return new ResponseEntity<String>("Kullanıcı Bulunamadı.", HttpStatus.NOT_FOUND);
    }

}