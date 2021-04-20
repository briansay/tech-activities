// Working example 1

fizzBuzz1 = () => {
  for (var i = 1; i <= 100; i++) {
    if (i % 15 == 0) console.log('FizzBuzz');
    else if (i % 3 == 0) console.log('Fizz');
    else if (i % 5 == 0) console.log('Buzz');
    else console.log(i);
  }
};

// Working example 2
fizzBuzz2 = () => {
  for (var i = 1; i <= 100; i++) {
    var f = i % 3 == 0,
      b = i % 5 == 0;
    console.log(f ? (b ? 'FizzBuzz' : 'Fizz') : b ? 'Buzz' : i);
  }
};

// Working example 3 (smallest)
fizzBuzz3 = () => {
  for (i = 0; i < 100; )
    console.log((++i % 3 ? '' : 'Fizz') + (i % 5 ? '' : 'Buzz') || i);
};

fizzBuzz1();
// fizzBuzz2();
// fizzBuzz3();
