package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113281bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.C48761s;
import com.google.assistant.p3781ad.p3789d.C48762t;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ae */
/* compiled from: PG */
public final class C111650ae implements C111674k {

    /* renamed from: a */
    private static final C59071e f310419a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ae");

    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        Optional g = C113148bf.m187160g(alVar);
        if (g.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C48762t tVar = (C48762t) g.get();
        int a = C48761s.m85278a(tVar.f126166a);
        if (a != 0 && a == 2 && !tVar.f126167b.isEmpty() && !tVar.f126168c.isEmpty()) {
            C113414ey R = C113415ez.m187750R();
            R.mo100175t(C48672ag.TAPAS_SERVER);
            R.mo100167l(10001);
            R.mo100180y(10082);
            R.mo100177v(C48580an.INTERNET_CHANNEL);
            R.mo100164i(tVar.f126167b);
            C113386e eVar = (C113386e) R;
            eVar.f313956d = Optional.m71637of(alVar);
            Optional empty = Optional.empty();
            Optional.empty();
            String str2 = tVar.f126168c;
            if (str2 != null) {
                eVar.f313964l = Optional.m71637of(new C113281bf(str2, empty, Optional.m71637of(tVar.f126169d)));
                C112142i iVar = C112142i.DISPLAY_TEXT;
                C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
                hVar.mo99420b(C58890d.m90988c(alVar.f125508b), 1.0f);
                eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
                return C60856cj.m92900i(C58485gu.m89846n(R.mo100156a()));
            }
            throw new NullPointerException("Null deeplinkUrl");
        }
        C59104x d = f310419a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "InternetChannelCmplProc");
        ((C59052c) ((C59052c) d).mo56372aa(27341)).mo56386p("Not creating internet channel suggestion for completion - invalid QueryCompletionMetadata.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
