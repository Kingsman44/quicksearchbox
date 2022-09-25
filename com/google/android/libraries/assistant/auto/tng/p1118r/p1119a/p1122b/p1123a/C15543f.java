package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.database.Cursor;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C15543f implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C15543f f46525a = new C15543f();

    private /* synthetic */ C15543f() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C59071e eVar = C15553p.f46541a;
        return C58837ba.m90858g(cursor.moveToFirst() ? cursor.getString(cursor.getColumnIndex("display_name")) : null);
    }
}
