package ru.asm0dey.utorrentaccess.utorrentclient;

import fj.Effect;
import fj.F;
import fj.data.List;
import java.io.IOException;
import ru.asm0dey.utorrentaccess.utorrentclient.domain.ChangedTorrentList;
import ru.asm0dey.utorrentaccess.utorrentclient.domain.FilesRequestResult;
import ru.asm0dey.utorrentaccess.utorrentclient.domain.SingleListTorrent;
import ru.asm0dey.utorrentaccess.utorrentclient.domain.TorrentList;

/**
 * Created with IntelliJ IDEA. User: finkel Date: 28.12.12 Time: 11:15 To change
 * this template use File | Settings | File Templates.
 */
public class TestConnecter {

    public static void main(String[] agrs) throws IOException, InterruptedException {
        UTorrent instance = UTorrent.getInstance("192.168.1.2", 8080, "admin", "");
        final TorrentList torrentList = instance.getTorrentList();
        List<SingleListTorrent> singleListTorrents = List.iterableList(torrentList.getTorrents());

        String cacheId = torrentList.getTorrentc();
        Thread.sleep(3000);
        final ChangedTorrentList changedTorrentList = instance.getChangedTorrentList(cacheId);
        singleListTorrents = singleListTorrents.removeAll(new F<SingleListTorrent, Boolean>() {
            @Override
            public Boolean f(SingleListTorrent strings) {
                return changedTorrentList.getTorrentm().contains(strings.getHash());
            }
        });
        singleListTorrents.foreach(new Effect<SingleListTorrent>() {
            @Override
            public void e(final SingleListTorrent source) {
                List.iterableList(changedTorrentList.getTorrentp()).foreach(new Effect<SingleListTorrent>() {
                    @Override
                    public void e(SingleListTorrent changed) {
                        if (source.getHash().equals(changed.getHash())) {
                            source.cloneWithoutHash(changed);
                        }
                    }
                });
            }
        });
        for (SingleListTorrent singleListTorrent : singleListTorrents) {
            FilesRequestResult filesByTorrentHash = instance.getFilesByTorrentHash(singleListTorrent.getHash());
            System.out.println(filesByTorrentHash);
        }

    }
}
