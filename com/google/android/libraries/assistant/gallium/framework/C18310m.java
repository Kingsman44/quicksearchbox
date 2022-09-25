package com.google.android.libraries.assistant.gallium.framework;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.m */
/* compiled from: PG */
public final /* synthetic */ class C18310m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Optional f51947a;

    /* renamed from: b */
    public final /* synthetic */ String f51948b;

    public /* synthetic */ C18310m(Optional optional, String str) {
        this.f51947a = optional;
        this.f51948b = str;
    }

    public final void run() {
        Optional optional = this.f51947a;
        String str = this.f51948b;
        int i = GalliumCoreso.f51687b;
        optional.ifPresent(new C18312o(str));
    }
}
