package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.C112719m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C112988o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C113114q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C113220r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.TapasJni;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112136c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fl */
/* compiled from: PG */
public final class C112439fl extends C112136c {

    /* renamed from: a */
    private final TapasJni f311947a;

    public C112439fl(TapasJni tapasJni) {
        this.f311947a = tapasJni;
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.HOME_AUTOMATION_ADJUSTER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo99415b(C113405ep epVar, C48670ae aeVar, ArrayList arrayList) {
        Optional optional;
        if (this.f311947a.mo99233d() || aeVar != C48670ae.SUGGESTION_GROUP_HOME_AUTOMATION) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C113415ez ezVar = (C113415ez) arrayList.get(i2);
            if (ezVar.mo100193F().isPresent()) {
                C113220r rVar = (C113220r) ezVar.mo100193F().get();
                int i3 = rVar.f313556a;
                if (i3 == 2) {
                    C112988o oVar = ((C113114q) rVar.f313557b).f313399a;
                    if (oVar == null) {
                        oVar = C112988o.f313113c;
                    }
                    optional = Optional.m71637of(oVar);
                } else if (i3 == 3) {
                    C112988o oVar2 = ((C112719m) rVar.f313557b).f312465a;
                    if (oVar2 == null) {
                        oVar2 = C112988o.f313113c;
                    }
                    optional = Optional.m71637of(oVar2);
                } else {
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    C113414ey h = ezVar.mo100208h();
                    h.mo100163h(((C112988o) optional.get()).f313116b);
                    arrayList.set(i2, h.mo100156a());
                    i++;
                }
            }
        }
        return i;
    }
}
