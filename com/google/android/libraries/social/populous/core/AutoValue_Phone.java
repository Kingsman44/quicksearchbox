package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public final class AutoValue_Phone extends C$AutoValue_Phone implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42257aj();

    /* renamed from: g */
    private static final ClassLoader f110692g = AutoValue_Phone.class.getClassLoader();

    /* JADX WARNING: type inference failed for: r10v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Phone(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.readString()
            byte r0 = r10.readByte()
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0012
            java.lang.String r0 = r10.readString()
            r4 = r0
            goto L_0x0013
        L_0x0012:
            r4 = r2
        L_0x0013:
            java.lang.ClassLoader r0 = f110692g
            android.os.Parcelable r5 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r5 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r5
            byte r6 = r10.readByte()
            if (r6 != r3) goto L_0x0026
            java.lang.String r6 = r10.readString()
            goto L_0x0027
        L_0x0026:
            r6 = r2
        L_0x0027:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r6)
            byte r7 = r10.readByte()
            if (r7 != r3) goto L_0x0038
            android.os.Parcelable r7 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Name r7 = (com.google.android.libraries.social.populous.core.Name) r7
            goto L_0x0039
        L_0x0038:
            r7 = r2
        L_0x0039:
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
            byte r8 = r10.readByte()
            if (r8 != r3) goto L_0x004a
            android.os.Parcelable r10 = r10.readParcelable(r0)
            r2 = r10
            com.google.android.libraries.social.populous.core.Photo r2 = (com.google.android.libraries.social.populous.core.Photo) r2
        L_0x004a:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90833j(r2)
            r0 = r9
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Phone.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110661a.toString());
        parcel.writeByte(this.f110662b == null ? (byte) 0 : 1);
        CharSequence charSequence = this.f110662b;
        if (charSequence != null) {
            parcel.writeString(charSequence.toString());
        }
        parcel.writeParcelable(this.f110663c, 0);
        parcel.writeByte(this.f110664d.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110664d;
        if (axVar.mo56113h()) {
            parcel.writeString((String) axVar.mo56107c());
        }
        parcel.writeByte(this.f110665e.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar2 = this.f110665e;
        if (axVar2.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar2.mo56107c(), 0);
        }
        parcel.writeByte(this.f110666f.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar3 = this.f110666f;
        if (axVar3.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar3.mo56107c(), 0);
        }
    }

    public AutoValue_Phone(CharSequence charSequence, CharSequence charSequence2, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        super(charSequence, charSequence2, personFieldMetadata, axVar, axVar2, axVar3);
    }
}
