package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.g.d.d */
/* compiled from: PG */
public final /* synthetic */ class C18167d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18170g f51657a;

    public /* synthetic */ C18167d(C18170g gVar) {
        this.f51657a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        C18173j jVar = this.f51657a.f51661b;
        Bundle bundle2 = bundle.getBundle("extras");
        String string = bundle.getString("name");
        if (bundle2 == null || string == null) {
            return Optional.empty();
        }
        return Optional.m71637of(new C18172i(jVar, string, bundle2));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
