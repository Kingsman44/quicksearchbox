package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.tasks.C146004a;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.h */
/* compiled from: PG */
final class C31852h extends C31861q {

    /* renamed from: a */
    private final List f85500a;

    public C31852h(List list) {
        this.f85500a = list;
    }

    /* renamed from: a */
    public final C146004a mo37404a() {
        return null;
    }

    /* renamed from: b */
    public final List mo37439b() {
        return this.f85500a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31861q) {
            C31861q qVar = (C31861q) obj;
            return this.f85500a.equals(qVar.mo37439b()) && qVar.mo37404a() == null;
        }
    }

    public final int hashCode() {
        return (this.f85500a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String obj = this.f85500a.toString();
        return "FindCurrentPlaceRequest{placeFields=" + obj + ", cancellationToken=null}";
    }
}
