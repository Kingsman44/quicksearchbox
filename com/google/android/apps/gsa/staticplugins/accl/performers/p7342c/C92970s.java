package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.nga.api.C74729i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4985f.p4988b.p4990b.C64736b;
import com.google.protos.p4985f.p4988b.p4990b.C64741g;
import com.google.protos.p4985f.p4988b.p4990b.C64742h;
import com.google.protos.p4985f.p4988b.p4990b.C64743i;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.s */
/* compiled from: PG */
public final class C92970s extends C22538o {

    /* renamed from: a */
    public static final C59071e f259329a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.s");

    /* renamed from: b */
    public final C9321i f259330b;

    /* renamed from: c */
    public final C37215b f259331c;

    /* renamed from: d */
    public final C21370a f259332d;

    /* renamed from: e */
    public final C86124t f259333e;

    /* renamed from: f */
    public final C58833ax f259334f;

    /* renamed from: g */
    private final C58833ax f259335g;

    /* renamed from: h */
    private final C22871g f259336h;

    public C92970s(C9321i iVar, C58833ax axVar, C22871g gVar, C37215b bVar, C21370a aVar, C86124t tVar, C58833ax axVar2) {
        this.f259330b = iVar;
        this.f259335g = axVar;
        this.f259336h = gVar;
        this.f259331c = bVar;
        this.f259332d = aVar;
        this.f259333e = tVar;
        this.f259334f = axVar2;
    }

    /* renamed from: d */
    private final void m153006d(C60870cx cxVar, C90762bf bfVar, String str) {
        C92969r rVar = new C92969r(this, str, bfVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(rVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        this.f259331c.mo19974a(C37182a.f98254x);
        if (dyVar.f135936b.equals("device.FETCH_ASSIST_DATA")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C64741g gVar = (C64741g) m41992m(dwVar, "fetch_assist_data_args", C64741g.f175494d.getParserForType());
            C90762bf bfVar = new C90762bf(this.f259332d);
            C63042fg i = C62953e.m95484i(this.f259332d.mo26871c());
            C62910ar arVar = gVar.f175497c;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            C63042fg f = C62953e.m95481f(i, arVar);
            if (!new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.DIRECT_ACTION_DATA)) {
                ((C59052c) ((C59052c) f259329a.mo56226d()).mo56372aa(13247)).mo56386p("DIRECT_ACTION_DATA unrequested.");
                cxVar = C60856cj.m92900i(C58836b.f156633a);
            } else if (!this.f259335g.mo56113h()) {
                ((C59052c) ((C59052c) f259329a.mo56226d()).mo56372aa(13246)).mo56386p("ForegroundActivityAgent absent");
                cxVar = C60856cj.m92900i(C58836b.f156633a);
            } else {
                cxVar = C60922j.m93044g(C60838bs.m92859i(((C74729i) this.f259335g.mo56107c()).mo71111a()), C92967p.f259324a, C60826bg.f164896a);
            }
            boolean z = new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.APP_PACKAGE_METADATA) || new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.WEB_URI);
            boolean contains = new C62963cj(gVar.f175496a, C64741g.f175493b).contains(C64736b.SCREENSHOT);
            if (this.f259333e.mo79746e(C90125fw.f250935n)) {
                C62963cj cjVar = new C62963cj(gVar.f175496a, C64741g.f175493b);
                if (!this.f259335g.mo56113h()) {
                    ((C59052c) ((C59052c) f259329a.mo56226d()).mo56372aa(13249)).mo56386p("ForegroundActivityAgent absent");
                    cxVar2 = C60856cj.m92900i(C58836b.f156633a);
                } else {
                    EnumMap enumMap = new EnumMap(C64736b.class);
                    boolean contains2 = cjVar.contains(C64736b.APP_PACKAGE_METADATA);
                    boolean contains3 = cjVar.contains(C64736b.WEB_URI);
                    if (contains2) {
                        enumMap.put(C64736b.APP_PACKAGE_METADATA, ((C74729i) this.f259335g.mo56107c()).mo71112b());
                    }
                    if (contains3) {
                        enumMap.put(C64736b.WEB_URI, ((C74729i) this.f259335g.mo56107c()).mo71113c());
                    }
                    cxVar2 = C60856cj.m92892a(enumMap.values()).mo57334a(new C92962k(enumMap), C60826bg.f164896a);
                }
            } else {
                cxVar2 = mo87494c(new C92957f(this), f);
            }
            if (z) {
                m153006d(cxVar2, bfVar, "APP_AND_URI");
            }
            if (contains) {
                cxVar3 = mo87494c(new C92960i(this), f);
            } else {
                cxVar3 = C60856cj.m92900i(C58836b.f156633a);
            }
            if (contains) {
                m153006d(cxVar3, bfVar, "SCREENSHOT");
            }
            C60870cx a = C60856cj.m92893b(cxVar2, cxVar3).mo57334a(new C92961j(cxVar2, cxVar3), C60826bg.f164896a);
            return C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(C60856cj.m92893b(a, cxVar).mo57334a(new C92963l(this, a, gVar, cxVar), C60826bg.f164896a)), TimeoutException.class, new C92964m(this), C60826bg.f164896a), Exception.class, new C92965n(this), C60826bg.f164896a);
        }
        throw new C22428d(dyVar);
    }

    /* renamed from: b */
    public final C52070ec mo87493b(C52235kf kfVar, String str) {
        if (!this.f259333e.mo79746e(C90125fw.f250934m)) {
            return C22402a.m41822b(kfVar, str);
        }
        C64742h hVar = (C64742h) C64743i.f175499e.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = str;
        hVar.copyOnWrite();
        C64743i iVar = (C64743i) hVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        iVar.f175503c = kgVar3;
        iVar.f175501a |= 2;
        return C22402a.m41821a("fetch_assist_data_result", "assistant.api.client_op.FetchAssistDataResult", hVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo87494c(C58881cr crVar, C63042fg fgVar) {
        C62910ar arVar;
        long c = C62953e.m95478c(fgVar);
        if (this.f259332d.mo26871c() >= c) {
            arVar = C62948a.f169987b;
        } else {
            arVar = C62948a.m95459j(c - this.f259332d.mo26871c());
        }
        int d = (int) C62948a.m95453d(arVar);
        C58833ax axVar = (C58833ax) crVar.mo6453a();
        if (axVar.mo56113h()) {
            ((C59052c) ((C59052c) f259329a.mo56224b()).mo56372aa(13244)).mo56387q("AssistDataFuture found, waiting with timeout: %d", d);
            return C90877ak.m148471e(C60922j.m93044g((C60870cx) axVar.mo56107c(), C92968q.f259325a, C60826bg.f164896a), (long) d, TimeUnit.MILLISECONDS, this.f259336h);
        }
        return this.f259336h.mo28203c("retry-assist-data-future", (long) Math.min(500, d), new C92958g(this, fgVar, crVar));
    }
}
