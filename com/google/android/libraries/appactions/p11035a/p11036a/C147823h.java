package com.google.android.libraries.appactions.p11035a.p11036a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.a.a.h */
/* compiled from: PG */
public final class C147823h extends C147824i {

    /* renamed from: a */
    private final String f398819a;

    /* renamed from: b */
    private final String f398820b;

    /* renamed from: c */
    private final Optional f398821c;

    public C147823h(String str, String str2, Optional optional) {
        this.f398819a = str;
        this.f398820b = str2;
        this.f398821c = optional;
    }

    /* renamed from: a */
    public final Optional mo124494a() {
        return this.f398821c;
    }

    /* renamed from: b */
    public final String mo124495b() {
        return this.f398820b;
    }

    /* renamed from: c */
    public final String mo124496c() {
        return this.f398819a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147824i) {
            C147824i iVar = (C147824i) obj;
            return this.f398819a.equals(iVar.mo124496c()) && this.f398820b.equals(iVar.mo124495b()) && this.f398821c.equals(iVar.mo124494a());
        }
    }

    public final int hashCode() {
        return ((((this.f398819a.hashCode() ^ 1000003) * 1000003) ^ this.f398820b.hashCode()) * 1000003) ^ this.f398821c.hashCode();
    }

    public final String toString() {
        String str = this.f398819a;
        String str2 = this.f398820b;
        String valueOf = String.valueOf(this.f398821c);
        return "PersonalInventoryParameter{paramName=" + str + ", entityType=" + str2 + ", entitySetId=" + valueOf + "}";
    }
}
