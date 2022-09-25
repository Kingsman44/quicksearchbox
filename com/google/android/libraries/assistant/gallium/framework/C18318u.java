package com.google.android.libraries.assistant.gallium.framework;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.u */
/* compiled from: PG */
public final /* synthetic */ class C18318u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Optional f51957a;

    /* renamed from: b */
    public final /* synthetic */ String f51958b;

    public /* synthetic */ C18318u(Optional optional, String str) {
        this.f51957a = optional;
        this.f51958b = str;
    }

    public final void run() {
        Optional optional = this.f51957a;
        String str = this.f51958b;
        int i = GalliumIpc.f51688h;
        optional.ifPresent(new C18323z(str));
    }
}
