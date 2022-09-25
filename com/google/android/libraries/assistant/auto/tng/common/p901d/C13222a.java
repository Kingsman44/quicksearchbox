package com.google.android.libraries.assistant.auto.tng.common.p901d;

import android.database.Cursor;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.a */
/* compiled from: PG */
public final /* synthetic */ class C13222a implements C60801ai {

    /* renamed from: a */
    public static final /* synthetic */ C13222a f40870a = new C13222a();

    private /* synthetic */ C13222a() {
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst() || cursor.getColumnCount() < 2) {
            return new C60817ay(C60856cj.m92900i(BuildConfig.FLAVOR));
        }
        return new C60817ay(C60856cj.m92900i(cursor.getString(1)));
    }
}
