package org.chromium.weblayer;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.p5643b.p5644a.C72334bc;
import org.chromium.p5643b.p5644a.C72337bf;

/* renamed from: org.chromium.weblayer.bs */
/* compiled from: PG */
public final class C72610bs {

    /* renamed from: a */
    public final List f193157a = new ArrayList();

    /* renamed from: b */
    public C72611bt f193158b;

    /* renamed from: c */
    public final boolean f193159c;

    /* renamed from: d */
    public final int f193160d;

    /* renamed from: e */
    public final String f193161e;

    /* renamed from: f */
    public boolean f193162f;

    /* renamed from: g */
    public Context f193163g;

    /* renamed from: h */
    private C72337bf f193164h;

    /* renamed from: i */
    private C72334bc f193165i;

    /* JADX WARNING: type inference failed for: r5v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72610bs(android.content.Context r11) {
        /*
            r10 = this;
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f193157a = r0
            android.content.Context r0 = r11.getApplicationContext()
            r10.f193163g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0028
            java.lang.String r0 = r11.getAttributionTag()
            if (r0 == 0) goto L_0x0028
            android.content.Context r0 = r10.f193163g
            java.lang.String r11 = r11.getAttributionTag()
            android.content.Context r11 = r0.createAttributionContext(r11)
            r10.f193163g = r11
        L_0x0028:
            r11 = -1
            r0 = 0
            android.content.Context r1 = r10.f193163g     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r2 = "org.chromium.weblayer_private.WebLayerFactoryImpl"
            java.lang.Class r1 = org.chromium.weblayer.C72611bt.m107415c(r1, r2)     // Catch:{ Exception -> 0x00d8 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00d8 }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00d8 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch:{ Exception -> 0x00d8 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00d8 }
            r7 = 1
            r5[r7] = r6     // Catch:{ Exception -> 0x00d8 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00d8 }
            r8 = 2
            r5[r8] = r6     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r6 = "create"
            java.lang.reflect.Method r1 = r1.getMethod(r6, r5)     // Catch:{ Exception -> 0x00d8 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r6 = "105.0.5121.0"
            r5[r0] = r6     // Catch:{ Exception -> 0x00d8 }
            r6 = 105(0x69, float:1.47E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00d8 }
            r5[r7] = r9     // Catch:{ Exception -> 0x00d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00d8 }
            r5[r8] = r9     // Catch:{ Exception -> 0x00d8 }
            r8 = 0
            java.lang.Object r1 = r1.invoke(r8, r5)     // Catch:{ Exception -> 0x00d8 }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ Exception -> 0x00d8 }
            if (r1 != 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            java.lang.String r5 = "org.chromium.weblayer_private.interfaces.IWebLayerFactory"
            android.os.IInterface r5 = r1.queryLocalInterface(r5)     // Catch:{ Exception -> 0x00d8 }
            boolean r8 = r5 instanceof org.chromium.p5643b.p5644a.C72337bf     // Catch:{ Exception -> 0x00d8 }
            if (r8 == 0) goto L_0x0079
            r8 = r5
            org.chromium.b.a.bf r8 = (org.chromium.p5643b.p5644a.C72337bf) r8     // Catch:{ Exception -> 0x00d8 }
            goto L_0x007e
        L_0x0079:
            org.chromium.b.a.bf r8 = new org.chromium.b.a.bf     // Catch:{ Exception -> 0x00d8 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x007e:
            r10.f193164h = r8     // Catch:{ Exception -> 0x00d8 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00d8 }
            long r8 = r8 - r2
            org.chromium.weblayer.C72611bt.f193170e = r8     // Catch:{ Exception -> 0x00d8 }
            org.chromium.b.a.bf r1 = r10.f193164h     // Catch:{ Exception -> 0x00d8 }
            android.os.Parcel r2 = r1.mo17260gA()     // Catch:{ Exception -> 0x00d8 }
            android.os.Parcel r1 = r1.mo17261gT(r7, r2)     // Catch:{ Exception -> 0x00d8 }
            boolean r2 = com.google.android.p445a.C8850c.m23500i(r1)     // Catch:{ Exception -> 0x00d8 }
            r1.recycle()     // Catch:{ Exception -> 0x00d8 }
            org.chromium.b.a.bf r1 = r10.f193164h     // Catch:{ Exception -> 0x00d4 }
            android.os.Parcel r3 = r1.mo17260gA()     // Catch:{ Exception -> 0x00d4 }
            r5 = 4
            android.os.Parcel r1 = r1.mo17261gT(r5, r3)     // Catch:{ Exception -> 0x00d4 }
            int r3 = r1.readInt()     // Catch:{ Exception -> 0x00d4 }
            r1.recycle()     // Catch:{ Exception -> 0x00d4 }
            org.chromium.b.a.bf r11 = r10.f193164h     // Catch:{ Exception -> 0x00d1 }
            android.os.Parcel r1 = r11.mo17260gA()     // Catch:{ Exception -> 0x00d1 }
            android.os.Parcel r11 = r11.mo17261gT(r4, r1)     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r1 = r11.readString()     // Catch:{ Exception -> 0x00d1 }
            r11.recycle()     // Catch:{ Exception -> 0x00d1 }
            if (r2 == 0) goto L_0x00c4
            r11 = 87
            if (r3 < r11) goto L_0x00c3
            r2 = 1
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            if (r2 == 0) goto L_0x00cf
            if (r3 >= r6) goto L_0x00cf
            int r11 = 105 - r3
            r2 = 6
            if (r11 > r2) goto L_0x00e4
            r0 = 1
            goto L_0x00e4
        L_0x00cf:
            r0 = r2
            goto L_0x00e4
        L_0x00d1:
            r11 = move-exception
            r0 = r2
            goto L_0x00db
        L_0x00d4:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L_0x00da
        L_0x00d8:
            r1 = move-exception
            r11 = r1
        L_0x00da:
            r3 = -1
        L_0x00db:
            java.lang.String r1 = "WebLayer"
            java.lang.String r2 = "Unable to create WebLayerFactory"
            android.util.Log.e(r1, r2, r11)
            java.lang.String r1 = "<unavailable>"
        L_0x00e4:
            r10.f193159c = r0
            r10.f193160d = r3
            r10.f193161e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72610bs.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo64480a() {
        if (this.f193158b == null) {
            C72334bc bcVar = this.f193165i;
            if (bcVar != null) {
                this.f193158b = new C72611bt(bcVar);
            }
            for (C72621j a : this.f193157a) {
                a.mo46626a(this.f193158b);
            }
            this.f193157a.clear();
        }
    }

    /* renamed from: b */
    public final C72334bc mo64481b() {
        C72334bc bcVar = this.f193165i;
        if (bcVar != null) {
            return bcVar;
        }
        C72334bc bcVar2 = null;
        if (!this.f193159c) {
            return null;
        }
        try {
            C72337bf bfVar = this.f193164h;
            Parcel gT = bfVar.mo17261gT(2, bfVar.mo17260gA());
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IWebLayer");
                if (queryLocalInterface instanceof C72334bc) {
                    bcVar2 = (C72334bc) queryLocalInterface;
                } else {
                    bcVar2 = new C72334bc(readStrongBinder);
                }
            }
            gT.recycle();
            this.f193165i = bcVar2;
            return bcVar2;
        } catch (RemoteException e) {
            throw new AndroidRuntimeException(e);
        }
    }
}
