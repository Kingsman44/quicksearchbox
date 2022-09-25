package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_Group extends C$AutoValue_Group implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42560k();

    /* renamed from: f */
    private static final ClassLoader f110337f = AutoValue_Group.class.getClassLoader();

    public AutoValue_Group(Parcel parcel) {
        super(parcel.readString(), parcel.readString(), (GroupMetadata) parcel.readParcelable(f110337f), C58485gu.m89844l((GroupOrigin[]) C58485gu.m89844l(parcel.readParcelableArray(GroupOrigin.class.getClassLoader())).toArray(new GroupOrigin[0])), C58485gu.m89844l((GroupMember[]) parcel.createTypedArray(AutoValue_GroupMember.CREATOR)));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110324a);
        parcel.writeString(this.f110325b);
        parcel.writeParcelable(this.f110326c, 0);
        parcel.writeParcelableArray((Parcelable[]) this.f110327d.toArray(new Parcelable[0]), 0);
        parcel.writeTypedArray((AutoValue_GroupMember[]) this.f110328e.toArray(new AutoValue_GroupMember[0]), 0);
    }

    public AutoValue_Group(String str, String str2, GroupMetadata groupMetadata, C58485gu guVar, C58485gu guVar2) {
        super(str, str2, groupMetadata, guVar, guVar2);
    }
}
