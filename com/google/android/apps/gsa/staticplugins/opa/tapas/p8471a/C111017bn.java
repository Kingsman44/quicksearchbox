package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C111017bn implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f309199a;

    public /* synthetic */ C111017bn(String str) {
        this.f309199a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return Collection.EL.stream((Set) entry.getValue()).map(new C111021br(this.f309199a, entry));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
