function solution(park, commands) {
    const directions = {
        'E': [0, 1],
        'W': [0, -1],
        'N': [-1, 0],
        'S': [1, 0]
    };

    const H = park.length;
    const W = park[0].length;

    let pos = [0, 0];

    // 시작 위치를 찾는다.
    for (let i = 0; i < H; i++) {
        for (let j = 0; j < W; j++) {
            if (park[i][j] === 'S') {
                pos = [i, j];
                break;
            }
        }
    }

    const isInBounds = (x, y) => x >= 0 && x < H && y >= 0 && y < W;

    for (const command of commands) {
        const [dir, steps] = command.split(' ');
        const [dx, dy] = directions[dir];
        let [x, y] = pos;
        let canMove = true;

        for (let step = 0; step < Number(steps); step++) {
            x += dx;
            y += dy;

            if (!isInBounds(x, y) || park[x][y] === 'X') {
                canMove = false;
                break;
            }
        }

        if (canMove) {
            pos = [x, y];
        }
    }

    return pos;
}

// 예제
const park = [
    ['O', 'O', 'O', 'O', 'O'],
    ['O', 'X', 'X', 'X', 'O'],
    ['O', 'O', 'S', 'O', 'O'],
    ['O', 'X', 'O', 'O', 'O'],
    ['O', 'O', 'O', 'O', 'O']
];