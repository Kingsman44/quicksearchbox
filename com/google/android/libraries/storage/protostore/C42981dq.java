package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3306b.C42737a;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.android.libraries.storage.protostore.p3316a.C42873a;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.android.libraries.storage.protostore.p3320e.C42992a;
import com.google.android.libraries.storage.protostore.p3320e.C42993b;
import com.google.apps.tiktok.tracing.C47524aj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.dq */
/* compiled from: PG */
public final class C42981dq implements C43001eh, C43010m {

    /* renamed from: a */
    public final C60870cx f112415a;

    /* renamed from: b */
    public final Executor f112416b;

    /* renamed from: c */
    public final C42813k f112417c;

    /* renamed from: d */
    public final C43007j f112418d;

    /* renamed from: e */
    public final Object f112419e = new Object();

    /* renamed from: f */
    public C60870cx f112420f = null;

    /* renamed from: g */
    public C42900az f112421g = null;

    /* renamed from: h */
    private final String f112422h;

    /* renamed from: i */
    private final C42906bb f112423i;

    /* renamed from: j */
    private final C47524aj f112424j;

    /* renamed from: k */
    private final C60836bq f112425k = new C60836bq();

    public C42981dq(String str, C60870cx cxVar, C42906bb bbVar, Executor executor, C42813k kVar, C43007j jVar, C47524aj ajVar) {
        this.f112422h = str;
        this.f112415a = C60856cj.m92901j(cxVar);
        this.f112423i = bbVar;
        this.f112416b = new C60904dr(executor);
        this.f112417c = kVar;
        this.f112418d = jVar;
        this.f112424j = ajVar;
    }

    /* renamed from: d */
    private final C60870cx m75871d() {
        C60870cx cxVar;
        synchronized (this.f112419e) {
            C60870cx cxVar2 = this.f112420f;
            if (cxVar2 != null && cxVar2.isDone()) {
                try {
                    C60856cj.m92909r(this.f112420f);
                } catch (ExecutionException unused) {
                    this.f112420f = null;
                }
            }
            if (this.f112420f == null) {
                this.f112420f = C60856cj.m92901j(this.f112425k.mo57305b(C47810es.m84965e(new C42977dm(this)), this.f112416b));
            }
            cxVar = this.f112420f;
        }
        return cxVar;
    }

    /* renamed from: a */
    public final C60930r mo45986a() {
        return new C42969de(this);
    }

    /* renamed from: b */
    public final Object mo46030b(Uri uri) {
        InputStream inputStream;
        try {
            C47524aj ajVar = this.f112424j;
            String str = this.f112422h;
            C47558bi b = ajVar.mo51389b("Read " + str);
            try {
                inputStream = (InputStream) this.f112417c.mo45889c(uri, new C42790n());
                MessageLite c = ((C42993b) this.f112423i).mo46037c(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (b != null) {
                    b.close();
                }
                return c;
            } catch (Throwable th) {
                if (b != null) {
                    b.close();
                }
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            try {
                if (!this.f112417c.mo45894h(uri)) {
                    return ((C42992a) this.f112423i).f112436a;
                }
                throw e;
            } catch (IOException e2) {
                throw C42873a.m75728a(this.f112417c, uri, e2);
            }
        } catch (Throwable th2) {
            C42968dd.m75862a(th, th2);
        }
    }

    /* renamed from: c */
    public final void mo46031c(Uri uri, Object obj) {
        OutputStream outputStream;
        Uri a = C42874b.m75731a(uri, ".tmp");
        try {
            C47524aj ajVar = this.f112424j;
            String str = this.f112422h;
            C47558bi b = ajVar.mo51389b("Write " + str);
            try {
                C42737a aVar = new C42737a();
                try {
                    C42813k kVar = this.f112417c;
                    C42796t tVar = new C42796t();
                    tVar.f112061a = new C42737a[]{aVar};
                    outputStream = (OutputStream) kVar.mo45889c(a, tVar);
                    ((MessageLite) obj).writeTo(outputStream);
                    aVar.mo45839b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (b != null) {
                        b.close();
                    }
                    this.f112417c.mo45893g(a, uri);
                    return;
                } catch (IOException e) {
                    throw C42873a.m75728a(this.f112417c, uri, e);
                } catch (Throwable th) {
                    C42968dd.m75862a(th, th);
                }
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (IOException e2) {
            if (this.f112417c.mo45894h(a)) {
                try {
                    this.f112417c.mo45892f(a);
                } catch (IOException e3) {
                    C42968dd.m75862a(e2, e3);
                }
            }
            throw e2;
        } catch (Throwable th3) {
            C42968dd.m75862a(th2, th3);
        }
    }

    /* renamed from: e */
    public final String mo45989e() {
        return this.f112422h;
    }

    /* renamed from: f */
    public final C60870cx mo45990f(C42954cv cvVar) {
        return m75871d();
    }

    /* renamed from: g */
    public final C60870cx mo45991g(C60931s sVar, Executor executor, C42955cw cwVar) {
        return this.f112425k.mo57305b(C47810es.m84965e(new C42975dk(this, m75871d(), sVar, executor)), C60826bg.f164896a);
    }

    /* renamed from: m */
    public final C60870cx mo46029m(C42900az azVar) {
        synchronized (this.f112419e) {
            azVar.getClass();
            this.f112421g = azVar;
        }
        return C60866ct.f164955a;
    }
}
