package com.google.android.voiceinteraction;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.voiceinteraction.ar */
/* compiled from: PG */
public abstract class C45389ar extends C8849b implements C45390as {
    public C45389ar() {
        super("com.google.android.voiceinteraction.IGsaVoiceInteractionService");
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.google.android.voiceinteraction.av] */
    /* JADX WARNING: type inference failed for: r7v8, types: [com.google.android.apps.gsa.nga.shared.f.a.c] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r7 = 0
            switch(r4) {
                case 1: goto L_0x0105;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00a6;
                case 8: goto L_0x0093;
                case 9: goto L_0x0080;
                case 10: goto L_0x0069;
                case 11: goto L_0x0059;
                case 12: goto L_0x002c;
                case 13: goto L_0x0027;
                case 14: goto L_0x0022;
                case 15: goto L_0x0016;
                case 16: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r4 = 0
            return r4
        L_0x0006:
            android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            android.content.Intent r4 = (android.content.Intent) r4
            r3.enforceNoDataAvail(r5)
            r3.mo49501l(r4)
            goto L_0x0133
        L_0x0016:
            java.lang.String r4 = r3.mo49496g()
            r6.writeNoException()
            r6.writeString(r4)
            goto L_0x0133
        L_0x0022:
            r3.mo49498i()
            goto L_0x0133
        L_0x0027:
            r3.mo49497h()
            goto L_0x0133
        L_0x002c:
            byte[] r4 = r5.createByteArray()
            byte[] r6 = r5.createByteArray()
            byte[] r0 = r5.createByteArray()
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x003f
            goto L_0x0051
        L_0x003f:
            java.lang.String r7 = "com.google.android.apps.gsa.nga.shared.bisto.aidl.IOnClientHotwordCallback"
            android.os.IInterface r7 = r1.queryLocalInterface(r7)
            boolean r2 = r7 instanceof com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c
            if (r2 == 0) goto L_0x004c
            com.google.android.apps.gsa.nga.shared.f.a.c r7 = (com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c) r7
            goto L_0x0051
        L_0x004c:
            com.google.android.apps.gsa.nga.shared.f.a.a r7 = new com.google.android.apps.gsa.nga.shared.f.a.a
            r7.<init>(r1)
        L_0x0051:
            r3.enforceNoDataAvail(r5)
            r3.mo49499j(r4, r6, r0, r7)
            goto L_0x0133
        L_0x0059:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.p445a.C8850c.m23492a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r3.enforceNoDataAvail(r5)
            r3.mo49500k(r4)
            goto L_0x0133
        L_0x0069:
            java.lang.String r4 = r5.readString()
            java.lang.String r7 = r5.readString()
            r3.enforceNoDataAvail(r5)
            int r4 = r3.mo49492c(r4, r7)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x0133
        L_0x0080:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            android.content.Intent r4 = r3.mo49495f(r4)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r6, r4)
            goto L_0x0133
        L_0x0093:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            android.content.Intent r4 = r3.mo49494e(r4)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r6, r4)
            goto L_0x0133
        L_0x00a6:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            android.content.Intent r4 = r3.mo49493d(r4)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23498g(r6, r4)
            goto L_0x0133
        L_0x00b9:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            int r4 = r3.mo49491b(r4)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x0133
        L_0x00cb:
            boolean r4 = r3.mo49503n()
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
            goto L_0x0133
        L_0x00d6:
            boolean r4 = r3.mo49505p()
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
            goto L_0x0133
        L_0x00e1:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            boolean r4 = r3.mo49504o(r4)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
            goto L_0x0133
        L_0x00f3:
            java.lang.String r4 = r5.readString()
            r3.enforceNoDataAvail(r5)
            int r4 = r3.mo49490a(r4)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L_0x0133
        L_0x0105:
            java.lang.String r4 = r5.readString()
            java.lang.String r0 = r5.readString()
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x0114
            goto L_0x0126
        L_0x0114:
            java.lang.String r7 = "com.google.android.voiceinteraction.IGsaVoiceInteractionServiceCallback"
            android.os.IInterface r7 = r1.queryLocalInterface(r7)
            boolean r2 = r7 instanceof com.google.android.voiceinteraction.C45393av
            if (r2 == 0) goto L_0x0121
            com.google.android.voiceinteraction.av r7 = (com.google.android.voiceinteraction.C45393av) r7
            goto L_0x0126
        L_0x0121:
            com.google.android.voiceinteraction.at r7 = new com.google.android.voiceinteraction.at
            r7.<init>(r1)
        L_0x0126:
            r3.enforceNoDataAvail(r5)
            boolean r4 = r3.mo49502m(r4, r0, r7)
            r6.writeNoException()
            com.google.android.p445a.C8850c.m23495d(r6, r4)
        L_0x0133:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45389ar.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
