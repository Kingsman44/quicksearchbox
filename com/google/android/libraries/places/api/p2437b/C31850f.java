package com.google.android.libraries.places.api.p2437b;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.f */
/* compiled from: PG */
final class C31850f extends C31859o {

    /* renamed from: a */
    private final List f85498a;

    public C31850f(List list) {
        if (list != null) {
            this.f85498a = list;
            return;
        }
        throw new NullPointerException("Null autocompletePredictions");
    }

    /* renamed from: a */
    public final List mo37433a() {
        return this.f85498a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31859o) {
            return this.f85498a.equals(((C31859o) obj).mo37433a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f85498a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f85498a.toString();
        return "FindAutocompletePredictionsResponse{autocompletePredictions=" + obj + "}";
    }
}
