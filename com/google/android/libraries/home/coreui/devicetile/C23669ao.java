package com.google.android.libraries.home.coreui.devicetile;

import android.app.Dialog;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ao */
/* compiled from: PG */
final class C23669ao implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C23674at f64732a;

    public C23669ao(C23674at atVar) {
        this.f64732a = atVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C23699br brVar = (C23699br) obj;
        C69664n.m101061g(brVar, "it");
        this.f64732a.f64745I = brVar.mo29041c();
        Dialog dialog = this.f64732a.f64745I;
        if (dialog != null) {
            dialog.show();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
