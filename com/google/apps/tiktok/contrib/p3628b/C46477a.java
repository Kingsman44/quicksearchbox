package com.google.apps.tiktok.contrib.p3628b;

import com.airbnb.lottie.p242d.C4896a;
import com.airbnb.lottie.p242d.C4899d;
import dagger.C68214a;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.apps.tiktok.contrib.b.a */
/* compiled from: PG */
public final class C46477a implements C4899d {

    /* renamed from: a */
    private final C68214a f121622a;

    public C46477a(C68214a aVar) {
        this.f121622a = aVar;
    }

    /* renamed from: a */
    public final C4896a mo9835a(String str) {
        return new C4896a((HttpURLConnection) ((CronetEngine) this.f121622a.mo27525b()).openConnection(new URL(str)));
    }
}
