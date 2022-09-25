package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122389ah;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122390ai;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122395an;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122397ap;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122429bu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122446ck;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122554d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123030bx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123052cs;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123054cu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protos.p5127o.C65699y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ea */
/* compiled from: PG */
final class C122870ea implements C70862aj {

    /* renamed from: a */
    public static final C59071e f340300a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ea");

    /* renamed from: b */
    public final C17597g f340301b;

    /* renamed from: c */
    public final C122859d f340302c;

    /* renamed from: d */
    public final C123033c f340303d;

    /* renamed from: e */
    public final C122828c f340304e;

    /* renamed from: f */
    public final C123030bx f340305f;

    /* renamed from: g */
    public final C122594e f340306g;

    /* renamed from: h */
    public final C123002aw f340307h;

    /* renamed from: i */
    public final Executor f340308i;

    /* renamed from: j */
    public final C123054cu f340309j;

    /* renamed from: k */
    public final C39141kp f340310k;

    /* renamed from: l */
    public final String f340311l;

    /* renamed from: m */
    public C122419bk f340312m = null;

    /* renamed from: n */
    public final boolean f340313n;

    /* renamed from: o */
    public final boolean f340314o;

    /* renamed from: p */
    public final boolean f340315p;

    /* renamed from: q */
    volatile C122854dz f340316q = C122854dz.NOT_INITIALIZED;

    /* renamed from: r */
    public final Map f340317r = new HashMap();

    /* renamed from: s */
    public final C122554d f340318s;

    /* renamed from: t */
    public volatile C122811k f340319t = null;

    /* renamed from: u */
    private final C123052cs f340320u;

    /* renamed from: v */
    private final C47632e f340321v = new C47632e();

    public C122870ea(C122554d dVar, C17597g gVar, C122859d dVar2, boolean z, boolean z2, boolean z3, C123033c cVar, C122594e eVar, C122828c cVar2, C123030bx bxVar, C123002aw awVar, C123052cs csVar, C123054cu cuVar, C39141kp kpVar, String str, C60887da daVar) {
        this.f340318s = dVar;
        this.f340301b = gVar;
        this.f340302c = dVar2;
        this.f340314o = z;
        this.f340315p = z3;
        this.f340306g = eVar;
        this.f340303d = cVar;
        this.f340304e = cVar2;
        this.f340305f = bxVar;
        this.f340313n = z2;
        this.f340320u = csVar;
        this.f340307h = awVar;
        this.f340309j = cuVar;
        this.f340310k = kpVar;
        this.f340311l = str;
        this.f340308i = new C60904dr(daVar);
    }

    /* renamed from: d */
    public static C122397ap m202192d(int i, Status status, C122448cm cmVar) {
        C122395an anVar = (C122395an) C122397ap.f339328d.createBuilder();
        anVar.copyOnWrite();
        ((C122397ap) anVar.instance).f339332c = i;
        C122389ah ahVar = (C122389ah) C122390ai.f339304d.createBuilder();
        String code = status.getCode().toString();
        ahVar.copyOnWrite();
        code.getClass();
        ((C122390ai) ahVar.instance).f339307b = code;
        String g = C58837ba.m90858g(status.getDescription());
        ahVar.copyOnWrite();
        ((C122390ai) ahVar.instance).f339306a = g;
        ahVar.copyOnWrite();
        cmVar.getClass();
        ((C122390ai) ahVar.instance).f339308c = cmVar;
        anVar.copyOnWrite();
        C122397ap apVar = (C122397ap) anVar.instance;
        C122390ai aiVar = (C122390ai) ahVar.build();
        aiVar.getClass();
        apVar.f339331b = aiVar;
        apVar.f339330a = 4;
        return (C122397ap) anVar.build();
    }

    /* renamed from: g */
    public static String m202193g(C18218av avVar) {
        C65699y yVar = avVar.f51741a;
        int i = yVar.f178503b;
        String str = yVar.f178504c;
        return i + "_" + str;
    }

    /* renamed from: j */
    private final C60870cx m202194j(C122853dy dyVar, C122430bv bvVar) {
        return this.f340321v.mo51511a(new C122847ds(this, bvVar, dyVar), this.f340308i);
    }

