package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abb */
/* compiled from: PG */
public final class abb {

    /* renamed from: a */
    public final int f20171a;

    /* renamed from: b */
    private final aba[] f20172b;

    /* renamed from: c */
    private int f20173c;

    public abb(aba... abaArr) {
        this.f20172b = abaArr;
        this.f20171a = abaArr.length;
    }

    /* renamed from: a */
    public final aba mo14373a(int i) {
        return this.f20172b[i];
    }

    /* renamed from: b */
    public final aba[] mo14374b() {
        return (aba[]) this.f20172b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20172b, ((abb) obj).f20172b);
    }

    public final int hashCode() {
        int i = this.f20173c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f20172b) + 527;
        this.f20173c = hashCode;
        return hashCode;
    }
}
