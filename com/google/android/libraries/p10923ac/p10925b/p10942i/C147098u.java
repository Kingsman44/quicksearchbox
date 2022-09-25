package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.i.u */
/* compiled from: PG */
public final class C147098u {

    /* renamed from: a */
    public final Set f397154a;

    /* renamed from: b */
    public final C68214a f397155b;

    /* renamed from: c */
    private final C147079b f397156c;

    public C147098u(Set set, C147079b bVar, C68214a aVar) {
        this.f397154a = set;
        this.f397156c = bVar;
        this.f397155b = aVar;
    }

    /* renamed from: a */
    public final void mo123921a(SQLiteDatabase sQLiteDatabase) {
        ((C147256m) this.f397155b.mo27525b()).mo124064g("Creating database v%d", 2);
        if (!C147266a.m240136g()) {
            this.f397156c.mo123885a(sQLiteDatabase);
        }
        for (C147097t a : this.f397154a) {
            a.mo123917a(sQLiteDatabase);
        }
    }
}
