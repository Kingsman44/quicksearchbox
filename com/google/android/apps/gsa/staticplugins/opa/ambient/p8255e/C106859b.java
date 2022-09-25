package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.b */
/* compiled from: PG */
final class C106859b extends C107017f {

    /* renamed from: a */
    private final Optional f297743a;

    /* renamed from: b */
    private final C58485gu f297744b;

    /* renamed from: c */
    private final Optional f297745c;

    public C106859b(Optional optional, C58485gu guVar, Optional optional2) {
        this.f297743a = optional;
        this.f297744b = guVar;
        this.f297745c = optional2;
    }

    /* renamed from: a */
    public final C58485gu mo95689a() {
        return this.f297744b;
    }

    /* renamed from: b */
    public final Optional mo95690b() {
        return this.f297743a;
    }

    /* renamed from: c */
    public final Optional mo95691c() {
        return this.f297745c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107017f) {
            C107017f fVar = (C107017f) obj;
            return this.f297743a.equals(fVar.mo95690b()) && C58597ky.m90218i(this.f297744b, fVar.mo95689a()) && this.f297745c.equals(fVar.mo95691c());
        }
    }

    public final int hashCode() {
        return ((((this.f297743a.hashCode() ^ 1000003) * 1000003) ^ this.f297744b.hashCode()) * 1000003) ^ this.f297745c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f297743a);
        String obj = this.f297744b.toString();
        String valueOf2 = String.valueOf(this.f297745c);
        return "Suggestions{smartspaceChip=" + valueOf + ", smartspaceCards=" + obj + ", smartspaceUpdate=" + valueOf2 + "}";
    }
}
