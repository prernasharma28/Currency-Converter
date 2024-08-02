function convertCurrency() {
  const USD_TO_EUR = 0.92;
  const USD_TO_GBP = 0.76;
  const EUR_TO_USD = 1.09;
  const EUR_TO_GBP = 0.83;
  const GBP_TO_USD = 1.32;
  const GBP_TO_EUR = 1.2;
  const USD_TO_INR = 83.23;

  const conversionType = document.getElementById("conversion-type").value;
  const amount = parseFloat(document.getElementById("amount").value);
  let result = 0;
  let resultText = "";

  switch (conversionType) {
    case "1":
      result = amount * USD_TO_EUR;
      resultText = `${amount} USD is ${result.toFixed(2)} EUR`;
      break;
    case "2":
      result = amount * USD_TO_GBP;
      resultText = `${amount} USD is ${result.toFixed(2)} GBP`;
      break;
    case "3":
      result = amount * EUR_TO_USD;
      resultText = `${amount} EUR is ${result.toFixed(2)} USD`;
      break;
    case "4":
      result = amount * EUR_TO_GBP;
      resultText = `${amount} EUR is ${result.toFixed(2)} GBP`;
      break;
    case "5":
      result = amount * GBP_TO_USD;
      resultText = `${amount} GBP is ${result.toFixed(2)} USD`;
      break;
    case "6":
      result = amount * GBP_TO_EUR;
      resultText = `${amount} GBP is ${result.toFixed(2)} EUR`;
      break;
    case "7":
      result = amount * USD_TO_INR;
      resultText = `${amount} USD is ${result.toFixed(2)} INR`;
      break;
    default:
      resultText = "Invalid choice.";
      break;
  }

  document.getElementById("result").innerText = resultText;
}
