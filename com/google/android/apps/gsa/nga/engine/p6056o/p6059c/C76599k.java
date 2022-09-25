package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.k */
/* compiled from: PG */
public final /* synthetic */ class C76599k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76599k f211846a = new C76599k();

    private /* synthetic */ C76599k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar;
        C61752n nVar2;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        if ((nVar.f166810a & 4) == 0) {
            return Optional.empty();
        }
        if (jVar.f166802a == 2) {
            nVar2 = (C61752n) jVar.f166803b;
        } else {
            nVar2 = C61752n.f166808f;
        }
        return Optional.m71637of(nVar2.f166811b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
