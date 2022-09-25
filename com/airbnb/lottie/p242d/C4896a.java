package com.airbnb.lottie.p242d;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.airbnb.lottie.d.a */
/* compiled from: PG */
public final class C4896a implements Closeable {

    /* renamed from: a */
    public final HttpURLConnection f15632a;

    public C4896a(HttpURLConnection httpURLConnection) {
        this.f15632a = httpURLConnection;
    }

    /* renamed from: a */
    public final boolean mo9833a() {
        try {
            return this.f15632a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void close() {
        this.f15632a.disconnect();
    }
}
