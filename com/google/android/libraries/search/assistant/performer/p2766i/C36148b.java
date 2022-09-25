package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.b */
/* compiled from: PG */
final class C36148b extends C36172t {

    /* renamed from: a */
    public final C58495hd f94492a;

    public C36148b(C58495hd hdVar) {
        this.f94492a = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo39986a() {
        return this.f94492a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36172t) {
            return C58662ni.m90356o(this.f94492a, ((C36172t) obj).mo39986a());
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f94492a.entrySet()) ^ 1000003;
    }

    public final String toString() {
        String i = C58662ni.m90350i(this.f94492a);
        return "CreateTimerPerformerConfig{uriQueryParams=" + i + "}";
    }
}
