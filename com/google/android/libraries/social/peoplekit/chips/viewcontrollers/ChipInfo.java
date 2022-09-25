package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;

/* compiled from: PG */
public final class ChipInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42065k();

    /* renamed from: a */
    public Channel f109918a;

    /* renamed from: b */
    public CoalescedChannels f109919b;

    public ChipInfo() {
    }

    public ChipInfo(Parcel parcel) {
        this.f109918a = (Channel) parcel.readParcelable(Channel.class.getClassLoader());
        this.f109919b = (CoalescedChannels) parcel.readParcelable(CoalescedChannels.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f109918a, i);
        parcel.writeParcelable(this.f109919b, i);
    }
}
