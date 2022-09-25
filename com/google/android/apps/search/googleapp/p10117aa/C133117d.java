package com.google.android.apps.search.googleapp.p10117aa;

import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.aa.d */
/* compiled from: PG */
public final class C133117d implements C46513b {

    /* renamed from: a */
    public static final /* synthetic */ int f362907a = 0;

    /* renamed from: b */
    private static final Duration f362908b = Duration.ofDays(1);

    /* renamed from: c */
    private static final Duration f362909c = Duration.ofDays(1);

    /* renamed from: d */
    private static final Duration f362910d = Duration.ofDays(7);

    /* renamed from: e */
    private final C133103au f362911e;

    /* renamed from: f */
    private final C21370a f362912f;

    public C133117d(C133103au auVar, C21370a aVar) {
        this.f362911e = auVar;
        this.f362912f = aVar;
    }

    /* renamed from: a */
    public static C46586t m216080a() {
        C46582p j = C46586t.m83063j(C133117d.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.googleapp.tabsdataservice.AutoDeleteTabsWorker", C4634o.KEEP));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(f362908b.toDays(), TimeUnit.DAYS)));
        dVar.f121754c = new C46573g(f362909c.toDays(), TimeUnit.DAYS);
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        Instant minus = Instant.ofEpochMilli(this.f362912f.mo26870b()).minus(f362910d);
        C133103au auVar = this.f362911e;
        C133075a aVar = new C133075a(minus);
        C60870cx d = auVar.f362876b.mo46042d();
        C133132q qVar = new C133132q(aVar);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(qVar), C60826bg.f164896a);
        C133103au auVar2 = this.f362911e;
        Objects.requireNonNull(auVar2);
        C133109b bVar = new C133109b(auVar2);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(bVar), C60826bg.f164896a);
        C133115c cVar = C133115c.f362906a;
        return C60922j.m93044g(h, C47810es.m84963c(cVar), C60826bg.f164896a);
    }
}
