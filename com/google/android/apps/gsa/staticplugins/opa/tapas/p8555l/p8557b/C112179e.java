package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.e */
/* compiled from: PG */
public final /* synthetic */ class C112179e implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112180f f311453a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311454b;

    public /* synthetic */ C112179e(C112180f fVar, C113405ep epVar) {
        this.f311453a = fVar;
        this.f311454b = epVar;
    }

    public final Object get() {
        C112180f fVar = this.f311453a;
        C113405ep epVar = this.f311454b;
        C19141ab abVar = epVar.mo100022f().f53685m;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        boolean z = abVar.f53617b;
        C19141ab abVar2 = epVar.mo100022f().f53685m;
        if (abVar2 == null) {
            abVar2 = C19141ab.f53614i;
        }
        C62963cj<C48667ab> cjVar = new C62963cj(abVar2.f53620e, C19141ab.f53613f);
        if (fVar.f311458d.isEmpty()) {
            fVar.f311458d = Optional.m71637of(fVar.mo99463c());
        }
        C58480gp e = C58485gu.m89837e();
        if (z) {
            e.mo55395g((C112145l) fVar.f311457c.mo27525b());
        }
        boolean z2 = false;
        for (C48667ab abVar3 : cjVar) {
            C68214a aVar = (C68214a) ((C58495hd) fVar.f311458d.get()).get(abVar3);
            if (aVar == null) {
                C112180f.f311456b.mo105240i("invalid_adjuster_".concat(String.valueOf(abVar3.name())));
                ((C59052c) ((C59052c) C112180f.f311455a.mo56225c()).mo56372aa(27636)).mo56387q("Could not find specified adjuster '%s'", abVar3.f125795r);
            } else {
                if (abVar3 == C48667ab.REFLECTION_SUGGESTION_ADJUSTER || abVar3 == C48667ab.REFLECTION_SUGGESTIONS_ADJUSTER) {
                    if (z2) {
                        C112180f.f311456b.mo105240i("duplicate_reflection_adjuster");
                        ((C59052c) ((C59052c) C112180f.f311455a.mo56225c()).mo56372aa(27635)).mo56386p("Already added Reflection Adjuster");
                    } else {
                        z2 = true;
                    }
                }
                e.mo55395g((C112145l) aVar.mo27525b());
            }
        }
        return e.mo55394f();
    }
}
