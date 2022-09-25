package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.f */
/* compiled from: PG */
final class C103277f extends C103244bj {

    /* renamed from: a */
    private final C58485gu f288067a;

    /* renamed from: b */
    private final boolean f288068b;

    /* renamed from: c */
    private final int f288069c;

    /* renamed from: d */
    private final Optional f288070d;

    public C103277f(C58485gu guVar, boolean z, int i, Optional optional) {
        if (guVar != null) {
            this.f288067a = guVar;
            this.f288068b = z;
            this.f288069c = i;
            if (optional != null) {
                this.f288070d = optional;
                return;
            }
            throw new NullPointerException("Null errorMessage");
        }
        throw new NullPointerException("Null searchResults");
    }

    /* renamed from: a */
    public final int mo93721a() {
        return this.f288069c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58485gu mo93722b() {
        return this.f288067a;
    }

    /* renamed from: c */
    public final Optional mo93723c() {
        return this.f288070d;
    }

    /* renamed from: d */
    public final boolean mo93724d() {
        return this.f288068b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103244bj) {
            C103244bj bjVar = (C103244bj) obj;
            return C58597ky.m90218i(this.f288067a, bjVar.mo93722b()) && this.f288068b == bjVar.mo93724d() && this.f288069c == bjVar.mo93721a() && this.f288070d.equals(bjVar.mo93723c());
        }
    }

    public final int hashCode() {
        return ((((((this.f288067a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f288068b ? 1237 : 1231)) * 1000003) ^ this.f288069c) * 1000003) ^ this.f288070d.hashCode();
    }

    public final String toString() {
        String obj = this.f288067a.toString();
        boolean z = this.f288068b;
        int i = this.f288069c;
        String obj2 = this.f288070d.toString();
        return "IcingQueryResults{searchResults=" + obj + ", hasErrors=" + z + ", resultsCount=" + i + ", errorMessage=" + obj2 + "}";
    }
}
