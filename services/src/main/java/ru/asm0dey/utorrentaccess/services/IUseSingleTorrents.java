/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.asm0dey.utorrentaccess.services;

import ru.asm0dey.utorrentaccess.utorrentclient.domain.SingleListTorrent;

/**
 *
 * @author finkel
 */
public interface IUseSingleTorrents {
    void handle(SingleListTorrent torrent);
}
