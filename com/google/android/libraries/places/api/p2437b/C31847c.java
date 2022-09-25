package com.google.android.libraries.places.api.p2437b;

import com.google.android.libraries.places.api.model.Place;

/* renamed from: com.google.android.libraries.places.api.b.c */
/* compiled from: PG */
public final class C31847c extends C31856l {

    /* renamed from: a */
    private final Place f85481a;

    public C31847c(Place place) {
        if (place != null) {
            this.f85481a = place;
            return;
        }
        throw new NullPointerException("Null place");
    }

    /* renamed from: a */
    public final Place mo37413a() {
        return this.f85481a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31856l) {
            return this.f85481a.equals(((C31856l) obj).mo37413a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f85481a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f85481a.toString();
        return "FetchPlaceResponse{place=" + obj + "}";
    }
}
