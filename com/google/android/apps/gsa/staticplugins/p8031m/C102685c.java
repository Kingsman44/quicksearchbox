package com.google.android.apps.gsa.staticplugins.p8031m;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.m.c */
/* compiled from: PG */
public final /* synthetic */ class C102685c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102691i f286614a;

    public /* synthetic */ C102685c(C102691i iVar) {
        this.f286614a = iVar;
    }

    public final void run() {
        C102691i iVar = this.f286614a;
        if (!iVar.f286628j) {
            int x = iVar.f286623c.mo71763x();
            int streamVolume = iVar.f286625g.getStreamVolume(x);
            int streamMaxVolume = iVar.f286625g.getStreamMaxVolume(x) / 2;
            if (streamVolume < iVar.f286625g.getStreamMaxVolume(x) / 4) {
                iVar.f286627i = streamVolume;
                iVar.f286625g.setStreamVolume(x, streamMaxVolume, 0);
                iVar.f286626h = x;
                iVar.f286628j = true;
            }
        }
    }
}
