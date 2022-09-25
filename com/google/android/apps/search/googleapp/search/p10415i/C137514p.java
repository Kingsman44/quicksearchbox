package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.i.p */
/* compiled from: PG */
public final class C137514p implements Closeable {

    /* renamed from: a */
    public final C58487gw f374020a;

    /* renamed from: b */
    public final int f374021b;

    /* renamed from: c */
    public final String f374022c;

    /* renamed from: d */
    public final InputStream f374023d;

    /* renamed from: e */
    private final HttpURLConnection f374024e;

    public C137514p(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        C58486gv gvVar = new C58486gv();
        Map.EL.forEach(httpURLConnection.getHeaderFields(), new C137512n(gvVar));
        this.f374020a = gvVar.mo55417a();
        int responseCode = httpURLConnection.getResponseCode();
        this.f374021b = responseCode;
        this.f374022c = httpURLConnection.getResponseMessage();
        C137511m mVar = C137511m.UNKNOWN;
        int ordinal = C137510l.m223397a(responseCode).ordinal();
        if (ordinal == 1 || ordinal == 2) {
            inputStream = httpURLConnection.getInputStream();
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        if (inputStream != null) {
            this.f374023d = inputStream;
        } else {
            this.f374023d = new C137513o();
        }
        this.f374024e = httpURLConnection;
    }

    public final void close() {
        this.f374023d.close();
        this.f374024e.disconnect();
    }
}
