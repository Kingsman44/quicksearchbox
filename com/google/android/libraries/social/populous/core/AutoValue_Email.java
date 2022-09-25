package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_Email extends C$AutoValue_Email implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42362w();

    /* renamed from: h */
    private static final ClassLoader f110683h = AutoValue_Email.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Email(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.readString()
            java.lang.ClassLoader r0 = f110683h
            android.os.Parcelable r2 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r2 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r2
            byte r3 = r10.readByte()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x0019
            java.lang.String r3 = r10.readString()
            goto L_0x001a
        L_0x0019:
            r3 = r4
        L_0x001a:
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            byte r6 = r10.readByte()
            if (r6 != r5) goto L_0x002b
            android.os.Parcelable r6 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Name r6 = (com.google.android.libraries.social.populous.core.Name) r6
            goto L_0x002c
        L_0x002b:
            r6 = r4
        L_0x002c:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r6)
            byte r7 = r10.readByte()
            if (r7 != r5) goto L_0x003d
            android.os.Parcelable r7 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Photo r7 = (com.google.android.libraries.social.populous.core.Photo) r7
            goto L_0x003e
        L_0x003d:
            r7 = r4
        L_0x003e:
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
            byte r8 = r10.readByte()
            if (r8 != r5) goto L_0x0050
            android.os.Parcelable r0 = r10.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Email$ExtendedData r0 = (com.google.android.libraries.social.populous.core.Email.ExtendedData) r0
            r8 = r0
            goto L_0x0051
        L_0x0050:
            r8 = r4
        L_0x0051:
            android.os.Parcelable$Creator r0 = com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate.CREATOR
            java.lang.Object[] r10 = r10.createTypedArray(r0)
            com.google.android.libraries.social.populous.core.Email$Certificate[] r10 = (com.google.android.libraries.social.populous.core.Email.Certificate[]) r10
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89844l(r10)
            r0 = r9
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110626a.toString());
        parcel.writeParcelable(this.f110627b, 0);
        parcel.writeByte(this.f110628c.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar = this.f110628c;
        if (axVar.mo56113h()) {
            parcel.writeString((String) axVar.mo56107c());
        }
        parcel.writeByte(this.f110629d.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar2 = this.f110629d;
        if (axVar2.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar2.mo56107c(), 0);
        }
        parcel.writeByte(this.f110630e.mo56113h() ? (byte) 1 : 0);
        C58833ax axVar3 = this.f110630e;
        if (axVar3.mo56113h()) {
            parcel.writeParcelable((Parcelable) axVar3.mo56107c(), 0);
        }
        parcel.writeByte(this.f110631f == null ? (byte) 0 : 1);
        Email.ExtendedData extendedData = this.f110631f;
        if (extendedData != null) {
            parcel.writeParcelable(extendedData, 0);
        }
        parcel.writeTypedArray((AutoValue_Email_Certificate[]) this.f110632g.toArray(new AutoValue_Email_Certificate[0]), 0);
    }

    public AutoValue_Email(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, Email.ExtendedData extendedData, C58485gu guVar) {
        super(charSequence, personFieldMetadata, axVar, axVar2, axVar3, extendedData, guVar);
    }
}
