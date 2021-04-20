const { test } = require('@jest/globals');
const fizzbuzz = require('./fizzbuzz');

test ('Checking Jest works', () => {
  expect(1).toBe(1);
});

test ('First output is 1', () => {
  expect (fizzbuzz(1,1)).toEqual("1");
})

