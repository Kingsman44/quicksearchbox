package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.ae */
/* compiled from: PG */
public final /* synthetic */ class C76168ae implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C124445ap f211156a;

    public /* synthetic */ C76168ae(C124445ap apVar) {
        this.f211156a = apVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76180aq aqVar = (C76180aq) obj;
        C76180aq a = aqVar.mo72116a(this.f211156a);
        if (!a.f211171a.equals(aqVar.f211171a)) {
            a.mo72117b();
        }
        return a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
