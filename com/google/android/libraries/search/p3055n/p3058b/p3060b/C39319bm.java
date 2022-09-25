package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.arb;
import com.google.android.libraries.search.p3055n.C39365bn;
import com.google.android.libraries.search.p3055n.C39650cd;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.android.libraries.search.p3055n.p3058b.p3059a.C39278a;
import com.google.android.libraries.search.p3055n.p3075e.p3076a.C39683e;
import com.google.android.libraries.search.p3055n.p3075e.p3077b.C39689e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.b.b.bm */
/* compiled from: PG */
public final class C39319bm extends C39650cd {

    /* renamed from: a */
    public static final C59071e f103564a = C59071e.m91332i("com.google.android.libraries.search.n.b.b.bm");

    /* renamed from: b */
    public final Context f103565b;

    /* renamed from: c */
    public final Executor f103566c;

    /* renamed from: d */
    public final C47632e f103567d = new C47632e();

    /* renamed from: e */
    public final Executor f103568e;

    /* renamed from: f */
    public final C60870cx f103569f;

    /* renamed from: g */
    public final C39280aa f103570g;

    /* renamed from: h */
    public final Optional f103571h;

    /* renamed from: i */
    public final Optional f103572i;

    /* renamed from: j */
    public final boolean f103573j;

    /* renamed from: k */
    public C60870cx f103574k = C60866ct.f164955a;

    public C39319bm(Context context, C60887da daVar, C39683e eVar, Optional optional, Optional optional2, Optional optional3, boolean z, C39689e eVar2, C39278a aVar, boolean z2, arb arb) {
        this.f103565b = context;
        this.f103566c = new C60904dr(daVar);
        this.f103568e = daVar;
        this.f103572i = optional;
        this.f103573j = z;
        C60870cx a = eVar.mo41987a(new C39294ao());
        this.f103569f = a;
        this.f103571h = optional3;
        this.f103570g = arb.a(C60922j.m93045h(a, C47810es.m84966f(C39285af.f103502a), daVar), z2 ? Optional.m71637of(eVar2) : Optional.empty(), Optional.m71637of(aVar), Boolean.TRUE.equals(optional2.orElse(false)));
    }

    /* renamed from: b */
    public final C70862aj mo41769b(C70862aj ajVar) {
        return new C39318bl(this, ajVar, this.f103570g);
    }

    /* renamed from: c */
    public final void mo41770c(C39670cx cxVar, C70862aj ajVar) {
        C62940bt r0 = C62942bv.checkIsLite(C39666ct.f104416f);
        cxVar.mo58887l(r0);
        if (!cxVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = f103564a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) d).mo56372aa(53466)).mo56386p("Missing update request.");
            return;
        }
        C46459k.m82829b(this.f103567d.mo51512b(new C39289aj(this, cxVar, ajVar), this.f103568e), "SodaAsrFrontend: backgroundBiasingUpdate failed.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo41771d(C39670cx cxVar, C70862aj ajVar) {
        C62940bt r0 = C62942bv.checkIsLite(C39365bn.f103661n);
        cxVar.mo58887l(r0);
        if (!cxVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = f103564a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaAsrFrontendService");
            ((C59052c) ((C59052c) d).mo56372aa(53467)).mo56386p("Missing query fulfillment signal request.");
            return;
        }
        C46459k.m82829b(this.f103567d.mo51512b(new C39288ai(this, cxVar, ajVar), this.f103568e), "SodaAsrFrontend: queryFulfillment failed.", new Object[0]);
    }

    /* renamed from: f */
    public final C60870cx mo41773f(C70862aj ajVar, C67087ko koVar) {
        C39287ah ahVar = new C39287ah(ajVar, koVar);
        return C60856cj.m92903l(C47810es.m84977q(ahVar), this.f103566c);
    }

    /* renamed from: e */
    public final C60870cx mo41772e(C70862aj ajVar, String str, boolean z) {
        C60870cx cxVar;
        if (z) {
            cxVar = this.f103570g.mo41757c();
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C47633f.m84733g(cxVar).mo51515h(new C39281ab(str, ajVar), this.f103566c);
    }
}
