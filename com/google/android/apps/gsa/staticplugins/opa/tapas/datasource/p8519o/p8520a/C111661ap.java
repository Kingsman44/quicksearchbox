package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ap */
/* compiled from: PG */
public final class C111661ap implements C111674k {
    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        String str2 = alVar.f125508b;
        C113414ey R = C113415ez.m187750R();
        R.mo100167l(10001);
        R.mo100180y(20041);
        R.mo100177v(C48580an.PERSONAL_URL);
        C113386e eVar = (C113386e) R;
        eVar.f313967o = Optional.m71637of(C113300by.QUERY_TEXT);
        R.mo100175t(C48672ag.TAPAS_SERVER);
        R.mo100164i(str2);
        eVar.f313956d = Optional.m71637of(alVar);
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        C112142i iVar = C112142i.DISPLAY_TEXT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(C58890d.m90988c(str2), 1.0f);
        eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
        eVar.f313968p = C58485gu.m89844l(new C113341cl[]{C113341cl.m187503d(new C113255ah(R.drawable.quantum_ic_public_grey600_24))});
        return C60856cj.m92900i(C58485gu.m89846n(R.mo100156a()));
    }
}
