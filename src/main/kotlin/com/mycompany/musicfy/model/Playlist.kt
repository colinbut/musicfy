/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.model

class Playlist(val id: Int, val name: String) {
    val tracks : List<Track> = ArrayList()
}