package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9186b.p9190c;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48679an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48680ao;
import com.google.assistant.p3781ad.p3789d.p3791b.C48700bh;
import com.google.assistant.p3781ad.p3789d.p3791b.C48702bj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48704bl;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C121306a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C121306a f336888a = new C121306a();

    private /* synthetic */ C121306a() {
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
        C48700bh bhVar = bnVar.f126008e;
        if (bhVar == null) {
            bhVar = C48700bh.f125988c;
        }
        C48706bn bnVar2 = bpVar.f126016e;
        if (bnVar2 == null) {
            bnVar2 = C48706bn.f126002f;
        }
        C48704bl blVar = bnVar2.f126007d;
        if (blVar == null) {
            blVar = C48704bl.f125998c;
        }
        if ((bhVar.f125990a & 1) == 0 && (blVar.f126000a & 1) == 0) {
            return Optional.empty();
        }
        C48706bn bnVar3 = bpVar.f126016e;
        if (bnVar3 == null) {
            bnVar3 = C48706bn.f126002f;
        }
        C48702bj bjVar = bnVar3.f126005b;
        if (bjVar == null) {
            bjVar = C48702bj.f125992e;
        }
        if ((bjVar.f125994a & 1) == 0) {
            return Optional.empty();
        }
        C48679an anVar = (C48679an) C48680ao.f125940f.createBuilder();
        anVar.copyOnWrite();
        C48680ao aoVar = (C48680ao) anVar.instance;
        bpVar.getClass();
        aoVar.f125943b = bpVar;
        aoVar.f125942a |= 1;
        String str = (bhVar.f125990a & 1) != 0 ? bhVar.f125991b : blVar.f126001b;
        anVar.copyOnWrite();
        C48680ao aoVar2 = (C48680ao) anVar.instance;
        str.getClass();
        aoVar2.f125942a |= 2;
        aoVar2.f125944c = str;
        C48580an anVar2 = C48580an.APP_SHORTCUTS;
        anVar.copyOnWrite();
        C48680ao aoVar3 = (C48680ao) anVar.instance;
        aoVar3.f125945d = anVar2.getNumber();
        aoVar3.f125942a |= 4;
        C48670ae aeVar = C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY;
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
