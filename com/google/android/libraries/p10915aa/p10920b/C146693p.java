package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.aa.b.p */
/* compiled from: PG */
final class C146693p extends C146694q {

    /* renamed from: a */
    private final C58485gu f396124a;

    public C146693p(C58485gu guVar) {
        this.f396124a = guVar;
    }

    /* renamed from: b */
    public final int mo123446b() {
        return 3;
    }

    /* renamed from: e */
    public final C58485gu mo123449e() {
        return this.f396124a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146668ap) {
            C146668ap apVar = (C146668ap) obj;
            if (apVar.mo123446b() != 3 || !C58597ky.m90218i(this.f396124a, apVar.mo123449e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396124a.hashCode();
    }

    public final String toString() {
        String obj = this.f396124a.toString();
        return "ProcessedScreenConditions{orConditions=" + obj + "}";
    }
}
