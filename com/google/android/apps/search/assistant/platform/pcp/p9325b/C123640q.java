package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.p4522b.C58490gz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.q */
/* compiled from: PG */
public final /* synthetic */ class C123640q implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C42840az f341571a;

    public /* synthetic */ C123640q(C42840az azVar) {
        this.f341571a = azVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C42840az azVar = this.f341571a;
        C58490gz gzVar = new C58490gz(4);
        Cursor d = bfVar.mo45932d(azVar.mo45920a());
        while (d.moveToNext()) {
            try {
                Integer b = C124089bo.m203514b(Integer.valueOf(d.getInt(d.getColumnIndexOrThrow("data_type"))));
                String string = d.getString(d.getColumnIndexOrThrow("data_id"));
                byte[] blob = d.getBlob(d.getColumnIndexOrThrow("data_hash"));
                gzVar.mo55429h(C123612ae.m202967a(b.intValue(), string), (C123732az) C62942bv.parseFrom((C62942bv) C123732az.f341771d, blob, C62921ba.m95368a()));
            } catch (Throwable th) {
                C123633j.m203004a(th, th);
            }
        }
        if (d != null) {
            d.close();
        }
        return gzVar.mo55427f(false);
        throw th;
    }
}
