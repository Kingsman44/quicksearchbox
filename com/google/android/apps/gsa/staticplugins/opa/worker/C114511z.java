package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.common.p4522b.C58487gw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.z */
/* compiled from: PG */
public final /* synthetic */ class C114511z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C114261ah f317543a;

    /* renamed from: b */
    public final /* synthetic */ C58487gw f317544b;

    public /* synthetic */ C114511z(C114261ah ahVar, C58487gw gwVar) {
        this.f317543a = ahVar;
        this.f317544b = gwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C114261ah ahVar = this.f317543a;
        C58487gw gwVar = this.f317544b;
        Integer num = (Integer) obj;
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        if (gwVar.map.containsKey(num)) {
            fVar.mo103679a(gwVar.mo55277g(num));
        }
        return ahVar.f316836f.mo76937l(num, (C118365g) fVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
