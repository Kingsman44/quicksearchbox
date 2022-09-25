package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.database.Cursor;
import com.google.common.base.C58837ba;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.n */
/* compiled from: PG */
public final class C113317n {
    /* renamed from: a */
    static final int m187468a(String str, Cursor cursor, Map map) {
        return cursor.getInt(((Integer) map.get(str)).intValue());
    }

    /* renamed from: b */
    public static final String m187469b(String str, Cursor cursor, Map map) {
        return C58837ba.m90858g(cursor.getString(((Integer) map.get(str)).intValue()));
    }
}
