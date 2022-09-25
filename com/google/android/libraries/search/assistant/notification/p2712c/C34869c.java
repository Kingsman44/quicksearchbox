package com.google.android.libraries.search.assistant.notification.p2712c;

import android.database.Cursor;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.notification.c.c */
/* compiled from: PG */
public final /* synthetic */ class C34869c implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C34869c f92465a = new C34869c();

    private /* synthetic */ C34869c() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.getCount() == 0 || !cursor.moveToNext()) {
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("display_name");
        if (!cursor.isNull(columnIndexOrThrow)) {
            return C58837ba.m90856e(cursor.getString(columnIndexOrThrow));
        }
        return null;
    }
}
