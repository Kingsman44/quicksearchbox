package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95353bd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60282mw;
import com.google.common.p4552o.C60284my;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ct */
/* compiled from: PG */
abstract class C96588ct {

    /* renamed from: f */
    public static final C59071e f270193f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.ct");

    /* renamed from: g */
    static final long f270194g = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: h */
    static final long f270195h = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: u */
    public static final int f270196u = 3;

    /* renamed from: i */
    final C22871g f270197i;

    /* renamed from: j */
    final C22871g f270198j;

    /* renamed from: k */
    final C96579ck f270199k;

    /* renamed from: l */
    final C21370a f270200l;

    /* renamed from: m */
    public final C124629av f270201m;

    /* renamed from: n */
    public final C95355bf f270202n;

    /* renamed from: o */
    public final C124721s f270203o;

    /* renamed from: p */
    public final SettableFuture f270204p;

    /* renamed from: q */
    boolean f270205q;

    /* renamed from: r */
    public C96586cr f270206r;

    /* renamed from: s */
    public final C95352bc f270207s = new C96582cn(this);

    /* renamed from: t */
    public final C95353bd f270208t = new C96583co(this);

    public C96588ct(C22871g gVar, C22871g gVar2, C96579ck ckVar, C21370a aVar, C95355bf bfVar, C124721s sVar, C124629av avVar) {
        this.f270197i = gVar;
        this.f270198j = gVar2;
        this.f270199k = ckVar;
        this.f270200l = aVar;
        this.f270202n = bfVar;
        this.f270203o = sVar;
        this.f270201m = avVar;
        this.f270204p = new SettableFuture();
    }

    /* renamed from: a */
    public abstract String mo90248a();

    /* renamed from: b */
    public abstract void mo90249b();

    /* renamed from: d */
    public final synchronized C60870cx mo90256d() {
        return this.f270204p;
    }

