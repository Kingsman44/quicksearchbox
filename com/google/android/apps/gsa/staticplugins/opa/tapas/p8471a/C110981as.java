package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.base.C58835az;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.as */
/* compiled from: PG */
public final /* synthetic */ class C110981as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C110981as f309162a = new C110981as();

    private /* synthetic */ C110981as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58835az azVar = (C58835az) obj;
        return Collection.EL.stream((Set) azVar.f156631a).map(new C111020bq(azVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
