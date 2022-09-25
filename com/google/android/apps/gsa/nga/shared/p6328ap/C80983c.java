package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.c */
/* compiled from: PG */
public final /* synthetic */ class C80983c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80983c f221996a = new C80983c();

    private /* synthetic */ C80983c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ComponentName) obj).getPackageName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
