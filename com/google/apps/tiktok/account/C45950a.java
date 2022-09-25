package com.google.apps.tiktok.account;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.apps.tiktok.account.a */
/* compiled from: PG */
final class C45950a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return AccountId.m82057b(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountId[i];
    }
}
