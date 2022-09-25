package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p386ak.C8393i;
import com.google.research.p5181a.p5187e.C66361k;
import com.google.research.p5181a.p5187e.C66364n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bi */
/* compiled from: PG */
public final class C112341bi extends C66364n {

    /* renamed from: a */
    public static final C121537f f311728a = C121537f.m200840b("Tapas/Ranker/ReflectionEnsemble", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f311729b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bi");

    /* renamed from: c */
    public static final C8393i f311730c = new C8393i();

    /* renamed from: d */
    public static final C58528ij f311731d = C58528ij.m90011K(C48668ac.FULFILLMENT_PREDICTOR, C48668ac.LOGISTIC_PREDICTOR);

    /* renamed from: e */
    public final C22871g f311732e;

    public C112341bi(C22871g gVar) {
        this.f311732e = gVar;
    }

    /* renamed from: a */
    public static C48668ac m186203a(C66361k kVar) {
        if (kVar instanceof C112372f) {
            return ((C112372f) kVar).f311801b;
        }
        if (kVar instanceof C112359c) {
            return C48668ac.LOGISTIC_PREDICTOR;
        }
        return C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR;
    }

    /* renamed from: b */
    public static Optional m186204b(C113415ez ezVar, C48668ac acVar) {
        C48668ac acVar2 = C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR;
        int ordinal = acVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return Optional.m71637of(ezVar.mo100058Q());
        }
        if (ordinal == 3) {
            int f = ezVar.mo100206f();
            return Optional.m71637of("TYPE " + f);
        } else if (ordinal == 4) {
            int i = ezVar.mo100211k().f125915O;
            return Optional.m71637of("SOURCE " + i);
        } else if (ordinal != 5) {
            C59104x c = f311729b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReflectEnsemble");
            ((C59052c) ((C59052c) c).mo56372aa(27709)).mo56389s("Unexpected predictor: %s", acVar.name());
            return Optional.empty();
        } else {
            int d = ezVar.mo100204d();
            return Optional.m71637of("GROUP " + d);
        }
    }
}
