var x=2
function appendTextarea()
{
	var title = '<label class="text-black" for="message">Elemento ' + x + ' </label>'
	var element = '<textarea name="element' + x + '" id="" cols="30" rows="1" class="form-control rounded-0" placeholder="Escribe aquí el elemento que quieres"></textarea>';
	$('#textareas').append('<br>');
	$('#textareas').append(title);
	$('#textareas').append(element);
	x++;
	//$('#append textarea:first').focus();
}