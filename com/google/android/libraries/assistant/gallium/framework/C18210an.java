package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.an */
/* compiled from: PG */
final class C18210an implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f51734a;

    /* renamed from: b */
    final /* synthetic */ String f51735b;

    /* renamed from: c */
    final /* synthetic */ C18213aq f51736c;

    public C18210an(SettableFuture settableFuture, String str, C18213aq aqVar) {
        this.f51734a = settableFuture;
        this.f51735b = str;
        this.f51736c = aqVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f51734a.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        if (messageLite == null) {
            this.f51734a.mo57357o(new NullPointerException(String.valueOf(this.f51735b).concat("(...) returned a Future resolving to NULL. Gallium Interface methods are not allowed to return NULL!")));
        } else {
            this.f51734a.mo57356n(this.f51736c.mo23695a(messageLite));
        }
    }
}
