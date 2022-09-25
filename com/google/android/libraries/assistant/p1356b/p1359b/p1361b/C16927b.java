package com.google.android.libraries.assistant.p1356b.p1359b.p1361b;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.assistant.b.b.b.b */
/* compiled from: PG */
public abstract class C16927b extends C8849b implements C16928c {
    private static final String DESCRIPTOR = "com.google.android.libraries.assistant.ambient.dynamic.shared.IAmbientDynamicBridge";
    static final int TRANSACTION_getAmbientContentView = 2;

    public C16927b() {
        super(DESCRIPTOR);
    }

    public static C16928c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        return queryLocalInterface instanceof C16928c ? (C16928c) queryLocalInterface : new C16926a(iBinder);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 2
            if (r2 != r5) goto L_0x002e
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r5 = "com.google.android.libraries.assistant.dynamicloading.shared.IObjectWrapper"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.libraries.assistant.p1518i.p1519a.C18394e
            if (r0 == 0) goto L_0x0019
            r2 = r5
            com.google.android.libraries.assistant.i.a.e r2 = (com.google.android.libraries.assistant.p1518i.p1519a.C18394e) r2
            goto L_0x001f
        L_0x0019:
            com.google.android.libraries.assistant.i.a.c r5 = new com.google.android.libraries.assistant.i.a.c
            r5.<init>(r2)
            r2 = r5
        L_0x001f:
            r1.enforceNoDataAvail(r3)
            com.google.android.libraries.assistant.i.a.e r2 = r1.getAmbientContentView(r2)
            r4.writeNoException()
            com.google.android.p445a.C8850c.m23499h(r4, r2)
            r2 = 1
            return r2
        L_0x002e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1356b.p1359b.p1361b.C16927b.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
