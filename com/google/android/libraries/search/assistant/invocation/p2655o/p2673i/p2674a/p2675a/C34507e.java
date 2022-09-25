package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121035d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34494a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.C34638a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.e */
/* compiled from: PG */
public final class C34507e {

    /* renamed from: a */
    public static final C59071e f91703a = C59071e.m91331h();

    /* renamed from: b */
    public final C81428d f91704b;

    /* renamed from: c */
    public final C34494a f91705c;

    /* renamed from: d */
    public final C34517o f91706d;

    /* renamed from: e */
    public final C121035d f91707e;

    /* renamed from: f */
    public final C87573b f91708f;

    /* renamed from: g */
    public final C71422aw f91709g;

    /* renamed from: h */
    public final C69585o f91710h;

    /* renamed from: i */
    public final boolean f91711i;

    /* renamed from: j */
    public final C34638a f91712j;

    public C34507e(C81428d dVar, C34494a aVar, C34517o oVar, C34638a aVar2, C121035d dVar2, C87573b bVar, C71422aw awVar, C69585o oVar2, boolean z) {
        C69664n.m101061g(dVar, "entrypoint");
        C69664n.m101061g(aVar2, "hotwordUriCloser");
        C69664n.m101061g(bVar, "voiceInteractionSessionStarter");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar2, "backgroundContext");
        this.f91704b = dVar;
        this.f91705c = aVar;
        this.f91706d = oVar;
        this.f91712j = aVar2;
        this.f91707e = dVar2;
        this.f91708f = bVar;
        this.f91709g = awVar;
        this.f91710h = oVar2;
        this.f91711i = z;
    }

    /* renamed from: a */
    public final Object mo39379a(C34638a aVar, Uri uri, C69577g gVar) {
        Object a = C71803m.m105040a(this.f91710h, new C34456a(aVar, uri, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
