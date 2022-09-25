package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Intent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.j */
/* compiled from: PG */
public final /* synthetic */ class C104210j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104210j f289881a = new C104210j();

    private /* synthetic */ C104210j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C104196ao.f289808f;
        return Boolean.valueOf(((Intent) obj).getBooleanExtra("nga_programmatic_context_request", false));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
