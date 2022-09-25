package com.google.android.gms.car.p10760f;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.C143117ba;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.car.f.bn */
/* compiled from: PG */
final class C143280bn extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143282bp f388482a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143280bn(C143282bp bpVar, Looper looper) {
        super(looper);
        this.f388482a = bpVar;
    }

    public final void handleMessage(Message message) {
        C143117ba baVar = this.f388482a.f388485b;
        if (baVar != null && message.what == 3) {
            baVar.mo21199a((byte[]) message.obj);
        }
    }
}
