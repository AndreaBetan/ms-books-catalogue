package com.unir.ms_books_catalogue.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest {

	private String title;
	private String author;
	private LocalDate publication_date;
	private String category;
	private String isbn;
	private Integer rating;
	private Boolean visible;
}

/** libro de ejemplo para el post
	{
		"title":"PruebaX",
		"author":"Pako",
		"publication_date":"2020-01-08",
		"category":"Misterio",
		"isbn":"123456789",
		"rating":5,
		"visible":true
	}
 */
