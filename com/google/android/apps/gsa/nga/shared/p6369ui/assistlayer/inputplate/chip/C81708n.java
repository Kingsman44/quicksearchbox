package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.libraries.logging.C28292j;
import com.google.assistant.p3745ab.C48305dd;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.n */
/* compiled from: PG */
public final /* synthetic */ class C81708n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C28292j f223455a;

    public /* synthetic */ C81708n(C28292j jVar) {
        this.f223455a = jVar;
    }

    public final void accept(Object obj) {
        C28292j jVar = this.f223455a;
        C80589w wVar = (C80589w) obj;
        C63204j jVar2 = wVar.f221228g;
        if (jVar2 != null) {
            jVar.mo33792f(jVar2);
        }
        if (wVar.f221229h != null) {
            C62940bt btVar = C48305dd.f124928e;
            C48305dd ddVar = wVar.f221229h;
            if (ddVar == null) {
                ddVar = C48305dd.f124927d;
            }
            jVar.f76974b.mo58885m(btVar, ddVar);
        }
        if (wVar.f221227f) {
            jVar.mo33794h(3);
        } else {
            jVar.mo33794h(1);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
