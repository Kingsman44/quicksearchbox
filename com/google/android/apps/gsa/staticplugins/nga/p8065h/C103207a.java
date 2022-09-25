package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.a */
/* compiled from: PG */
final class C103207a extends C103295x {

    /* renamed from: a */
    private final String f287970a;

    /* renamed from: b */
    private final Optional f287971b;

    /* renamed from: c */
    private final int f287972c;

    public C103207a(String str, Optional optional, int i) {
        this.f287970a = str;
        if (optional != null) {
            this.f287971b = optional;
            this.f287972c = i;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final int mo93702a() {
        return this.f287972c;
    }

    /* renamed from: b */
    public final Optional mo93703b() {
        return this.f287971b;
    }

    /* renamed from: c */
    public final String mo93704c() {
        return this.f287970a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103295x) {
            C103295x xVar = (C103295x) obj;
            return this.f287970a.equals(xVar.mo93704c()) && this.f287971b.equals(xVar.mo93703b()) && this.f287972c == xVar.mo93702a();
        }
    }

    public final int hashCode() {
        return ((((this.f287970a.hashCode() ^ 1000003) * 1000003) ^ this.f287971b.hashCode()) * 1000003) ^ this.f287972c;
    }

    public final String toString() {
        String str = this.f287970a;
        String obj = this.f287971b.toString();
        int i = this.f287972c;
        return "IcingApp{name=" + str + ", packageName=" + obj + ", documentId=" + i + "}";
    }
}
