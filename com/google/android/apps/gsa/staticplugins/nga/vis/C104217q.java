package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.os.Bundle;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.q */
/* compiled from: PG */
public final /* synthetic */ class C104217q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104217q f289888a = new C104217q();

    private /* synthetic */ C104217q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((Bundle) obj).getBoolean("extra_keep_system_dialogs"));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
