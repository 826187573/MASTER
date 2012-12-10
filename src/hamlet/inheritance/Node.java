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
package hamlet.inheritance;

import hamlet.Population;
import java.util.*;

/**
 * Node in inheritance graph generated from birth-death model.
 *
 * @author Tim Vaughan
 */
public class Node {

    // Parents of this node.
    List<Node> parents;
    
    // Children of this node.
    List<Node> children;
    
    // Population to which the individual represented by this node belongs.
    Population population;
    
    // Height of this node.
    double time;
    
    // Reaction group (if any) associated with this node.
    InheritanceReactionGroup reactionGroup;
    
    // Unique name for this node:
    String name;
    
    /**
     * Constructor.
     *
     * @param population Population to which node belongs.
     * @param time Time at which to position node.
     */
    public Node(Population population, double time) {

        this.population = population;
        this.time = time;

        parents = new ArrayList<Node>();
        children = new ArrayList<Node>();
        
        reactionGroup = null;
        name = null;
    }
    
    /**
     * Constructor for inheritance map node.
     * 
     * @param population Population to which node belongs.
     */
    public Node(Population population) {
        this.population = population;
        this.time = -1;
        
        parents = new ArrayList<Node>();
        children = new ArrayList<Node>();
        
        reactionGroup = null;
        name = null;
    }
    
    /**
     * Set node height.
     * 
     * @param time New height of node.
     */
    public void setTime(double time) {
        this.time = time;
    }    
    
    /**
     * Add a child node to the list of children.  Returns this node to
     * allow method chaining.
     * 
     * @param child Child to add.
     * @return this 
     */
    public Node addChild(Node child) {
        children.add(child);
        child.parents.add(this);
        
        return this;
    }
    
    /**
     * Associate a reaction group with this node.  Used as an annotation in the
     * NEXUS output format.
     * 
     * @param reactionGroup 
     */
    public void setReactionGroup(InheritanceReactionGroup reactionGroup) {
        this.reactionGroup = reactionGroup;
    }
    
    /**
     * Give this node a unique name.  Used to label this node in Newick and
     * NEXUS output formats.  No checking is done at this stage to ensure
     * that the label is actually unique, but invalid Newick strings will
     * result if it is not.
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /*
     * Getters:
     */

    public double getTime() {
        return this.time;
    }
    
    public List<Node> getParents() {
        return this.parents;
    }
    
    public List<Node> getChildren() {
        return this.children;
    }

    public InheritanceReactionGroup getReactionGroup() {
        return this.reactionGroup;
    }
    
    public String getName() {
        return name;
    }
    
}