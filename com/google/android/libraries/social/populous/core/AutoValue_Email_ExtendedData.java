package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;
import com.google.p4181bi.p4182a.C55790h;

/* compiled from: PG */
public final class AutoValue_Email_ExtendedData extends C$AutoValue_Email_ExtendedData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42248aa();

    /* renamed from: d */
    private static final ClassLoader f110686d = AutoValue_Email_ExtendedData.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Email_ExtendedData(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.ClassLoader r0 = f110686d
            java.lang.Object r1 = r5.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            byte r2 = r5.readByte()
            r3 = 1
            if (r2 != r3) goto L_0x001a
            android.os.Parcelable r0 = r5.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Email$EmailSecurityData r0 = (com.google.android.libraries.social.populous.core.Email.EmailSecurityData) r0
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r5 = r5.readInt()
            com.google.bi.a.h r5 = com.google.p4181bi.p4182a.C55790h.m87733a(r5)
            r4.<init>(r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email_ExtendedData.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.f110639a));
        parcel.writeByte(this.f110640b == null ? (byte) 0 : 1);
        Email.EmailSecurityData emailSecurityData = this.f110640b;
        if (emailSecurityData != null) {
            parcel.writeParcelable(emailSecurityData, 0);
        }
        parcel.writeInt(this.f110641c.f147217e);
    }

    public AutoValue_Email_ExtendedData(boolean z, Email.EmailSecurityData emailSecurityData, C55790h hVar) {
        super(z, emailSecurityData, hVar);
    }
}
