package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.bf */
/* compiled from: PG */
public final /* synthetic */ class C76589bf implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76589bf f211835a = new C76589bf();

    private /* synthetic */ C76589bf() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        return Collection.EL.stream(nVar.f166812c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
