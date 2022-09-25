package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133781f;
import com.google.android.apps.search.googleapp.customtabs.features.p10157a.C133774c;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.q */
/* compiled from: PG */
public final class C133798q implements C133734t {

    /* renamed from: a */
    public static final C59071e f364433a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.appactions.q");

    /* renamed from: b */
    public final boolean f364434b;

    /* renamed from: c */
    public final C133781f f364435c;

    /* renamed from: d */
    public final ScheduledExecutorService f364436d;

    /* renamed from: e */
    public final C38768q f364437e;

    /* renamed from: f */
    public final C133806y f364438f;

    /* renamed from: g */
    public final C133731q f364439g;

    /* renamed from: h */
    private final Duration f364440h;

    /* renamed from: i */
    private final C133774c f364441i = new C133774c();

    public C133798q(C62910ar arVar, boolean z, C133781f fVar, ScheduledExecutorService scheduledExecutorService, C38768q qVar, C133806y yVar, C133731q qVar2) {
        this.f364440h = C62950b.m95473d(arVar);
        this.f364434b = z;
        this.f364435c = fVar;
        this.f364436d = scheduledExecutorService;
        this.f364437e = qVar;
        this.f364438f = yVar;
        this.f364439g = qVar2;
    }

    /* renamed from: a */
    public final void mo111366a(int i) {
        if (i == 1) {
            C133774c cVar = this.f364441i;
            C133731q qVar = this.f364439g;
            Objects.requireNonNull(qVar);
            C46459k.m82829b(cVar.mo111390b(C47810es.m84965e(new C133793l(qVar)), this.f364436d), "Unable to reset bottom bar", new Object[0]);
            C133731q qVar2 = this.f364439g;
            if (qVar2.f364241j && qVar2.f364242k) {
                C133795n nVar = new C133795n(this, this.f364439g.mo111358a().toString());
                C60870cx a = this.f364441i.mo111389a(C60856cj.m92902k(C47810es.m84965e(nVar), this.f364440h.toMillis(), TimeUnit.MILLISECONDS, this.f364436d), C47810es.m84966f(new C133796o(this)), this.f364436d);
                C133797p pVar = new C133797p();
                C60856cj.m92911t(a, C47810es.m84974n(pVar), C60826bg.f164896a);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo111367b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111368c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111369d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111370e() {
    }
}
