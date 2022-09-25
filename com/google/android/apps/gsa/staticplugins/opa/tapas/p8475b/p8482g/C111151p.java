package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79996cq;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79997cr;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.p */
/* compiled from: PG */
public final /* synthetic */ class C111151p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79996cq f309426a;

    public /* synthetic */ C111151p(C79996cq cqVar) {
        this.f309426a = cqVar;
    }

    public final void accept(Object obj) {
        C79996cq cqVar = this.f309426a;
        C51560mf mfVar = (C51560mf) obj;
        C121537f fVar = C111136ae.f309392a;
        long j = mfVar.f134387d;
        cqVar.copyOnWrite();
        C79997cr crVar = (C79997cr) cqVar.instance;
        C79997cr crVar2 = C79997cr.f219461g;
        crVar.f219463a |= 1;
        crVar.f219464b = ((float) j) / 1000.0f;
        long j2 = mfVar.f134388e;
        cqVar.copyOnWrite();
        C79997cr crVar3 = (C79997cr) cqVar.instance;
        crVar3.f219463a |= 2;
        crVar3.f219465c = ((float) j2) / 1000.0f;
        int size = mfVar.f134389f.size();
        cqVar.copyOnWrite();
        C79997cr crVar4 = (C79997cr) cqVar.instance;
        crVar4.f219463a |= 4;
        crVar4.f219466d = (float) size;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
