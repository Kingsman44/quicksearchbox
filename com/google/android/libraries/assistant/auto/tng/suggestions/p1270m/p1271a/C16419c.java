package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.assistant.p3994s.p3995a.C53433ns;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.c */
/* compiled from: PG */
public final /* synthetic */ class C16419c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16348av f48310a;

    public /* synthetic */ C16419c(C16348av avVar) {
        this.f48310a = avVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C16348av avVar = this.f48310a;
        C16143co coVar = (C16143co) obj;
        if (coVar.mo22805i()) {
            return false;
        }
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        arVar.f48116a |= 4;
        arVar.f48119d = true;
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        arVar2.f48118c = 2;
        arVar2.f48116a = 2 | arVar2.f48116a;
        C53433ns nsVar = (C53433ns) C53435nu.f140233n.createBuilder();
        String h = coVar.mo22804h();
        nsVar.copyOnWrite();
        C53435nu nuVar = (C53435nu) nsVar.instance;
        h.getClass();
        nuVar.f140236a |= 1;
        nuVar.f140239d = h;
        aqVar.copyOnWrite();
        C16344ar arVar3 = (C16344ar) aqVar.instance;
        C53435nu nuVar2 = (C53435nu) nsVar.build();
        nuVar2.getClass();
        arVar3.f48117b = nuVar2;
        arVar3.f48116a |= 1;
        avVar.mo22891b(aqVar);
        return true;
    }
}
