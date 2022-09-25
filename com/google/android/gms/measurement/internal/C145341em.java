package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p10895i.p10896a.C146592a;

/* renamed from: com.google.android.gms.measurement.internal.em */
/* compiled from: PG */
public final class C145341em implements ServiceConnection {

    /* renamed from: a */
    public final String f392873a;

    /* renamed from: b */
    final /* synthetic */ C145342en f392874b;

    public C145341em(C145342en enVar, String str) {
        this.f392874b = enVar;
        this.f392873a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C146592a aVar;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof C146592a) {
                    aVar = (C146592a) queryLocalInterface;
                } else {
                    aVar = new C146592a(iBinder);
                }
                if (aVar == null) {
                    this.f392874b.f392875a.mo120965ar().f392798f.mo120894a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f392874b.f392875a.mo120965ar().f392803k.mo120894a("Install Referrer Service connected");
                this.f392874b.f392875a.mo120966as().mo120960h(new C145340el(this, aVar, this));
            } catch (RuntimeException e) {
                this.f392874b.f392875a.mo120965ar().f392798f.mo120895b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f392874b.f392875a.mo120965ar().f392798f.mo120894a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f392874b.f392875a.mo120965ar().f392803k.mo120894a("Install Referrer Service disconnected");
    }
}
