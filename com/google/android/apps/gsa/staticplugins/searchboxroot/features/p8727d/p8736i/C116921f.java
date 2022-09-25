package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.ane;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.f */
/* compiled from: PG */
public final class C116921f extends C41641b implements C89204i, C89203h {

    /* renamed from: a */
    private C89205j f324621a;

    /* renamed from: a */
    public final synchronized void mo103058a() {
        C89205j jVar = this.f324621a;
        if (jVar != null) {
            jVar.mo83170j("ORACLE_PEOPLE_REFINEMENTS_AVAILABLE", true);
        }
    }

    /* renamed from: c */
    public final synchronized void mo103059c() {
        C89205j jVar = this.f324621a;
        if (jVar != null) {
            jVar.mo83170j("SRP_ON_FOCUS", true);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        C89205j jVar = this.f324621a;
        if (jVar != null && jVar.mo83178r("SRP_ON_FOCUS")) {
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            apd apd2 = apd.f159555aA;
            apd.f159607ax = 1;
            apd.f159611c |= 1048576;
        }
    }

    /* renamed from: g */
    public final synchronized void mo103060g() {
        C89205j jVar = this.f324621a;
        if (jVar != null) {
            jVar.mo83170j("ZERO_TYPING_SUGGEST_TRIGGERED", true);
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f324621a = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        C89205j jVar = this.f324621a;
        if (jVar != null) {
            jVar.mo83170j("ZERO_TYPING_SUGGEST_TRIGGERED", false);
            this.f324621a.mo83170j("SRP_ON_FOCUS", false);
            this.f324621a.mo83170j("ORACLE_PEOPLE_REFINEMENTS_AVAILABLE", false);
        }
    }

    /* renamed from: l */
    public final void mo44232l(C41640a aVar) {
        C89205j jVar = this.f324621a;
        if (jVar != null && jVar.mo83178r("ZERO_TYPING_SUGGEST_TRIGGERED")) {
            aVar.mo44229d(ane.ZERO_TYPING_SUGGEST_TRIGGERED, true);
        }
        C89205j jVar2 = this.f324621a;
        if (jVar2 != null && jVar2.mo83178r("ORACLE_PEOPLE_REFINEMENTS_AVAILABLE")) {
            aVar.mo44229d(ane.ORACLE_PEOPLE_REFINEMENTS_AVAILABLE, true);
        }
    }
}
