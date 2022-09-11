---
layout: project
type: project
image: img/Matchmatch_logo.png
title: "MatchMatch"
date: 2018
published: true
labels:
  - Swift
  - GitHub
summary: "Memory mobile game developed in a team with Victoria Lo for CSC 581 project (Creighton)."
---

<img class="img-fluid" src="../img/MatchMatch-header.png">

A competitive card matching game developed in swift using the xcode environment, where users are scored based on the amount of time spent on matching a set of cards. Users can pick between 3 different themes, and a hiscores table keeps track of their current best scores.  

My role for this project was implementing/linking functionality for the mainstoryboard objects and my partners requested features. This involved creation of all viewcontrollers and . The specific viewcontrollers I worked on were the intro, main, and week viewcontrollers. The intro viewcontroller prompted users to choose what setting they would like to view(week view/day view)
and the parameters of the choice they would like to access. Based on the choices the user made, the intro viewcontroller would then segue into either the week or main viewcontroller. The week and main(day) view controller have similar configurations with the main differences being that the week view lets the user view the total number of entries/exits at a parking location per day of the week, while the main view lets users the number of open spots at a given time for the given day (including current day). The main and week viewcontrollers are connected to WeekGraphViewController and SecondView which showed visualizations of the interpreted data.

Working on this project gave me a good sense of how much time/resources are needed to make great apps. I was too ambitious with my initial idea and was unable to implement multiple features that I had planned on implementing. I learned valuable collaboration skills as this was the first project where I was synchronously working with another individual on the same project, but on different parts. This forced me to find effective ways to communicate what I was trying to develop, and find ways to connect my partners development with my own.

Source: [MatchMatch](https://github.com/bkimcode/bkimcode.github.io/blob/b89f65fd776766074375a1856017715a4f4fcd5d/projects/MatchMatch-project.zip)
