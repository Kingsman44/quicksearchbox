package com.google.android.libraries.gcoreclient.p1788q.p1789a;

import com.google.android.gms.location.internal.ParcelableGeofence;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.q.a.c */
/* compiled from: PG */
public final class C21616c {

    /* renamed from: a */
    public final ParcelableGeofence f59982a;

    public C21616c(ParcelableGeofence parcelableGeofence) {
        this.f59982a = parcelableGeofence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21616c)) {
            return false;
        }
        return this.f59982a.equals(((C21616c) obj).f59982a);
    }

    public final int hashCode() {
        return this.f59982a.hashCode();
    }

    public final String toString() {
        return this.f59982a.toString();
    }
}
