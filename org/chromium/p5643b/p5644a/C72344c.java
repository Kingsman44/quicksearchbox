package org.chromium.p5643b.p5644a;

import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.c */
/* compiled from: PG */
public abstract class C72344c extends C8849b implements C72345d {
    public C72344c() {
        super("org.chromium.weblayer_private.interfaces.IBrowserClient");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x005d;
                case 2: goto L_0x0037;
                case 3: goto L_0x0029;
                case 4: goto L_0x001e;
                case 5: goto L_0x000c;
                case 6: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            r1.mo63812c()
            r4.writeNoException()
            goto L_0x006a
        L_0x000c:
            boolean r2 = com.google.android.p445a.C8850c.m23500i(r3)
            int r5 = r3.readInt()
            r1.enforceNoDataAvail(r3)
            r1.mo63811b(r2, r5)
            r4.writeNoException()
            goto L_0x006a
        L_0x001e:
            org.chromium.b.a.ar r2 = r1.mo63814e()
            r4.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r4, r2)
            goto L_0x006a
        L_0x0029:
            int r2 = r3.readInt()
            r1.enforceNoDataAvail(r3)
            r1.mo63813d(r2)
            r4.writeNoException()
            goto L_0x006a
        L_0x0037:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x003f
            r2 = 0
            goto L_0x0053
        L_0x003f:
            java.lang.String r5 = "org.chromium.weblayer_private.interfaces.ITab"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof org.chromium.p5643b.p5644a.C72327aw
            if (r0 == 0) goto L_0x004d
            r2 = r5
            org.chromium.b.a.aw r2 = (org.chromium.p5643b.p5644a.C72327aw) r2
            goto L_0x0053
        L_0x004d:
            org.chromium.b.a.aw r5 = new org.chromium.b.a.aw
            r5.<init>(r2)
            r2 = r5
        L_0x0053:
            r1.enforceNoDataAvail(r3)
            r1.mo63815f(r2)
            r4.writeNoException()
            goto L_0x006a
        L_0x005d:
            int r2 = r3.readInt()
            r1.enforceNoDataAvail(r3)
            r1.mo63810a(r2)
            r4.writeNoException()
        L_0x006a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72344c.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
