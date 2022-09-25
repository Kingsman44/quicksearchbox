package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class DataChangeListenerResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145594b();

    /* renamed from: a */
    public DataChangeListenerType f393623a;

    /* renamed from: b */
    public SmartTapTransmissionData f393624b;

    /* renamed from: c */
    public SeCardLoadingStateData f393625c;

    private DataChangeListenerResponse() {
    }

    public DataChangeListenerResponse(DataChangeListenerType dataChangeListenerType, SmartTapTransmissionData smartTapTransmissionData, SeCardLoadingStateData seCardLoadingStateData) {
        this.f393623a = dataChangeListenerType;
        this.f393624b = smartTapTransmissionData;
        this.f393625c = seCardLoadingStateData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerResponse) {
            DataChangeListenerResponse dataChangeListenerResponse = (DataChangeListenerResponse) obj;
            return C143912ba.m233950b(this.f393623a, dataChangeListenerResponse.f393623a) && C143912ba.m233950b(this.f393624b, dataChangeListenerResponse.f393624b) && C143912ba.m233950b(this.f393625c, dataChangeListenerResponse.f393625c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393623a, this.f393624b, this.f393625c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393623a, i);
        C143947c.m234105x(parcel, 2, this.f393624b, i);
        C143947c.m234105x(parcel, 3, this.f393625c, i);
        C143947c.m234083b(parcel, a);
    }
}
