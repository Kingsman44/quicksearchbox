package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.apps.tiktok.cache.C46407v;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.aq */
/* compiled from: PG */
public final class C134128aq {

    /* renamed from: a */
    public final C46407v f365375a;

    /* renamed from: b */
    public final C21232ab f365376b;

    /* renamed from: c */
    public final boolean f365377c;

    /* renamed from: d */
    public final C71422aw f365378d;

    /* renamed from: e */
    private final C69585o f365379e;

    public C134128aq(C46407v vVar, C21232ab abVar, boolean z, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(vVar, "cache");
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f365375a = vVar;
        this.f365376b = abVar;
        this.f365377c = z;
        this.f365378d = awVar;
        this.f365379e = oVar;
    }

    /* renamed from: a */
    public final Object mo111576a(C134150bl blVar, C134144bf bfVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f365379e, new C134126ao(this, blVar, bfVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
