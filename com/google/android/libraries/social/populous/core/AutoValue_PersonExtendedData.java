package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_PersonExtendedData extends C$AutoValue_PersonExtendedData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42254ag();

    /* renamed from: c */
    private static final ClassLoader f110691c = AutoValue_PersonExtendedData.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_PersonExtendedData(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.ClassLoader r0 = f110691c
            java.lang.Object r1 = r5.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            byte r2 = r5.readByte()
            r3 = 1
            if (r2 != r3) goto L_0x001a
            android.os.Parcelable r5 = r5.readParcelable(r0)
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r5 = (com.google.android.libraries.social.populous.core.DynamiteExtendedData) r5
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            r4.<init>(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_PersonExtendedData.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.f110659a));
        parcel.writeByte(this.f110660b == null ? (byte) 0 : 1);
        DynamiteExtendedData dynamiteExtendedData = this.f110660b;
        if (dynamiteExtendedData != null) {
            parcel.writeParcelable(dynamiteExtendedData, 0);
        }
    }

    public AutoValue_PersonExtendedData(boolean z, DynamiteExtendedData dynamiteExtendedData) {
        super(z, dynamiteExtendedData);
    }
}
