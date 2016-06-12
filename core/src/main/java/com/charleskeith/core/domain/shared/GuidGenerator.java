package com.charleskeith.core.domain.shared;

import org.apache.commons.lang.RandomStringUtils;

import java.util.UUID;

/**
 * @author Shengzhao Li
 */
public abstract class GuidGenerator {


    private GuidGenerator() {
    }

    public static String generate() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static String generateClientId() {
        return RandomStringUtils.random(32, true, true);
    }

    public static String generateClientSecret() {
        return RandomStringUtils.random(32, true, true);
    }

}