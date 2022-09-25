package com.google.android.gms.learning.p10825e.p10826a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.dynamite.proxy.C144639i;
import com.google.android.gms.learning.dynamite.proxy.C144648r;
import com.google.android.gms.learning.internal.C144760a;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import com.google.android.libraries.micore.learning.p2258a.C29698h;
import com.google.android.libraries.micore.learning.training.C29725a;
import com.google.common.base.C58835az;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59629i;
import com.google.common.p4552o.p4554b.p4555a.C59630j;
import com.google.common.p4552o.p4554b.p4555a.C59631k;
import com.google.common.p4552o.p4554b.p4555a.C59632l;
import com.google.common.p4552o.p4554b.p4555a.C59635o;
import com.google.common.p4552o.p4554b.p4555a.C59636p;
import com.google.common.util.concurrent.C60916ec;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p3728as.p3729a.p3730a.C48030j;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.learning.e.a.l */
/* compiled from: PG */
public final class C144749l implements C29725a {

    /* renamed from: a */
    public final Context f391572a;

    /* renamed from: b */
    public final C144573b f391573b;

    /* renamed from: c */
    public final C29719k f391574c;

    /* renamed from: d */
    public final C144827n f391575d;

    /* renamed from: e */
    public final String f391576e;

    /* renamed from: f */
    public final String f391577f;

    /* renamed from: g */
    public final C59628h f391578g;

    /* renamed from: h */
    public final long f391579h;

    /* renamed from: i */
    public final C144748k f391580i;

    /* renamed from: j */
    public final C144743f f391581j = new C144743f(this);

    /* renamed from: k */
    private final C63070h f391582k;

    /* renamed from: l */
    private final C144739b f391583l;

    /* renamed from: m */
    private boolean f391584m;

    /* renamed from: n */
    private boolean f391585n;

    /* renamed from: o */
    private C144747j f391586o;

    /* renamed from: p */
    private C144744g f391587p;

    /* renamed from: q */
    private C63088z f391588q;

    /* renamed from: r */
    private final String f391589r;

    /* renamed from: s */
    private final C48030j f391590s;

    /* renamed from: t */
    private int f391591t;

    public C144749l(Context context, C144573b bVar, C144827n nVar, String str, String str2, C63070h hVar, C63088z zVar, C59628h hVar2, C144739b bVar2, String str3, C48030j jVar) {
        C59627g gVar;
        this.f391572a = context;
        this.f391573b = bVar;
        this.f391575d = nVar;
        this.f391576e = str;
        this.f391577f = str2;
        this.f391582k = hVar;
        this.f391588q = zVar;
        this.f391574c = new C29712d("InAppExampleIterator");
        this.f391583l = bVar2;
        this.f391589r = str3;
        this.f391591t = 1;
        C144748k kVar = null;
        this.f391587p = null;
        this.f391590s = jVar;
        if (bVar.mo119993aa()) {
            if (hVar2 != null) {
                gVar = (C59627g) hVar2.toBuilder();
            } else {
                gVar = (C59627g) C59628h.f159873h.createBuilder();
            }
            C59629i iVar = (C59629i) C59630j.f159882d.createBuilder();
            iVar.copyOnWrite();
            C59630j jVar2 = (C59630j) iVar.instance;
            str.getClass();
            jVar2.f159884a |= 1;
            jVar2.f159885b = str;
            gVar.copyOnWrite();
            C59628h hVar3 = (C59628h) gVar.instance;
            C59630j jVar3 = (C59630j) iVar.build();
            jVar3.getClass();
            hVar3.f159876b = jVar3;
            hVar3.f159875a |= 1;
            C59631k kVar2 = (C59631k) C59632l.f159887c.createBuilder();
            C59635o oVar = (C59635o) C59636p.f159895c.createBuilder();
            oVar.copyOnWrite();
            C59636p pVar = (C59636p) oVar.instance;
            str2.getClass();
            pVar.f159897a |= 1;
            pVar.f159898b = str2;
            kVar2.copyOnWrite();
            C59632l lVar = (C59632l) kVar2.instance;
            C59636p pVar2 = (C59636p) oVar.build();
            pVar2.getClass();
            lVar.f159890b = pVar2;
            lVar.f159889a = 1 | lVar.f159889a;
            gVar.copyOnWrite();
            C59628h hVar4 = (C59628h) gVar.instance;
            C59632l lVar2 = (C59632l) kVar2.build();
            lVar2.getClass();
            hVar4.f159880f = lVar2;
            hVar4.f159875a |= 4096;
            this.f391578g = nVar.mo120048a((C59628h) gVar.build());
        } else {
            this.f391578g = C59628h.f159873h;
        }
        this.f391580i = bVar.mo119999ag() ? new C144748k() : kVar;
        this.f391579h = bVar.mo120042v();
    }

