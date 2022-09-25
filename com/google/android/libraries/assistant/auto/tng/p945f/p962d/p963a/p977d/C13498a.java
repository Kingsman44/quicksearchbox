package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a */
/* compiled from: PG */
public final class C13498a extends C13526l {

    /* renamed from: a */
    public final C58485gu f41406a;

    /* renamed from: b */
    public final C58495hd f41407b;

    public C13498a(C58485gu guVar, C58495hd hdVar) {
        if (guVar != null) {
            this.f41406a = guVar;
            this.f41407b = hdVar;
            return;
        }
        throw new NullPointerException("Null displayPreferencesList");
    }

    /* renamed from: a */
    public final C58485gu mo21126a() {
        return this.f41406a;
    }

    /* renamed from: b */
    public final C58495hd mo21127b() {
        return this.f41407b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13526l) {
            C13526l lVar = (C13526l) obj;
            return C58597ky.m90218i(this.f41406a, lVar.mo21126a()) && C58662ni.m90356o(this.f41407b, lVar.mo21127b());
        }
    }

    public final int hashCode() {
        return ((this.f41406a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f41407b.entrySet());
    }

    public final String toString() {
        String obj = this.f41406a.toString();
        String i = C58662ni.m90350i(this.f41407b);
        return "ResponsePostProcessor{displayPreferencesList=" + obj + ", minConfidenceScorePerType=" + i + "}";
    }
}
