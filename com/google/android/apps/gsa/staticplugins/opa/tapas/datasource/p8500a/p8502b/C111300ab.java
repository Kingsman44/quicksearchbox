package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110972aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111071u;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C111300ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309721a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309722b;

    /* renamed from: c */
    public final /* synthetic */ String f309723c;

    /* renamed from: d */
    public final /* synthetic */ C49301bt f309724d;

    /* renamed from: e */
    public final /* synthetic */ C58495hd f309725e;

    /* renamed from: f */
    public final /* synthetic */ Map f309726f;

    public /* synthetic */ C111300ab(C111305ag agVar, C49728r rVar, String str, C49301bt btVar, C58495hd hdVar, Map map) {
        this.f309721a = agVar;
        this.f309722b = rVar;
        this.f309723c = str;
        this.f309724d = btVar;
        this.f309725e = hdVar;
        this.f309726f = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111305ag agVar = this.f309721a;
        C49728r rVar = this.f309722b;
        String str = this.f309723c;
        C49301bt btVar = this.f309724d;
        C58495hd hdVar = this.f309725e;
        Map map = this.f309726f;
        C54759g gVar = (C54759g) obj;
        C110972aj ajVar = agVar.f309734d;
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        C60870cx f = ajVar.mo99000f(uVar.f143706a, C58729pv.f156485a);
        C111071u uVar2 = agVar.f309736f;
        C110972aj ajVar2 = agVar.f309734d;
        C54773u uVar3 = gVar.f143681a;
        if (uVar3 == null) {
            uVar3 = C54773u.f143704c;
        }
        C48582b a = ajVar2.mo98996a(uVar3.f143706a);
        C54758f fVar = gVar.f143682b;
        if (fVar == null) {
            fVar = C54758f.f143676b;
        }
        C60870cx c = uVar2.mo99042c(btVar, a, fVar, hdVar, gVar);
        return C60856cj.m92895d(f, c).mo57334a(new C111309e(agVar, f, hdVar, c, rVar, str, btVar, map), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
