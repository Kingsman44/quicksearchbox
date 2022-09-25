package com.google.android.apps.p471d.p472a.p477b.p478a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.d.a.b.a.f */
/* compiled from: PG */
public final class C9033f extends C9031d {

    /* renamed from: a */
    public final C58485gu f31233a;

    public C9033f(C58485gu guVar) {
        if (guVar != null) {
            this.f31233a = guVar;
            return;
        }
        throw new NullPointerException("Null alternativeSpans");
    }

    /* renamed from: b */
    public final C58485gu mo17320b() {
        return this.f31233a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9031d) {
            return C58597ky.m90218i(this.f31233a, ((C9031d) obj).mo17320b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f31233a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f31233a.toString();
        return "AlternativeSpans{alternativeSpans=" + obj + "}";
    }
}
