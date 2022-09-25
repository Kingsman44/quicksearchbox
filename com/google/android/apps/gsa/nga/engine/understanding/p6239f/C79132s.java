package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.understanding.C78982ai;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79074e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.s */
/* compiled from: PG */
public final /* synthetic */ class C79132s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78983aj f217529a;

    /* renamed from: b */
    public final /* synthetic */ C80513b f217530b;

    public /* synthetic */ C79132s(C78983aj ajVar, C80513b bVar) {
        this.f217529a = ajVar;
        this.f217530b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78983aj ajVar = this.f217529a;
        C80513b bVar = this.f217530b;
        C61752n nVar = (C61752n) obj;
        C78982ai c = ajVar.mo73748c();
        C80512a aVar = (C80512a) bVar.toBuilder();
        aVar.copyOnWrite();
        nVar.getClass();
        ((C80513b) aVar.instance).f221016a = nVar;
        ((C79074e) c).f217428a = Optional.m71637of((C80513b) aVar.build());
        return c.mo73744a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
