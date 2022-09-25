package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2582d.C33470a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.x */
/* compiled from: PG */
public final class C120640x extends C68247h {

    /* renamed from: a */
    private final C68283d f335564a;

    /* renamed from: c */
    private final C68283d f335565c;

    /* renamed from: d */
    private final C68283d f335566d;

    /* renamed from: e */
    private final C68283d f335567e;

    /* renamed from: f */
    private final C68283d f335568f;

    public C120640x(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C120640x.class), aVar);
        this.f335564a = C68236af.m98549d(dVar);
        this.f335565c = C68236af.m98549d(dVar2);
        this.f335566d = C68236af.m98549d(dVar3);
        this.f335567e = C68236af.m98549d(dVar4);
        this.f335568f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120616ab abVar = (C120616ab) list.get(0);
        C120811d dVar = (C120811d) list.get(1);
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        C71422aw awVar = (C71422aw) list.get(3);
        C33470a aVar = (C33470a) list.get(4);
        C69664n.m101061g(abVar, "runner");
        C69664n.m101061g(dVar, "request");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "prefetchDebugStateMonitor");
        return C71663i.m104692e(awVar, (C71424ay) null, new C120638v(aVar, booleanValue, abVar, dVar, (C69577g) null), 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335564a.mo60297gq(), this.f335565c.mo60297gq(), this.f335566d.mo60297gq(), this.f335567e.mo60297gq(), this.f335568f.mo60297gq());
    }
}
