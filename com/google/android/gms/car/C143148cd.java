package com.google.android.gms.car;

import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.car.cd */
/* compiled from: PG */
public abstract class C143148cd extends C8849b implements C143149ce {
    public C143148cd() {
        super("com.google.android.gms.car.ICarProjection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.google.android.gms.car.br} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: com.google.android.gms.car.cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: com.google.android.gms.car.cf} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r11v24 */
    /* JADX WARNING: type inference failed for: r11v25 */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: type inference failed for: r11v27 */
    /* JADX WARNING: type inference failed for: r11v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            java.lang.String r10 = "com.google.android.gms.car.ICarProjectionCallback"
            r11 = 0
            switch(r8) {
                case 1: goto L_0x01ea;
                case 2: goto L_0x01c7;
                case 3: goto L_0x01b8;
                case 4: goto L_0x01ad;
                case 5: goto L_0x01a1;
                case 6: goto L_0x0182;
                case 7: goto L_0x016e;
                case 8: goto L_0x015b;
                case 9: goto L_0x014f;
                case 10: goto L_0x0143;
                case 11: goto L_0x013e;
                case 12: goto L_0x0139;
                case 13: goto L_0x0134;
                case 14: goto L_0x012f;
                case 15: goto L_0x0123;
                case 16: goto L_0x0117;
                case 17: goto L_0x0107;
                case 18: goto L_0x00f7;
                case 19: goto L_0x00eb;
                case 20: goto L_0x00db;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00bb;
                case 23: goto L_0x008a;
                case 24: goto L_0x006a;
                case 25: goto L_0x0065;
                case 26: goto L_0x0030;
                case 27: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r8 = 0
            return r8
        L_0x0008:
            android.os.IBinder r8 = r9.readStrongBinder()
            if (r8 != 0) goto L_0x000f
            goto L_0x0020
        L_0x000f:
            android.os.IInterface r10 = r8.queryLocalInterface(r10)
            boolean r11 = r10 instanceof com.google.android.gms.car.C143150cf
            if (r11 == 0) goto L_0x001b
            r11 = r10
            com.google.android.gms.car.cf r11 = (com.google.android.gms.car.C143150cf) r11
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.car.cf r11 = new com.google.android.gms.car.cf
            r11.<init>(r8)
        L_0x0020:
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.KillOptions.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            com.google.android.gms.car.KillOptions r8 = (com.google.android.gms.car.KillOptions) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118108z(r11, r8)
            goto L_0x0221
        L_0x0030:
            int r1 = r9.readInt()
            int r2 = r9.readInt()
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.DrawingSpec.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r3 = r8
            com.google.android.gms.car.DrawingSpec r3 = (com.google.android.gms.car.DrawingSpec) r3
            android.os.Parcelable$Creator r8 = android.content.Intent.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r4 = r8
            android.content.Intent r4 = (android.content.Intent) r4
            android.os.Parcelable$Creator r8 = android.content.res.Configuration.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r5 = r8
            android.content.res.Configuration r5 = (android.content.res.Configuration) r5
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r6 = r8
            android.os.Bundle r6 = (android.os.Bundle) r6
            r7.enforceNoDataAvail(r9)
            r0 = r7
            r0.mo118095m(r1, r2, r3, r4, r5, r6)
            goto L_0x0221
        L_0x0065:
            r7.mo118084b()
            goto L_0x0221
        L_0x006a:
            android.os.IBinder r8 = r9.readStrongBinder()
            if (r8 != 0) goto L_0x0071
            goto L_0x0082
        L_0x0071:
            android.os.IInterface r10 = r8.queryLocalInterface(r10)
            boolean r11 = r10 instanceof com.google.android.gms.car.C143150cf
            if (r11 == 0) goto L_0x007d
            r11 = r10
            com.google.android.gms.car.cf r11 = (com.google.android.gms.car.C143150cf) r11
            goto L_0x0082
        L_0x007d:
            com.google.android.gms.car.cf r11 = new com.google.android.gms.car.cf
            r11.<init>(r8)
        L_0x0082:
            r7.enforceNoDataAvail(r9)
            r7.mo118107y(r11)
            goto L_0x0221
        L_0x008a:
            int r1 = r9.readInt()
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.DrawingSpec.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r2 = r8
            com.google.android.gms.car.DrawingSpec r2 = (com.google.android.gms.car.DrawingSpec) r2
            android.os.Parcelable$Creator r8 = android.content.Intent.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r3 = r8
            android.content.Intent r3 = (android.content.Intent) r3
            android.os.Parcelable$Creator r8 = android.content.res.Configuration.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r4 = r8
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            r5 = r8
            android.os.Bundle r5 = (android.os.Bundle) r5
            r7.enforceNoDataAvail(r9)
            r0 = r7
            r0.mo118097o(r1, r2, r3, r4, r5)
            goto L_0x0221
        L_0x00bb:
            android.os.Parcelable$Creator r8 = android.graphics.Rect.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118100r(r8)
            goto L_0x0221
        L_0x00cb:
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.CarWindowManagerLayoutParams.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            com.google.android.gms.car.CarWindowManagerLayoutParams r8 = (com.google.android.gms.car.CarWindowManagerLayoutParams) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118102t(r8)
            goto L_0x0221
        L_0x00db:
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.InputFocusChangedEvent.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            com.google.android.gms.car.InputFocusChangedEvent r8 = (com.google.android.gms.car.InputFocusChangedEvent) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118088f(r8)
            goto L_0x0221
        L_0x00eb:
            android.os.IBinder r8 = r9.readStrongBinder()
            r7.enforceNoDataAvail(r9)
            r7.mo118086d(r8)
            goto L_0x0221
        L_0x00f7:
            boolean r8 = com.google.android.p445a.C8850c.m23500i(r9)
            boolean r10 = com.google.android.p445a.C8850c.m23500i(r9)
            r7.enforceNoDataAvail(r9)
            r7.mo118090h(r8, r10)
            goto L_0x0221
        L_0x0107:
            android.os.Parcelable$Creator r8 = com.google.android.gms.car.DrawingSpec.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            com.google.android.gms.car.DrawingSpec r8 = (com.google.android.gms.car.DrawingSpec) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118103u(r8)
            goto L_0x0221
        L_0x0117:
            int r8 = r9.readInt()
            r7.enforceNoDataAvail(r9)
            r7.mo118092j(r8)
            goto L_0x0221
        L_0x0123:
            int r8 = r9.readInt()
            r7.enforceNoDataAvail(r9)
            r7.mo118087e(r8)
            goto L_0x0221
        L_0x012f:
            r7.mo118104v()
            goto L_0x0221
        L_0x0134:
            r7.mo118083a()
            goto L_0x0221
        L_0x0139:
            r7.mo118099q()
            goto L_0x0221
        L_0x013e:
            r7.mo118085c()
            goto L_0x0221
        L_0x0143:
            boolean r8 = com.google.android.p445a.C8850c.m23500i(r9)
            r7.enforceNoDataAvail(r9)
            r7.mo118089g(r8)
            goto L_0x0221
        L_0x014f:
            int r8 = r9.readInt()
            r7.enforceNoDataAvail(r9)
            r7.mo118098p(r8)
            goto L_0x0221
        L_0x015b:
            r9.readInt()
            android.os.Parcelable$Creator r8 = android.view.KeyEvent.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            android.view.KeyEvent r8 = (android.view.KeyEvent) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118105w(r8)
            goto L_0x0221
        L_0x016e:
            int r8 = r9.readInt()
            android.os.Parcelable$Creator r10 = android.view.MotionEvent.CREATOR
            android.os.Parcelable r10 = com.google.android.p445a.C8850c.m23492a(r9, r10)
            android.view.MotionEvent r10 = (android.view.MotionEvent) r10
            r7.enforceNoDataAvail(r9)
            r7.mo118101s(r8, r10)
            goto L_0x0221
        L_0x0182:
            r9.readInt()
            int r8 = r9.readInt()
            android.os.Parcelable$Creator r10 = com.google.android.gms.car.DrawingSpec.CREATOR
            android.os.Parcelable r10 = com.google.android.p445a.C8850c.m23492a(r9, r10)
            com.google.android.gms.car.DrawingSpec r10 = (com.google.android.gms.car.DrawingSpec) r10
            android.os.Parcelable$Creator r11 = android.content.res.Configuration.CREATOR
            android.os.Parcelable r11 = com.google.android.p445a.C8850c.m23492a(r9, r11)
            android.content.res.Configuration r11 = (android.content.res.Configuration) r11
            r7.enforceNoDataAvail(r9)
            r7.mo118106x(r8, r10, r11)
            goto L_0x0221
        L_0x01a1:
            int r8 = r9.readInt()
            r7.enforceNoDataAvail(r9)
            r7.mo118093k(r8)
            goto L_0x0221
        L_0x01ad:
            int r8 = r9.readInt()
            r7.enforceNoDataAvail(r9)
            r7.mo118094l(r8)
            goto L_0x0221
        L_0x01b8:
            android.os.Parcelable$Creator r8 = android.content.Intent.CREATOR
            android.os.Parcelable r8 = com.google.android.p445a.C8850c.m23492a(r9, r8)
            android.content.Intent r8 = (android.content.Intent) r8
            r7.enforceNoDataAvail(r9)
            r7.mo118091i(r8)
            goto L_0x0221
        L_0x01c7:
            int r8 = r9.readInt()
            android.os.Parcelable$Creator r10 = com.google.android.gms.car.DrawingSpec.CREATOR
            android.os.Parcelable r10 = com.google.android.p445a.C8850c.m23492a(r9, r10)
            com.google.android.gms.car.DrawingSpec r10 = (com.google.android.gms.car.DrawingSpec) r10
            android.os.Parcelable$Creator r11 = android.content.Intent.CREATOR
            android.os.Parcelable r11 = com.google.android.p445a.C8850c.m23492a(r9, r11)
            android.content.Intent r11 = (android.content.Intent) r11
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.p445a.C8850c.m23492a(r9, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r7.enforceNoDataAvail(r9)
            r7.mo118096n(r8, r10, r11, r0)
            goto L_0x0221
        L_0x01ea:
            android.os.IBinder r8 = r9.readStrongBinder()
            if (r8 != 0) goto L_0x01f2
            r10 = r11
            goto L_0x0202
        L_0x01f2:
            android.os.IInterface r10 = r8.queryLocalInterface(r10)
            boolean r0 = r10 instanceof com.google.android.gms.car.C143150cf
            if (r0 == 0) goto L_0x01fd
            com.google.android.gms.car.cf r10 = (com.google.android.gms.car.C143150cf) r10
            goto L_0x0202
        L_0x01fd:
            com.google.android.gms.car.cf r10 = new com.google.android.gms.car.cf
            r10.<init>(r8)
        L_0x0202:
            android.os.IBinder r8 = r9.readStrongBinder()
            if (r8 != 0) goto L_0x0209
            goto L_0x021b
        L_0x0209:
            java.lang.String r11 = "com.google.android.gms.car.ICar"
            android.os.IInterface r11 = r8.queryLocalInterface(r11)
            boolean r0 = r11 instanceof com.google.android.gms.car.C143134br
            if (r0 == 0) goto L_0x0216
            com.google.android.gms.car.br r11 = (com.google.android.gms.car.C143134br) r11
            goto L_0x021b
        L_0x0216:
            com.google.android.gms.car.br r11 = new com.google.android.gms.car.br
            r11.<init>(r8)
        L_0x021b:
            r7.enforceNoDataAvail(r9)
            r7.mo118082A(r10, r11)
        L_0x0221:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.C143148cd.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
