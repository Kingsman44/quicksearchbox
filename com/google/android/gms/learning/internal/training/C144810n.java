package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.internal.training.n */
/* compiled from: PG */
public abstract class C144810n extends C8849b implements C144811o {
    public C144810n() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    public static C144811o asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
        return queryLocalInterface instanceof C144811o ? (C144811o) queryLocalInterface : new C144809m(iBinder);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v7, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r8v10, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            java.lang.String r8 = "com.google.android.gms.common.api.internal.IStatusCallback"
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            switch(r5) {
                case 3: goto L_0x02c4;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0008;
                case 6: goto L_0x0244;
                case 7: goto L_0x01e5;
                case 8: goto L_0x0186;
                case 9: goto L_0x0127;
                case 10: goto L_0x00c8;
                case 11: goto L_0x0069;
                case 12: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r5 = 0
            return r5
        L_0x000a:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0012
            r2 = r1
            goto L_0x0022
        L_0x0012:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x001d
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x0022
        L_0x001d:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x0022:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x002a
            r0 = r1
            goto L_0x003a
        L_0x002a:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0035
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x003a
        L_0x0035:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x003a:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x0049
            goto L_0x005a
        L_0x0049:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0055
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x005a
        L_0x0055:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x005a:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initY2022W24(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x0069:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0071
            r2 = r1
            goto L_0x0081
        L_0x0071:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x007c
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x0081
        L_0x007c:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x0081:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0089
            r0 = r1
            goto L_0x0099
        L_0x0089:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0094
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x0099
        L_0x0094:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x0099:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x00a8
            goto L_0x00b9
        L_0x00a8:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x00b4
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x00b9
        L_0x00b4:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x00b9:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initY2021W30(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x00c8:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x00d0
            r2 = r1
            goto L_0x00e0
        L_0x00d0:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x00db
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x00e0
        L_0x00db:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x00e0:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x00e8
            r0 = r1
            goto L_0x00f8
        L_0x00e8:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x00f3
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x00f8
        L_0x00f3:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x00f8:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x0107
            goto L_0x0118
        L_0x0107:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0113
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x0118
        L_0x0113:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x0118:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initY2020W36(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x0127:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x012f
            r2 = r1
            goto L_0x013f
        L_0x012f:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x013a
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x013f
        L_0x013a:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x013f:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0147
            r0 = r1
            goto L_0x0157
        L_0x0147:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0152
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x0157
        L_0x0152:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x0157:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x0166
            goto L_0x0177
        L_0x0166:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0172
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x0177
        L_0x0172:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x0177:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initY2020W30(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x0186:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x018e
            r2 = r1
            goto L_0x019e
        L_0x018e:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0199
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x019e
        L_0x0199:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x019e:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x01a6
            r0 = r1
            goto L_0x01b6
        L_0x01a6:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x01b1
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x01b6
        L_0x01b1:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x01b6:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x01c5
            goto L_0x01d6
        L_0x01c5:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x01d1
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x01d6
        L_0x01d1:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x01d6:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initY2020W18(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x01e5:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x01ed
            r2 = r1
            goto L_0x01fd
        L_0x01ed:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x01f8
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x01fd
        L_0x01f8:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x01fd:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0205
            r0 = r1
            goto L_0x0215
        L_0x0205:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0210
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x0215
        L_0x0210:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x0215:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x0224
            goto L_0x0235
        L_0x0224:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x0230
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x0235
        L_0x0230:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x0235:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initW24(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x0244:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x024c
            r2 = r1
            goto L_0x025c
        L_0x024c:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x0257
            com.google.android.gms.f.j r2 = (com.google.android.gms.p10793f.C144165j) r2
            goto L_0x025c
        L_0x0257:
            com.google.android.gms.f.h r2 = new com.google.android.gms.f.h
            r2.<init>(r5)
        L_0x025c:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0264
            r0 = r1
            goto L_0x0274
        L_0x0264:
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.p10793f.C144165j
            if (r3 == 0) goto L_0x026f
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0
            goto L_0x0274
        L_0x026f:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h
            r0.<init>(r5)
        L_0x0274:
            android.os.Parcelable$Creator r5 = com.google.android.gms.learning.InAppTrainerOptions.CREATOR
            android.os.Parcelable r5 = com.google.android.p445a.C8850c.m23492a(r6, r5)
            com.google.android.gms.learning.InAppTrainerOptions r5 = (com.google.android.gms.learning.InAppTrainerOptions) r5
            android.os.IBinder r3 = r6.readStrongBinder()
            if (r3 != 0) goto L_0x0283
            goto L_0x0294
        L_0x0283:
            android.os.IInterface r8 = r3.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x028f
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x0294
        L_0x028f:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r3)
        L_0x0294:
            r4.enforceNoDataAvail(r6)
            boolean r5 = r4.initV26(r2, r0, r5, r1)
            r7.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r7, r5)
            goto L_0x02e9
        L_0x02a2:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x02a9
            goto L_0x02ba
        L_0x02a9:
            android.os.IInterface r8 = r5.queryLocalInterface(r8)
            boolean r0 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r0 == 0) goto L_0x02b5
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x02ba
        L_0x02b5:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r5)
        L_0x02ba:
            r4.enforceNoDataAvail(r6)
            r4.stop(r1)
            r7.writeNoException()
            goto L_0x02e9
        L_0x02c4:
            int r5 = r6.readInt()
            android.os.IBinder r0 = r6.readStrongBinder()
            if (r0 != 0) goto L_0x02cf
            goto L_0x02e0
        L_0x02cf:
            android.os.IInterface r8 = r0.queryLocalInterface(r8)
            boolean r1 = r8 instanceof com.google.android.gms.common.api.internal.C143773bu
            if (r1 == 0) goto L_0x02db
            r1 = r8
            com.google.android.gms.common.api.internal.bu r1 = (com.google.android.gms.common.api.internal.C143773bu) r1
            goto L_0x02e0
        L_0x02db:
            com.google.android.gms.common.api.internal.bs r1 = new com.google.android.gms.common.api.internal.bs
            r1.<init>(r0)
        L_0x02e0:
            r4.enforceNoDataAvail(r6)
            r4.start(r5, r1)
            r7.writeNoException()
        L_0x02e9:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144810n.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
