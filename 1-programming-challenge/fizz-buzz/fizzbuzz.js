// Super simple working example

function fizzBuzz(start, end) {
  let output = "";
  
  for (var i = start; i <= end; i++) {
    if (i % 15 == 0) output += 'FizzBuzz,';
    else if (i % 3 == 0) output += 'Fizz,';
    else if (i % 5 == 0) output += 'Buzz,';
    else output += i+',';
  }

  output = output.slice(0, -1)
  return output;
};

// console.log(fizzBuzz(1,100));

module.exports = fizzBuzz;
