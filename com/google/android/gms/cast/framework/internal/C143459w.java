package com.google.android.gms.cast.framework.internal;

import androidx.mediarouter.p175a.C3753z;

/* renamed from: com.google.android.gms.cast.framework.internal.w */
/* compiled from: PG */
public final /* synthetic */ class C143459w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143461y f389006a;

    /* renamed from: b */
    public final /* synthetic */ C3753z f389007b;

    /* renamed from: c */
    public final /* synthetic */ int f389008c;

    public /* synthetic */ C143459w(C143461y yVar, C3753z zVar, int i) {
        this.f389006a = yVar;
        this.f389007b = zVar;
        this.f389008c = i;
    }

    public final void run() {
        C143461y yVar = this.f389006a;
        C3753z zVar = this.f389007b;
        int i = this.f389008c;
        synchronized (yVar.f389014d) {
            yVar.mo118701n(zVar, i);
        }
    }
}
