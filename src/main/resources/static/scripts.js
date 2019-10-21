var x=2
function appendTextarea()
{
	var title = '<label class="text-black element' + x + '" for="message">Elemento ' + x + ' </label>'
	var element = '<textarea name="element' + x + '" id="element' + x + '" cols="30" rows="1" class="form-control notEmpty rounded-0 element' + x + '" placeholder="Escribe aquí el elemento que quieres"></textarea>';
	$('#textareas').append('<br class="element' + x + '">');
	$('#textareas').append(title);
	$('#textareas').append(element);
	var newBtn = '<input value="Borrar elemento" onclick ="removeTextarea()" class="btn btn-black rounded-0 py-1 px-1 element' + x + '">';
	$('#textareas').append(newBtn);
	x++;
	checkDisabled();
}

function removeTextarea()
{
	x--;
	$(".element" + x).each(function(i) {
		console.log("removing");
		$(this).remove();
	})
	checkDisabled();
}

$('#sendNewButton').attr('disabled',true);
$('.formFilled').focusout(function(){
	checkDisabled();
});

function checkDisabled() {
	$('.notEmpty').each(function(i) {
		if(!$(this).val()){
			$('#sendNewButton').attr('disabled',true);
		} else {
			$('#sendNewButton').attr('disabled',false);
		}	
	})
}