package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.libraries.ac.b.i.n */
/* compiled from: PG */
public final class C147091n {

    /* renamed from: a */
    public final Object f397144a = new Object();

    /* renamed from: b */
    public final Context f397145b;

    /* renamed from: c */
    public final String f397146c;

    /* renamed from: d */
    public boolean f397147d;
    @Deprecated

    /* renamed from: e */
    public boolean f397148e;

    /* renamed from: f */
    public final SQLiteOpenHelper f397149f;

    /* renamed from: a */
    public final SQLiteDatabase mo123913a() {
        SQLiteDatabase readableDatabase;
        synchronized (this.f397144a) {
            if (!this.f397147d) {
                try {
                    readableDatabase = this.f397149f.getReadableDatabase();
                    this.f397148e = true;
                } catch (SQLiteException e) {
                    throw new C147075at("Failed to open SQLite database", e);
                }
            } else {
                throw new C147075at("SQLite database in lame duck mode");
            }
        }
        return readableDatabase;
    }

    /* renamed from: b */
    public final SQLiteDatabase mo123914b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f397144a) {
            if (!this.f397147d) {
                try {
                    writableDatabase = this.f397149f.getWritableDatabase();
                    this.f397148e = true;
                } catch (SQLiteException e) {
                    throw new C147075at("Failed to open SQLite database", e);
                }
            } else {
                throw new C147075at("SQLite database in lame duck mode");
            }
        }
        return writableDatabase;
    }

    public C147091n(SQLiteOpenHelper sQLiteOpenHelper, Context context) {
        sQLiteOpenHelper.getClass();
        this.f397149f = sQLiteOpenHelper;
        this.f397145b = context;
        this.f397146c = sQLiteOpenHelper.getDatabaseName();
    }
}
