package com.google.android.apps.search.podcasts.p10550b.p10555e;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C140002o;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.apps.search.podcasts.p10569h.C140387f;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.e.z */
/* compiled from: PG */
public final class C140084z {

    /* renamed from: a */
    public static final C59071e f380690a = C59071e.m91332i("com.google.android.apps.search.podcasts.b.e.z");

    /* renamed from: b */
    public final C140002o f380691b;

    /* renamed from: c */
    public final C140387f f380692c;

    /* renamed from: d */
    public final C140082x f380693d;

    /* renamed from: e */
    public final C46423aj f380694e;

    /* renamed from: f */
    public final C46778cv f380695f;

    /* renamed from: g */
    public final int f380696g;

    /* renamed from: h */
    private final Executor f380697h;

    public C140084z(Executor executor, C46778cv cvVar, C140002o oVar, C140962c cVar, C140055e eVar, C21370a aVar, C140387f fVar, int i) {
        this.f380695f = cvVar;
        this.f380697h = new C60904dr(executor);
        this.f380691b = oVar;
        this.f380692c = fVar;
        C140082x xVar = new C140082x(eVar, cVar.mo116046b(), aVar);
        this.f380693d = xVar;
        Objects.requireNonNull(xVar);
        this.f380694e = new C46423aj(new C140068j(xVar), C60826bg.f164896a);
        this.f380696g = i;
    }

    /* renamed from: a */
    public final C60870cx mo115432a() {
        return C47633f.m84733g(mo115433b()).mo51516i(new C140071m(this), this.f380697h);
    }

    /* renamed from: b */
    public final C60870cx mo115433b() {
        return C47633f.m84733g(this.f380694e.mo50395b()).mo51515h(C140066h.f380652a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo115434c(C140641b bVar, long j, long j2, boolean z) {
        return mo115436e(new C140067i(this, bVar, j, j2, z));
    }

    /* renamed from: d */
    public final C60870cx mo115435d() {
        return C47633f.m84733g(this.f380694e.mo50395b()).mo51516i(new C140060b(this), this.f380697h).mo51516i(new C140064f(this), this.f380697h).mo51516i(new C140065g(this), this.f380697h);
    }

    /* renamed from: e */
    public final C60870cx mo115436e(Consumer consumer) {
        C60870cx b = this.f380694e.mo50395b();
        C140070l lVar = new C140070l(consumer);
        return C60922j.m93045h(b, C47810es.m84966f(lVar), this.f380697h);
    }

    /* renamed from: f */
    public final void mo115437f() {
        C46459k.m82829b(mo115435d(), "Failed background progress sync.", new Object[0]);
    }
}
