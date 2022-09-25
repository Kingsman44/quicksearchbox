package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3306b.C42737a;
import com.google.android.libraries.storage.p3304a.p3307c.C42750c;
import com.google.android.libraries.storage.p3304a.p3312f.C42781e;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.android.libraries.storage.protostore.p3316a.C42873a;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47524aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.storage.protostore.by */
/* compiled from: PG */
public final class C42929by implements C43001eh {

    /* renamed from: a */
    public final C60870cx f112295a;

    /* renamed from: b */
    public final Executor f112296b;

    /* renamed from: c */
    public final C42813k f112297c;

    /* renamed from: d */
    public final boolean f112298d;

    /* renamed from: e */
    public final C60836bq f112299e = new C60836bq();

    /* renamed from: f */
    public final C46423aj f112300f;

    /* renamed from: g */
    public final String f112301g;

    /* renamed from: h */
    public final C47524aj f112302h;

    /* renamed from: i */
    public final AtomicReference f112303i = new AtomicReference((Object) null);

    /* renamed from: j */
    private final C42906bb f112304j;

    /* renamed from: k */
    private final C43007j f112305k;

    /* renamed from: l */
    private final C60836bq f112306l = new C60836bq();

    /* renamed from: m */
    private final AtomicBoolean f112307m = new AtomicBoolean(false);

    public C42929by(String str, C60870cx cxVar, C42906bb bbVar, Executor executor, C42813k kVar, C43007j jVar, boolean z, C42926bv bvVar, boolean z2, C47524aj ajVar) {
        this.f112301g = str;
        this.f112295a = C60856cj.m92901j(cxVar);
        this.f112304j = bbVar;
        this.f112296b = executor;
        this.f112297c = kVar;
        this.f112302h = ajVar;
        this.f112298d = z;
        this.f112305k = jVar;
        this.f112300f = new C46423aj(new C42911bg(this, bvVar, z2), executor);
    }

    /* renamed from: b */
    public static C60870cx m75798b(C60870cx cxVar, Closeable closeable, Executor executor) {
        return C60856cj.m92893b(cxVar).mo57334a(new C42909be(closeable, cxVar), executor);
    }

    /* renamed from: k */
    public static C43002ei m75799k() {
        C58881cr crVar = C42925bu.f112290a;
        Objects.requireNonNull(crVar);
        return new C42925bu(new C42918bn(crVar), false);
    }

    /* renamed from: l */
    private final void m75800l(Uri uri, IOException iOException) {
        if (this.f112297c.mo45894h(uri)) {
            try {
                this.f112297c.mo45892f(uri);
            } catch (IOException e) {
                C42908bd.m75784a(iOException, e);
            }
        }
        throw iOException;
    }

    /* renamed from: a */
    public final C60930r mo45986a() {
        return new C42917bm(this);
    }

    /* renamed from: c */
    public final C60870cx mo45997c(IOException iOException, C43008k kVar) {
        if ((iOException instanceof C42750c) || (iOException.getCause() instanceof C42750c)) {
            return C60856cj.m92899h(iOException);
        }
        return this.f112305k.mo45985a(iOException, kVar);
    }

    /* renamed from: d */
    public final C60870cx mo45998d(C60870cx cxVar) {
        return C60922j.m93045h(cxVar, new C42916bl(this), this.f112296b);
    }

    /* renamed from: e */
    public final String mo45989e() {
        return this.f112301g;
    }

