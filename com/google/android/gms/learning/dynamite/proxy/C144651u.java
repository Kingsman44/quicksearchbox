package com.google.android.gms.learning.dynamite.proxy;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C144017q;
import com.google.android.gms.learning.internal.C144784p;
import com.google.android.gms.p10793f.C144166k;
import com.google.common.base.C58887cx;
import com.google.common.base.C58889cz;
import java.util.List;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.u */
/* compiled from: PG */
final class C144651u extends C144647q {

    /* renamed from: a */
    final /* synthetic */ InAppExampleStoreProxyImpl f391368a;

    public C144651u(InAppExampleStoreProxyImpl inAppExampleStoreProxyImpl) {
        this.f391368a = inAppExampleStoreProxyImpl;
    }

    /* renamed from: e */
    public final void mo120100e(String str, byte[] bArr, byte[] bArr2, C144645o oVar, byte[] bArr3) {
        long j;
        String str2 = str;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr3;
        Context context = this.f391368a.f391330a;
        int callingUid = Binder.getCallingUid();
        if (callingUid == context.getApplicationInfo().uid || C144017q.m234197a(context, callingUid)) {
            if (Log.isLoggable("brella.InAppExStPrxImpl", 3)) {
                Log.d("brella.InAppExStPrxImpl", "startQueryChunked(" + str2 + ")");
            }
            long a = this.f391368a.f391334e.mo26884a();
            synchronized (this.f391368a.f391332c) {
                try {
                    if (bArr6.length == 0 || !this.f391368a.f391331b.mo120188c()) {
                        C144784p pVar = this.f391368a.f391331b;
                        C144166k kVar = new C144166k(bArr4);
                        C144166k kVar2 = new C144166k(bArr5);
                        InAppExampleStoreProxyImpl inAppExampleStoreProxyImpl = this.f391368a;
                        C58889cz czVar = inAppExampleStoreProxyImpl.f391334e;
                        Object obj = inAppExampleStoreProxyImpl.f391332c;
                        List list = inAppExampleStoreProxyImpl.f391333d;
                        C144650t tVar = new C144650t(inAppExampleStoreProxyImpl);
                        List list2 = list;
                        long j2 = a;
                        j = a;
                        C144636f fVar = r2;
                        C144166k kVar3 = kVar;
                        try {
                            C144636f fVar2 = new C144636f(str, oVar, j2, czVar, obj, list2, tVar);
                            pVar.mo120186a(str2, kVar3, kVar2, fVar);
                        } catch (RemoteException | RuntimeException e) {
                            e = e;
                        }
                    } else {
                        C144784p pVar2 = this.f391368a.f391331b;
                        C144166k kVar4 = new C144166k(bArr4);
                        C144166k kVar5 = new C144166k(bArr5);
                        InAppExampleStoreProxyImpl inAppExampleStoreProxyImpl2 = this.f391368a;
                        pVar2.mo120187b(str, kVar4, kVar5, new C144636f(str, oVar, a, inAppExampleStoreProxyImpl2.f391334e, inAppExampleStoreProxyImpl2.f391332c, inAppExampleStoreProxyImpl2.f391333d, new C144649s(inAppExampleStoreProxyImpl2)), new C144166k(bArr6));
                    }
                } catch (RemoteException | RuntimeException e2) {
                    e = e2;
                    j = a;
                    if (e instanceof RuntimeException) {
                        this.f391368a.mo120079a(995, str2);
                    }
                    try {
                        oVar.mo120098e(new Status(1, true != (e instanceof RemoteException) ? 10 : 8, C58887cx.m90975b(e), (PendingIntent) null, (ConnectionResult) null), 0, this.f391368a.f391334e.mo26884a() - j);
                    } catch (RemoteException e3) {
                        Log.w("brella.InAppExStPrxImpl", "Failed to call onStartQueryFailure on AIDL callback", e3);
                    }
                    return;
                }
            }
            return;
        }
        String str3 = "Disallowed caller! uid=" + callingUid;
        Log.w("brella.InAppExStPrxImpl", str3);
        throw new SecurityException(str3);
    }
}
