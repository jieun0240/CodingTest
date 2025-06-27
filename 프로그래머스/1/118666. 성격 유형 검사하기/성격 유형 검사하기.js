function solution(survey, choices) {
    var answer = '';
    const type = {
        R: 0, T: 0,
        C: 0, F: 0,
        J: 0, M: 0,
        A: 0, N: 0
    }
    
    for (let i = 0; i < survey.length; i++) {
        const [disagree, agree] = survey[i];
        const choice = choices[i];
        const score = Math.abs(choice - 4);
        
        if(choice < 4) type[disagree] += score;
        else if (choice > 4) type[agree] += score;
    }
    
    const indicators = [
        ["R", "T"],
        ["C", "F"],
        ["J", "M"],
        ["A", "N"]
    ];
    
    for (const [a, b] of indicators) {
        if (type[a] > type[b]) answer += a;
        else if (type[a] < type[b]) answer += b;
        else answer += a < b ? a : b;
    }
    
    return answer;
}