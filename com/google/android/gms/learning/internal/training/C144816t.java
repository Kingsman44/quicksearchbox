package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.training.t */
/* compiled from: PG */
public abstract class C144816t extends C8849b implements C144817u {
    public C144816t() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    public static C144817u asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        return queryLocalInterface instanceof C144817u ? (C144817u) queryLocalInterface : new C144815s(iBinder);
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.android.gms.f.j] */
    /* JADX WARNING: type inference failed for: r6v8, types: [com.google.android.gms.learning.internal.training.f] */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 0
            switch(r3) {
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a1;
                case 3: goto L_0x008b;
                case 4: goto L_0x007d;
                case 5: goto L_0x005f;
                case 6: goto L_0x0049;
                case 7: goto L_0x0036;
                case 8: goto L_0x002e;
                case 9: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r3 = 0
            return r3
        L_0x0006:
            java.lang.String r3 = r4.readString()
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            java.lang.String r6 = "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.gms.learning.internal.training.C144802f
            if (r1 == 0) goto L_0x001e
            com.google.android.gms.learning.internal.training.f r6 = (com.google.android.gms.learning.internal.training.C144802f) r6
            goto L_0x0023
        L_0x001e:
            com.google.android.gms.learning.internal.training.d r6 = new com.google.android.gms.learning.internal.training.d
            r6.<init>(r0)
        L_0x0023:
            r2.enforceNoDataAvail(r4)
            r2.addHttpUrlConnectionFactory(r3, r6)
            r5.writeNoException()
            goto L_0x00ca
        L_0x002e:
            r2.setPRFSdkImpl()
            r5.writeNoException()
            goto L_0x00ca
        L_0x0036:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.enforceNoDataAvail(r4)
            r2.onRebind(r3)
            r5.writeNoException()
            goto L_0x00ca
        L_0x0049:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.enforceNoDataAvail(r4)
            boolean r3 = r2.onUnbind(r3)
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r5, r3)
            goto L_0x00ca
        L_0x005f:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            int r6 = r4.readInt()
            int r0 = r4.readInt()
            r2.enforceNoDataAvail(r4)
            int r3 = r2.onStartCommand(r3, r6, r0)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x00ca
        L_0x007d:
            int r3 = r4.readInt()
            r2.enforceNoDataAvail(r4)
            r2.onTrimMemory(r3)
            r5.writeNoException()
            goto L_0x00ca
        L_0x008b:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r3 = com.google.android.p445a.C8850c.m23492a(r4, r3)
            android.content.Intent r3 = (android.content.Intent) r3
            r2.enforceNoDataAvail(r4)
            android.os.IBinder r3 = r2.onBind(r3)
            r5.writeNoException()
            r5.writeStrongBinder(r3)
            goto L_0x00ca
        L_0x00a1:
            r2.onDestroy()
            r5.writeNoException()
            goto L_0x00ca
        L_0x00a8:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00af
            goto L_0x00c1
        L_0x00af:
            java.lang.String r6 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.p10793f.C144165j
            if (r0 == 0) goto L_0x00bc
            com.google.android.gms.f.j r6 = (com.google.android.gms.p10793f.C144165j) r6
            goto L_0x00c1
        L_0x00bc:
            com.google.android.gms.f.h r6 = new com.google.android.gms.f.h
            r6.<init>(r3)
        L_0x00c1:
            r2.enforceNoDataAvail(r4)
            r2.onCreate(r6)
            r5.writeNoException()
        L_0x00ca:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144816t.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
