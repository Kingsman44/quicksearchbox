package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112136c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Random;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ip */
/* compiled from: PG */
public final class C112643ip extends C112136c {

    /* renamed from: a */
    public static final /* synthetic */ int f312252a = 0;

    /* renamed from: d */
    private final Random f312253d;

    public C112643ip(Random random) {
        this.f312253d = random;
    }

    /* renamed from: c */
    private static ArrayList m186423c(Stream stream) {
        return (ArrayList) stream.map(C112638ik.f312247a).collect(Collectors.toCollection(C112639il.f312248a));
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.ZERO_STATE_ADJUSTER;
    }

    /* renamed from: b */
    public final int mo99415b(C113405ep epVar, C48670ae aeVar, ArrayList arrayList) {
        ArrayList arrayList2;
        boolean z;
        if (!epVar.mo100033p().isEmpty() || aeVar != C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY) {
            return 0;
        }
        if (Collection.EL.stream(arrayList).anyMatch(C112642io.f312251a)) {
            arrayList2 = m186423c(Collection.EL.stream(arrayList).filter(C112640im.f312249a));
            z = true;
        } else {
            arrayList2 = m186423c(Collection.EL.stream(arrayList));
            z = false;
        }
        int size = arrayList2.size();
        double d = C59203do.f157270a;
        for (int i = 0; i < size; i++) {
            C113414ey eyVar = (C113414ey) arrayList2.get(i);
            C113415ez a = eyVar.mo100156a();
            if (a.mo100211k().equals(C48672ag.CHALKBOARD)) {
                double a2 = a.mo100201a() + this.f312253d.nextDouble();
                eyVar.mo100163h(a2);
                d = Math.max(d, a2);
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        int size2 = arrayList2.size();
        double d2 = d;
        for (int i2 = 0; i2 < size2; i2++) {
            C113414ey eyVar2 = (C113414ey) arrayList2.get(i2);
            C113415ez a3 = eyVar2.mo100156a();
            if (!a3.mo100211k().equals(C48672ag.CHALKBOARD)) {
                double a4 = a3.mo100201a() + d + 0.01d;
                eyVar2.mo100163h(a4);
                d2 = Math.max(d2, a4);
            }
        }
        arrayList.clear();
        arrayList.addAll((java.util.Collection) Collection.EL.stream(arrayList2).map(new C112641in(d2)).collect(C58370cn.f155946a));
        return arrayList.size();
    }
}
