package com.google.apps.tiktok.cache;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.av */
/* compiled from: PG */
public final /* synthetic */ class C46384av implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121408a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f121409b;

    public /* synthetic */ C46384av(C46385aw awVar, MessageLite messageLite) {
        this.f121408a = awVar;
        this.f121409b = messageLite;
    }

    public final C60870cx apply(Object obj) {
        C46385aw awVar = this.f121408a;
        return awVar.f121412c.mo45937a(new C46372aj(awVar, this.f121409b, (MessageLite) obj));
    }
}
