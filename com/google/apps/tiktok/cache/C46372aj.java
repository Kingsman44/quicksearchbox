package com.google.apps.tiktok.cache;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.cache.aj */
/* compiled from: PG */
public final /* synthetic */ class C46372aj implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121386a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121387b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f121388c;

    public /* synthetic */ C46372aj(C46385aw awVar, MessageLite messageLite, MessageLite messageLite2) {
        this.f121386a = awVar;
        this.f121387b = messageLite;
        this.f121388c = messageLite2;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C46370ah ahVar;
        C46385aw awVar = this.f121386a;
        MessageLite messageLite = this.f121387b;
        MessageLite messageLite2 = this.f121388c;
        Cursor d = bfVar.mo45932d(awVar.mo50349i(messageLite));
        try {
            if (d.moveToFirst()) {
                byte[] blob = d.getBlob(d.getColumnIndexOrThrow("response_data"));
                ahVar = new C46370ah(ProtoParsers.m95524g(blob, awVar.f121414e, awVar.f121410a), d.getLong(d.getColumnIndexOrThrow("write_ms")));
            } else {
                ahVar = null;
            }
            if (d != null) {
                d.close();
            }
            bfVar.mo45931c("cache_table", awVar.mo50341a(messageLite, messageLite2), 5);
            return C58833ax.m90833j(ahVar);
        } catch (Throwable th) {
            C46371ai.m82671a(th, th);
        }
        throw th;
    }
}
