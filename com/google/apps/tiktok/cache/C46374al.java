package com.google.apps.tiktok.cache;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.cache.al */
/* compiled from: PG */
public final /* synthetic */ class C46374al implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121392a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121393b;

    public /* synthetic */ C46374al(C46385aw awVar, MessageLite messageLite) {
        this.f121392a = awVar;
        this.f121393b = messageLite;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        Object obj;
        C46385aw awVar = this.f121392a;
        MessageLite messageLite = this.f121393b;
        Cursor d = bfVar.mo45932d(awVar.mo50349i(messageLite));
        try {
            if (d.moveToFirst()) {
                byte[] blob = d.getBlob(d.getColumnIndexOrThrow("response_data"));
                long j = d.getLong(d.getColumnIndexOrThrow("write_ms"));
                C42840az azVar = new C42840az();
                azVar.f112130a.append("UPDATE OR FAIL cache_table SET access_ms=?");
                azVar.f112131b.add(Long.toString(awVar.f121413d.mo26870b()));
                azVar.f112130a.append(" WHERE request_data=?");
                azVar.f112131b.add(messageLite.toByteArray());
                bfVar.mo45934h(azVar.mo45920a());
                obj = C58833ax.m90834k(new C46370ah(ProtoParsers.m95524g(blob, awVar.f121414e, awVar.f121410a), j));
                if (d != null) {
                    d.close();
                    return obj;
                }
            } else {
                obj = C58836b.f156633a;
                if (d != null) {
                    d.close();
                }
            }
            return obj;
        } catch (Throwable th) {
            C46371ai.m82671a(th, th);
        }
        throw th;
    }
}
