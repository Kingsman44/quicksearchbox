package com.google.android.apps.search.googleapp.compliance.p10144a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.a */
/* compiled from: PG */
public final class C133531a extends C133568s {

    /* renamed from: a */
    public int f363831a;

    /* renamed from: b */
    public int f363832b;

    /* renamed from: c */
    private boolean f363833c;

    /* renamed from: d */
    private Optional f363834d = Optional.empty();

    /* renamed from: e */
    private byte f363835e;

    /* renamed from: a */
    public final C133570u mo111242a() {
        if (this.f363835e == 1 && this.f363831a != 0) {
            return new C133551b(this.f363833c, this.f363832b, this.f363834d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f363831a == 0) {
            sb.append(" preference");
        }
        if (this.f363835e == 0) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo111243b(boolean z) {
        this.f363834d = Optional.m71637of(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo111244c(boolean z) {
        this.f363833c = z;
        this.f363835e = 1;
    }
}
