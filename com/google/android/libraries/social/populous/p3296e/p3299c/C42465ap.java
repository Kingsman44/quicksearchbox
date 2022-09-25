package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.social.populous.e.c.ap */
/* compiled from: PG */
public final /* synthetic */ class C42465ap implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C42465ap f111393a = new C42465ap();

    private /* synthetic */ C42465ap() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C58480gp e = C58485gu.m89837e();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                Long asLong = contentValues.getAsLong("_id");
                asLong.getClass();
                e.mo55395g(new C42468as(asLong.longValue(), contentValues.getAsString("displayName"), contentValues.getAsString("accountName"), contentValues.getAsString("accountType"), contentValues.getAsString("packageName")));
            }
        }
        return e.mo55394f();
    }
}
