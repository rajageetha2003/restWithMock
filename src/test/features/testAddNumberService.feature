Feature: Test Add Numbers Service

  Scenario Outline: Call AddNumbers API with valid params
    Given Add two numbers <Number1> and <Number2> - Result should be <Total>

    Examples:
      | Number1 | Number2 | Total |
      | 2       | 3       |  5.0    |
      | 1.56    | 4.01    | 5.57  |
      | -56       | -33       |  -89.0    |
      | 20.78       | -13       |  7.780000000000001    |
      | 87876   | 0       |  87876.0    |
      | -765676.7056 | 0       |  -765676.7056    |
      | 34567826.2356    | 5.76346676536E7    | 9.22024938892E7  |
      | -9.2024938892E6    | -5.76346676536E7    | -6.68371615428E7  |
