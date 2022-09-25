package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11672ac;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.q */
/* compiled from: PG */
public final /* synthetic */ class C16322q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11675af f48014a;

    public /* synthetic */ C16322q(C11675af afVar) {
        this.f48014a = afVar;
    }

    public final Object apply(Object obj) {
        C16349aw awVar = (C16349aw) obj;
        C11671ab abVar = this.f48014a.f37667b;
        if (abVar == null) {
            abVar = C11671ab.f37655d;
        }
        C11672ac acVar = (C11672ac) C11673ad.f37660b.createBuilder();
        Stream map = Collection.EL.stream(awVar.f48129b).filter(C16312g.f48000a).map(new C16313h(abVar));
        Objects.requireNonNull(acVar);
        map.forEach(new C16314i(acVar));
        return (C11673ad) acVar.build();
    }
}
