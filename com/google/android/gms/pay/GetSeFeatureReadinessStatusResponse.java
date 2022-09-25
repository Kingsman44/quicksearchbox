package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetSeFeatureReadinessStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145613k();

    /* renamed from: a */
    public int f393637a;

    /* renamed from: b */
    public PendingIntent f393638b;

    /* renamed from: c */
    public byte[][] f393639c;

    private GetSeFeatureReadinessStatusResponse() {
    }

    public GetSeFeatureReadinessStatusResponse(int i, PendingIntent pendingIntent, byte[][] bArr) {
        this.f393637a = i;
        this.f393638b = pendingIntent;
        this.f393639c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSeFeatureReadinessStatusResponse) {
            GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse = (GetSeFeatureReadinessStatusResponse) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393637a), Integer.valueOf(getSeFeatureReadinessStatusResponse.f393637a)) && C143912ba.m233950b(this.f393638b, getSeFeatureReadinessStatusResponse.f393638b) && Arrays.equals(this.f393639c, getSeFeatureReadinessStatusResponse.f393639c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393637a), this.f393638b, Integer.valueOf(Arrays.hashCode(this.f393639c))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393637a);
        C143947c.m234105x(parcel, 2, this.f393638b, i);
        C143947c.m234095n(parcel, 4, this.f393639c);
        C143947c.m234083b(parcel, a);
    }
}
