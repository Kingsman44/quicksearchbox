package com.google.android.gms.car.p10760f;

import com.google.android.gms.car.C143145ca;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* renamed from: com.google.android.gms.car.f.c */
/* compiled from: PG */
final class C143288c extends C143299n {

    /* renamed from: a */
    final /* synthetic */ CarCall f388504a;

    /* renamed from: b */
    final /* synthetic */ List f388505b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143288c(CarCall carCall, List list) {
        super("onConferenceableCallsChanged");
        this.f388504a = carCall;
        this.f388505b = list;
    }

    /* renamed from: a */
    public final void mo118274a(C143145ca caVar) {
        caVar.mo21850h(this.f388504a, this.f388505b);
    }
}
