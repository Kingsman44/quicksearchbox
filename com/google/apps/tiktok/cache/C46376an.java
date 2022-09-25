package com.google.apps.tiktok.cache;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.an */
/* compiled from: PG */
public final /* synthetic */ class C46376an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121395a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121396b;

    public /* synthetic */ C46376an(C46385aw awVar, MessageLite messageLite) {
        this.f121395a = awVar;
        this.f121396b = messageLite;
    }

    public final C60870cx apply(Object obj) {
        C46385aw awVar = this.f121395a;
        return awVar.f121412c.mo45938b(new C46373ak(awVar, this.f121396b, (MessageLite) obj));
    }
}
