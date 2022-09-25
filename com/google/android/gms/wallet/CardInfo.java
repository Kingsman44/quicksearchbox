package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: PG */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146344b();

    /* renamed from: a */
    String f395268a;

    /* renamed from: b */
    String f395269b;

    /* renamed from: c */
    String f395270c;

    /* renamed from: d */
    int f395271d;

    /* renamed from: e */
    UserAddress f395272e;

    private CardInfo() {
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.f395268a = str;
        this.f395269b = str2;
        this.f395270c = str3;
        this.f395271d = i;
        this.f395272e = userAddress;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395268a);
        C143947c.m234106y(parcel, 2, this.f395269b);
        C143947c.m234106y(parcel, 3, this.f395270c);
        C143947c.m234089h(parcel, 4, this.f395271d);
        C143947c.m234105x(parcel, 5, this.f395272e, i);
        C143947c.m234083b(parcel, a);
    }
}
