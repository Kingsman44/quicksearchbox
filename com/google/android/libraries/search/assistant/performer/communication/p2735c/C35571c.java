package com.google.android.libraries.search.assistant.performer.communication.p2735c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.C48273ca;
import com.google.assistant.p3745ab.C48276cd;
import com.google.assistant.p3745ab.C48277ce;
import com.google.common.util.concurrent.C60856cj;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70976ac;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.c.c */
/* compiled from: PG */
public final class C35571c implements C35569a {

    /* renamed from: a */
    public final C37215b f93390a;

    /* renamed from: b */
    private final ScheduledExecutorService f93391b;

    public C35571c(C37215b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f93390a = bVar;
        this.f93391b = scheduledExecutorService;
    }

    /* renamed from: o */
    private final void m63935o(C48273ca caVar, Duration duration, C37252a aVar) {
        C48276cd cdVar = (C48276cd) C48277ce.f124864e.createBuilder();
        cdVar.copyOnWrite();
        C48277ce ceVar = (C48277ce) cdVar.instance;
        ceVar.f124868c = caVar;
        ceVar.f124866a |= 2;
        C48277ce ceVar2 = (C48277ce) cdVar.build();
        C70976ac acVar = (C70976ac) C70977ad.f189266e.createBuilder();
        acVar.copyOnWrite();
        C70977ad adVar = (C70977ad) acVar.instance;
        ceVar2.getClass();
        adVar.f189272d = ceVar2;
        adVar.f189269a |= 4;
        C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(new C35570b(this, aVar, (C70977ad) acVar.build())), duration.toMillis(), TimeUnit.MILLISECONDS, this.f93391b), "Failed to log with call usage", new Object[0]);
    }

    /* renamed from: a */
    public final void mo39707a(C62722b bVar) {
        this.f93390a.mo19974a(C37176a.f97125fe.mo40805c(bVar));
    }

    /* renamed from: b */
    public final void mo39708b() {
        this.f93390a.mo19974a(C37176a.f97126ff);
    }

    /* renamed from: c */
    public final void mo39709c(C48273ca caVar, Duration duration) {
        m63935o(caVar, duration, C37176a.f97128fh.mo40779c());
    }

    /* renamed from: d */
    public final void mo39710d(C62722b bVar) {
        this.f93390a.mo19974a(C37176a.f97130fj.mo40805c(bVar));
    }

    /* renamed from: e */
    public final void mo39711e(C48273ca caVar, Duration duration, C62722b bVar) {
        m63935o(caVar, duration, C37176a.f97133fm.mo40805c(bVar));
    }

    /* renamed from: f */
    public final void mo39712f(C48273ca caVar, Duration duration) {
        m63935o(caVar, duration, C37176a.f97132fl.mo40805c(C62722b.OK));
    }

    /* renamed from: g */
    public final void mo39713g(C48273ca caVar, Duration duration, C62722b bVar) {
        m63935o(caVar, duration, C37176a.f97131fk.mo40805c(bVar));
    }

    /* renamed from: h */
    public final void mo39714h(C48273ca caVar, Duration duration, C62722b bVar) {
        m63935o(caVar, duration, C37176a.f97127fg.mo40805c(bVar));
    }

    /* renamed from: i */
    public final void mo39715i(C62722b bVar) {
        this.f93390a.mo19974a(C37176a.f97083ep.mo40805c(bVar));
    }

    /* renamed from: j */
    public final void mo39716j(int i, String str) {
        this.f93390a.mo19974a(C37176a.f97083ep.mo40803a(i, str));
    }

    /* renamed from: k */
    public final void mo39717k() {
        this.f93390a.mo19974a(C37176a.f97082eo);
    }

    /* renamed from: l */
    public final void mo39718l() {
        this.f93390a.mo19974a(C37176a.f97084eq);
    }

    /* renamed from: m */
    public final void mo39719m() {
        this.f93390a.mo19974a(C37176a.f97124fd);
    }

    /* renamed from: n */
    public final void mo39720n(C62722b bVar) {
        this.f93390a.mo19974a(C37176a.f97129fi.mo40805c(bVar));
    }
}
