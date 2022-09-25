package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.b */
/* compiled from: PG */
final class C81484b implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.nga.shared.aa.m.a.d r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d.f220968e
            com.google.protobuf.MessageLite r0 = com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable.m147136g(r7, r0)
            com.google.android.apps.gsa.nga.shared.aa.m.a.d r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d) r0
            android.os.IBinder r1 = r7.readStrongBinder()
            android.os.IBinder r7 = r7.readStrongBinder()
            com.google.android.apps.gsa.nga.shared.s3.aidl.HotwordTriggeringInfo r2 = new com.google.android.apps.gsa.nga.shared.s3.aidl.HotwordTriggeringInfo
            r3 = 0
            if (r1 != 0) goto L_0x0017
            r4 = r3
            goto L_0x0029
        L_0x0017:
            java.lang.String r4 = "com.google.android.apps.gsa.nga.shared.s3.aidl.IDeviceSelectionCallback"
            android.os.IInterface r4 = r1.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81490h
            if (r5 == 0) goto L_0x0024
            com.google.android.apps.gsa.nga.shared.s3.aidl.h r4 = (com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81490h) r4
            goto L_0x0029
        L_0x0024:
            com.google.android.apps.gsa.nga.shared.s3.aidl.f r4 = new com.google.android.apps.gsa.nga.shared.s3.aidl.f
            r4.<init>(r1)
        L_0x0029:
            r4.getClass()
            if (r7 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.apps.gsa.nga.shared.s3.aidl.IOnDeviceArbitrationCallback"
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81493k
            if (r3 == 0) goto L_0x003d
            r3 = r1
            com.google.android.apps.gsa.nga.shared.s3.aidl.k r3 = (com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81493k) r3
            goto L_0x0042
        L_0x003d:
            com.google.android.apps.gsa.nga.shared.s3.aidl.i r3 = new com.google.android.apps.gsa.nga.shared.s3.aidl.i
            r3.<init>(r7)
        L_0x0042:
            r3.getClass()
            r2.<init>(r0, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81484b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordTriggeringInfo[i];
    }
}
