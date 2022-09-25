package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1424e.p1425a;

import com.google.android.libraries.search.p2992d.C38296g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.e.a.c */
/* compiled from: PG */
public final class C17415c extends C68247h {

    /* renamed from: a */
    private final C68283d f50313a;

    /* renamed from: c */
    private final C68283d f50314c;

    /* renamed from: d */
    private final C68283d f50315d;

    /* renamed from: e */
    private final C68283d f50316e;

    public C17415c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C17415c.class), aVar);
        this.f50313a = C68236af.m98549d(dVar);
        this.f50314c = C68236af.m98549d(dVar2);
        this.f50315d = C68236af.m98549d(dVar3);
        this.f50316e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        long longValue = ((Long) list.get(1)).longValue();
        C58976aa aaVar = C58975e.f156826a;
        return C47633f.m84733g(((C38296g) list.get(0)).mo41362a(new C58759qy((String) list.get(2)), false)).mo51517j(longValue, TimeUnit.MILLISECONDS, (ScheduledExecutorService) list.get(3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50313a.mo60297gq(), this.f50314c.mo60297gq(), this.f50315d.mo60297gq(), this.f50316e.mo60297gq());
    }
}
