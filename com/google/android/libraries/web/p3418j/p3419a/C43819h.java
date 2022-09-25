package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.p3418j.C43840e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.j.a.h */
/* compiled from: PG */
public final /* synthetic */ class C43819h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C43819h f114241a = new C43819h();

    private /* synthetic */ C43819h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C43840e eVar = (C43840e) obj;
        if (eVar instanceof C43824m) {
            return ((C43824m) eVar).mo46842f();
        }
        return Optional.m71637of(eVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
