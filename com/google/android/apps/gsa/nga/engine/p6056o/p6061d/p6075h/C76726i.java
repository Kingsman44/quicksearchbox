package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h;

import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122462q;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122464s;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122465t;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122516bp;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122517bq;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122519bs;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17592b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.C70888j;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.h.i */
/* compiled from: PG */
public final /* synthetic */ class C76726i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76739v f212054a;

    /* renamed from: b */
    public final /* synthetic */ boolean f212055b;

    public /* synthetic */ C76726i(C76739v vVar, boolean z) {
        this.f212054a = vVar;
        this.f212055b = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C76739v vVar = this.f212054a;
        boolean z = this.f212055b;
        Void voidR = (Void) obj;
        C60870cx cxVar2 = vVar.f212070d;
        if (cxVar2 != null) {
            return C60856cj.m92901j(cxVar2);
        }
        long d = vVar.f212071e.mo85399d(C90126fx.f251506kB);
        if (d != vVar.f212078l || vVar.f212069c == null) {
            ((C58970a) ((C58970a) C76739v.f212066a.mo56224b()).mo56372aa(3644)).mo56388r("Reinitialize service with process %d", d);
            C122472a aVar = vVar.f212069c;
            if (aVar != null) {
                vVar.f212069c = null;
                vVar.f212079m = null;
                vVar.f212070d = vVar.f212072f.mo28210j(C60846c.m92878g(aVar.mo105637i(), Throwable.class, C76731n.f212060a, C60826bg.f164896a), "[NGA] ServiceProviderImpl wait for tearDown", new C76732o(vVar));
                return C60856cj.m92901j(vVar.f212070d);
            }
            C70888j e = vVar.mo72314e(d);
            vVar.f212078l = d;
            vVar.f212069c = vVar.f212082p.mo105655a(e);
        }
        C122472a aVar2 = vVar.f212069c;
        C60870cx cxVar3 = vVar.f212079m;
        if (cxVar3 != null) {
            cxVar = C60856cj.m92901j(cxVar3);
        } else {
            C122462q qVar = (C122462q) C122463r.f339493g.createBuilder();
            boolean j = vVar.f212071e.mo85405j(C90126fx.f251220eh);
            qVar.copyOnWrite();
            ((C122463r) qVar.instance).f339497c = j;
            boolean j2 = vVar.f212071e.mo85405j(C90126fx.f251373hb);
            qVar.copyOnWrite();
            ((C122463r) qVar.instance).f339495a = j2;
            boolean j3 = vVar.f212071e.mo85405j(C90126fx.f251331gm);
            qVar.copyOnWrite();
            boolean z2 = true;
            ((C122463r) qVar.instance).f339500f = !j3;
            boolean j4 = vVar.f212071e.mo85405j(C90126fx.f251480jc);
            qVar.copyOnWrite();
            ((C122463r) qVar.instance).f339499e = !j4;
            C122464s sVar = (C122464s) C122465t.f339501d.createBuilder();
            boolean j5 = vVar.f212071e.mo85405j(C90126fx.f251076bw);
            sVar.copyOnWrite();
            ((C122465t) sVar.instance).f339505c = j5;
            if (vVar.f212071e.mo85405j(C90126fx.f251498ju)) {
                C58485gu guVar = (C58485gu) Collection.EL.stream(C89988b.m146551d(vVar.f212071e.mo85403h(C90126fx.f250968U))).flatMap(new C76727j(vVar)).collect(C58370cn.f155946a);
                sVar.copyOnWrite();
                ((C122465t) sVar.instance).f339503a = true;
                sVar.copyOnWrite();
                C122465t tVar = (C122465t) sVar.instance;
                C62971cq cqVar = tVar.f339504b;
                if (!cqVar.mo58948c()) {
                    tVar.f339504b = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) guVar, (List) tVar.f339504b);
            }
            qVar.copyOnWrite();
            C122465t tVar2 = (C122465t) sVar.build();
            tVar2.getClass();
            ((C122463r) qVar.instance).f339496b = tVar2;
            if (vVar.f212071e.mo85405j(C90126fx.f251185dz)) {
                Optional a = vVar.f212075i.mo71402a();
                Objects.requireNonNull(qVar);
                a.ifPresent(new C76728k(qVar));
            }
            C122463r rVar = (C122463r) qVar.build();
            Instant a2 = vVar.f212074h.mo57444a();
            C76718a aVar3 = new C76718a(rVar, vVar.f212073g.mo72021b().mo72038d());
            if (z || vVar.f212081o == null || !aVar3.equals(vVar.f212080n) || Duration.between(vVar.f212081o, a2).compareTo(C76739v.f212067b) >= 0) {
                if (vVar.f212081o == null || rVar.f339499e == ((C76718a) vVar.f212080n).f212045a.f339499e) {
                    z2 = false;
                }
                ((C58970a) ((C58970a) C76739v.f212066a.mo56224b()).mo56372aa(3643)).mo56386p("Started new service configuration");
                vVar.f212081o = a2;
                vVar.f212080n = aVar3;
                C47538ax c = vVar.f212076j.mo51613c("NGA");
                try {
                    C60870cx d2 = C17592b.m34885d(new C122516bp((C122519bs) aVar2, rVar));
                    C122517bq bqVar = C122517bq.f339627a;
                    C60870cx g = C60922j.m93044g(d2, C47810es.m84963c(bqVar), C60826bg.f164896a);
                    if (c != null) {
                        c.close();
                    }
                    if (z2) {
                        Class<Throwable> cls = Throwable.class;
                        g = C60846c.m92878g(C60922j.m93045h(C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(g), new C76722e(vVar, aVar2), C60826bg.f164896a), cls, C76723f.f212050a, C60826bg.f164896a), new C76724g(aVar2, vVar.f212073g.mo72021b().mo72039e()), C60826bg.f164896a), Throwable.class, C76725h.f212053a, C60826bg.f164896a);
                    }
                    vVar.f212079m = g;
                    vVar.f212072f.mo28211k(vVar.f212079m, "[NGA] reset configureFuture", new C76736s(vVar));
                    cxVar = C60856cj.m92901j(g);
                } catch (Throwable th) {
                    C76720c.m123338a(th, th);
                }
            } else {
                cxVar = C60866ct.f164955a;
            }
        }
        return C60922j.m93044g(cxVar, new C76733p(aVar2), C60826bg.f164896a);
        throw th;
    }
}
