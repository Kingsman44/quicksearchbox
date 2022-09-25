package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p837d.C12758a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12879a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12886h;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.v */
/* compiled from: PG */
public final class C12855v implements C57974a {

    /* renamed from: a */
    public static final C59071e f40100a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.v");

    /* renamed from: b */
    public final Executor f40101b;

    /* renamed from: c */
    public final C12844k f40102c;

    /* renamed from: d */
    public final C12858y f40103d;

    /* renamed from: e */
    public final C60870cx f40104e;

    /* renamed from: f */
    public final C58833ax f40105f;

    /* renamed from: g */
    public final C15481g f40106g;

    /* renamed from: h */
    public C2164c f40107h;

    /* renamed from: i */
    public C60870cx f40108i = C60856cj.m92900i(C12867k.f40128d);

    /* renamed from: j */
    public boolean f40109j = false;

    /* renamed from: k */
    public boolean f40110k = true;

    public C12855v(C12758a aVar, C58833ax axVar, Executor executor, C12845l lVar, C12858y yVar, C15481g gVar) {
        this.f40101b = new C60904dr(executor);
        aVar.getClass();
        Executor executor2 = (Executor) lVar.f40085a.mo17428b();
        executor2.getClass();
        C21370a aVar2 = (C21370a) lVar.f40086b.mo17428b();
        aVar2.getClass();
        this.f40102c = new C12844k(aVar, executor2, aVar2);
        this.f40103d = yVar;
        this.f40105f = axVar;
        this.f40106g = gVar;
        this.f40104e = C2169h.m6027a(new C12851r(this));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        C12852s sVar = new C12852s(this, (C12182h) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(sVar), this.f40101b), "Error on next ConversationDeltaStreamChunk", new Object[0]);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f40105f.mo56113h()) {
            C46459k.m82829b(((C12886h) this.f40105f.mo56107c()).mo20836a(C12879a.f40136a), "Failed to clear ConversationParams", new Object[0]);
        }
    }

    /* renamed from: e */
    public final C60870cx mo20815e() {
        C58976aa aaVar = C58975e.f156826a;
        C12853t tVar = new C12853t(this);
        return C60856cj.m92903l(C47810es.m84977q(tVar), this.f40101b);
    }

    /* renamed from: f */
    public final void mo20816f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f40102c.f40081e;
        C47638k.m84750a(copyOnWriteArrayList).mo51520a(new C12847n(this, copyOnWriteArrayList), this.f40101b);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            C46459k.m82829b(mo20815e(), "#onEnd, cancellation failed", new Object[0]);
            return;
        }
        C12846m mVar = new C12846m(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(mVar), this.f40101b), "Error setting DeltaHandlingResultFuture", new Object[0]);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x d = f40100a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvDeltaStreamSink");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44526)).mo56386p("Failure streaming conversation delta stream chunk.");
        C12850q qVar = new C12850q(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(qVar), this.f40101b), "#onFailure, failure in failing deltaHandlingResultFuture.", new Object[0]);
    }
}
