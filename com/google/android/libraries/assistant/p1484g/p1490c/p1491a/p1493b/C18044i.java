package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.i */
/* compiled from: PG */
public final class C18044i extends C17987aw {

    /* renamed from: a */
    private Optional f51505a = Optional.empty();

    /* renamed from: b */
    private String f51506b;

    /* renamed from: b */
    public final C17988ax mo23506a() {
        String str = this.f51506b;
        if (str != null) {
            return new C18045j(this.f51505a, str);
        }
        throw new IllegalStateException("Missing required properties: searchQuery");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo23545c(String str) {
        this.f51505a = Optional.m71637of(str);
    }

    /* renamed from: d */
    public final void mo23524d(String str) {
        if (str != null) {
            this.f51506b = str;
            return;
        }
        throw new NullPointerException("Null searchQuery");
    }
}
