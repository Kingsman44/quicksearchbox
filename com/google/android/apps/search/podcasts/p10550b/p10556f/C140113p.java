package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C140003p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.b.f.p */
/* compiled from: PG */
public final /* synthetic */ class C140113p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380751a;

    public /* synthetic */ C140113p(C140097al alVar) {
        this.f380751a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380751a;
        C140003p pVar = (C140003p) obj;
        if (pVar.f380525a.isEmpty()) {
            if (!pVar.f380526b.isEmpty()) {
                if (!alVar.f380729i.isNegative() && !alVar.f380729i.isZero()) {
                    Duration duration = alVar.f380730j;
                    if (duration == null || duration.plus(alVar.f380729i).minusMillis(alVar.f380728h.mo26874f()).isNegative()) {
                        alVar.f380730j = Duration.ofMillis(alVar.f380728h.mo26874f());
                    } else {
                        C59104x d = C140097al.f380721a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "QueueManager");
                        ((C59052c) ((C59052c) d).mo56372aa(41571)).mo56386p("Throttling sync because multiple feed updates were triggered.");
                    }
                }
            }
            return C60866ct.f164955a;
        }
        return alVar.mo115464g(new C140100c(alVar, pVar));
    }
}
