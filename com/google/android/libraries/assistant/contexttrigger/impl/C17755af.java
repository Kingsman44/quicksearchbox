package com.google.android.libraries.assistant.contexttrigger.impl;

import android.content.Context;
import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17707am;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.location.C38697c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4189b.C55892i;
import com.google.p4184bj.p4189b.C55893j;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.af */
/* compiled from: PG */
public final class C17755af implements C17784j {

    /* renamed from: a */
    public static final C59071e f50990a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.impl.af");

    /* renamed from: b */
    public final C21370a f50991b;

    /* renamed from: c */
    public final ScheduledExecutorService f50992c;

    /* renamed from: d */
    public final C38697c f50993d;

    /* renamed from: e */
    public final C17707am f50994e;

    /* renamed from: f */
    public final Context f50995f;

    /* renamed from: g */
    public final C17658d f50996g;

    /* renamed from: h */
    private final AccountId f50997h;

    /* renamed from: i */
    private final C46128f f50998i;

    public C17755af(AccountId accountId, C46128f fVar, C21370a aVar, ScheduledExecutorService scheduledExecutorService, C38697c cVar, C17707am amVar, C17658d dVar, Context context) {
        this.f50997h = accountId;
        this.f50998i = fVar;
        this.f50991b = aVar;
        this.f50992c = scheduledExecutorService;
        this.f50993d = cVar;
        this.f50994e = amVar;
        this.f50996g = dVar;
        this.f50995f = context;
    }

    /* renamed from: d */
    public static boolean m35018d(C55893j jVar) {
        int a;
        int i = jVar.f148731b;
        int a2 = C55892i.m87799a(i);
        if (a2 != 0 && a2 == 6) {
            return true;
        }
        int a3 = C55892i.m87799a(i);
        if ((a3 == 0 || a3 != 2) && ((a = C55892i.m87799a(i)) == 0 || a != 3)) {
            return false;
        }
        for (C55893j d : jVar.f148732c) {
            if (m35018d(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private final C60870cx m35019e(C48919u uVar) {
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        if (a == C48900b.UNSPECIFIED) {
            return C60856cj.m92899h(new IllegalArgumentException("Client id is not set."));
        }
        if (uVar.f126591d.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("Trigger id is not set."));
        }
        int i = uVar.f126588a;
        if ((i & 8) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Attribution id is not set."));
        }
        if ((i & 2) != 0) {
            return C60856cj.m92900i(uVar);
        }
        C60870cx b = this.f50998i.mo50215b(this.f50997h);
        C17750aa aaVar = new C17750aa(uVar);
        return C60922j.m93044g(b, C47810es.m84963c(aaVar), this.f50992c);
    }

    /* renamed from: a */
    public final C60870cx mo23442a(C48915q qVar) {
        C31520m c = C31167ax.m58112a().mo36912c();
        C48919u uVar = qVar.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        return C47633f.m84733g(m35019e(uVar)).mo51516i(new C17751ab(this, c, qVar), this.f50992c);
    }

    /* renamed from: b */
    public final C60870cx mo23443b(C48917s sVar) {
        C31520m c = C31167ax.m58112a().mo36912c();
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        return C47633f.m84733g(m35019e(uVar)).mo51516i(new C17776s(this, sVar, c), this.f50992c).mo51514f(IllegalArgumentException.class, C17778u.f51042a, this.f50992c).mo51514f(C143842n.class, C17779v.f51043a, this.f50992c);
    }

    /* renamed from: c */
    public final C60870cx mo23458c(C48919u uVar) {
        C60870cx a = this.f50998i.mo50214a(this.f50997h);
        C17782y yVar = new C17782y(uVar);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(yVar), this.f50992c);
        C17783z zVar = C17783z.f51047a;
        return C60846c.m92878g(g, IllegalArgumentException.class, C47810es.m84963c(zVar), this.f50992c);
    }
}
