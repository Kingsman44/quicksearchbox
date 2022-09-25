package com.google.android.apps.gsa.opaonboarding;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ad */
/* compiled from: PG */
public abstract class C83870ad implements C83956t {

    /* renamed from: a */
    private C58833ax f228521a;

    /* renamed from: c */
    public C58833ax mo77209c() {
        if (this.f228521a == null) {
            C83956t tVar = C83875ai.f228524a;
            C58976aa aaVar = C58975e.f156826a;
            this.f228521a = mo77210d();
        }
        if (!this.f228521a.mo56113h()) {
            C83956t tVar2 = C83875ai.f228524a;
            C58976aa aaVar2 = C58975e.f156826a;
            return C58836b.f156633a;
        }
        C58833ax c = ((C83956t) this.f228521a.mo56107c()).mo77209c();
        if (c.mo56113h()) {
            C83956t tVar3 = C83875ai.f228524a;
            C58976aa aaVar3 = C58975e.f156826a;
            return c;
        }
        C83956t tVar4 = C83875ai.f228524a;
        C58976aa aaVar4 = C58975e.f156826a;
        this.f228521a = mo77210d();
        return mo77209c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C58833ax mo77210d();
}
