package jp.emotion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
public class JsonResponseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer status;
    
    private String error;
    
    private String message;
    
    private String exception;
    
    private String path;
}
