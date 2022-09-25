package com.google.android.gms.car.p10760f;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143181dh;
import com.google.android.gms.car.p10759e.C143212d;
import com.google.android.gms.car.p10764h.C143316a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.gms.car.f.br */
/* compiled from: PG */
public final class C143284br implements C143212d {

    /* renamed from: a */
    public volatile boolean f388493a;

    /* renamed from: b */
    public final Queue f388494b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final C143238ab f388495c;

    public C143284br(C143238ab abVar) {
        this.f388495c = abVar;
    }

    /* renamed from: e */
    private final boolean m232458e() {
        if (mo118332d()) {
            return true;
        }
        C143316a.m232513c("CAR.INPUT", (Throwable) null, "This InputManager doesn't have a valid backing service connection.");
        return false;
    }

    /* renamed from: a */
    public final void mo118251a() {
        if (C143109au.m232164a("CAR.INPUT", 3)) {
            C143316a.m232511a("CAR.INPUT", (Throwable) null, "stopInput");
        }
        if (m232458e()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C143238ab abVar = this.f388495c;
                try {
                    C143150cf cfVar = abVar.f388363a.f388447O;
                    if (cfVar != null) {
                        cfVar.mo17262he(17, cfVar.mo17260gA());
                    }
                } catch (RemoteException unused) {
                    C143181dh.m232308a(Looper.getMainLooper(), abVar.f388363a.f388456e);
                }
            } else {
                throw new IllegalStateException("expecting main thread");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo118252b() {
        return mo118332d() && !this.f388494b.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r0 = new android.view.inputmethod.EditorInfo();
        r3 = r10.f31104a;
        r3 = (android.view.inputmethod.InputConnection) r3.mo17306c(r3.f31087l, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (com.google.android.gms.car.C143109au.m232164a("CAR.INPUT", 3) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        com.google.android.gms.car.p10764h.C143316a.m232514d(3, "CAR.INPUT", (java.lang.Throwable) null, "startInput/editorInfo.imeOptions=%d", java.lang.Integer.valueOf(r0.imeOptions));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        com.google.android.gms.car.p10764h.C143316a.m232514d(6, "CAR.INPUT", (java.lang.Throwable) null, "Null input connection received for view of type: %s", r10.getClass().getSimpleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r10 = r9.f388495c;
        r1 = new com.google.android.gms.car.p10759e.C143232x(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2 = r10.f388363a.f388447O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r3 = r2.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r3, r1);
        com.google.android.p445a.C8850c.m23497f(r3, r0);
        r2.mo17262he(16, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        com.google.android.gms.car.C143181dh.m232308a(android.os.Looper.getMainLooper(), r10.f388363a.f388456e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118253c(com.google.android.apps.auto.sdk.C8990v r10) {
        /*
            r9 = this;
            java.lang.String r0 = "CAR.INPUT"
            r1 = 3
            boolean r0 = com.google.android.gms.car.C143109au.m232164a(r0, r1)
            r2 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "CAR.INPUT"
            java.lang.String r3 = "startInput"
            com.google.android.gms.car.p10764h.C143316a.m232511a(r0, r2, r3)
        L_0x0011:
            boolean r0 = r9.m232458e()
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r0 != r3) goto L_0x00af
            java.util.Queue r0 = r9.f388494b
            monitor-enter(r0)
            java.util.Queue r3 = r9.f388494b     // Catch:{ all -> 0x00ac }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r3 != 0) goto L_0x0038
            java.util.Queue r3 = r9.f388494b     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00ac }
            if (r3 == r10) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return
        L_0x0038:
            java.util.Queue r3 = r9.f388494b     // Catch:{ all -> 0x00ac }
            r3.offer(r10)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            android.view.inputmethod.EditorInfo r0 = new android.view.inputmethod.EditorInfo
            r0.<init>()
            com.google.android.apps.auto.sdk.d r3 = r10.f31104a
            java.lang.reflect.Method r4 = r3.f31087l
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            java.lang.Object r3 = r3.mo17306c(r4, r6)
            android.view.inputmethod.InputConnection r3 = (android.view.inputmethod.InputConnection) r3
            java.lang.String r4 = "CAR.INPUT"
            boolean r4 = com.google.android.gms.car.C143109au.m232164a(r4, r1)
            if (r4 == 0) goto L_0x006c
            java.lang.Object[] r4 = new java.lang.Object[r5]
            int r6 = r0.imeOptions
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r7] = r6
            java.lang.String r6 = "CAR.INPUT"
            java.lang.String r8 = "startInput/editorInfo.imeOptions=%d"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r1, r6, r2, r8, r4)
        L_0x006c:
            if (r3 != 0) goto L_0x0083
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r0[r7] = r10
            java.lang.String r10 = "CAR.INPUT"
            java.lang.String r1 = "Null input connection received for view of type: %s"
            r3 = 6
            com.google.android.gms.car.p10764h.C143316a.m232514d(r3, r10, r2, r1, r0)
            return
        L_0x0083:
            com.google.android.gms.car.f.ab r10 = r9.f388495c
            com.google.android.gms.car.e.x r1 = new com.google.android.gms.car.e.x
            r1.<init>(r3)
            com.google.android.gms.car.f.bb r2 = r10.f388363a     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.car.cf r2 = r2.f388447O     // Catch:{ RemoteException -> 0x00a0 }
            if (r2 == 0) goto L_0x009f
            android.os.Parcel r3 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.p445a.C8850c.m23499h(r3, r1)     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.p445a.C8850c.m23497f(r3, r0)     // Catch:{ RemoteException -> 0x00a0 }
            r0 = 16
            r2.mo17262he(r0, r3)     // Catch:{ RemoteException -> 0x00a0 }
        L_0x009f:
            return
        L_0x00a0:
            com.google.android.gms.car.f.bb r10 = r10.f388363a
            java.lang.Runnable r10 = r10.f388456e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            com.google.android.gms.car.C143181dh.m232308a(r0, r10)
            return
        L_0x00ac:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r10
        L_0x00af:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "expecting main thread"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143284br.mo118253c(com.google.android.apps.auto.sdk.v):void");
    }

    /* renamed from: d */
    public final boolean mo118332d() {
        return !this.f388493a;
    }
}
