package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4553a.C59471av;
import com.google.common.p4552o.p4553a.C59472aw;
import java.util.Random;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.q */
/* compiled from: PG */
public final /* synthetic */ class C101398q implements Function {

    /* renamed from: a */
    public final /* synthetic */ Random f282929a;

    public /* synthetic */ C101398q(Random random) {
        this.f282929a = random;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Random random = this.f282929a;
        C59472aw awVar = (C59472aw) obj;
        C58974d dVar = C101325be.f282743a;
        C59471av avVar = (C59471av) C59472aw.f157775d.createBuilder();
        int i = awVar.f157778b;
        avVar.copyOnWrite();
        C59472aw awVar2 = (C59472aw) avVar.instance;
        awVar2.f157777a |= 1;
        awVar2.f157778b = i;
        long j = awVar.f157779c;
        int nextInt = random.nextInt(9);
        avVar.copyOnWrite();
        C59472aw awVar3 = (C59472aw) avVar.instance;
        awVar3.f157777a |= 2;
        awVar3.f157779c = j + ((long) nextInt) + 1;
        return (C59472aw) avVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
