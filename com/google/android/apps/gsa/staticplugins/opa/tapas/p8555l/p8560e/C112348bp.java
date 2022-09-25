package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bp */
/* compiled from: PG */
public final /* synthetic */ class C112348bp implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311744a;

    public /* synthetic */ C112348bp(C112360ca caVar) {
        this.f311744a = caVar;
    }

    public final void accept(Object obj, Object obj2) {
        C112360ca caVar = this.f311744a;
        C48668ac acVar = (C48668ac) obj;
        C59104x b = C112360ca.f311767d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
        ((C59052c) ((C59052c) b).mo56372aa(27723)).mo56389s("\tPredictor %s", acVar);
        caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, String.format("\tPredictor %s", new Object[]{acVar.name()}));
        Map.EL.forEach((C58495hd) obj2, new C112350br(caVar));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
