package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ac */
/* compiled from: PG */
final class C101810ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C101812ae f283973a;

    public C101810ac(C101812ae aeVar) {
        this.f283973a = aeVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C101812ae.f283975c.mo56226d()).mo56382g(th)).mo56372aa(20672)).mo56386p("Unicorn Status check failed");
        this.f283973a.mo86905e(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f283973a.f283977e.f284137d.set(bool.booleanValue());
        if (bool.booleanValue()) {
            C101812ae aeVar = this.f283973a;
            l lVar = aeVar.f283978f;
            p pVar = new p();
            pVar.b = C58833ax.m90833j(aeVar.f283976d);
            acu acu = (acu) acv.f128920X.createBuilder();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            acv.f128945a |= 1073741824;
            acv.f128970z = true;
            pVar.e((acv) acu.build());
            pVar.a = new C101811ad(aeVar);
            pVar.e = C58833ax.m90833j(aeVar.getClass().getSimpleName());
            lVar.h(pVar.a());
            return;
        }
        this.f283973a.mo86905e(true);
    }
}
