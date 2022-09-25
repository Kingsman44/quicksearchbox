package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.speech.p5218j.C66862ch;
import com.google.speech.p5218j.C66865ck;
import com.google.speech.p5218j.C66948fk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.n.f.b.k */
/* compiled from: PG */
public final /* synthetic */ class C39708k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C66948fk f104488a;

    public /* synthetic */ C39708k(C66948fk fkVar) {
        this.f104488a = fkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C66948fk fkVar = this.f104488a;
        C66862ch chVar = (C66862ch) ((C66865ck) obj).toBuilder();
        chVar.copyOnWrite();
        C66865ck ckVar = (C66865ck) chVar.instance;
        ckVar.f181791c = Integer.valueOf(fkVar.f181990o);
        ckVar.f181790b = 9;
        return (C66865ck) chVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
