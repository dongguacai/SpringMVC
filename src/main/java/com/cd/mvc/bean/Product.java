package com.cd.mvc.bean;

import org.springframework.stereotype.Service;

@Service
public class Product
{
    private String name;
    
    private String age;
    
    private String height;
    
    private String color;
    
    private String cc;
    
    private String dd;
    
    public void sayHello()
    {
        System.out.println("hello xiaoming");
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAge()
    {
        return age;
    }
    
    public void setAge(String age)
    {
        this.age = age;
    }
    
    public String getHeight()
    {
        return height;
    }
    
    public void setHeight(String height)
    {
        this.height = height;
    }
    
}
