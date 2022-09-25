package com.google.apps.tiktok.cache;

import com.google.common.base.C58817ah;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.f */
/* compiled from: PG */
public final /* synthetic */ class C46391f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46394i f121434a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121435b;

    public /* synthetic */ C46391f(C46394i iVar, MessageLite messageLite) {
        this.f121434a = iVar;
        this.f121435b = messageLite;
    }

    public final Object apply(Object obj) {
        C46394i iVar = this.f121434a;
        MessageLite messageLite = this.f121435b;
        MessageLite messageLite2 = (MessageLite) obj;
        synchronized (iVar.f121440a) {
            iVar.f121441b.mo50376d(messageLite, messageLite2);
        }
        return null;
    }
}
