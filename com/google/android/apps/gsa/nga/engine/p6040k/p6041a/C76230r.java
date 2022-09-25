package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50579a;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50580b;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.r */
/* compiled from: PG */
public final /* synthetic */ class C76230r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76230r f211242a = new C76230r();

    private /* synthetic */ C76230r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50580b bVar = (C50580b) obj;
        if (bVar.f131624a.isEmpty()) {
            return Stream.CC.m71935of(bVar);
        }
        C50579a aVar = (C50579a) C50580b.f131622c.createBuilder(bVar);
        aVar.copyOnWrite();
        ((C50580b) aVar.instance).f131624a = C50580b.f131622c.f131624a;
        return Stream.CC.m71936of((T[]) new C50580b[]{bVar, (C50580b) aVar.build()});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
