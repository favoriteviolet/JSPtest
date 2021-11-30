/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){
    $(".menuitem>a").mouseenter(function(){
        $(".submenu").removeClass("current");
        $(this).next(".submenu").addClass(".current");
    });
    $(".menuitem").mouseleave(function(){
        $(".submenu").removeClass("current");
    });
});

