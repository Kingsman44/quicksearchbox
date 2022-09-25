package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.z */
/* compiled from: PG */
final class C82018z extends C81974ak {

    /* renamed from: a */
    private final Optional f224218a;

    /* renamed from: b */
    private final Optional f224219b;

    public C82018z(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f224218a = optional;
            if (optional2 != null) {
                this.f224219b = optional2;
                return;
            }
            throw new NullPointerException("Null textFont");
        }
        throw new NullPointerException("Null titleFont");
    }

    /* renamed from: a */
    public final Optional mo75421a() {
        return this.f224219b;
    }

    /* renamed from: b */
    public final Optional mo75422b() {
        return this.f224218a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81974ak) {
            C81974ak akVar = (C81974ak) obj;
            return this.f224218a.equals(akVar.mo75422b()) && this.f224219b.equals(akVar.mo75421a());
        }
    }

    public final int hashCode() {
        return ((this.f224218a.hashCode() ^ 1000003) * 1000003) ^ this.f224219b.hashCode();
    }

    public final String toString() {
        String obj = this.f224218a.toString();
        String obj2 = this.f224219b.toString();
        return "LoadedFonts{titleFont=" + obj + ", textFont=" + obj2 + "}";
    }
}
