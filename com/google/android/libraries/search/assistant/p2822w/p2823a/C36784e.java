package com.google.android.libraries.search.assistant.p2822w.p2823a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60945d;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.w.a.e */
/* compiled from: PG */
public final class C36784e {

    /* renamed from: a */
    public static final C59071e f95851a = C59071e.m91332i("com.google.android.libraries.search.assistant.w.a.e");

    /* renamed from: a */
    public static void m65467a(SQLiteDatabase sQLiteDatabase, long j, String str, String str2, Instant instant, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("provider_id", Long.valueOf(j));
        contentValues.put("package_name", str);
        contentValues.put("intent", str2);
        contentValues.put("data_id", Long.valueOf(j2));
        contentValues.put("sync_timestamp_micro", Long.valueOf(C60945d.m93096a(instant)));
        sQLiteDatabase.insert("pp_app_intents", (String) null, contentValues);
    }
}
