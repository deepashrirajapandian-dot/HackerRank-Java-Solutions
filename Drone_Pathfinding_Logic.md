Applying AI Problem-Solving Approach to a Delivery Drone Path-Finding Scenario
Problem Description

A delivery drone must travel from a start location to a goal location in a grid environment. Some grid cells contain obstacles that the drone cannot pass through. The objective is to find the optimal path with the minimum cost.

To solve this, the problem is formulated using the AI problem-solving approach, which consists of defining states, actions, goal test, and path cost.

1️⃣ State Space

A state represents the current position of the drone in the grid.

Each state is defined by a pair of coordinates:

State
=
(
𝑥
,
𝑦
)
State=(x,y)

All grid cells except obstacles are valid states.

Example:
(1,2), (3,4), (5,5)

Obstacle cells ❌ are excluded from the state space.

2️⃣ Initial State

The initial state is the starting position of the drone.

Initial State
=
(
𝑥
0
,
𝑦
0
)
Initial State=(x
0
	​

,y
0
	​

)

Example:
Start position = (0,0)

3️⃣ Actions

Actions define the possible moves of the drone from any state.

Possible actions:

Move Up

Move Down

Move Left

Move Right

Action constraints:

The move must stay within the grid boundaries

The destination cell must not be an obstacle

4️⃣ Transition Model

The transition model describes the result of applying an action to a state.

Example transitions:

From (x, y):

Move Up → (x−1, y)

Move Down → (x+1, y)

Move Left → (x, y−1)

Move Right → (x, y+1)

If the resulting cell is an obstacle, the action is invalid.

5️⃣ Goal State and Goal Test

The goal state is the destination where the delivery must be made.

Goal State
=
(
𝑥
𝑔
,
𝑦
𝑔
)
Goal State=(x
g
	​

,y
g
	​

)

The goal test checks whether the current state is the goal state.

Goal Test: Current State
=
=
Goal State
Goal Test: Current State==Goal State

If true, the problem is successfully solved.

6️⃣ Path Cost

Path cost represents the total cost of the path taken.

Each movement usually has a cost of 1.

Path Cost
=
∑
cost of each move
Path Cost=∑cost of each move

Example:
If the drone takes 8 moves,
Path Cost = 8

The optimal path is the one with the minimum path cost.

7️⃣ Solution Strategy

To find the optimal path, AI search algorithms can be used:

Breadth-First Search (BFS) – if all actions have equal cost

Uniform Cost Search – for variable costs

A* Search – uses heuristics like Manhattan distance for efficiency

8️⃣ Diagram Representation
Grid Environment for Delivery Drone

S  .  .  X  .
.  X  .  X  .
.  .  .  .  .
X  X  .  X  .
.  .  .  .  G

Legend:
S → Start State
G → Goal State
X → Obstacle
. → Free cell


The drone must navigate from S to G while avoiding obstacles (X) and minimizing the total path cost.

9️⃣ Conclusion

By formulating the delivery drone problem using the AI problem-solving approach, the environment is converted into a search problem. Clearly defining the state space, actions, goal test, and path cost enables intelligent agents to apply search algorithms and find an optimal solution efficiently.
