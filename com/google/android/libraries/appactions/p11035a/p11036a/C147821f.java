package com.google.android.libraries.appactions.p11035a.p11036a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.a.a.f */
/* compiled from: PG */
public final class C147821f extends C147817b {

    /* renamed from: a */
    private final Enum f398809a;

    /* renamed from: b */
    private final String f398810b;

    /* renamed from: c */
    private final C58485gu f398811c;

    /* renamed from: d */
    private final String f398812d;

    /* renamed from: e */
    private final String f398813e;

    /* renamed from: f */
    private final String f398814f;

    /* renamed from: g */
    private final String f398815g;

    /* renamed from: h */
    private final Optional f398816h;

    public C147821f(Enum enumR, String str, C58485gu guVar, String str2, String str3, String str4, String str5, Optional optional) {
        this.f398809a = enumR;
        this.f398810b = str;
        this.f398811c = guVar;
        this.f398812d = str2;
        this.f398813e = str3;
        this.f398814f = str4;
        this.f398815g = str5;
        this.f398816h = optional;
    }

    /* renamed from: a */
    public final C58485gu mo124478a() {
        return this.f398811c;
    }

    /* renamed from: b */
    public final Optional mo124479b() {
        return this.f398816h;
    }

    /* renamed from: c */
    public final Enum mo124480c() {
        return this.f398809a;
    }

    /* renamed from: d */
    public final String mo124481d() {
        return this.f398814f;
    }

    /* renamed from: e */
    public final String mo124482e() {
        return this.f398812d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147817b) {
            C147817b bVar = (C147817b) obj;
            return this.f398809a.equals(bVar.mo124480c()) && this.f398810b.equals(bVar.mo124483f()) && C58597ky.m90218i(this.f398811c, bVar.mo124478a()) && this.f398812d.equals(bVar.mo124482e()) && this.f398813e.equals(bVar.mo124485h()) && this.f398814f.equals(bVar.mo124481d()) && this.f398815g.equals(bVar.mo124484g()) && this.f398816h.equals(bVar.mo124479b());
        }
    }

    /* renamed from: f */
    public final String mo124483f() {
        return this.f398810b;
    }

    /* renamed from: g */
    public final String mo124484g() {
        return this.f398815g;
    }

    /* renamed from: h */
    public final String mo124485h() {
        return this.f398813e;
    }

    public final int hashCode() {
        return ((((((((((((((this.f398809a.hashCode() ^ 1000003) * 1000003) ^ this.f398810b.hashCode()) * 1000003) ^ this.f398811c.hashCode()) * 1000003) ^ this.f398812d.hashCode()) * 1000003) ^ this.f398813e.hashCode()) * 1000003) ^ this.f398814f.hashCode()) * 1000003) ^ this.f398815g.hashCode()) * 1000003) ^ this.f398816h.hashCode();
    }

    public final String toString() {
        String obj = this.f398809a.toString();
        String str = this.f398810b;
        String valueOf = String.valueOf(this.f398811c);
        String str2 = this.f398812d;
        String str3 = this.f398813e;
        String str4 = this.f398814f;
        String str5 = this.f398815g;
        String valueOf2 = String.valueOf(this.f398816h);
        return "InventoryEntity{inventoryType=" + obj + ", name=" + str + ", alternateNames=" + valueOf + ", identifier=" + str2 + ", url=" + str3 + ", entitySetId=" + str4 + ", packageName=" + str5 + ", entityType=" + valueOf2 + "}";
    }
}
