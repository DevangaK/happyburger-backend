package com.example.feedbackservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FEEDBACKNEW")
public class Feedback {
    @Id
    @GeneratedValue
    private int order_id;
    private String customer_name;
    private String rating;
    private String review_message;

}
