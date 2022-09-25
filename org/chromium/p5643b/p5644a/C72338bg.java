package org.chromium.p5643b.p5644a;

import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.bg */
/* compiled from: PG */
public abstract class C72338bg extends C8849b implements C72339bh {
    public C72338bg() {
        super("org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: org.chromium.b.a.bi} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v8, types: [org.chromium.b.a.l] */
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
            r0 = 1
            if (r4 == r0) goto L_0x005b
            r1 = 2
            if (r4 == r1) goto L_0x004c
            r1 = 3
            if (r4 == r1) goto L_0x0041
            r1 = 4
            if (r4 == r1) goto L_0x0036
            r1 = 5
            if (r4 == r1) goto L_0x0012
            r4 = 0
            return r4
        L_0x0012:
            int r4 = r5.readInt()
            android.os.IBinder r1 = r5.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            goto L_0x002f
        L_0x001d:
            java.lang.String r7 = "org.chromium.weblayer_private.interfaces.IClientPage"
            android.os.IInterface r7 = r1.queryLocalInterface(r7)
            boolean r2 = r7 instanceof org.chromium.p5643b.p5644a.C72353l
            if (r2 == 0) goto L_0x002a
            org.chromium.b.a.l r7 = (org.chromium.p5643b.p5644a.C72353l) r7
            goto L_0x002f
        L_0x002a:
            org.chromium.b.a.j r7 = new org.chromium.b.a.j
            r7.<init>(r1)
        L_0x002f:
            r3.enforceNoDataAvail(r5)
            r3.mo63808d(r4, r7)
            goto L_0x0084
        L_0x0036:
            int r4 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            r3.mo63806b(r4)
            goto L_0x0084
        L_0x0041:
            int r4 = r5.readInt()
            r3.enforceNoDataAvail(r5)
            r3.mo63807c(r4)
            goto L_0x0084
        L_0x004c:
            int r4 = r5.readInt()
            java.lang.String r7 = r5.readString()
            r3.enforceNoDataAvail(r5)
            r3.mo63805a(r4, r7)
            goto L_0x0084
        L_0x005b:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0062
            goto L_0x0074
        L_0x0062:
            java.lang.String r7 = "org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy"
            android.os.IInterface r7 = r4.queryLocalInterface(r7)
            boolean r1 = r7 instanceof org.chromium.p5643b.p5644a.C72340bi
            if (r1 == 0) goto L_0x006f
            org.chromium.b.a.bi r7 = (org.chromium.p5643b.p5644a.C72340bi) r7
            goto L_0x0074
        L_0x006f:
            org.chromium.b.a.bi r7 = new org.chromium.b.a.bi
            r7.<init>(r4)
        L_0x0074:
            int r4 = r5.readInt()
            com.google.android.p445a.C8850c.m23500i(r5)
            r5.readString()
            r3.enforceNoDataAvail(r5)
            r3.mo63809e(r7, r4)
        L_0x0084:
            r6.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.p5643b.p5644a.C72338bg.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
