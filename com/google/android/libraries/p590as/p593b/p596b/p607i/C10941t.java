package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.i.t */
/* compiled from: PG */
public final /* synthetic */ class C10941t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C29409fd f36057a;

    public /* synthetic */ C10941t(C29409fd fdVar) {
        this.f36057a = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C29409fd fdVar = this.f36057a;
        C10882h hVar = (C10882h) obj;
        C58974d dVar = C10905af.f35995a;
        String c = C10934m.m25955c(hVar.mo19289g().toLanguageTag(), hVar.mo19282a());
        ((C58970a) ((C58970a) C10905af.f35995a.mo56224b()).mo56372aa(54035)).mo56389s("Removing LanguagePack file group: %s", c);
        C29651hv e = C29652hw.m54673e();
        e.mo34790b(c);
        return fdVar.mo34722k(e.mo34789a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
