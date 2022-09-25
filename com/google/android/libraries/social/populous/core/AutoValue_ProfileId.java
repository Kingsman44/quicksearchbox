package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public final class AutoValue_ProfileId extends C$AutoValue_ProfileId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42259al();

    /* renamed from: e */
    private static final ClassLoader f110694e = AutoValue_ProfileId.class.getClassLoader();

    /* JADX WARNING: type inference failed for: r8v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_ProfileId(android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.readString()
            java.lang.ClassLoader r1 = f110694e
            android.os.Parcelable r2 = r8.readParcelable(r1)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r2 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r2
            byte r3 = r8.readByte()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x001b
            android.os.Parcelable r3 = r8.readParcelable(r1)
            com.google.android.libraries.social.populous.core.Name r3 = (com.google.android.libraries.social.populous.core.Name) r3
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            byte r6 = r8.readByte()
            if (r6 != r5) goto L_0x002d
            android.os.Parcelable r8 = r8.readParcelable(r1)
            r4 = r8
            com.google.android.libraries.social.populous.core.Photo r4 = (com.google.android.libraries.social.populous.core.Photo) r4
        L_0x002d:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90833j(r4)
            r7.<init>(r0, r2, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_ProfileId.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110672a.toString());
        parcel.writeParcelable(this.f110673b, 0);
        parcel.writeByte(this.f110674c.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110674c;
        if (axVar.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar.mo56107c(), 0);
        }
        parcel.writeByte(this.f110675d.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar2 = this.f110675d;
        if (axVar2.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar2.mo56107c(), 0);
        }
    }

    public AutoValue_ProfileId(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2) {
        super(charSequence, personFieldMetadata, axVar, axVar2);
    }
}
