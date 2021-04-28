# IBM Technology Garage Interviews - Cloud Engineers

This repository contains the pairing challenges we use for the UKI IBM Technology Garage interviews, tailored for our prospective Cloud Engineers.

This isn't a 'pass/fail' set of exercises. We are looking to see how applicants tackle a new challenge. How do they deal with a stack they aren't used to? How well can they look up documentation when stuck? There is no pass\fail. There is no 'right' answer.

# Table of Contents

1. Technical activities
2. Applicant pre-requisites
3. Interviewer pre-requisites and setup
4. Script for introduction of technical exercise
5. Author

# 1 - Technical Activities

| Number | Description                | Examples       | What we're looking for?             | Link                                                                                            |
| ------ | -------------------------- | -------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- |
| 1.     | Programming Exercise       | FizzBuzz       | Work through a programming problem  | [Link](https://github.com/briansay/tech-activities/tree/main/1-programming-challenge/fizz-buzz) |
| 2.     | Containerisation Exercise  | Dockerfile     | How to containerise an application  | [Link](https://github.com/briansay/tech-activities/tree/main/2-containerise)                    |
| 3.     | K8s / OpenShift Deployment | S2I / YAML     | How to deploy an application to K8s | [Link](https://github.com/briansay/tech-activities/tree/main/3-k8s-deployment)                  |
| 4.     | Alternative Deployments    | Jobs YAML      | Different deployment options        | [Link](https://github.com/briansay/tech-activities/tree/main/4-alternative-deployment)          |
| 5.     | Advanced Deployments       | HA deployments | Using labels / taints               | [Link](https://github.com/briansay/tech-activities/tree/main/5-advanced-deployment)             |

# 2 - Applicant Pre-requisites

- Share their preferred programming language e.g. JavaScript, Java, Python, Go, etc.
- Share their preferred unit testing framework e.g. Jest, JUnit, etc.
- Create an IBM ID by signing up for a free (no credit card required) IBM Cloud account
  - [Sign up here](https://cloud.ibm.com/registration)
- Either:
  - Download the [OpenShift CLI](https://cloud.ibm.com/docs/openshift?topic=openshift-openshift-cli) and [Docker CLI](https://docs.docker.com/get-docker/) and [IBM Cloud CLI](https://cloud.ibm.com/docs/cli?topic=cli-getting-started), or;
  - Download SSH capabilities onto their local machine and setup a [public/private key pair](https://www.digitalocean.com/community/tutorials/how-to-set-up-ssh-keys-2)

# 3 - Interviewer Pre-requisites and setup

1. Ensure you have access to the cloud account [1733587 - tech-garage-interviews](https://cloud.ibm.com/)
2. Log into the IBM cloud account [1733587 - tech-garage-interviews](https://cloud.ibm.com/)
3. [*Optional - If using the jump host*] Power on the jump-host VM:

   - Navigate to [Virtual Server Instances](https://cloud.ibm.com/vpc-ext/compute/vs) - ensuring you are on the `1733587 - tech-garage-interviews` Cloud account
   - Select the 3 dots on the right hand side of the VM named `interview-jump-host`
   - Select `Start`
   - Copy the applicant's public key onto the VM, either by:
     - Using `ssh-copy-id`. Note that you need to use the VMs floating IP address, found [here](https://cloud.ibm.com/vpc-ext/compute/vs)
       ```bash
        ssh-copy-id -f -i public_key.pub root@150.0.0.2
       ```
     - Logging onto the VM with `ssh`, copy the public key to the end of the file `~/.ssh/authorized_keys`. Note that you need to use the VMs floating IP address, found [here](https://cloud.ibm.com/vpc-ext/compute/vs)
       ```bash
       ssh root@150.0.0.2
       cat public_key.pub >> ~/.ssh/authorized_keys
       ```

4. Add the applicant's IBMiD to the account under the resource group `APPLICANT - Cloud Engineer`
   - Navigate to [IBM Cloud Users](https://cloud.ibm.com/iam/users) - ensuring you are on the `1733587 - tech-garage-interviews` Cloud account
   - Select `Invite Users`
   - Enter the applicant's IBMiD and select `add` next to the `APPLICANT - Cloud Engineer` option
   - Click `Invite` on the far right hand side
5. [*Optional - If applicant doesn't have a dockerhub account*] Login to IBM Container Registry (ICR)
   - SSH into the VM using `ssh`, e.g.
     ```bash
     ssh root@10.11.12.13
     ```
   - Login to the IBM Cloud CLI `ibmcloud login -sso` & follow instructions
   - Login to the IBM Cloud Container Registry `ibmcloud cr login`

# 4 - Script for introduction of technical exercise

`[this follows after the candidate has finished their presentation and questions]`

Let's move on to the second part of the technical challenge. We will get a bit more hands on from this point. The excercise comes in three parts:

First is a programming challenge. You told us that your favourite language is **[Javascript | Java | Python ]** so we would like you to solve a small programming problem using Test Driven Development principles. Have you used TDD before?

`[in case they have NOT used TDD provide the following introduction: ]`
The approach we follow in TDD is Red-Green-Refactor. You start with with writing the test first - as simple as possible - run it and it will fail i.e. be red. Then you write just as much code as necessary to make the test pass, i.e. make it turn green. Lastly if appropriate refactor the code/test. Using this iterative approach you build up the code until all functionality is there. Red-Green-Refactor. We use this approach in our method so it will be a good introduction for you. That is part 1.

`[continue...]`

In the second part we will take the code you've written and containerise it so it runs in a docker container.

Lastly, the challenge will be to deploy the code into an OpenShift cluster which we have prepared for you.

So in a nutshell, write a program using TDD, package it in a container, deploy the container on Openshift.

`[short pause]`

Now, there are three really important things to understand before we start:
1. The outcome you produce for this exercise is not the most important aspect for us. We're trying to understand what it is like to be working with you. So if it helps, you can think of me as the new guy in the team. As you go, explain your thought process and make sure you'll bring me along with what you're doing.
2. Remember this part is open book. Feel free to google or consult other resources along the way. (apart from googling the solution to programming challenge of course). We'd just like to see what you're doing. AND, to make this bit more fun ... you now have a joker. If at any point during this you have a question you want us to answer straight up, use it... wisely.
3. Lastly, time. Don't worry about it too much. It would be nice if you finished each part but no problem if you don't. The outcome is not the most important thing here. We have prepared code snippets and files to use with the next part of the challenge if we run out of time. So for example, if you weren't quite finished with your code in the first part, we have some sample code for you to package as a container in the second part.

Alright, does that make sense? Are you ready to start?


# Authors

- [Brian Say - Solution Architect | IBM Technology Garage](https://github.com/briansay)
- [Carsten Börnert - Cloud Engineer | IBM Technology Garage](tbd)
- [Emma Dawson - Cloud Engineer | IBM Technology Garage](tbd)
