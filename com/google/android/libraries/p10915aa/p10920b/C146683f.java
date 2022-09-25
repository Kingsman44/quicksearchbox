package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.aa.b.f */
/* compiled from: PG */
final class C146683f extends C146684g {

    /* renamed from: a */
    private final C58485gu f396116a;

    public C146683f(C58485gu guVar) {
        this.f396116a = guVar;
    }

    /* renamed from: b */
    public final int mo123435b() {
        return 3;
    }

    /* renamed from: d */
    public final C58485gu mo123437d() {
        return this.f396116a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146659ag) {
            C146659ag agVar = (C146659ag) obj;
            if (agVar.mo123435b() != 3 || !C58597ky.m90218i(this.f396116a, agVar.mo123437d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396116a.hashCode();
    }

    public final String toString() {
        String obj = this.f396116a.toString();
        return "ProcessedNodeConditions{orConditions=" + obj + "}";
    }
}
