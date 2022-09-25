package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6519al.p6697de.C85351a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88303wr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90737au;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8811c.C117826a;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13848b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.ssb.C45350g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bq */
/* compiled from: PG */
public final class C118000bq implements C13848b {

    /* renamed from: a */
    public static final C59071e f327495a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.e.bq");

    /* renamed from: b */
    public final C118027cq f327496b;

    /* renamed from: c */
    public final C90021c f327497c;

    /* renamed from: d */
    public C117975as f327498d;

    /* renamed from: e */
    private final C117976at f327499e;

    /* renamed from: f */
    private final C22871g f327500f;

    /* renamed from: g */
    private final C85351a f327501g;

    /* renamed from: h */
    private int f327502h = 0;

    /* renamed from: i */
    private C60870cx f327503i;

    public C118000bq(C118027cq cqVar, C90021c cVar, C117976at atVar, C85351a aVar, C22871g gVar) {
        this.f327496b = cqVar;
        this.f327499e = atVar;
        this.f327500f = gVar;
        this.f327497c = cVar;
        this.f327501g = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m196049m() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.gsa.shared.m.c r0 = r5.f327497c     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250402cU     // Catch:{ all -> 0x0053 }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r5)
            return
        L_0x000d:
            com.google.common.util.concurrent.cx r0 = r5.f327503i     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0015
            r1 = 1
            r0.cancel(r1)     // Catch:{ all -> 0x0053 }
        L_0x0015:
            com.google.android.apps.gsa.staticplugins.w.h.e.as r0 = r5.f327498d     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0051
            r1 = 0
            r0.f327442m = r1     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f327432c     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250260L     // Catch:{ all -> 0x0053 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x002f
            boolean r2 = r0.f327443n     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x002f
            com.google.android.apps.gsa.search.core.a.b.a r2 = r0.f327434e     // Catch:{ all -> 0x0053 }
            r2.mo77890d()     // Catch:{ all -> 0x0053 }
        L_0x002f:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f327432c     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250259K     // Catch:{ all -> 0x0053 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0051
            com.google.android.apps.gsa.staticplugins.w.h.e.ao r0 = r0.f327435f     // Catch:{ all -> 0x0053 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.staticplugins.w.h.e.an r2 = r0.f327426f     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x004d
            com.google.android.libraries.gsa.k.g r2 = r0.f327424d     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.staticplugins.w.h.e.am r3 = new com.google.android.apps.gsa.staticplugins.w.h.e.am     // Catch:{ all -> 0x0053 }
            r3.<init>(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "stop audio spinner"
            r2.mo28212l(r4, r3)     // Catch:{ all -> 0x0053 }
        L_0x004d:
            r0.f327425e = r1     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return
        L_0x0051:
            monitor-exit(r5)
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C118000bq.m196049m():void");
    }

    /* renamed from: n */
    private final synchronized void m196050n() {
        if (this.f327497c.mo79746e(C90086ek.f250402cU)) {
            if (this.f327497c.mo79743a(C90086ek.f250481du) > 0) {
                this.f327503i = this.f327500f.mo28208h("Start Limited Connectivity Feedback", this.f327497c.mo79743a(C90086ek.f250481du), new C117989bf(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo103492a(int i) {
        if (this.f327502h != i) {
            this.f327502h = i;
            C118027cq cqVar = this.f327496b;
            C87684al alVar = new C87684al(C88244um.SHOW_RECOGNITION_STATE);
            C62940bt btVar = C88302wq.f238816a;
            C88303wr wrVar = (C88303wr) C88304ws.f238817c.createBuilder();
            wrVar.copyOnWrite();
            C88304ws wsVar = (C88304ws) wrVar.instance;
            wsVar.f238819a |= 1;
            wsVar.f238820b = i;
            alVar.mo81965b(btVar, (C88304ws) wrVar.build());
            ServiceEventData a = alVar.mo81964a();
            C90737au.m148206a(i);
            cqVar.mo103503e(a);
        }
        if (i == 2) {
            this.f327501g.mo78885c(C45350g.LISTENING);
        } else if (i == 3) {
            this.f327501g.mo78885c(C45350g.RECORDING);
        }
    }

    /* renamed from: b */
    public final void mo21291b() {
        mo103492a(2);
    }

    /* renamed from: c */
    public final void mo21292c() {
    }

    /* renamed from: d */
    public final void mo21293d() {
        int i = this.f327502h;
        if (i == 2 || i == 1) {
            mo103492a(5);
        } else if (i == 3) {
            mo103492a(4);
        }
        m196050n();
    }

    /* renamed from: e */
    public final void mo21294e() {
        m196049m();
    }

    /* renamed from: f */
    public final void mo21295f(Throwable th) {
        m196049m();
    }

    /* renamed from: g */
    public final void mo21296g() {
        mo103492a(5);
        this.f327496b.mo103503e(new C87684al(C88244um.NO_SPEECH_DETECTED).mo81964a());
    }

    /* renamed from: h */
    public final void mo21297h() {
        C117975as asVar = this.f327498d;
        if (asVar != null) {
            asVar.mo91335b();
        }
    }

    /* renamed from: i */
    public final void mo21298i() {
        mo103492a(3);
    }

    /* renamed from: j */
    public final void mo21299j(C57981b bVar) {
        ((C57987f) bVar).f155055e.mo20440jJ(new C117998bo(this));
    }

    /* renamed from: k */
    public final void mo21300k(C57981b bVar) {
        bVar.mo20440jJ(new C117997bn(this));
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo21301l(C13829a aVar) {
        C117976at atVar = this.f327499e;
        Query query = ((C117826a) aVar).f327005a;
        query.getClass();
        Context context = (Context) atVar.f327445a.mo17428b();
        context.getClass();
        C92194i iVar = (C92194i) atVar.f327446b.mo17428b();
        iVar.getClass();
        C84352a aVar2 = (C84352a) atVar.f327447c.mo17428b();
        aVar2.getClass();
        Query query2 = (Query) atVar.f327448d.mo17428b();
        query2.getClass();
        C22871g gVar = (C22871g) atVar.f327449e.mo17428b();
        gVar.getClass();
        C86124t tVar = (C86124t) atVar.f327450f.mo17428b();
        tVar.getClass();
        C117971ao aoVar = (C117971ao) atVar.f327451g.mo17428b();
        aoVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) atVar.f327452h.mo17428b();
        sharedPreferences.getClass();
        C21370a aVar3 = (C21370a) atVar.f327453i.mo17428b();
        aVar3.getClass();
        C89859i iVar2 = (C89859i) atVar.f327454j.mo17428b();
        iVar2.getClass();
        this.f327498d = new C117975as(query, context, iVar, aVar2, query2, gVar, tVar, aoVar, sharedPreferences, aVar3, iVar2);
    }
}
