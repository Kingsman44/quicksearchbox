package com.google.android.apps.gsa.shared.p7045k.p7047b;

import android.os.SystemClock;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: com.google.android.apps.gsa.shared.k.b.i */
/* compiled from: PG */
public final class C89806i {

    /* renamed from: a */
    public int f243088a;

    /* renamed from: b */
    public final HashMap f243089b = new HashMap();

    /* renamed from: c */
    public C89800c f243090c;

    /* renamed from: d */
    HttpURLConnection f243091d;

    /* renamed from: e */
    public Map f243092e;

    /* renamed from: f */
    private final C89799b f243093f;

    static {
        TimeUnit.SECONDS.toMillis(3);
        TimeUnit.SECONDS.toMillis(10);
    }

    public C89806i() {
        HttpURLConnection.setFollowRedirects(true);
        this.f243093f = new C89799b();
    }

    /* renamed from: a */
    public final void mo83662a(URL url, C89800c cVar, boolean z) {
        C89799b bVar = this.f243093f;
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            SSLContext sSLContext = bVar.f243071a;
            if (sSLContext != null) {
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                httpsURLConnection.setHostnameVerifier(C89798a.f243069a);
            }
            this.f243091d = httpsURLConnection;
            httpsURLConnection.setConnectTimeout(5000);
            this.f243091d.setReadTimeout(5000);
            for (Map.Entry entry : this.f243089b.entrySet()) {
                this.f243091d.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            SystemClock.elapsedRealtime();
            if (z) {
                this.f243091d.setRequestMethod("GET");
            } else {
                this.f243091d.setDoOutput(true);
                if (cVar != null) {
                    byte[] bArr = cVar.f243073b;
                    if (bArr != null) {
                        this.f243091d.setFixedLengthStreamingMode(bArr.length);
                    }
                    String str = cVar.f243074c;
                    if (str != null) {
                        this.f243091d.setRequestProperty("Content-Type", str);
                    }
                    byte[] bArr2 = cVar.f243073b;
                    String str2 = bArr2 != null ? new String(bArr2, C89800c.f243072a) : null;
                    if (str2 != null) {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f243091d.getOutputStream()));
                        bufferedWriter.write(str2);
                        bufferedWriter.close();
                    }
                }
            }
            this.f243088a = this.f243091d.getResponseCode();
            this.f243092e = this.f243091d.getHeaderFields();
            int i = this.f243088a;
            InputStream errorStream = (i < 200 || i >= 400) ? this.f243091d.getErrorStream() : this.f243091d.getInputStream();
            BufferedReader bufferedReader = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream)) : null;
            if (bufferedReader != null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                }
                this.f243090c = null;
                if (sb.length() > 0) {
                    this.f243090c = new C89800c(sb.toString(), this.f243091d.getContentType());
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            }
            HttpURLConnection httpURLConnection = this.f243091d;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scheme is not HTTPS");
    }
}
