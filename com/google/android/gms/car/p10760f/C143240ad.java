package com.google.android.gms.car.p10760f;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: com.google.android.gms.car.f.ad */
/* compiled from: PG */
public final /* synthetic */ class C143240ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388365a;

    /* renamed from: b */
    public final /* synthetic */ int f388366b;

    /* renamed from: c */
    public final /* synthetic */ DrawingSpec f388367c;

    /* renamed from: d */
    public final /* synthetic */ Intent f388368d;

    /* renamed from: e */
    public final /* synthetic */ Configuration f388369e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f388370f;

    public /* synthetic */ C143240ad(C143268bb bbVar, int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        this.f388365a = bbVar;
        this.f388366b = i;
        this.f388367c = drawingSpec;
        this.f388368d = intent;
        this.f388369e = configuration;
        this.f388370f = bundle;
    }

    public final void run() {
        C143268bb bbVar = this.f388365a;
        int i = this.f388366b;
        DrawingSpec drawingSpec = this.f388367c;
        Intent intent = this.f388368d;
        Configuration configuration = this.f388369e;
        Bundle bundle = this.f388370f;
        CarRegionId a = CarRegionId.m232311a(new CarDisplayId(i));
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.mo118314n(a, drawingSpec, intent, configuration, bundle);
    }
}
