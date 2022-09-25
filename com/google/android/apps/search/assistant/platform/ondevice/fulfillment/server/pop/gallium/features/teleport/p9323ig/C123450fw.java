package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.fw */
/* compiled from: PG */
public final /* synthetic */ class C123450fw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341232a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341233b;

    /* renamed from: c */
    public final /* synthetic */ C123326bg f341234c;

    public /* synthetic */ C123450fw(C123459ge geVar, C123427f fVar, C123326bg bgVar) {
        this.f341232a = geVar;
        this.f341233b = fVar;
        this.f341234c = bgVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        C123458gd gdVar;
        C123459ge geVar = this.f341232a;
        C123427f fVar = this.f341233b;
        C123326bg bgVar = this.f341234c;
        if (((Boolean) obj).booleanValue()) {
            return C58485gu.m89845m();
        }
        C123503i a = bgVar.mo105958a();
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(geVar.mo106013e(a));
        if (a.mo105917a().equals(C123481h.URL)) {
            C123501ht htVar = geVar.f341247a;
            guVar = (C58485gu) Collection.EL.stream(htVar.mo106022b(a.mo106026d(), geVar.f341248b).f112a).flatMap(new C123499hr(htVar)).collect(C58370cn.f155946a);
        } else {
            C123501ht htVar2 = geVar.f341247a;
            guVar = (C58485gu) Collection.EL.stream(htVar2.mo106021a(a.mo106026d()).f112a).flatMap(new C123497hp(htVar2)).collect(C58370cn.f155946a);
        }
        e.mo55396h(guVar);
        if (Collection.EL.stream(e.mo55394f()).map(new C123452fy(fVar)).anyMatch(C123453fz.f341237a)) {
            return C58485gu.m89845m();
        }
        Optional j = geVar.mo106017j(fVar, geVar.mo106011b(a).f120e);
        if (!j.isPresent()) {
            return C58485gu.m89845m();
        }
        C123427f c = C123459ge.m202806c((C123381dh) j.get());
        if (c.mo106010k()) {
            return C58485gu.m89845m();
        }
        C123503i a2 = bgVar.mo105958a();
        String a3 = geVar.f341250d.mo105911a(a.mo106026d(), c);
        boolean b = bgVar.mo105959b();
        C123421eu euVar = C123421eu.f341193a;
        if (b) {
            gdVar = C123422ev.f341194a;
        } else {
            gdVar = C123423ew.f341195a;
        }
        C58485gu d = geVar.mo106012d(a2, a3, b, euVar, gdVar);
        d.size();
        return d;
    }
}
