package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqs */
/* compiled from: PG */
final class aqs extends asc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f21406a;

    public aqs(Comparator comparator) {
        aqd.m19282j(comparator);
        this.f21406a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f21406a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqs) {
            return this.f21406a.equals(((aqs) obj).f21406a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21406a.hashCode();
    }

    public final String toString() {
        return this.f21406a.toString();
    }
}
