package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a */
/* compiled from: PG */
final class C103046a extends C103091i {

    /* renamed from: a */
    public String f287665a;

    /* renamed from: b */
    private Optional f287666b = Optional.empty();

    public C103046a() {
    }

    /* renamed from: a */
    public final C103092j mo93584a() {
        String str = this.f287665a;
        if (str != null) {
            return new C103081b(str, this.f287666b);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    /* renamed from: b */
    public final void mo93585b(String str) {
        if (str != null) {
            this.f287665a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: c */
    public final void mo93586c(Optional optional) {
        if (optional != null) {
            this.f287666b = optional;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public C103046a(C103092j jVar) {
        C103081b bVar = (C103081b) jVar;
        this.f287665a = bVar.f287718a;
        this.f287666b = bVar.f287719b;
    }
}
