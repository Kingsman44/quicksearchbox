package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.b */
/* compiled from: PG */
final class C103081b extends C103092j {

    /* renamed from: a */
    public final String f287718a;

    /* renamed from: b */
    public final Optional f287719b;

    public C103081b(String str, Optional optional) {
        this.f287718a = str;
        this.f287719b = optional;
    }

    /* renamed from: a */
    public final C103091i mo93598a() {
        return new C103046a(this);
    }

    /* renamed from: b */
    public final Optional mo93599b() {
        return this.f287719b;
    }

    /* renamed from: c */
    public final String mo93600c() {
        return this.f287718a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103092j) {
            C103092j jVar = (C103092j) obj;
            return this.f287718a.equals(jVar.mo93600c()) && this.f287719b.equals(jVar.mo93599b());
        }
    }

    public final int hashCode() {
        return ((this.f287718a.hashCode() ^ 1000003) * 1000003) ^ this.f287719b.hashCode();
    }

    public final String toString() {
        String str = this.f287718a;
        String valueOf = String.valueOf(this.f287719b);
        return "IcingApp{name=" + str + ", packageName=" + valueOf + "}";
    }
}
