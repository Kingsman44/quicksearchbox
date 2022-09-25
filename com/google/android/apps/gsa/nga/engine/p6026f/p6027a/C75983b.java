package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C75983b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C75989h f210791a;

    public /* synthetic */ C75983b(C75989h hVar) {
        this.f210791a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C75989h hVar = this.f210791a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new Exception("Missing account name."));
        }
        return hVar.f210799b.mo28210j(hVar.f210802e.b((String) axVar.mo56107c(), C65753ak.ASSISTANT_SETTINGS), "[NGA] BlacklistRoutineTriggersProvider.readRoutineFromGeller", new C75988g(hVar, axVar));
    }
}
