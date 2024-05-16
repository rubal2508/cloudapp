package org.amangarg.cloudapp.service;

import org.amangarg.cloudapp.model.Person;
import org.amangarg.cloudapp.model.PersonSongDTO;
import org.amangarg.cloudapp.model.SongFrequency;

import java.util.*;

public class PartyPlaylist {



    public PersonSongDTO getFavSongs(int personId){
        return new PersonSongDTO();
    }

    // repo class function
    public List<Person> getAllPartyMembers(int partyId){
        return new ArrayList<>();
    }


    public void buildPartyList(int partyId){

        // get all members of party
        List<Person> partyMembers = getAllPartyMembers(partyId);

        // get each members favSongs
        List<PersonSongDTO> favSongsList = new ArrayList<>();
        for(Person person : partyMembers){
            favSongsList.add(getFavSongs(person.getId()));
        }

        HashMap<Integer, Integer> partySongFreqMap = new HashMap<>();

        for(PersonSongDTO personSongDTO : favSongsList){
            for(SongFrequency songFrequency : personSongDTO.getFrequencyList()){
                int songId = songFrequency.getSongId();
                int freq = songFrequency.getFreq();
                partySongFreqMap.put(songId, partySongFreqMap.getOrDefault(songId, 0) + freq);
            }
        }

        List<SongFrequency> partyPlayList = new LinkedList<>();
        for(Map.Entry<Integer,Integer> entry : partySongFreqMap.entrySet()){
            int songId = entry.getKey();
            int freq = entry.getValue();
            partyPlayList.add(new SongFrequency(songId,freq));
        }
        Collections.sort(partyPlayList, (a,b)-> b.getFreq() - a.getFreq());



    }

}
