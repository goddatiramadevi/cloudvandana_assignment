const originalArray = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];

// Sort the array in descending order
originalArray.sort(function(a, b) {
    return b - a;
});

console.log(originalArray);
