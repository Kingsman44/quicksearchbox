package com.google.android.apps.gsa.nga.engine.p6260x;

import android.os.Bundle;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.h */
/* compiled from: PG */
public final /* synthetic */ class C79860h implements Function {

    /* renamed from: a */
    public final /* synthetic */ Bundle f218927a;

    public /* synthetic */ C79860h(Bundle bundle) {
        this.f218927a = bundle;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return String.format("%s=%s", new Object[]{str, C79861i.m128009b(this.f218927a.get(str))});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
