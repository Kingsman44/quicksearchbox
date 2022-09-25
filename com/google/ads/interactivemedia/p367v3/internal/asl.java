package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asl */
/* compiled from: PG */
final class asl extends asc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final asc f21499a;

    public asl(asc asc) {
        this.f21499a = asc;
    }

    /* renamed from: a */
    public final asc mo15341a() {
        return this.f21499a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f21499a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asl) {
            return this.f21499a.equals(((asl) obj).f21499a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f21499a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21499a);
        String.valueOf(valueOf).length();
        return String.valueOf(valueOf).concat(".reverse()");
    }
}
