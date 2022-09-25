package com.google.android.apps.gsa.opaonboarding;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.z */
/* compiled from: PG */
public abstract class C84036z implements C83956t {

    /* renamed from: a */
    private final C58881cr f228907a = C58886cw.m90973a(new C84035y(this));

    /* renamed from: b */
    private int f228908b = 0;

    /* renamed from: c */
    public final C58833ax mo77209c() {
        C58833ax axVar;
        C58485gu guVar = (C58485gu) this.f228907a.mo6453a();
        C83956t tVar = C83875ai.f228524a;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f228908b < guVar.size()) {
            axVar = C58833ax.m90834k((C83956t) guVar.get(this.f228908b));
        } else {
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax c = ((C83956t) axVar.mo56107c()).mo77209c();
        if (c.mo56113h()) {
            return c;
        }
        this.f228908b++;
        return mo77209c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C58485gu mo77495h();
}
