package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10969j;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147097t;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147098u;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;

/* renamed from: com.google.android.libraries.ac.d.b.b.j.a */
/* compiled from: PG */
public final class C147318a extends SQLiteOpenHelper {

    /* renamed from: a */
    private final C147098u f397609a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147318a(Context context, C147098u uVar, DatabaseErrorHandler databaseErrorHandler) {
        super(context, "icing-mdh.db", (SQLiteDatabase.CursorFactory) null, 2, !C147266a.m240136g() ? new DefaultDatabaseErrorHandler() : databaseErrorHandler);
        this.f397609a = uVar;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f397609a.mo123921a(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C147098u uVar = this.f397609a;
        ((C147256m) uVar.f397155b.mo27525b()).mo124064g("Downgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        uVar.mo123921a(sQLiteDatabase);
        for (C147097t c : uVar.f397154a) {
            c.mo123919c();
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        for (C147097t d : this.f397609a.f397154a) {
            d.mo123920d();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C147098u uVar = this.f397609a;
        ((C147256m) uVar.f397155b.mo27525b()).mo124064g("Upgrading database from v%d to v%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == 2) {
            uVar.mo123921a(sQLiteDatabase);
            return;
        }
        for (C147097t b : uVar.f397154a) {
            b.mo123918b(sQLiteDatabase, i, i2);
        }
    }
}
