package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.shared.p7066m.C90063do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.bj */
/* compiled from: PG */
final class C107897bj implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C107898bk f300222a;

    /* renamed from: b */
    private C88079oj f300223b;

    public C107897bj(C107898bk bkVar) {
        this.f300222a = bkVar;
    }

    /* renamed from: b */
    public final synchronized void mo774hX(C88079oj ojVar) {
        C107898bk bkVar = this.f300222a;
        C88079oj ojVar2 = this.f300223b;
        if ((!bkVar.f300225b.mo79746e(C90063do.f249535fP) || ojVar2 == C88079oj.RESUMED || ojVar2 == C88079oj.PAUSED) && ojVar == C88079oj.STOPPED) {
            this.f300222a.mo96328c();
        }
        this.f300223b = ojVar;
    }
}
