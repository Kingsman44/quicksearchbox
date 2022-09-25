package com.google.android.apps.gsa.nga.engine.education;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.w */
/* compiled from: PG */
public final /* synthetic */ class C75977w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C75977w f210783a = new C75977w();

    private /* synthetic */ C75977w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ComponentName) obj).getClassName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
