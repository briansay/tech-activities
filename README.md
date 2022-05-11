# IBM Client Engineering Interviews - Cloud Engineers

This repository contains the pairing challenges we use for the UKI Client Engineering interviews, tailored for our prospective Cloud Engineers.

This isn't a 'pass/fail' set of exercises. We are looking to see how applicants tackle a new challenge. How do they deal with a stack they aren't used to? How well can they look up documentation when stuck? There is no pass\fail. There is no 'right' answer.

## Technical exercises

Here are the challenges that will be performed as part of the pairing exercises:

| Number | Description                | Examples   | What we're looking for?             | Link                                                                                    |
| ------ | -------------------------- | ---------- | ----------------------------------- | --------------------------------------------------------------------------------------- |
| 1.     | TDD Exercise               | FizzBuzz   | Work through a programming problem  | [Link](https://github.com/briansay/tech-activities/tree/main/1-tdd-challenge/fizz-buzz) |
| 2.     | Containerisation Exercise  | Dockerfile | How to containerise an application  | [Link](https://github.com/briansay/tech-activities/tree/main/2-containerise)            |
| 3.     | K8s / OpenShift Deployment | S2I / YAML | How to deploy an application to K8s | [Link](https://github.com/briansay/tech-activities/tree/main/3-k8s-deployment)          |

## Applicant pre-requisites

Applicants need to:

- Share their preferred programming language e.g. JavaScript, Java, Python, Go, etc.
- Share their preferred unit testing framework e.g. Jest, JUnit, etc.
- Download the [Docker CLI](https://docs.docker.com/get-docker/) or [Podman CLI](https://podman.io/getting-started/installation) 
- Download SSH capabilities onto their local machine and setup a [public/private key pair](https://www.digitalocean.com/community/tutorials/how-to-set-up-ssh-keys-2)

## Interviewer pre-requisites and setup

Interviewers need to:

1. Ensure you have access to the cloud account [1733587 - client-eng-interviews](https://cloud.ibm.com/)
2. Power on the jump-host VM:

   - Navigate to [Virtual Server Instances](https://cloud.ibm.com/vpc-ext/compute/vs) - ensuring you are on the `1733587 - client-eng-interviews` Cloud account
   - Select the 3 dots on the right hand side of the VM named `interview-jump-host`
   - Select `Start`

3. Copy the applicant's public key onto the VM, either by:

   - Using `ssh-copy-id`. Note that you need to use the VMs floating IP address, found [here](https://cloud.ibm.com/vpc-ext/compute/vs)

     ```bash
     ssh-copy-id -f -i public_key.pub root@150.0.0.2
     ```

   - Logging onto the VM with `ssh`, copy the public key to the end of the file `~/.ssh/authorized_keys`. Note that you need to use the VMs floating IP address, found [here](https://cloud.ibm.com/vpc-ext/compute/vs)

     ```bash
     ssh root@150.0.0.2
     cat public_key.pub >> ~/.ssh/authorized_keys
     ```

4. Log into the IBM Cloud CLI using interviewer onetime passcode
    - End user types `ibmcloud login -sso`
    - Interviewer or observer navigates to [https://identity-3.uk-south.iam.cloud.ibm.com/identity/passcode](https://identity-3.uk-south.iam.cloud.ibm.com/identity/passcode)
    - Copy the code to the interviewee who then copies it into the CLI 
    - Select the number associated with `1733587 - client-eng-interviews`

6. [*Optional - If applicant doesn't have a dockerhub account*] Login to IBM Container Registry (ICR)
   - Run the command `ibmcloud cr`

## Interviewer closeout steps 

1. Logout of the IBM Cloud CLI 
    - `ibmcloud logout`
2. Remove the interviewees SSH key from the VM 
    - SSH into the VM 
    - Navigate to `~/.ssh/authorized_keys`
    - Remove the SSH key. If you used ssh-copy-id it should be the last entry in the document
3. Shut down the VM - same steps as starting the machine, but hit `stop`

## Key Links

Screen share for the IBM-er pair as they explain the set of challenges:

- PPT slide - [https://ibm.box.com/s/f9dsbpdayd8x4vmgdfz6efua4yql7des](https://ibm.box.com/s/f9dsbpdayd8x4vmgdfz6efua4yql7des)

Links to share with the applicant. **Observer** please find & copy these into the WebEx chat whilst the IBM-er pair is explaining the exercises:

- Folder with all links (as individual links keep adding expiration timers) - [https://ibm.box.com/s/qjobtgm9ab4vybvuvchw1jasjszc1eql](https://ibm.box.com/s/qjobtgm9ab4vybvuvchw1jasjszc1eql)

## Script for introducing the technical exercises

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

## Authors

- [Brian Say - Solution Architect | IBM Client Engineering](https://github.com/briansay)
- [Carsten Börnert - Cloud Engineer | IBM Client Engineering](tbd)
- [Emma Dawson - Cloud Engineer | IBM Client Engineering](tbd)
