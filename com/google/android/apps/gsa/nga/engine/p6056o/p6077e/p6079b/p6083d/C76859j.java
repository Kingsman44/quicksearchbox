package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.j */
/* compiled from: PG */
public final /* synthetic */ class C76859j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76863n f212276a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212277b;

    public /* synthetic */ C76859j(C76863n nVar, C74965n nVar2) {
        this.f212276a = nVar;
        this.f212277b = nVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76863n nVar = this.f212276a;
        C74965n nVar2 = this.f212277b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.size() == 1) {
            if (!nVar.f212285d.mo85405j(C90126fx.f251229eq)) {
                return C81442m.f222851a;
            }
            return nVar.f212284c.mo28210j(nVar.f212283b.k(((Long) guVar.get(0)).longValue()), "[NGA] ComposeEmailFulfiller.composeToContact", new C76860k(nVar, nVar2));
        } else if (guVar.size() > 1) {
            return C81442m.f222851a;
        } else {
            if (!nVar.f212285d.mo85405j(C90126fx.f251230er)) {
                return C81442m.f222851a;
            }
            ((C58970a) ((C58970a) C76863n.f212282a.mo56226d()).mo56372aa(3767)).mo56386p("No contact found with an email address.");
            return nVar.mo72339c(BuildConfig.FLAVOR, nVar2);
        }
    }
}
