package org.amangarg.cloudapp.model;

public class Tekion {
}


/*

Music player :
    Build a Playlist for Party

    Given: API to fetch songs listened by a user in past 30 days and frequency

    Build the playlist: for all the people at the party sorted by number of times each song has been played collectively as a group

    if someone arrives to the party later
    if someone leaves


    getSongsData(personId) ->
    [
        songId1 : 10
        songId2 : 5
        .
        .
        .


    ]

    personId2
    [
        songId3 : 10
        songId2 : 5
        .
        .
        .


    ]



    party list
    [
        song1 : 10  <---
        song2 : 5   <--- W
        song3 : 0

        songNew: 2

    ]


    <DLL>  (song1,f1) (song2,f2) (song3,f3)

    <HashMap>  (song3, p3) (song1, p1) .. ..

    <Set> playedSongs (song5, song6)



    / createParty(p1, p2, p3)
        -> returns party playlist

    / addNewPersonToParty(partyId, pId)
        -> returns party playlist

    / removePersonFromParty(partyId, pId)
        -> returns party playlist

    / playNextSong(partyId) -> Success / fail


*/



