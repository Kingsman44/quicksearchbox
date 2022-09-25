package com.google.apps.tiktok.cache;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.cache.ar */
/* compiled from: PG */
public final /* synthetic */ class C46380ar implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121402a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121403b;

    /* renamed from: c */
    public final /* synthetic */ C58817ah f121404c;

    public /* synthetic */ C46380ar(C46385aw awVar, MessageLite messageLite, C58817ah ahVar) {
        this.f121402a = awVar;
        this.f121403b = messageLite;
        this.f121404c = ahVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        long j;
        MessageLite messageLite;
        Object obj;
        Object obj2;
        C46385aw awVar = this.f121402a;
        MessageLite messageLite2 = this.f121403b;
        C58817ah ahVar = this.f121404c;
        Cursor d = bfVar.mo45932d(awVar.mo50349i(messageLite2));
        try {
            long b = awVar.f121413d.mo26870b();
            if (d.moveToFirst()) {
                byte[] blob = d.getBlob(d.getColumnIndexOrThrow("response_data"));
                j = d.getLong(d.getColumnIndexOrThrow("write_ms"));
                messageLite = ProtoParsers.m95524g(blob, awVar.f121414e, awVar.f121410a);
            } else {
                messageLite = null;
                j = 0;
            }
            if (messageLite == null) {
                obj = C58836b.f156633a;
            } else {
                obj = C58833ax.m90834k(messageLite);
            }
            C46386ax axVar = (C46386ax) ahVar.apply(obj);
            axVar.getClass();
            Object obj3 = axVar.f121417a;
            if (obj3 != null) {
                C46370ah ahVar2 = new C46370ah(obj3, b);
                C46385aw.m82682j(bfVar, messageLite2, ahVar2, b);
                obj2 = C58833ax.m90834k(ahVar2);
                if (d != null) {
                    d.close();
                    return obj2;
                }
            } else if (messageLite != null) {
                C46370ah ahVar3 = new C46370ah(messageLite, j);
                C46385aw.m82682j(bfVar, messageLite2, ahVar3, b);
                obj2 = C58833ax.m90834k(ahVar3);
                if (d != null) {
                    d.close();
                    return obj2;
                }
            } else {
                obj2 = C58836b.f156633a;
                if (d != null) {
                    d.close();
                }
            }
            return obj2;
        } catch (Throwable th) {
            C46371ai.m82671a(th, th);
        }
        throw th;
    }
}
