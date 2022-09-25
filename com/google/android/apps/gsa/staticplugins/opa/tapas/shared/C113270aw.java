package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.aw */
/* compiled from: PG */
final class C113270aw extends C113363dd {

    /* renamed from: a */
    private final C58485gu f313654a;

    /* renamed from: b */
    private final boolean f313655b;

    /* renamed from: c */
    private final int f313656c;

    public C113270aw(C58485gu guVar, boolean z, int i) {
        this.f313654a = guVar;
        this.f313655b = z;
        this.f313656c = i;
    }

    /* renamed from: a */
    public final int mo99990a() {
        return this.f313656c;
    }

    /* renamed from: b */
    public final C58485gu mo99991b() {
        return this.f313654a;
    }

    /* renamed from: c */
    public final boolean mo99992c() {
        return this.f313655b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113363dd) {
            C113363dd ddVar = (C113363dd) obj;
            return C58597ky.m90218i(this.f313654a, ddVar.mo99991b()) && this.f313655b == ddVar.mo99992c() && this.f313656c == ddVar.mo99990a();
        }
    }

    public final int hashCode() {
        return ((((this.f313654a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f313655b ? 1237 : 1231)) * 1000003) ^ this.f313656c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f313654a);
        boolean z = this.f313655b;
        int i = this.f313656c;
        return "IconRenderingParams{iconCandidates=" + valueOf + ", isCircular=" + z + ", placeholderColor=" + i + "}";
    }
}
