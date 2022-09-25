package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.o */
/* compiled from: PG */
public final class C18050o extends C18036cr {

    /* renamed from: a */
    private String f51524a;

    /* renamed from: b */
    private Optional f51525b = Optional.empty();

    /* renamed from: b */
    public final C18037cs mo23506a() {
        String str = this.f51524a;
        if (str != null) {
            return new C18051p(str, this.f51525b);
        }
        throw new IllegalStateException("Missing required properties: searchQuery");
    }

    /* renamed from: c */
    public final void mo23550c(String str) {
        this.f51525b = Optional.m71637of(str);
    }

    /* renamed from: d */
    public final void mo23551d(String str) {
        if (str != null) {
            this.f51524a = str;
            return;
        }
        throw new NullPointerException("Null searchQuery");
    }
}
