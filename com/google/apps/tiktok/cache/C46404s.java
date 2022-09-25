package com.google.apps.tiktok.cache;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.s */
/* compiled from: PG */
public final /* synthetic */ class C46404s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46406u f121460a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121461b;

    public /* synthetic */ C46404s(C46406u uVar, MessageLite messageLite) {
        this.f121460a = uVar;
        this.f121461b = messageLite;
    }

    public final Object apply(Object obj) {
        C46370ah ahVar;
        C46406u uVar = this.f121460a;
        MessageLite messageLite = this.f121461b;
        MessageLite messageLite2 = (MessageLite) obj;
        int serializedSize = messageLite2.getSerializedSize();
        C58838bb.m90871f(serializedSize < 2000000, "Message exceeds 2MB limit. Was %s bytes", serializedSize);
        C46401p pVar = uVar.f121464a;
        pVar.mo50379b();
        C58838bb.m90866a(messageLite, "Cannot write to store with a null key");
        C58838bb.m90866a(messageLite2, "Cannot write to store with a null value");
        C46370ah ahVar2 = new C46370ah(messageLite2, pVar.f121455a.mo26870b());
        ParcelableKeyValueStore parcelableKeyValueStore = pVar.f121458d;
        synchronized (parcelableKeyValueStore.f121360a) {
            parcelableKeyValueStore.mo50328b(messageLite);
            ahVar = (C46370ah) parcelableKeyValueStore.f121361b.get(messageLite);
            parcelableKeyValueStore.f121361b.put(messageLite, ahVar2);
        }
        return C58833ax.m90833j(ahVar);
    }
}
