package com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a;

import com.google.p343ac.p346b.C6642d;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.g */
/* compiled from: PG */
public final /* synthetic */ class C32034g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C32034g f86084a = new C32034g();

    private /* synthetic */ C32034g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C6642d dVar = (C6642d) obj;
        return Stream.CC.m71936of((T[]) new Stream[]{Collection.EL.stream(dVar.f19874c), Collection.EL.stream(dVar.f19872a), Collection.EL.stream(dVar.f19875d), Collection.EL.stream(dVar.f19873b)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
