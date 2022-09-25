package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.ai */
/* compiled from: PG */
public final /* synthetic */ class C76172ai implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C75077bo f211161a;

    public /* synthetic */ C76172ai(C75077bo boVar) {
        this.f211161a = boVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76183at atVar = new C76183at(((C76180aq) obj).f211172b, this.f211161a);
        atVar.mo72117b();
        return atVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
