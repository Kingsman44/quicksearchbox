package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36501e;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36605h;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36606i;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36536h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.ac */
/* compiled from: PG */
final class C36557ac implements C36606i {

    /* renamed from: a */
    public static final C59071e f95349a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.c.a.ac");

    /* renamed from: b */
    public C36606i f95350b;

    /* renamed from: c */
    private final C36608k f95351c;

    /* renamed from: d */
    private final C69464a f95352d;

    /* renamed from: e */
    private final C36569ao f95353e;

    /* renamed from: f */
    private final Executor f95354f;

    public C36557ac(C36608k kVar, C69464a aVar, C36569ao aoVar, Executor executor) {
        this.f95351c = kVar;
        this.f95352d = aVar;
        this.f95353e = aoVar;
        this.f95354f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo21529a() {
        this.f95354f.execute(C47810es.m84977q(new C36556ab(this)));
    }

    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f95354f.execute(C47810es.m84977q(new C36594v(this, z)));
    }

    /* renamed from: c */
    public final void mo21531c(int i) {
        this.f95354f.execute(C47810es.m84977q(new C36597y(this, i)));
    }

    /* renamed from: d */
    public final void mo21532d(int i) {
        this.f95354f.execute(C47810es.m84977q(new C36598z(this, i)));
    }

    /* renamed from: e */
    public final void mo21533e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        statusBarNotification.getKey();
        this.f95354f.execute(C47810es.m84977q(new C36595w(this, statusBarNotification, rankingMap)));
    }

    /* renamed from: f */
    public final void mo21534f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        statusBarNotification.getKey();
        this.f95354f.execute(C47810es.m84977q(new C36555aa(this, statusBarNotification, rankingMap)));
    }

    /* renamed from: g */
    public final void mo21535g(C83390g gVar) {
        this.f95354f.execute(C47810es.m84977q(new C36596x(this, gVar)));
    }

    /* renamed from: h */
    public final C36606i mo40219h() {
        if (this.f95350b == null) {
            C36608k kVar = this.f95351c;
            C36569ao aoVar = this.f95353e;
            C36536h hVar = (C36536h) aoVar.f95375a.mo17428b();
            hVar.getClass();
            C36501e eVar = (C36501e) aoVar.f95376b.mo17428b();
            eVar.getClass();
            Executor executor = (Executor) aoVar.f95377c.mo17428b();
            executor.getClass();
            kVar.getClass();
            this.f95350b = ((C36605h) this.f95352d.mo17428b()).mo21536a(kVar, new C36568an(hVar, eVar, executor, kVar));
        }
        return this.f95350b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C60870cx mo40220i() {
        C36593u uVar = new C36593u(this);
        return C60856cj.m92904m(C47810es.m84978r(uVar), this.f95354f);
    }
}
