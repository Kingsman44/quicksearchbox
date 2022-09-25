package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.android.apps.search.googleapp.customtabs.p10152d.C133705a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133746g;
import com.google.android.apps.search.googleapp.customtabs.p10152d.C133756q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.m */
/* compiled from: PG */
public final class C133691m {

    /* renamed from: a */
    public static final C59071e f364148a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.c.m");

    /* renamed from: b */
    public static final Duration f364149b = Duration.ofDays(1);

    /* renamed from: c */
    static final Duration f364150c = Duration.ofSeconds(3);

    /* renamed from: d */
    public final C42876ab f364151d;

    /* renamed from: e */
    public final C133756q f364152e;

    /* renamed from: f */
    public final C21370a f364153f;

    /* renamed from: g */
    public final ScheduledExecutorService f364154g;

    /* renamed from: h */
    private final C133678ac f364155h;

    /* renamed from: i */
    private final Executor f364156i;

    public C133691m(C42876ab abVar, C133756q qVar, C133678ac acVar, C21370a aVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f364151d = abVar;
        this.f364152e = qVar;
        this.f364155h = acVar;
        this.f364153f = aVar;
        this.f364154g = scheduledExecutorService;
        this.f364156i = executor;
    }

    /* renamed from: a */
    public static C133697s m216922a(C133693o oVar) {
        if (!oVar.f364161c) {
            return C133697s.NOT_AVAILABLE_FIRST_RUN_NOT_DONE;
        }
        if (oVar.f364160b < 5) {
            return C133697s.NOT_AVAILABLE_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED;
        }
        return C133697s.AVAILABLE;
    }

    /* renamed from: b */
    public final C60870cx mo111334b(C133746g gVar) {
        C133686h hVar = new C133686h(this, gVar);
        return C60856cj.m92904m(C47810es.m84978r(hVar), this.f364156i);
    }

    /* renamed from: c */
    public final C60870cx mo111335c(Duration duration) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        return C47633f.m84733g(C47633f.m84733g(this.f364155h.f364126e.mo50395b()).mo51516i(new C133683e(this, duration, atomicReference), C60826bg.f164896a).mo51515h(new C133684f(atomicReference), C60826bg.f164896a)).mo51515h(C133689k.f364146a, C60826bg.f164896a).mo51513e(C133705a.class, C133690l.f364147a, C60826bg.f164896a).mo51513e(TimeoutException.class, C133681c.f364128a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo111336d(Duration duration) {
        C60870cx d = this.f364151d.mo46042d();
        C60870cx b = this.f364155h.f364126e.mo50395b();
        return C47638k.m84753d(d, b).mo51520a(new C133688j(this, d, b, duration), this.f364154g);
    }

    /* renamed from: e */
    public final boolean mo111337e(String str, C133693o oVar, Duration duration) {
        if (str != null && !oVar.f364163e.isEmpty() && str.equals(oVar.f364163e) && Duration.between(Instant.ofEpochMilli(oVar.f364162d), Instant.ofEpochMilli(this.f364153f.mo26870b())).compareTo(duration) <= 0) {
            return false;
        }
        return true;
    }
}
