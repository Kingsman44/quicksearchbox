package com.google.android.libraries.p11027an.p11028a;

import java.util.List;

/* renamed from: com.google.android.libraries.an.a.a */
/* compiled from: PG */
public final class C147765a extends C147766b {

    /* renamed from: a */
    public final String f398710a;

    /* renamed from: b */
    private final List f398711b;

    public C147765a(String str, List list) {
        this.f398710a = str;
        this.f398711b = list;
    }

    /* renamed from: a */
    public final String mo124439a() {
        return this.f398710a;
    }

    /* renamed from: b */
    public final List mo124440b() {
        return this.f398711b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147766b) {
            C147766b bVar = (C147766b) obj;
            return this.f398710a.equals(bVar.mo124439a()) && this.f398711b.equals(bVar.mo124440b());
        }
    }

    public final int hashCode() {
        return ((this.f398710a.hashCode() ^ 1000003) * 1000003) ^ this.f398711b.hashCode();
    }

    public final String toString() {
        String str = this.f398710a;
        String obj = this.f398711b.toString();
        return "SafeSql{query=" + str + ", queryArgs=" + obj + "}";
    }
}
