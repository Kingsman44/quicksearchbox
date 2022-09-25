package com.google.common.p4522b;

import java.util.NoSuchElementException;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.no */
/* compiled from: PG */
public final /* synthetic */ class C58668no implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C58668no f156398a = new C58668no();

    private /* synthetic */ C58668no() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58669np npVar = (C58669np) obj;
        Collector collector = C58670nq.f156401a;
        if (npVar.f156399a == null) {
            throw new NoSuchElementException();
        } else if (npVar.f156400b.isEmpty()) {
            Object obj2 = npVar.f156399a;
            if (obj2 == C58670nq.f156402b) {
                return null;
            }
            return obj2;
        } else {
            throw npVar.mo55743a(false);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
