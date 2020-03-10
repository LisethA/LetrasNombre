
  var letters;
        
letters = ["l","i","s","e","t","h"];
i=letters.length;

       
        text = "<ul>";
            for (i = 0; i < letters.length; i++) {
                text += "<li>" + letters[i] + "</li>";
            }
            text += "</ul>";
        
document.getElementById("demo").innerHTML = text;