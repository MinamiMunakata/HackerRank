'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the minimumBribes function below.
function minimumBribes(q) {
    let bribe = 0;
    let i = 0;
    let nextRound = false;
    while (i < q.length - 1) {
        let initialPosition = i + 1;
        if (initialPosition - q[i] < -2) {
            console.log("Too chaotic");
            return;
        } else {
            if (q[i] > q[i + 1]) {
                nextRound = true;
                // Switch 2 items.
                let temp = q[i];
                q[i] = q[i + 1];
                q[i + 1] = temp;
                bribe++;
            }
            if (i == q.length - 2 && nextRound) {
                i = 0;
                nextRound = false;
            } else {
                i++;
            }
        }
    }
    console.log(bribe);
}

function main() {
    const t = parseInt(readLine(), 10);

    for (let tItr = 0; tItr < t; tItr++) {
        const n = parseInt(readLine(), 10);

        const q = readLine().split(' ').map(qTemp => parseInt(qTemp, 10));

        minimumBribes(q);
    }
}
