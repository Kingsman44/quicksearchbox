package com.google.android.libraries.lens.view.session;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.C144901be;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.lens.view.main.C27304au;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.C38700f;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4711m.C62632i;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.session.aj */
/* compiled from: PG */
public final class C27747aj implements C27749al {

    /* renamed from: a */
    public static final C58974d f75733a = C58974d.m91135i("LensLocationProvider");

    /* renamed from: b */
    public static final long f75734b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: c */
    public final C38700f f75735c;

    /* renamed from: d */
    public final C144889at f75736d;

    /* renamed from: e */
    public final LocationRequest f75737e;

    /* renamed from: f */
    final LocationManager f75738f;

    /* renamed from: g */
    public final Object f75739g = new Object();

    /* renamed from: h */
    public Location f75740h;

    /* renamed from: i */
    public Location f75741i;

    /* renamed from: j */
    public C27304au f75742j;

    /* renamed from: k */
    private final C25504aj f75743k;

    /* renamed from: l */
    private final C38683aa f75744l;

    /* renamed from: m */
    private final Executor f75745m;

    /* renamed from: n */
    private final C27232l f75746n;

    /* renamed from: o */
    private final boolean f75747o;

    /* renamed from: p */
    private final boolean f75748p;

    /* renamed from: q */
    private final Context f75749q;

    /* renamed from: r */
    private final C25225bd f75750r;

    /* renamed from: s */
    private final C60836bq f75751s = new C60836bq();

    public C27747aj(C25504aj ajVar, C38683aa aaVar, C38700f fVar, C27232l lVar, Executor executor, boolean z, boolean z2, Context context, C25225bd bdVar) {
        this.f75743k = ajVar;
        this.f75744l = aaVar;
        this.f75735c = fVar;
        this.f75745m = executor;
        this.f75746n = lVar;
        this.f75747o = z;
        this.f75748p = z2;
        this.f75749q = context;
        this.f75750r = bdVar;
        this.f75738f = (LocationManager) context.getSystemService("location");
        LocationRequest locationRequest = new LocationRequest();
        C144901be.m235500b(100);
        locationRequest.f391766a = 100;
        long j = f75734b;
        C143919bh.m233960c(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = locationRequest.f391768c;
        long j3 = locationRequest.f391767b;
        if (j2 == j3 / 6) {
            locationRequest.f391768c = j / 6;
        }
        if (locationRequest.f391774i == j3) {
            locationRequest.f391774i = j;
        }
        locationRequest.f391767b = j;
        locationRequest.mo120341c(3600000);
        this.f75737e = locationRequest;
        this.f75736d = new C27740ac(this);
        C60856cj.m92911t(C47636i.m84742a(new C27741ad(this), executor).mo51516i(new C27742ae(aaVar), executor), C47810es.m84974n(new C27745ah(this)), C60826bg.f164896a);
    }

    /* renamed from: h */
    private final boolean m51604h() {
        C27232l lVar = this.f75746n;
        boolean z = this.f75747o;
        if (C62632i.m94823h(lVar.mo32701h())) {
            return false;
        }
        if (!C62632i.m94817b(lVar.mo32701h()) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C58833ax mo33223a() {
        return C58833ax.m90833j(this.f75740h);
    }

    /* renamed from: b */
    public final C60870cx mo33224b() {
        Location location;
        if (!mo33227e()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (this.f75748p && (location = this.f75740h) != null) {
            return C60856cj.m92900i(C58833ax.m90834k(location));
        }
        C60870cx d = this.f75744l.mo41550d(C39226b.TAG_CLASSIC_LENS_LO, 2);
        C27738aa aaVar = C27738aa.f75725a;
        return C60922j.m93044g(d, C47810es.m84963c(aaVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo33225c() {
        this.f75741i = null;
        if (mo33227e()) {
            ((C58970a) ((C58970a) f75733a.mo56224b()).mo56372aa(49948)).mo56386p("Requesting high accuracy location updates.");
            C46459k.m82829b(this.f75751s.mo57305b(new C27743af(this), this.f75745m), "Failed to subscribe for location updates", new Object[0]);
            return;
        }
        ((C58970a) ((C58970a) f75733a.mo56224b()).mo56372aa(49947)).mo56386p("We do not have user location permissions, not requesting location updates.");
    }

    /* renamed from: d */
    public final void mo33226d() {
        if (mo33227e()) {
            C60870cx b = this.f75751s.mo57305b(new C27744ag(this), this.f75745m);
            C27746ai aiVar = new C27746ai();
            C60856cj.m92911t(b, C47810es.m84974n(aiVar), C60826bg.f164896a);
        }
    }

    /* renamed from: e */
    public final boolean mo33227e() {
        Stream stream = DesugarArrays.stream((T[]) this.f75743k.mo30538h());
        C25504aj ajVar = this.f75743k;
        Objects.requireNonNull(ajVar);
        return stream.anyMatch(new C27739ab(ajVar)) && m51604h();
    }

    /* renamed from: f */
    public final int mo33228f() {
        if (!m51604h()) {
            return 6;
        }
        LocationManager locationManager = this.f75738f;
        if (locationManager != null) {
            if (!locationManager.isLocationEnabled()) {
                return 1;
            }
        } else if (Settings.Secure.getInt(this.f75749q.getContentResolver(), "location_mode", 0) == 0) {
            return 1;
        }
        if (this.f75743k.mo30536f("android.permission.ACCESS_FINE_LOCATION")) {
            return 2;
        }
        if (this.f75743k.mo30536f("android.permission.ACCESS_COARSE_LOCATION")) {
            return 3;
        }
        return this.f75750r.mo30356l() ? 4 : 5;
    }

    /* renamed from: g */
    public final void mo33229g(C27304au auVar) {
        if (this.f75741i != null) {
            auVar.f74717a.mo32886r();
            return;
        }
        synchronized (this.f75739g) {
            this.f75742j = auVar;
        }
    }
}
