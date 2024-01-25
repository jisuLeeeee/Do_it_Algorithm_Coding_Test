package Section3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol_2178 {
    // 상하좌우를 탐색하기 위한 변수
    // (0, 1), (1, 0), (0, -1), (-1, 0)
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        
        bfs(0, 0);
        System.out.println(A[N-1][M-1]);
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        // 시작점을 설정
        queue.offer(new int[] {i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            // 상하좌우로 탐색
            for(int k=0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                // 미로 범위 안에 있고
                if(x >=0 && y >= 0 && x < N && y < M){
                    // 이동할 수 있는 칸이고 방문하지 않은 칸
                    if(A[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        // depth를 현재 노드의 depth + 1로 업데이트하기
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
