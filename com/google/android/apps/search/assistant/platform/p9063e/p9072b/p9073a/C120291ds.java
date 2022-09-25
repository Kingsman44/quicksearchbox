package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9070c.p9071a.C120178c;
import com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9070c.p9071a.C120179d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ds */
/* compiled from: PG */
public final class C120291ds extends C68247h {

    /* renamed from: a */
    private final C68283d f334685a;

    /* renamed from: c */
    private final C68283d f334686c;

    public C120291ds(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C120291ds.class), aVar);
        this.f334685a = C68236af.m98549d(dVar);
        this.f334686c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C120179d dVar = (C120179d) obj;
        C60870cx gq = this.f334686c.mo60297gq();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dVar.f334468a.mo17428b();
        scheduledExecutorService.getClass();
        gq.getClass();
        Boolean bool = (Boolean) dVar.f334469b.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Long l = (Long) dVar.f334470c.mo17428b();
        l.getClass();
        return C60856cj.m92900i(new C120178c(scheduledExecutorService, gq, booleanValue, l.longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f334685a.mo60297gq();
    }
}
