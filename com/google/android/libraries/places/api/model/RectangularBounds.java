package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    /* renamed from: c */
    public static RectangularBounds m59384c(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.f392014a;
        if (latLng != null) {
            LatLng latLng2 = latLngBounds.f392015b;
            if (latLng2 != null) {
                return new AutoValue_RectangularBounds(latLng, latLng2);
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }

    /* renamed from: a */
    public abstract LatLng mo37535a();

    /* renamed from: b */
    public abstract LatLng mo37536b();
}
