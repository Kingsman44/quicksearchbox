package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.Cursor;

/* renamed from: com.google.android.libraries.ac.b.i.x */
/* compiled from: PG */
public final /* synthetic */ class C147101x implements C147063ah {

    /* renamed from: a */
    public static final /* synthetic */ C147101x f397162a = new C147101x();

    private /* synthetic */ C147101x() {
    }

    /* renamed from: a */
    public final Object mo123868a(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return cursor.getBlob(1);
    }
}
