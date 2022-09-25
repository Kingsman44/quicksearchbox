package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.database.Cursor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.x */
/* compiled from: PG */
public final /* synthetic */ class C113327x implements Function {

    /* renamed from: a */
    public final /* synthetic */ Cursor f313851a;

    public /* synthetic */ C113327x(Cursor cursor) {
        this.f313851a = cursor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Cursor cursor = this.f313851a;
        String[] strArr = C113304aa.f313789a;
        return cursor.getString(cursor.getColumnIndex((String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
