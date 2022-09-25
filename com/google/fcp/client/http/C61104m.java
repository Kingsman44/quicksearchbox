package com.google.fcp.client.http;

import com.google.common.base.C58890d;
import com.google.fcp.client.C61091d;
import com.google.fcp.client.http.HttpClientForNative;
import com.google.p4280bt.C56487c;
import com.google.p4280bt.C56488d;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.fcp.client.http.m */
/* compiled from: PG */
public final class C61104m extends HttpClientForNative.HttpRequestHandle {

    /* renamed from: a */
    public final C61109r f165397a;

    /* renamed from: b */
    public final C61102k f165398b;

    /* renamed from: c */
    public final int f165399c;

    /* renamed from: d */
    public final int f165400d;

    /* renamed from: e */
    public final int f165401e;

    /* renamed from: f */
    public final boolean f165402f;

    /* renamed from: g */
    public final boolean f165403g;

    /* renamed from: h */
    public final boolean f165404h;

    /* renamed from: i */
    public Runnable f165405i = C61098g.f165394a;

    /* renamed from: j */
    public Future f165406j;

    /* renamed from: k */
    public volatile long f165407k = 0;

    /* renamed from: l */
    public volatile long f165408l = 0;

    /* renamed from: m */
    public volatile long f165409m = 0;

    /* renamed from: n */
    public volatile boolean f165410n = false;

    /* renamed from: o */
    public int f165411o = 1;

    /* renamed from: p */
    private final C61091d f165412p;

    /* renamed from: q */
    private final ExecutorService f165413q;

    /* renamed from: r */
    private final int f165414r;

    /* renamed from: s */
    private final int f165415s;

    /* renamed from: t */
    private final double f165416t;

    /* renamed from: u */
    private volatile long f165417u = 0;

    public C61104m(C61109r rVar, C61091d dVar, ExecutorService executorService, C61102k kVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, double d) {
        this.f165397a = rVar;
        this.f165412p = dVar;
        this.f165413q = executorService;
        this.f165398b = kVar;
        this.f165414r = i;
        this.f165415s = i2;
        this.f165399c = i3;
        this.f165400d = i4;
        this.f165401e = i5;
        this.f165402f = z;
        this.f165403g = z2;
        this.f165404h = z3;
        this.f165416t = d;
    }

    /* renamed from: m */
    private final void m93440m(boolean z) {
        if (!z) {
            this.f165411o = 4;
            throw new C61101j();
        }
    }

