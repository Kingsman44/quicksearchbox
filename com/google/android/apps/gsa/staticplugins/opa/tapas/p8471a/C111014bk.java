package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48649j;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48652m;
import java.util.Collections;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bk */
/* compiled from: PG */
public final /* synthetic */ class C111014bk implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f309196a;

    public /* synthetic */ C111014bk(String str) {
        this.f309196a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.ofNullable((C48649j) Collections.unmodifiableMap(((C48652m) obj).f125743b).get(this.f309196a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
