package com.google.android.libraries.web.contrib.googlesignin;

import android.os.Parcelable;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.b */
/* compiled from: PG */
final class C43584b implements Parcelable.Creator {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r6) {
        /*
            r5 = this;
            com.google.android.libraries.web.contrib.googlesignin.AutoValue_GoogleSignInFeature r0 = new com.google.android.libraries.web.contrib.googlesignin.AutoValue_GoogleSignInFeature
            java.lang.Class<com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature> r1 = com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r6.readParcelable(r1)
            com.google.android.libraries.web.shared.contrib.WebFeatureConfig r1 = (com.google.android.libraries.web.shared.contrib.WebFeatureConfig) r1
            java.lang.String r6 = r6.readString()
            int r2 = r6.hashCode()
            r3 = 2402104(0x24a738, float:3.366065E-39)
            r4 = 1
            if (r2 == r3) goto L_0x002c
            r3 = 1706672247(0x65b9c077, float:1.0964852E23)
            if (r2 == r3) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            java.lang.String r2 = "AUTOMATIC_ON_FIRST_PAGE_LOAD_END"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0036
            r6 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r2 = "NONE"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0036
            r6 = 0
            goto L_0x0037
        L_0x0036:
            r6 = -1
        L_0x0037:
            if (r6 == 0) goto L_0x0043
            if (r6 != r4) goto L_0x003d
            r4 = 2
            goto L_0x0043
        L_0x003d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L_0x0043:
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.googlesignin.C43584b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_GoogleSignInFeature[i];
    }
}
