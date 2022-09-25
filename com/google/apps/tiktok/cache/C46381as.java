package com.google.apps.tiktok.cache;

import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.as */
/* compiled from: PG */
public final /* synthetic */ class C46381as implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ MessageLite f121405a;

    public /* synthetic */ C46381as(MessageLite messageLite) {
        this.f121405a = messageLite;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        MessageLite messageLite = this.f121405a;
        C42840az azVar = new C42840az();
        azVar.f112130a.append("DELETE FROM cache_table WHERE request_data=?");
        azVar.f112131b.add(messageLite.toByteArray());
        bfVar.mo45934h(azVar.mo45920a());
    }
}
