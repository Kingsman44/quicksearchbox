package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.ab.j */
/* compiled from: PG */
public final /* synthetic */ class C32415j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C32415j f86875a = new C32415j();

    private /* synthetic */ C32415j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C32367ai aiVar = (C32367ai) obj;
        C59071e eVar = C32359aa.f86743a;
        C32370al alVar = (C32370al) C32371am.f86780i.createBuilder();
        String str = aiVar.f86771c;
        alVar.copyOnWrite();
        C32371am amVar = (C32371am) alVar.instance;
        str.getClass();
        amVar.f86782a |= 2;
        amVar.f86784c = str;
        String str2 = aiVar.f86770b;
        alVar.copyOnWrite();
        C32371am amVar2 = (C32371am) alVar.instance;
        str2.getClass();
        amVar2.f86782a |= 1;
        amVar2.f86783b = str2;
        double d = aiVar.f86774f;
        alVar.copyOnWrite();
        C32371am amVar3 = (C32371am) alVar.instance;
        amVar3.f86782a |= 4;
        amVar3.f86785d = d;
        double d2 = aiVar.f86774f;
        alVar.copyOnWrite();
        C32371am amVar4 = (C32371am) alVar.instance;
        amVar4.f86782a |= 16;
        amVar4.f86787f = d2;
        C32361ac acVar = aiVar.f86775g;
        if (acVar == null) {
            acVar = C32361ac.f86752d;
        }
        alVar.copyOnWrite();
        C32371am amVar5 = (C32371am) alVar.instance;
        acVar.getClass();
        amVar5.f86789h = acVar;
        amVar5.f86782a |= 64;
        return (C32371am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
