package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.a.i */
/* compiled from: PG */
final class C5716i implements C5955n {

    /* renamed from: b */
    private final C5955n f17217b;

    /* renamed from: c */
    private final C5955n f17218c;

    public C5716i(C5955n nVar, C5955n nVar2) {
        this.f17217b = nVar;
        this.f17218c = nVar2;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        this.f17217b.mo12041a(messageDigest);
        this.f17218c.mo12041a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5716i) {
            C5716i iVar = (C5716i) obj;
            if (!this.f17217b.equals(iVar.f17217b) || !this.f17218c.equals(iVar.f17218c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17217b.hashCode() * 31) + this.f17218c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17217b);
        String valueOf2 = String.valueOf(this.f17218c);
        return "DataCacheKey{sourceKey=" + valueOf + ", signature=" + valueOf2 + "}";
    }
}
