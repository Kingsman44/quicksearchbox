package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.libraries.assistant.p1594s.p1597b.C19150ak;
import com.google.android.libraries.assistant.p1594s.p1597b.C19151al;
import com.google.android.libraries.assistant.p1594s.p1597b.C19152am;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.t */
/* compiled from: PG */
public final class C112194t {

    /* renamed from: a */
    public static final C59071e f311492a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.t");

    /* renamed from: a */
    public static C19153an m186075a(C58495hd hdVar) {
        C19150ak akVar = (C19150ak) C19153an.f53644b.createBuilder();
        C58800sl lA = hdVar.keySet().iterator();
        while (lA.hasNext()) {
            Integer num = (Integer) lA.next();
            C19151al alVar = (C19151al) C19152am.f53639d.createBuilder();
            C48670ae c = C113371dl.m187573c(num.intValue());
            alVar.copyOnWrite();
            C19152am amVar = (C19152am) alVar.instance;
            amVar.f53642b = c.f125872ao;
            amVar.f53641a |= 1;
            Integer num2 = (Integer) hdVar.get(num);
            num2.getClass();
            int intValue = num2.intValue();
            alVar.copyOnWrite();
            C19152am amVar2 = (C19152am) alVar.instance;
            amVar2.f53641a |= 2;
            amVar2.f53643c = intValue;
            akVar.mo24299a(alVar);
        }
        return (C19153an) akVar.build();
    }

    /* renamed from: b */
    public static C58485gu m186076b(List list) {
        try {
            return (C58485gu) Collection.EL.stream(list).filter(C112192r.f311490a).map(C112193s.f311491a).collect(C58370cn.f155946a);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f311492a.mo56225c()).mo56382g(e)).mo56372aa(27639)).mo56386p("Caught error while parsing mix adjusters");
            return C58485gu.m89845m();
        }
    }

    /* renamed from: c */
    public static C58495hd m186077c(C58495hd hdVar) {
        try {
            C58490gz gzVar = new C58490gz(4);
            Map.EL.forEach(hdVar, new C112190p(gzVar));
            return gzVar.mo55427f(false);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f311492a.mo56225c()).mo56382g(e)).mo56372aa(27640)).mo56386p("Caught error while parsing source maxes");
            return C58729pv.f156485a;
        }
    }
}
