package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85006i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.ah */
/* compiled from: PG */
public final class C114261ah extends C86734a implements C85006i {

    /* renamed from: a */
    public static final long f316833a = Duration.ofHours(1).toMillis();

    /* renamed from: b */
    public final Context f316834b;

    /* renamed from: c */
    public final C86124t f316835c;

    /* renamed from: f */
    public final C108013bm f316836f;

    /* renamed from: g */
    public final C22871g f316837g;

    /* renamed from: h */
    public final C86034c f316838h;

    /* renamed from: i */
    public final C123604t f316839i;

    /* renamed from: j */
    public final C21370a f316840j;

    /* renamed from: k */
    public final Optional f316841k;

    /* renamed from: l */
    public final C130895ag f316842l;

    /* renamed from: m */
    public final C83807w f316843m;

    /* renamed from: n */
    public final C124109ch f316844n;

    /* renamed from: o */
    public final C58974d f316845o;

    /* renamed from: p */
    public final C83794j f316846p;

    /* renamed from: q */
    public final C85664bo f316847q;

    /* renamed from: r */
    private final C118426bs f316848r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114261ah(Context context, C86124t tVar, C108013bm bmVar, C22871g gVar, C118426bs bsVar, C86034c cVar, C123604t tVar2, C21370a aVar, Optional optional, C130895ag agVar, C83807w wVar, C124109ch chVar, C83564a aVar2, C83794j jVar, C85664bo boVar) {
        super(C118575h.WORKER_OPA_ZERO_STATE, "opazerostate");
        this.f316834b = context;
        this.f316835c = tVar;
        this.f316836f = bmVar;
        this.f316837g = gVar;
        this.f316848r = bsVar;
        this.f316838h = cVar;
        this.f316839i = tVar2;
        this.f316840j = aVar;
        this.f316841k = optional;
        this.f316842l = agVar;
        this.f316843m = wVar;
        this.f316844n = chVar;
        this.f316845o = aVar2.mo76900a("OpaZSWorker");
        this.f316846p = jVar;
        this.f316847q = boVar;
    }

    /* renamed from: e */
    public static int m189517e(int i) {
        return Math.round(((float) (i - 32)) / 1.8f);
    }

    /* renamed from: a */
    public final C60870cx mo78642a(C53422nh nhVar) {
        return this.f316837g.mo28210j(this.f316836f.mo96352C(nhVar), "convertAndPutZeroStateResponse", new C114509x(this));
    }

    /* renamed from: b */
    public final C60870cx mo78643b(C53422nh nhVar, boolean z) {
        return this.f316837g.mo28209i(this.f316836f.mo96352C(nhVar), "convertAndPutZeroStateResponse", new C114258ae(this, z));
    }

    /* renamed from: c */
    public final C60870cx mo78644c() {
        this.f316834b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f316834b, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromShareSheet"), true != this.f316835c.mo79746e(C90014bt.f247305ee) ? 2 : 1, 1);
        return C118826c.f331423b;
    }

    /* renamed from: d */
    public final C60870cx mo78645d() {
        if (!this.f316835c.mo79746e(C90080ee.f249824w)) {
            return C118826c.f331423b;
        }
        boolean e = this.f316835c.mo79746e(C90080ee.f249817p);
        this.f316835c.mo79743a(C90080ee.f249826y);
        PackageManager packageManager = this.f316834b.getPackageManager();
        ComponentName componentName = new ComponentName(this.f316834b, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver");
        int i = true != e ? 2 : 1;
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        this.f316834b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f316834b, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver"), i, 1);
        return C118826c.f331423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo101290f(C53422nh nhVar) {
        C58487gw c = this.f316848r.mo103692c(nhVar);
        C53306j a = C53306j.m86809a(nhVar.f140193j);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        C58485gu b = C118426bs.f328679a.mo55277g(a);
        C22871g gVar = this.f316837g;
        Stream stream = Collection.EL.stream(b);
        C118426bs bsVar = this.f316848r;
        Objects.requireNonNull(bsVar);
        return gVar.mo28209i(C60856cj.m92906o((Iterable) stream.filter(new C114510y(bsVar)).map(new C114511z(this, c)).collect(C58370cn.f155946a)), "put ProactiveData to OpaStore", C114254aa.f316812a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
