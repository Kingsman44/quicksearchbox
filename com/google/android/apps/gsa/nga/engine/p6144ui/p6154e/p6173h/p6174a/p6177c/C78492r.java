package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.r */
/* compiled from: PG */
final class C78492r extends C78393bp {

    /* renamed from: a */
    public final C83358h f216168a;

    /* renamed from: b */
    public final Optional f216169b;

    /* renamed from: c */
    public final Optional f216170c;

    /* renamed from: d */
    public final Optional f216171d;

    /* renamed from: e */
    public final Optional f216172e;

    public C78492r(C83358h hVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.f216168a = hVar;
        this.f216169b = optional;
        this.f216170c = optional2;
        this.f216171d = optional3;
        this.f216172e = optional4;
    }

    /* renamed from: a */
    public final C78392bo mo73354a() {
        return new C78491q(this);
    }

    /* renamed from: b */
    public final C83358h mo73355b() {
        return this.f216168a;
    }

    /* renamed from: c */
    public final Optional mo73356c() {
        return this.f216169b;
    }

    /* renamed from: d */
    public final Optional mo73357d() {
        return this.f216170c;
    }

    /* renamed from: e */
    public final Optional mo73358e() {
        return this.f216171d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78393bp) {
            C78393bp bpVar = (C78393bp) obj;
            return this.f216168a.equals(bpVar.mo73355b()) && this.f216169b.equals(bpVar.mo73356c()) && this.f216170c.equals(bpVar.mo73357d()) && this.f216171d.equals(bpVar.mo73358e()) && this.f216172e.equals(bpVar.mo73359f());
        }
    }

    /* renamed from: f */
    public final Optional mo73359f() {
        return this.f216172e;
    }

    public final int hashCode() {
        return ((((((((this.f216168a.hashCode() ^ 1000003) * 1000003) ^ this.f216169b.hashCode()) * 1000003) ^ this.f216170c.hashCode()) * 1000003) ^ this.f216171d.hashCode()) * 1000003) ^ this.f216172e.hashCode();
    }

    public final String toString() {
        String obj = this.f216168a.toString();
        String valueOf = String.valueOf(this.f216169b);
        String valueOf2 = String.valueOf(this.f216170c);
        String valueOf3 = String.valueOf(this.f216171d);
        String valueOf4 = String.valueOf(this.f216172e);
        return "Content{greeting=" + obj + ", freSuggestion=" + valueOf + ", staticText=" + valueOf2 + ", suggestionChips=" + valueOf3 + ", tactileChips=" + valueOf4 + "}";
    }
}
