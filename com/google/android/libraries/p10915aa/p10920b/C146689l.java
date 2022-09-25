package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.aa.b.l */
/* compiled from: PG */
final class C146689l extends C146694q {

    /* renamed from: a */
    private final C58485gu f396120a;

    public C146689l(C58485gu guVar) {
        this.f396120a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo123445a() {
        return this.f396120a;
    }

    /* renamed from: b */
    public final int mo123446b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146668ap) {
            C146668ap apVar = (C146668ap) obj;
            if (apVar.mo123446b() != 2 || !C58597ky.m90218i(this.f396120a, apVar.mo123445a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396120a.hashCode();
    }

    public final String toString() {
        String obj = this.f396120a.toString();
        return "ProcessedScreenConditions{andConditions=" + obj + "}";
    }
}
