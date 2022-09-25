package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.libraries.ac.b.i.o */
/* compiled from: PG */
public final class C147092o implements DatabaseErrorHandler {

    /* renamed from: a */
    private final C147081d f397150a;

    public C147092o(C147081d dVar) {
        this.f397150a = dVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        this.f397150a.mo123906a();
    }
}
