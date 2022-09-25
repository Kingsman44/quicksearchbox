package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a.C17333a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.m */
/* compiled from: PG */
public final class C17461m implements C57974a {

    /* renamed from: a */
    public final AtomicBoolean f50420a = new AtomicBoolean(false);

    /* renamed from: b */
    final /* synthetic */ C17462n f50421b;

    public C17461m(C17462n nVar) {
        this.f50421b = nVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C17496be beVar = (C17496be) obj;
        C58976aa aaVar = C58975e.f156826a;
        beVar.f50508b.mo59031d();
        this.f50421b.f50423b.execute(C47810es.m84977q(new C17460l(this, beVar)));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C17462n nVar = this.f50421b;
        Executor executor = nVar.f50423b;
        C17333a aVar = nVar.f50427f;
        Objects.requireNonNull(aVar);
        executor.execute(C47810es.m84977q(new C17459k(aVar)));
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x d = C17462n.f50422a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42753)).mo56386p("TtsAudioChunk sink #onFailure.");
        C17462n nVar = this.f50421b;
        Executor executor = nVar.f50423b;
        C17333a aVar = nVar.f50427f;
        Objects.requireNonNull(aVar);
        executor.execute(C47810es.m84977q(new C17459k(aVar)));
    }
}
