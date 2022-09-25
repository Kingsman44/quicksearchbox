package com.google.android.gms.car.p10760f;

import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143181dh;
import com.google.android.gms.car.C143207dx;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.ai */
/* compiled from: PG */
public final /* synthetic */ class C143245ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388378a;

    /* renamed from: b */
    public final /* synthetic */ DrawingSpec f388379b;

    public /* synthetic */ C143245ai(C143268bb bbVar, DrawingSpec drawingSpec) {
        this.f388378a = bbVar;
        this.f388379b = drawingSpec;
    }

    public final void run() {
        C143268bb bbVar = this.f388378a;
        DrawingSpec drawingSpec = this.f388379b;
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.f388437E = drawingSpec;
        if (bbVar.f388461j != null) {
            C143207dx dxVar = bbVar.f388463l;
            if (dxVar == null) {
                bbVar.mo118308h(drawingSpec.f387987a, drawingSpec.f387988b, drawingSpec.f387989c, drawingSpec.f387990d);
            } else {
                dxVar.mo118229c(drawingSpec.f387990d);
            }
            bbVar.mo118321q(drawingSpec);
            bbVar.mo118031b(bbVar.f388472u);
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(27, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                C143181dh.m232308a(Looper.getMainLooper(), bbVar.f388456e);
            }
        } else if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s Null activity while reattaching", bbVar.f388473v);
        }
    }
}
