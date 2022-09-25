package com.google.android.apps.gsa.nga.engine.p6273z;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.a */
/* compiled from: PG */
final class C80030a extends C80035f {

    /* renamed from: a */
    public final Optional f219621a;

    /* renamed from: b */
    public final Optional f219622b;

    public C80030a(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f219621a = optional;
            if (optional2 != null) {
                this.f219622b = optional2;
                return;
            }
            throw new NullPointerException("Null rssHwmInKb");
        }
        throw new NullPointerException("Null rssInKb");
    }

    /* renamed from: a */
    public final Optional mo74277a() {
        return this.f219622b;
    }

    /* renamed from: b */
    public final Optional mo74278b() {
        return this.f219621a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80035f) {
            C80035f fVar = (C80035f) obj;
            return this.f219621a.equals(fVar.mo74278b()) && this.f219622b.equals(fVar.mo74277a());
        }
    }

    public final int hashCode() {
        return ((this.f219621a.hashCode() ^ 1000003) * 1000003) ^ this.f219622b.hashCode();
    }

    public final String toString() {
        String obj = this.f219621a.toString();
        String obj2 = this.f219622b.toString();
        return "RssMemoryUsage{rssInKb=" + obj + ", rssHwmInKb=" + obj2 + "}";
    }
}
