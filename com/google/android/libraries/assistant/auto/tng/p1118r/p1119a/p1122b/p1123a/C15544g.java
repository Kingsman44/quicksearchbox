package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.database.Cursor;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C15544g implements Function {

    /* renamed from: a */
    public final /* synthetic */ Cursor f46526a;

    public /* synthetic */ C15544g(Cursor cursor) {
        this.f46526a = cursor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Cursor cursor = this.f46526a;
        C59071e eVar = C15553p.f46541a;
        return C58837ba.m90858g(cursor.getString(cursor.getColumnIndex((String) obj)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
