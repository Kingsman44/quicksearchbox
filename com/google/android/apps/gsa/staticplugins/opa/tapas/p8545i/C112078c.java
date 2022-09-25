package com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i;

import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73899g;
import com.google.android.apps.gsa.opa.C83607e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.i.c */
/* compiled from: PG */
public final class C112078c implements h {

    /* renamed from: i */
    private static final C59071e f311249i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.i.c");

    /* renamed from: a */
    public final C2391v f311250a;

    /* renamed from: b */
    public final C2332ag f311251b = new C2332ag(f.a);

    /* renamed from: c */
    public boolean f311252c;

    /* renamed from: d */
    public boolean f311253d;

    /* renamed from: e */
    public boolean f311254e;

    /* renamed from: f */
    public C2332ag f311255f = new C2332ag();

    /* renamed from: g */
    public C2332ag f311256g = new C2332ag();

    /* renamed from: h */
    public boolean f311257h;

    /* renamed from: j */
    private final C73899g f311258j;

    /* renamed from: k */
    private final C86124t f311259k;

    /* renamed from: l */
    private final C48674ai f311260l;

    public C112078c(C73899g gVar, C2391v vVar, C86124t tVar, C48674ai aiVar) {
        this.f311258j = gVar;
        this.f311250a = vVar;
        this.f311259k = tVar;
        this.f311260l = aiVar;
    }

    /* renamed from: e */
    private final void m185920e(f fVar, e eVar) {
        C59104x b = f311249i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TapasLifecycleCtrlImpl");
        ((C59052c) ((C59052c) b).mo56372aa(27498)).mo56389s("Tapas has been deactived for reason: %s", eVar);
        this.f311254e = false;
        if (fVar != f.a) {
            if (this.f311259k.mo79746e(C90063do.f249392cf) && this.f311260l == C48674ai.INTENT_LAUNCHER && (eVar == e.b || eVar == e.e)) {
                this.f311258j.mo65407a();
            }
            m185921f(f.a);
            this.f311258j.mo65408b(eVar);
        }
    }

    /* renamed from: f */
    private final void m185921f(f fVar) {
        if (!this.f311259k.mo79746e(C90063do.f249479eM)) {
            this.f311251b.mo5708l(fVar);
        } else if (fVar != this.f311251b.mo3842a()) {
            this.f311251b.mo5708l(fVar);
        }
    }

    /* renamed from: a */
    public final LiveData mo99350a() {
        return this.f311251b;
    }

    /* renamed from: b */
    public final void mo99351b(e eVar) {
        m185920e((f) this.f311251b.mo3842a(), eVar);
    }

    /* renamed from: c */
    public final void mo99352c(boolean z) {
        this.f311253d = z;
        this.f311254e = z;
        mo99353d();
    }

    /* renamed from: d */
    public final void mo99353d() {
        f fVar;
        f fVar2;
        f fVar3;
        e eVar;
        f fVar4 = (f) this.f311251b.mo3842a();
        if (this.f311253d && this.f311254e) {
            Integer num = (Integer) this.f311255f.mo3842a();
            C83607e eVar2 = (C83607e) this.f311256g.mo3842a();
            if (eVar2 == null ? !(num == null || num.intValue() != 1) : eVar2.equals(C83607e.EDIT_TEXT)) {
                if (!this.f311257h) {
                    fVar = f.b;
                    this.f311252c = true;
                    C58976aa aaVar = C58975e.f156826a;
                    m185921f(fVar);
                    fVar2 = f.b;
                    if (fVar4 == fVar2 && fVar == fVar2) {
                        this.f311258j.mo65409c();
                        return;
                    }
                    fVar3 = f.a;
                    if (fVar4 != fVar3 && fVar == fVar3) {
                        Integer num2 = (Integer) this.f311255f.mo3842a();
                        C83607e eVar3 = (C83607e) this.f311256g.mo3842a();
                        if (eVar3 == null ? num2 == null || num2.intValue() != 0 : !eVar3.equals(C83607e.CENTER_MIC_INPUT_CHIP)) {
                            eVar = e.d;
                        } else {
                            eVar = e.g;
                        }
                        m185920e(fVar4, eVar);
                        return;
                    }
                }
            }
        }
        fVar = f.a;
        C58976aa aaVar2 = C58975e.f156826a;
        m185921f(fVar);
        fVar2 = f.b;
        if (fVar4 == fVar2) {
        }
        fVar3 = f.a;
        if (fVar4 != fVar3) {
        }
    }
}
