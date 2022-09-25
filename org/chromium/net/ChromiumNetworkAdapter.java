package org.chromium.net;

import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
public final class ChromiumNetworkAdapter {
    private ChromiumNetworkAdapter() {
    }

    public static URLConnection openConnection(URL url, Proxy proxy, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection(proxy);
    }

    public static InputStream openStream(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openStream();
    }

    public static URLConnection openConnection(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection();
    }
}
