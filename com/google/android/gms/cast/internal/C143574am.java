package com.google.android.gms.cast.internal;

/* renamed from: com.google.android.gms.cast.internal.am */
/* compiled from: PG */
public final /* synthetic */ class C143574am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143575an f389300a;

    public /* synthetic */ C143574am(C143575an anVar) {
        this.f389300a = anVar;
    }

    public final void run() {
        C143575an anVar = this.f389300a;
        synchronized (C143575an.f389301a) {
            if (anVar.f389303b != -1) {
                anVar.mo118908d(15);
            }
        }
    }
}
