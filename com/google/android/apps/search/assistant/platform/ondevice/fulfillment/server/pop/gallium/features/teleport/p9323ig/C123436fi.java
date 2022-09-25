package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.fi */
/* compiled from: PG */
public final /* synthetic */ class C123436fi implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341211a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f341212b;

    /* renamed from: c */
    public final /* synthetic */ C123427f f341213c;

    /* renamed from: d */
    public final /* synthetic */ C64979f f341214d;

    public /* synthetic */ C123436fi(C123459ge geVar, C60870cx cxVar, C123427f fVar, C64979f fVar2) {
        this.f341211a = geVar;
        this.f341212b = cxVar;
        this.f341213c = fVar;
        this.f341214d = fVar2;
    }

    public final C60870cx apply(Object obj) {
        C123459ge geVar = this.f341211a;
        C60870cx cxVar = this.f341212b;
        C123427f fVar = this.f341213c;
        C64979f fVar2 = this.f341214d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return geVar.mo106014f(C123303ak.m202660a("com.android.vending"), (String) optional.get(), cxVar);
        }
        Optional findFirst = Collection.EL.stream(geVar.f341247a.mo106025e("com.google.android.apps.docs.editors.docs")).map(new C123440fm(fVar)).filter(C123453fz.f341237a).map(C123408eh.f341171a).filter(C123441fn.f341221a).map(C123442fo.f341222a).findFirst();
        if (!findFirst.isPresent()) {
            findFirst = Optional.empty();
        }
        if (findFirst.isPresent()) {
            return geVar.mo106014f(C123303ak.m202660a("com.google.android.apps.docs"), (String) findFirst.get(), cxVar);
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(fVar.mo105927h()).filter(C123415eo.f341185a).collect(C58370cn.f155946a);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C123416ep(geVar, fVar)).collect(C58370cn.f155946a);
        if (!guVar2.isEmpty()) {
            guVar = (C58485gu) Collection.EL.stream(guVar).filter(new C123417eq(guVar2)).distinct().collect(C58370cn.f155946a);
        }
        Optional flatMap = Collection.EL.stream(guVar).min(new C123418er(geVar, fVar)).flatMap(C123419es.f341191a);
        if (flatMap.isPresent()) {
            C123503i iVar = (C123503i) flatMap.get();
            if (!iVar.mo105917a().equals(C123481h.APP) && !geVar.mo106019l(iVar).isPresent()) {
                flatMap = Optional.empty();
            }
        }
        if (flatMap.isPresent() && Collection.EL.stream(geVar.mo106013e((C123503i) flatMap.get())).map(new C123455ga(fVar)).anyMatch(C123453fz.f341237a)) {
            ((C123503i) flatMap.get()).mo105917a();
            ((C123503i) flatMap.get()).mo106026d();
            flatMap = Optional.empty();
        }
        if (!flatMap.isPresent()) {
            return geVar.mo106016h(fVar, cxVar, fVar2);
        }
        C123503i iVar2 = (C123503i) flatMap.get();
        iVar2.mo105917a();
        iVar2.mo106026d();
        C60870cx g = geVar.mo106015g(iVar2, fVar, fVar2);
        C123456gb gbVar = new C123456gb(geVar, iVar2, fVar, cxVar, fVar2);
        return C60922j.m93045h(g, C47810es.m84966f(gbVar), C60826bg.f164896a);
    }
}
