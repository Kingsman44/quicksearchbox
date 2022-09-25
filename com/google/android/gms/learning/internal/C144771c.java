package com.google.android.gms.learning.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p10793f.C144166k;
import com.google.common.base.C58889cz;

/* renamed from: com.google.android.gms.learning.internal.c */
/* compiled from: PG */
public final class C144771c {

    /* renamed from: a */
    private final C144764b f391620a;

    /* renamed from: b */
    private final C144775g f391621b;

    /* renamed from: c */
    private final C58889cz f391622c;

    /* renamed from: d */
    private final long f391623d;

    public C144771c(C144764b bVar, C144775g gVar, C58889cz czVar) {
        this.f391620a = bVar;
        this.f391621b = gVar;
        this.f391622c = czVar;
        this.f391623d = czVar.mo26884a();
    }

    /* renamed from: a */
    public final void mo120202a(String str) {
        try {
            this.f391621b.mo120092a(new Status(1, 8, str, (PendingIntent) null, (ConnectionResult) null), this.f391622c.mo26884a() - this.f391623d);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.f391620a.mo120197a();
        }
    }

    /* renamed from: b */
    public final void mo120203b(byte[] bArr, byte[] bArr2) {
        C144166k kVar;
        long a = this.f391622c.mo26884a() - this.f391623d;
        try {
            C144775g gVar = this.f391621b;
            C144166k kVar2 = null;
            if (bArr == null) {
                kVar = null;
            } else {
                kVar = new C144166k(bArr);
            }
            if (bArr2 != null) {
                kVar2 = new C144166k(bArr2);
            }
            gVar.mo120093b(kVar, kVar2, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.f391620a.mo120197a();
        }
    }
}
