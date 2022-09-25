package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.database.Cursor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.as */
/* compiled from: PG */
public final /* synthetic */ class C79423as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79423as f218076a = new C79423as();

    private /* synthetic */ C79423as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((Cursor) obj).getCount());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
