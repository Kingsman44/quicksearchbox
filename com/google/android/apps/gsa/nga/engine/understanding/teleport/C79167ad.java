package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ad */
/* compiled from: PG */
public final /* synthetic */ class C79167ad implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79167ad f217625a = new C79167ad();

    private /* synthetic */ C79167ad() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar = (C61752n) obj;
        C80512a aVar = (C80512a) C80513b.f221014e.createBuilder();
        C80515d dVar = C80515d.TELEPORT;
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221019d = dVar.getNumber();
        aVar.copyOnWrite();
        nVar.getClass();
        ((C80513b) aVar.instance).f221016a = nVar;
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221018c = 1.0f;
        return (C80513b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
