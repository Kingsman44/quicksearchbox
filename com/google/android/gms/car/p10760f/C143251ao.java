package com.google.android.gms.car.p10760f;

import android.os.IBinder;
import android.util.SparseArray;
import com.google.android.gms.car.C143091ac;

/* renamed from: com.google.android.gms.car.f.ao */
/* compiled from: PG */
public final /* synthetic */ class C143251ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388396a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f388397b;

    public /* synthetic */ C143251ao(C143268bb bbVar, IBinder iBinder) {
        this.f388396a = bbVar;
        this.f388397b = iBinder;
    }

    public final void run() {
        C143268bb bbVar = this.f388396a;
        IBinder iBinder = this.f388397b;
        SparseArray sparseArray = C143268bb.f388432a;
        C143091ac acVar = bbVar.f388461j;
        if (acVar != null) {
            acVar.mo17280a(iBinder);
        }
    }
}
