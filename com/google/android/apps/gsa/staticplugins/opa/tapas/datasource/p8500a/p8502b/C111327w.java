package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110983au;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110984av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.w */
/* compiled from: PG */
public final /* synthetic */ class C111327w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309790a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309791b;

    /* renamed from: c */
    public final /* synthetic */ String f309792c;

    /* renamed from: d */
    public final /* synthetic */ C111649ad f309793d;

    /* renamed from: e */
    public final /* synthetic */ Map f309794e;

    public /* synthetic */ C111327w(C111305ag agVar, C49728r rVar, String str, C111649ad adVar, Map map) {
        this.f309790a = agVar;
        this.f309791b = rVar;
        this.f309792c = str;
        this.f309793d = adVar;
        this.f309794e = map;
    }

    public final Object call() {
        C111305ag agVar = this.f309790a;
        C49728r rVar = this.f309791b;
        String str = this.f309792c;
        C111649ad adVar = this.f309793d;
        Map map = this.f309794e;
        String str2 = adVar.f310418c;
        String str3 = rVar.f128342b;
        C111029bz bzVar = agVar.f309733c;
        C58480gp e = C58485gu.m89837e();
        C60870cx c = bzVar.f309215b.mo98998c(str);
        C60856cj.m92895d(c).mo57334a(new C110983au(e, c), C60826bg.f164896a);
        return agVar.f309732b.mo28209i(C60856cj.m92906o((List) Collection.EL.stream((C58485gu) Collection.EL.stream(bzVar.mo99019b(bzVar.f309214a.mo79746e(C90063do.f249339bf))).filter(new C110984av(e)).collect(C58370cn.f155946a)).filter(new C111322r(agVar)).map(new C111323s(agVar, rVar, str, str2, map)).collect(C58370cn.f155946a)), "flatten the suggestion list", C111324t.f309785a);
    }
}
