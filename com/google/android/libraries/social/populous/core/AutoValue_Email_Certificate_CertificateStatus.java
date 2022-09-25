package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_Email_Certificate_CertificateStatus extends C$AutoValue_Email_Certificate_CertificateStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42364y();

    static {
        AutoValue_Email_Certificate_CertificateStatus.class.getClassLoader();
    }

    public AutoValue_Email_Certificate_CertificateStatus(double d, int i) {
        super(d, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f110636a);
        parcel.writeInt(this.f110637b - 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_Email_Certificate_CertificateStatus(android.os.Parcel r5) {
        /*
            r4 = this;
            double r0 = r5.readDouble()
            int r5 = r5.readInt()
            r2 = 1
            if (r5 == 0) goto L_0x001d
            r3 = 2
            if (r5 == r2) goto L_0x001c
            r2 = 3
            if (r5 == r3) goto L_0x001d
            r3 = 4
            if (r5 == r2) goto L_0x001a
            if (r5 == r3) goto L_0x0018
            r2 = 0
            goto L_0x001d
        L_0x0018:
            r2 = 5
            goto L_0x001d
        L_0x001a:
            r2 = 4
            goto L_0x001d
        L_0x001c:
            r2 = 2
        L_0x001d:
            r4.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_Email_Certificate_CertificateStatus.<init>(android.os.Parcel):void");
    }
}
