package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public final class AutoValue_Photo extends C$AutoValue_Photo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42258ak();

    /* renamed from: f */
    private static final ClassLoader f110693f = AutoValue_Photo.class.getClassLoader();

    public AutoValue_Photo(int i, String str, C58833ax axVar, PersonFieldMetadata personFieldMetadata, boolean z) {
        super(i, str, axVar, personFieldMetadata, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110667a);
        parcel.writeString(this.f110668b);
        parcel.writeByte(this.f110669c.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110669c;
        if (axVar.mo56113h()) {
            parcel.writeString((String) axVar.mo56107c());
        }
        parcel.writeParcelable(this.f110670d, 0);
        parcel.writeValue(Boolean.valueOf(this.f110671e));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Photo(android.os.Parcel r7) {
        /*
            r6 = this;
            int r1 = r7.readInt()
            java.lang.String r2 = r7.readString()
            byte r0 = r7.readByte()
            r3 = 1
            if (r0 != r3) goto L_0x0014
            java.lang.String r0 = r7.readString()
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r0)
            java.lang.ClassLoader r0 = f110693f
            android.os.Parcelable r4 = r7.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r4 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r4
            java.lang.Object r7 = r7.readValue(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Photo.<init>(android.os.Parcel):void");
    }
}
