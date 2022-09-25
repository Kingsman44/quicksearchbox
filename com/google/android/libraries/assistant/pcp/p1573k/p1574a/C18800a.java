package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.pm.PackageItemInfo;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.a */
/* compiled from: PG */
final class C18800a extends C18906u {

    /* renamed from: a */
    private final Long f52937a;

    /* renamed from: b */
    private final PackageItemInfo f52938b;

    public C18800a(Long l, PackageItemInfo packageItemInfo) {
        this.f52937a = l;
        if (packageItemInfo != null) {
            this.f52938b = packageItemInfo;
            return;
        }
        throw new NullPointerException("Null packageItemInfo");
    }

    /* renamed from: a */
    public final PackageItemInfo mo24154a() {
        return this.f52938b;
    }

    /* renamed from: b */
    public final Long mo24155b() {
        return this.f52937a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18906u) {
            C18906u uVar = (C18906u) obj;
            return this.f52937a.equals(uVar.mo24155b()) && this.f52938b.equals(uVar.mo24154a());
        }
    }

    public final int hashCode() {
        return ((this.f52937a.hashCode() ^ 1000003) * 1000003) ^ this.f52938b.hashCode();
    }

    public final String toString() {
        Long l = this.f52937a;
        String obj = this.f52938b.toString();
        return "PackageItems{lastUsed=" + l + ", packageItemInfo=" + obj + "}";
    }
}
