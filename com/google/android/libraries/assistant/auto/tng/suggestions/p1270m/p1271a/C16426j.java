package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.j */
/* compiled from: PG */
public final /* synthetic */ class C16426j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f48325a;

    public /* synthetic */ C16426j(int i) {
        this.f48325a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f48325a;
        C16348av avVar = (C16348av) C16349aw.f48126d.createBuilder();
        avVar.mo22890a((C58485gu) Collection.EL.stream((C58485gu) obj).limit((long) i).map(C16439w.f48345a).map(C16440x.f48346a).collect(C58370cn.f155946a));
        return (C16349aw) avVar.build();
    }
}
