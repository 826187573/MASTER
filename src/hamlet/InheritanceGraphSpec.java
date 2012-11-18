/*
 * Copyright (C) 2012 Tim Vaughan <tgvaughan@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package hamlet;

import java.util.List;

/**
 * Specification of a simulation which will result in generation of an
 * inheritance graph between individual members of the populations involved.
 *
 * @author Tim Vaughan <tgvaughan@gmail.com>
 */
public class InheritanceGraphSpec extends Spec {
    
    // Birth-death model including inheritance relationships.
    InheritanceModel inheritanceModel;

    // Lineages present at start of simulation.
    List<Node> initLineages;
    
    // Maximum time to simulate for:
    double simulationTime;
    
    /**
     * Constructor.
     */
    public InheritanceGraphSpec() {
        super();
        
        simulationTime = Double.POSITIVE_INFINITY;
    }
    
    /**
     * Specify inheritance model to use.  Note that the model field
     * is also set by this method, so that the non-inheritance graph
     * methods can still interact with those aspects of the model.
     * 
     * @param inheritanceModel 
     */
    public void setModel(InheritanceModel inheritanceModel) {
        this.inheritanceModel = inheritanceModel;
        this.model = inheritanceModel;
    }
    
    /**
     * Specify maximum time to simulate for.  Simulation will end when
     * all lineages are dead or this time is exceeded, whichever occurs
     * first.  (Default is +infinity.)
     * 
     * @param simulationTime 
     */
    public void setSimulationTime(double simulationTime) {
        this.simulationTime = simulationTime;
    }
    
}
