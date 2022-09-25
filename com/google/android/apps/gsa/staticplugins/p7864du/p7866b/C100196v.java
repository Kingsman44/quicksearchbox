package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.v */
/* compiled from: PG */
public final /* synthetic */ class C100196v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280225a;

    public /* synthetic */ C100196v(C100125ad adVar) {
        this.f280225a = adVar;
    }

    public final Object call() {
        SQLiteDatabase readableDatabase;
        C100125ad adVar = this.f280225a;
        synchronized (adVar.f279970f) {
            readableDatabase = adVar.f279981q.getReadableDatabase();
        }
        return readableDatabase;
    }
}
