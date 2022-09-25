package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54303ag;
import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.i */
/* compiled from: PG */
public final class C140680i extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140690s f382082a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382083b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382084c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140680i(C140690s sVar, C60870cx cxVar, C60870cx cxVar2) {
        super(1);
        this.f382082a = sVar;
        this.f382083b = cxVar;
        this.f382084c = cxVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C54303ag agVar = (C54303ag) obj;
        C60870cx f = this.f382082a.f382098c.mo50346f((MessageLite) C60856cj.m92909r(this.f382083b), this.f382084c);
        C69664n.m101060f(f, "discoverFeedCache.put(Fu…st), discoverFeedsFuture)");
        return f;
    }
}
