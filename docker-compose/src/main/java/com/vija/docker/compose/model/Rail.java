package com.vija.docker.compose.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rail")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rail {


    @Id
    private String railId;
    private String railName;

}

