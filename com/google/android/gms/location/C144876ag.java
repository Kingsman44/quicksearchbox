package com.google.android.gms.location;

import android.location.Location;
import java.util.List;

/* renamed from: com.google.android.gms.location.ag */
/* compiled from: PG */
public final class C144876ag {

    /* renamed from: a */
    public final int f391823a;

    /* renamed from: b */
    public final int f391824b;

    /* renamed from: c */
    public final List f391825c;

    /* renamed from: d */
    public final Location f391826d;

    private C144876ag(int i, int i2, List list, Location location) {
        this.f391823a = i;
        this.f391824b = i2;
        this.f391825c = list;
        this.f391826d = location;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.C144876ag m235472a(android.content.Intent r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "gms_error_code"
            r2 = -1
            int r1 = r12.getIntExtra(r1, r2)
            java.lang.String r3 = "com.google.android.location.intent.extra.transition"
            int r3 = r12.getIntExtra(r3, r2)
            if (r3 != r2) goto L_0x0015
        L_0x0013:
            r3 = -1
            goto L_0x001f
        L_0x0015:
            r4 = 1
            if (r3 == r4) goto L_0x001f
            r4 = 2
            if (r3 == r4) goto L_0x001f
            r4 = 4
            if (r3 != r4) goto L_0x0013
            r3 = 4
        L_0x001f:
            java.lang.String r4 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r4 = r12.getSerializableExtra(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x002b
            r5 = r0
            goto L_0x005e
        L_0x002b:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            int r6 = r4.size()
            r7 = 0
            r8 = 0
        L_0x003a:
            if (r8 >= r6) goto L_0x005e
            java.lang.Object r9 = r4.get(r8)
            byte[] r9 = (byte[]) r9
            android.os.Parcel r10 = android.os.Parcel.obtain()
            int r11 = r9.length
            r10.unmarshall(r9, r7, r11)
            r10.setDataPosition(r7)
            android.os.Parcelable$Creator r9 = com.google.android.gms.location.internal.ParcelableGeofence.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r10)
            com.google.android.gms.location.internal.ParcelableGeofence r9 = (com.google.android.gms.location.internal.ParcelableGeofence) r9
            r10.recycle()
            r5.add(r9)
            int r8 = r8 + 1
            goto L_0x003a
        L_0x005e:
            java.lang.String r4 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r12 = r12.getParcelableExtra(r4)
            android.location.Location r12 = (android.location.Location) r12
            if (r5 != 0) goto L_0x006b
            if (r1 != r2) goto L_0x006b
            return r0
        L_0x006b:
            com.google.android.gms.location.ag r0 = new com.google.android.gms.location.ag
            r0.<init>(r1, r3, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.C144876ag.m235472a(android.content.Intent):com.google.android.gms.location.ag");
    }

    /* renamed from: b */
    public final boolean mo120370b() {
        return this.f391823a != -1;
    }
}
