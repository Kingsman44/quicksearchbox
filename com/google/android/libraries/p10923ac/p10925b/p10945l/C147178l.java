package com.google.android.libraries.p10923ac.p10925b.p10945l;

import android.database.Cursor;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;

/* renamed from: com.google.android.libraries.ac.b.l.l */
/* compiled from: PG */
public final class C147178l {

    /* renamed from: a */
    private static final char[] f397366a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m240008a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("x'");
        for (byte b : bArr) {
            char[] cArr = f397366a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append("'");
        return sb.toString();
    }

    /* renamed from: b */
    public static void m240009b(Cursor cursor) {
        if (cursor == null) {
            throw new C147075at("SQLite Cursor is null");
        }
    }
}
