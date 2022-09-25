package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import android.os.StrictMode;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3307c.C42750c;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3312f.C42781e;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.android.libraries.storage.protostore.p3316a.C42873a;
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
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.db */
/* compiled from: PG */
public final class C42966db implements C43001eh, C43010m {

    /* renamed from: n */
    static final C42954cv f112376n = new C42954cv();

    /* renamed from: o */
    static final C42955cw f112377o = new C42955cw();

    /* renamed from: a */
    public final String f112378a;

    /* renamed from: b */
    public final C60870cx f112379b;

    /* renamed from: c */
    public final C42906bb f112380c;

    /* renamed from: d */
    public final Executor f112381d;

    /* renamed from: e */
    public final C42813k f112382e;

    /* renamed from: f */
    public final C42940ch f112383f;

    /* renamed from: g */
    public final String f112384g;

    /* renamed from: h */
    public final C43008k f112385h = new C42958cz(this);

    /* renamed from: i */
    public final C43008k f112386i = new C42965da(this);

    /* renamed from: j */
    public final C47524aj f112387j;

    /* renamed from: k */
    public final Object f112388k = new Object();

    /* renamed from: l */
    public final C60836bq f112389l = new C60836bq();

    /* renamed from: m */
    public Object f112390m = null;

    /* renamed from: p */
    private final C43007j f112391p;

    /* renamed from: q */
    private final C60836bq f112392q = new C60836bq();

    /* renamed from: r */
    private final C60836bq f112393r = new C60836bq();

    /* renamed from: s */
    private boolean f112394s;

    /* renamed from: t */
    private C42900az f112395t = null;

