let elemento = document.querySelector('.dias-mes')

for(i= 1; i <= 31 ; i++){
    elemento.innerHTML+= '<span class"dia">'+ i + '</span>'
   
}