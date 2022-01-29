Gestion agence de voyage avec mysql comme sgbd----------------------------------------------
Url     : http://codes-sources.commentcamarche.net/source/51774-gestion-agence-de-voyage-avec-mysql-comme-sgbdAuteur  : PharaonjuDate    : 01/08/2013
Licence :
=========

Ce document intitulé « Gestion agence de voyage avec mysql comme sgbd » issu de CommentCaMarche
(codes-sources.commentcamarche.net) est mis à disposition sous les termes de
la licence Creative Commons. Vous pouvez copier, modifier des copies de cette
source, dans les conditions fixées par la licence, tant que cette note
apparaît clairement.

Description :
=============

C'est mon premier programme en java. C'est un TP que j'ai r&eacute;alis&eacute; 
dans le cadre d'un cours sur les bases de  donn&eacute;es. Il aborde bri&eacute;
vement la notion sur les bases de donn&eacute;es (avec MYSQL), le jTable, les bu
ttons,...
<br />Le programme permet de gerer le reservation de client en foncti
on de la destination et du nombre de place disponible. Nous n'avons pas pris en 
compte la comptabilit&eacute;, l'&eacute;tablisement de billets,..
<br />Veuill
ez lance la classe mains. 
<br />J'ai utilise Net Beans 6.8 et wampserver 2.0

<br />Cr&eacute;er une base de donnee et importer le fichier voyager_db (contien
t le requ&ecirc;te SQL). comme pilote j'ai utilise ODBC qui communique avec Mysq
l connector. La source de donn&eacute;e doit porte le nom de &quot;voyage&quot;.
 Le user : Root, mot de passe (laisse vide) ou bien correspondant &agrave; votre
 configuration de Mysql
<br />J'ai rencontr&eacute; un serieux probl&egrave;mes
 avec jTable. Lors de l'ajout de ligne de mani&egrave;re dynamique, les lignes e
n dessous n'&eacute;tait plus acc&eacute;ssible.
