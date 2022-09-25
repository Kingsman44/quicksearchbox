package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.l */
/* compiled from: PG */
final class C18047l extends C17999bh {

    /* renamed from: a */
    private final Optional f51512a;

    /* renamed from: b */
    private final Optional f51513b;

    /* renamed from: c */
    private final Optional f51514c;

    public C18047l(Optional optional, Optional optional2, Optional optional3) {
        this.f51512a = optional;
        this.f51513b = optional2;
        this.f51514c = optional3;
    }

    /* renamed from: a */
    public final Optional mo23533a() {
        return this.f51512a;
    }

    /* renamed from: b */
    public final Optional mo23534b() {
        return this.f51514c;
    }

    /* renamed from: c */
    public final Optional mo23535c() {
        return this.f51513b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17999bh) {
            C17999bh bhVar = (C17999bh) obj;
            return this.f51512a.equals(bhVar.mo23533a()) && this.f51513b.equals(bhVar.mo23535c()) && this.f51514c.equals(bhVar.mo23534b());
        }
    }

    public final int hashCode() {
        return ((((this.f51512a.hashCode() ^ 1000003) * 1000003) ^ this.f51513b.hashCode()) * 1000003) ^ this.f51514c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51512a);
        String valueOf2 = String.valueOf(this.f51513b);
        String valueOf3 = String.valueOf(this.f51514c);
        return "Arguments{experimentIds=" + valueOf + ", userName=" + valueOf2 + ", intent=" + valueOf3 + "}";
    }
}
