package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.base.C58835az;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fn */
/* compiled from: PG */
public final /* synthetic */ class C112441fn implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ C113295bt f311948a;

    public /* synthetic */ C112441fn(C113295bt btVar) {
        this.f311948a = btVar;
    }

    public final Object apply(int i) {
        C113415ez ezVar = (C113415ez) this.f311948a.f313760a.get(i);
        if (ezVar.mo100201a() < C59203do.f157270a || ezVar.mo100201a() > 1.0d) {
            C59104x c = C112451fx.f311966a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TapasLowScore");
            ((C59052c) ((C59052c) c).mo56372aa(27615)).mo56389s("Unexpected suppressed suggestion score %f", Double.valueOf(ezVar.mo100201a()));
        }
        return new C58835az(ezVar, Integer.valueOf(i));
    }
}
