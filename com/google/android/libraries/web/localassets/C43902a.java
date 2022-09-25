package com.google.android.libraries.web.localassets;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.localassets.a */
/* compiled from: PG */
public final class C43902a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new AccountStorageWebDirectory(parcel.readString(), (AccountId) parcel.readParcelable(AccountStorageWebDirectory.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountStorageWebDirectory[i];
    }
}
