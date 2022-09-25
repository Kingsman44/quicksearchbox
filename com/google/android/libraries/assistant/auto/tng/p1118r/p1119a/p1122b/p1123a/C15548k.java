package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.database.Cursor;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C15548k implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C15548k f46534a = new C15548k();

    private /* synthetic */ C15548k() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C59071e eVar = C15553p.f46541a;
        C58480gp e = C58485gu.m89837e();
        int columnIndex = cursor.getColumnIndex("_id");
        while (cursor.moveToNext()) {
            e.mo55395g(Long.toString(cursor.getLong(columnIndex)));
        }
        return e.mo55394f();
    }
}
