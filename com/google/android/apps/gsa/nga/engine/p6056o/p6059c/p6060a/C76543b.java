package com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a;

import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C76543b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76543b f211775a = new C76543b();

    private /* synthetic */ C76543b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61746h hVar = (C61746h) obj;
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        String str = hVar.f166796d;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        str.getClass();
        hVar2.f166793a |= 2;
        hVar2.f166796d = str;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        gVar.copyOnWrite();
        C61746h hVar3 = (C61746h) gVar.instance;
        jVar.getClass();
        hVar3.f166797e = jVar;
        hVar3.f166793a |= 4;
        return (C61746h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
