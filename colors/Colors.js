const colorPatternTimes = (colors) => {
    let time = colors.length * 2;
    for(let i = 1; i < colors.length; i++) {
        if(colors[i - 1] !== colors[i]) {
            time++;
        }
    }
    return time;
};

console.log('colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"]) -> ' + colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"]));
console.log('colorPatternTimes(["Blue"]) -> ' + colorPatternTimes(["Blue"]));
console.log('colorPatternTimes(["Red", "Yellow", "Green", "Blue"]) -> ' + colorPatternTimes(["Red", "Yellow", "Green", "Blue"]));
console.log('colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]) -> ' + colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]));
