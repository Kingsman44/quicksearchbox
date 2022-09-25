package com.google.android.libraries.lens.view.textoverlay;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56231al;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56234ao;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.i */
/* compiled from: PG */
public final /* synthetic */ class C28076i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C56231al f76410a;

    public /* synthetic */ C28076i(C56231al alVar) {
        this.f76410a = alVar;
    }

    public final void accept(Object obj) {
        C56231al alVar = this.f76410a;
        C56234ao aoVar = (C56234ao) obj;
        C58974d dVar = C28079l.f76413a;
        if (((C56235ap) aoVar.instance).f149783b.size() != 0) {
            alVar.mo54337a(aoVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
