package com.google.android.libraries.search.assistant.p2786t.p2787a;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36408b;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36417k;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36419m;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36499c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36501e;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70882u;

/* renamed from: com.google.android.libraries.search.assistant.t.a.q */
/* compiled from: PG */
public final class C36466q implements C36456g {

    /* renamed from: a */
    public final C36417k f95204a;

    /* renamed from: b */
    public final Executor f95205b;

    /* renamed from: c */
    private final Context f95206c;

    /* renamed from: d */
    private final C36501e f95207d;

    public C36466q(Context context, C36417k kVar, C36501e eVar, Executor executor) {
        this.f95206c = context;
        this.f95204a = kVar;
        this.f95207d = eVar;
        this.f95205b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40169a(C36451b bVar) {
        C47558bi a = C47831fm.m85006a("NotificationAccessor.getNotifications");
        try {
            C47633f fVar = (C47633f) this.f95207d.mo40204a(C36499c.GET_ACTIVE_NOTIFICATIONS, new C36462m(this, bVar));
            a.mo51417a(fVar);
            a.close();
            return fVar;
        } catch (Throwable th) {
            C36457h.m65008a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo40170b(C36453d dVar) {
        C47558bi a = C47831fm.m85006a("NotificationAccessor.markAsRead");
        try {
            C47633f fVar = (C47633f) this.f95207d.mo40204a(C36499c.MARK_MESSAGE_NOTIFICATION_AS_READ, new C36458i(this, dVar));
            a.mo51417a(fVar);
            a.close();
            return fVar;
        } catch (Throwable th) {
            C36457h.m65008a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final C60870cx mo40171c(C36455f fVar) {
        C47558bi a = C47831fm.m85006a("NotificationAccessor.reply");
        try {
            C47633f fVar2 = (C47633f) this.f95207d.mo40204a(C36499c.REPLY_TO_MESSAGE_NOTIFICATION, new C36460k(this, fVar));
            a.mo51417a(fVar2);
            a.close();
            return fVar2;
        } catch (Throwable th) {
            C36457h.m65008a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C47633f mo40172d() {
        if (!C36619a.m65149e(this.f95206c)) {
            return C47633f.m84733g(C60856cj.m92899h(new IllegalStateException("Notification access not granted.")));
        }
        return C47633f.m84733g(C60866ct.f164955a);
    }

    /* renamed from: e */
    public final C60870cx mo40173e(C36408b bVar) {
        AtomicReference atomicReference = new AtomicReference();
        C36417k kVar = (C36417k) this.f95204a.mo62576o(new C70882u(new AtomicReference(), atomicReference));
        C60870cx a = C70876o.m103760a(kVar.f189039a.mo39510a(C36419m.m64984a(), kVar.f189040b), bVar);
        C36461l lVar = new C36461l(this, atomicReference);
        return C60922j.m93045h(a, C47810es.m84966f(lVar), this.f95205b);
    }
}
