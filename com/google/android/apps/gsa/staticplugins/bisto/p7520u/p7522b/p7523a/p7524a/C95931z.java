package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95381ce;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95392cp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95393cq;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95430e;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142321b;
import com.google.android.p10712d.C142413ek;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.z */
/* compiled from: PG */
public final class C95931z extends C95914i {

    /* renamed from: c */
    public static final C59071e f268603c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.z");

    /* renamed from: d */
    static final Duration f268604d = Duration.ofSeconds(5);

    /* renamed from: e */
    public final C95355bf f268605e;

    /* renamed from: f */
    public final C95307m f268606f;

    /* renamed from: g */
    public final C89492cd f268607g;

    /* renamed from: h */
    private final C96023bs f268608h;

    /* renamed from: i */
    private final C95357bh f268609i;

    /* renamed from: j */
    private final C68214a f268610j;

    /* renamed from: k */
    private final C68214a f268611k;

    /* renamed from: l */
    private final C68214a f268612l;

    /* renamed from: m */
    private final C21370a f268613m;

    /* renamed from: n */
    private SettableFuture f268614n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95931z(C95346ax axVar, C96023bs bsVar, C95357bh bhVar, C89492cd cdVar, C95307m mVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C21370a aVar4, C95848i iVar, C95850a aVar5) {
        super(axVar, bsVar, "InitState", cdVar, iVar, aVar5);
        this.f268608h = bsVar;
        this.f268605e = axVar;
        this.f268609i = bhVar;
        this.f268606f = mVar;
        this.f268610j = aVar;
        this.f268611k = aVar2;
        this.f268612l = aVar3;
        this.f268607g = cdVar;
        this.f268613m = aVar4;
    }

    /* renamed from: b */
    public final C124548d mo89856b() {
        return this.f268607g.mo83401b(this.f268605e.mo89270k());
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268608h.mo89831a();
        this.f268607g.mo83363E(this.f268605e.mo89270k());
        this.f268607g.mo83393ai(this.f268605e.mo89270k(), C142413ek.UNKNOWN);
        this.f268607g.mo83362D(this.f268605e.mo89270k());
        this.f268609i.mo89291d(this.f268605e);
        this.f268609i.mo89289b(this.f268605e);
        C95355bf bfVar = this.f268605e;
        C95392cp f = C95393cq.m157754f();
        C95430e eVar = (C95430e) f;
        eVar.f267019a = "getDeviceCapabilitiesWithTimeout";
        eVar.f267020b = 4;
        f.mo89329c(1);
        f.mo89328b(C95381ce.m157721b(this.f268613m).toByteArray());
        Duration duration = f268604d;
        f.mo89330d(duration);
        C60870cx h = bfVar.mo89267h(f.mo89327a(), 2, new C95928w(this));
        C95355bf bfVar2 = this.f268605e;
        C95392cp f2 = C95393cq.m157754f();
        C95430e eVar2 = (C95430e) f2;
        eVar2.f267019a = "getDeviceCapabilitiesWithTimeout";
        eVar2.f267020b = 10;
        f2.mo89329c(3);
        f2.mo89328b(C142321b.f386110a.toByteArray());
        f2.mo89330d(duration);
        C60870cx h2 = bfVar2.mo89267h(f2.mo89327a(), 2, C95929x.f268598a);
        SettableFuture settableFuture = new SettableFuture();
        this.f268614n = settableFuture;
        C60856cj.m92893b(h, h2).mo57336c(new C95930y(this, settableFuture, h, h2), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        SettableFuture settableFuture = this.f268614n;
        if (settableFuture != null && !settableFuture.isDone()) {
            this.f268614n.cancel(false);
        }
        this.f268614n = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89847j(java.lang.String r8, android.content.Intent r9) {
        /*
            r7 = this;
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r9 = r7.mo89856b()
            r0 = 0
            if (r9 != 0) goto L_0x001f
            com.google.common.f.e r9 = f268603c
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "InitState"
            r9.mo56378ag(r1, r2)
            java.lang.String r1 = "Null BistoDeviceInfo"
            r2 = 15868(0x3dfc, float:2.2236E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r1)
            super.mo89847j(r8, r0)
            return
        L_0x001f:
            java.lang.String r1 = r9.mo106476Q()
            int r2 = r8.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1961848181: goto L_0x0057;
                case -1273107797: goto L_0x004d;
                case -486149104: goto L_0x0043;
                case 378311274: goto L_0x0039;
                case 1739145180: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0061
        L_0x002f:
            java.lang.String r2 = "ClassicOobeState"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0061
            r2 = 4
            goto L_0x0062
        L_0x0039:
            java.lang.String r2 = "HotwordInitState"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0061
            r2 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r2 = "CarAccessoryOobeState"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x004d:
            java.lang.String r2 = "ReadyNoAudClassicState"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0061
            r2 = 2
            goto L_0x0062
        L_0x0057:
            java.lang.String r2 = "DisconnectingState"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0061
            r2 = 0
            goto L_0x0062
        L_0x0061:
            r2 = -1
        L_0x0062:
            if (r2 == 0) goto L_0x00e6
            if (r2 == r6) goto L_0x00d4
            if (r2 == r5) goto L_0x00c2
            if (r2 == r4) goto L_0x00c2
            if (r2 == r3) goto L_0x006e
            goto L_0x0103
        L_0x006e:
            dagger.a r9 = r7.f268610j
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.v.d r9 = (com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r9
            r9.mo90198a()
            dagger.a r9 = r7.f268612l
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.q.i r9 = (com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i) r9
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = r9.f268402d
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r2 = r9.f268400b
            java.lang.String r2 = r2.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r1.mo83401b(r2)
            if (r1 != 0) goto L_0x00b1
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i.f268399a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "HotwordActivator"
            r9.mo56378ag(r1, r2)
            r1 = 15481(0x3c79, float:2.1694E-41)
            java.lang.String r2 = "null deviceInfo"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r2)
            java.util.concurrent.ExecutionException r9 = new java.util.concurrent.ExecutionException
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            r9.<init>(r1)
            com.google.common.util.concurrent.C60856cj.m92899h(r9)
            goto L_0x0103
        L_0x00b1:
            com.google.android.libraries.gsa.k.g r2 = r9.f268403e
            com.google.common.util.concurrent.cx r3 = r9.mo89817b(r1)
            com.google.android.apps.gsa.staticplugins.bisto.q.b r4 = new com.google.android.apps.gsa.staticplugins.bisto.q.b
            r4.<init>(r9, r1)
            java.lang.String r9 = "update-target-hotword"
            r2.mo28209i(r3, r9, r4)
            goto L_0x0103
        L_0x00c2:
            dagger.a r9 = r7.f268611k
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.m.l r9 = (com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l) r9
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r1 = r7.f268605e
            java.lang.String r1 = r1.mo89270k()
            r9.mo89391a(r1)
            goto L_0x0103
        L_0x00d4:
            dagger.a r2 = r7.f268610j
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.v.d r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r2
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r3 = r7.f268605e
            java.lang.String r3 = r3.mo89270k()
            r2.mo90199b(r3, r9, r1)
            goto L_0x0103
        L_0x00e6:
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r2 = r9.mo106520r()
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r3 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0103
            dagger.a r2 = r7.f268610j
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.v.d r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r2
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r3 = r7.f268605e
            java.lang.String r3 = r3.mo89270k()
            r2.mo90199b(r3, r9, r1)
        L_0x0103:
            super.mo89847j(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95931z.mo89847j(java.lang.String, android.content.Intent):void");
    }

    /* renamed from: k */
    public final void mo89853k() {
    }
}
