package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4854c.C63408ai;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ba */
/* compiled from: PG */
public final /* synthetic */ class C76584ba implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76584ba f211830a = new C76584ba();

    private /* synthetic */ C76584ba() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63408ai aiVar;
        C61746h hVar = (C61746h) obj;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a != 5) {
            return Optional.empty();
        }
        C61748j jVar2 = hVar.f166797e;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 5) {
            aiVar = (C63408ai) jVar2.f166803b;
        } else {
            aiVar = C63408ai.f171351e;
        }
        return Optional.m71637of(aiVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
