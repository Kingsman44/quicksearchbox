package com.google.common.p4522b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.nn */
/* compiled from: PG */
public final /* synthetic */ class C58667nn implements BiConsumer {

    /* renamed from: a */
    public static final /* synthetic */ C58667nn f156397a = new C58667nn();

    private /* synthetic */ C58667nn() {
    }

    public final void accept(Object obj, Object obj2) {
        C58669np npVar = (C58669np) obj;
        Collector collector = C58670nq.f156401a;
        if (obj2 == null) {
            obj2 = C58670nq.f156402b;
        }
        npVar.mo55744b(obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
