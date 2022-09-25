package com.google.android.libraries.lens.view.gallery.data;

import android.content.ContentUris;
import android.database.Cursor;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.o */
/* compiled from: PG */
public final /* synthetic */ class C26396o implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C26398q f71815a;

    public /* synthetic */ C26396o(C26398q qVar) {
        this.f71815a = qVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C26398q qVar = this.f71815a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.getCount() <= 0) {
            return C58836b.f156633a;
        }
        cursor.moveToFirst();
        if (cursor.getInt(1) > 104857600) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(ContentUris.withAppendedId(qVar.f71821e, cursor.getLong(0)));
    }
}
