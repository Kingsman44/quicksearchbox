package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146393i();

    /* renamed from: a */
    String f395456a;

    /* renamed from: b */
    String f395457b;

    /* renamed from: c */
    TimeInterval f395458c;
    @Deprecated

    /* renamed from: d */
    UriData f395459d;
    @Deprecated

    /* renamed from: e */
    UriData f395460e;

    WalletObjectMessage() {
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f395456a = str;
        this.f395457b = str2;
        this.f395458c = timeInterval;
        this.f395459d = uriData;
        this.f395460e = uriData2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395456a);
        C143947c.m234106y(parcel, 3, this.f395457b);
        C143947c.m234105x(parcel, 4, this.f395458c, i);
        C143947c.m234105x(parcel, 5, this.f395459d, i);
        C143947c.m234105x(parcel, 6, this.f395460e, i);
        C143947c.m234083b(parcel, a);
    }
}
