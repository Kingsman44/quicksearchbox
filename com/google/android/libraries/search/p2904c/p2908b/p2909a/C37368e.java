package com.google.android.libraries.search.p2904c.p2908b.p2909a;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37373b;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.C37395s;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2942m.p2946d.C37883a;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.c.b.a.e */
/* compiled from: PG */
public final class C37368e implements C37395s {

    /* renamed from: a */
    public static final C59071e f99246a = C59071e.m91332i("com.google.android.libraries.search.c.b.a.e");

    /* renamed from: b */
    public final C37369f f99247b;

    /* renamed from: c */
    public final Executor f99248c;

    /* renamed from: d */
    public final C37966b f99249d;

    /* renamed from: e */
    public final C60836bq f99250e;

    /* renamed from: f */
    private final C37895i f99251f;

    /* renamed from: g */
    private final C37883a f99252g;

    public C37368e(C37369f fVar, C37895i iVar, C60836bq bqVar, Executor executor, C37966b bVar, C37883a aVar) {
        this.f99247b = fVar;
        this.f99251f = iVar;
        this.f99250e = bqVar;
        this.f99248c = executor;
        this.f99249d = bVar;
        this.f99252g = aVar;
    }

    /* renamed from: a */
    public final void mo40903a(C37384h hVar, long j) {
        C59104x b = f99246a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AdapterStore");
        ((C59052c) ((C59052c) b).mo56372aa(52648)).mo56389s("#audio# schedule adapter(%s) timeout", hVar.name());
        this.f99252g.mo41123b(C37373b.m66392d(hVar), Duration.ofMillis(j), new C37365b(this, hVar));
    }

    /* renamed from: b */
    public final void mo40904b(C37384h hVar, C37363a aVar) {
        C59104x b = f99246a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AdapterStore");
        ((C59052c) ((C59052c) b).mo56372aa(52646)).mo56389s("#audio# registerAudioAdapter (%s)", hVar.name());
        this.f99252g.mo41122a(C37373b.m66392d(hVar));
        this.f99250e.mo57304a(C47810es.m84978r(new C37364a(this, hVar, aVar)), this.f99248c);
    }

    /* renamed from: c */
    public final void mo40905c(C37384h hVar) {
        C59104x b = f99246a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AdapterStore");
        ((C59052c) ((C59052c) b).mo56372aa(52647)).mo56389s("#audio# unregisterAudioAdapter (%s)", hVar.name());
        this.f99252g.mo41122a(C37373b.m66392d(hVar));
        this.f99250e.mo57304a(C47810es.m84978r(new C37367d(this, hVar)), this.f99248c);
    }

    /* renamed from: d */
    public final boolean mo40906d(C37384h hVar, boolean z) {
        List d = this.f99247b.mo40910d(hVar);
        if (!this.f99247b.mo40913g(hVar)) {
            return false;
        }
        this.f99251f.mo41116q(hVar, d, z);
        return true;
    }
}
