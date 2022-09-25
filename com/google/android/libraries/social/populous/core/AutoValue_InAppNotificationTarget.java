package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_InAppNotificationTarget extends C$AutoValue_InAppNotificationTarget implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42251ad();

    /* renamed from: i */
    private static final ClassLoader f110689i = AutoValue_InAppNotificationTarget.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_InAppNotificationTarget(android.os.Parcel r12) {
        /*
            r11 = this;
            com.google.android.libraries.social.populous.core.bh[] r0 = com.google.android.libraries.social.populous.core.C42282bh.values()
            int r1 = r12.readInt()
            r3 = r0[r1]
            java.lang.ClassLoader r0 = f110689i
            android.os.Parcelable r1 = r12.readParcelable(r0)
            r4 = r1
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r4 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r4
            byte r1 = r12.readByte()
            r2 = 0
            r5 = 1
            if (r1 != r5) goto L_0x0022
            android.os.Parcelable r1 = r12.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Name r1 = (com.google.android.libraries.social.populous.core.Name) r1
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            byte r6 = r12.readByte()
            if (r6 != r5) goto L_0x0034
            android.os.Parcelable r0 = r12.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Photo r0 = (com.google.android.libraries.social.populous.core.Photo) r0
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r0)
            byte r0 = r12.readByte()
            r7 = 0
            if (r0 != r5) goto L_0x0057
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0055
            r8 = 2
            if (r0 == r5) goto L_0x0053
            r9 = 3
            if (r0 == r8) goto L_0x0051
            if (r0 == r9) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            r0 = 4
            goto L_0x0058
        L_0x0051:
            r0 = 3
            goto L_0x0058
        L_0x0053:
            r0 = 2
            goto L_0x0058
        L_0x0055:
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            java.lang.Class<com.google.android.libraries.social.populous.core.ContactMethodField> r8 = com.google.android.libraries.social.populous.core.ContactMethodField.class
            java.lang.ClassLoader r8 = r8.getClassLoader()
            android.os.Parcelable[] r8 = r12.readParcelableArray(r8)
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89844l(r8)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r7 = new com.google.android.libraries.social.populous.core.ContactMethodField[r7]
            java.lang.Object[] r7 = r8.toArray(r7)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r7 = (com.google.android.libraries.social.populous.core.ContactMethodField[]) r7
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89844l(r7)
            byte r7 = r12.readByte()
            if (r7 != r5) goto L_0x007c
            java.lang.String r2 = r12.readString()
        L_0x007c:
            r9 = r2
            java.lang.String r10 = r12.readString()
            r2 = r11
            r5 = r1
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_InAppNotificationTarget.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110645a.ordinal());
        byte b = 0;
        parcel.writeParcelable(this.f110646b, 0);
        parcel.writeByte(this.f110647c.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110647c;
        if (axVar.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar.mo56107c(), 0);
        }
        parcel.writeByte(this.f110648d.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar2 = this.f110648d;
        if (axVar2.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar2.mo56107c(), 0);
        }
        parcel.writeByte(this.f110652h == 0 ? (byte) 0 : 1);
        int i2 = this.f110652h;
        if (i2 != 0) {
            parcel.writeInt(i2 - 1);
        }
        parcel.writeParcelableArray((Parcelable[]) this.f110649e.toArray(new Parcelable[0]), 0);
        if (this.f110650f != null) {
            b = 1;
        }
        parcel.writeByte(b);
        String str = this.f110650f;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeString(this.f110651g.toString());
    }

    public AutoValue_InAppNotificationTarget(C42282bh bhVar, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, int i, C58485gu guVar, String str, CharSequence charSequence) {
        super(bhVar, personFieldMetadata, axVar, axVar2, i, guVar, str, charSequence);
    }
}
