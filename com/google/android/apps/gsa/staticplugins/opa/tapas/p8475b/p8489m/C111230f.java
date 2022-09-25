package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8489m;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48609ay;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48610az;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48612ba;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48613bb;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.f */
/* compiled from: PG */
public final /* synthetic */ class C111230f implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f309538a;

    public /* synthetic */ C111230f(long j) {
        this.f309538a = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        long j = this.f309538a;
        PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
        C48609ay ayVar = (C48609ay) C48610az.f125624d.createBuilder();
        Place b = placeLikelihood.mo37526b();
        if (b.mo37519p() != null) {
            String p = b.mo37519p();
            C58893dc.m90996a(p);
            ayVar.copyOnWrite();
            ((C48610az) ayVar.instance).f125626a = p;
        }
        if (b.mo37523t() != null) {
            List t = b.mo37523t();
            C58893dc.m90996a(t);
            Iterable iterable = (Iterable) Collection.EL.stream(t).map(C111228d.f309536a).collect(C58370cn.f155946a);
            ayVar.copyOnWrite();
            C48610az azVar = (C48610az) ayVar.instance;
            C62971cq cqVar = azVar.f125627b;
            if (!cqVar.mo58948c()) {
                azVar.f125627b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) azVar.f125627b);
        }
        ayVar.copyOnWrite();
        ((C48610az) ayVar.instance).f125628c = j;
        C48612ba baVar = (C48612ba) C48613bb.f125629c.createBuilder();
        baVar.copyOnWrite();
        C48610az azVar2 = (C48610az) ayVar.build();
        azVar2.getClass();
        ((C48613bb) baVar.instance).f125631a = azVar2;
        double a = placeLikelihood.mo37525a();
        baVar.copyOnWrite();
        ((C48613bb) baVar.instance).f125632b = a;
        return (C48613bb) baVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
