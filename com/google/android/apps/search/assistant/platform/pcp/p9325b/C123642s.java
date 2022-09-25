package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.s */
/* compiled from: PG */
public final /* synthetic */ class C123642s implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C42840az f341573a;

    public /* synthetic */ C123642s(C42840az azVar) {
        this.f341573a = azVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C42840az azVar = this.f341573a;
        C59071e eVar = C123610ac.f341528a;
        Cursor d = bfVar.mo45932d(azVar.mo45920a());
        try {
            C58490gz gzVar = new C58490gz(4);
            while (d.moveToNext()) {
                gzVar.mo55429h(d.getString(d.getColumnIndexOrThrow("data_id")), d.getBlob(d.getColumnIndexOrThrow("hash_tag")));
            }
            C58495hd f = gzVar.mo55427f(false);
            if (d != null) {
                d.close();
            }
            return f;
        } catch (Throwable th) {
            C123633j.m203004a(th, th);
        }
        throw th;
    }
}
