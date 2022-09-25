package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.k */
/* compiled from: PG */
public final /* synthetic */ class C76860k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76863n f212278a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212279b;

    public /* synthetic */ C76860k(C76863n nVar, C74965n nVar2) {
        this.f212278a = nVar;
        this.f212279b = nVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76863n nVar = this.f212278a;
        C74965n nVar2 = this.f212279b;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            return nVar.mo72339c((String) optional.get(), nVar2);
        }
        ((C58970a) ((C58970a) C76863n.f212282a.mo56226d()).mo56372aa(3766)).mo56386p("No email address for contact");
        return C81442m.f222851a;
    }
}
