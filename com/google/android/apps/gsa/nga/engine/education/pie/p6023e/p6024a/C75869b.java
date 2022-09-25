package com.google.android.apps.gsa.nga.engine.education.pie.p6023e.p6024a;

import com.google.android.apps.gsa.nga.engine.education.pie.p6023e.C75867a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4553a.C59478bb;
import com.google.common.p4552o.p4553a.C59479bc;
import com.google.common.p4552o.p4553a.C59482bf;
import com.google.common.p4552o.p4553a.C59491bo;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.e.a.b */
/* compiled from: PG */
public final class C75869b implements C75867a {

    /* renamed from: a */
    Optional f210508a = Optional.empty();

    /* renamed from: b */
    int f210509b = 1;

    /* renamed from: c */
    private final C79863k f210510c;

    public C75869b(C79863k kVar) {
        this.f210510c = kVar;
    }

    /* renamed from: i */
    private final void m122313i(C89849ae aeVar) {
        C79863k kVar = this.f210510c;
        int intValue = ((Integer) this.f210508a.map(C75868a.f210507a).orElse(0)).intValue();
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C59478bb bbVar = (C59478bb) C59479bc.f157808c.createBuilder();
        C59482bf bfVar = (C59482bf) C59491bo.f157839m.createBuilder();
        bfVar.copyOnWrite();
        C59491bo boVar = (C59491bo) bfVar.instance;
        boVar.f157841a |= 512;
        boVar.f157852l = intValue;
        C59491bo boVar2 = (C59491bo) bfVar.build();
        bbVar.copyOnWrite();
        C59479bc bcVar = (C59479bc) bbVar.instance;
        boVar2.getClass();
        bcVar.f157811b = boVar2;
        bcVar.f157810a = 1;
        C59479bc bcVar2 = (C59479bc) bbVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        bcVar2.getClass();
        cbVar.f160071aI = bcVar2;
        cbVar.f160123d |= 2;
        fVar.f246203c = (C59687cb) ajVar.build();
        kVar.mo74236a(fVar.mo83699a());
        this.f210508a = Optional.empty();
        this.f210509b = 1;
    }

    /* renamed from: j */
    private final boolean m122314j() {
        return this.f210509b == 1;
    }

    /* renamed from: a */
    public final void mo71929a() {
        if (!m122314j() && this.f210509b != 2) {
            m122313i(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_FAILED);
        }
    }

    /* renamed from: b */
    public final void mo71930b() {
        if (!m122314j()) {
            this.f210510c.mo74271b(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_INPUT_PLATE);
            this.f210509b = 4;
        }
    }

    /* renamed from: c */
    public final void mo71931c(C80244ck ckVar, boolean z) {
        if (!m122314j()) {
            if (!z) {
                C80246cm a = C80246cm.m128102a(ckVar.f220140b);
                if (a == null) {
                    a = C80246cm.NO_UI;
                }
                if (a != C80246cm.MULTISTEP_EDUCATION) {
                    return;
                }
            }
            m122313i(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_ENDED);
        }
    }

    /* renamed from: d */
    public final void mo71932d(C80187ah ahVar) {
        if (!m122314j()) {
            this.f210510c.mo74271b(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_QUERY);
            this.f210509b = 2;
        } else {
            this.f210510c.mo74271b(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED);
            this.f210509b = 2;
        }
        this.f210508a = Optional.m71637of(ahVar);
    }

    /* renamed from: e */
    public final void mo71933e() {
        if (!m122314j()) {
            m122313i(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_QUERY_MISMATCH);
        }
    }

    /* renamed from: f */
    public final void mo71934f() {
        if (!m122314j()) {
            m122313i(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_UI_DISMISSED);
        }
    }

    /* renamed from: g */
    public final void mo71935g() {
        if (!m122314j()) {
            m122313i(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_FAILED);
        }
    }

    /* renamed from: h */
    public final void mo71936h() {
        if (!m122314j()) {
            this.f210510c.mo74271b(C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_UI_SHOWN);
            this.f210509b = 3;
        }
    }
}
