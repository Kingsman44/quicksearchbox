package org.chromium.net.impl;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.C72387m;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import p000J.C0000N;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class CronetUrlRequest extends C72510cp {

    /* renamed from: A */
    private final long f192711A;

    /* renamed from: B */
    private final int f192712B;

    /* renamed from: C */
    private final C72539u f192713C;

    /* renamed from: D */
    private int f192714D;

    /* renamed from: E */
    private C72541w f192715E;

    /* renamed from: F */
    private boolean f192716F;

    /* renamed from: G */
    private boolean f192717G;

    /* renamed from: H */
    private C72451ak f192718H;

    /* renamed from: a */
    public long f192719a;

    /* renamed from: b */
    public boolean f192720b;

    /* renamed from: c */
    public boolean f192721c;

    /* renamed from: d */
    public final Object f192722d = new Object();

    /* renamed from: e */
    public final C72522da f192723e;

    /* renamed from: f */
    public final C72519cy f192724f;

    /* renamed from: g */
    public CronetUploadDataStream f192725g;

    /* renamed from: h */
    public C72513cs f192726h;

    /* renamed from: i */
    public CronetException f192727i;

    /* renamed from: j */
    private final boolean f192728j;

    /* renamed from: k */
    private boolean f192729k;

    /* renamed from: l */
    private final CronetUrlRequestContext f192730l;

    /* renamed from: m */
    private final Executor f192731m;

    /* renamed from: n */
    private final List f192732n;

    /* renamed from: o */
    private final String f192733o;

    /* renamed from: p */
    private final int f192734p;

    /* renamed from: q */
    private final int f192735q;

    /* renamed from: r */
    private String f192736r;

    /* renamed from: s */
    private final C72450aj f192737s;

    /* renamed from: t */
    private final Collection f192738t;

    /* renamed from: u */
    private final boolean f192739u;

    /* renamed from: v */
    private final boolean f192740v;

    /* renamed from: w */
    private final boolean f192741w;

    /* renamed from: x */
    private final int f192742x;

    /* renamed from: y */
    private final boolean f192743y;

    /* renamed from: z */
    private final int f192744z;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r5 != 2) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CronetUrlRequest(org.chromium.net.impl.CronetUrlRequestContext r9, java.lang.String r10, int r11, org.chromium.net.UrlRequest.Callback r12, java.util.concurrent.Executor r13, java.util.Collection r14, boolean r15, boolean r16, boolean r17, boolean r18, int r19, boolean r20, int r21, org.chromium.net.RequestFinishedInfo.Listener r22, int r23, long r24) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r22
            r5 = r23
            r8.<init>()
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            r0.f192722d = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f192732n = r6
            org.chromium.net.impl.aj r7 = new org.chromium.net.impl.aj
            r7.<init>()
            r0.f192737s = r7
            r7 = r17
            r0.f192728j = r7
            r0.f192730l = r1
            int r7 = r1.f192751f
            r0.f192712B = r7
            org.chromium.net.impl.u r1 = r1.f192752g
            r0.f192713C = r1
            r0.f192733o = r2
            r6.add(r10)
            r1 = 2
            r2 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 == r2) goto L_0x0046
            r6 = 3
            if (r3 == r1) goto L_0x0049
            r7 = 4
            if (r3 == r6) goto L_0x0044
            if (r3 == r7) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r6 = 5
            goto L_0x0049
        L_0x0044:
            r6 = 4
            goto L_0x0049
        L_0x0046:
            r6 = 2
            goto L_0x0049
        L_0x0048:
            r6 = 1
        L_0x0049:
            r0.f192734p = r6
            org.chromium.net.impl.da r3 = new org.chromium.net.impl.da
            r6 = r12
            r3.<init>(r12)
            r0.f192723e = r3
            r3 = r13
            r0.f192731m = r3
            r3 = r14
            r0.f192738t = r3
            r3 = r15
            r0.f192739u = r3
            r3 = r16
            r0.f192740v = r3
            r3 = r18
            r0.f192741w = r3
            r3 = r19
            r0.f192742x = r3
            r3 = r20
            r0.f192743y = r3
            r3 = r21
            r0.f192744z = r3
            if (r4 == 0) goto L_0x0078
            org.chromium.net.impl.cy r3 = new org.chromium.net.impl.cy
            r3.<init>(r4)
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            r0.f192724f = r3
            r3 = 0
            if (r5 == 0) goto L_0x0085
            if (r5 == r2) goto L_0x0083
            if (r5 == r1) goto L_0x0086
            goto L_0x0085
        L_0x0083:
            r1 = 1
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            r0.f192735q = r1
            r1 = r24
            r0.f192711A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.<init>(org.chromium.net.impl.CronetUrlRequestContext, java.lang.String, int, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor, java.util.Collection, boolean, boolean, boolean, boolean, int, boolean, int, org.chromium.net.RequestFinishedInfo$Listener, int, long):void");
    }

    /* renamed from: j */
    private final C72513cs m107138j(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        String[] strArr2 = strArr;
        C72450aj ajVar = new C72450aj();
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            ajVar.add(new AbstractMap.SimpleImmutableEntry(strArr2[i2], strArr2[i2 + 1]));
        }
        return new C72513cs(new ArrayList(this.f192732n), i, str, ajVar, z, str2, str3, j);
    }

    /* renamed from: k */
    private final void m107139k() {
        synchronized (this.f192722d) {
            if (this.f192729k || mo64181i()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    /* renamed from: m */
    private final void m107141m(Runnable runnable) {
        try {
            this.f192731m.execute(runnable);
        } catch (RejectedExecutionException e) {
            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception posting task to executor", e);
            m107140l(new C72534p("Exception posting task to executor", e));
        }
    }

    private void onCanceled() {
        m107141m(new C72446af(this));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C72513cs csVar = this.f192726h;
        if (csVar != null) {
            csVar.f192954d.set(j);
        }
        if (i != 10) {
            if (i == 3) {
                i = 3;
            } else {
                switch (i) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 9:
                        i = 9;
                        break;
                    case 10:
                        i = 10;
                        break;
                    case 11:
                        i = 11;
                        break;
                    default:
                        String str2 = CronetUrlRequestContext.f192745a;
                        C72387m.m107041b(str2, "Unknown error code: " + i, new Object[0]);
                        break;
                }
                m107140l(new C72505ck("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2));
                return;
            }
        }
        m107140l(new C72508cn("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2, i3));
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.f192722d) {
            if (this.f192727i != null) {
                try {
                    this.f192731m.execute(new C72448ah(this));
                } catch (RejectedExecutionException e) {
                    C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception posting task to executor", e);
                }
            }
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.f192726h.f192954d.set(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.f192718H == null) {
                this.f192718H = new C72451ak(this);
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i2 + i);
            C72451ak akVar = this.f192718H;
            akVar.f192798a = byteBuffer;
            m107141m(akVar);
            return;
        }
        m107140l(new C72534p("ByteBuffer modified externally during read", (Throwable) null));
    }

    private void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        String str5 = str;
        C72513cs j2 = m107138j(i, str2, strArr, z, str3, str4, j);
        this.f192732n.add(str);
        m107141m(new C72443ac(this, j2, str));
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.f192726h = m107138j(i, str, strArr, z, str2, str3, j);
        m107141m(new C72444ad(this));
    }

    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        m107141m(new C72447ag(versionSafeCallbacks$UrlRequestStatusListener, i));
    }

    private void onSucceeded(long j) {
        this.f192726h.f192954d.set(j);
        m107141m(new C72445ae(this));
    }

    /* renamed from: a */
    public final void mo64173a(String str, String str2) {
        m107139k();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.f192737s.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64174b() {
        if (!this.f192728j) {
            if (Thread.currentThread() == this.f192730l.f192750e) {
                throw new InlineExecutionProhibitedException();
            }
        }
    }

    /* renamed from: c */
    public final void mo64175c(int i) {
        this.f192714D = i;
        if (this.f192719a != 0) {
            this.f192730l.f192748c.decrementAndGet();
            C0000N.M4znfYdB(this.f192719a, this, i == 2);
            this.f192719a = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f192722d
            monitor-enter(r0)
            boolean r1 = r2.mo64181i()     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r2.f192729k     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            r1 = 2
            r2.mo64175c(r1)     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.cancel():void");
    }

    /* renamed from: d */
    public final void mo64176d() {
        String str;
        int i;
        boolean z;
        Map map;
        long j;
        long j2;
        long j3;
        long j4;
        Duration duration;
        Duration duration2;
        long j5;
        if (this.f192715E != null) {
            try {
                C72539u uVar = this.f192713C;
                int i2 = this.f192712B;
                C72513cs csVar = this.f192726h;
                if (csVar != null) {
                    map = csVar.f192955e.getAsMap();
                    C72513cs csVar2 = this.f192726h;
                    String str2 = csVar2.f192953c;
                    int i3 = csVar2.f192951a;
                    z = csVar2.f192952b;
                    str = str2;
                    i = i3;
                } else {
                    map = Collections.emptyMap();
                    str = BuildConfig.FLAVOR;
                    z = false;
                    i = 0;
                }
                long longValue = this.f192715E.f193037d.longValue();
                if (!z || longValue != 0) {
                    C72450aj ajVar = this.f192737s;
                    int size = ajVar.size();
                    j = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        Map.Entry entry = (Map.Entry) ajVar.get(i4);
                        String str3 = (String) entry.getKey();
                        if (str3 != null) {
                            j += (long) str3.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            j += (long) ((String) entry.getValue()).length();
                        }
                    }
                    j2 = Math.max(0, longValue - j);
                } else {
                    j2 = 0;
                    j = 0;
                }
                long longValue2 = this.f192715E.f193038e.longValue();
                if (!z || longValue2 != 0) {
                    if (map == null) {
                        j5 = 0;
                    } else {
                        j5 = 0;
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str4 = (String) entry2.getKey();
                            if (str4 != null) {
                                j5 += (long) str4.length();
                            }
                            if (entry2.getValue() != null) {
                                for (String length : (List) entry2.getValue()) {
                                    j5 += (long) length.length();
                                }
                            }
                        }
                    }
                    j4 = Math.max(0, longValue2 - j5);
                    j3 = j5;
                } else {
                    j4 = 0;
                    j3 = 0;
                }
                if (C72541w.m107237a(this.f192715E.f193034a) == null || C72541w.m107237a(this.f192715E.f193035b) == null) {
                    duration = Duration.ofSeconds(0);
                } else {
                    duration = Duration.ofMillis(C72541w.m107237a(this.f192715E.f193035b).getTime() - C72541w.m107237a(this.f192715E.f193034a).getTime());
                }
                if (C72541w.m107237a(this.f192715E.f193034a) == null || C72541w.m107237a(this.f192715E.f193036c) == null) {
                    duration2 = Duration.ofSeconds(0);
                } else {
                    duration2 = Duration.ofMillis(C72541w.m107237a(this.f192715E.f193036c).getTime() - C72541w.m107237a(this.f192715E.f193034a).getTime());
                }
                long j6 = j2;
                C72537s sVar = r7;
                C72537s sVar2 = new C72537s(j, j6, j3, j4, i, duration, duration2, str, this.f192716F, this.f192717G);
                uVar.mo58624a(i2, sVar);
            } catch (RuntimeException e) {
                C72387m.m107041b(CronetUrlRequestContext.f192745a, "Error while trying to log CronetTrafficInfo: ", e);
            }
            C72509co coVar = new C72509co(this.f192733o, this.f192738t, this.f192715E, this.f192714D, this.f192726h, this.f192727i);
            this.f192730l.mo64185d(coVar);
            C72519cy cyVar = this.f192724f;
            if (cyVar != null) {
                try {
                    cyVar.f192965a.getExecutor().execute(new C72449ai(this, coVar));
                } catch (RejectedExecutionException e2) {
                    C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception posting task to executor", e2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo64177e(Exception exc) {
        C72494c cVar = new C72494c("Exception received from UrlRequest.Callback", exc);
        C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in CalledByNative method", exc);
        m107140l(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo64178f(Throwable th) {
        C72494c cVar = new C72494c("Exception received from UploadDataProvider", th);
        C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in upload method", th);
        m107140l(cVar);
    }

    public final void followRedirect() {
        synchronized (this.f192722d) {
            if (this.f192720b) {
                this.f192720b = false;
                if (!mo64181i()) {
                    C0000N.Mhp54Oqs(this.f192719a, this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    /* renamed from: g */
    public final void mo64179g(String str) {
        m107139k();
        this.f192736r = str;
    }

    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.f192722d) {
            long j = this.f192719a;
            if (j != 0) {
                C0000N.MgIIMpT9(j, this, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                m107141m(new C72442ab(versionSafeCallbacks$UrlRequestStatusListener));
            }
        }
    }

    /* renamed from: h */
    public final void mo64180h(UploadDataProvider uploadDataProvider, Executor executor) {
        if (this.f192736r == null) {
            this.f192736r = "POST";
        }
        this.f192725g = new CronetUploadDataStream(uploadDataProvider, executor, this);
    }

    /* renamed from: i */
    public final boolean mo64181i() {
        return this.f192729k && this.f192719a == 0;
    }

    public final boolean isDone() {
        boolean i;
        synchronized (this.f192722d) {
            i = mo64181i();
        }
        return i;
    }

    public final void read(ByteBuffer byteBuffer) {
        C72507cm.m107215b(byteBuffer);
        C72507cm.m107214a(byteBuffer);
        synchronized (this.f192722d) {
            if (this.f192721c) {
                this.f192721c = false;
                if (!mo64181i()) {
                    if (!C0000N.MfCxA8r3(this.f192719a, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                        this.f192721c = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    public final void start() {
        Object obj;
        int i;
        Object obj2 = this.f192722d;
        synchronized (obj2) {
            try {
                m107139k();
                try {
                    long c = this.f192730l.mo64184c();
                    String str = this.f192733o;
                    int i2 = this.f192734p;
                    boolean z = this.f192739u;
                    boolean z2 = this.f192740v;
                    boolean z3 = this.f192741w;
                    int i3 = this.f192742x;
                    boolean z4 = this.f192743y;
                    int i4 = this.f192744z;
                    int i5 = this.f192735q;
                    obj = obj2;
                    try {
                        this.f192719a = C0000N.MuOIsMvf(this, c, str, i2, z, z2, z3, i3, z4, i4, i5, this.f192711A);
                        this.f192730l.f192748c.incrementAndGet();
                        String str2 = this.f192736r;
                        if (str2 != null) {
                            if (!C0000N.M51RPBJe(this.f192719a, this, str2)) {
                                String str3 = this.f192736r;
                                throw new IllegalArgumentException("Invalid http method " + str3);
                            }
                        }
                        Iterator it = this.f192737s.iterator();
                        boolean z5 = false;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).equalsIgnoreCase("Content-Type") && !((String) entry.getValue()).isEmpty()) {
                                z5 = true;
                            }
                            if (!C0000N.MvHusd1J(this.f192719a, this, (String) entry.getKey(), (String) entry.getValue())) {
                                throw new IllegalArgumentException("Invalid header " + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                            }
                        }
                        CronetUploadDataStream cronetUploadDataStream = this.f192725g;
                        if (cronetUploadDataStream != null) {
                            i = 1;
                            if (z5) {
                                try {
                                    this.f192729k = true;
                                    cronetUploadDataStream.mo64169c(new C72441aa(this));
                                } catch (RuntimeException e) {
                                    e = e;
                                    mo64175c(i);
                                    throw e;
                                }
                            } else {
                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                            }
                        } else {
                            this.f192729k = true;
                            C0000N.MabZ5m6r(this.f192719a, this);
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        i = 1;
                        mo64175c(i);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    Object obj3 = obj2;
                    i = 1;
                    mo64175c(i);
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        synchronized (this.f192722d) {
            if (this.f192715E == null) {
                this.f192715E = new C72541w(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
                this.f192716F = z2;
                this.f192717G = z3;
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    /* renamed from: l */
    private final void m107140l(CronetException cronetException) {
        synchronized (this.f192722d) {
            if (!mo64181i()) {
                this.f192727i = cronetException;
                mo64175c(1);
            }
        }
    }
}
