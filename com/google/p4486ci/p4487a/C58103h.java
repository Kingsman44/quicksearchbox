package com.google.p4486ci.p4487a;

import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60908dv;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.ci.a.h */
/* compiled from: PG */
final class C58103h implements C58114s {

    /* renamed from: a */
    public final HttpURLConnection f155306a;

    /* renamed from: b */
    public final C58097b f155307b;

    /* renamed from: c */
    public final byte[] f155308c;

    /* renamed from: d */
    public long f155309d;

    /* renamed from: e */
    public C58118w f155310e;

    /* renamed from: f */
    public int f155311f = -1;

    /* renamed from: g */
    private int f155312g;

    public C58103h(HttpURLConnection httpURLConnection, String str, C58100e eVar, C58097b bVar) {
        this.f155306a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.f155307b = bVar;
            if (bVar != null) {
                httpURLConnection.setDoOutput(true);
                if (bVar.mo54644e() >= 0) {
                    long e = bVar.mo54644e() - bVar.mo54643d();
                    if (e < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) e);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(e);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : eVar.mo54652c()) {
                for (String addRequestProperty : eVar.mo54651b(str2)) {
                    httpURLConnection.addRequestProperty(str2, addRequestProperty);
                }
            }
            this.f155312g = 1;
            this.f155308c = new byte[65536];
        } catch (ProtocolException e2) {
            throw new IllegalArgumentException("Invalid http method.", e2);
        }
    }

    /* renamed from: a */
    public final C60870cx mo54658a() {
        C60871cy cyVar = new C60871cy((Callable) new C58102g(this));
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C60908dv.m93015a(dvVar));
        newSingleThreadExecutor.execute(cyVar);
        newSingleThreadExecutor.shutdown();
        return cyVar;
    }

    /* renamed from: b */
    public final C58101f mo54659b() {
        InputStream inputStream;
        C58100e eVar;
        mo54661d();
        try {
            int responseCode = this.f155306a.getResponseCode();
            try {
                inputStream = this.f155306a.getInputStream();
            } catch (IOException unused) {
                inputStream = this.f155306a.getErrorStream();
            }
            Map headerFields = this.f155306a.getHeaderFields();
            if (headerFields != null) {
                eVar = new C58100e();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String d : (List) headerFields.get(str)) {
                            eVar.mo54653d(str, d);
                        }
                    }
                }
            } else {
                eVar = null;
            }
            return new C58101f(responseCode, eVar, inputStream);
        } catch (IOException e) {
            throw new C58116u(C58115t.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    /* renamed from: c */
    public final String mo54660c() {
        return null;
    }

    /* renamed from: d */
    public final synchronized void mo54661d() {
        boolean z = true;
        if (1 != this.f155312g) {
            z = false;
        }
        C58893dc.m90997b(z);
    }

    /* renamed from: e */
    public final boolean mo54662e() {
        try {
            return this.f155307b.mo54648i();
        } catch (IOException e) {
            throw new C58116u(C58115t.REQUEST_BODY_READ_ERROR, (String) null, e);
        }
    }

    /* renamed from: f */
    public final synchronized void mo54663f(C58118w wVar, int i) {
        this.f155310e = wVar;
        if (i > 0) {
            this.f155311f = i;
        }
    }
}
