package com.google.common.p4522b;

import java.util.ArrayList;
import java.util.List;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.nl */
/* compiled from: PG */
public final /* synthetic */ class C58665nl implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C58665nl f156395a = new C58665nl();

    private /* synthetic */ C58665nl() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58669np npVar = (C58669np) obj;
        C58669np npVar2 = (C58669np) obj2;
        if (npVar.f156399a == null) {
            return npVar2;
        }
        if (npVar2.f156399a == null) {
            return npVar;
        }
        if (npVar.f156400b.isEmpty()) {
            npVar.f156400b = new ArrayList();
        }
        npVar.f156400b.add(npVar2.f156399a);
        npVar.f156400b.addAll(npVar2.f156400b);
        if (npVar.f156400b.size() <= 4) {
            return npVar;
        }
        List list = npVar.f156400b;
        list.subList(4, list.size()).clear();
        throw npVar.mo55743a(true);
    }
}
