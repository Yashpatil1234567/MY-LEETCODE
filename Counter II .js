/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */

var createCounter = function(init) {
    let current=init;
    function increment(){
        current ++;
        return current;
    }
    function reset(){
         current=init;
        return current;

    };
   function decrement(){
        current --;
        return current;

   };

   return{
    increment,decrement,reset
   }

    
};
