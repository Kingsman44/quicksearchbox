package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1206c;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C15927c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15932h f47283a;

    /* renamed from: b */
    public final /* synthetic */ C15938h f47284b;

    public /* synthetic */ C15927c(C15932h hVar, C15938h hVar2) {
        this.f47283a = hVar;
        this.f47284b = hVar2;
    }

    public final Object call() {
        C15932h hVar = this.f47283a;
        C15938h hVar2 = this.f47284b;
        if (hVar.f47298i != null) {
            C59104x b = C15932h.f47290a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SuggestionRateLimiter");
            ((C59052c) ((C59052c) b).mo56372aa(46504)).mo56386p("Another task in queue. Ignore this request.");
            return null;
        }
        long epochMilli = hVar.f47294e.mo57444a().toEpochMilli();
        long j = hVar.f47297h.get();
        Duration duration = hVar.f47292c;
        C58838bb.m90868c(j <= epochMilli);
        long j2 = 0;
        if (j != 0) {
            j2 = Math.max(duration.minusMillis(epochMilli - j).toMillis(), 0);
        }
        hVar.f47296g.set(epochMilli + j2);
        C60870cx k = C60856cj.m92902k(C47810es.m84965e(new C15925a(hVar, hVar2)), j2, TimeUnit.MILLISECONDS, hVar.f47293d);
        C46459k.m82829b(hVar.mo22618d(k), "Failed to set tasks.", new Object[0]);
        C60856cj.m92911t(k, C47810es.m84974n(new C15931g(hVar)), hVar.f47295f);
        return null;
    }
}
