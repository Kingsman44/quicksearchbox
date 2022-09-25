package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.android.apps.gsa.p6482q.p6483a.C84237j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bn */
/* compiled from: PG */
public final class C102170bn {

    /* renamed from: a */
    private static final C59071e f285025a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bn");

    /* renamed from: b */
    private final C86124t f285026b;

    /* renamed from: c */
    private final C74555u f285027c;

    /* renamed from: d */
    private final C58833ax f285028d;

    /* renamed from: e */
    private final C101497ae f285029e;

    /* renamed from: f */
    private final String f285030f;

    /* renamed from: g */
    private final C104149a f285031g;

    public C102170bn(C86124t tVar, C104149a aVar, C74555u uVar, C58833ax axVar, C101497ae aeVar, String str) {
        this.f285026b = tVar;
        this.f285031g = aVar;
        this.f285027c = uVar;
        this.f285028d = axVar;
        this.f285029e = aeVar;
        this.f285030f = str;
    }

    /* renamed from: b */
    private final boolean m169218b() {
        C59071e eVar = f285025a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20610)).mo56386p("isFedHotScreenEligible");
        if (this.f285026b.mo79746e(C89978aq.f246609h) || !this.f285026b.mo79746e(C89978aq.f246603b)) {
            return false;
        }
        if (!this.f285027c.mo70892k()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20615)).mo56386p("FedHot is ineligible; not PhoneEnrollment");
            return false;
        } else if (this.f285027c.mo70887e().mo70856e()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20614)).mo56386p("FedHot is ineligible; isBistoEnrollment");
            return false;
        } else if (this.f285029e.mo92334g()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20613)).mo56386p("FedHot is ineligible; kids");
            return false;
        } else if (!this.f285028d.mo56113h()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20612)).mo56386p("FedHot ineligible; fedAssSettingsCallback not present");
            return false;
        } else if (((C84232e) this.f285028d.mo56107c()).mo77703l(this.f285030f)) {
            return true;
        } else {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20611)).mo56386p("FedHot is ineligible due to account");
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m169219c() {
        return this.f285030f.hashCode() % 2 != 0;
    }

    /* renamed from: d */
    private final boolean m169220d() {
        C59071e eVar = f285025a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20616)).mo56386p("isUnifiedConsentScreenEligible");
        if (!this.f285026b.mo79746e(C89978aq.f246609h)) {
            return false;
        }
        if (this.f285027c.mo70887e().mo70856e()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20620)).mo56386p("FedHot is ineligible; isBistoEnrollment");
            return false;
        } else if (this.f285029e.mo92334g()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20619)).mo56386p("FedHot is ineligible; kids");
            return false;
        } else if (!this.f285028d.mo56113h()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20618)).mo56386p("FedHot ineligible; fedAssSettingsCallback not present");
            return false;
        } else if (!((C84232e) this.f285028d.mo56107c()).mo77703l(this.f285030f)) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20617)).mo56386p("FedHot is ineligible due to account");
            return false;
        } else if (((C84232e) this.f285028d.mo56107c()).mo77692a().equals(C84237j.UNIFIED_OPT_IN_UI_SHOW_LEGACY)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final C102169bm mo92922a() {
        C102169bm bmVar;
        if (this.f285026b.mo79746e(C89978aq.f246609h)) {
            bmVar = C102169bm.UNIFIED;
        } else {
            bmVar = C102169bm.FEDHOT;
        }
        C59071e eVar = f285025a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20608)).mo56389s("fedHotOrUnifiedIfEnabled: %s", bmVar.name());
        if (!this.f285026b.mo79746e(C89978aq.f246604c)) {
            if (this.f285026b.mo79746e(C90082eg.f250063dt)) {
                ac a = this.f285027c.mo70886d().mo70847a();
                boolean z = true;
                boolean z2 = (a == ac.b || a.d() == 2) && this.f285031g.mo93971b();
                if (!this.f285027c.mo70892k() || !this.f285027c.mo70887e().mo70854b().equals(af.a)) {
                    z = false;
                }
                if (!z2 || z) {
                    if (m169220d()) {
                        return m169219c() ? C102169bm.UNIFIED : C102169bm.VAA;
                    }
                    if (m169218b()) {
                        return m169219c() ? C102169bm.FEDHOT : C102169bm.VAA;
                    }
                    return C102169bm.VAA;
                }
            }
            if (m169220d()) {
                return C102169bm.UNIFIED;
            }
            return m169218b() ? C102169bm.FEDHOT : C102169bm.NONE;
        }
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20609)).mo56386p("FedHot/Unified override for testing is on");
        return bmVar;
    }
}
