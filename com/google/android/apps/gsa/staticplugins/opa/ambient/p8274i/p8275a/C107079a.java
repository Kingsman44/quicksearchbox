package com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.i.a.a */
/* compiled from: PG */
public final class C107079a {

    /* renamed from: a */
    public Optional f298130a = Optional.empty();

    /* renamed from: b */
    public Optional f298131b = Optional.empty();

    /* renamed from: c */
    public byte f298132c;

    /* renamed from: d */
    private Optional f298133d = Optional.empty();

    /* renamed from: a */
    public final C107081c mo95775a() {
        if (this.f298132c == 1) {
            return new C107080b(this.f298133d, this.f298130a, this.f298131b);
        }
        throw new IllegalStateException("Missing required properties: sendFeedbackOnStart");
    }

    /* renamed from: b */
    public final void mo95776b(int i) {
        this.f298133d = Optional.m71637of(Integer.valueOf(i));
    }
}
