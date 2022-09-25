package com.google.android.libraries.notifications.data.impl;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.notifications.data.C29828s;
import com.google.android.libraries.notifications.data.C29829t;
import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.notifications.data.impl.j */
/* compiled from: PG */
public final class C29805j {

    /* renamed from: a */
    public final ChimePerAccountRoomDatabase f80819a;

    /* renamed from: b */
    public final C21370a f80820b;

    public C29805j(ChimePerAccountRoomDatabase chimePerAccountRoomDatabase, C21370a aVar) {
        this.f80819a = chimePerAccountRoomDatabase;
        this.f80820b = aVar;
    }

    /* renamed from: a */
    public final void mo35104a(long j) {
        try {
            this.f80819a.mo35115z().mo35118c(this.f80820b.mo26870b() - j);
        } catch (SQLiteCantOpenDatabaseException e) {
            C30058b.m55797i("ChimeThreadStateStorageImpl", e, "Exception thrown on thread storage periodic cleanup.", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo35105b(C29828s sVar) {
        try {
            C29829t tVar = (C29829t) this.f80819a.mo8169M(new C29804i(this, sVar));
        } catch (SQLiteException e) {
            C30058b.m55797i("ChimeThreadStateStorageImpl", e, "Failed to insert thread state", new Object[0]);
            C29829t tVar2 = C29829t.INSERTED;
        }
    }
}
