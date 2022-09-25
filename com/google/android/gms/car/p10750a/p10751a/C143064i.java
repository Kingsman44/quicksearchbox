package com.google.android.gms.car.p10750a.p10751a;

import android.content.Intent;
import com.google.android.gms.car.p10768k.p10770b.C143325b;

/* renamed from: com.google.android.gms.car.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C143064i implements C143325b {

    /* renamed from: a */
    public final /* synthetic */ C142995as f388146a;

    /* renamed from: b */
    public final /* synthetic */ Intent f388147b;

    public /* synthetic */ C143064i(C142995as asVar, Intent intent) {
        this.f388146a = asVar;
        this.f388147b = intent;
    }

    /* renamed from: a */
    public final void mo117950a() {
        C142995as asVar = this.f388146a;
        Intent intent = this.f388147b;
        if (!asVar.mo117937s().mo118070m(intent)) {
            throw new IllegalArgumentException("No matching component for intent: ".concat(intent.toString()));
        }
    }
}
