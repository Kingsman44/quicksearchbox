package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.C130477a;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130586e;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9914b.C130602a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.d.p */
/* compiled from: PG */
public final class C130515p implements C130477a {

    /* renamed from: a */
    public final Set f357530a;

    /* renamed from: b */
    public final C130586e f357531b;

    /* renamed from: c */
    public final C130508i f357532c;

    /* renamed from: d */
    public final C58974d f357533d;

    /* renamed from: e */
    private final C71422aw f357534e;

    public C130515p(C71422aw awVar, Set set, C130586e eVar, C130508i iVar, C130603a aVar) {
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(iVar, "statusTracker");
        C69664n.m101061g(aVar, "loggerFactory");
        this.f357534e = awVar;
        this.f357530a = set;
        this.f357531b = eVar;
        this.f357532c = iVar;
        this.f357533d = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final C60870cx mo109707a(C106596h hVar, C53715bm bmVar) {
        if (hVar == null || bmVar == null) {
            ((C58970a) this.f357533d.mo56225c()).mo56386p("UserContext or TriggeringEvent is null.");
            return C60856cj.m92899h(new IllegalArgumentException("UserContext or TriggeringEvent is null."));
        } else if (bmVar.f141023a == 4) {
            C130508i iVar = this.f357532c;
            C106532f fVar = (C106532f) bmVar.f141024b;
            C69664n.m101060f(fVar, "triggeringEvent.headsetState");
            if (iVar.mo109714a(C130602a.m212960b(fVar))) {
                ((C58970a) this.f357533d.mo56226d()).mo56386p("Headphone connection event already handled.");
                return C60866ct.f164955a;
            }
            C130508i iVar2 = this.f357532c;
            Instant a = iVar2.f357506b.mo57444a();
            C69664n.m101060f(a, "timeSource.now()");
            if (a == ((Instant) DesugarAtomicReference.accumulateAndGet(iVar2.f357508d, a, C130506g.f357503a))) {
                return C71663i.m104692e(this.f357534e, (C71424ay) null, new C130514o(this, bmVar, hVar, (C69577g) null), 3);
            }
            ((C58970a) this.f357533d.mo56226d()).mo56386p("Exceeded rate limit.");
            return C60866ct.f164955a;
        } else {
            ((C58970a) this.f357533d.mo56226d()).mo56386p("Triggering event does not contain a headphone connection.");
            return C60866ct.f164955a;
        }
    }
}
