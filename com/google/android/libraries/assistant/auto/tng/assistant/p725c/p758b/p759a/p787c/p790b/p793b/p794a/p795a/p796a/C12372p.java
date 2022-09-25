package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a.p796a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p764b.p765a.p766a.C12189a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p764b.p765a.p766a.C12190b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
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
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.a.p */
/* compiled from: PG */
public final class C12372p extends C68247h {

    /* renamed from: a */
    private final C68283d f39194a;

    /* renamed from: c */
    private final C68283d f39195c;

    /* renamed from: d */
    private final C68283d f39196d;

    /* renamed from: e */
    private final C68283d f39197e;

    public C12372p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12372p.class), aVar);
        this.f39194a = C68236af.m98549d(dVar);
        this.f39195c = C68236af.m98549d(dVar2);
        this.f39196d = C68236af.m98549d(dVar3);
        this.f39197e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39194a;
        C12991i iVar = (C12991i) list.get(0);
        Optional optional = (Optional) list.get(1);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        long j = 5000;
        if (optional.isPresent()) {
            j = ((Long) C12190b.m28112a(((C12189a) optional.get()).f38898a, iVar).mo56109e(5000L)).longValue();
        }
        return C60856cj.m92908q(dVar.mo60297gq(), j, TimeUnit.MILLISECONDS, scheduledExecutorService);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39195c.mo60297gq(), this.f39196d.mo60297gq(), this.f39197e.mo60297gq());
    }
}
