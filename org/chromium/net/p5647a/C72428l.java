package org.chromium.net.p5647a;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: org.chromium.net.a.l */
/* compiled from: PG */
public final class C72428l implements URLStreamHandlerFactory {

    /* renamed from: a */
    private final ExperimentalCronetEngine f192644a;

    public C72428l(ExperimentalCronetEngine experimentalCronetEngine) {
        this.f192644a = experimentalCronetEngine;
    }

    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new C72425i(this.f192644a);
        }
        return null;
    }
}
