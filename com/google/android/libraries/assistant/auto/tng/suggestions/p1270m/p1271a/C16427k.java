package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b.C16246b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.k */
/* compiled from: PG */
public final /* synthetic */ class C16427k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C16427k f48326a = new C16427k();

    private /* synthetic */ C16427k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        C53435nu c = C16246b.m33289c((C16143co) obj);
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        c.getClass();
        arVar.f48117b = c;
        arVar.f48116a |= 1;
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        arVar2.f48118c = 1;
        arVar2.f48116a |= 2;
        return (C16344ar) aqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
