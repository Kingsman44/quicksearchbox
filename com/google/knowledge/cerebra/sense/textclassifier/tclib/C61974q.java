package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.q */
/* compiled from: PG */
final class C61974q extends C61955dk {

    /* renamed from: a */
    private final C58485gu f167494a;

    public C61974q(C58485gu guVar) {
        this.f167494a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo58417a() {
        return this.f167494a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61955dk) {
            return C58597ky.m90218i(this.f167494a, ((C61955dk) obj).mo58417a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f167494a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f167494a);
        return "TextLanguage{locales=" + valueOf + "}";
    }
}
