package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6213t.p6214a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.C78850a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80728dc;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.t.a.e */
/* compiled from: PG */
public final class C78823e implements C78728n {

    /* renamed from: c */
    public static final /* synthetic */ int f216940c = 0;

    /* renamed from: d */
    private static final Duration f216941d = Duration.ofSeconds(5);

    /* renamed from: e */
    private static final Duration f216942e = Duration.ofMillis(80);

    /* renamed from: a */
    public final C78850a f216943a;

    /* renamed from: b */
    public Instant f216944b;

    /* renamed from: f */
    private final C83363m f216945f = new C83363m();

    /* renamed from: g */
    private final C22871g f216946g;

    /* renamed from: h */
    private final C83358h f216947h;

    /* renamed from: i */
    private final C60950i f216948i;

    /* renamed from: j */
    private C60870cx f216949j = C60856cj.m92898g();

    /* renamed from: k */
    private C60870cx f216950k = C60856cj.m92898g();

    public C78823e(C22871g gVar, C83358h hVar, C83358h hVar2, C78850a aVar, C60950i iVar) {
        this.f216946g = gVar;
        this.f216947h = C83349aj.m132656k(hVar, hVar2, C78820b.f216935a);
        this.f216943a = aVar;
        this.f216948i = iVar;
        this.f216944b = iVar.mo57444a();
    }

    /* renamed from: c */
    private final void m126618c(C80728dc dcVar) {
        Instant a = this.f216948i.mo57444a();
        Instant instant = this.f216944b;
        Duration duration = f216942e;
        if (a.isAfter(instant.plus(duration))) {
            dcVar.mo74634b();
            this.f216943a.mo73658h(dcVar);
            this.f216944b = a;
            return;
        }
        if (!this.f216950k.isDone()) {
            this.f216950k.cancel(false);
        }
        duration.toMillis();
        this.f216950k = this.f216946g.mo28208h("[NGA] setGestureNavBarVisible with delay", duration.toMillis(), new C78821c(this, dcVar, a));
    }

    /* renamed from: a */
    public final void mo73627a() {
        this.f216949j.cancel(false);
        m126618c(C80728dc.f221616a);
    }

    /* renamed from: b */
    public final void mo73628b() {
        m126618c(C80728dc.f221617b);
        m126618c(C80728dc.f221617b);
        this.f216949j.cancel(false);
        this.f216949j = this.f216946g.mo28204d("[NGA] sendAndSchedule", f216941d.toMillis(), new C78819a(this));
    }

    /* renamed from: h */
    public final void mo73112h() {
        this.f216945f.mo76661a();
        mo73627a();
    }

    /* renamed from: i */
    public final void mo73113i() {
        this.f216945f.mo76663c(this.f216947h, new C78822d(this));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }
}
