package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.a */
/* compiled from: PG */
final class C113489a extends C113490b {

    /* renamed from: a */
    private final C58485gu f314229a;

    /* renamed from: b */
    private final int f314230b;

    public C113489a(C58485gu guVar, int i) {
        if (guVar != null) {
            this.f314229a = guVar;
            this.f314230b = i;
            return;
        }
        throw new NullPointerException("Null sequencedTexts");
    }

    /* renamed from: a */
    public final int mo100240a() {
        return this.f314230b;
    }

    /* renamed from: b */
    public final C58485gu mo100241b() {
        return this.f314229a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113490b) {
            C113490b bVar = (C113490b) obj;
            return C58597ky.m90218i(this.f314229a, bVar.mo100241b()) && this.f314230b == bVar.mo100240a();
        }
    }

    public final int hashCode() {
        return ((this.f314229a.hashCode() ^ 1000003) * 1000003) ^ this.f314230b;
    }

    public final String toString() {
        String obj = this.f314229a.toString();
        int i = this.f314230b;
        return "SliceContentReport{sequencedTexts=" + obj + ", actionItemCount=" + i + "}";
    }
}
