package com.google.android.gms.learning.dynamite.proxy;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.C144774f;
import com.google.common.base.C58889cz;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.e */
/* compiled from: PG */
public final class C144635e extends C144774f {

    /* renamed from: a */
    public final C144642l f391351a;

    /* renamed from: b */
    public final C58889cz f391352b;

    /* renamed from: c */
    public final AtomicLong f391353c;

    /* renamed from: d */
    public final AtomicLong f391354d = new AtomicLong(0);

    /* renamed from: e */
    private final int f391355e;

    /* renamed from: f */
    private final C144633c f391356f;

    /* renamed from: g */
    private final AtomicBoolean f391357g = new AtomicBoolean(false);

    public C144635e(C144642l lVar, int i, C144633c cVar, C58889cz czVar, long j) {
        this.f391351a = lVar;
        this.f391355e = i;
        this.f391356f = cVar;
        this.f391352b = czVar;
        this.f391353c = new AtomicLong(j);
    }

    /* renamed from: c */
    private final void m235129c(byte[] bArr, C144634d dVar) {
        boolean z;
        if (this.f391357g.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextSuccess, result already returned!");
        } else if (bArr == null) {
            try {
                dVar.mo120091a((byte[]) null, true);
            } catch (TransactionTooLargeException e) {
                Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
                try {
                    this.f391351a.mo120097f(new Status(1, 8, "TransactionTooLargeException", (PendingIntent) null, (ConnectionResult) null), 0, 0);
                } catch (RemoteException unused) {
                    Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
                }
                this.f391356f.mo120089b(C144631a.f391339a);
                throw e;
            } catch (RemoteException e2) {
                Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e2);
                this.f391356f.mo120089b(C144631a.f391339a);
            }
        } else if (bArr.length > this.f391355e) {
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i < length) {
                    int i2 = this.f391355e + i;
                    if (i2 >= length) {
                        z = true;
                    } else {
                        length = i2;
                        z = false;
                    }
                    dVar.mo120091a(Arrays.copyOfRange(bArr, i, length), z);
                    i += this.f391355e;
                } else {
                    return;
                }
            }
        } else {
            dVar.mo120091a(bArr, true);
        }
    }

    /* renamed from: a */
    public final void mo120092a(Status status, long j) {
        if (this.f391357g.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextFailure, result already returned!");
            return;
        }
        try {
            this.f391351a.mo120097f(status, j, this.f391352b.mo26884a() - this.f391353c.get());
        } catch (RemoteException e) {
            Log.w("ExmplStrItrCallback", "Failed to call onIteratorNextFailure on AIDL callback", e);
            this.f391356f.mo120089b(C144631a.f391339a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120093b(com.google.android.gms.p10793f.C144165j r2, com.google.android.gms.p10793f.C144165j r3, long r4) {
        /*
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L_0x0005
            r2 = r0
            goto L_0x000b
        L_0x0005:
            java.lang.Object r2 = com.google.android.gms.p10793f.C144166k.m234388a(r2)
            byte[] r2 = (byte[]) r2
        L_0x000b:
            if (r3 != 0) goto L_0x000e
            goto L_0x0015
        L_0x000e:
            java.lang.Object r3 = com.google.android.gms.p10793f.C144166k.m234388a(r3)
            r0 = r3
            byte[] r0 = (byte[]) r0
        L_0x0015:
            com.google.android.gms.learning.dynamite.proxy.d r3 = new com.google.android.gms.learning.dynamite.proxy.d
            r3.<init>(r1, r0, r4)
            r1.m235129c(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.proxy.C144635e.mo120093b(com.google.android.gms.f.j, com.google.android.gms.f.j, long):void");
    }
}
