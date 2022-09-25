package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d */
/* compiled from: PG */
final class C88478d implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r6) {
        /*
            r5 = this;
            android.os.IBinder r0 = r6.readStrongBinder()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            goto L_0x001c
        L_0x0008:
            java.lang.String r1 = "com.google.android.apps.gsa.search.shared.service.ISearchService"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.apps.gsa.search.shared.service.C88492m
            if (r2 == 0) goto L_0x0016
            r0 = r1
            com.google.android.apps.gsa.search.shared.service.m r0 = (com.google.android.apps.gsa.search.shared.service.C88492m) r0
            goto L_0x001c
        L_0x0016:
            com.google.android.apps.gsa.search.shared.service.k r1 = new com.google.android.apps.gsa.search.shared.service.k
            r1.<init>(r0)
            r0 = r1
        L_0x001c:
            long r1 = r6.readLong()
            int r6 = r6.readInt()
            if (r6 == 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            com.google.android.apps.gsa.search.shared.service.AttachClientResponse r3 = new com.google.android.apps.gsa.search.shared.service.AttachClientResponse
            com.google.android.apps.gsa.search.shared.service.am r4 = new com.google.android.apps.gsa.search.shared.service.am
            r4.<init>(r1, r6)
            r3.<init>(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.C88478d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AttachClientResponse[i];
    }
}
