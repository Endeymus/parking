package com.endeymus.parking.configs;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Qualifier
public @interface Floor1 {
}
