package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cb */
/* compiled from: PG */
public final /* synthetic */ class C143781cb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f389801a;

    /* renamed from: b */
    public final /* synthetic */ C143783cd f389802b;

    public /* synthetic */ C143781cb(C143784ce ceVar, C143783cd cdVar) {
        this.f389801a = ceVar;
        this.f389802b = cdVar;
    }

    public final void run() {
        C143784ce ceVar = this.f389801a;
        C143783cd cdVar = this.f389802b;
        Object obj = ceVar.f389805a;
        if (obj == null) {
            cdVar.mo118341c();
            return;
        }
        try {
            cdVar.mo118340b(obj);
        } catch (RuntimeException e) {
            cdVar.mo118341c();
            throw e;
        }
    }
}
