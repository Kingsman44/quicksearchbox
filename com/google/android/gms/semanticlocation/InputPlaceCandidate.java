package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class InputPlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145976n();

    /* renamed from: a */
    public final FeatureId f394576a;

    /* renamed from: b */
    public final DevicePersonalizedPlaceInfo f394577b;

    /* compiled from: PG */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145973k();

        /* renamed from: a */
        public final long f394578a;

        /* renamed from: b */
        public final long f394579b;

        public FeatureId(long j, long j2) {
            this.f394578a = j;
            this.f394579b = j2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234090i(parcel, 1, this.f394578a);
            C143947c.m234090i(parcel, 2, this.f394579b);
            C143947c.m234083b(parcel, a);
        }
    }

    public InputPlaceCandidate(FeatureId featureId, DevicePersonalizedPlaceInfo devicePersonalizedPlaceInfo) {
        this.f394576a = featureId;
        this.f394577b = devicePersonalizedPlaceInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394576a, i);
        C143947c.m234105x(parcel, 2, this.f394577b, i);
        C143947c.m234083b(parcel, a);
    }
}
