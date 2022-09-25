package com.google.apps.tiktok.cache;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.t */
/* compiled from: PG */
public final /* synthetic */ class C46405t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46406u f121462a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121463b;

    public /* synthetic */ C46405t(C46406u uVar, MessageLite messageLite) {
        this.f121462a = uVar;
        this.f121463b = messageLite;
    }

    public final Object apply(Object obj) {
        C46406u uVar = this.f121462a;
        MessageLite messageLite = this.f121463b;
        MessageLite messageLite2 = (MessageLite) obj;
        C58838bb.m90866a(messageLite2, "Cannot cache a null value");
        int serializedSize = messageLite2.getSerializedSize();
        C58838bb.m90871f(serializedSize < 2000000, "Message exceeds 2MB limit. Was %s bytes", serializedSize);
        uVar.f121464a.mo50381d(messageLite, messageLite2);
        return null;
    }
}
