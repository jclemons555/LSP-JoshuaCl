package org.howard.edu.lsp.midterm.problem1;
import java.util.ArrayList;
import java.util.List;

/**
 * A simplified electronic voting machine with a list of candidates and their votes.
 */
public class votingMachine {
	
	private List<String> people = new ArrayList<String>();
	private List<Integer> totalVotes = new ArrayList<Integer>();
	public int total_votes = 0;
	
	/**
	 * Add a candidate to the list, initialize number of votes to 0
	 * @param name string of candidate 
	 */
	public void addCandidate(String name) {
		boolean listed = people.contains(name);
		if (listed) {
			System.out.println("candidate is already listed");
		}
		else {	people.add(name);
			totalVotes.add(0);
		}
	} 
	
	

	/**
	 * // Cast votes to the candidate with the given name
	 * @param name string of candidate voting
	 * @param votes integer of number of votes
	 */
	public void castVotes(String name, int votes) {
		int i;
		i = people.indexOf(name);
			totalVotes.set(i, votes);
			total_votes += votes;
		}
	

	/**
	 * // Return the number of votes for a given candidate.
	 * @throws UnknownCandidateException if name not present
	 * @param string of candidate's name
	 * @return votes integer of specified candidate
	 */
	public int getVotes(String names)  {
		if (people.indexOf(names) == -1) {
			throw new ArrayIndexOutOfBoundsException("UnknownCandidateException; candidate is not listed");
		}
		int i = people.indexOf(names);
		int votes = totalVotes.get(i);
		return votes;
		
	}

	/**
	 * // Return the total number of votes for all candidates.
	 * @return total votes integer of all candidates
	 */
	public int sum() {
		return total_votes;
	}
}