FROM node:14 
WORKDIR /usr/src/app
COPY package*.json fizzbuzz.js ./
RUN npm install
EXPOSE 3000
CMD [ "npm", "start" ]