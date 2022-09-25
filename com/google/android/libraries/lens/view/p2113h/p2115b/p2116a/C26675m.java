package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.hardware.Camera;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C26675m implements Camera.AutoFocusMoveCallback {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72722a;

    public /* synthetic */ C26675m(C26679q qVar) {
        this.f72722a = qVar;
    }

    public final void onAutoFocusMoving(boolean z, Camera camera) {
        C26679q qVar = this.f72722a;
        if (qVar.f72738l == camera) {
            qVar.f72745s = !z;
        }
    }
}
