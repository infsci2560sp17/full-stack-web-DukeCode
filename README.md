# BBanker

1. what is the proposed name for your Web Application?
    - BBanker
2. Who is the target audience for your Web Application?
    - People who wants to manage their property efficiently and protect their money from potential financial risks.
3. What problem is it intended to solve for the target audience?
    - In modern society, money has become one of the key standards to evaluate people's success. Under this situation, people cares more about the safety and increasement of their property than before. There are a lot of property management applications, however, most of them only focused on providing account information and failed to provide some tips on how to better manage the property. This application will combine account information with statistical analysis on current property, therefore provide specific plans to help customers to better manage their property and protect their property from potential financial risks. Also, a forum will be provided for people to communicate with each other.  
4. How will it meet the minimum project requirement?
    - This website will use freemium model. News and property management tips is free accessible. A login or account creation will be required to manage personal property in the application, also to communicate with professionals and others. These data will be stored in my database. OAuth2 authentication is supported for users want to connect with other social accounts. Public data will be accessibe through RESTful services. All RESTful service will data in both JSON and XML formats.
5. Why is your proposed Web Application unique or creative beyond simply meeting the minimum requirements?
    - My site will customize the experience of property management.
     I'll track site usage, interactions with others, and content viewed to provide a customized experience. I will also keep posting instance of how famous bankers manage their own property.
     Through this application, people can compare the amount and increasement of their property with each other through a ranking system.

## Build Status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode)

## Change Log

[Change Log](CHANGELOG.md)

## Web Site

[BBanker](https://jin-first-2017.herokuapp.com)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API
@Controller
public class AccountsController {
    @RequestMapping(value = "accounts", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("accounts", "accounts", repository.findAll());
    }

    @RequestMapping(value = "accounts/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Account account, BindingResult result) {
        repository.save(account);
        return new ModelAndView("accounts", "accounts", repository.findAll());
    }
}

### API Method 1

    GET accounts

#### Parameters

- **accounts** _(required)_ — Existed list of accounts.

#### Response

A JSON or XMLobject containing a list of existed account ID and accounts.

### API Method 2

    POST accounts/add

#### Parameters

- **id** _(required)_ — The account ID of new account.
- **amount** _(required)_ — The amount in dollars of new account.
- **provider** _(required)_ — The provider of new account.
- **accountType** _(required)_ — The accountType of new account.

#### Response

A JSON or XMLobject containing a list of existed account info and new account.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — 

#### Example

##### Request

##### Body

##### JSON Response

##### XML Response



## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.