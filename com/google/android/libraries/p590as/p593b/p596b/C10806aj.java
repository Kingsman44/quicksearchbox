package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C10806aj implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C10806aj f35840a = new C10806aj();

    private /* synthetic */ C10806aj() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C10882h hVar = (C10882h) obj;
        C10882h hVar2 = (C10882h) obj2;
        C58974d dVar = C10812ap.f35848a;
        return hVar.mo19282a() > hVar2.mo19282a() ? hVar : hVar2;
    }
}
