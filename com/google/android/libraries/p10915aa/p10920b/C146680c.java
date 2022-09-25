package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.aa.b.c */
/* compiled from: PG */
final class C146680c extends C146684g {

    /* renamed from: a */
    private final C58485gu f396113a;

    public C146680c(C58485gu guVar) {
        this.f396113a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo123434a() {
        return this.f396113a;
    }

    /* renamed from: b */
    public final int mo123435b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146659ag) {
            C146659ag agVar = (C146659ag) obj;
            if (agVar.mo123435b() != 2 || !C58597ky.m90218i(this.f396113a, agVar.mo123434a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396113a.hashCode();
    }

    public final String toString() {
        String obj = this.f396113a.toString();
        return "ProcessedNodeConditions{andConditions=" + obj + "}";
    }
}
