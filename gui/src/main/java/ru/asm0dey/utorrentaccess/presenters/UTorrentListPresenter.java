/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.asm0dey.utorrentaccess.presenters;

import java.io.IOException;
import org.openide.util.Exceptions;
import ru.finkel.utorrentaccess.UTorrent;
import ru.finkel.utorrentaccess.domain.TorrentList;

/**
 *
 * @author finkel
 */
public class UTorrentListPresenter {

    public TorrentList getList() {
        try {
            final UTorrent instance = UTorrent.getInstance("192.168.1.2", 8080, "admin", "");
            final TorrentList torrentList = instance.getTorrentList();
            return torrentList;
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            throw new RuntimeException(ex);
        }
    }
}
