package com.google.android.libraries.search.assistant.performer.communication;

import android.database.Cursor;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ee */
/* compiled from: PG */
public final /* synthetic */ class C35709ee implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C35709ee f93612a = new C35709ee();

    private /* synthetic */ C35709ee() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        Optional empty = Optional.empty();
        if (cursor == null || !cursor.moveToFirst()) {
            return empty;
        }
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        return Optional.m71637of("content://com.android.contacts/data/" + j);
    }
}
