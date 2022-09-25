package com.google.android.libraries.surveys;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class SurveyMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43032i();

    /* renamed from: a */
    public final String f112515a;

    /* renamed from: b */
    public final String f112516b;

    /* renamed from: c */
    public final String f112517c;

    /* renamed from: d */
    public final int f112518d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SurveyMetadata(android.os.Parcel r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.readString()
            r4.f112515a = r0
            java.lang.String r0 = r5.readString()
            r4.f112516b = r0
            java.lang.String r0 = r5.readString()
            r4.f112517c = r0
            java.lang.String r5 = r5.readString()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1446966090: goto L_0x0042;
                case 364290440: goto L_0x0038;
                case 1053567612: goto L_0x002e;
                case 2095255229: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r0 = "STANDARD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r5 = 2
            goto L_0x004d
        L_0x002e:
            java.lang.String r0 = "DISABLED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r5 = 1
            goto L_0x004d
        L_0x0038:
            java.lang.String r0 = "CONFIDENTIAL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r5 = 3
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = "NOT_SET"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x004c
            r5 = 0
            goto L_0x004d
        L_0x004c:
            r5 = -1
        L_0x004d:
            if (r5 == 0) goto L_0x005f
            if (r5 == r3) goto L_0x005d
            if (r5 == r2) goto L_0x0060
            if (r5 != r1) goto L_0x0057
            r1 = 4
            goto L_0x0060
        L_0x0057:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L_0x005d:
            r1 = 2
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            r4.f112518d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.SurveyMetadata.<init>(android.os.Parcel):void");
    }

    public SurveyMetadata(String str, String str2, String str3, int i) {
        this.f112515a = str;
        this.f112516b = str2;
        this.f112517c = str3;
        this.f112518d = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112515a);
        parcel.writeString(this.f112516b);
        parcel.writeString(this.f112517c);
        int i2 = this.f112518d;
        parcel.writeString(i2 != 1 ? i2 != 2 ? i2 != 3 ? "CONFIDENTIAL" : "STANDARD" : "DISABLED" : "NOT_SET");
    }
}
