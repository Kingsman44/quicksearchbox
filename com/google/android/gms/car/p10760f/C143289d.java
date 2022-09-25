package com.google.android.gms.car.p10760f;

import android.os.Bundle;
import com.google.android.gms.car.C143145ca;
import com.google.android.gms.car.CarCall;

/* renamed from: com.google.android.gms.car.f.d */
/* compiled from: PG */
final class C143289d extends C143299n {

    /* renamed from: a */
    final /* synthetic */ CarCall f388506a;

    /* renamed from: b */
    final /* synthetic */ String f388507b;

    /* renamed from: c */
    final /* synthetic */ Bundle f388508c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143289d(CarCall carCall, String str, Bundle bundle) {
        super("onConnectionEvent");
        this.f388506a = carCall;
        this.f388507b = str;
        this.f388508c = bundle;
    }

    /* renamed from: a */
    public final void mo118274a(C143145ca caVar) {
        caVar.mo21851i(this.f388506a, this.f388507b, this.f388508c);
    }
}
