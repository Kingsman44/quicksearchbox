package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.a */
/* compiled from: PG */
final class C36121a extends C36158f {

    /* renamed from: a */
    public final C58495hd f94458a;

    public C36121a(C58495hd hdVar) {
        this.f94458a = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo39973a() {
        return this.f94458a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36158f) {
            return C58662ni.m90356o(this.f94458a, ((C36158f) obj).mo39973a());
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f94458a.entrySet()) ^ 1000003;
    }

    public final String toString() {
        String i = C58662ni.m90350i(this.f94458a);
        return "CreateAlarmPerformerConfig{uriQueryParams=" + i + "}";
    }
}
