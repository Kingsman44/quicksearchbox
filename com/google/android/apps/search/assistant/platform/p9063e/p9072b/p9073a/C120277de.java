package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4543n.p4546c.C59400h;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.de */
/* compiled from: PG */
public final class C120277de extends C68247h {

    /* renamed from: a */
    private final C68283d f334664a;

    /* renamed from: c */
    private final C68283d f334665c;

    /* renamed from: d */
    private final C68283d f334666d;

    /* renamed from: e */
    private final C68283d f334667e;

    public C120277de(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C120277de.class), aVar);
        this.f334664a = C68236af.m98549d(dVar);
        this.f334665c = C68236af.m98549d(dVar2);
        this.f334666d = C68236af.m98549d(dVar3);
        this.f334667e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        AtomicBoolean atomicBoolean = (AtomicBoolean) list.get(2);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        return C59417y.m92319e(C47810es.m84964d(new C120265cw((C120278df) list.get(0), atomicBoolean2)), new C59400h(3), new C120266cx(atomicBoolean, atomicBoolean2, (C120227bq) list.get(1)), (ScheduledExecutorService) list.get(3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334664a.mo60297gq(), this.f334665c.mo60297gq(), this.f334666d.mo60297gq(), this.f334667e.mo60297gq());
    }
}
