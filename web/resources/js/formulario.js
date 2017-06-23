function aMayusculas(obj, id) {
    obj = obj.toUpperCase();
    document.getElementById(id).value = obj;
}
function numero(n) {
    var keynum = window.event ? window.event.keyCode : n.which;
    if ((keynum === 8) || (keynum === 13) || (keynum === 6))
        return true;
    return /\d/.test(String.fromCharCode(keynum));
}


