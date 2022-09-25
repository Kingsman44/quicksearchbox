package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Rect;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.an.b.c */
/* compiled from: PG */
final class C25405c extends C25410h {

    /* renamed from: a */
    private final C58485gu f69241a;

    /* renamed from: b */
    private final Rect f69242b;

    public C25405c(C58485gu guVar, Rect rect) {
        this.f69241a = guVar;
        this.f69242b = rect;
    }

    /* renamed from: a */
    public final Rect mo30457a() {
        return this.f69242b;
    }

    /* renamed from: b */
    public final C58485gu mo30458b() {
        return this.f69241a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25410h) {
            C25410h hVar = (C25410h) obj;
            return C58597ky.m90218i(this.f69241a, hVar.mo30458b()) && this.f69242b.equals(hVar.mo30457a());
        }
    }

    public final int hashCode() {
        return ((this.f69241a.hashCode() ^ 1000003) * 1000003) ^ this.f69242b.hashCode();
    }

    public final String toString() {
        String obj = this.f69241a.toString();
        String obj2 = this.f69242b.toString();
        return "EmbeddingInfo{values=" + obj + ", rect=" + obj2 + "}";
    }
}
