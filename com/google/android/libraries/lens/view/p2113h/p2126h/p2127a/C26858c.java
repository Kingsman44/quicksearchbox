package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.view.Surface;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C26858c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26878u f73179a;

    public /* synthetic */ C26858c(C26878u uVar) {
        this.f73179a = uVar;
    }

    public final void run() {
        for (Surface release : this.f73179a.f73259u) {
            release.release();
        }
    }
}
