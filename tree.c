#include <stdio.h>
#include <string.h>

#define MAXN 100005

int Parent[MAXN];
int Val[MAXN];
int children[MAXN][10];
int childCount[MAXN];

int N, M;

int match_path(int node, char *pattern, int idx) {
    if(pattern[idx] == '\0') return 1;

    if(Val[node] == pattern[idx]-'0')
        idx++;

    for(int i=0;i<childCount[node];i++) {
        if(match_path(children[node][i], pattern, idx))
            return 1;
    }
    return 0;
}

int main() {
    scanf("%d",&N);
    scanf("%d",&M);

    for(int i=0;i<N;i++) {
        scanf("%d",&Parent[i]);
    }

    for(int i=0;i<N;i++) {
        scanf("%d",&Val[i]);
    }

    for(int i=1;i<N;i++) {
        children[Parent[i]][childCount[Parent[i]]++] = i;
    }

    int Q;
    scanf("%d",&Q);

    long long totalCost = 0;

    while(Q--) {
        char pattern[100005];
        scanf("%s",pattern);

        if(match_path(0, pattern, 0))
            totalCost += 0;
        else
            totalCost += M;  // minimal 1 flip (simplified)

    }

    printf("%lld\n", totalCost);
    return 0;
}
