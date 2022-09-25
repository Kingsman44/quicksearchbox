package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8508f;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.f.a */
/* compiled from: PG */
public final class C111519a extends C111520b {

    /* renamed from: b */
    private final String f310190b;

    /* renamed from: c */
    private final C58485gu f310191c;

    /* renamed from: d */
    private final C58485gu f310192d;

    /* renamed from: e */
    private final C58485gu f310193e;

    public C111519a(String str, C58485gu guVar, C58485gu guVar2, C58485gu guVar3) {
        this.f310190b = str;
        if (guVar != null) {
            this.f310191c = guVar;
            if (guVar2 != null) {
                this.f310192d = guVar2;
                if (guVar3 != null) {
                    this.f310193e = guVar3;
                    return;
                }
                throw new NullPointerException("Null styledTextCorrections");
            }
            throw new NullPointerException("Null htmlCorrections");
        }
        throw new NullPointerException("Null corrections");
    }

    /* renamed from: a */
    public final C58485gu mo99161a() {
        return this.f310191c;
    }

    /* renamed from: b */
    public final C58485gu mo99162b() {
        return this.f310192d;
    }

    /* renamed from: c */
    public final C58485gu mo99163c() {
        return this.f310193e;
    }

    /* renamed from: d */
    public final String mo99164d() {
        return this.f310190b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111520b) {
            C111520b bVar = (C111520b) obj;
            return this.f310190b.equals(bVar.mo99164d()) && C58597ky.m90218i(this.f310191c, bVar.mo99161a()) && C58597ky.m90218i(this.f310192d, bVar.mo99162b()) && C58597ky.m90218i(this.f310193e, bVar.mo99163c());
        }
    }

    public final int hashCode() {
        return ((((((this.f310190b.hashCode() ^ 1000003) * 1000003) ^ this.f310191c.hashCode()) * 1000003) ^ this.f310192d.hashCode()) * 1000003) ^ this.f310193e.hashCode();
    }

    public final String toString() {
        String str = this.f310190b;
        String obj = this.f310191c.toString();
        String obj2 = this.f310192d.toString();
        String obj3 = this.f310193e.toString();
        return "PrefetchedCorrections{prefix=" + str + ", corrections=" + obj + ", htmlCorrections=" + obj2 + ", styledTextCorrections=" + obj3 + "}";
    }
}
