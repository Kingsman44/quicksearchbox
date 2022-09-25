package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112136c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.OptionalDouble;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gd */
/* compiled from: PG */
public final class C112575gd extends C112136c {

    /* renamed from: a */
    public static final /* synthetic */ int f312168a = 0;

    /* renamed from: c */
    public static boolean m186390c(C113415ez ezVar) {
        return C113148bf.m187162i((C48578al) ezVar.mo100195H().orElse(C48578al.f125505d));
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.PERSONAL_PUBLIC_QUERY_ADJUSTER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo99415b(C113405ep epVar, C48670ae aeVar, ArrayList arrayList) {
        if (aeVar != C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY) {
            return 0;
        }
        OptionalDouble max = Collection.EL.stream(arrayList).filter(C112572ga.f312165a).mapToDouble(C112573gb.f312166a).max();
        if (!max.isPresent()) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        double asDouble = max.getAsDouble();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C113415ez ezVar = (C113415ez) arrayList.get(i);
            C113414ey h = ezVar.mo100208h();
            if (m186390c(ezVar)) {
                double a = ezVar.mo100201a() + max.getAsDouble() + 0.01d;
                h.mo100163h(a);
                arrayList2.add(h);
                asDouble = Math.max(asDouble, a);
            } else {
                arrayList2.add(h);
            }
        }
        if (asDouble == C59203do.f157270a) {
            return 0;
        }
        arrayList.clear();
        arrayList.addAll((java.util.Collection) Collection.EL.stream(arrayList2).map(new C112574gc(asDouble)).collect(C58370cn.f155946a));
        return arrayList.size();
    }
}
