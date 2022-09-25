package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.g */
/* compiled from: PG */
public final class C81311g extends C81262b {

    /* renamed from: a */
    private final Optional f222577a;

    /* renamed from: b */
    private final C58485gu f222578b;

    /* renamed from: c */
    private final C81303cg f222579c;

    /* renamed from: d */
    private final C81249an f222580d;

    public C81311g(Optional optional, C58485gu guVar, C81303cg cgVar, C81249an anVar) {
        this.f222577a = optional;
        this.f222578b = guVar;
        this.f222579c = cgVar;
        this.f222580d = anVar;
    }

    /* renamed from: a */
    public final C81249an mo74975a() {
        return this.f222580d;
    }

    /* renamed from: b */
    public final C81303cg mo74976b() {
        return this.f222579c;
    }

    /* renamed from: c */
    public final C58485gu mo74977c() {
        return this.f222578b;
    }

    /* renamed from: d */
    public final Optional mo74978d() {
        return this.f222577a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81262b) {
            C81262b bVar = (C81262b) obj;
            return this.f222577a.equals(bVar.mo74978d()) && C58597ky.m90218i(this.f222578b, bVar.mo74977c()) && this.f222579c.equals(bVar.mo74976b()) && this.f222580d.equals(bVar.mo74975a());
        }
    }

    public final int hashCode() {
        return ((((((this.f222577a.hashCode() ^ 1000003) * 1000003) ^ this.f222578b.hashCode()) * 1000003) ^ this.f222579c.hashCode()) * 1000003) ^ this.f222580d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f222577a);
        String obj = this.f222578b.toString();
        String obj2 = this.f222579c.toString();
        String num = Integer.toString(this.f222580d.f222430d);
        return "AccountPreferences{primaryAssistantLocale=" + valueOf + ", assistantLocales=" + obj + ", speechPreferences=" + obj2 + ", assistantScreenContextOptInStatus=" + num + "}";
    }
}
