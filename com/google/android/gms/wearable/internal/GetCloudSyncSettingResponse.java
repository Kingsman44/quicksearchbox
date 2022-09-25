package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146435at();

    /* renamed from: a */
    public final int f395589a;

    /* renamed from: b */
    public final boolean f395590b;

    public GetCloudSyncSettingResponse(int i, boolean z) {
        this.f395589a = i;
        this.f395590b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395589a);
        C143947c.m234084c(parcel, 3, this.f395590b);
        C143947c.m234083b(parcel, a);
    }
}
