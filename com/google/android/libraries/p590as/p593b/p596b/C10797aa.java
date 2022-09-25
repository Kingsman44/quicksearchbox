package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C10797aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f35828a;

    public /* synthetic */ C10797aa(C58485gu guVar) {
        this.f35828a = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f35828a;
        C10882h hVar = (C10882h) obj;
        if (!hVar.mo19286e().isEmpty()) {
            return hVar;
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C10798ab(hVar)).filter(C10800ad.f35831a).filter(C10801ae.f35832a).collect(C58370cn.f155946a);
        if (guVar2.isEmpty()) {
            hVar.mo19289g();
            hVar.mo19282a();
            return hVar;
        }
        if (guVar2.size() > 1) {
            ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53962)).mo56359L("Multiple downloadable packs found for [%s %d] which could perform a feature override. Merging configs with one of them arbitrarily: %s", hVar.mo19289g(), Integer.valueOf(hVar.mo19282a()), guVar2.get(0));
        }
        return C10882h.m25899m(hVar.mo19289g(), hVar.mo19282a(), hVar.mo19290h(), hVar.mo19288f(), ((C10882h) guVar2.get(0)).mo19286e(), hVar.mo19283b());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
