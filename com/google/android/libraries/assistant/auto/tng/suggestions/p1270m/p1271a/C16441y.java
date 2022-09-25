package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.y */
/* compiled from: PG */
public final /* synthetic */ class C16441y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16348av f48347a;

    public /* synthetic */ C16441y(C16348av avVar) {
        this.f48347a = avVar;
    }

    public final void accept(Object obj) {
        C16348av avVar = this.f48347a;
        C53435nu nuVar = (C53435nu) obj;
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        nuVar.getClass();
        arVar.f48117b = nuVar;
        arVar.f48116a |= 1;
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        arVar2.f48118c = 6;
        arVar2.f48116a |= 2;
        avVar.mo22891b(aqVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
