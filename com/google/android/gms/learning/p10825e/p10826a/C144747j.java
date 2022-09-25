package com.google.android.gms.learning.p10825e.p10826a;

import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.proxy.C144639i;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import com.google.common.base.C58835az;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60916ec;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.learning.e.a.j */
/* compiled from: PG */
final class C144747j implements Closeable {

    /* renamed from: a */
    public final AtomicBoolean f391559a = new AtomicBoolean(false);

    /* renamed from: b */
    final /* synthetic */ C144749l f391560b;

    /* renamed from: c */
    private boolean f391561c = false;

    /* renamed from: d */
    private final C144639i f391562d;

    /* renamed from: e */
    private final ServiceConnection f391563e;

    /* renamed from: f */
    private final C144746i f391564f = new C144746i(this);

    public C144747j(C144749l lVar, C144639i iVar, ServiceConnection serviceConnection) {
        this.f391560b = lVar;
        this.f391562d = iVar;
        this.f391563e = serviceConnection;
    }

    /* renamed from: b */
    private final void m235255b() {
        SettableFuture settableFuture = new SettableFuture();
        this.f391560b.f391581j.f391549a.set(settableFuture);
        this.f391562d.mo120088a(new C144745h(settableFuture));
        try {
            settableFuture.get(this.f391560b.f391579h, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            throw new C60916ec(e);
        } catch (TimeoutException e2) {
            C144749l lVar = this.f391560b;
            lVar.f391574c.mo34869k(e2, "Closing iterator timed out (%ss)", Long.valueOf(lVar.f391579h));
            this.f391560b.mo120182d(979);
        } catch (CancellationException e3) {
            this.f391560b.f391574c.mo34868j(e3, "Closing iterator failed due to dead process");
            this.f391560b.mo120182d(980);
        }
    }

    /* renamed from: a */
    public final C144744g mo120180a() {
        SettableFuture settableFuture = new SettableFuture();
        this.f391560b.f391581j.f391549a.set(settableFuture);
        C144746i iVar = this.f391564f;
        iVar.f391557d = settableFuture;
        iVar.f391554a.clear();
        iVar.f391555b.set(0);
        AtomicLong atomicLong = iVar.f391556c;
        C144748k kVar = iVar.f391558e.f391560b.f391580i;
        atomicLong.set(kVar != null ? kVar.f391565a.mo26884a() : 0);
        int i = 986;
        try {
            C144639i iVar2 = this.f391562d;
            C144746i iVar3 = this.f391564f;
            int c = C60757n.m92742c(this.f391560b.f391573b.mo120024d(), 0, 204800);
            if (c <= 0) {
                c = 51200;
            }
            iVar2.mo120090c(iVar3, c);
            try {
                C58835az azVar = (C58835az) settableFuture.get(this.f391560b.f391579h, TimeUnit.SECONDS);
                if (azVar.f156632b == null) {
                    C144744g gVar = (C144744g) azVar.f156631a;
                    if (gVar == null) {
                        close();
                    }
                    return gVar;
                }
                this.f391560b.mo120182d(985);
                close();
                throw ErrorStatusException.m54793b(14, C144749l.m235257c("onIteratorNextFailure", this.f391560b.f391577f, (Status) azVar.f156632b), new Object[0]);
            } catch (ExecutionException e) {
                throw new C60916ec(e);
            } catch (TimeoutException unused) {
                this.f391560b.mo120182d(984);
                close();
                throw ErrorStatusException.m54793b(14, "next() timed out (%ss)", Long.valueOf(this.f391560b.f391579h));
            } catch (CancellationException unused2) {
                this.f391560b.mo120182d(986);
                close();
                throw ErrorStatusException.m54793b(14, "next() failed due to dead process", new Object[0]);
            }
        } catch (RemoteException e2) {
            if (true != (e2 instanceof DeadObjectException)) {
                i = 988;
            }
            this.f391560b.mo120182d(i);
            close();
            throw ErrorStatusException.m54794c(14, e2, "Failed to call next()", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r7 = this;
            boolean r0 = r7.f391561c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r7.f391561c = r0
            com.google.android.gms.learning.dynamite.proxy.i r1 = r7.f391562d
            if (r1 == 0) goto L_0x002b
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f391559a
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0020
            com.google.android.gms.learning.e.a.l r1 = r7.f391560b
            com.google.android.gms.learning.n r2 = r1.f391575d
            r3 = 998(0x3e6, float:1.398E-42)
            java.lang.String r1 = r1.f391576e
            r2.mo120058j(r3, r1)
            goto L_0x002b
        L_0x0020:
            com.google.android.gms.learning.e.a.l r1 = r7.f391560b
            com.google.android.gms.learning.n r2 = r1.f391575d
            r3 = 999(0x3e7, float:1.4E-42)
            java.lang.String r1 = r1.f391576e
            r2.mo120058j(r3, r1)
        L_0x002b:
            com.google.android.gms.learning.e.a.l r1 = r7.f391560b     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.learning.n r2 = r1.f391575d     // Catch:{ RemoteException -> 0x005e }
            com.google.common.o.b.a.h r1 = r1.f391578g     // Catch:{ RemoteException -> 0x005e }
            r3 = 4
            com.google.android.gms.learning.b.a r1 = r2.mo120053e(r3, r1)     // Catch:{ RemoteException -> 0x005e }
            r7.m235255b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ RemoteException -> 0x005e }
            goto L_0x0076
        L_0x003f:
            r2 = move-exception
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ all -> 0x0046 }
            goto L_0x005d
        L_0x0046:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x005d }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x005d }
            r4[r5] = r1     // Catch:{ Exception -> 0x005d }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r2     // Catch:{ RemoteException -> 0x005e }
        L_0x005e:
            r1 = move-exception
            boolean r2 = r1 instanceof android.os.DeadObjectException
            if (r0 == r2) goto L_0x0066
            r0 = 982(0x3d6, float:1.376E-42)
            goto L_0x0068
        L_0x0066:
            r0 = 980(0x3d4, float:1.373E-42)
        L_0x0068:
            com.google.android.gms.learning.e.a.l r2 = r7.f391560b
            r2.mo120182d(r0)
            com.google.android.gms.learning.e.a.l r0 = r7.f391560b
            com.google.android.libraries.micore.learning.base.k r0 = r0.f391574c
            java.lang.String r2 = "Exception during call to IExampleStoreIterator.close"
            r0.mo34868j(r1, r2)
        L_0x0076:
            com.google.android.gms.learning.e.a.l r0 = r7.f391560b
            android.content.Context r0 = r0.f391572a
            android.content.ServiceConnection r1 = r7.f391563e
            r0.unbindService(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10825e.p10826a.C144747j.close():void");
    }
}
