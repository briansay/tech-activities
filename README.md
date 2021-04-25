# IBM Technology Garage Interviews - Cloud Engineers

This repository contains the pairing challenges we use for the UKI IBM Technology Garage interviews, tailored for our prospective Cloud Engineers.

This isn't a 'pass/fail' set of exercises. We are looking to see how you tackle a new challenge. How do you deal with a stack you aren't used to? How well can you look up documentation and help when you're stuck? There is no pass\fail. There is no 'right' answer.

We have 5 sets of challenges:

- [Programming challenge](https://github.com/briansay/tech-activities/tree/main/1-programming-challenge/fizz-buzz)
- [Contanerisation](https://github.com/briansay/tech-activities/tree/main/2-containerise)
- [Kubernetes / OpenShift Deployments](https://github.com/briansay/tech-activities/tree/main/3-k8s-deployment)
- [Alternative Deployments](https://github.com/briansay/tech-activities/tree/main/4-alternative-deployment)
- [Advanced Deployments](https://github.com/briansay/tech-activities/tree/main/5-advanced-deployment)

Take them one at a time and **don't cheat** and look ahead :wink:.

## Pre-requisites

There are a few pre-requisites needed for both the _applicant_ and the _interviewer_:

### Applicant pre-reqs

- Share your preferred programming language e.g. JavaScript, Java, Python, Go, etc.
- Share your preferred unit testing framework e.g. Jest, JUnit, etc.
- Create an IBM ID by signing up for a free (no credit card required) IBM Cloud account
  - [Sign up here](https://cloud.ibm.com/registration)
- Either:
  - Download the OpenShift CLI, Docker CLI and Git CLI, or;
  - Download SSH capabilities on your local machine and setup a public/private key pair

### Interviewer pre-reqs

- Ensure you have access to the cloud account [1733587 - tech-garage-interviews](https://cloud.ibm.com/)
- Power on the Linux VM `interview-jump-host` in the resource group `cloud_engineers`
- Copy the applicant's public key over to the linux VM, e.g.:
  `ssh-copy-id -i $HOME/.ssh/id_rsa.pub root@<floating_ip_address>`
- Add the applicant

## Deployment

Simply clone the repo to your local machine or the Linux VM:

```bash
git clone https://github.com/briansay/tech-activities.git
```

## Authors

- [Brian Say - Solution Architect | IBM Technology Garage](https://github.com/briansay)
- [Carsten Börnert - Cloud Engineer | IBM Technology Garage](tbd)
- [Emma Dawson - Cloud Engineer | IBM Technology Garage](tbd)
