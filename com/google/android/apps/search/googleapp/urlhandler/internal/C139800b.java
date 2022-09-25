package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.b */
/* compiled from: PG */
final class C139800b implements Parcelable.Creator {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            com.google.android.apps.search.googleapp.urlhandler.internal.AutoValue_UrlIntentResult r13 = new com.google.android.apps.search.googleapp.urlhandler.internal.AutoValue_UrlIntentResult
            java.lang.Class<com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult> r1 = com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r1 = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) r1
            int r2 = r17.readInt()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            int r5 = r17.readInt()
            if (r5 != r4) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            java.lang.String r6 = r17.readString()
            int r7 = r6.hashCode()
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r7) {
                case -500765347: goto L_0x005b;
                case 932619149: goto L_0x0051;
                case 1047343665: goto L_0x0047;
                case 1232707911: goto L_0x003d;
                case 1570106820: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0065
        L_0x0033:
            java.lang.String r7 = "GOOGLE_APP_BROWSER"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0065
            r6 = 0
            goto L_0x0066
        L_0x003d:
            java.lang.String r7 = "CHROME_CUSTOM_TABS"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0047:
            java.lang.String r7 = "GOOGLE_APP_COLLECTIONS"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0065
            r6 = 3
            goto L_0x0066
        L_0x0051:
            java.lang.String r7 = "EXTERNAL_APP"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0065
            r6 = 2
            goto L_0x0066
        L_0x005b:
            java.lang.String r7 = "AGSA_CLASSIC_COLLECTIONS"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0065
            r6 = 4
            goto L_0x0066
        L_0x0065:
            r6 = -1
        L_0x0066:
            if (r6 == 0) goto L_0x007e
            if (r6 == r4) goto L_0x007c
            if (r6 == r10) goto L_0x007a
            if (r6 == r9) goto L_0x0078
            if (r6 != r8) goto L_0x0072
            r6 = 5
            goto L_0x007f
        L_0x0072:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0078:
            r6 = 4
            goto L_0x007f
        L_0x007a:
            r6 = 3
            goto L_0x007f
        L_0x007c:
            r6 = 2
            goto L_0x007f
        L_0x007e:
            r6 = 1
        L_0x007f:
            java.lang.String r7 = r17.readString()
            int r8 = r17.readInt()
            if (r8 != r4) goto L_0x008b
            r8 = 1
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            int r9 = r17.readInt()
            if (r9 != r4) goto L_0x0094
            r9 = 1
            goto L_0x0095
        L_0x0094:
            r9 = 0
        L_0x0095:
            java.lang.Class<com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult> r10 = com.google.android.apps.search.googleapp.urlhandler.internal.UrlIntentResult.class
            java.lang.ClassLoader r10 = r10.getClassLoader()
            android.os.Parcelable r10 = r0.readParcelable(r10)
            android.content.Intent r10 = (android.content.Intent) r10
            int r11 = r17.readInt()
            if (r11 != r4) goto L_0x00a9
            r11 = 1
            goto L_0x00aa
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            java.lang.Class<com.google.common.o.rx> r12 = com.google.common.p4552o.C60492rx.class
            java.lang.String r14 = r17.readString()
            java.lang.Enum r12 = java.lang.Enum.valueOf(r12, r14)
            com.google.common.o.rx r12 = (com.google.common.p4552o.C60492rx) r12
            int r14 = r17.readInt()
            if (r14 != r4) goto L_0x00be
            r14 = 1
            goto L_0x00bf
        L_0x00be:
            r14 = 0
        L_0x00bf:
            int r0 = r17.readInt()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r0 = r13
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r14
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.urlhandler.internal.C139800b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_UrlIntentResult[i];
    }
}
