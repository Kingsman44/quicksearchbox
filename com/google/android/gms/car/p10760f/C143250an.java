package com.google.android.gms.car.p10760f;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: com.google.android.gms.car.f.an */
/* compiled from: PG */
public final /* synthetic */ class C143250an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388389a;

    /* renamed from: b */
    public final /* synthetic */ int f388390b;

    /* renamed from: c */
    public final /* synthetic */ int f388391c;

    /* renamed from: d */
    public final /* synthetic */ DrawingSpec f388392d;

    /* renamed from: e */
    public final /* synthetic */ Intent f388393e;

    /* renamed from: f */
    public final /* synthetic */ Configuration f388394f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f388395g;

    public /* synthetic */ C143250an(C143268bb bbVar, int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        this.f388389a = bbVar;
        this.f388390b = i;
        this.f388391c = i2;
        this.f388392d = drawingSpec;
        this.f388393e = intent;
        this.f388394f = configuration;
        this.f388395g = bundle;
    }

    public final void run() {
        C143268bb bbVar = this.f388389a;
        int i = this.f388390b;
        int i2 = this.f388391c;
        DrawingSpec drawingSpec = this.f388392d;
        Intent intent = this.f388393e;
        Configuration configuration = this.f388394f;
        Bundle bundle = this.f388395g;
        CarRegionId carRegionId = new CarRegionId(i, new CarDisplayId(i2));
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.mo118314n(carRegionId, drawingSpec, intent, configuration, bundle);
    }
}
