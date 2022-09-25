package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112332b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112346bn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112347bo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112351bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112352bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112353bu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112354bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112355bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112356bx;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112357by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112358bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112360ca;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.p4553a.C59525cv;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.protobuf.C62995dn;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.d */
/* compiled from: PG */
public final /* synthetic */ class C112137d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112139f f311394a;

    public /* synthetic */ C112137d(C112139f fVar) {
        this.f311394a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112139f fVar = this.f311394a;
        C113415ez ezVar = (C113415ez) obj;
        C112360ca caVar = (C112360ca) fVar;
        C58495hd hdVar = (C58495hd) Collection.EL.stream(((C112312ag) caVar.f311768e.mo27525b()).f311684p).collect(C58370cn.m89403c(Function.CC.identity(), new C112351bs(ezVar), C112352bt.f311753a));
        C58495hd hdVar2 = (C58495hd) Collection.EL.stream(hdVar.entrySet()).filter(C112353bu.f311754a).collect(C58370cn.m89403c(C112354bv.f311755a, new C112355bw(caVar), C112356bx.f311757a));
        C112358bz bzVar = (C112358bz) Collection.EL.stream(hdVar.entrySet()).filter(C112357by.f311758a).collect(Collectors.reducing(new C112332b(C59203do.f157270a, 0), new C112346bn(caVar), C112347bo.f311743a));
        if (bzVar.mo99504b() == 0) {
            C59104x c = C112360ca.f311767d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
            ((C59052c) ((C59052c) c).mo56372aa(27718)).mo56386p("Expected at least one entry in the aggregate");
            caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, "Error: Expected at least one entry of score in the aggregate.");
            return ezVar;
        }
        double a = bzVar.mo99503a();
        double b = (double) bzVar.mo99504b();
        Double.isNaN(b);
        double exp = Math.exp(a / b);
        C58976aa aaVar = C58975e.f156826a;
        Double valueOf = Double.valueOf(exp);
        bzVar.mo99503a();
        bzVar.mo99504b();
        caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, String.format("%s, type: %s, Reflection score: %f", new Object[]{ezVar.mo100199L(), Integer.valueOf(ezVar.mo100206f()), valueOf}));
        double m = caVar.f311770g.mo79747m(C90063do.f249566fu);
        if (m < C59203do.f157270a || m > 1.0d) {
            C59104x d = C112360ca.f311767d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
            ((C59052c) ((C59052c) d).mo56372aa(27717)).mo56389s("Unexpected AgsaOpaTapas__reflection_score_fraction value: %f", Double.valueOf(m));
            int i = C90755l.f253831a;
        }
        C113415ez k = fVar.mo99423k(ezVar, (exp * m) + ((1.0d - m) * ezVar.mo100201a()));
        C113414ey h = k.mo100208h();
        C59525cv cvVar = (C59525cv) k.mo100214n().toBuilder();
        cvVar.copyOnWrite();
        C59527cx cxVar = (C59527cx) cvVar.instance;
        C62995dn dnVar = cxVar.f157960l;
        if (!dnVar.f170058b) {
            cxVar.f157960l = dnVar.mo58980a();
        }
        cxVar.f157960l.putAll(hdVar2);
        h.mo100160e((C59527cx) cvVar.build());
        return h.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