    /* renamed from: a */
    public final void mo20121a() {
        C122846dr drVar = new C122846dr(this);
        C123064l.m202406a(C60856cj.m92903l(C47810es.m84977q(drVar), this.f340308i), this.f340301b, "onCompleted");
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C123064l.m202406a(mo105769f(Status.f186913k.withDescription(String.format("Input stream ended with onError: %s", new Object[]{th}))), this.f340301b, "onError");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C60870cx cxVar;
        C122430bv bvVar = (C122430bv) obj;
        int a = C122429bu.m201896a(bvVar.f339421a);
        int i = a - 1;
        if (a != 0) {
            if (i != 0) {
                if (i == 1) {
                    cxVar = this.f340321v.mo51512b(new C122830db(this, bvVar), C60826bg.f164896a);
                } else if (i == 2) {
                    cxVar = mo105768e(m202194j(new C122831dc(this, bvVar), bvVar), "Failed to process FULFILLMENT request");
                } else if (i != 3) {
                    if (i == 4) {
                        cxVar = mo105768e(m202194j(new C122833de(this, bvVar), bvVar), "Failed to process CANCEL_FULFILLMENT request");
                    } else {
                        throw new AssertionError();
                    }
                }
                C123064l.m202406a(cxVar, this.f340301b, "onNext");
                return;
            }
            Status status = Status.f186906d;
            Object[] objArr = new Object[1];
            int a2 = C122429bu.m201896a(bvVar.f339421a);
            objArr[0] = a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "null" : "CANCEL_FULFILLMENT" : "CONTEXT" : "FULFILLMENT" : "PARAMS" : "REQUEST_NOT_SET";
            cxVar = mo105768e(C60856cj.m92900i(status.withDescription(String.format("Unsupported request: %s", objArr))), "Failed to process request");
            C123064l.m202406a(cxVar, this.f340301b, "onNext");
            return;
        }
        throw null;
    }

    /* renamed from: e */
    public final C60870cx mo105768e(C60870cx cxVar, String str) {
        return C47633f.m84733g(cxVar).mo51513e(Throwable.class, new C122788cv(this, str), C60826bg.f164896a).mo51516i(new C122789cw(this), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo105769f(Status status) {
        C122792cz czVar = new C122792cz(this, status);
        return C60856cj.m92903l(C47810es.m84977q(czVar), this.f340308i);
    }

    /* renamed from: h */
    public final void mo105770h() {
        Collection.EL.stream(this.f340317r.values()).forEach(C122841dm.f340235a);
        this.f340317r.clear();
    }

    /* renamed from: i */
    public final C122448cm mo105771i(int i, C122852dx dxVar, C122811k kVar) {
        C122446ck ckVar = (C122446ck) C122448cm.f339454i.createBuilder();
        ckVar.mo105627a((Iterable) Collection.EL.stream(dxVar.f340279g.mo105672a()).map(C122829da.f340208a).collect(C58370cn.f155946a));
        ckVar.copyOnWrite();
        ((C122448cm) ckVar.instance).f339456a = i;
        ckVar.mo105628b(dxVar.f340275c.mo105818a());
        ckVar.mo105628b(kVar.f340171a.mo105883a().mo105818a());
        ckVar.mo105628b(kVar.f340174d.mo105818a());
        C58528ij a = kVar.f340179i.mo105805a();
        ckVar.copyOnWrite();
        C122448cm cmVar = (C122448cm) ckVar.instance;
        C62971cq cqVar = cmVar.f339459d;
        if (!cqVar.mo58948c()) {
            cmVar.f339459d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) a, (List) cmVar.f339459d);
        C58485gu a2 = this.f340320u.mo105844a();
        ckVar.copyOnWrite();
        C122448cm cmVar2 = (C122448cm) ckVar.instance;
        C62971cq cqVar2 = cmVar2.f339460e;
        if (!cqVar2.mo58948c()) {
            cmVar2.f339460e = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) a2, (List) cmVar2.f339460e);
        int i2 = kVar.f340178h.f340158a;
        ckVar.copyOnWrite();
        ((C122448cm) ckVar.instance).f339461f = i2;
        long epochMilli = kVar.f340178h.f340159b.toEpochMilli();
        ckVar.copyOnWrite();
        ((C122448cm) ckVar.instance).f339462g = epochMilli;
        C58495hd a3 = kVar.f340178h.mo105745a();
        ckVar.copyOnWrite();
        C122448cm cmVar3 = (C122448cm) ckVar.instance;
        C62995dn dnVar = cmVar3.f339463h;
        if (!dnVar.f170058b) {
            cmVar3.f339463h = dnVar.mo58980a();
        }
        cmVar3.f339463h.putAll(a3);
        return (C122448cm) ckVar.build();
    }
}
