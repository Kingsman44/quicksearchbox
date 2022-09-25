package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89603aa;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.C124599a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ar */
/* compiled from: PG */
public final class C96532ar implements AutoCloseable, C89495cg, C89603aa, C124599a {

    /* renamed from: a */
    public static final C59071e f270064a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.ar");

    /* renamed from: b */
    static final long f270065b = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: c */
    public final C58495hd f270066c;

    /* renamed from: d */
    public C96535au f270067d;

    /* renamed from: e */
    public boolean f270068e;

    /* renamed from: f */
    private final C89492cd f270069f;

    /* renamed from: g */
    private final C22871g f270070g;

    /* renamed from: h */
    private final C89606ad f270071h;

    /* renamed from: i */
    private final C95355bf f270072i;

    /* renamed from: j */
    private C60870cx f270073j;

    public C96532ar(C68214a aVar, C22871g gVar, C89606ad adVar, C96565bx bxVar, C96561bt btVar, C96562bu buVar, C96578cj cjVar, C96569ca caVar, C96572cd cdVar, C96577ci ciVar, C96547bf bfVar, C96618u uVar, C96534at atVar, C95355bf bfVar2, C95850a aVar2) {
        C96535au auVar;
        C89606ad adVar2 = adVar;
        C89492cd cdVar2 = (C89492cd) aVar.mo27525b();
        this.f270069f = cdVar2;
        this.f270070g = gVar;
        this.f270071h = adVar2;
        this.f270072i = bfVar2;
        atVar.mo90203c(new C96531aq(this));
        String k = bfVar2.mo89270k();
        C59071e eVar = f270064a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaSession");
        ((C59052c) ((C59052c) b).mo56372aa(16592)).mo56389s("OTA Session created for %s", k);
        C124548d b2 = cdVar2.mo83401b(k);
        if (b2 != null) {
            uVar.mo90283g();
            if (!C124721s.UNKNOWN_DEVICE_TYPE.equals(b2.mo106514l())) {
                C124628au auVar2 = (C124628au) C124629av.f343812r.createBuilder(b2.mo106519q());
                C124625ar a = C124625ar.m204290a(((C124629av) auVar2.instance).f343821h);
                if (!(a == null ? C124625ar.UNKNOWN_INTERNAL_OTA_STATE : a).equals(C124625ar.UNKNOWN_INTERNAL_OTA_STATE) && ((C124629av) auVar2.instance).f343828o.size() == 0) {
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "OtaSession");
                    ((C59052c) ((C59052c) b3).mo56372aa(16591)).mo56386p("Found old OTA data; converting to TWS-supported");
                    C124649bo boVar = (C124649bo) C124650bp.f343890p.createBuilder();
                    boVar.copyOnWrite();
                    C124650bp bpVar = (C124650bp) boVar.instance;
                    bpVar.f343892a |= 1;
                    bpVar.f343893b = 0;
                    C124629av avVar = (C124629av) auVar2.instance;
                    if ((avVar.f343814a & 1) != 0) {
                        String str = avVar.f343815b;
                        boVar.copyOnWrite();
                        C124650bp bpVar2 = (C124650bp) boVar.instance;
                        str.getClass();
                        bpVar2.f343892a |= 2;
                        bpVar2.f343894c = str;
                    }
                    C124629av avVar2 = (C124629av) auVar2.instance;
                    if ((2 & avVar2.f343814a) != 0) {
                        String str2 = avVar2.f343816c;
                        boVar.copyOnWrite();
                        C124650bp bpVar3 = (C124650bp) boVar.instance;
                        str2.getClass();
                        bpVar3.f343892a |= 4;
                        bpVar3.f343895d = str2;
                    }
                    C124629av avVar3 = (C124629av) auVar2.instance;
                    if ((avVar3.f343814a & 512) != 0) {
                        String str3 = avVar3.f343822i;
                        boVar.copyOnWrite();
                        C124650bp bpVar4 = (C124650bp) boVar.instance;
                        str3.getClass();
                        bpVar4.f343892a |= 8;
                        bpVar4.f343896e = str3;
                    }
                    C124629av avVar4 = (C124629av) auVar2.instance;
                    if ((avVar4.f343814a & 1024) != 0) {
                        String str4 = avVar4.f343823j;
                        boVar.copyOnWrite();
                        C124650bp bpVar5 = (C124650bp) boVar.instance;
                        str4.getClass();
                        bpVar5.f343892a |= 16;
                        bpVar5.f343897f = str4;
                    }
                    C124629av avVar5 = (C124629av) auVar2.instance;
                    if ((avVar5.f343814a & 4096) != 0) {
                        long j = avVar5.f343825l;
                        boVar.copyOnWrite();
                        C124650bp bpVar6 = (C124650bp) boVar.instance;
                        bpVar6.f343892a |= 32;
                        bpVar6.f343898g = j;
                    }
                    C124629av avVar6 = (C124629av) auVar2.instance;
                    if ((avVar6.f343814a & 8192) != 0) {
                        long j2 = avVar6.f343826m;
                        boVar.copyOnWrite();
                        C124650bp bpVar7 = (C124650bp) boVar.instance;
                        bpVar7.f343892a |= 64;
                        bpVar7.f343899h = j2;
                    }
                    auVar2.copyOnWrite();
                    C124629av avVar7 = (C124629av) auVar2.instance;
                    C124650bp bpVar8 = (C124650bp) boVar.build();
                    bpVar8.getClass();
                    avVar7.mo106569a();
                    avVar7.f343828o.add(bpVar8);
                    cdVar2.getClass();
                    bfVar2.getClass();
                    cdVar2.mo83395ak(bfVar2.mo89270k(), (C124629av) auVar2.build());
                }
                C58490gz gzVar = new C58490gz(4);
                gzVar.mo55429h(C124625ar.UNKNOWN_INTERNAL_OTA_STATE, bxVar);
                gzVar.mo55429h(C124625ar.CHECKING_IF_OTA_NEEDED, btVar);
                gzVar.mo55429h(C124625ar.DOWNLOAD_SCHEDULED, buVar);
                gzVar.mo55429h(C124625ar.READY_TO_UPLOAD_TO_HEADSET, cjVar);
                gzVar.mo55429h(C124625ar.UPLOADING_DFU_TO_HEADSET, caVar);
                gzVar.mo55429h(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER, cdVar);
                gzVar.mo55429h(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED, ciVar);
                gzVar.mo55429h(C124625ar.NON_FORCE_APPLY_SENT, bfVar);
                C58495hd f = gzVar.mo55427f(false);
                this.f270066c = f;
                aVar2.f268408a.add(this);
                adVar2.mo83460f(this);
                C124625ar a2 = C124625ar.m204290a(((C124629av) auVar2.instance).f343821h);
                a2 = a2 == null ? C124625ar.UNKNOWN_INTERNAL_OTA_STATE : a2;
                f.getClass();
                if (!f.containsKey(a2)) {
                    auVar = (C96535au) f.get(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
                    auVar.getClass();
                } else {
                    int ordinal = a2.ordinal();
                    if (ordinal == 3) {
                        auVar = (C96535au) f.get(C124625ar.READY_TO_UPLOAD_TO_HEADSET);
                        auVar.getClass();
                    } else if (ordinal != 4) {
                        auVar = (C96535au) f.get(a2);
                    } else {
                        C59104x b4 = eVar.mo56224b();
                        b4.mo56378ag(C58975e.f156826a, "OtaSession");
                        ((C59052c) ((C59052c) b4).mo56372aa(16590)).mo56386p("Startup: session in 'ready to apply' state. Verify that device in expected state");
                        auVar = (C96535au) f.get(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED);
                        auVar.getClass();
                    }
                }
                this.f270067d = auVar;
                auVar.mo90228e((C124629av) auVar2.build(), b2);
                cdVar2.mo83360B(C58528ij.m90015O(27, 5, 6, 4, 1, 12, new Integer[0]), this);
                mo90218f(0);
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "%s (%s) does not support OTA", new Object[]{k, b2.mo106514l().name()}));
        }
        throw new IllegalArgumentException("No device info for device id: ".concat(String.valueOf(k)));
    }

    /* renamed from: j */
    private final synchronized void m159929j() {
        if (this.f270067d.mo90224a().equals(C124625ar.UNKNOWN_INTERNAL_OTA_STATE)) {
            this.f270067d.mo90229f();
            return;
        }
        int a = C124640bf.m204304a(this.f270067d.mo90225b().f343818e);
        if (a == 0) {
            a = 1;
        }
        C22869e alVar = a == 2 ? new C96526al(this) : new C96528an(this);
        C59104x c = f270064a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSession");
        ((C59052c) ((C59052c) c).mo56372aa(16593)).mo56389s("%s OTA started; need to abort and restart", a != 2 ? "Regular" : "0-day");
        C90875ai.m148465b(alVar, this.f270067d.mo90226c(), this.f270070g, "restart ota").mo85223a(new C96529ao(alVar));
    }

    /* renamed from: a */
    public final synchronized void mo90213a() {
        this.f270067d.mo90226c();
    }

    /* renamed from: b */
    public final synchronized void mo83451b() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f270067d.mo90225b().f343830q.equals(this.f270071h.mo83457c())) {
            m159929j();
        }
    }

    /* renamed from: c */
    public final synchronized void mo90214c() {
        this.f270067d.mo90227d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void close() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.f270068e = r0     // Catch:{ all -> 0x0022 }
            com.google.android.apps.gsa.shared.bisto.ad r0 = r2.f270071h     // Catch:{ all -> 0x0022 }
            r0.mo83472r(r2)     // Catch:{ all -> 0x0022 }
            com.google.android.apps.gsa.shared.bisto.a.cd r0 = r2.f270069f     // Catch:{ all -> 0x0022 }
            r0.mo83379U(r2)     // Catch:{ all -> 0x0022 }
            com.google.common.util.concurrent.cx r0 = r2.f270073j     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0020
            com.google.common.util.concurrent.cx r0 = r2.f270073j     // Catch:{ all -> 0x0022 }
            r1 = 0
            r0.cancel(r1)     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)
            return
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96532ar.close():void");
    }

    /* renamed from: d */
    public final synchronized void mo90216d() {
        this.f270067d.mo90229f();
    }

    /* renamed from: e */
    public final synchronized void mo90217e(long j) {
        this.f270067d.mo90230g(j);
    }

    /* renamed from: f */
    public final synchronized void mo90218f(long j) {
        C60870cx cxVar = this.f270073j;
        if (cxVar != null && !cxVar.isDone()) {
            this.f270073j.cancel(false);
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f270073j = this.f270070g.mo28208h("OtaSessionHeartbeatCheck", j, new C96530ap(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return;
     */
    /* renamed from: fW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17874fW(java.lang.String r1, java.util.Set r2, long r3, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d r5) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r3 = r0.f270072i     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = r3.mo89270k()     // Catch:{ all -> 0x0033 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)
            return
        L_0x000f:
            com.google.android.apps.gsa.staticplugins.bisto.w.au r1 = r0.f270067d     // Catch:{ all -> 0x0033 }
            r1.mo90231h(r2, r5)     // Catch:{ all -> 0x0033 }
            r1 = 27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0031
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r1 = r5.mo106520r()     // Catch:{ all -> 0x0033 }
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED     // Catch:{ all -> 0x0033 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0031
            r0.m159929j()     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)
            return
        L_0x0031:
            monitor-exit(r0)
            return
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96532ar.mo17874fW(java.lang.String, java.util.Set, long, com.google.android.apps.search.assistant.surfaces.bisto.c.b.d):void");
    }

    /* renamed from: g */
    public final synchronized void mo90219g() {
        C59104x c = f270064a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSession");
        ((C59052c) ((C59052c) c).mo56372aa(16596)).mo56386p("#roleChangeAbort()");
        if (this.f270067d.mo90224a().equals(C124625ar.READY_TO_UPLOAD_TO_HEADSET) || this.f270067d.mo90224a().equals(C124625ar.UPLOADING_DFU_TO_HEADSET)) {
            this.f270067d.mo90226c();
        }
    }

    /* renamed from: h */
    public final synchronized void mo90220h(boolean z, boolean z2, boolean z3, Collection collection) {
        this.f270067d.mo90232i(z, z2, z3, collection);
    }

    /* renamed from: i */
    public final synchronized void mo90221i() {
        if (this.f270067d.mo90224a().equals(C124625ar.UNKNOWN_INTERNAL_OTA_STATE)) {
            this.f270067d.mo90233j();
            return;
        }
        int a = C124640bf.m204304a(this.f270067d.mo90225b().f343818e);
        if (a != 0) {
            if (a == 2) {
                C59104x b = f270064a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OtaSession");
                ((C59052c) ((C59052c) b).mo56372aa(16598)).mo56386p("Zero day OTA already started");
                return;
            }
        }
        C59104x c = f270064a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSession");
        ((C59052c) ((C59052c) c).mo56372aa(16597)).mo56386p("Regular OTA started; need to abort and start 0-day.");
        C90875ai.m148465b(new C96526al(this), this.f270067d.mo90226c(), this.f270070g, "Start 0-day").mo85223a(new C96527am(this));
    }
}
