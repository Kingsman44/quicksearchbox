package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9186b.p9189b;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48679an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48680ao;
import com.google.assistant.p3781ad.p3789d.p3791b.C48688aw;
import com.google.assistant.p3781ad.p3789d.p3791b.C48696bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48702bj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C121302i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C121302i f336885a = new C121302i();

    private /* synthetic */ C121302i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48708bp bpVar = (C48708bp) obj;
        C48706bn bnVar = bpVar.f126016e;
        if (bnVar == null) {
            bnVar = C48706bn.f126002f;
        }
        C48702bj bjVar = bnVar.f126005b;
        if (bjVar == null) {
            bjVar = C48702bj.f125992e;
        }
        if ((bjVar.f125994a & 1) == 0) {
            return Optional.empty();
        }
        C48706bn bnVar2 = bpVar.f126016e;
        if (bnVar2 == null) {
            bnVar2 = C48706bn.f126002f;
        }
        C48702bj bjVar2 = bnVar2.f126005b;
        if (bjVar2 == null) {
            bjVar2 = C48702bj.f125992e;
        }
        if ((bjVar2.f125994a & 4) == 0) {
            return Optional.empty();
        }
        C48696bd bdVar = bpVar.f126017f;
        if (bdVar == null) {
            bdVar = C48696bd.f125977e;
        }
        C48688aw awVar = bdVar.f125980b;
        if (awVar == null) {
            awVar = C48688aw.f125962c;
        }
        if ((awVar.f125964a & 1) == 0) {
            return Optional.empty();
        }
        C48679an anVar = (C48679an) C48680ao.f125940f.createBuilder();
        anVar.copyOnWrite();
        C48680ao aoVar = (C48680ao) anVar.instance;
        bpVar.getClass();
        aoVar.f125943b = bpVar;
        aoVar.f125942a |= 1;
        String str = bjVar.f125995b;
        anVar.copyOnWrite();
        C48680ao aoVar2 = (C48680ao) anVar.instance;
        str.getClass();
        aoVar2.f125942a |= 2;
        aoVar2.f125944c = str;
        C48580an anVar2 = C48580an.ICON_SHORTCUT;
        anVar.copyOnWrite();
        C48680ao aoVar3 = (C48680ao) anVar.instance;
        aoVar3.f125945d = anVar2.getNumber();
        aoVar3.f125942a |= 4;
        C48670ae aeVar = C48670ae.SUGGESTION_GROUP_ICON_SHORTCUT;
        anVar.copyOnWrite();
        C48680ao aoVar4 = (C48680ao) anVar.instance;
        aoVar4.f125946e = aeVar.f125872ao;
        aoVar4.f125942a |= 8;
        return Optional.m71637of((C48680ao) anVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
