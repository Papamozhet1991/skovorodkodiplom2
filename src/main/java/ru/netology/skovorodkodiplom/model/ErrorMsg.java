package ru.netology.skovorodkodiplom.model;

import lombok.Data;

@Data
public class ErrorMsg {
    private final String message;
    private final long id;
}