    /* renamed from: c */
    public static final String m235257c(String str, String str2, Status status) {
        int i = status.f389621g;
        return String.format("%s received (statusCode: %s): %s", new Object[]{str, (i < 0 || i > 50) ? ">50" : Integer.toString(i), str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0042 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m235258e() {
        /*
            r9 = this;
            r0 = 1
            com.google.android.gms.learning.e.a.k r1 = r9.f391580i     // Catch:{ ErrorStatusException -> 0x0091 }
            if (r1 == 0) goto L_0x000c
            com.google.common.base.cz r1 = r1.f391565a     // Catch:{ ErrorStatusException -> 0x0091 }
            long r1 = r1.mo26884a()     // Catch:{ ErrorStatusException -> 0x0091 }
            goto L_0x000e
        L_0x000c:
            r1 = 0
        L_0x000e:
            com.google.android.gms.learning.e.a.j r3 = r9.f391586o     // Catch:{ all -> 0x007f }
            r4 = 3
            if (r3 != 0) goto L_0x0043
            com.google.android.gms.learning.n r3 = r9.f391575d     // Catch:{ all -> 0x007f }
            com.google.common.o.b.a.h r5 = r9.f391578g     // Catch:{ all -> 0x007f }
            com.google.android.gms.learning.b.a r3 = r3.mo120053e(r4, r5)     // Catch:{ all -> 0x007f }
            r9.m235259f()     // Catch:{ all -> 0x0024 }
            if (r3 == 0) goto L_0x0043
            r3.close()     // Catch:{ all -> 0x007f }
            goto L_0x0043
        L_0x0024:
            r4 = move-exception
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ all -> 0x002b }
            goto L_0x0042
        L_0x002b:
            r3 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0042 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x0042 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r8, r5)     // Catch:{ Exception -> 0x0042 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0042 }
            r6[r7] = r3     // Catch:{ Exception -> 0x0042 }
            r5.invoke(r4, r6)     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            throw r4     // Catch:{ all -> 0x007f }
        L_0x0043:
            com.google.android.gms.learning.e.a.j r3 = r9.f391586o     // Catch:{ all -> 0x007f }
            com.google.android.gms.learning.e.a.g r3 = r3.mo120180a()     // Catch:{ all -> 0x007f }
            r9.f391587p = r3     // Catch:{ all -> 0x007f }
            com.google.android.gms.learning.e.a.k r3 = r9.f391580i     // Catch:{ ErrorStatusException -> 0x0091 }
            if (r3 == 0) goto L_0x005b
            java.util.concurrent.atomic.AtomicLong r5 = r3.f391568d     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.common.base.cz r3 = r3.f391565a     // Catch:{ ErrorStatusException -> 0x0091 }
            long r6 = r3.mo26884a()     // Catch:{ ErrorStatusException -> 0x0091 }
            long r6 = r6 - r1
            r5.addAndGet(r6)     // Catch:{ ErrorStatusException -> 0x0091 }
        L_0x005b:
            com.google.android.gms.learning.e.a.g r1 = r9.f391587p     // Catch:{ ErrorStatusException -> 0x0091 }
            if (r1 == 0) goto L_0x007b
            r9.f391591t = r4     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.android.gms.learning.e.a.k r1 = r9.f391580i     // Catch:{ ErrorStatusException -> 0x0091 }
            if (r1 == 0) goto L_0x007a
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f391566b     // Catch:{ ErrorStatusException -> 0x0091 }
            r1.incrementAndGet()     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.android.gms.learning.e.a.k r1 = r9.f391580i     // Catch:{ ErrorStatusException -> 0x0091 }
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f391567c     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.android.gms.learning.e.a.g r2 = r9.f391587p     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.protobuf.z r2 = r2.f391551a     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.protobuf.x r2 = (com.google.protobuf.C63086x) r2     // Catch:{ ErrorStatusException -> 0x0091 }
            byte[] r2 = r2.f170239a     // Catch:{ ErrorStatusException -> 0x0091 }
            int r2 = r2.length     // Catch:{ ErrorStatusException -> 0x0091 }
            r1.addAndGet(r2)     // Catch:{ ErrorStatusException -> 0x0091 }
        L_0x007a:
            return
        L_0x007b:
            r1 = 2
            r9.f391591t = r1     // Catch:{ ErrorStatusException -> 0x0091 }
            return
        L_0x007f:
            r3 = move-exception
            com.google.android.gms.learning.e.a.k r4 = r9.f391580i     // Catch:{ ErrorStatusException -> 0x0091 }
            if (r4 == 0) goto L_0x0090
            java.util.concurrent.atomic.AtomicLong r5 = r4.f391568d     // Catch:{ ErrorStatusException -> 0x0091 }
            com.google.common.base.cz r4 = r4.f391565a     // Catch:{ ErrorStatusException -> 0x0091 }
            long r6 = r4.mo26884a()     // Catch:{ ErrorStatusException -> 0x0091 }
            long r6 = r6 - r1
            r5.addAndGet(r6)     // Catch:{ ErrorStatusException -> 0x0091 }
        L_0x0090:
            throw r3     // Catch:{ ErrorStatusException -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            r9.f391585n = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10825e.p10826a.C144749l.m235258e():void");
    }

    /* renamed from: f */
    private final void m235259f() {
        int i;
        C58838bb.m90883r(this.f391586o == null);
        SettableFuture settableFuture = new SettableFuture();
        C144741d dVar = new C144741d(this, settableFuture);
        Intent intent = new Intent();
        String str = this.f391589r;
        if (str != null) {
            intent.setAction(String.format("com.google.android.gms.learning.%s.EXAMPLE_STORE", new Object[]{str})).setComponent(C144760a.f391608a);
        } else {
            intent.setAction("com.google.android.gms.learning.EXAMPLE_STORE_V2").setPackage(this.f391576e);
            intent.setData(new Uri.Builder().scheme("app").authority(this.f391576e).path(this.f391577f).build());
        }
        if (this.f391572a.bindService(intent, dVar, 1)) {
            this.f391575d.mo120058j(976, this.f391576e);
            try {
                C144648r rVar = (C144648r) settableFuture.get(this.f391579h, TimeUnit.SECONDS);
                SettableFuture settableFuture2 = new SettableFuture();
                this.f391581j.f391549a.set(settableFuture2);
                C144748k kVar = this.f391580i;
                i = 992;
                rVar.mo120100e(this.f391577f, this.f391582k.toByteArray(), this.f391588q.mo59174N(), new C144742e(this, kVar != null ? kVar.f391565a.mo26884a() : 0, settableFuture2), this.f391590s.toByteArray());
                C58835az azVar = (C58835az) settableFuture2.get(this.f391579h, TimeUnit.SECONDS);
                if (azVar.f156632b == null) {
                    this.f391586o = new C144747j(this, (C144639i) azVar.f156631a, dVar);
                } else {
                    mo120182d(991);
                    throw ErrorStatusException.m54793b(14, m235257c("onStartQueryFailure", this.f391577f, (Status) azVar.f156632b), new Object[0]);
                }
            } catch (ExecutionException e) {
                throw new C60916ec(e);
            } catch (TimeoutException unused) {
                mo120182d(996);
                throw ErrorStatusException.m54793b(14, "service connection timed out (%ss) for in-app proxy service", Long.valueOf(this.f391579h));
            } catch (CancellationException unused2) {
                throw ErrorStatusException.m54793b(14, "Service connection died for in-app proxy service", new Object[0]);
            } catch (RemoteException e2) {
                if (true != (e2 instanceof DeadObjectException)) {
                    i = 994;
                }
                mo120182d(i);
                throw ErrorStatusException.m54794c(14, e2, "startQuery failed", new Object[0]);
            } catch (ExecutionException e3) {
                throw new C60916ec(e3);
            } catch (TimeoutException unused3) {
                mo120182d(990);
                throw ErrorStatusException.m54793b(14, "startQuery timed out (%ss): %s", Long.valueOf(this.f391579h), this.f391577f);
            } catch (CancellationException unused4) {
                mo120182d(992);
                String str2 = this.f391577f;
                throw ErrorStatusException.m54793b(14, "startQuery failed due to dead process: " + str2, new Object[0]);
            } catch (Exception e4) {
                this.f391572a.unbindService(dVar);
                throw e4;
            }
        } else {
            mo120182d(997);
            if (this.f391573b.mo119987aU()) {
                this.f391572a.unbindService(dVar);
            }
            throw ErrorStatusException.m54793b(14, "bindService failed for example store service: ".concat(intent.toString()), new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r0 == 1) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.C63088z mo34872a() {
        /*
            r4 = this;
            boolean r0 = r4.f391584m
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "next() called after close()"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            boolean r0 = r4.f391585n
            r0 = r0 ^ r1
            java.lang.String r2 = "next() called after exception was thrown"
            com.google.common.base.C58838bb.m90884s(r0, r2)
            java.lang.String r0 = "Must not be called on the main application thread"
            com.google.android.gms.common.internal.C143919bh.m233965h(r0)
            int r0 = r4.f391591t
            java.lang.String r2 = "next() called but end of iterator reached"
            r3 = 2
            if (r0 == r1) goto L_0x0028
            if (r0 == r3) goto L_0x0022
            if (r0 != r1) goto L_0x002b
            goto L_0x0028
        L_0x0022:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r2)
            throw r0
        L_0x0028:
            r4.m235258e()
        L_0x002b:
            int r0 = r4.f391591t
            if (r0 == r3) goto L_0x004c
            com.google.android.gms.learning.e.a.g r0 = r4.f391587p
            com.google.protobuf.z r2 = r0.f391551a
            byte[] r0 = r0.f391552b
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)
            r4.f391588q = r0
            com.google.android.gms.learning.e.a.b r0 = r4.f391583l
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.learning.e.a.g r3 = r4.f391587p
            byte[] r3 = r3.f391552b
            r0.mo120176b(r3)
        L_0x0046:
            r0 = 0
            r4.f391587p = r0
            r4.f391591t = r1
            return r2
        L_0x004c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10825e.p10826a.C144749l.mo34872a():com.google.protobuf.z");
    }

    /* renamed from: b */
    public final boolean mo34873b() {
        C58838bb.m90884s(!this.f391584m, "hasNext() called after close()");
        C58838bb.m90884s(!this.f391585n, "hasNext() called after exception was thrown");
        C143919bh.m233965h("Must not be called on the main application thread");
        int i = this.f391591t;
        if (i == 1) {
            m235258e();
            if (this.f391591t == 3) {
                return true;
            }
            return false;
        } else if (i == 3) {
            return true;
        } else {
            return false;
        }
    }

    public final void close() {
        C143919bh.m233965h("Must not be called on the main application thread");
        if (!this.f391584m) {
            this.f391584m = true;
            C144747j jVar = this.f391586o;
            if (jVar != null) {
                jVar.close();
            }
            C144748k kVar = this.f391580i;
            if (kVar != null) {
                kVar.f391566b.get();
                this.f391580i.f391567c.get();
                TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391568d.get());
                TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391569e.get());
                TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391570f.get());
                TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391571g.get());
                this.f391575d.mo120052d(2, this.f391578g, (long) this.f391580i.f391566b.get());
                this.f391575d.mo120052d(3, this.f391578g, (long) this.f391580i.f391567c.get());
                this.f391575d.mo120052d(4, this.f391578g, TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391568d.get()));
                this.f391575d.mo120052d(5, this.f391578g, TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391569e.get()));
                this.f391575d.mo120052d(6, this.f391578g, TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391570f.get()));
                this.f391575d.mo120052d(7, this.f391578g, TimeUnit.NANOSECONDS.toMillis(this.f391580i.f391571g.get()));
                C144827n nVar = this.f391575d;
                C59628h hVar = this.f391578g;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                double d = (double) this.f391580i.f391568d.get();
                double d2 = (double) (((long) this.f391580i.f391566b.get()) + 1);
                Double.isNaN(d);
                Double.isNaN(d2);
                nVar.mo120052d(1, hVar, timeUnit.toMillis((long) (d / d2)));
            }
        }
    }

    /* renamed from: d */
    public final void mo120182d(int i) {
        this.f391575d.mo120058j(i, this.f391576e);
        if (this.f391573b.mo119975aI()) {
            this.f391575d.mo120052d(8, this.f391578g, (long) C29698h.m54786a(i));
        }
    }
}
