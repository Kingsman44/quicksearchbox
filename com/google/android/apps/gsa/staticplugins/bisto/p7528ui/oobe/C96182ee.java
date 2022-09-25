package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ee */
/* compiled from: PG */
public final /* synthetic */ class C96182ee implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96183ef f269219a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f269220b;

    public /* synthetic */ C96182ee(C96183ef efVar, C60870cx cxVar) {
        this.f269219a = efVar;
        this.f269220b = cxVar;
    }

    public final void run() {
        C96183ef efVar = this.f269219a;
        C60870cx cxVar = this.f269220b;
        C58976aa aaVar = C58975e.f156826a;
        C90873ag agVar = new C90873ag(C90877ak.m148471e(C60856cj.m92897f(cxVar, ((C89492cd) efVar.f269236m.mo27525b()).mo83410p(efVar.f269226c, C96174dx.f269212a, efVar.f269224C)), efVar.f269224C, TimeUnit.MILLISECONDS, efVar.f269235l), efVar.f269233j, "oobe-connecting", new C96175dy(efVar));
        agVar.mo85225c(TimeoutException.class, new C96176dz(efVar));
        agVar.mo85223a(new C96178ea(efVar));
    }
}
