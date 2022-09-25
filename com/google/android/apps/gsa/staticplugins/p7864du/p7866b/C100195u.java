package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.u */
/* compiled from: PG */
public final /* synthetic */ class C100195u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280224a;

    public /* synthetic */ C100195u(C100125ad adVar) {
        this.f280224a = adVar;
    }

    public final Object call() {
        SQLiteDatabase writableDatabase;
        C100125ad adVar = this.f280224a;
        synchronized (adVar.f279970f) {
            writableDatabase = adVar.f279981q.getWritableDatabase();
        }
        return writableDatabase;
    }
}
