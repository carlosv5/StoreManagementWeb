var x=2
function appendTextarea()
{
	var title = '<label class="text-black" for="message">Elemento ' + x + ' </label>'
	var element = '<textarea name="element' + x + '" id="element' + x + '" cols="30" rows="1" class="form-control notEmpty rounded-0" placeholder="Escribe aquí el elemento que quieres"></textarea>';
	$('#textareas').append('<br>');
	$('#textareas').append(title);
	$('#textareas').append(element);
	x++;
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