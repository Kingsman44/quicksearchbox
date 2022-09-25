package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.assistant.p3825an.p3830c.p3831a.C49258ad;
import com.google.assistant.p3825an.p3830c.p3831a.C49259ae;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.e */
/* compiled from: PG */
public final /* synthetic */ class C119236e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C119245i f332522a;

    public /* synthetic */ C119236e(C119245i iVar) {
        this.f332522a = iVar;
    }

    public final Object call() {
        C119245i iVar = this.f332522a;
        C49258ad adVar = (C49258ad) C49259ae.f127331b.createBuilder();
        adVar.mo53223a((Iterable) Collection.EL.stream(iVar.f332544a.getPackageManager().getInstalledPackages(0)).map(C119208a.f332462a).collect(Collectors.toCollection(C119210b.f332464a)));
        return (C49259ae) adVar.build();
    }
}
