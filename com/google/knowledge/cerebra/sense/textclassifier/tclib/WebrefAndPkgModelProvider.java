package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4541l.C59341x;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4273bs.p4277b.p4278a.C56479s;
import com.google.p4273bs.p4277b.p4278a.C56481u;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class WebrefAndPkgModelProvider implements C61908br {

    /* renamed from: a */
    public C61961dq f167295a;

    /* renamed from: b */
    public C56479s f167296b;

    /* renamed from: c */
    public final Lock f167297c = new ReentrantLock();

    /* renamed from: d */
    private C61910bt f167298d;

    /* renamed from: e */
    private boolean f167299e;

    /* renamed from: f */
    private boolean f167300f;

    /* renamed from: g */
    private boolean f167301g;

    /* renamed from: h */
    private C56481u f167302h;

    /* renamed from: i */
    private C61961dq f167303i;

    /* renamed from: j */
    private Long f167304j = null;

    /* renamed from: k */
    private Long f167305k = null;

    public WebrefAndPkgModelProvider(C61961dq dqVar, C61910bt btVar, boolean z) {
        this.f167295a = dqVar;
        m94520f();
        if (m94521g(btVar)) {
            this.f167298d = btVar;
        }
        this.f167299e = true;
        this.f167300f = z;
        this.f167301g = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (com.google.common.p4522b.C58528ij.m90006F(r0.f150862c).containsAll(r2.f150862c) != false) goto L_0x006b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m94520f() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.f167297c
            r0.lock()
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dq r0 = r5.f167295a     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0073
            android.os.ParcelFileDescriptor r0 = r0.mo58437a()     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0073
        L_0x0010:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ all -> 0x0079 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider$2 r1 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider$2     // Catch:{ all -> 0x0079 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dq r2 = r5.f167295a     // Catch:{ all -> 0x0079 }
            android.os.ParcelFileDescriptor r2 = r2.mo58437a()     // Catch:{ all -> 0x0079 }
            r1.<init>(r2)     // Catch:{ all -> 0x0079 }
            r0.<init>(r1)     // Catch:{ all -> 0x0079 }
            com.google.bs.b.a.s r1 = com.google.p4273bs.p4277b.p4278a.C56479s.f150858d     // Catch:{ all -> 0x0079 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (java.io.InputStream) r0)     // Catch:{ all -> 0x0079 }
            com.google.bs.b.a.s r0 = (com.google.p4273bs.p4277b.p4278a.C56479s) r0     // Catch:{ all -> 0x0079 }
            com.google.bs.b.a.u r1 = r0.f150861b     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x002e
            com.google.bs.b.a.u r1 = com.google.p4273bs.p4277b.p4278a.C56481u.f150864e     // Catch:{ all -> 0x0079 }
        L_0x002e:
            long r1 = r1.f150868c     // Catch:{ all -> 0x0079 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r5.f167305k = r1     // Catch:{ all -> 0x0079 }
            com.google.bs.b.a.s r2 = r5.f167296b     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0069
            com.google.bs.b.a.q r3 = r2.f150860a     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x0040
            com.google.bs.b.a.q r3 = com.google.p4273bs.p4277b.p4278a.C56477q.f150856a     // Catch:{ all -> 0x0079 }
        L_0x0040:
            com.google.bs.b.a.q r4 = r0.f150860a     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0046
            com.google.bs.b.a.q r4 = com.google.p4273bs.p4277b.p4278a.C56477q.f150856a     // Catch:{ all -> 0x0079 }
        L_0x0046:
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x004d
            goto L_0x0069
        L_0x004d:
            com.google.protobuf.cq r3 = r2.f150862c     // Catch:{ all -> 0x0079 }
            int r3 = r3.size()     // Catch:{ all -> 0x0079 }
            com.google.protobuf.cq r4 = r0.f150862c     // Catch:{ all -> 0x0079 }
            int r4 = r4.size()     // Catch:{ all -> 0x0079 }
            if (r3 > r4) goto L_0x0069
            com.google.protobuf.cq r3 = r0.f150862c     // Catch:{ all -> 0x0079 }
            com.google.common.b.ij r3 = com.google.common.p4522b.C58528ij.m90006F(r3)     // Catch:{ all -> 0x0079 }
            com.google.protobuf.cq r2 = r2.f150862c     // Catch:{ all -> 0x0079 }
            boolean r2 = r3.containsAll(r2)     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x006b
        L_0x0069:
            r5.f167304j = r1     // Catch:{ all -> 0x0079 }
        L_0x006b:
            r5.f167296b = r0     // Catch:{ all -> 0x0079 }
            java.util.concurrent.locks.Lock r0 = r5.f167297c
        L_0x006f:
            r0.unlock()
            return
        L_0x0073:
            r0 = 0
            r5.f167296b = r0     // Catch:{ all -> 0x0079 }
            java.util.concurrent.locks.Lock r0 = r5.f167297c
            goto L_0x006f
        L_0x0079:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.f167297c
            r1.unlock()
            goto L_0x0081
        L_0x0080:
            throw r0
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider.m94520f():void");
    }

    /* renamed from: g */
    private final boolean m94521g(C61910bt btVar) {
        if (btVar == null) {
            this.f167302h = null;
            return true;
        }
        C56481u uVar = (C56481u) C62942bv.parseFrom((C62942bv) C56481u.f150864e, (InputStream) new ParcelFileDescriptor.AutoCloseInputStream(new ParcelFileDescriptor(((C61965h) btVar).f167439b) {
            public final void close() {
            }
        }));
        C56481u uVar2 = this.f167302h;
        if (uVar2 != null) {
            long j = uVar.f150868c;
            long j2 = uVar2.f150868c;
            if (j < j2) {
                Log.e("WebrefPkgModelProvider", "PKG slice was built for an older version (" + j + " VS " + j2 + "), ignoring update.");
                return false;
            }
        }
        if (!mo58316e(uVar)) {
            Log.e("WebrefPkgModelProvider", "PKG slice is not compatible with public model version, ignoring update.");
            return false;
        }
        this.f167302h = uVar;
        return true;
    }

    /* renamed from: a */
    public final C61907bq mo58311a() {
        this.f167297c.lock();
        if (this.f167299e) {
            C61961dq dqVar = this.f167295a;
            C61910bt btVar = this.f167298d;
            if (dqVar == null) {
                dqVar = null;
            } else {
                C58485gu e = dqVar.mo58442e();
                int size = e.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        int i2 = i + 1;
                        if (((C61960dp) e.get(i)).mo58436e().equals("personal")) {
                            break;
                        }
                        i = i2;
                    } else if (btVar != null) {
                        C61958dn f = dqVar.mo58443f();
                        f.mo58420a().mo55395g(((C61965h) btVar).f167438a);
                        dqVar = f.mo58421b();
                    }
                }
            }
            this.f167303i = dqVar;
        }
        boolean z = this.f167299e;
        C61961dq dqVar2 = this.f167303i;
        Lock lock = this.f167297c;
        Objects.requireNonNull(lock);
        C61964g gVar = new C61964g(z, dqVar2, new C61956dl(lock));
        this.f167299e = false;
        return gVar;
    }

    /* renamed from: b */
    public final C60870cx mo58312b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo58313c(C61910bt btVar, boolean z) {
        C59341x a = C59341x.m92227a();
        this.f167297c.lock();
        try {
            if (m94521g(btVar)) {
                if (this.f167301g) {
                    a.mo56859c(this.f167298d);
                }
                this.f167298d = btVar;
                this.f167301g = z;
                this.f167299e = true;
            } else if (z) {
                a.mo56859c(btVar);
            }
            try {
                a.close();
            } catch (IOException e) {
                Log.e("WebrefPkgModelProvider", "Failed to close while updating the PKG model: ", e);
            }
        } finally {
            this.f167297c.unlock();
        }
    }

    public final void close() {
        mo58315d((C61961dq) null, false);
        mo58313c((C61910bt) null, false);
    }

    /* renamed from: d */
    public final void mo58315d(C61961dq dqVar, boolean z) {
        C59341x a = C59341x.m92227a();
        this.f167297c.lock();
        try {
            if (this.f167300f) {
                a.mo56859c(this.f167295a);
            }
            this.f167295a = dqVar;
            this.f167300f = z;
            this.f167299e = true;
            m94520f();
            if (!mo58316e(this.f167302h)) {
                if (this.f167301g) {
                    a.mo56859c(this.f167298d);
                }
                this.f167298d = null;
                this.f167301g = false;
            }
            try {
                a.close();
            } catch (IOException e) {
                Log.e("WebrefPkgModelProvider", "Failed to close while updating the Webref model: ", e);
            }
        } finally {
            this.f167297c.unlock();
        }
    }

    /* renamed from: e */
    public final boolean mo58316e(C56481u uVar) {
        Lock lock;
        this.f167297c.lock();
        try {
            boolean z = false;
            if (this.f167304j != null) {
                if (this.f167305k != null) {
                    C56479s sVar = this.f167296b;
                    if (sVar == null || uVar == null) {
                        lock = this.f167297c;
                        lock.unlock();
                        return z;
                    }
                    C56481u uVar2 = sVar.f150861b;
                    if (uVar2 == null) {
                        uVar2 = C56481u.f150864e;
                    }
                    if (uVar2.f150866a.equals(uVar.f150866a) && uVar2.f150867b.equals(uVar.f150867b) && this.f167304j.longValue() <= uVar.f150868c && this.f167305k.longValue() >= uVar.f150868c) {
                        z = true;
                    }
                    lock = this.f167297c;
                    lock.unlock();
                    return z;
                }
            }
            lock = this.f167297c;
            lock.unlock();
            return z;
        } catch (Throwable th) {
            this.f167297c.unlock();
            throw th;
        }
    }
}
