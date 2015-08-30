<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Condicionais em PHP</title>
</head>
<body>
<?php
$numero = 40;
if($numero == 40)
    echo "Imprimindo o número: $numero<br>";
if($numero <= 40 and $numero > 10)
    echo "O número: $numero é menor ou igual a $numero e $numero é maior que 10 ";

?>
</body>
</html>