package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.notifications.C29992g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.p2268e.p2283h.C29897a;
import com.google.android.libraries.notifications.p2292g.C30005m;
import com.google.android.libraries.notifications.p2292g.C30006n;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.p2298k.C30045e;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30126e;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import dagger.C68214a;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.h.a.m */
/* compiled from: PG */
public final class C29915m implements C29897a {

    /* renamed from: a */
    private final Context f81026a;

    /* renamed from: b */
    private final C30045e f81027b;

    /* renamed from: c */
    private final C68214a f81028c;

    /* renamed from: d */
    private final C68214a f81029d;

    /* renamed from: e */
    private final C29826q f81030e;

    /* renamed from: f */
    private final C68214a f81031f;

    /* renamed from: g */
    private final C68214a f81032g;

    /* renamed from: h */
    private final C68214a f81033h;

    /* renamed from: i */
    private final C68214a f81034i;

    /* renamed from: j */
    private final C68214a f81035j;

    /* renamed from: k */
    private final C68214a f81036k;

    /* renamed from: l */
    private final C68214a f81037l;

    /* renamed from: m */
    private final C68214a f81038m;

    /* renamed from: n */
    private final C68214a f81039n;

    /* renamed from: o */
    private final C68214a f81040o;

    static {
        Charset.forName("UTF-8");
    }

