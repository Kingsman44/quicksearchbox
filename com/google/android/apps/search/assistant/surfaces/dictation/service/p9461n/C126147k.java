package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.k */
/* compiled from: PG */
public final /* synthetic */ class C126147k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126150n f347603a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f347604b;

    public /* synthetic */ C126147k(C126150n nVar, C58485gu guVar) {
        this.f347603a = nVar;
        this.f347604b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C126150n nVar = this.f347603a;
        C58485gu guVar = this.f347604b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C60856cj.m92900i((C58485gu) optional.get());
        }
        C126038bc bcVar = nVar.f347612b;
        if (Collection.EL.stream(guVar).anyMatch(C125950ah.f347169a)) {
            cxVar = C60856cj.m92900i(C126054bs.m206108e(guVar));
        } else {
            C60870cx b = C126038bc.m206090b(bcVar.f347372r);
            C125951ai aiVar = new C125951ai(bcVar, guVar);
            cxVar = C60922j.m93044g(b, C47810es.m84963c(aiVar), C60826bg.f164896a);
        }
        C126149m mVar = new C126149m(nVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(mVar), C60826bg.f164896a);
    }
}
