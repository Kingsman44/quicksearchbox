package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.c */
/* compiled from: PG */
final class C36155c extends C36153be {

    /* renamed from: a */
    public final C58495hd f94502a;

    public C36155c(C58495hd hdVar) {
        this.f94502a = hdVar;
    }

    /* renamed from: a */
    public final C58495hd mo39990a() {
        return this.f94502a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36153be) {
            return C58662ni.m90356o(this.f94502a, ((C36153be) obj).mo39990a());
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f94502a.entrySet()) ^ 1000003;
    }

    public final String toString() {
        String i = C58662ni.m90350i(this.f94502a);
        return "UpdateTimerPerformerConfig{uriQueryParams=" + i + "}";
    }
}
