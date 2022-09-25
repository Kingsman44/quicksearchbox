package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.o.m */
/* compiled from: PG */
public final /* synthetic */ class C19036m implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C19036m f53422a = new C19036m();

    private /* synthetic */ C19036m() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return (C58528ij) Stream.CC.concat(Collection.EL.stream((C58528ij) obj), Collection.EL.stream((C58528ij) obj2)).collect(C58370cn.f155947b);
    }
}
