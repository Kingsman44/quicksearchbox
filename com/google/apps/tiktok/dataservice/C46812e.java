package com.google.apps.tiktok.dataservice;

import android.database.Cursor;
import com.google.common.base.C58817ah;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.dataservice.e */
/* compiled from: PG */
public final /* synthetic */ class C46812e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58817ah f122187a;

    public /* synthetic */ C46812e(C58817ah ahVar) {
        this.f122187a = ahVar;
    }

    public final Object apply(Object obj) {
        C58817ah ahVar = this.f122187a;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList(cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(ahVar.apply(cursor));
            } while (cursor.moveToNext());
        }
        return arrayList;
    }
}
