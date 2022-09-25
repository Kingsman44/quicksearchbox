package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p6983ah.C89145b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17303ab;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17306b;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17324t;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17328x;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17330z;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.u */
/* compiled from: PG */
public final class C107208u extends C17324t {

    /* renamed from: a */
    public static final C59071e f298393a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.apa.a.c.u");

    /* renamed from: b */
    private static final Duration f298394b = Duration.ofSeconds(10);

    /* renamed from: c */
    private final C22871g f298395c;

    /* renamed from: d */
    private final C89994f f298396d;

    /* renamed from: e */
    private final C107188ak f298397e;

    /* renamed from: f */
    private final Executor f298398f;

    /* renamed from: g */
    private final C107203p f298399g;

    public C107208u(C22871g gVar, C89994f fVar, C107188ak akVar, C90851k kVar, C107203p pVar) {
        this.f298395c = gVar;
        this.f298396d = fVar;
        this.f298397e = akVar;
        this.f298398f = kVar.mo85210c("OpaHandoverService");
        this.f298399g = pVar;
    }

    /* renamed from: f */
    public static void m177954f(C70862aj ajVar, Exception exc) {
        ((C59052c) ((C59052c) ((C59052c) f298393a.mo56226d()).mo56382g(exc)).mo56372aa(23524)).mo56386p("#onFailure");
        Status status = Status.f186905c;
        if (exc instanceof TimeoutException) {
            status = Status.f186907e;
        }
        ajVar.mo20122b(status.mo61678e(exc).asException());
    }

    /* renamed from: g */
    private final C60870cx m177955g() {
        return C90877ak.m148471e(this.f298399g.mo95828a(), f298394b.toMillis(), TimeUnit.MILLISECONDS, this.f298395c);
    }

    /* renamed from: b */
    public final C70862aj mo23271b(C70862aj ajVar) {
        C107188ak akVar = this.f298397e;
        Context context = (Context) akVar.f298358a.mo17428b();
        context.getClass();
        Query query = (Query) akVar.f298359b.mo17428b();
        query.getClass();
        C22871g gVar = (C22871g) akVar.f298360c.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) akVar.f298361d.mo17428b();
        gVar2.getClass();
        C87568k kVar = (C87568k) akVar.f298362e.mo17428b();
        kVar.getClass();
        C89145b bVar = (C89145b) akVar.f298363f.mo17428b();
        bVar.getClass();
        C107192e eVar = (C107192e) akVar.f298364g.mo17428b();
        eVar.getClass();
        C21370a aVar = (C21370a) akVar.f298365h.mo17428b();
        aVar.getClass();
        C58881cr crVar = (C58881cr) akVar.f298366i.mo17428b();
        crVar.getClass();
        return new C17602l(this.f298398f, new C107187aj(ajVar, context, query, gVar, gVar2, kVar, bVar, eVar, aVar, crVar));
    }

    /* renamed from: c */
    public final void mo23272c(C17306b bVar, C70862aj ajVar) {
        new C90873ag(m177955g(), this.f298395c, "OpaHandoverService: waiting for device capabilities", new C107206s(ajVar, C58485gu.m89842j(this.f298396d.mo83891ak()))).mo85223a(new C107207t(ajVar));
    }

    /* renamed from: d */
    public final void mo23273d(C17303ab abVar, C70862aj ajVar) {
        new C90873ag(m177955g(), this.f298395c, "OpaHandoverService: waiting for device capabilities", new C107204q(ajVar)).mo85223a(new C107205r(ajVar));
    }

    /* renamed from: e */
    public final void mo23274e(C17328x xVar, C70862aj ajVar) {
        ajVar.mo20123c(C17330z.f50164a);
        ajVar.mo20121a();
        this.f298399g.mo95828a();
    }
}
