package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5919d;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.p291h.C5618e;
import com.bumptech.glide.p291h.C5625l;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.n */
/* compiled from: PG */
public final class C5939n implements C5930e {

    /* renamed from: a */
    private final C5750ab f17592a;

    /* renamed from: b */
    private final int f17593b;

    /* renamed from: c */
    private HttpURLConnection f17594c;

    /* renamed from: d */
    private InputStream f17595d;

    /* renamed from: e */
    private volatile boolean f17596e;

    public C5939n(C5750ab abVar, int i) {
        this.f17592a = abVar;
        this.f17593b = i;
    }

    /* renamed from: f */
    private static int m15330f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.REMOTE;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
        this.f17596e = true;
    }

    /* renamed from: d */
    public final void mo11924d() {
        InputStream inputStream = this.f17595d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f17594c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f17594c = null;
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        double a;
        StringBuilder sb;
        long b = C5625l.m14593b();
        try {
            C5750ab abVar = this.f17592a;
            if (abVar.f17320b == null) {
                abVar.f17320b = new URL(abVar.mo12250c());
            }
            dVar.mo12183f(m15331g(abVar.f17320b, 0, (URL) null, this.f17592a.mo12251d()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a = C5625l.m14592a(b);
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(a);
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            dVar.mo12184g(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a = C5625l.m14592a(b);
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                double a2 = C5625l.m14592a(b);
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + a2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    private final InputStream m15331g(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C5919d("In re-direct loop", -1, (Throwable) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f17593b);
                httpURLConnection.setReadTimeout(this.f17593b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f17594c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f17595d = this.f17594c.getInputStream();
                    if (this.f17596e) {
                        return null;
                    }
                    int f = m15330f(this.f17594c);
                    int i2 = f / 100;
                    if (i2 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f17594c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f17595d = new C5618e(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    String contentEncoding = httpURLConnection2.getContentEncoding();
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + contentEncoding);
                                }
                                this.f17595d = httpURLConnection2.getInputStream();
                            }
                            return this.f17595d;
                        } catch (IOException e) {
                            throw new C5919d("Failed to obtain InputStream", m15330f(httpURLConnection2), e);
                        }
                    } else if (i2 == 3) {
                        String headerField = this.f17594c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                mo11924d();
                                return m15331g(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new C5919d("Bad redirect url: ".concat(String.valueOf(headerField)), f, e2);
                            }
                        } else {
                            throw new C5919d("Received empty or null redirect url", f, (Throwable) null);
                        }
                    } else if (f != -1) {
                        try {
                            throw new C5919d(this.f17594c.getResponseMessage(), f, (Throwable) null);
                        } catch (IOException e3) {
                            throw new C5919d("Failed to get a response message", f, e3);
                        }
                    } else {
                        throw new C5919d("Http request failed", -1, (Throwable) null);
                    }
                } catch (IOException e4) {
                    throw new C5919d("Failed to connect or obtain data", m15330f(this.f17594c), e4);
                }
            } catch (IOException e5) {
                throw new C5919d("URL.openConnection threw", 0, e5);
            }
        } else {
            throw new C5919d("Too many (> 5) redirects!", -1, (Throwable) null);
        }
    }
}
