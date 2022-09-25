package com.google.android.libraries.search.assistant.invocation.p2655o.p2665g.p2666a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34373s;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.g.a.u */
/* compiled from: PG */
public final class C34352u implements C34421k {

    /* renamed from: a */
    public static final C59071e f91323a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f91324b;

    /* renamed from: c */
    public final C34336e f91325c;

    /* renamed from: d */
    public final C34337f f91326d;

    /* renamed from: e */
    public final C34373s f91327e;

    public C34352u(Optional optional, C34373s sVar, C71422aw awVar) {
        C34337f fVar;
        C69664n.m101061g(optional, "definedAllowance");
        C69664n.m101061g(sVar, "triggeringConnectionsAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91327e = sVar;
        this.f91324b = awVar;
        Object orElse = optional.orElse(C34333b.f91298a);
        C34336e eVar = (C34336e) orElse;
        C59052c cVar = (C59052c) f91323a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.Check.SameClient");
        String a = eVar.mo39317a();
        cVar.mo56379ah(new C59094n(51347));
        cVar.mo56389s("Using '%s' policy for same client allowance check.", a);
        C69664n.m101060f(orElse, "definedAllowance.orElse(…e check.\", it.name)\n    }");
        this.f91325c = eVar;
        if (C69664n.m101066l(eVar, C34333b.f91298a)) {
            fVar = C34338g.f91301a;
        } else if (C69664n.m101066l(eVar, C34334c.f91299a)) {
            fVar = C34339h.f91302a;
        } else if (C69664n.m101066l(eVar, C34335d.f91300a)) {
            fVar = C34340i.f91303a;
        } else {
            throw new C69677g();
        }
        this.f91326d = fVar;
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f91324b, (C71424ay) null, new C34351t(this, (C69577g) null), 3);
    }
}
