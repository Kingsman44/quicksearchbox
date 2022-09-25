package com.google.android.gms.car.p10760f;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: com.google.android.gms.car.f.aq */
/* compiled from: PG */
public final /* synthetic */ class C143253aq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388399a;

    /* renamed from: b */
    public final /* synthetic */ int f388400b;

    /* renamed from: c */
    public final /* synthetic */ DrawingSpec f388401c;

    /* renamed from: d */
    public final /* synthetic */ Intent f388402d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f388403e;

    public /* synthetic */ C143253aq(C143268bb bbVar, int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) {
        this.f388399a = bbVar;
        this.f388400b = i;
        this.f388401c = drawingSpec;
        this.f388402d = intent;
        this.f388403e = bundle;
    }

    public final void run() {
        C143268bb bbVar = this.f388399a;
        int i = this.f388400b;
        DrawingSpec drawingSpec = this.f388401c;
        Intent intent = this.f388402d;
        Bundle bundle = this.f388403e;
        CarRegionId a = CarRegionId.m232311a(new CarDisplayId(i));
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.mo118314n(a, drawingSpec, intent, (Configuration) null, bundle);
    }
}
