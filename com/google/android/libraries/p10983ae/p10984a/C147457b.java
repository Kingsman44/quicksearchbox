package com.google.android.libraries.p10983ae.p10984a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.chromium.net.CronetEngine;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ae.a.b */
/* compiled from: PG */
public final class C147457b {

    /* renamed from: a */
    private final C147456a f398035a;

    public C147457b(CronetEngine cronetEngine) {
        Objects.requireNonNull(cronetEngine);
        this.f398035a = new C147456a(cronetEngine);
    }

    /* renamed from: a */
    public final HttpURLConnection mo124200a(String str) {
        C147456a aVar = this.f398035a;
        URLConnection openConnection = aVar.f398034a.openConnection(new URL(str));
        if (openConnection instanceof HttpURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }
}
