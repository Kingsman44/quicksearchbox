package org.chromium.p5643b.p5644a;

import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.ai */
/* compiled from: PG */
public abstract class C72313ai extends C8849b implements C72314aj {
    public C72313ai() {
        super("org.chromium.weblayer_private.interfaces.INavigationControllerClient");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.chromium.b.a.ag} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5, types: [org.chromium.b.a.i] */
    /* JADX WARNING: type inference failed for: r1v9, types: [org.chromium.b.a.i] */
    /* JADX WARNING: type inference failed for: r1v13, types: [org.chromium.b.a.i] */
    /* JADX WARNING: type inference failed for: r1v17, types: [org.chromium.b.a.i] */
    /* JADX WARNING: type inference failed for: r1v21, types: [org.chromium.b.a.l] */
    /* JADX WARNING: type inference failed for: r1v25, types: [org.chromium.b.a.l] */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            java.lang.String r6 = "org.chromium.weblayer_private.interfaces.IClientPage"
            java.lang.String r0 = "org.chromium.weblayer_private.interfaces.IClientNavigation"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x0161;
                case 2: goto L_0x013f;
                case 3: goto L_0x011d;
                case 4: goto L_0x0101;
                case 5: goto L_0x00de;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00a8;
                case 8: goto L_0x0099;
                case 9: goto L_0x0091;
                case 10: goto L_0x0082;
                case 11: goto L_0x0071;
                case 12: goto L_0x0060;
                case 13: goto L_0x0054;
                case 14: goto L_0x0031;
                case 15: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r3 = 0
            return r3
        L_0x000a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72353l
            if (r0 == 0) goto L_0x001d
            r1 = r6
            org.chromium.b.a.l r1 = (org.chromium.p5643b.p5644a.C72353l) r1
            goto L_0x0022
        L_0x001d:
            org.chromium.b.a.j r1 = new org.chromium.b.a.j
            r1.<init>(r3)
        L_0x0022:
            java.lang.String r3 = r4.readString()
            r2.enforceNoDataAvail(r4)
            r2.mo63709k(r1, r3)
            r5.writeNoException()
            goto L_0x0188
        L_0x0031:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72353l
            if (r0 == 0) goto L_0x0044
            r1 = r6
            org.chromium.b.a.l r1 = (org.chromium.p5643b.p5644a.C72353l) r1
            goto L_0x0049
        L_0x0044:
            org.chromium.b.a.j r1 = new org.chromium.b.a.j
            r1.<init>(r3)
        L_0x0049:
            r2.enforceNoDataAvail(r4)
            r2.mo63708j(r1)
            r5.writeNoException()
            goto L_0x0188
        L_0x0054:
            org.chromium.b.a.l r3 = r2.mo63699a()
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r5, r3)
            goto L_0x0188
        L_0x0060:
            r4.readLong()
            r4.readLong()
            r2.enforceNoDataAvail(r4)
            r2.mo63711m()
            r5.writeNoException()
            goto L_0x0188
        L_0x0071:
            r4.readLong()
            r4.readLong()
            r2.enforceNoDataAvail(r4)
            r2.mo63710l()
            r5.writeNoException()
            goto L_0x0188
        L_0x0082:
            java.lang.String r3 = r4.readString()
            r2.enforceNoDataAvail(r4)
            r2.mo63707i(r3)
            r5.writeNoException()
            goto L_0x0188
        L_0x0091:
            r2.mo63706h()
            r5.writeNoException()
            goto L_0x0188
        L_0x0099:
            double r0 = r4.readDouble()
            r2.enforceNoDataAvail(r4)
            r2.mo63700b(r0)
            r5.writeNoException()
            goto L_0x0188
        L_0x00a8:
            boolean r3 = com.google.android.p445a.C8850c.m23500i(r4)
            boolean r6 = com.google.android.p445a.C8850c.m23500i(r4)
            r2.enforceNoDataAvail(r4)
            r2.mo63701c(r3, r6)
            r5.writeNoException()
            goto L_0x0188
        L_0x00bb:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00c2
            goto L_0x00d3
        L_0x00c2:
            android.os.IInterface r6 = r3.queryLocalInterface(r0)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72350i
            if (r0 == 0) goto L_0x00ce
            r1 = r6
            org.chromium.b.a.i r1 = (org.chromium.p5643b.p5644a.C72350i) r1
            goto L_0x00d3
        L_0x00ce:
            org.chromium.b.a.g r1 = new org.chromium.b.a.g
            r1.<init>(r3)
        L_0x00d3:
            r2.enforceNoDataAvail(r4)
            r2.mo63703e(r1)
            r5.writeNoException()
            goto L_0x0188
        L_0x00de:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00e5
            goto L_0x00f6
        L_0x00e5:
            android.os.IInterface r6 = r3.queryLocalInterface(r0)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72350i
            if (r0 == 0) goto L_0x00f1
            r1 = r6
            org.chromium.b.a.i r1 = (org.chromium.p5643b.p5644a.C72350i) r1
            goto L_0x00f6
        L_0x00f1:
            org.chromium.b.a.g r1 = new org.chromium.b.a.g
            r1.<init>(r3)
        L_0x00f6:
            r2.enforceNoDataAvail(r4)
            r2.mo63702d(r1)
            r5.writeNoException()
            goto L_0x0188
        L_0x0101:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0108
            goto L_0x0112
        L_0x0108:
            android.os.IInterface r3 = r3.queryLocalInterface(r0)
            boolean r6 = r3 instanceof org.chromium.p5643b.p5644a.C72350i
            if (r6 == 0) goto L_0x0112
            org.chromium.b.a.i r3 = (org.chromium.p5643b.p5644a.C72350i) r3
        L_0x0112:
            r2.enforceNoDataAvail(r4)
            r2.mo63712n()
            r5.writeNoException()
            goto L_0x0188
        L_0x011d:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0124
            goto L_0x0135
        L_0x0124:
            android.os.IInterface r6 = r3.queryLocalInterface(r0)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72350i
            if (r0 == 0) goto L_0x0130
            r1 = r6
            org.chromium.b.a.i r1 = (org.chromium.p5643b.p5644a.C72350i) r1
            goto L_0x0135
        L_0x0130:
            org.chromium.b.a.g r1 = new org.chromium.b.a.g
            r1.<init>(r3)
        L_0x0135:
            r2.enforceNoDataAvail(r4)
            r2.mo63704f(r1)
            r5.writeNoException()
            goto L_0x0188
        L_0x013f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0146
            goto L_0x0157
        L_0x0146:
            android.os.IInterface r6 = r3.queryLocalInterface(r0)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72350i
            if (r0 == 0) goto L_0x0152
            r1 = r6
            org.chromium.b.a.i r1 = (org.chromium.p5643b.p5644a.C72350i) r1
            goto L_0x0157
        L_0x0152:
            org.chromium.b.a.g r1 = new org.chromium.b.a.g
            r1.<init>(r3)
        L_0x0157:
            r2.enforceNoDataAvail(r4)
            r2.mo63705g(r1)
            r5.writeNoException()
            goto L_0x0188
        L_0x0161:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            java.lang.String r6 = "org.chromium.weblayer_private.interfaces.INavigation"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof org.chromium.p5643b.p5644a.C72311ag
            if (r0 == 0) goto L_0x0176
            r1 = r6
            org.chromium.b.a.ag r1 = (org.chromium.p5643b.p5644a.C72311ag) r1
            goto L_0x017b
        L_0x0176:
            org.chromium.b.a.ag r1 = new org.chromium.b.a.ag
            r1.<init>(r3)
        L_0x017b:
            r2.enforceNoDataAvail(r4)
            org.chromium.b.a.i r3 = r2.mo63713o(r1)
            r5.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r5, r3)
        L_0x0188:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72313ai.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
