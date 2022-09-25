package org.chromium.net.p5647a;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: org.chromium.net.a.i */
/* compiled from: PG */
final class C72425i extends URLStreamHandler {

    /* renamed from: a */
    private final ExperimentalCronetEngine f192636a;

    public C72425i(ExperimentalCronetEngine experimentalCronetEngine) {
        this.f192636a = experimentalCronetEngine;
    }

    public final URLConnection openConnection(URL url) {
        return this.f192636a.openConnection(url);
    }

    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.f192636a.openConnection(url, proxy);
    }
}