    public C29915m(Context context, C30045e eVar, C68214a aVar, C68214a aVar2, C29826q qVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12) {
        this.f81026a = context;
        this.f81027b = eVar;
        this.f81028c = aVar;
        this.f81029d = aVar2;
        this.f81030e = qVar;
        this.f81031f = aVar3;
        this.f81032g = aVar4;
        this.f81033h = aVar5;
        this.f81034i = aVar6;
        this.f81035j = aVar7;
        this.f81036k = aVar8;
        this.f81037l = aVar9;
        this.f81038m = aVar10;
        this.f81039n = aVar11;
        this.f81040o = aVar12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (((java.lang.Boolean) com.google.common.util.concurrent.C60861co.m92916b(com.google.common.util.concurrent.C60860cn.f164951a, ((com.google.android.libraries.notifications.platform.p2318f.p2322b.C30125d) r1.f81028c.mo27525b()).mo35522a(r2, com.google.android.libraries.notifications.platform.registration.C30153c.m56013a(r16.mo35009h()), r9, r0), java.util.concurrent.ExecutionException.class)).booleanValue() == false) goto L_0x004a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.notifications.C29992g m55406f(com.google.android.libraries.notifications.data.C29820k r16, int r17, dagger.C68214a r18, dagger.C68214a r19, android.os.Bundle r20, java.lang.Long r21) {
        /*
            r15 = this;
            r1 = r15
            r9 = r20
            r0 = r21
            boolean r2 = p5304e.p5305a.p5306a.p5409o.p5410a.C68940d.m99986c()
            java.lang.String r10 = "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread"
            java.lang.String r11 = "ChimeScheduledRpcHelperImpl"
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r18.mo27525b()
            com.google.android.libraries.notifications.k.a.c r2 = (com.google.android.libraries.notifications.p2298k.p2299a.C30040c) r2
            dagger.a r3 = r1.f81028c     // Catch:{ ExecutionException -> 0x003e }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ ExecutionException -> 0x003e }
            com.google.android.libraries.notifications.platform.f.b.d r3 = (com.google.android.libraries.notifications.platform.p2318f.p2322b.C30125d) r3     // Catch:{ ExecutionException -> 0x003e }
            java.lang.String r4 = r16.mo35009h()     // Catch:{ ExecutionException -> 0x003e }
            com.google.android.libraries.notifications.platform.registration.AccountRepresentation r4 = com.google.android.libraries.notifications.platform.registration.C30153c.m56013a(r4)     // Catch:{ ExecutionException -> 0x003e }
            com.google.common.util.concurrent.cx r0 = r3.mo35522a(r2, r4, r9, r0)     // Catch:{ ExecutionException -> 0x003e }
            java.lang.Class<java.util.concurrent.ExecutionException> r3 = java.util.concurrent.ExecutionException.class
            int r4 = com.google.common.util.concurrent.C60861co.f164952a     // Catch:{ ExecutionException -> 0x003e }
            com.google.common.util.concurrent.cl r4 = com.google.common.util.concurrent.C60860cn.f164951a     // Catch:{ ExecutionException -> 0x003e }
            java.lang.Object r0 = com.google.common.util.concurrent.C60861co.m92916b(r4, r0, r3)     // Catch:{ ExecutionException -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ExecutionException -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x003e }
            if (r0 != 0) goto L_0x0088
            goto L_0x004a
        L_0x003e:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.String r4 = r2.mo35377e()
            r3[r12] = r4
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r11, r0, r10, r3)
        L_0x004a:
            dagger.a r0 = r1.f81029d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.notifications.e.h.a.x r0 = (com.google.android.libraries.notifications.p2268e.p2283h.p2284a.C29926x) r0
            java.lang.String r3 = "job"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            kotlinx.coroutines.aw r0 = r0.f81053a
            com.google.android.libraries.notifications.e.h.a.w r3 = new com.google.android.libraries.notifications.e.h.a.w
            r4 = 0
            r3.<init>(r2, r9, r4)
            r2 = 3
            com.google.common.util.concurrent.cx r0 = kotlinx.coroutines.p5578d.C71663i.m104692e(r0, r4, r3, r2)
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)
            com.google.android.libraries.notifications.platform.f.b.a r0 = (com.google.android.libraries.notifications.platform.p2318f.p2322b.C30116a) r0
            com.google.android.libraries.notifications.platform.f.b.e r2 = com.google.android.libraries.notifications.platform.p2318f.p2322b.C30126e.SUCCESS
            com.google.android.libraries.notifications.platform.f.b.e r2 = r0.f81466b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0088
            if (r2 == r13) goto L_0x0081
            r3 = 2
            if (r2 == r3) goto L_0x007a
            goto L_0x0088
        L_0x007a:
            java.lang.Throwable r0 = r0.f81467c
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.m55627c(r0)
            goto L_0x008a
        L_0x0081:
            java.lang.Throwable r0 = r0.f81467c
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.m55628d(r0)
            goto L_0x008a
        L_0x0088:
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.f81202a
        L_0x008a:
            return r0
        L_0x008b:
            java.lang.Object r2 = r19.mo27525b()
            r14 = r2
            com.google.android.libraries.notifications.k.d r14 = (com.google.android.libraries.notifications.p2298k.C30044d) r14
            if (r0 != 0) goto L_0x009e
            com.google.android.libraries.notifications.k.e r0 = r1.f81027b     // Catch:{ a -> 0x00b5 }
            r3 = r16
            r4 = r17
            r0.mo35370b(r3, r4, r14, r9)     // Catch:{ a -> 0x00b5 }
            goto L_0x00b2
        L_0x009e:
            r3 = r16
            r4 = r17
            com.google.android.libraries.notifications.k.e r2 = r1.f81027b     // Catch:{ a -> 0x00b5 }
            long r7 = r21.longValue()     // Catch:{ a -> 0x00b5 }
            r3 = r16
            r4 = r17
            r5 = r14
            r6 = r20
            r2.mo35371c(r3, r4, r5, r6, r7)     // Catch:{ a -> 0x00b5 }
        L_0x00b2:
            com.google.android.libraries.notifications.g r0 = com.google.android.libraries.notifications.C29992g.f81202a
            return r0
        L_0x00b5:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = r14.mo35170e()
            r2[r12] = r3
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55795g(r11, r0, r10, r2)
            com.google.android.libraries.notifications.g r0 = r14.mo35167b(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2283h.p2284a.C29915m.m55406f(com.google.android.libraries.notifications.data.k, int, dagger.a, dagger.a, android.os.Bundle, java.lang.Long):com.google.android.libraries.notifications.g");
    }

    /* renamed from: a */
    public final C29992g mo35206a(C29820k kVar, C55540at atVar) {
        boolean z = kVar != null;
        C19559g.m37303b();
        C58838bb.m90868c(z);
        String h = kVar.mo35009h();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", atVar.f146563m);
        return m55406f(kVar, 1, this.f81039n, this.f81034i, bundle, (Long) null);
    }

    /* renamed from: b */
    public final void mo35207b(C29820k kVar, long j, C55522ab abVar) {
        boolean z = kVar != null;
        C19559g.m37303b();
        C58838bb.m90868c(z);
        String h = kVar.mo35009h();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", abVar.f146514k);
        if (!C30140a.m55989b(this.f81026a)) {
            C30044d dVar = (C30044d) this.f81032g.mo27525b();
            C30058b.m55794f("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", dVar.mo35170e());
            dVar.mo35167b(bundle);
            return;
        }
        m55406f(kVar, 2, this.f81037l, this.f81032g, bundle, (Long) null);
    }

    /* renamed from: c */
    public final void mo35208c(C29820k kVar, C55564bq bqVar, String str, int i, List list) {
        boolean z = kVar != null;
        C19559g.m37303b();
        C58838bb.m90868c(z);
        C58838bb.m90868c(!list.isEmpty());
        String h = kVar.mo35009h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55661cq cqVar = (C55661cq) it.next();
            C30005m mVar = (C30005m) C30006n.f81219f.createBuilder();
            mVar.copyOnWrite();
            C30006n nVar = (C30006n) mVar.instance;
            cqVar.getClass();
            nVar.mo35309a();
            nVar.f81222b.add(cqVar);
            mVar.copyOnWrite();
            C30006n nVar2 = (C30006n) mVar.instance;
            bqVar.getClass();
            nVar2.f81223c = bqVar;
            nVar2.f81221a |= 1;
            mVar.copyOnWrite();
            C30006n nVar3 = (C30006n) mVar.instance;
            str.getClass();
            int i2 = 4;
            nVar3.f81221a |= 4;
            nVar3.f81225e = str;
            int i3 = i - 1;
            C30126e eVar = C30126e.SUCCESS;
            if (i != 0) {
                if (i3 == 0) {
                    i2 = 2;
                } else if (i3 == 1) {
                    i2 = 3;
                } else if (i3 != 2) {
                    i2 = 1;
                }
                mVar.copyOnWrite();
                C30006n nVar4 = (C30006n) mVar.instance;
                nVar4.f81224d = i2 - 1;
                nVar4.f81221a = 2 | nVar4.f81221a;
                this.f81030e.mo35096a(h, 100, ((C30006n) mVar.build()).toByteArray());
            } else {
                throw null;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        m55406f(kVar, 100, this.f81040o, this.f81035j, bundle, 5000L);
    }

    /* renamed from: d */
    public final void mo35209d(C29820k kVar, C55522ab abVar) {
        boolean z = kVar != null;
        C19559g.m37303b();
        C58838bb.m90868c(z);
        String h = kVar.mo35009h();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", abVar.f146514k);
        if (!C30140a.m55989b(this.f81026a)) {
            C30044d dVar = (C30044d) this.f81031f.mo27525b();
            C30058b.m55794f("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", dVar.mo35170e());
            dVar.mo35167b(bundle);
            return;
        }
        m55406f(kVar, 2, this.f81036k, this.f81031f, bundle, (Long) null);
    }

    /* renamed from: e */
    public final void mo35210e(C29820k kVar) {
        boolean z = kVar != null;
        C19559g.m37303b();
        C58838bb.m90868c(z);
        String h = kVar.mo35009h();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        m55406f(kVar, 1, this.f81038m, this.f81033h, bundle, (Long) null);
    }
}
