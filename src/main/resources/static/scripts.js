var x=2
function appendTextarea()
{
	var title = '<label class="text-black" for="message">Elemento ' + x + ' </label>'
	var element = '<textarea name="element' + x + '" id="" cols="30" rows="1" class="form-control notEmpty rounded-0" placeholder="Escribe aquí el elemento que quieres"></textarea>';
	$('#textareas').append('<br>');
	$('#textareas').append(title);
	$('#textareas').append(element);
	x++;
	checkDisabled();
	//$('#append textarea:first').focus();
}
$('#sendNewButton').attr('disabled',true);
$('.notEmpty').focusout(function(){
	checkDisabled();
});

function checkDisabled() {
	$('.notEmpty').each(function(i) {
		if(!$(this).val()){
			console.log("true");
			$('#sendNewButton').attr('disabled',true);
		} else {
			$('#sendNewButton').attr('disabled',false);
			console.log("false");
		}	
	})			
}
//$('#sendNewButton').attr('disabled',true);