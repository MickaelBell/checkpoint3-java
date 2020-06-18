import { Component, OnInit } from '@angular/core';
import { DijkstraService } from '../../shared/dijkstra.service';
import { Graph } from '../../models/graph';

@Component({
  selector: 'chk-dijkstra',
  templateUrl: './dijkstra.component.html',
  styleUrls: ['./dijkstra.component.scss']
})
export class DijkstraComponent implements OnInit {


  node: string;

  graph: Graph;

  constructor(private dijkstraService: DijkstraService) { }

  ngOnInit(): void {
  }


  send(){
    this.dijkstraService.getGraph(this.node)
        .subscribe((graph: Graph) => {
          this.graph = graph;
       });
  }


}
