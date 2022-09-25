package com.google.android.apps.gsa.shared.logger.p7064i;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38814g;
import com.google.android.libraries.search.logging.p3043f.p3045b.C39194a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59668bv;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59747ed;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60547ty;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.logger.i.c */
/* compiled from: PG */
public final class C89923c implements C89922b {

    /* renamed from: a */
    private final C89859i f246358a;

    /* renamed from: b */
    private final C21370a f246359b;

    /* renamed from: c */
    private final C38814g f246360c;

    /* renamed from: d */
    private final boolean f246361d;

    /* renamed from: e */
    private C89928h f246362e = new C89928h();

    public C89923c(C21370a aVar, C89859i iVar, C38814g gVar, boolean z) {
        this.f246359b = aVar;
        this.f246358a = iVar;
        this.f246360c = gVar;
        this.f246361d = z;
    }

    /* renamed from: j */
    private final C89857g m146457j(long j, C89849ae aeVar) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        long c = this.f246359b.mo26871c();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 4194304;
        cbVar.f160143x = c;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        fVar.f246204d = TimeUnit.MILLISECONDS.toNanos(j);
        return fVar.mo83699a();
    }

    /* renamed from: k */
    private final void m146458k(long j) {
        C89928h hVar = this.f246362e;
        boolean z = C89926f.f246364a;
        C58833ax axVar = hVar.f246378i;
        if (!axVar.mo56113h() || ((!C89926f.f246364a && j >= TimeUnit.NANOSECONDS.toMillis(((C89857g) axVar.mo56107c()).f246210e) + 5000) || this.f246362e.mo83766a())) {
            this.f246362e = new C89928h();
        }
    }

    /* renamed from: l */
    private final void m146459l(long j, C89849ae aeVar) {
        C89857g j2 = m146457j(j, aeVar);
        C89928h hVar = this.f246362e;
        if (!hVar.f246378i.mo56113h()) {
            hVar.f246378i = C58833ax.m90834k(j2);
        }
        this.f246358a.mo74236a(j2);
    }

    /* renamed from: m */
    private final void m146460m(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C89928h hVar = this.f246362e;
        boolean z = C89926f.f246364a;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C58833ax axVar = hVar.f246378i;
        int i = axVar.mo56113h() ? ((C89857g) axVar.mo56107c()).f246206a == C89849ae.APPLICATION_CREATE ? 2 : 3 : 1;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160140u = i - 1;
        cbVar.f160062a |= C89885b.HTTP_VALUE;
        boolean z2 = hVar.f246372c;
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160115b |= 16;
        cbVar2.f160042G = z2;
        if (hVar.f246373d.mo56113h()) {
            int i2 = ((C60547ty) hVar.f246373d.mo56107c()).f164058x;
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            cbVar3.f160062a |= 524288;
            cbVar3.f160141v = i2;
        }
        if (hVar.f246375f.mo56113h()) {
            Intent intent = (Intent) hVar.f246375f.mo56107c();
            C59747ed b = C39194a.m68627b(intent);
            ajVar.copyOnWrite();
            C59687cb cbVar4 = (C59687cb) ajVar.instance;
            b.getClass();
            cbVar4.f160142w = b;
            cbVar4.f160062a |= 1048576;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                e a = C87564g.m142223a(extras);
                ajVar.copyOnWrite();
                C59687cb cbVar5 = (C59687cb) ajVar.instance;
                cbVar5.f160043H = a.ca;
                cbVar5.f160115b |= 32;
            }
        }
        if (hVar.f246376g.mo56113h()) {
            ajVar.copyOnWrite();
            C59687cb cbVar6 = (C59687cb) ajVar.instance;
            cbVar6.f160044I = ((C59668bv) hVar.f246376g.mo56107c()).f160002d;
            cbVar6.f160115b |= 64;
        }
        if (hVar.f246377h.mo56113h()) {
            ajVar.mo57008e((C59770f) hVar.f246377h.mo56107c());
        }
        fVar.f246203c = (C59687cb) ajVar.build();
        C58833ax axVar2 = this.f246362e.f246378i;
        C58838bb.m90869d(axVar2.mo56113h(), "Attempting to get start event of startup AppFlow, but no start event has been logged.");
        fVar.f246202b = C58528ij.m90008H(new C89849ae[]{((C89857g) axVar2.mo56107c()).f246206a});
        this.f246358a.mo74236a(fVar.mo83699a());
    }

    /* renamed from: n */
    private final boolean m146461n() {
        return this.f246362e.mo83766a() && !this.f246362e.mo83768c();
    }

    /* renamed from: a */
    public final void mo83757a() {
        if (!this.f246361d && m146461n() && !this.f246362e.mo83767b()) {
            C89928h hVar = this.f246362e;
            if (hVar.mo83767b() || hVar.mo83768c()) {
                throw new IllegalStateException("End event of FirstDrawDone flow has already been logged.");
            }
            hVar.f246371b.add(C89927g.FIRST_DRAW_DONE_RECORDED);
            m146460m((C89849ae) C89926f.m146474a(C89926f.m146475b(this.f246362e, this.f246360c)).mo41651b());
        }
    }

    /* renamed from: b */
    public final void mo83758b(C60547ty tyVar, Class cls, C58833ax axVar, long j, boolean z) {
        if (!this.f246361d) {
            m146458k(j);
            m146459l(j, C89849ae.ACTIVITY_ON_CREATE);
            C89928h hVar = this.f246362e;
            if (hVar.mo83766a()) {
                ((C59052c) ((C59052c) C89928h.f246370a.mo56225c()).mo56372aa(10710)).mo56386p("Activity creation has already been logged.");
            }
            hVar.f246373d = C58833ax.m90834k(tyVar);
            hVar.f246374e = C58833ax.m90834k(cls);
            hVar.f246375f = axVar;
            hVar.f246372c = z;
            hVar.f246371b.add(C89927g.ACTIVITY_ON_CREATE_RECORDED);
        }
    }

    /* renamed from: c */
    public final void mo83759c(long j) {
        if (!this.f246361d) {
            this.f246362e = new C89928h();
            m146459l(j, C89849ae.APPLICATION_CREATE);
        }
    }

    /* renamed from: d */
    public final void mo83760d() {
        if (!this.f246361d && m146461n() && C89926f.m146476c(this.f246362e, this.f246360c)) {
            C89928h hVar = this.f246362e;
            if (!hVar.mo83768c()) {
                hVar.f246371b.add(C89927g.APPLICATION_INTERACTIVE_RECORDED);
                m146460m((C89849ae) C89926f.m146474a(C89926f.m146475b(this.f246362e, this.f246360c)).mo41650a().mo56108d(C89925e.f246363a));
                return;
            }
            throw new IllegalStateException("End event of ApplicationInteractive flow has already been logged.");
        }
    }

    /* renamed from: e */
    public final void mo83761e(C59668bv bvVar) {
        if (!this.f246361d && m146461n()) {
            C89928h hVar = this.f246362e;
            if (!hVar.mo83768c()) {
                hVar.f246376g = C58833ax.m90834k(bvVar);
                hVar.f246371b.add(C89927g.CANCEL_OR_FAIL_RECORDED);
                if (!this.f246362e.mo83767b()) {
                    m146460m(C89849ae.FIRST_DRAW_DONE_CANCEL_ACTIVITY_STOPPED);
                }
                if (C89926f.m146476c(this.f246362e, this.f246360c)) {
                    m146460m(C89849ae.APPLICATION_INTERACTIVE_CANCEL);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Startup cancel or error end event has already been logged.");
        }
    }

    /* renamed from: f */
    public final void mo83762f(C59770f fVar) {
        if (!this.f246361d && m146461n()) {
            C89928h hVar = this.f246362e;
            if (!hVar.mo83768c()) {
                hVar.f246377h = C58833ax.m90834k(fVar);
                hVar.f246371b.add(C89927g.CANCEL_OR_FAIL_RECORDED);
                if (!this.f246362e.mo83767b()) {
                    m146460m(C89849ae.FIRST_DRAW_DONE_ERROR);
                }
                if (C89926f.m146476c(this.f246362e, this.f246360c)) {
                    m146460m(C89849ae.APPLICATION_INTERACTIVE_ERROR);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Startup cancel or error end event has already been logged.");
        }
    }

    /* renamed from: g */
    public final void mo83763g(C89849ae aeVar) {
        if (!this.f246361d && !this.f246362e.mo83768c()) {
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            this.f246358a.mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: h */
    public final void mo83764h(C89849ae aeVar, long j) {
        if (!this.f246361d && !this.f246362e.mo83768c()) {
            this.f246358a.mo74236a(m146457j(j, aeVar));
        }
    }

    /* renamed from: i */
    public final void mo83765i(long j) {
        if (!this.f246361d) {
            m146458k(j);
            m146459l(j, C89849ae.TRAMPOLINE_STARTUP);
        }
    }
}
