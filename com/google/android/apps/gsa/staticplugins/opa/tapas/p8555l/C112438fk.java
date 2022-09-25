package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112136c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fk */
/* compiled from: PG */
public final class C112438fk extends C112136c {

    /* renamed from: a */
    public static final /* synthetic */ int f311946a = 0;

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.ENTITY_TYPE_ADJUSTER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo99415b(C113405ep epVar, C48670ae aeVar, ArrayList arrayList) {
        int i = 0;
        if (aeVar == C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY && Collection.EL.stream(arrayList).anyMatch(C112437fj.f311945a)) {
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                C113415ez ezVar = (C113415ez) arrayList.get(i2);
                if (ezVar.mo100206f() == 10080) {
                    C113414ey h = ezVar.mo100208h();
                    h.mo100180y(35);
                    h.mo100177v(C48580an.PERSONALIZED_QUERY);
                    h.mo100172q(C113300by.QUERY_TEXT);
                    arrayList.set(i2, h.mo100156a());
                    i++;
                }
            }
        }
        return i;
    }
}
