package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8506d;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.d.c */
/* compiled from: PG */
public final /* synthetic */ class C111471c implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53593bz bzVar = (C53593bz) obj;
        String c = C58890d.m90988c(bzVar.f140661b);
        C113414ey R = C113415ez.m187750R();
        R.mo100175t(C48672ag.CHALKBOARD);
        R.mo100167l(10001);
        R.mo100180y(35);
        R.mo100177v(C48580an.PERSONALIZED_QUERY);
        C113386e eVar = (C113386e) R;
        eVar.f313967o = Optional.m71637of(C113300by.QUERY_TEXT);
        R.mo100164i(c);
        eVar.f313966n = Optional.m71637of(C54813af.CHALKBOARD);
        C112142i iVar = C112142i.DISPLAY_TEXT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(C58890d.m90988c(c), 1.0f);
        eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
        eVar.f313968p = C58485gu.m89844l(new C113341cl[]{(C113341cl) C111583h.m185342b(bzVar.f140662c).orElse(C113341cl.m187503d(new C113255ah(R.drawable.quantum_ic_search_grey600_24)))});
        return R.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
