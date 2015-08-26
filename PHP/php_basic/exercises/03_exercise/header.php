<?php
$url = explode('/',$_SERVER['REQUEST_URI']);    
$title = current(array_reverse(array_filter($url)));
$title = str_replace('.php','',$title);
?>
<!DOCTYPE html>
<html lang="br">
<head>
    <meta charset="UTF-8">
    <title><?php echo ($title == "index" or $title == "03_exercise")? $title="Home":$title;?></title>
</head><!-- header of site-->
<body>
    <header>
    <a href="index.php">PHP Training</a>
</header>
    <nav>
    <ul>
        <li><a href="index.php">Home</a></li>
        <li><a href="empresa.php">Empresa</a></li>
        <li><a href="localizacao.php">Localização</a></li>
        <li><a href="produtos.php">Produtos</a></li>
        <li><a href="fale_conosco.php">Fale Conosco</a></li>
    </ul>
</nav><!-- Navigation -->

