const getItemsAt = (items,oddOrEven) => {

    let result = [];

    if(items.length === 0) {
        return result;
    } else if(items.length > 0) {
        if(oddOrEven === "odd") {
            result.push(items[items.length - 1]);
            items.splice(items.length - 2, 2);
            return getItemsAt(items,oddOrEven).concat(result);
        } else if(oddOrEven === "even") {
            items.pop();
            return getItemsAt(items,"odd");
        }
    }
};

console.log('getItemsAt([2, 4, 6, 8, 10], "odd") -> [' + getItemsAt([2, 4, 6, 8, 10], "odd") + ']');
console.log('getItemsAt(["E", "D", "A", "B", "I", "T"], "even") -> [' + getItemsAt(["E", "D", "A", "B", "I", "T"], "even") + ']');
console.log('getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"], "even") -> [' + getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"], "even") + ']');
console.log('getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even") -> [' + getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even") + ']');
