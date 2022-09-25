package com.google.fcp.client.http;

import java.net.HttpURLConnection;

/* renamed from: com.google.fcp.client.http.h */
/* compiled from: PG */
public final /* synthetic */ class C61099h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ HttpURLConnection f165395a;

    public /* synthetic */ C61099h(HttpURLConnection httpURLConnection) {
        this.f165395a = httpURLConnection;
    }

    public final void run() {
        this.f165395a.disconnect();
    }
}
