package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4535g.C59203do;

/* compiled from: PG */
public final class AutoValue_PeopleApiAffinity extends C$AutoValue_PeopleApiAffinity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42253af();

    /* renamed from: f */
    private static final ClassLoader f110690f = AutoValue_PeopleApiAffinity.class.getClassLoader();

    public AutoValue_PeopleApiAffinity(String str, AffinityMetadata affinityMetadata, boolean z) {
        super(C59203do.f157270a, str, affinityMetadata, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f110655a);
        parcel.writeString(this.f110656b);
        parcel.writeParcelable(this.f110657c, 0);
        parcel.writeValue(Boolean.valueOf(this.f110658d));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_PeopleApiAffinity(android.os.Parcel r7) {
        /*
            r6 = this;
            double r1 = r7.readDouble()
            java.lang.String r3 = r7.readString()
            java.lang.ClassLoader r0 = f110690f
            android.os.Parcelable r4 = r7.readParcelable(r0)
            com.google.android.libraries.social.populous.core.AffinityMetadata r4 = (com.google.android.libraries.social.populous.core.AffinityMetadata) r4
            java.lang.Object r7 = r7.readValue(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_PeopleApiAffinity.<init>(android.os.Parcel):void");
    }
}