    /* renamed from: e */
    public final synchronized C60870cx mo90257e() {
        if (this.f270205q) {
            C59104x d = f270193f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OtaTask");
            C0118a.m109q(d, "Attempted to start already started task", 16701, mo90248a(), C58975e.f156826a);
            return this.f270204p;
        }
        C59071e eVar = f270193f;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaTask");
        C0118a.m109q(b, "Starting", 16698, mo90248a(), C58975e.f156826a);
        this.f270198j.mo28212l("add-callback", new C96581cm(this));
        if (!this.f270202n.mo89278w()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OtaTask");
            C0118a.m109q(b2, "Aborting current task due to connection loss", 16700, mo90248a(), C58975e.f156826a);
            mo90262j(new C96587cs("Task aborted due to connection loss"));
            return this.f270204p;
        }
        mo90249b();
        this.f270205q = true;
        return this.f270204p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo90258f() {
        return this.f270202n.mo89270k();
    }

    /* renamed from: g */
    public final synchronized void mo90259g() {
        mo90260h();
        if (!this.f270204p.isDone()) {
            C59104x b = f270193f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaTask");
            C0118a.m109q(b, "Canceling", 16703, mo90248a(), C58975e.f156826a);
            this.f270204p.cancel(false);
            return;
        }
        C59104x d = f270193f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OtaTask");
        C0118a.m109q(d, "Attempted to cancel already completed task", 16702, mo90248a(), C58975e.f156826a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo90260h() {
        this.f270198j.mo28212l("remove-callback", new C96580cl(this));
        C96586cr crVar = this.f270206r;
        if (crVar != null) {
            crVar.mo90254c();
            this.f270206r = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo90261i(Object obj) {
        mo90260h();
        if (!this.f270204p.isDone()) {
            C59104x b = f270193f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaTask");
            C0118a.m109q(b, "Done", 16705, mo90248a(), C58975e.f156826a);
            this.f270204p.mo57356n(obj);
            return;
        }
        C59104x d = f270193f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OtaTask");
        C0118a.m109q(d, "Attempted to complete already completed task", 16704, mo90248a(), C58975e.f156826a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized void mo90262j(Throwable th) {
        mo90260h();
        if (!this.f270204p.isDone()) {
            C59104x b = f270193f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaTask");
            C59052c cVar = (C59052c) b;
            cVar.mo56378ag(C58975e.f156826a, mo90248a());
            ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(16707)).mo56386p("Failed OTA Task");
            th.getMessage();
            mo90265m();
            this.f270204p.mo57357o(th);
            return;
        }
        C59104x d = f270193f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OtaTask");
        C0118a.m109q(d, "Attempted to fail already completed task", 16706, mo90248a(), C58975e.f156826a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized boolean mo90263k() {
        return this.f270204p.isDone();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        return true;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo90264l(com.google.protobuf.MessageLite r5, com.google.android.p10712d.C142455fz r6, com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96586cr r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.apps.gsa.staticplugins.bisto.w.cr r0 = r4.f270206r     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x000b
            r0.mo90254c()     // Catch:{ all -> 0x0070 }
            r0 = 0
            r4.f270206r = r0     // Catch:{ all -> 0x0070 }
        L_0x000b:
            com.google.android.d.fz r0 = com.google.android.p10712d.C142455fz.OTA_DATA     // Catch:{ all -> 0x0070 }
            if (r6 == r0) goto L_0x0011
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0070 }
        L_0x0011:
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r0 = r4.f270202n     // Catch:{ all -> 0x0070 }
            int r1 = f270196u     // Catch:{ all -> 0x0070 }
            int r2 = r6.f386567k     // Catch:{ all -> 0x0070 }
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x0070 }
            boolean r5 = r0.mo89258F(r1, r2, r5)     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x003e
            com.google.common.f.e r5 = f270193f     // Catch:{ all -> 0x0070 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0070 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = "OtaTask"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = "Send failed"
            java.lang.String r7 = r4.mo90248a()     // Catch:{ all -> 0x0070 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0070 }
            r1 = 16709(0x4145, float:2.3414E-41)
            android.databinding.C0118a.m109q(r5, r6, r1, r7, r0)     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x003e:
            com.google.android.d.fz r5 = com.google.android.p10712d.C142455fz.OTA_DATA     // Catch:{ all -> 0x0070 }
            if (r6 == r5) goto L_0x0044
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0070 }
        L_0x0044:
            r4.f270206r = r7     // Catch:{ all -> 0x0070 }
            if (r7 == 0) goto L_0x006d
            com.google.android.apps.gsa.staticplugins.bisto.w.ct r5 = r7.f270192c     // Catch:{ all -> 0x0070 }
            monitor-enter(r5)     // Catch:{ all -> 0x0070 }
            r7.mo90254c()     // Catch:{ all -> 0x006a }
            com.google.android.d.fz r0 = com.google.android.p10712d.C142455fz.OTA_BEGIN     // Catch:{ all -> 0x006a }
            if (r6 != r0) goto L_0x0055
            long r0 = f270194g     // Catch:{ all -> 0x006a }
            goto L_0x0057
        L_0x0055:
            long r0 = f270195h     // Catch:{ all -> 0x006a }
        L_0x0057:
            com.google.android.apps.gsa.staticplugins.bisto.w.ct r6 = r7.f270192c     // Catch:{ all -> 0x006a }
            com.google.android.libraries.gsa.k.g r6 = r6.f270197i     // Catch:{ all -> 0x006a }
            com.google.android.apps.gsa.staticplugins.bisto.w.cq r2 = new com.google.android.apps.gsa.staticplugins.bisto.w.cq     // Catch:{ all -> 0x006a }
            r2.<init>(r7)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "timeout"
            com.google.common.util.concurrent.cx r6 = r6.mo28208h(r3, r0, r2)     // Catch:{ all -> 0x006a }
            r7.f270191b = r6     // Catch:{ all -> 0x006a }
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x006d:
            monitor-exit(r4)
            r5 = 1
            return r5
        L_0x0070:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96588ct.mo90264l(com.google.protobuf.MessageLite, com.google.android.d.fz, com.google.android.apps.gsa.staticplugins.bisto.w.cr):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo90265m() {
        int i;
        String str = null;
        String str2 = this.f270201m.f343828o.size() > 0 ? ((C124650bp) this.f270201m.f343828o.get(0)).f343894c : null;
        C96579ck ckVar = this.f270199k;
        String k = this.f270202n.mo89270k();
        C124625ar a = C124625ar.m204290a(this.f270201m.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        C58976aa aaVar = C58975e.f156826a;
        a.name();
        a.name();
        C124548d b = ((C89492cd) ckVar.f270184a.mo27525b()).mo83401b(k);
        if (b != null) {
            str = b.mo106472M();
        }
        C60282mw mwVar = (C60282mw) C60284my.f163089f.createBuilder();
        if (C124625ar.DOWNLOAD_SCHEDULED.equals(a)) {
            i = 5;
        } else {
            i = C124625ar.UPLOADING_DFU_TO_HEADSET.equals(a) ? 6 : 1;
        }
        mwVar.copyOnWrite();
        C60284my myVar = (C60284my) mwVar.instance;
        myVar.f163092b = i - 1;
        myVar.f163091a |= 1;
        if (!C58837ba.m90859h(str)) {
            mwVar.copyOnWrite();
            C60284my myVar2 = (C60284my) mwVar.instance;
            str.getClass();
            myVar2.f163091a |= 16;
            myVar2.f163093c = str;
        }
        if (!C58837ba.m90859h(str2)) {
            mwVar.copyOnWrite();
            C60284my myVar3 = (C60284my) mwVar.instance;
            str2.getClass();
            myVar3.f163091a |= 32;
            myVar3.f163094d = str2;
        }
        int i2 = a.f343803i;
        mwVar.copyOnWrite();
        C60284my myVar4 = (C60284my) mwVar.instance;
        myVar4.f163091a |= 64;
        myVar4.f163095e = i2;
        C95307m mVar = ckVar.f270185b;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60284my myVar5 = (C60284my) mwVar.build();
        myVar5.getClass();
        nmVar.f163149c = myVar5;
        nmVar.f163147a |= 32;
        mVar.mo83545c(nkVar);
    }
}
