package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1206c;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15935e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.h */
/* compiled from: PG */
public final class C15932h implements C15935e {

    /* renamed from: a */
    public static final C59071e f47290a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.h");

    /* renamed from: b */
    public final C15933d f47291b;

    /* renamed from: c */
    public final Duration f47292c;

    /* renamed from: d */
    public final C60888db f47293d;

    /* renamed from: e */
    public final C60950i f47294e;

    /* renamed from: f */
    public final Executor f47295f;

    /* renamed from: g */
    public final AtomicLong f47296g = new AtomicLong();

    /* renamed from: h */
    final AtomicLong f47297h = new AtomicLong();

    /* renamed from: i */
    C60870cx f47298i;

    public C15932h(C60950i iVar, C60888db dbVar, Duration duration, C15933d dVar) {
        this.f47294e = iVar;
        this.f47291b = dVar;
        this.f47292c = duration;
        this.f47293d = dbVar;
        this.f47298i = null;
        this.f47295f = new C60904dr(dbVar);
    }

    /* renamed from: a */
    public final C15924c mo22612a() {
        return this.f47291b.mo22612a();
    }

    /* renamed from: b */
    public final C60870cx mo22613b(C15938h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        hVar.mo22605a();
        if (hVar.mo22605a() == C15937g.IMMEDIATE_ONEOFF_SUGGESTION_GENERATION || hVar.mo22605a() == C15937g.IMMEDIATE_EMPTY_SUGGESTION_GENERATION) {
            C15926b bVar = new C15926b(this, hVar);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(bVar), this.f47295f);
            C15930f fVar = new C15930f(this);
            C60856cj.m92911t(n, C47810es.m84974n(fVar), this.f47295f);
            return n;
        }
        C15927c cVar = new C15927c(this, hVar);
        return C60856cj.m92904m(C47810es.m84978r(cVar), this.f47295f);
    }

    /* renamed from: c */
    public final long mo22617c() {
        return Math.max(this.f47296g.get() - this.f47294e.mo57444a().toEpochMilli(), 0);
    }

    /* renamed from: d */
    public final C60870cx mo22618d(C60870cx cxVar) {
        C15928d dVar = new C15928d(this, cxVar);
        return C60856cj.m92904m(C47810es.m84978r(dVar), this.f47295f);
    }
}
