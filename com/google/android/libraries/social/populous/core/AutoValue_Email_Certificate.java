package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;

/* compiled from: PG */
public final class AutoValue_Email_Certificate extends C$AutoValue_Email_Certificate implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42363x();

    /* renamed from: d */
    private static final ClassLoader f110684d = AutoValue_Email_Certificate.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Email_Certificate(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.ClassLoader r0 = f110684d
            android.os.Parcelable r1 = r3.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = (com.google.android.libraries.social.populous.core.PersonFieldMetadata) r1
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.google.android.libraries.social.populous.core.Email$Certificate$CertificateStatus r0 = (com.google.android.libraries.social.populous.core.Email.Certificate.CertificateStatus) r0
            java.lang.String r3 = r3.readString()
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110633a, 0);
        parcel.writeParcelable(this.f110634b, 0);
        parcel.writeString(this.f110635c);
    }

    public AutoValue_Email_Certificate(PersonFieldMetadata personFieldMetadata, Email.Certificate.CertificateStatus certificateStatus, String str) {
        super(personFieldMetadata, certificateStatus, str);
    }
}
