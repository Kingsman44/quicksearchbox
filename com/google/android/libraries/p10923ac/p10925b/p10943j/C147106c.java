package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147097t;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.j.c */
/* compiled from: PG */
public final class C147106c implements C147097t {

    /* renamed from: a */
    private final C68214a f397178a;

    public C147106c(C68214a aVar) {
        this.f397178a = aVar;
    }

    /* renamed from: a */
    public final void mo123917a(SQLiteDatabase sQLiteDatabase) {
        ((C147256m) this.f397178a.mo27525b()).mo124064g("Creating MDH subscription table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE subscription (app_id TEXT,account TEXT,channel TEXT,value BLOB NOT NULL,PRIMARY KEY (app_id,account,channel))");
    }

    /* renamed from: b */
    public final void mo123918b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS subscription");
        mo123917a(sQLiteDatabase);
    }

    /* renamed from: c */
    public final void mo123919c() {
    }

    /* renamed from: d */
    public final void mo123920d() {
    }
}
