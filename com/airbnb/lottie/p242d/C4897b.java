package com.airbnb.lottie.p242d;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.airbnb.lottie.d.b */
/* compiled from: PG */
public final class C4897b implements C4899d {
    /* renamed from: a */
    public final C4896a mo9835a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C4896a(httpURLConnection);
    }
}
