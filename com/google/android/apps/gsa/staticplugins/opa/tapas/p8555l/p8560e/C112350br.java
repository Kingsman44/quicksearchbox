package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.br */
/* compiled from: PG */
public final /* synthetic */ class C112350br implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311751a;

    public /* synthetic */ C112350br(C112360ca caVar) {
        this.f311751a = caVar;
    }

    public final void accept(Object obj, Object obj2) {
        C112360ca caVar = this.f311751a;
        String str = (String) obj;
        Float f = (Float) obj2;
        C59104x b = C112360ca.f311767d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
        ((C59052c) ((C59052c) b).mo56372aa(27722)).mo56354G("\t\t%f: %s", f, str);
        caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, String.format("\t\t%f: %s", new Object[]{f, str}));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
