package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import android.database.Cursor;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.m */
/* compiled from: PG */
public final /* synthetic */ class C132099m implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C132099m f360487a = new C132099m();

    private /* synthetic */ C132099m() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        return Integer.valueOf(cursor.moveToNext() ? cursor.getInt(0) : -1);
    }
}
