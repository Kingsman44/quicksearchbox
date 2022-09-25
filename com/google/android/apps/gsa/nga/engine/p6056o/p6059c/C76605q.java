package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.q */
/* compiled from: PG */
public final /* synthetic */ class C76605q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76605q f211852a = new C76605q();

    private /* synthetic */ C76605q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63565b bVar;
        C61746h hVar = (C61746h) obj;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 9) {
            C61748j jVar2 = hVar.f166797e;
            if (jVar2 == null) {
                jVar2 = C61748j.f166800d;
            }
            if (jVar2.f166802a == 9) {
                bVar = (C63565b) jVar2.f166803b;
            } else {
                bVar = C63565b.f171933j;
            }
            f d = df.d(bVar);
            f fVar = d;
            if (!fVar.a.isEmpty() || !fVar.b.isEmpty()) {
                return Optional.m71637of(d);
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
