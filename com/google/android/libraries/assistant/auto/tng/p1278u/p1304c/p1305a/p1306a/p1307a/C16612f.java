package com.google.android.libraries.assistant.auto.tng.p1278u.p1304c.p1305a.p1306a.p1307a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.c.a.a.a.f */
/* compiled from: PG */
public final class C16612f extends C68247h {

    /* renamed from: a */
    private final C68283d f48692a;

    /* renamed from: c */
    private final C68283d f48693c;

    public C16612f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16612f.class), aVar);
        this.f48692a = C68236af.m98549d(dVar);
        this.f48693c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        return C60856cj.m92908q(this.f48692a.mo60297gq(), 5000, TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48693c.mo60297gq();
    }
}
