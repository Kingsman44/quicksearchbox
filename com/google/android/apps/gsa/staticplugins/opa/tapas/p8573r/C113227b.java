package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r;

import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8574a.C113226e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48675aj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48676ak;
import com.google.assistant.p3781ad.p3789d.p3791b.C48677al;
import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.assistant.p3781ad.p3789d.p3791b.C48722d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.b */
/* compiled from: PG */
public final /* synthetic */ class C113227b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C113236d f313562a;

    public /* synthetic */ C113227b(C113236d dVar) {
        this.f313562a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C48678am amVar;
        C113236d dVar = this.f313562a;
        C58976aa aaVar = C58975e.f156826a;
        C113291bp bpVar = (C113291bp) ((C113408es) obj).mo100120c().get(C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY);
        if (bpVar == null) {
            amVar = C48678am.f125937b;
        } else {
            C48677al alVar = (C48677al) C48678am.f125937b.createBuilder();
            for (C113415ez ezVar : bpVar.f313754b) {
                C48675aj ajVar = (C48675aj) C48676ak.f125924l.createBuilder();
                ajVar.copyOnWrite();
                C48676ak akVar = (C48676ak) ajVar.instance;
                akVar.f125926a |= 1;
                akVar.f125927b = 2;
                String L = ezVar.mo100199L();
                ajVar.copyOnWrite();
                C48676ak akVar2 = (C48676ak) ajVar.instance;
                L.getClass();
                akVar2.f125926a |= 4;
                akVar2.f125929d = L;
                int d = ezVar.mo100204d();
                ajVar.copyOnWrite();
                C48676ak akVar3 = (C48676ak) ajVar.instance;
                akVar3.f125926a |= 8;
                akVar3.f125930e = d;
                int f = ezVar.mo100206f();
                ajVar.copyOnWrite();
                C48676ak akVar4 = (C48676ak) ajVar.instance;
                akVar4.f125926a |= 16;
                akVar4.f125931f = f;
                int e = ezVar.mo100205e();
                ajVar.copyOnWrite();
                C48676ak akVar5 = (C48676ak) ajVar.instance;
                akVar5.f125926a |= 32;
                akVar5.f125932g = e;
                C48672ag k = ezVar.mo100211k();
                ajVar.copyOnWrite();
                C48676ak akVar6 = (C48676ak) ajVar.instance;
                akVar6.f125933h = k.f125915O;
                akVar6.f125926a |= 64;
                C48580an j = ezVar.mo100210j();
                ajVar.copyOnWrite();
                C48676ak akVar7 = (C48676ak) ajVar.instance;
                akVar7.f125934i = j.getNumber();
                akVar7.f125926a |= 128;
                double d2 = ((C48676ak) ajVar.instance).f125935j;
                ajVar.copyOnWrite();
                C48676ak akVar8 = (C48676ak) ajVar.instance;
                akVar8.f125926a |= 256;
                akVar8.f125935j = d2;
                if (ezVar.mo100218r().isPresent()) {
                    ajVar.copyOnWrite();
                    C48676ak akVar9 = (C48676ak) ajVar.instance;
                    akVar9.f125928c = 1;
                    akVar9.f125926a = 2 | akVar9.f125926a;
                    C48722d dVar2 = (C48722d) C113226e.f313561a.mo56070hd((C113502n) ezVar.mo100218r().get());
                    ajVar.copyOnWrite();
                    C48676ak akVar10 = (C48676ak) ajVar.instance;
                    dVar2.getClass();
                    akVar10.f125936k = dVar2;
                    akVar10.f125926a |= 512;
                }
                C48676ak akVar11 = (C48676ak) ajVar.build();
                alVar.copyOnWrite();
                C48678am amVar2 = (C48678am) alVar.instance;
                akVar11.getClass();
                C62971cq cqVar = amVar2.f125939a;
                if (!cqVar.mo58948c()) {
                    amVar2.f125939a = C62942bv.mutableCopy(cqVar);
                }
                amVar2.f125939a.add(akVar11);
            }
            amVar = (C48678am) alVar.build();
        }
        if (amVar.equals(C48678am.f125937b)) {
            C113236d.f313570a.mo105240i("tcw_empty_response");
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        C113236d.f313570a.mo105240i("tcw_success_response");
        return dVar.f313572b.mo99917a(amVar);
    }
}
