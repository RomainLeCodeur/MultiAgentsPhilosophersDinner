<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->


<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->



<!-- PROJECT LOGO -->
<br />
<div align="center">

<h3 align="center">Philosopher's Dinner Exercise</h3>

  <p align="center">
    AMAS Exercise using the AMAK framework
    <br />
    <a href="https://github.com/alexandreprl/amak"><strong>AMAK Framework »</strong></a>
    <br />
    <br />
    <a href="https://github.com/alexandreprl/amak-exercise-philosophers-dinner/issues">Report Bug</a>
    ·
    <a href="https://github.com/alexandreprl/amak-exercise-philosophers-dinner/issues">Request Feature</a>
  </p>
</div>



<!-- ABOUT THE PROJECT -->
## About The Exercise

A table has X philosophers sitting around it. The philosophers do only two things: think and eat. While eating, they are not thinking, and while thinking, they are not eating. The philosophers share a big plate of spaghetti. There are X forks on the table, one between each pair of adjacent philosophers. To eat, a philosopher needs to pick up the two forks next to him. The problem is to design a protocol for the philosophers that prevents deadlock (two or more philosophers waiting indefinitely for each other to release a fork) and avoids starvation (a philosopher waiting indefinitely to eat).

More infos https://en.wikipedia.org/wiki/Dining_philosophers_problem

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* Click on "Use this template" then "Create a new repository"
* Clone your new repository
* Open the project in your favorite IDE (Use open project in IntelliJ IDEA or Import Gradle Project in Eclipse)
* Run Launcher.main()

### Exercise

The class __PhilosopherAgent__ contains the behavior of a philosopher. Complete the method _onDecideAndAct_ so that the philosophers are cooperative. The goal is for the philosophers to eat the same quantity.

### Useful methods

* __fork.release(this)__ : release a fork
* __fork.tryTake(this)__ : try to take a fork, returns false if the fork is already taken
* __getMostCriticalNeighbor(boolean includingMe)__ : returns the most critical neighbor. If includingMe is true, the current agent is included in the search
* __eatPastas()__ : eat pastas

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the LGPL License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>




