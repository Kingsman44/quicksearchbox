package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120518a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120609d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120581e;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.q */
/* compiled from: PG */
public final class C120801q extends C68247h {

    /* renamed from: a */
    private final C68283d f335945a;

    /* renamed from: c */
    private final C68283d f335946c;

    /* renamed from: d */
    private final C68283d f335947d;

    /* renamed from: e */
    private final C68283d f335948e;

    /* renamed from: f */
    private final C68283d f335949f;

    public C120801q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C120801q.class), aVar);
        this.f335945a = C68236af.m98549d(dVar);
        this.f335946c = C68236af.m98549d(dVar2);
        this.f335947d = C68236af.m98549d(dVar3);
        this.f335948e = C68236af.m98549d(dVar4);
        this.f335949f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Void voidR = (Void) list.get(1);
        Optional optional = (Optional) list.get(2);
        Optional optional2 = (Optional) list.get(3);
        ((C120581e) list.get(4)).mo104852a("Prefetch finalization signal received");
        C60870cx b = ((C120609d) list.get(0)).mo104699b();
        if (optional.isPresent()) {
            return ((C120782c) optional.get()).mo104927c(b, true);
        }
        return optional2.isPresent() ? ((C120518a) optional2.get()).mo104801b(b) : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335945a.mo60297gq(), this.f335946c.mo60297gq(), this.f335947d.mo60297gq(), this.f335948e.mo60297gq(), this.f335949f.mo60297gq());
    }
}
