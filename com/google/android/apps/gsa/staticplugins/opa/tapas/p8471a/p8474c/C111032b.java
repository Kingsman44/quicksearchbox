package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.p8474c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111057g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48624bm;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48626bo;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c.b */
/* compiled from: PG */
public final class C111032b implements C111057g {

    /* renamed from: a */
    private final C112471ap f309228a;

    /* renamed from: b */
    private final Function f309229b;

    public C111032b(C112471ap apVar, Function function) {
        this.f309228a = apVar;
        this.f309229b = function;
    }

    /* renamed from: a */
    public final boolean mo99032a(C48582b bVar) {
        C48624bm bmVar;
        Optional m = this.f309228a.mo99542m();
        if (m.isEmpty() || (bmVar = (C48624bm) this.f309229b.apply((C48626bo) m.get())) == C48624bm.UNKNOWN) {
            return true;
        }
        C48582b bVar2 = C48582b.UNKNOWN_ACTION;
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                if (bmVar == C48624bm.STARTED || bmVar == C48624bm.STARTED_OR_PAUSED) {
                    return true;
                }
                return false;
            } else if (ordinal != 4 || bmVar == C48624bm.PAUSED || bmVar == C48624bm.STARTED_OR_PAUSED) {
                return true;
            } else {
                return false;
            }
        } else if (bmVar == C48624bm.STOPPED) {
            return true;
        } else {
            return false;
        }
    }
}
