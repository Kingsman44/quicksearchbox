package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.r;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73893f;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dz */
/* compiled from: PG */
final class C108653dz extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C108660ef f302199a;

    public C108653dz(C108660ef efVar) {
        this.f302199a = efVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C108660ef efVar = this.f302199a;
        C108741i iVar = efVar.f302216b.f302004l;
        iVar.getClass();
        C108617cq cqVar = efVar.f302217c;
        C58976aa aaVar = C58975e.f156826a;
        String n = C58837ba.m90859h(iVar.mo97109m()) ? iVar.mo97110n() : null;
        l lVar = cqVar.f302138c;
        r b = C73893f.m108487b();
        r rVar = b;
        rVar.a = (Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c();
        rVar.b = null;
        rVar.c = iVar.mo97109m();
        rVar.d = n;
        rVar.e = iVar.mo97107k();
        b.c(iVar.mo97103f());
        b.b(iVar.mo97102e());
        b.d(iVar.mo97104g());
        rVar.i = iVar.mo97105h();
        rVar.k = C58833ax.m90833j(cqVar.getClass().getSimpleName());
        C60870cx b2 = lVar.b(b.a());
        return C58485gu.m89847o(this.f302199a.f302218d.mo77487a(b2, C108652dy.f302198a), new C108656eb(this.f302199a, b2));
    }
}
