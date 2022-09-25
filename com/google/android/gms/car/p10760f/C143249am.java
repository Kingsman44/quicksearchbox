package com.google.android.gms.car.p10760f;

import android.util.SparseArray;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.am */
/* compiled from: PG */
public final /* synthetic */ class C143249am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388387a;

    /* renamed from: b */
    public final /* synthetic */ InputFocusChangedEvent f388388b;

    public /* synthetic */ C143249am(C143268bb bbVar, InputFocusChangedEvent inputFocusChangedEvent) {
        this.f388387a = bbVar;
        this.f388388b = inputFocusChangedEvent;
    }

    public final void run() {
        C143268bb bbVar = this.f388387a;
        InputFocusChangedEvent inputFocusChangedEvent = this.f388388b;
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            SparseArray sparseArray = C143268bb.f388432a;
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange() runOnMain onInputFocusChange(event:%s, callback:%b)", bbVar.f388473v, inputFocusChangedEvent, true);
        }
        SparseArray sparseArray2 = C143268bb.f388432a;
        bbVar.mo118312l(inputFocusChangedEvent, true);
    }
}
