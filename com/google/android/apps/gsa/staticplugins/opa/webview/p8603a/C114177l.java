package com.google.android.apps.gsa.staticplugins.opa.webview.p8603a;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.a.l */
/* compiled from: PG */
public final class C114177l extends C68247h {

    /* renamed from: a */
    private final C68283d f316578a;

    /* renamed from: c */
    private final C68283d f316579c;

    /* renamed from: d */
    private final C68283d f316580d;

    /* renamed from: e */
    private final C68283d f316581e;

    /* renamed from: f */
    private final C68283d f316582f;

    public C114177l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C114177l.class), aVar);
        this.f316578a = C68236af.m98549d(dVar);
        this.f316579c = C68236af.m98549d(dVar2);
        this.f316580d = C68236af.m98549d(dVar3);
        this.f316581e = C68236af.m98549d(dVar4);
        this.f316582f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C52070ec ecVar = (C52070ec) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C58881cr crVar = (C58881cr) list.get(2);
        C58881cr crVar2 = (C58881cr) list.get(3);
        Query query = (Query) list.get(4);
        if (C57940c.m88582i(cVar)) {
            C89849ae aeVar = C89849ae.OPA_WEBVIEW_PAGE_FINISHED;
            long j = query.f252749G;
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.mo83701c("rId", Long.toString(j));
            ((C89859i) crVar.mo6453a()).mo74236a(fVar.mo83699a());
            return C60856cj.m92900i(ecVar);
        }
        Throwable th = (Throwable) C57940c.m88575b(cVar).mo56111f();
        if (!(th instanceof C90456c) || !(th instanceof Exception)) {
            C90452a aVar = new C90452a(th, 211, !(th instanceof TimeoutException) ? th instanceof CancellationException ? C89885b.OPA_LOCKHART_WEBVIEW_CANCELLATION_VALUE : C89885b.OPA_LOCKHART_SEARCH_RESULT_UNKNOWN_FAILURE_VALUE : C89885b.OPA_LOCKHART_WEBVIEW_TIMEOUT_VALUE);
            C114175j.m189418a((C89911f) crVar2.mo6453a(), aVar, query.f252749G);
            throw aVar;
        }
        C114175j.m189418a((C89911f) crVar2.mo6453a(), (C90456c) th, query.f252749G);
        throw ((Exception) th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f316578a.mo60297gq(), C68236af.m98546a(this.f316579c.mo60297gq()), this.f316580d.mo60297gq(), this.f316581e.mo60297gq(), this.f316582f.mo60297gq());
    }
}
