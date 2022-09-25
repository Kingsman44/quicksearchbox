package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.aq */
/* compiled from: PG */
public final class C35624aq {

    /* renamed from: a */
    public static final C59071e f93475a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.d.aq");

    /* renamed from: b */
    private final ScheduledExecutorService f93476b;

    public C35624aq(ScheduledExecutorService scheduledExecutorService) {
        this.f93476b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo39756a(C35623ap apVar) {
        afb c = apVar.mo39755c();
        int i = c.f134986a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return C60856cj.m92899h(new C35471g("Missing index or message for reply"));
        }
        String str = c.f134988c;
        if (str.isEmpty()) {
            return C60856cj.m92899h(new C35471g("Reply message is empty"));
        }
        C60870cx a = apVar.mo39754b().mo39738a();
        C35618ak akVar = new C35618ak(c);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(akVar), this.f93476b);
        C35619al alVar = new C35619al(apVar, str);
        return C60856cj.m92908q(C60922j.m93045h(h, C47810es.m84966f(alVar), this.f93476b), 6, TimeUnit.SECONDS, this.f93476b);
    }

    /* renamed from: b */
    public final C60870cx mo39757b(C60870cx cxVar) {
        C35620am amVar = C35620am.f93473a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(amVar), this.f93476b);
        C35621an anVar = C35621an.f93474a;
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(anVar), this.f93476b);
    }
}
