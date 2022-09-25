package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.f */
/* compiled from: PG */
final class C29403f extends C28721b {

    /* renamed from: a */
    private final C28708an f79720a;

    /* renamed from: b */
    private final C58833ax f79721b;

    /* renamed from: c */
    private final C58833ax f79722c;

    public C29403f(C28708an anVar, C58833ax axVar, C58833ax axVar2) {
        this.f79720a = anVar;
        this.f79721b = axVar;
        this.f79722c = axVar2;
    }

    /* renamed from: a */
    public final C28708an mo34331a() {
        return this.f79720a;
    }

    /* renamed from: b */
    public final C58833ax mo34332b() {
        return this.f79721b;
    }

    /* renamed from: c */
    public final C58833ax mo34333c() {
        return this.f79722c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28721b) {
            C28721b bVar = (C28721b) obj;
            return this.f79720a.equals(bVar.mo34331a()) && this.f79721b.equals(bVar.mo34332b()) && this.f79722c.equals(bVar.mo34333c());
        }
    }

    public final int hashCode() {
        return ((((this.f79720a.hashCode() ^ 1000003) * 1000003) ^ this.f79721b.hashCode()) * 1000003) ^ this.f79722c.hashCode();
    }

    public final String toString() {
        String obj = this.f79720a.toString();
        String valueOf = String.valueOf(this.f79721b);
        String valueOf2 = String.valueOf(this.f79722c);
        return "AddFileGroupRequest{dataFileGroup=" + obj + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + "}";
    }
}
