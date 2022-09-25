package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61758t;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C76574ar implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76574ar f211813a = new C76574ar();

    private /* synthetic */ C76574ar() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61758t tVar;
        C61746h hVar = (C61746h) obj;
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 3) {
            C61748j jVar2 = hVar.f166797e;
            if (jVar2 == null) {
                jVar2 = C61748j.f166800d;
            }
            if (jVar2.f166802a == 3) {
                tVar = (C61758t) jVar2.f166803b;
            } else {
                tVar = C61758t.f166824c;
            }
            if (tVar.f166826a == 1 && ((String) tVar.f166827b).startsWith("/m/")) {
                return Optional.m71637of(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR);
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
