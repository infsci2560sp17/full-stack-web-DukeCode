# BBanker

1. what is the proposed name for your Web Application?
    - BBanker
2. Who is the target audience for your Web Application?
    - People who wants to manage their property efficiently and protect their money from potential financial risks.
3. What problem is it intended to solve for the target audience?
    - In modern society, money has become one of the key standards to evaluate people's success. Under this situation, people cares more about the safety and increasement of their property than before. There are a lot of property management applications, however, most of them only focused on providing account information and failed to provide some tips on how to better manage the property. This application will combine account information with social features (financial book exchanging system and analysis sharing system) and official consultants to better users' experience, thus help them solve financial problems
4. How will it meet the minimum project requirement?
    - This website will use freemium model. News and property management tips is free accessible. A login or account creation will be required to manage personal property in the application, also to communicate with professionals and others. These data will be stored in my database. OAuth2 authentication is supported for users want to connect with other social accounts. Public data will be accessibe through RESTful services. All RESTful service will data in both JSON and XML formats.
5. Why is your proposed Web Application unique or creative beyond simply meeting the minimum requirements?
    - My site will customize the experience of property management.
     I'll track site usage, interactions with others, and content viewed to provide a customized experience. I will also keep posting instance of how famous bankers manage their own property.
     Through this application, people can keep track of their financial situation and get help from official consultant based on specific portfolio.

## Build Status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode)

## Change Log

[Change Log](CHANGELOG.md)

## Logo

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/logo.png)

## Web Site

[BBanker](https://jin-first-2017.herokuapp.com)

## Key Features

* Property Management System: provide online property management database.
* Official Consultant: provide customized investment consultant based on customer's portfolio.
* Book Exchanging System: allow people to post and exchange financial books and make comments on books.
* Market Analysis: a place for people to publish their own financial analysis and book comments.

## Project Details

### Landing Page

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot1.png)

### Log In Page

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot2.png)

### Homepage

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot3.png)

### Property Management

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot4.png)

### Analysis Management

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot5.png)

### Sharedbooks Management

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot6.png)

### Bookcomments Management

![](https://github.com/infsci2560sp17/full-stack-web-DukeCode/blob/master/src/main/resources/static/images/screenshot7.png)

## API

    @Controller
    public class AccountsController {
    @RequestMapping(value = "accounts", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("accounts", "accounts", repository.findAll());}
    @RequestMapping(value = "accounts/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Account account, BindingResult result) {
        repository.save(account);
        return new ModelAndView("accounts", "accounts", repository.findAll());}
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

Get one property with id provided

##### Request

GET /accounts/1

##### Body

accountType=deposit

##### JSON Response

json { "id":1, "amount":1000, "provider":"BOA", "accountType":"Deposit" }

##### XML Response



## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
- [BootStrap](http://getbootstrap.com) - BootStrap is a popular front-end framework.
- [BootStrap-Social](bootstrap-social) - BootStrap-Social is a CSS style based on BootStrap to provide customized social button styles.
- [Font-Awesome](http://fontawesome.io) - Similar to BootStrap-Social, Font-Awesome is based on Bootstrap and CSS to provide customized social button styles.
- [tailorbrands.com](https://www.tailorbrands.com/) - tailorbrands.com is an online logo maker website which provides customized logo design.