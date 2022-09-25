package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.search.core.p6805i.C86111g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ap */
/* compiled from: PG */
public final class C84434ap implements C22869e {

    /* renamed from: a */
    private final C86124t f229759a;

    /* renamed from: b */
    private final C84425ag f229760b;

    public C84434ap(C84425ag agVar, C86124t tVar) {
        this.f229760b = agVar;
        this.f229759a = tVar;
    }

    public final void run() {
        C84425ag agVar = this.f229760b;
        C86111g n = this.f229759a.mo79748n();
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        agVar.mo77997c();
        agVar.f229721d.mo28212l("setExperimentIds", new C84456w(agVar, n, conditionVariable));
        agVar.f229721d.mo28212l("maybeDisconnect", new C84453t(agVar));
        conditionVariable.block();
    }
}
