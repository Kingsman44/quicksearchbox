package com.google.android.libraries.places.api.p2437b;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.i */
/* compiled from: PG */
public final class C31853i extends C31862r {

    /* renamed from: a */
    private final List f85501a;

    public C31853i(List list) {
        if (list != null) {
            this.f85501a = list;
            return;
        }
        throw new NullPointerException("Null placeLikelihoods");
    }

    /* renamed from: a */
    public final List mo37443a() {
        return this.f85501a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31862r) {
            return this.f85501a.equals(((C31862r) obj).mo37443a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f85501a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f85501a.toString();
        return "FindCurrentPlaceResponse{placeLikelihoods=" + obj + "}";
    }
}
