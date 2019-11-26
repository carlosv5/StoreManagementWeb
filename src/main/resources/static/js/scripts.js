
$('.add').click(function() {
    $('.block:last').before('<div class="block"><textarea type="text" name="element[]" cols="30" rows="1" class="form-control rounded-0 notEmpty" placeholder="Escribe aquí el elemento que quieres"></textarea><span class="remove">Borrar elemento</span><br class="block"></div>');
    checkDisabled();
});
$('.textareas').on('click','.remove',function() {
 	$(this).parent().remove();
 	checkDisabled();
});

$('#sendNewButton').attr('disabled',true);
$('.formFilled').focusout(function(){
	checkDisabled();
});

function checkDisabled() {
		    let empty = false;
		    $('.notEmpty').each(function() {
		      empty = $(this).val().length == 0;
		      if(empty){
		    	  return false;
		      }
		    });
		    if (empty)
		      $('#sendNewButton').attr('disabled', 'disabled');
		    else
		      $('#sendNewButton').attr('disabled', false);
}
