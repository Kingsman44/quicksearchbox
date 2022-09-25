package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.q */
/* compiled from: PG */
public final /* synthetic */ class C113638q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113611x f314691a;

    public /* synthetic */ C113638q(C113611x xVar) {
        this.f314691a = xVar;
    }

    public final void accept(Object obj) {
        C113611x xVar = this.f314691a;
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        xVar.f314553b.mo19706J((String) obj, BuildConfig.FLAVOR, xVar.f314552a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
