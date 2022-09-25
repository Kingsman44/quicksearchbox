package com.google.android.apps.gsa.opa.smartspace.p6454c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c.g */
/* compiled from: PG */
public final class C83751g {

    /* renamed from: a */
    public final C131650d f228280a;

    /* renamed from: b */
    public final C90021c f228281b;

    /* renamed from: c */
    public final C39141kp f228282c;

    /* renamed from: d */
    public final C21370a f228283d;

    /* renamed from: e */
    public final C58974d f228284e;

    /* renamed from: f */
    private final ConcurrentLinkedQueue f228285f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    private Optional f228286g = Optional.empty();

    /* renamed from: h */
    private Optional f228287h = Optional.empty();

    /* renamed from: i */
    private boolean f228288i;

    public C83751g(C131650d dVar, C90021c cVar, C39141kp kpVar, C21370a aVar, C83564a aVar2) {
        Optional.empty();
        Optional.empty();
        this.f228288i = false;
        this.f228280a = dVar;
        this.f228281b = cVar;
        this.f228282c = kpVar;
        this.f228283d = aVar;
        this.f228284e = aVar2.mo76901b(this);
    }

    /* renamed from: h */
    private final Optional m133345h() {
        if (this.f228281b.mo79746e(C90017bw.f247892aG)) {
            return this.f228286g.map(new C83746b(this));
        }
        return this.f228287h.map(new C83747c(this));
    }

    /* renamed from: a */
    public final void mo77077a(String str) {
        Optional h = m133345h();
        if (!h.isPresent()) {
            ((C58970a) ((C58970a) this.f228284e.mo56225c()).mo56372aa(6857)).mo56386p("#addTimingStep() called before timer started.");
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f228285f;
        Duration duration = (Duration) h.get();
        if (duration != null) {
            concurrentLinkedQueue.add(new C83745a(str, duration));
            ((C58970a) ((C58970a) this.f228284e.mo56224b()).mo56372aa(6856)).mo56353F("%s - %dms after headphone connected.", str, ((Duration) h.get()).toMillis());
            return;
        }
        throw new NullPointerException("Null elapsedTime");
    }

    /* renamed from: b */
    public final synchronized void mo77078b() {
        ((C58970a) ((C58970a) this.f228284e.mo56224b()).mo56372aa(6858)).mo56386p("#printTimingSummary:");
        Iterator it = this.f228285f.iterator();
        while (it.hasNext()) {
            C83750f fVar = (C83750f) it.next();
            ((C58970a) ((C58970a) this.f228284e.mo56224b()).mo56372aa(6859)).mo56351D("  %dms - %s", fVar.mo77072a().toMillis(), fVar.mo77073b());
        }
        this.f228288i = false;
        this.f228286g = Optional.empty();
        this.f228287h = Optional.empty();
    }

    /* renamed from: c */
    public final synchronized void mo77079c() {
        if (this.f228288i) {
            this.f228280a.mo110244c(C131650d.f359707a, 3);
            mo77078b();
            return;
        }
        ((C58970a) ((C58970a) this.f228284e.mo56224b()).mo56372aa(6861)).mo56386p("#stopWithError() called before timer started.");
    }

    /* renamed from: d */
    public final synchronized void mo77080d() {
        if (this.f228288i) {
            this.f228280a.mo110244c(C131650d.f359707a, 2);
            this.f228282c.mo41708w("SUCCESS_AIAI", BuildConfig.FLAVOR, false);
            mo77078b();
            return;
        }
        ((C58970a) ((C58970a) this.f228284e.mo56224b()).mo56372aa(6862)).mo56386p("#stopWithSuccess() called before timer started.");
    }

    /* renamed from: e */
    public final synchronized boolean mo77081e() {
        return ((Boolean) m133345h().map(new C83748d(this)).orElseGet(new C83749e(this))).booleanValue();
    }

    /* renamed from: f */
    public final synchronized boolean mo77082f() {
        return this.f228288i;
    }

    /* renamed from: g */
    public final synchronized void mo77083g(C106596h hVar) {
        if (this.f228288i) {
            ((C58970a) ((C58970a) this.f228284e.mo56225c()).mo56372aa(6860)).mo56386p("Timer has already been started!");
        }
        this.f228288i = true;
        this.f228285f.clear();
        this.f228286g = Optional.m71637of(Duration.ofMillis(hVar.f297211f));
        this.f228287h = Optional.m71637of(Instant.ofEpochMilli(hVar.f297209d));
        this.f228280a.mo110242a(C131650d.f359707a);
        mo77077a("2/9 Stored headphone connected context.");
    }
}
