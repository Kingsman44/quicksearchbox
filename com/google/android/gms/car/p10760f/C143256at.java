package com.google.android.gms.car.p10760f;

import android.util.SparseArray;
import android.view.View;

/* renamed from: com.google.android.gms.car.f.at */
/* compiled from: PG */
public final /* synthetic */ class C143256at implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388407a;

    public /* synthetic */ C143256at(C143268bb bbVar) {
        this.f388407a = bbVar;
    }

    public final void run() {
        C143268bb bbVar = this.f388407a;
        SparseArray sparseArray = C143268bb.f388432a;
        View view = bbVar.f388472u;
        if (view != null) {
            view.invalidate();
        }
    }
}
