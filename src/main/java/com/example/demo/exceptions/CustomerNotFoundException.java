package com.example.demo.exceptions;


class CustomerNotFoundException extends RuntimeException {

  CustomerNotFoundException(String Cid) {
    super("Could not find employee " + Cid);
  }
}
