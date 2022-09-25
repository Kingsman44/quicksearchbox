package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.C76704a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.C76717b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h.C76719b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.e */
/* compiled from: PG */
public final class C76709e implements C76704a {

    /* renamed from: a */
    public static final C58974d f212024a = C58974d.m91136j();

    /* renamed from: f */
    private static final Duration f212025f = Duration.ofMinutes(10);

    /* renamed from: b */
    public final C91142g f212026b;

    /* renamed from: c */
    public final C76719b f212027c;

    /* renamed from: d */
    public final C47770dh f212028d;

    /* renamed from: e */
    public boolean f212029e = false;

    /* renamed from: g */
    private final C76092h f212030g;

    /* renamed from: h */
    private final C76717b f212031h;

    /* renamed from: i */
    private final C22871g f212032i;

    /* renamed from: j */
    private boolean f212033j = false;

    public C76709e(C91142g gVar, C76092h hVar, C76719b bVar, C76717b bVar2, C47770dh dhVar, C22871g gVar2) {
        this.f212026b = gVar;
        this.f212030g = hVar;
        this.f212027c = bVar;
        this.f212031h = bVar2;
        this.f212028d = dhVar;
        this.f212032i = gVar2;
    }

    /* renamed from: d */
    private final void m123312d() {
        synchronized (this) {
            if (!this.f212033j) {
                this.f212033j = true;
                mo72299b();
            }
        }
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        mo72298a(false);
        m123312d();
    }

    /* renamed from: a */
    public final void mo72298a(boolean z) {
        if (mo71201gC()) {
            Locale e = this.f212030g.mo72021b().mo72039e();
            this.f212031h.mo72301a(e);
            C60856cj.m92911t(C60922j.m93045h(this.f212027c.mo72311b(z), new C76707c(this, e), C60826bg.f164896a), new C76708d(), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final void mo72299b() {
        this.f212032i.mo28213m("[NGA] ServiceConfigurationUpdaterImpl.scheduleTimedUpdate", f212025f.toMillis(), new C76705a(this));
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f212030g.mo72021b().mo72042g() && this.f212026b.mo85405j(C90126fx.f251188eB);
    }

    /* renamed from: gE */
    public final void mo72300gE(C58528ij ijVar) {
        mo72298a(false);
        m123312d();
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "ServiceConfigurationUpdaterImpl";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 20;
    }
}
