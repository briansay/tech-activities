def fizzbuzz(i):
  if i % 15 == 0:
    return('fizzbuzz')
  elif i % 3 == 0:
    return('fizz')
  elif i % 5 == 0:
    return('buzz')
  else:
    return(i)

def main():
   for i in range(1,101):
    print(fizzbuzz(i))

if __name__ == '__main__':
  main()