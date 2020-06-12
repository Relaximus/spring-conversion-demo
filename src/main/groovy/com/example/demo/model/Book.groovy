package com.example.demo.model

import groovy.transform.ToString

@ToString
class Book {
    int id
    Date issueDate
    Author author
    BookStatus status
}
