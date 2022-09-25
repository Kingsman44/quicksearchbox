package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.ac.b.c.b.d */
/* compiled from: PG */
final class C146807d extends C146815l {

    /* renamed from: c */
    private final C58485gu f396364c;

    public C146807d(C58485gu guVar) {
        this.f396364c = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo123679a() {
        return this.f396364c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146815l) {
            return C58597ky.m90218i(this.f396364c, ((C146815l) obj).mo123679a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f396364c.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f396364c);
        return "CoreLatestFootprintsFilter{secondaryIdMatchers=" + valueOf + "}";
    }
}