    /* JADX INFO: finally extract failed */
    public C42966db(String str, C60870cx cxVar, C42906bb bbVar, Executor executor, C42813k kVar, C42940ch chVar, C43007j jVar, C47524aj ajVar) {
        this.f112378a = str;
        this.f112379b = C60856cj.m92901j(cxVar);
        this.f112380c = bbVar;
        this.f112381d = executor;
        this.f112382e = kVar;
        this.f112383f = chVar;
        this.f112391p = jVar;
        this.f112387j = ajVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String uuid = UUID.randomUUID().toString();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            this.f112384g = uuid;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: b */
    public static C60870cx m75849b(C60870cx cxVar, Closeable closeable, Executor executor) {
        return C60856cj.m92893b(cxVar).mo57334a(new C42946cn(closeable, cxVar), executor);
    }

    /* renamed from: k */
    private final Closeable m75850k(Uri uri, C42954cv cvVar) {
        boolean z = cvVar != f112376n;
        try {
            C42813k kVar = this.f112382e;
            C42781e eVar = new C42781e(true, true);
            eVar.f112047a = z;
            return (Closeable) kVar.mo45889c(uri, eVar);
        } catch (C42768u e) {
            if (z) {
                return null;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final C60930r mo45986a() {
        return new C42949cq(this);
    }

    /* renamed from: c */
    public final C60870cx mo46024c(IOException iOException, C43008k kVar) {
        if ((iOException instanceof C42750c) || (iOException.getCause() instanceof C42750c)) {
            return C60856cj.m92899h(iOException);
        }
        return this.f112391p.mo45985a(iOException, kVar);
    }

    /* renamed from: d */
    public final Object mo46025d(Uri uri) {
        InputStream inputStream;
        try {
            C47524aj ajVar = this.f112387j;
            String str = this.f112378a;
            C47558bi b = ajVar.mo51389b("Read " + str);
            try {
                inputStream = (InputStream) this.f112382e.mo45889c(uri, new C42790n());
                MessageLite c = ((C42993b) this.f112380c).mo46037c(inputStream);
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
                if (!this.f112382e.mo45894h(uri)) {
                    return ((C42992a) this.f112380c).f112436a;
                }
                throw e;
            } catch (IOException e2) {
                throw C42873a.m75728a(this.f112382e, uri, e2);
            }
        } catch (Throwable th2) {
            C42942cj.m75834a(th, th2);
        }
    }

    /* renamed from: e */
    public final String mo45989e() {
        return this.f112378a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r3 != f112376n) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        r0 = r2.f112393r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r0 = r2.f112392q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return com.google.common.util.concurrent.C60856cj.m92901j(r0.mo57305b(com.google.apps.tiktok.tracing.C47810es.m84965e(new com.google.android.libraries.storage.protostore.C42943ck(r2, r3)), r2.f112381d));
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo45990f(com.google.android.libraries.storage.protostore.C42954cv r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f112388k
            monitor-enter(r0)
            java.lang.Object r1 = r2.f112390m     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x000d
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r3
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            com.google.android.libraries.storage.protostore.cv r0 = f112376n
            if (r3 != r0) goto L_0x0015
            com.google.common.util.concurrent.bq r0 = r2.f112393r
            goto L_0x0017
        L_0x0015:
            com.google.common.util.concurrent.bq r0 = r2.f112392q
        L_0x0017:
            com.google.android.libraries.storage.protostore.ck r1 = new com.google.android.libraries.storage.protostore.ck
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.r r3 = com.google.apps.tiktok.tracing.C47810es.m84965e(r1)
            java.util.concurrent.Executor r1 = r2.f112381d
            com.google.common.util.concurrent.cx r3 = r0.mo57305b(r3, r1)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92901j(r3)
            return r3
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.protostore.C42966db.mo45990f(com.google.android.libraries.storage.protostore.cv):com.google.common.util.concurrent.cx");
    }

    /* renamed from: g */
    public final C60870cx mo45991g(C60931s sVar, Executor executor, C42955cw cwVar) {
        return this.f112389l.mo57305b(C47810es.m84965e(new C42947co(this, sVar, executor, cwVar)), this.f112381d);
    }

    /* renamed from: h */
    public final void mo46026h() {
        synchronized (this.f112388k) {
            this.f112390m = null;
            this.f112394s = true;
            synchronized (this.f112388k) {
                C42900az azVar = this.f112395t;
                if (azVar != null) {
                    C60856cj.m92911t(mo45990f(f112376n), new C42956cx(azVar), C60826bg.f164896a);
                }
            }
        }
    }

    /* renamed from: i */
    public final C60870cx mo46027i(C60870cx cxVar, C42955cw cwVar) {
        return C60922j.m93045h(this.f112383f.mo46013a(this.f112379b, cwVar == f112377o ? this.f112384g : null), C47810es.m84966f(new C42951cs(this, cxVar)), C60826bg.f164896a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r0 = mo46025d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        monitor-enter(r3.f112388k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        if (r3.f112394s == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        r3.f112390m = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0020, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0022, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0023, code lost:
        r4 = m75850k(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5 = mo46025d(r5);
        r0 = r3.f112388k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002e, code lost:
        if (r4 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.f112390m = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0032, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0033, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0038, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x003d, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0043, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0044, code lost:
        com.google.android.libraries.storage.protostore.C42942cj.m75834a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0047, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = m75850k(r5, r4);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46028j(com.google.android.libraries.storage.protostore.C42954cv r4, android.net.Uri r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f112388k
            monitor-enter(r0)
            java.lang.Object r1 = r3.f112390m     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r1
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            java.io.Closeable r4 = r3.m75850k(r5, r4)     // Catch:{ FileNotFoundException -> 0x000f }
            goto L_0x0027
        L_0x000f:
            java.lang.Object r0 = r3.mo46025d(r5)
            java.lang.Object r1 = r3.f112388k
            monitor-enter(r1)
            boolean r2 = r3.f112394s     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x001e
            r3.f112390m = r0     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return r0
        L_0x0023:
            java.io.Closeable r4 = r3.m75850k(r5, r4)
        L_0x0027:
            java.lang.Object r5 = r3.mo46025d(r5)     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r3.f112388k     // Catch:{ all -> 0x003c }
            monitor-enter(r0)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0037
            r3.f112390m = r5     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            r4.close()
            goto L_0x0038
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
        L_0x0038:
            return r5
        L_0x0039:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r5     // Catch:{ all -> 0x003c }
        L_0x003c:
            r5 = move-exception
            if (r4 == 0) goto L_0x0047
            r4.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r4 = move-exception
            com.google.android.libraries.storage.protostore.C42942cj.m75834a(r5, r4)
        L_0x0047:
            throw r5
        L_0x0048:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r4
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.protostore.C42966db.mo46028j(com.google.android.libraries.storage.protostore.cv, android.net.Uri):java.lang.Object");
    }

    /* renamed from: m */
    public final C60870cx mo46029m(C42900az azVar) {
        synchronized (this.f112388k) {
            azVar.getClass();
            this.f112395t = azVar;
        }
        return C60866ct.f164955a;
    }
}
