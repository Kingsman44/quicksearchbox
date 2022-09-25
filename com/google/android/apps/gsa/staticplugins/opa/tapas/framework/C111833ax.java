package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ax */
/* compiled from: PG */
public final /* synthetic */ class C111833ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f310798a;

    public /* synthetic */ C111833ax(Map map) {
        this.f310798a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f310798a;
        C113291bp bpVar = (C113291bp) obj;
        C121537f fVar = C111877bo.f310873a;
        map.put(C48670ae.SUGGESTION_GROUP_HOME_AUTOMATION, new C113295bt(bpVar.f313753a, new ArrayList(bpVar.f313754b)));
        C58976aa aaVar = C58975e.f156826a;
        Class<C111877bo> cls = C111877bo.class;
        bpVar.f313754b.size();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