    /* renamed from: a */
    public final String mo57657a(String str) {
        for (C61106o oVar : this.f165397a.f165426c) {
            if (C58890d.m90990e(str, oVar.f165420a)) {
                return oVar.f165421b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo57658b() {
        if (this.f165411o == 4) {
            throw new C61101j();
        }
    }

    public final void close() {
        this.f165412p.mo57646b(new C61097f(this));
    }

    /* renamed from: d */
    public final synchronized void mo57660d(String str, Exception exc) {
        int i;
        int i2 = this.f165411o;
        this.f165411o = 4;
        if (exc instanceof SocketTimeoutException) {
            i = 6;
        } else {
            i = exc instanceof C61103l ? 5 : 16;
        }
        mo57668l(i, String.format("%s (%s)", new Object[]{str, exc}), i2);
    }

    /* renamed from: e */
    public final synchronized void mo57661e(byte[] bArr, int i) {
        mo57658b();
        m93440m(HttpClientForNative.onResponseBody(this.nativeHandle, bArr, i));
    }

    /* renamed from: f */
    public final synchronized void mo57662f(long j) {
        if (this.f165411o != 4) {
            if (this.f165404h && j > -1) {
                this.f165409m = j;
            }
            this.f165411o = 4;
            HttpClientForNative.onResponseCompleted(this.nativeHandle);
        }
    }

    /* renamed from: g */
    public final synchronized void mo57663g(byte[] bArr) {
        mo57658b();
        this.f165411o = 3;
        m93440m(HttpClientForNative.onResponseStarted(this.nativeHandle, bArr));
    }

    public final byte[] getTotalSentReceivedBytes() {
        double d = this.f165410n ? this.f165416t : 1.0d;
        C61112u uVar = (C61112u) C61113v.f165432c.createBuilder();
        long j = this.f165417u;
        long j2 = this.f165407k;
        uVar.copyOnWrite();
        double d2 = (double) j;
        Double.isNaN(d2);
        ((C61113v) uVar.instance).f165434a = ((long) (d2 * d)) + j2;
        long j3 = this.f165408l;
        long j4 = this.f165409m;
        uVar.copyOnWrite();
        double d3 = (double) j3;
        Double.isNaN(d3);
        ((C61113v) uVar.instance).f165435b = ((long) (d3 * d)) + j4;
        return ((C61113v) uVar.build()).toByteArray();
    }

    /* renamed from: h */
    public final synchronized void mo57664h(byte[] bArr, long j, int[] iArr) {
        mo57658b();
        m93440m(HttpClientForNative.readRequestBody(this.nativeHandle, bArr, j, iArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo57665i() {
        if (this.f165411o == 1) {
            this.f165411o = 2;
            this.f165406j = this.f165413q.submit(new C61100i(this));
        } else {
            throw new IllegalStateException("must not call perform() more than once");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo57666j() {
        Future future;
        synchronized (this) {
            future = this.f165406j;
            if (future == null) {
                throw new IllegalStateException("must not call waitForCompletion() before perform()");
            }
        }
        try {
            future.get();
        } catch (ExecutionException e) {
            throw new C61094c("unexpected exception", e);
        } catch (InterruptedException e2) {
            throw new C61094c("unexpected interruption", e2);
        } catch (CancellationException unused) {
        }
    }

    /* renamed from: k */
    public final synchronized boolean mo57667k() {
        return this.f165411o == 4;
    }

    /* renamed from: l */
    public final void mo57668l(int i, String str, int i2) {
        C56487c cVar = (C56487c) C56488d.f150876d.createBuilder();
        cVar.copyOnWrite();
        ((C56488d) cVar.instance).f150878a = i - 2;
        cVar.copyOnWrite();
        str.getClass();
        ((C56488d) cVar.instance).f150879b = str;
        byte[] byteArray = ((C56488d) cVar.build()).toByteArray();
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            HttpClientForNative.onResponseError(this.nativeHandle, byteArray);
        } else if (i3 == 2) {
            HttpClientForNative.onResponseBodyError(this.nativeHandle, byteArray);
        }
    }

    /* renamed from: c */
    public final void mo57659c(HttpURLConnection httpURLConnection, long j, String str) {
        String str2;
        int i = this.f165397a.f165425b;
        int a = C61107p.m93453a(i);
        if (a == 0) {
            a = 1;
        }
        switch (a - 2) {
            case 1:
                str2 = "HEAD";
                break;
            case 2:
                str2 = "GET";
                break;
            case 3:
                str2 = "POST";
                break;
            case 4:
                str2 = "PUT";
                break;
            case 5:
                str2 = "PATCH";
                break;
            case 6:
                str2 = "DELETE";
                break;
            default:
                Object[] objArr = new Object[1];
                int a2 = C61107p.m93453a(i);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                objArr[0] = Integer.valueOf(a2 - 2);
                throw new C61094c(String.format("unexpected method: %s", objArr));
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            for (C61106o oVar : this.f165397a.f165426c) {
                httpURLConnection.addRequestProperty(oVar.f165420a, oVar.f165421b);
            }
            boolean z = this.f165403g;
            if (z && str == null) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            } else if (!z && str != null) {
                throw new C61103l("cannot support Accept-Encoding header");
            }
            int i2 = this.f165414r;
            if (i2 >= 0) {
                httpURLConnection.setConnectTimeout(i2);
            }
            int i3 = this.f165415s;
            if (i3 >= 0) {
                httpURLConnection.setReadTimeout(i3);
            }
            httpURLConnection.setDoInput(true);
            if (this.f165397a.f165427d) {
                httpURLConnection.setDoOutput(true);
                if (j >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(j);
                } else {
                    httpURLConnection.setChunkedStreamingMode(this.f165399c);
                }
            } else if (j > 0) {
                throw new C61103l("Content-Length > 0 but no request body available");
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (CookieHandler.getDefault() != null) {
                throw new IllegalStateException("must not set a CookieHandler");
            } else if (this.f165404h) {
                this.f165417u += (long) (str2.length() + 1 + this.f165397a.f165424a.length() + 11);
                for (C61106o oVar2 : this.f165397a.f165426c) {
                    this.f165417u += (long) (oVar2.f165420a.length() + 2 + oVar2.f165421b.length() + 2);
                }
                this.f165417u += 2;
            }
        } catch (ProtocolException e) {
            throw new C61094c("unexpected ProtocolException", e);
        }
    }
}
