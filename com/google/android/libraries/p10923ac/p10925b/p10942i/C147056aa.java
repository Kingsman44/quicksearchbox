package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.Cursor;
import android.util.Pair;

/* renamed from: com.google.android.libraries.ac.b.i.aa */
/* compiled from: PG */
public final /* synthetic */ class C147056aa implements C147063ah {

    /* renamed from: a */
    public final /* synthetic */ C147087j f397061a;

    public /* synthetic */ C147056aa(C147087j jVar) {
        this.f397061a = jVar;
    }

    /* renamed from: a */
    public final Object mo123868a(Cursor cursor) {
        C147087j jVar = this.f397061a;
        while (cursor.moveToNext()) {
            if (!((C147102y) jVar).f397163a.add(new Pair(cursor.getBlob(0), cursor.getBlob(1)))) {
                return false;
            }
        }
        return true;
    }
}
