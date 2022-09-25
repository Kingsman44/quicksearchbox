package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142467gk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.HashSet;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ak */
/* compiled from: PG */
public final class C96525ak implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f270048a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.ak");

    /* renamed from: b */
    public final C96595d f270049b;

    /* renamed from: c */
    public final C96609l f270050c;

    /* renamed from: d */
    public SettableFuture f270051d;

    /* renamed from: e */
    public SettableFuture f270052e;

    /* renamed from: f */
    public final C96596da f270053f;

    /* renamed from: g */
    private final C96605h f270054g;

    /* renamed from: h */
    private final C96601df f270055h;

    /* renamed from: i */
    private final C96613p f270056i;

    /* renamed from: j */
    private int f270057j;

    public C96525ak(C96595d dVar, C96605h hVar, C96609l lVar, C96601df dfVar, C96613p pVar, C96596da daVar, C95850a aVar) {
        this.f270049b = dVar;
        this.f270054g = hVar;
        this.f270050c = lVar;
        this.f270055h = dfVar;
        this.f270056i = pVar;
        this.f270053f = daVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: i */
    private static Collection m159915i(C124629av avVar) {
        HashSet hashSet = new HashSet();
        for (C124650bp bpVar : avVar.f343828o) {
            if ((bpVar.f343892a & 1) != 0) {
                hashSet.add(Integer.valueOf(bpVar.f343893b));
            } else {
                C59104x c = f270048a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaRunner");
                ((C59052c) ((C59052c) c).mo56372aa(16580)).mo56389s("No device index for: %s", bpVar);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo90204a(C95355bf bfVar, C124721s sVar, C124629av avVar) {
        this.f270053f.mo90268c();
        return this.f270053f.mo90267b(this.f270050c.mo90273a(bfVar, sVar, avVar), C96521ag.f270041a, new C96522ah(this));
    }

    /* renamed from: b */
    public final synchronized C60870cx mo90205b(C95355bf bfVar, C124721s sVar, C124629av avVar) {
        if (mo90212h()) {
            C59104x c = f270048a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaRunner");
            ((C59052c) ((C59052c) c).mo56372aa(16578)).mo56386p("Requested to applyOta OTA when another OTA in progress");
            return C60856cj.m92899h(new Exception("Requested to applyOta OTA when another OTA in progress"));
        }
        this.f270052e = new SettableFuture();
        C142467gk gkVar = C142467gk.OTA_RECEIVED;
        C96523ai aiVar = new C96523ai(this, bfVar, sVar, avVar);
        SettableFuture settableFuture = this.f270052e;
        Objects.requireNonNull(settableFuture);
        mo90210f(bfVar, sVar, avVar, gkVar, aiVar, new C96520af(settableFuture));
        return this.f270052e;
    }

    /* renamed from: c */
    public final synchronized C60870cx mo90206c(C95355bf bfVar, C124721s sVar, C124629av avVar) {
        return mo90208d(bfVar, sVar, avVar, m159915i(avVar));
    }

    public final synchronized void close() {
        if (mo90212h()) {
            this.f270053f.mo90268c();
        }
    }

    /* renamed from: d */
    public final synchronized C60870cx mo90208d(C95355bf bfVar, C124721s sVar, C124629av avVar, Collection collection) {
        return this.f270053f.mo90266a(this.f270056i.mo90275a(bfVar, sVar, avVar, collection));
    }

    /* renamed from: e */
    public final synchronized C60870cx mo90209e(C96618u uVar, C95355bf bfVar, C124721s sVar, C124629av avVar, int i) {
        if (mo90212h()) {
            C59104x c = f270048a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaRunner");
            ((C59052c) ((C59052c) c).mo56372aa(16579)).mo56386p("Requested to upload OTA when another OTA in progress.");
            return C60856cj.m92899h(new Exception("Requested to upload OTA when another OTA in progress."));
        }
        this.f270057j = i;
        this.f270051d = new SettableFuture();
        C96596da daVar = this.f270053f;
        C96612o a = this.f270056i.mo90275a(bfVar, sVar, avVar, m159915i(avVar));
        C96515aa aaVar = new C96515aa(this, avVar, sVar, bfVar, uVar);
        SettableFuture settableFuture = this.f270051d;
        Objects.requireNonNull(settableFuture);
        daVar.mo90267b(a, aaVar, new C96520af(settableFuture));
        return this.f270051d;
    }

    /* renamed from: f */
    public final synchronized void mo90210f(C95355bf bfVar, C124721s sVar, C124629av avVar, C142467gk gkVar, C22869e eVar, C90919bp bpVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = gkVar.f386619k;
        C96596da daVar = this.f270053f;
        C96612o a = this.f270056i.mo90275a(bfVar, sVar, avVar, m159915i(avVar));
        C96621x xVar = new C96621x(gkVar, bpVar, eVar);
        Objects.requireNonNull(bpVar);
        daVar.mo90267b(a, xVar, new C96622y(bpVar));
    }

    /* renamed from: g */
    public final synchronized void mo90211g(C96618u uVar, C95355bf bfVar, C124721s sVar, C124629av avVar, C124650bp bpVar, C142467gk gkVar, int i) {
        synchronized (this) {
            if (!gkVar.equals(C142467gk.OTA_RECEIVING_BISTO)) {
                C96596da daVar = this.f270053f;
                C96605h hVar = this.f270054g;
                C22871g gVar = (C22871g) hVar.f270261a.mo17428b();
                gVar.getClass();
                C22871g gVar2 = (C22871g) hVar.f270262b.mo17428b();
                gVar2.getClass();
                C96579ck ckVar = (C96579ck) hVar.f270263c.mo17428b();
                ckVar.getClass();
                C21370a aVar = (C21370a) hVar.f270264d.mo17428b();
                aVar.getClass();
                bfVar.getClass();
                sVar.getClass();
                avVar.getClass();
                bpVar.getClass();
                daVar.mo90267b(new C96604g(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar, bpVar, i), C96619v.f270307a, new C96516ab(this));
            }
            C96596da daVar2 = this.f270053f;
            C96601df dfVar = this.f270055h;
            int i2 = this.f270057j;
            C22871g gVar3 = (C22871g) dfVar.f270247a.mo17428b();
            gVar3.getClass();
            C22871g gVar4 = (C22871g) dfVar.f270248b.mo17428b();
            gVar4.getClass();
            C22871g gVar5 = (C22871g) dfVar.f270249c.mo17428b();
            gVar5.getClass();
            C96579ck ckVar2 = (C96579ck) dfVar.f270250d.mo17428b();
            ckVar2.getClass();
            C89656k kVar = (C89656k) dfVar.f270251e.mo17428b();
            kVar.getClass();
            C21370a aVar2 = (C21370a) dfVar.f270252f.mo17428b();
            aVar2.getClass();
            C89492cd cdVar = (C89492cd) dfVar.f270253g.mo17428b();
            cdVar.getClass();
            uVar.getClass();
            bfVar.getClass();
            sVar.getClass();
            avVar.getClass();
            bpVar.getClass();
            C96600de deVar = r3;
            C96600de deVar2 = new C96600de(gVar3, gVar4, gVar5, ckVar2, kVar, aVar2, cdVar, uVar, bfVar, sVar, avVar, bpVar, i, i2);
            daVar2.mo90267b(deVar, C96517ac.f270037a, new C96518ad(this));
        }
    }

    /* renamed from: h */
    public final synchronized boolean mo90212h() {
        return this.f270053f.mo90270e();
    }
}
