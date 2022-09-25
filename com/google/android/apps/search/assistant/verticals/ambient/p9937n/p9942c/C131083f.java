package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.f */
/* compiled from: PG */
final class C131083f extends C131080c {

    /* renamed from: a */
    private final String f358539a;

    /* renamed from: b */
    private final Optional f358540b;

    /* renamed from: c */
    private final C131079b f358541c;

    /* renamed from: d */
    private final Instant f358542d;

    /* renamed from: e */
    private final Instant f358543e;

    public C131083f(String str, Optional optional, C131079b bVar, Instant instant, Instant instant2) {
        this.f358539a = str;
        this.f358540b = optional;
        this.f358541c = bVar;
        this.f358542d = instant;
        this.f358543e = instant2;
    }

    /* renamed from: a */
    public final C131079b mo110041a() {
        return this.f358541c;
    }

    /* renamed from: b */
    public final Instant mo110042b() {
        return this.f358543e;
    }

    /* renamed from: c */
    public final Instant mo110043c() {
        return this.f358542d;
    }

    /* renamed from: d */
    public final Optional mo110044d() {
        return this.f358540b;
    }

    /* renamed from: e */
    public final String mo110045e() {
        return this.f358539a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131080c) {
            C131080c cVar = (C131080c) obj;
            return this.f358539a.equals(cVar.mo110045e()) && this.f358540b.equals(cVar.mo110044d()) && this.f358541c.equals(cVar.mo110041a()) && this.f358542d.equals(cVar.mo110043c()) && this.f358543e.equals(cVar.mo110042b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f358539a.hashCode() ^ 1000003) * 1000003) ^ this.f358540b.hashCode()) * 1000003) ^ this.f358541c.hashCode()) * 1000003) ^ this.f358542d.hashCode()) * 1000003) ^ this.f358543e.hashCode();
    }

    public final String toString() {
        String str = this.f358539a;
        String valueOf = String.valueOf(this.f358540b);
        String obj = this.f358541c.toString();
        String obj2 = this.f358542d.toString();
        String obj3 = this.f358543e.toString();
        return "AppEvent{packageName=" + str + ", packageClass=" + valueOf + ", eventType=" + obj + ", eventStart=" + obj2 + ", eventEnd=" + obj3 + "}";
    }
}
