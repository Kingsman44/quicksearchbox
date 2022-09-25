package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62995dn;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.q */
/* compiled from: PG */
public final /* synthetic */ class C16433q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16347au f48337a;

    public /* synthetic */ C16433q(C16347au auVar) {
        this.f48337a = auVar;
    }

    public final Object apply(Object obj) {
        C16347au auVar = this.f48337a;
        C16348av avVar = (C16348av) C16349aw.f48126d.createBuilder();
        Stream stream = Collection.EL.stream((C58485gu) obj);
        C62995dn dnVar = auVar.f48124a;
        stream.limit((long) (dnVar.containsKey(6) ? ((Integer) dnVar.get(6)).intValue() : 0)).forEach(new C16441y(avVar));
        return (C16349aw) avVar.build();
    }
}
