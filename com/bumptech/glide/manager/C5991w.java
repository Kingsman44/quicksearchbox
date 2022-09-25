package com.bumptech.glide.manager;

import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.manager.w */
/* compiled from: PG */
final class C5991w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f17663a;

    /* renamed from: b */
    final /* synthetic */ C5992x f17664b;

    public C5991w(C5992x xVar, boolean z) {
        this.f17664b = xVar;
        this.f17663a = z;
    }

    public final void run() {
        C5992x xVar = this.f17664b;
        boolean z = this.f17663a;
        C5632s.m14617j();
        C5993y yVar = xVar.f17665a;
        boolean z2 = yVar.f17666a;
        yVar.f17666a = z;
        if (z2 != z) {
            yVar.f17667b.mo11862a(z);
        }
    }
}
