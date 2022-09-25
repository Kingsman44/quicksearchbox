package com.google.android.libraries.web.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.base.C43271v;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.c */
/* compiled from: PG */
public final class C44066c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new Profile(parcel.readString(), C43271v.m76361a(parcel.readString()), parcel.readInt() != 0, (AccountId) parcel.readParcelable(Profile.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Profile[i];
    }
}
