package jp.emotion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class VideoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer emUserId;
    
    private String email;
    
    private String password;
    
    private String fname;
    
    private String lname;
    
    private String deviceIdentifier;
    
    private Boolean locked;
    
    private Integer created;
    
    private Date createdDate;
    
    private Integer modified;
    
    private Date modifiedDate;
}
