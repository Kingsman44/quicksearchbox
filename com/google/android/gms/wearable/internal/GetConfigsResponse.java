package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: PG */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146438aw();

    /* renamed from: a */
    public final int f395595a;

    /* renamed from: b */
    public final ConnectionConfiguration[] f395596b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f395595a = i;
        this.f395596b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395595a);
        C143947c.m234079B(parcel, 3, this.f395596b, i);
        C143947c.m234083b(parcel, a);
    }
}
