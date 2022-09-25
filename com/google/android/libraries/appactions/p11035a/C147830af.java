package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.appactions.a.af */
/* compiled from: PG */
final class C147830af extends C147833ai {

    /* renamed from: a */
    private final C58485gu f398838a;

    public C147830af(C58485gu guVar) {
        this.f398838a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo124513a() {
        return this.f398838a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147833ai) {
            return C58597ky.m90218i(this.f398838a, ((C147833ai) obj).mo124513a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f398838a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f398838a);
        return "IntentFulfillmentOptions{fulfillmentOptions=" + valueOf + "}";
    }
}
