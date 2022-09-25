package com.google.android.libraries.p10923ac.p10925b.p10946m;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147097t;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.m.d */
/* compiled from: PG */
public final class C147186d implements C147097t {

    /* renamed from: a */
    private final C68214a f397373a;

    public C147186d(C68214a aVar) {
        this.f397373a = aVar;
    }

    /* renamed from: a */
    public final void mo123917a(SQLiteDatabase sQLiteDatabase) {
        ((C147256m) this.f397373a.mo27525b()).mo124064g("Creating MDH wipeout table.", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wipeout (account TEXT,channel_key TEXT,local_writes  INTEGER NOT NULL DEFAULT 0,last_sync_timestamp INTEGER,channel_id BLOB NOT NULL,PRIMARY KEY (account,channel_key))");
    }

    /* renamed from: b */
    public final void mo123918b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((C147256m) this.f397373a.mo27525b()).mo124065h("Upgrading MDH wipeout table from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    public final void mo123919c() {
    }

    /* renamed from: d */
    public final void mo123920d() {
        ((C147256m) this.f397373a.mo27525b()).mo124065h("Opening MDH wipeout table.", new Object[0]);
    }
}
