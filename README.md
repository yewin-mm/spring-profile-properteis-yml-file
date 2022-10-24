# spring-profile-properties-yml-file
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/spring-profile-properties-yml-file.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/spring-profile-properties-yml-file/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/spring-profile-properties-yml-file.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/spring-profile-properties-yml-file/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/spring-profile-properties-yml-file.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/spring-profile-properties-yml-file/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/spring-profile-properties-yml-file.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/spring-profile-properties-yml-file/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/
[product-screenshot]: images/screenshot.png


<h1 align="center">
  Overview
  <img src="https://github.com/yewin-mm/spring-profile-properties-yml-file/blob/master/github/template/images/overview/spring_profile_properties_yml_file.png" /><br/>
</h1>

# spring-profile-properties-yml-file
* This is the sample project for changing depend on environment by using Spring profile active.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is Demo Project for changing spring profile as per active value. <br>
Separating application profile is good approach when you build enterprise application which is running on different servers and related with Thirdparty which also has different servers.
* Eg. If your application need to run on UAT (for testing purpose), and Production (for real world go live app),
* For that case, there might have different configs in those two servers.
* And you might need to call to Thirdparty API endpoints and need to call your other service APIs which are deploy in different servers and which might has different credentials to access APIs on each server.
* If you have only one properties file,
* For that case, you need to add UAT credentials and API links when you call Thirdparty UAT API endpoints in your properties file.
* You also need to add Prod credentials and API links when you call ThirdParty Prod API endpoints in your properties file.
* That will cause busy to you when you test for that different environments, and that might be wrong adding value and that might cause mistakes.

For that above case, all will be OK by config only one time for separating properties files and control with Spring profile in main properties file. <br>
All you need is just need to change profile active value in this main config file, and it will reduce mistake between different server values. <br>
So, it's better separating properties files and control with Spring profile active value. <br>

You can learn how to control to reach to other properties file from main properties file in this project. <br>
Here, I showed as demo in two ways,
1. using Properties file
2. using YML file

You need to use only one way in your real world project.<br>
These above two file are same and each file type has different advantages.<br>
* If you familiar with properties file and that will make clear when you read configs, it's better going with properties file.
* If you don't want to add repeated fields like server.port and server.servlet.context-path, (server is repeated keyword), you can use YML file.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)


<a name="getting-started"></a>
## 🔥 Getting Started
This project is built with java, maven and use `Project Lombok` as plugin.
So, please make sure all are installed in your machine.


<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, Github and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot and other spring basic knowledge, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)



<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/spring-profile-properties-yml-file.git


<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction).


<a name="instruction"></a>
### 📝 Instruction
* Run the project in your IDE.

* Import `spring-profile-properties-yml-file.postman_collection.json` file under project directory (see that file in project directory) into your installed Postman application.
    * Click in your Postman (top left corner) import -> file -> upload files -> {choose that json file} and open/import.
    * After that, you can see the folder which you import from file in your Postman.
* Now, you can 'Test' this project by calling API from Postman.
    * Open your imported folder in postman and inside this folder, you will see total of 3 APIs, you can test that all APIs by clicking `Send` button one by one and see the response.
    * See the application.properties file and application.yml file.
    * If you want to test UAT and Prod api,
    * You just need to change spring-profile-active value to `uat` and `prod` and see the response by calling api UAT api and Prod api.
    * And see the uat-properties file and prod-properties file too.
    * Please note that Spring framework look up properties file first.
    * So, you can test YML file is working well or not by comment out all properties files data.
    * You can also check in your IDE log for some print out values.

* After that you can see the code and check the code which you don't know. You can learn it, and you can apply in your job or study fields.

***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact
Name - Ye Win <br> LinkedIn profile -  [Ye Win's LinkedIn](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - yewin.mmr@gmail.com

Project Link: [Spring Profile Properties and YML file](https://github.com/yewin-mm/spring-profile-properties-yml-file)


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request

