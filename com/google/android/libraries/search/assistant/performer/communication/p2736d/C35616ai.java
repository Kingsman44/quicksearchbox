package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aez;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.ai */
/* compiled from: PG */
public final class C35616ai {

    /* renamed from: a */
    public static final C59071e f93468a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.d.ai");

    /* renamed from: b */
    public final Executor f93469b;

    public C35616ai(Executor executor) {
        this.f93469b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo39750a(C35615ah ahVar) {
        C35617aj a = ahVar.mo39744a();
        a.mo21079d();
        C51809dy d = ahVar.mo39747d();
        if (!d.f135936b.equals("notification.READ")) {
            a.mo21078c(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35469e(d.f135936b));
        }
        try {
            Optional c = C36183e.m64585c(d, "notification_read_args", aez.f134976g.getParserForType());
            if (c.isEmpty()) {
                a.mo21078c(C62722b.INVALID_ARGUMENT);
                return C60856cj.m92899h(new C35471g("Failed to parse NotificationReadArgs"));
            }
            aez aez = (aez) c.get();
            C35617aj a2 = ahVar.mo39744a();
            if ((aez.f134978a & 1) != 0) {
                C60870cx a3 = ahVar.mo39746c().mo39738a();
                C35613af afVar = new C35613af(this, a2, aez, ahVar);
                return C60922j.m93045h(a3, C47810es.m84966f(afVar), this.f93469b);
            }
            a2.mo21078c(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "NotificationReadArgs has no index."));
        } catch (C62974ct e) {
            a.mo21078c(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35471g((Throwable) e));
        }
    }
}
