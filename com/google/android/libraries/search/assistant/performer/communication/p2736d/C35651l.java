package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.l */
/* compiled from: PG */
public final /* synthetic */ class C35651l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35657r f93529a;

    /* renamed from: b */
    public final /* synthetic */ C35656q f93530b;

    public /* synthetic */ C35651l(C35657r rVar, C35656q qVar) {
        this.f93529a = rVar;
        this.f93530b = qVar;
    }

    public final C60870cx apply(Object obj) {
        C35657r rVar = this.f93529a;
        C35656q qVar = this.f93530b;
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.PERMISSION_DENIED, "The following permissions aren't granted: ".concat(String.valueOf(String.valueOf(set)))));
        }
        C60870cx a = qVar.mo39759b().mo20795a();
        C35652m mVar = new C35652m(qVar);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(mVar), rVar.f93535b);
        C35653n nVar = new C35653n(qVar);
        C60870cx q = C60856cj.m92908q(C60922j.m93045h(h, C47810es.m84966f(nVar), rVar.f93535b), 6, TimeUnit.SECONDS, rVar.f93535b);
        C35649j jVar = new C35649j(rVar, qVar.mo39761d().f134964d, qVar.mo39758a());
        C60870cx h2 = C60922j.m93045h(q, C47810es.m84966f(jVar), rVar.f93535b);
        C35650k kVar = C35650k.f93528a;
        return C60846c.m92878g(h2, Throwable.class, C47810es.m84963c(kVar), rVar.f93535b);
    }
}
