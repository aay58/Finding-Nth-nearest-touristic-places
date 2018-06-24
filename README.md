# Finding-Nth-nearest-touristic-places

Alice visits Barceolana in Spain as a tourist. Since she will be there for a one day and her time
is very restricted, she decided to look for only rst the nearest "N" touristic places to herself.
Places and Alice's location are situated 2-dimensional which are represented (x,y) and (a,b)
respectively . In this problem, you are expected to answer the booster distance of Nth nearest
touristic places from Alice's coordinate. The coordinates of the places and Alice's location will
randomly be generated in each execution. N will be entered from the keyboard. Also in each
execution 100 touristic places' coordinate pairs and only one Alice's location will randomly be
generated which is represented x,y and a,b respectively. But if the nearest place of visit fee
is high, she decided to visit the second nearest place whose visit fee is cheaper than the other
and so on. So low-cost touristic place has a prioity for Alice. Booster distance is calculated as
<img src="https://latex.codecogs.com/svg.latex?\Large&space\sqrt{{(x-a)^2}+{(y-b)^2} }
If the result of the distance exceeds 200, the visit fee of the place doesn't be considered. Write
an algorithm for Alice to visit nearest and low-cost touristic place. Show Alice's prefered coordi-
nates, booster distances and visit fees according to N number as an output. (Use priority queue
to implement this algorithm and consider the exceptions ex. you generated 100 coordinates
but you entered 180 for N, the program must give a warning and inform user)
Constraints
􀀀10 <= a,b >= 103
􀀀103  x,y  103
0  visit fee  60
