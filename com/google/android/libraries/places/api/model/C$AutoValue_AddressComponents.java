package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_AddressComponents  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AddressComponents extends AddressComponents {

    /* renamed from: a */
    public final List f85505a;

    public C$AutoValue_AddressComponents(List list) {
        if (list != null) {
            this.f85505a = list;
            return;
        }
        throw new NullPointerException("Null asList");
    }

    /* renamed from: a */
    public final List mo37456a() {
        return this.f85505a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponents) {
            return this.f85505a.equals(((AddressComponents) obj).mo37456a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f85505a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f85505a.toString();
        return "AddressComponents{asList=" + obj + "}";
    }
}
