package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142324bc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ci */
/* compiled from: PG */
public final class C96577ci extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270179a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.ci");

    /* renamed from: b */
    public final C142324bc f270180b;

    /* renamed from: c */
    public boolean f270181c;

    /* renamed from: d */
    public C60870cx f270182d;

    public C96577ci(C22871g gVar, C96525ak akVar, C68214a aVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar, C142324bc bcVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270180b = bcVar;
    }

    /* renamed from: w */
    private final void m160038w() {
        if (this.f270137o.mo90223d() && this.f270182d == null) {
            C60870cx c = this.f270140r.mo90206c(this.f270138p, this.f270134l.mo106514l(), this.f270133k);
            this.f270182d = c;
            mo90241p(c, "deviceStateCheck", new C96573ce(this), new C96574cf(this));
        }
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED;
    }

    /* renamed from: c */
    public final C60870cx mo90226c() {
        this.f270181c = false;
        return super.mo90226c();
    }

    /* renamed from: d */
    public final void mo90227d() {
        this.f270181c = true;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        C60870cx cxVar = this.f270182d;
        if (cxVar != null) {
            if (!cxVar.isDone()) {
                this.f270182d.cancel(false);
            }
            this.f270182d = null;
        }
        m160038w();
    }

    /* renamed from: f */
    public final void mo90229f() {
        super.mo90229f();
        m160038w();
    }

    /* renamed from: h */
    public final void mo90231h(Set set, C124548d dVar) {
        super.mo90231h(set, dVar);
        if (set.contains(6) || set.contains(1)) {
            m160038w();
        }
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateWFAU";
    }

    /* renamed from: m */
    public final void mo90251m() {
        mo90242q(this.f270140r.mo90205b(this.f270138p, this.f270134l.mo106514l(), this.f270133k), "Applying OTA.", new C96575cg(this), new C96576ch(this));
    }
}
