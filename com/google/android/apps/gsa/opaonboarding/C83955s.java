package com.google.android.apps.gsa.opaonboarding;

import android.app.Fragment;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.opaonboarding.s */
/* compiled from: PG */
public final class C83955s implements C83889aw {

    /* renamed from: a */
    private final Map f228713a;

    public C83955s(Map map) {
        this.f228713a = map;
    }

    /* renamed from: a */
    public final void mo65465a(Fragment fragment) {
        C69464a aVar = (C69464a) this.f228713a.get(fragment.getClass());
        C58838bb.m90867b(aVar, "could not find injector for class %s", fragment.getClass().getSimpleName());
        C83888av avVar = (C83888av) aVar.mo17428b();
        C83889aw a = avVar.mo65456a();
        C58838bb.m90867b(a, "%s.build() returned null", avVar.getClass().getSimpleName());
        C58976aa aaVar = C58975e.f156826a;
        a.mo65465a(fragment);
    }
}
