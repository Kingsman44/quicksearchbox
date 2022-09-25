package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53916k;
import com.google.p4017at.p4027c.p4031b.p4041d.p4042a.C53917l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.f */
/* compiled from: PG */
public final /* synthetic */ class C139402f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C139402f f379049a = new C139402f();

    private /* synthetic */ C139402f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53916k kVar = (C53916k) C53917l.f141473b.createBuilder();
        C56610b bVar = ((C139392b) obj).f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        String str = bVar.f151143b;
        kVar.copyOnWrite();
        str.getClass();
        ((C53917l) kVar.instance).f141475a = str;
        return (C53917l) kVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
