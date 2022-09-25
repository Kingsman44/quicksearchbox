package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111057g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48625bn;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48626bo;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.c */
/* compiled from: PG */
public final class C111033c implements C111057g {

    /* renamed from: a */
    private final C112471ap f309230a;

    /* renamed from: b */
    private final Function f309231b;

    public C111033c(C112471ap apVar, Function function) {
        this.f309230a = apVar;
        this.f309231b = function;
    }

    /* renamed from: a */
    public final boolean mo99032a(C48582b bVar) {
        C48625bn bnVar;
        Optional m = this.f309230a.mo99542m();
        if (m.isEmpty() || (bnVar = (C48625bn) this.f309231b.apply((C48626bo) m.get())) == C48625bn.UNDEFINED) {
            return true;
        }
        C48582b bVar2 = C48582b.UNKNOWN_ACTION;
        int ordinal = bVar.ordinal();
        if ((ordinal == 6 || ordinal == 7) && bnVar != C48625bn.RESERVED) {
            return false;
        }
        return true;
    }
}
