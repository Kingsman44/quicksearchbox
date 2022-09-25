package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.b.b */
/* compiled from: PG */
public final class C33731b {

    /* renamed from: a */
    public static final Duration f90088a = Duration.ofSeconds(6);

    /* renamed from: b */
    public static final C58974d f90089b = C58974d.m91136j();

    /* renamed from: c */
    public final Set f90090c = new HashSet();

    /* renamed from: d */
    public C60870cx f90091d = C60856cj.m92898g();

    /* renamed from: e */
    private final ScheduledExecutorService f90092e;

    /* renamed from: f */
    private final int f90093f;

    public C33731b(ScheduledExecutorService scheduledExecutorService, int i) {
        this.f90092e = scheduledExecutorService;
        this.f90093f = i;
    }

    /* renamed from: e */
    private static C60870cx m62331e(C60870cx cxVar, Duration duration, ScheduledExecutorService scheduledExecutorService) {
        return C60856cj.m92908q(cxVar, duration.toMillis(), TimeUnit.MILLISECONDS, scheduledExecutorService);
    }

    /* renamed from: a */
    public final C60870cx mo39049a() {
        return this.f90093f == 2 ? m62331e(C60856cj.m92901j(this.f90091d), f90088a, this.f90092e) : this.f90091d;
    }

    /* renamed from: b */
    public final void mo39050b() {
        this.f90091d = C60856cj.m92898g();
        for (C2164c c : this.f90090c) {
            c.mo5438c();
        }
        this.f90090c.clear();
    }

    /* renamed from: c */
    public final void mo39051c(Object obj) {
        this.f90091d = C60856cj.m92900i(obj);
        for (C2164c b : this.f90090c) {
            b.mo5437b(obj);
        }
        this.f90090c.clear();
    }

    /* renamed from: d */
    public final void mo39052d() {
        C60870cx a = C2169h.m6027a(new C33730a(this));
        if (this.f90093f == 1) {
            this.f90091d = m62331e(a, f90088a, this.f90092e);
        } else {
            this.f90091d = a;
        }
    }
}