    /* renamed from: f */
    public final C60870cx mo45990f(C42954cv cvVar) {
        try {
            MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) C60856cj.m92909r(this.f112300f.mo50395b());
            Pair pair = (Pair) this.f112303i.get();
            if (pair == null || ((Long) pair.second).longValue() != ((long) MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.f112175a))) {
                return this.f112306l.mo57305b(C47810es.m84965e(new C42915bk(this, mappedCounterCacheVersion)), this.f112296b);
            }
            return C60856cj.m92900i(pair.first);
        } catch (ExecutionException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: g */
    public final C60870cx mo45991g(C60931s sVar, Executor executor, C42955cw cwVar) {
        return this.f112299e.mo57305b(C47810es.m84965e(new C42923bs(this, sVar, executor)), this.f112296b);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0050 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45999h(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Read "
            com.google.apps.tiktok.tracing.aj r1 = r4.f112302h     // Catch:{ FileNotFoundException -> 0x0050 }
            java.lang.String r2 = r4.f112301g     // Catch:{ FileNotFoundException -> 0x0050 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0050 }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0050 }
            r3.append(r2)     // Catch:{ FileNotFoundException -> 0x0050 }
            java.lang.String r0 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0050 }
            com.google.apps.tiktok.tracing.bi r0 = r1.mo51389b(r0)     // Catch:{ FileNotFoundException -> 0x0050 }
            com.google.android.libraries.storage.a.k r1 = r4.f112297c     // Catch:{ all -> 0x0042 }
            com.google.android.libraries.storage.a.f.n r2 = new com.google.android.libraries.storage.a.f.n     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r1.mo45889c(r5, r2)     // Catch:{ all -> 0x0042 }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x0042 }
            com.google.android.libraries.storage.protostore.bb r2 = r4.f112304j     // Catch:{ all -> 0x0036 }
            com.google.android.libraries.storage.protostore.e.b r2 = (com.google.android.libraries.storage.protostore.p3320e.C42993b) r2     // Catch:{ all -> 0x0036 }
            com.google.protobuf.MessageLite r2 = r2.mo46037c(r1)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ all -> 0x0042 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ FileNotFoundException -> 0x0050 }
        L_0x0035:
            return r2
        L_0x0036:
            r2 = move-exception
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r1 = move-exception
            com.google.android.libraries.storage.protostore.C42908bd.m75784a(r2, r1)     // Catch:{ all -> 0x0042 }
        L_0x0041:
            throw r2     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            com.google.android.libraries.storage.protostore.C42908bd.m75784a(r1, r0)     // Catch:{ FileNotFoundException -> 0x0050 }
        L_0x004d:
            throw r1     // Catch:{ FileNotFoundException -> 0x0050 }
        L_0x004e:
            r0 = move-exception
            goto L_0x0086
        L_0x0050:
            com.google.android.libraries.storage.a.k r0 = r4.f112297c     // Catch:{ IOException -> 0x004e }
            boolean r0 = r0.mo45894h(r5)     // Catch:{ IOException -> 0x004e }
            if (r0 == 0) goto L_0x007f
            com.google.android.libraries.storage.a.k r0 = r4.f112297c     // Catch:{ IOException -> 0x004e }
            com.google.android.libraries.storage.a.f.n r1 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x004e }
            r1.<init>()     // Catch:{ IOException -> 0x004e }
            java.lang.Object r0 = r0.mo45889c(r5, r1)     // Catch:{ IOException -> 0x004e }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ IOException -> 0x004e }
            com.google.android.libraries.storage.protostore.bb r1 = r4.f112304j     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.storage.protostore.e.b r1 = (com.google.android.libraries.storage.protostore.p3320e.C42993b) r1     // Catch:{ all -> 0x0073 }
            com.google.protobuf.MessageLite r1 = r1.mo46037c(r0)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x004e }
        L_0x0072:
            return r1
        L_0x0073:
            r1 = move-exception
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            com.google.android.libraries.storage.protostore.C42908bd.m75784a(r1, r0)     // Catch:{ IOException -> 0x004e }
        L_0x007e:
            throw r1     // Catch:{ IOException -> 0x004e }
        L_0x007f:
            com.google.android.libraries.storage.protostore.bb r0 = r4.f112304j     // Catch:{ IOException -> 0x004e }
            com.google.android.libraries.storage.protostore.e.a r0 = (com.google.android.libraries.storage.protostore.p3320e.C42992a) r0     // Catch:{ IOException -> 0x004e }
            com.google.protobuf.MessageLite r5 = r0.f112436a     // Catch:{ IOException -> 0x004e }
            return r5
        L_0x0086:
            com.google.android.libraries.storage.a.k r1 = r4.f112297c
            java.io.IOException r5 = com.google.android.libraries.storage.protostore.p3316a.C42873a.m75728a(r1, r5, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.protostore.C42929by.mo45999h(android.net.Uri):java.lang.Object");
    }

    /* renamed from: i */
    public final Object mo46000i(Uri uri, MappedCounterCacheVersion mappedCounterCacheVersion) {
        Pair pair = (Pair) this.f112303i.get();
        long nativeGetCounter = (long) MappedCounterCacheVersion.nativeGetCounter(mappedCounterCacheVersion.f112175a);
        if (pair != null && ((Long) pair.second).longValue() == nativeGetCounter) {
            return pair.first;
        }
        C42813k kVar = this.f112297c;
        C42781e eVar = new C42781e(true, false);
        eVar.f112047a = true;
        Closeable closeable = (Closeable) kVar.mo45889c(uri, eVar);
        try {
            Object h = mo45999h(uri);
            this.f112307m.get();
            if (closeable != null) {
                this.f112303i.set(Pair.create(h, Long.valueOf(nativeGetCounter)));
            }
            if (closeable != null) {
                closeable.close();
            }
            return h;
        } catch (Throwable th) {
            C42908bd.m75784a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo46001j(Uri uri, Object obj, MappedCounterCacheVersion mappedCounterCacheVersion) {
        OutputStream outputStream;
        Uri a = C42874b.m75731a(uri, ".tmp");
        try {
            C42737a aVar = new C42737a();
            try {
                C42813k kVar = this.f112297c;
                C42796t tVar = new C42796t();
                tVar.f112061a = new C42737a[]{aVar};
                outputStream = (OutputStream) kVar.mo45889c(a, tVar);
                ((MessageLite) obj).writeTo(outputStream);
                aVar.mo45839b();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                throw C42873a.m75728a(this.f112297c, uri, e);
            } catch (Throwable th) {
                C42908bd.m75784a(th, th);
            }
        } catch (IOException e2) {
            m75800l(a, e2);
        }
        long nativeIncrementCounter = (long) MappedCounterCacheVersion.nativeIncrementCounter(mappedCounterCacheVersion.f112175a);
        Uri a2 = C42874b.m75731a(uri, ".tmp");
        try {
            this.f112297c.mo45893g(a2, uri);
        } catch (IOException e3) {
            m75800l(a2, e3);
        }
        this.f112303i.set(Pair.create(obj, Long.valueOf(nativeIncrementCounter)));
        return;
        throw th;
    }
}
