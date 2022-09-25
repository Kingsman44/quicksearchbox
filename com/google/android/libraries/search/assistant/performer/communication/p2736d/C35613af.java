package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aez;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.af */
/* compiled from: PG */
public final /* synthetic */ class C35613af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35616ai f93464a;

    /* renamed from: b */
    public final /* synthetic */ C35617aj f93465b;

    /* renamed from: c */
    public final /* synthetic */ aez f93466c;

    /* renamed from: d */
    public final /* synthetic */ C35615ah f93467d;

    public /* synthetic */ C35613af(C35616ai aiVar, C35617aj ajVar, aez aez, C35615ah ahVar) {
        this.f93464a = aiVar;
        this.f93465b = ajVar;
        this.f93466c = aez;
        this.f93467d = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C35616ai aiVar = this.f93464a;
        C35617aj ajVar = this.f93465b;
        aez aez = this.f93466c;
        C35615ah ahVar = this.f93467d;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ajVar.mo21078c(C62722b.INTERNAL);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Received an absent snapshot from MessageSnapshotCache."));
        }
        C58485gu a = ((C34890k) axVar.mo56107c()).mo39602a();
        if (a.isEmpty()) {
            ajVar.mo21078c(C62722b.INTERNAL);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Received an empty BundledMessageNotification list from MessageSnapshotCache."));
        }
        int i = aez.f134979b;
        if (i >= a.size()) {
            ajVar.mo21078c(C62722b.OUT_OF_RANGE);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.OUT_OF_RANGE, "NotificationReadArgs index is out of range."));
        }
        String f = ahVar.mo39749f();
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) a.get(i);
        if (aez.f134980c) {
            cxVar = ahVar.mo39745b().mo21073a(bundledMessageNotification, f);
        } else {
            cxVar = ahVar.mo39745b().mo21075c(bundledMessageNotification, f, "messaging_v2");
            if (ahVar.mo39748e().booleanValue()) {
                C35612ae aeVar = new C35612ae(ajVar, ahVar, a, i, f);
                cxVar = C60846c.m92879h(cxVar, Throwable.class, C47810es.m84966f(aeVar), aiVar.f93469b);
            }
        }
        boolean z = aez.f134982e;
        C35610ac acVar = new C35610ac(ajVar, z);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(acVar), aiVar.f93469b);
        C35611ad adVar = new C35611ad(ajVar, z);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(adVar), aiVar.f93469b);
    }
}
