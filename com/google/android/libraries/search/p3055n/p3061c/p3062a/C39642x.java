package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.x */
/* compiled from: PG */
final class C39642x extends C39396al {

    /* renamed from: a */
    public final String f104359a;

    /* renamed from: b */
    public final String f104360b;

    /* renamed from: c */
    public final C58833ax f104361c;

    /* renamed from: d */
    public final C58833ax f104362d;

    public C39642x(String str, String str2, C58833ax axVar, C58833ax axVar2) {
        this.f104359a = str;
        this.f104360b = str2;
        this.f104361c = axVar;
        this.f104362d = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo41814a() {
        return this.f104361c;
    }

    /* renamed from: b */
    public final C58833ax mo41815b() {
        return this.f104362d;
    }

    /* renamed from: c */
    public final String mo41816c() {
        return this.f104360b;
    }

    /* renamed from: d */
    public final String mo41817d() {
        return this.f104359a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39396al) {
            C39396al alVar = (C39396al) obj;
            return this.f104359a.equals(alVar.mo41817d()) && this.f104360b.equals(alVar.mo41816c()) && this.f104361c.equals(alVar.mo41814a()) && this.f104362d.equals(alVar.mo41815b());
        }
    }

    public final int hashCode() {
        return ((((((this.f104359a.hashCode() ^ 1000003) * 1000003) ^ this.f104360b.hashCode()) * 1000003) ^ this.f104361c.hashCode()) * 1000003) ^ this.f104362d.hashCode();
    }

    public final String toString() {
        String str = this.f104359a;
        String str2 = this.f104360b;
        String obj = this.f104361c.toString();
        String obj2 = this.f104362d.toString();
        return "HotwordDetectorConfig{locale=" + str + ", keyPhrase=" + str2 + ", hotwordModel=" + obj + ", speakerIdModel=" + obj2 + "}";
    }
}
