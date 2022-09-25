package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17901c;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17902d;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.j */
/* compiled from: PG */
public final class C107359j {

    /* renamed from: a */
    public static final C59071e f298778a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.service.j");

    /* renamed from: b */
    final Handler f298779b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    final C107355f f298780c = new C107355f(this);

    /* renamed from: d */
    C107357h f298781d;

    /* renamed from: e */
    final C107352c f298782e = new C107352c(this);

    /* renamed from: f */
    public C17849l f298783f;

    /* renamed from: g */
    public final List f298784g = new ArrayList();

    /* renamed from: h */
    public final Object f298785h = new Object();

    /* renamed from: i */
    public final List f298786i;

    /* renamed from: j */
    public C58833ax f298787j;

    /* renamed from: k */
    public C58833ax f298788k;

    /* renamed from: l */
    public C58833ax f298789l;

    /* renamed from: m */
    public C107358i f298790m;

    /* renamed from: n */
    C107364o f298791n;

    /* renamed from: o */
    public final C91142g f298792o;

    /* renamed from: p */
    public final C107374y f298793p;

    /* renamed from: q */
    public final C68214a f298794q;

    /* renamed from: r */
    public final C143701ac f298795r;

    /* renamed from: s */
    public final C119533b f298796s;

    /* renamed from: t */
    public Service f298797t;

    /* renamed from: u */
    C107354e f298798u;

    public C107359j(C91142g gVar, C107374y yVar, C68214a aVar, C143701ac acVar, C119533b bVar) {
        C58836b bVar2 = C58836b.f156633a;
        this.f298787j = bVar2;
        this.f298788k = bVar2;
        this.f298789l = bVar2;
        this.f298792o = gVar;
        this.f298793p = yVar;
        this.f298794q = aVar;
        this.f298795r = acVar;
        this.f298786i = new ArrayList();
        this.f298796s = bVar;
    }

    /* renamed from: a */
    public final void mo95972a() {
        C107364o oVar = this.f298791n;
        if (oVar != null) {
            oVar.f298809e.post(new C107360k(oVar));
            this.f298791n = null;
        }
        if (this.f298798u != null) {
            this.f298798u = null;
        }
    }

    /* renamed from: b */
    public final void mo95973b() {
        if (this.f298792o.mo85405j(C90014bt.f247039D)) {
            this.f298793p.f298845c = this.f298787j;
        }
    }

    /* renamed from: c */
    public final void mo95974c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298792o.mo85405j(C90014bt.f247039D)) {
            C107374y yVar = this.f298793p;
            if (yVar.f298844b.mo56113h()) {
                C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
                C17908j jVar = C17908j.ASSISTANT_CONNECTION_LOST;
                hVar.copyOnWrite();
                C17909k kVar = (C17909k) hVar.instance;
                kVar.f51317b = jVar.f51313l;
                kVar.f51316a |= 1;
                ((C107372w) yVar.f298844b.mo56107c()).mo95991b(((C17909k) hVar.build()).toByteArray());
                return;
            }
            return;
        }
        C17849l lVar = this.f298783f;
        if (lVar != null) {
            try {
                C17906h hVar2 = (C17906h) C17909k.f51314c.createBuilder();
                C17908j jVar2 = C17908j.ASSISTANT_CONNECTION_LOST;
                hVar2.copyOnWrite();
                C17909k kVar2 = (C17909k) hVar2.instance;
                kVar2.f51317b = jVar2.f51313l;
                kVar2.f51316a |= 1;
                lVar.mo23472a(((C17909k) hVar2.build()).toByteArray());
            } catch (RemoteException e) {
                C59104x d = f298778a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(23737)).mo56386p("#notifyAssistantConnectionLost(): sending ASSISTANT_CONNECTION_LOST failed.");
            }
        }
    }

    /* renamed from: d */
    public final void mo95975d(C89849ae aeVar) {
        List list = this.f298786i;
        C17901c cVar = (C17901c) C17902d.f51290d.createBuilder();
        cVar.copyOnWrite();
        C17902d dVar = (C17902d) cVar.instance;
        dVar.f51293b = aeVar.f245884YW;
        dVar.f51292a |= 1;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        cVar.copyOnWrite();
        C17902d dVar2 = (C17902d) cVar.instance;
        dVar2.f51292a |= 2;
        dVar2.f51294c = elapsedRealtimeNanos;
        list.add((C17902d) cVar.build());
    }

    /* renamed from: e */
    public final void mo95976e() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298789l.mo56113h()) {
            ((C107353d) this.f298789l.mo56107c()).mo95967a();
            this.f298789l = C58836b.f156633a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95977f() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f298785h
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.h r1 = r6.f298781d     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.f298773b     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.assistant.d.c.c.am r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am.f51242f     // Catch:{ all -> 0x0075 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.assistant.d.c.c.al r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al) r2     // Catch:{ all -> 0x0075 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0075 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.assistant.d.c.c.am r3 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am) r3     // Catch:{ all -> 0x0075 }
            r4 = 5
            r3.f51245b = r4     // Catch:{ all -> 0x0075 }
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0075 }
            r3.f51246c = r5     // Catch:{ all -> 0x0075 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0075 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.assistant.d.c.c.am r3 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am) r3     // Catch:{ all -> 0x0075 }
            r1.getClass()     // Catch:{ all -> 0x0075 }
            int r5 = r3.f51244a     // Catch:{ all -> 0x0075 }
            r5 = r5 | r4
            r3.f51244a = r5     // Catch:{ all -> 0x0075 }
            r3.f51247d = r1     // Catch:{ all -> 0x0075 }
            com.google.protobuf.bv r1 = r2.build()     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.assistant.d.c.c.am r1 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am) r1     // Catch:{ all -> 0x0075 }
            r6.mo95978g(r1)     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.h r1 = r6.f298781d     // Catch:{ all -> 0x0075 }
            r1.getClass()
            java.lang.String r1 = r1.f298773b     // Catch:{ all -> 0x0075 }
            com.google.common.b.gu r2 = com.google.android.apps.gsa.assistant.shared.be.b     // Catch:{ all -> 0x0075 }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x004e
            r6.mo95972a()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.h r1 = r6.f298781d     // Catch:{ all -> 0x0075 }
            r1.getClass()
            r1.f298775d = r4     // Catch:{ all -> 0x0075 }
            r1 = 0
            r6.f298781d = r1     // Catch:{ all -> 0x0075 }
            r6.f298783f = r1     // Catch:{ all -> 0x0075 }
            com.google.common.base.ax r1 = r6.f298788k     // Catch:{ all -> 0x0075 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0071
            com.google.common.base.ax r1 = r6.f298788k     // Catch:{ all -> 0x0075 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.staticplugins.opa.appintegration.service.d r1 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107353d) r1     // Catch:{ all -> 0x0075 }
            r1.mo95967a()     // Catch:{ all -> 0x0075 }
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0075 }
            r6.f298788k = r1     // Catch:{ all -> 0x0075 }
        L_0x0071:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.C107359j.mo95977f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo95978g(C17883am amVar) {
        this.f298784g.add(amVar.toByteArray());
        if (this.f298790m == null) {
            Intent intent = new Intent().setAction("com.google.android.apps.gsa.publicsearch.IPublicSearchService").setPackage("com.google.android.googlequicksearchbox");
            this.f298790m = new C107358i(this);
            if (!this.f298797t.getApplicationContext().bindService(intent, this.f298790m, 1)) {
                C59104x d = f298778a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d).mo56372aa(23740)).mo56386p("Failed to connect PSS");
                this.f298790m = null;
            }
        }
    }
}
