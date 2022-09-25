package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.social.populous.$AutoValue_IdentityInfo  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_IdentityInfo extends IdentityInfo {

    /* renamed from: a */
    public final C58485gu f110331a;

    public C$AutoValue_IdentityInfo(C58485gu guVar) {
        if (guVar != null) {
            this.f110331a = guVar;
            return;
        }
        throw new NullPointerException("Null sourceIdsList");
    }

    /* renamed from: a */
    public final C58485gu mo44793a() {
        return this.f110331a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IdentityInfo) {
            return C58597ky.m90218i(this.f110331a, ((IdentityInfo) obj).mo44793a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f110331a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f110331a.toString();
        return "IdentityInfo{sourceIdsList=" + obj + "}";
    }
}
