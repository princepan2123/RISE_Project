package com.project.projectManagement.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME= 432_000_000 ;//5 days expiration time
    public static final String TOKEN_PREFIX="Bearer";
    public static final String JWT_TOKEN_HEADER =" Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED ="Token Cannot be verified";
    public static final String COMPANY_LLC= "ABC , LLC";
    public static final String COMPANY_LLC_ADMINISTRATION="User Management Portal";
    public static final String AUTHORITIES ="authorities";
    public static final String FORBIDDEN_MESSAGE =" You need to log in to acess this page ";
    public static final String ACcESS_DENIED_MESSAGE =" You do not have permission to acess the page";
    public static final String OPTIONS_HTTP_METHOD="OPTIONS";
    public static final String[] PUBLIC_URLS= {"/user/login", "/user/resetpassword/**", "/user/image/**" , "/user/home"};

}
