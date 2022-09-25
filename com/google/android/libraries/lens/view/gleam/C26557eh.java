package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2069am.C25303ak;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.gleam.eh */
/* compiled from: PG */
public final /* synthetic */ class C26557eh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ boolean f72379a;

    public /* synthetic */ C26557eh(boolean z) {
        this.f72379a = z;
    }

    public final void accept(Object obj) {
        boolean z = this.f72379a;
        C26491bw bwVar = (C26491bw) obj;
        int i = C26559ej.f72381K;
        bwVar.f72170w = z;
        bwVar.mo31749L();
        bwVar.mo31746I();
        if (bwVar.mo31750M()) {
            bwVar.mo31744G();
            return;
        }
        bwVar.mo31745H();
        C25308ap apVar = bwVar.f71963a;
        if (apVar.f68843d == 12) {
            C25303ak akVar = (C25303ak) apVar.f68844e;
        } else {
            C25303ak akVar2 = C25303ak.f68821f;
        }
        bwVar.mo31747J();
        bwVar.mo31748K();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
