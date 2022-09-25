package com.google.android.libraries.p10923ac.p10947c;

import java.util.List;

/* renamed from: com.google.android.libraries.ac.c.a */
/* compiled from: PG */
public final class C147199a extends C147204f {

    /* renamed from: a */
    public final List f397414a;

    public C147199a(List list) {
        this.f397414a = list;
    }

    /* renamed from: a */
    public final List mo124014a() {
        return this.f397414a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147204f) {
            return this.f397414a.equals(((C147204f) obj).mo124014a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f397414a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f397414a.toString();
        return "LatestFootprintsFilter{secondaryIdMatchers=" + obj + "}";
    }
}
