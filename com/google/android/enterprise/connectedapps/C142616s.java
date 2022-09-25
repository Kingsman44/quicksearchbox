package com.google.android.enterprise.connectedapps;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.enterprise.connectedapps.s */
/* compiled from: PG */
public final /* synthetic */ class C142616s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C142620w f386943a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f386944b;

    public /* synthetic */ C142616s(C142620w wVar, IBinder iBinder) {
        this.f386943a = wVar;
        this.f386944b = iBinder;
    }

    public final void run() {
        C142552al alVar;
        C142620w wVar = this.f386943a;
        IBinder iBinder = this.f386944b;
        if (wVar.f386948a.f386816k.isEmpty()) {
            Log.i("CrossProfileSender", "Connected but no holders. Disconnecting.");
            wVar.f386948a.mo117163o();
            return;
        }
        AtomicReference atomicReference = wVar.f386948a.f386813h;
        if (iBinder == null) {
            alVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileService");
            alVar = queryLocalInterface instanceof C142552al ? (C142552al) queryLocalInterface : new C142550aj(iBinder);
        }
        atomicReference.set(alVar);
        wVar.f386948a.mo117162n();
        wVar.f386948a.mo117155g();
        wVar.f386948a.mo117158j();
    }
}
