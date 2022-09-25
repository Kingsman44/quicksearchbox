package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Intent;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.p */
/* compiled from: PG */
public final /* synthetic */ class C104216p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104216p f289887a = new C104216p();

    private /* synthetic */ C104216p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C104196ao.f289808f;
        return Optional.ofNullable(((Intent) obj).getExtras());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
