package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.g.a.a */
/* compiled from: PG */
final class C39715a extends C39731b {

    /* renamed from: a */
    private final C58485gu f104515a;

    /* renamed from: b */
    private final Optional f104516b;

    /* renamed from: c */
    private final Optional f104517c;

    /* renamed from: d */
    private final Optional f104518d;

    public C39715a(C58485gu guVar, Optional optional, Optional optional2, Optional optional3) {
        if (guVar != null) {
            this.f104515a = guVar;
            if (optional != null) {
                this.f104516b = optional;
                if (optional2 != null) {
                    this.f104517c = optional2;
                    if (optional3 != null) {
                        this.f104518d = optional3;
                        return;
                    }
                    throw new NullPointerException("Null installedTdsidModel");
                }
                throw new NullPointerException("Null installedHotmatchModelPath");
            }
            throw new NullPointerException("Null installedHotwordModel");
        }
        throw new NullPointerException("Null installedLanguagePacks");
    }

    /* renamed from: a */
    public final C58485gu mo41999a() {
        return this.f104515a;
    }

    /* renamed from: b */
    public final Optional mo42000b() {
        return this.f104517c;
    }

    /* renamed from: c */
    public final Optional mo42001c() {
        return this.f104516b;
    }

    /* renamed from: d */
    public final Optional mo42002d() {
        return this.f104518d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39731b) {
            C39731b bVar = (C39731b) obj;
            return C58597ky.m90218i(this.f104515a, bVar.mo41999a()) && this.f104516b.equals(bVar.mo42001c()) && this.f104517c.equals(bVar.mo42000b()) && this.f104518d.equals(bVar.mo42002d());
        }
    }

    public final int hashCode() {
        return ((((((this.f104515a.hashCode() ^ 1000003) * 1000003) ^ this.f104516b.hashCode()) * 1000003) ^ this.f104517c.hashCode()) * 1000003) ^ this.f104518d.hashCode();
    }

    public final String toString() {
        String obj = this.f104515a.toString();
        String obj2 = this.f104516b.toString();
        String obj3 = this.f104517c.toString();
        String obj4 = this.f104518d.toString();
        return "SodaResourceCollection{installedLanguagePacks=" + obj + ", installedHotwordModel=" + obj2 + ", installedHotmatchModelPath=" + obj3 + ", installedTdsidModel=" + obj4 + "}";
    }
}
