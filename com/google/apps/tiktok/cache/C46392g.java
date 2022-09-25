package com.google.apps.tiktok.cache;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.g */
/* compiled from: PG */
public final /* synthetic */ class C46392g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46394i f121436a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121437b;

    public /* synthetic */ C46392g(C46394i iVar, MessageLite messageLite) {
        this.f121436a = iVar;
        this.f121437b = messageLite;
    }

    public final Object apply(Object obj) {
        C58833ax c;
        C46394i iVar = this.f121436a;
        MessageLite messageLite = this.f121437b;
        MessageLite messageLite2 = (MessageLite) obj;
        synchronized (iVar.f121440a) {
            c = iVar.f121441b.mo50375c(messageLite);
            iVar.f121441b.mo50376d(messageLite, messageLite2);
        }
        return c;
    }
}
