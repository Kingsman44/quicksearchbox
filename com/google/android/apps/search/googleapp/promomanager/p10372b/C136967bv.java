package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a.C136903e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63949m;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63951o;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bv */
/* compiled from: PG */
public final class C136967bv {

    /* renamed from: a */
    public static final C59071e f372769a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.b.bv");

    /* renamed from: b */
    private final Executor f372770b;

    /* renamed from: c */
    private final Map f372771c;

    public C136967bv(Executor executor, Map map) {
        this.f372770b = executor;
        this.f372771c = map;
    }

    /* renamed from: c */
    private final List m222634c(C63951o oVar, C137009dj djVar) {
        ArrayList arrayList = new ArrayList();
        for (C63949m b : oVar.f172950a) {
            arrayList.add(m222633b(b, djVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo113467a(C63949m mVar, C137009dj djVar) {
        C60870cx b = m222633b(mVar, djVar);
        C136962bq bqVar = C136962bq.f372764a;
        return C60846c.m92878g(b, RuntimeException.class, C47810es.m84963c(bqVar), this.f372770b);
    }

    /* renamed from: b */
    private final C60870cx m222633b(C63949m mVar, C137009dj djVar) {
        C63951o oVar;
        C63951o oVar2;
        C63949m mVar2;
        C63955s sVar;
        int i = mVar.f172945a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                oVar = (C63951o) mVar.f172946b;
            } else {
                oVar = C63951o.f172948b;
            }
            return C60922j.m93044g(C60856cj.m92896e(m222634c(oVar, djVar)), C47810es.m84963c(C136963br.f372765a), this.f372770b);
        } else if (i3 == 1) {
            if (i == 2) {
                oVar2 = (C63951o) mVar.f172946b;
            } else {
                oVar2 = C63951o.f172948b;
            }
            return C60922j.m93044g(C60856cj.m92906o(m222634c(oVar2, djVar)), C47810es.m84963c(C136965bt.f372767a), this.f372770b);
        } else if (i3 == 2) {
            if (i == 3) {
                mVar2 = (C63949m) mVar.f172946b;
            } else {
                mVar2 = C63949m.f172943c;
            }
            return C60922j.m93044g(m222633b(mVar2, djVar), C47810es.m84963c(C136966bu.f372768a), this.f372770b);
        } else if (i3 == 3) {
            if (i == 4) {
                sVar = (C63955s) mVar.f172946b;
            } else {
                sVar = C63955s.f172966b;
            }
            Map map = this.f372771c;
            C63954r a = C63954r.m96325a(sVar.f172968a);
            if (a == null) {
                a = C63954r.TYPE_UNSPECIFIED;
            }
            if (!map.containsKey(a)) {
                return C60856cj.m92899h(new IllegalArgumentException("Unsupported condition predicate"));
            }
            Map map2 = this.f372771c;
            C63954r a2 = C63954r.m96325a(sVar.f172968a);
            if (a2 == null) {
                a2 = C63954r.TYPE_UNSPECIFIED;
            }
            return ((C136903e) ((C69464a) map2.get(a2)).mo17428b()).mo113438a(sVar, djVar);
        } else if (i3 != 4) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid condition expression"));
        } else {
            return C60856cj.m92900i(true);
        }
    }
}
