package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.m */
/* compiled from: PG */
public final /* synthetic */ class C123636m implements C42844bc {

    /* renamed from: a */
    public static final /* synthetic */ C123636m f341565a = new C123636m();

    private /* synthetic */ C123636m() {
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C59071e eVar = C123610ac.f341528a;
        C58480gp e = C58485gu.m89837e();
        Cursor d = bfVar.mo45932d(C123611ad.m202950i());
        while (d.moveToNext()) {
            try {
                e.mo55395g((C123787p) C62942bv.parseFrom((C62942bv) C123787p.f341948n, d.getBlob(d.getColumnIndexOrThrow("data_content")), C62921ba.m95368a()));
            } catch (Throwable th) {
                C123633j.m203004a(th, th);
            }
        }
        C58485gu f = e.mo55394f();
        if (d != null) {
            d.close();
        }
        return f;
        throw th;
    }
}
