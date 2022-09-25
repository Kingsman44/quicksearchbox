package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ads */
/* compiled from: PG */
final class C6784ads {

    /* renamed from: a */
    public final Object f20383a;

    /* renamed from: b */
    private boolean f20384b;

    public C6784ads(Object obj) {
        this.f20383a = obj;
    }

    /* renamed from: a */
    public final void mo14507a() {
        this.f20384b = true;
    }

    /* renamed from: b */
    public final void mo14508b(adr adr) {
        if (!this.f20384b) {
            adr.mo14506a(this.f20383a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f20383a.equals(((C6784ads) obj).f20383a);
    }

    public final int hashCode() {
        return this.f20383a.hashCode();
    }
}
