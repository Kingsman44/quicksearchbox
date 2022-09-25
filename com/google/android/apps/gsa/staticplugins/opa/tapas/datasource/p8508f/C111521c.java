package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8508f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54227ap;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.f.c */
/* compiled from: PG */
public final class C111521c extends C113409et {

    /* renamed from: a */
    public Optional f310195a = Optional.empty();

    /* renamed from: b */
    public Optional f310196b = Optional.empty();

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.CORRECTION;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        if (this.f310195a.isEmpty()) {
            return C60856cj.m92899h(new IllegalStateException("Try to return corrections when they are not available."));
        }
        if (!((C111520b) this.f310195a.get()).mo99164d().equals(epVar.mo100033p())) {
            return C60856cj.m92899h(new IllegalStateException("Request prefix: " + epVar.mo100033p() + " does not match pre-fetched prefix: " + ((C111520b) this.f310195a.get()).mo99164d()));
        }
        C58485gu a = ((C111520b) this.f310195a.get()).mo99161a();
        C58485gu b = ((C111520b) this.f310195a.get()).mo99162b();
        C58485gu c = ((C111520b) this.f310195a.get()).mo99163c();
        C58480gp e = C58485gu.m89837e();
        int min = Math.min(a.size(), 5);
        int i = 0;
        while (i < min) {
            String str = (String) a.get(i);
            String t = C89235z.m145148t(str);
            C54227ap apVar = (C54227ap) C54228aq.f142328w.createBuilder();
            apVar.copyOnWrite();
            C54228aq aqVar = (C54228aq) apVar.instance;
            str.getClass();
            aqVar.f142330a |= 1;
            aqVar.f142331b = str;
            C113414ey R = C113415ez.m187750R();
            R.mo100164i(t);
            C113386e eVar = (C113386e) R;
            eVar.f313959g = Optional.m71637of((String) C58557jl.m90129j(b, i, BuildConfig.FLAVOR));
            eVar.f313960h = Optional.m71637of((alf) C58557jl.m90129j(c, i, alf.f135314d));
            R.mo100175t(C48672ag.CORRECTION);
            R.mo100180y(20004);
            R.mo100177v(C48580an.CORRECTION);
            R.mo100167l(20003);
            C112142i iVar = C112142i.DISPLAY_TEXT;
            C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
            hVar.mo99420b(t, 1.0f);
            eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
            eVar.f313955c = Optional.m71637of((C54228aq) apVar.build());
            Optional optional = this.f310196b;
            if (optional != null) {
                eVar.f313971s = optional;
                e.mo55395g(R.mo100156a());
                i++;
            } else {
                throw new NullPointerException("Null correctionParams");
            }
        }
        C58485gu f = e.mo55394f();
        C113407er p = C113408es.m187705p();
        p.mo100095e(epVar);
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(f)));
        return C60856cj.m92900i(p.mo100091a());
    }
}
