package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10010d;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17684y;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.d.f */
/* compiled from: PG */
public final class C131719f implements C17737g {

    /* renamed from: a */
    public final C131101a f359845a;

    /* renamed from: b */
    public final C17684y f359846b;

    /* renamed from: c */
    public final C58974d f359847c;

    /* renamed from: d */
    private final C71422aw f359848d;

    public C131719f(C131101a aVar, C17684y yVar, C71422aw awVar, C130603a aVar2) {
        C69664n.m101061g(aVar, "orchestrator");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar2, "aaFileFluentLoggerFactory");
        this.f359845a = aVar;
        this.f359846b = yVar;
        this.f359848d = awVar;
        this.f359847c = aVar2.mo109740b(this);
    }

    /* renamed from: a */
    public final void mo23454a(C48923y yVar) {
        if (yVar == null) {
            ((C58970a) this.f359847c.mo56225c()).mo56386p("contextTriggerResult is null.");
            return;
        }
        C48919u uVar = yVar.f126603b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        if (!C69664n.m101066l(uVar.f126591d, "AmbientHeadsetTriggerId")) {
            C58970a aVar = (C58970a) this.f359847c.mo56225c();
            C48919u uVar2 = yVar.f126603b;
            if (uVar2 == null) {
                uVar2 = C48919u.f126586g;
            }
            aVar.mo56389s("contextTrigger triggerId is invalid: %s", uVar2.f126591d);
            return;
        }
        C48922x a = C48922x.m85306a(yVar.f126605d);
        if (a == null) {
            a = C48922x.UNKNOWN;
        }
        a.name();
        C71803m.m105043d(this.f359848d, (C69585o) null, (C71424ay) null, new C131718e(this, (C69577g) null), 3);
    }
}
