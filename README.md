uTorrent-Client-MP
==================

Multiplatform (java) client for utorrent web api

For now it's just concept, which can load torrent file list from 192.168.1.2:8080/gui
But in mean time it can grow to fully-functional application with all necessary, and, maybe, even more powerful than native client.
But you should always remember it will be more slow, then native client, because it just sends requests and parses json answers.

To build just run

```mvn clean package```

To launch you need only JRE installed on your computer - all the rest is included into application.

To create installers call

```mvn clean package -Pdeploy```

If you want to contribute you'll need to contact me to obtain copy of necessary JIDE libraries - we have a free license, but these libraries are not available in public repositories.


***
## Special thanks.

Powered bi Jidesoft (<http://jidesoft.com>).
Thank you for license, guys, I really appreciate this!
