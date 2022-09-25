package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.h */
/* compiled from: PG */
public final /* synthetic */ class C91659h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C91660i f255636a;

    /* renamed from: b */
    public final /* synthetic */ C89851ag f255637b;

    public /* synthetic */ C91659h(C91660i iVar, C89851ag agVar) {
        this.f255636a = iVar;
        this.f255637b = agVar;
    }

    public final void run() {
        C91660i iVar = this.f255636a;
        C89851ag agVar = this.f255637b;
        if (iVar.f255641c.containsKey(agVar)) {
            C58976aa aaVar = C58975e.f156826a;
            C89856f fVar = new C89856f();
            fVar.f246201a = (C89849ae) iVar.f255641c.get(agVar);
            iVar.f255639a.mo74236a(fVar.mo83699a());
            iVar.f255640b.remove(agVar);
            iVar.f255641c.remove(agVar);
        }
    }
}
