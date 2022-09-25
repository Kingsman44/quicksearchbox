package com.google.android.libraries.search.p3055n.p3087j.p3088a;

import com.google.speech.p5218j.C67046ja;
import com.google.speech.p5218j.p5223d.C66882a;
import com.google.speech.p5218j.p5223d.C66883b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.n.j.a.a */
/* compiled from: PG */
abstract class C39798a implements Function {
    /* renamed from: a */
    public final C66883b apply(C67046ja jaVar) {
        C66882a aVar = (C66882a) C66883b.f181830j.createBuilder();
        if ((jaVar.f182245a & 1) != 0) {
            boolean z = jaVar.f182246b;
            aVar.copyOnWrite();
            C66883b bVar = (C66883b) aVar.instance;
            bVar.f181832a |= 1;
            bVar.f181833b = z;
        }
        if ((jaVar.f182245a & 2) != 0) {
            int i = jaVar.f182247c;
            aVar.copyOnWrite();
            C66883b bVar2 = (C66883b) aVar.instance;
            bVar2.f181832a |= 2;
            bVar2.f181834c = i;
        }
        if ((jaVar.f182245a & 4) != 0) {
            long j = jaVar.f182248d;
            aVar.copyOnWrite();
            C66883b bVar3 = (C66883b) aVar.instance;
            bVar3.f181832a |= 4;
            bVar3.f181835d = j;
        }
        if ((jaVar.f182245a & 8) != 0) {
            long j2 = jaVar.f182249e;
            aVar.copyOnWrite();
            C66883b bVar4 = (C66883b) aVar.instance;
            bVar4.f181832a |= 8;
            bVar4.f181836e = j2;
        }
        if ((jaVar.f182245a & 16) != 0) {
            int i2 = jaVar.f182250f;
            aVar.copyOnWrite();
            C66883b bVar5 = (C66883b) aVar.instance;
            bVar5.f181832a |= 16;
            bVar5.f181837f = i2;
        }
        if ((jaVar.f182245a & 32) != 0) {
            boolean z2 = jaVar.f182252h;
            aVar.copyOnWrite();
            C66883b bVar6 = (C66883b) aVar.instance;
            bVar6.f181832a |= 32;
            bVar6.f181838g = z2;
        }
        mo42015c(jaVar, aVar);
        mo42014b(jaVar, aVar);
        return (C66883b) aVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public abstract void mo42014b(C67046ja jaVar, C66882a aVar);

    /* renamed from: c */
    public abstract void mo42015c(C67046ja jaVar, C66882a aVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
