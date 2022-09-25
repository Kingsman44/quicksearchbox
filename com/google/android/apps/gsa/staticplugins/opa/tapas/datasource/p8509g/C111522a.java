package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8509g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.g.a */
/* compiled from: PG */
public final /* synthetic */ class C111522a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C111522a f310197a = new C111522a();

    private /* synthetic */ C111522a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i = C111523b.f310198a;
        C58480gp e = C58485gu.m89837e();
        C58485gu o = ((C113408es) obj).mo100053o();
        int size = o.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C113415ez ezVar = (C113415ez) o.get(i3);
            if (ezVar.mo100206f() == 89 && ezVar.mo100205e() == 269) {
                C113414ey h = ezVar.mo100208h();
                h.mo100167l(10020);
                h.mo100180y(10020);
                h.mo100177v(C48580an.GEO);
                e.mo55395g(h.mo100156a());
                i2++;
                if (i2 >= 3) {
                    break;
                }
            }
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e.mo55394f())));
        return p.mo100091a();
    }
}
