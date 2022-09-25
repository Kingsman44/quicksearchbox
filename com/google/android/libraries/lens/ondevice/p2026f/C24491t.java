package com.google.android.libraries.lens.ondevice.p2026f;

import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24451f;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2034k.C24650eg;
import com.google.android.libraries.lens.ondevice.p2034k.C24657en;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24798i;
import com.google.android.libraries.lens.ondevice.p2037n.C24799j;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24802m;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.ondevice.p2037n.C24810u;
import com.google.android.libraries.lens.ondevice.p2037n.C24811v;
import com.google.android.libraries.lens.ondevice.p2037n.C24812w;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.ondevice.f.t */
/* compiled from: PG */
public final class C24491t {

    /* renamed from: a */
    public static final C58974d f67010a = C58974d.m91135i("DistributionManager");

    /* renamed from: b */
    public final C60887da f67011b;

    /* renamed from: c */
    public final C24451f f67012c;

    /* renamed from: d */
    public final C24493v f67013d;

    /* renamed from: e */
    public final C24530h f67014e;

    /* renamed from: f */
    public final C21370a f67015f;

    public C24491t(C60887da daVar, C24451f fVar, C24493v vVar, C24530h hVar, C21370a aVar) {
        this.f67011b = daVar;
        this.f67012c = fVar;
        this.f67013d = vVar;
        this.f67014e = hVar;
        this.f67015f = aVar;
    }

    /* renamed from: a */
    public static C24490s m45560a(C58495hd hdVar, C24795f fVar) {
        List<C24810u> list;
        C58529ik ikVar = new C58529ik();
        C58526ih ihVar = new C58526ih();
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str = (String) entry.getKey();
            C58833ax a = ((C24650eg) entry.getValue()).mo29949a(fVar);
            if (a.mo56113h()) {
                C24797h hVar = ((C24801l) a.mo56107c()).f67769b;
                if (hVar == null) {
                    hVar = C24797h.f67760b;
                }
                list = hVar.f67762a;
            } else {
                list = C58485gu.m89845m();
            }
            for (C24810u uVar : list) {
                ihVar.mo55373c(uVar);
                C24471z zVar = uVar.f67820b;
                if (zVar == null) {
                    zVar = C24471z.f66980d;
                }
                C24465t tVar = zVar.f66983b;
                if (tVar == null) {
                    tVar = C24465t.f66964f;
                }
                ikVar.mo55495c(tVar, str);
            }
        }
        return new C24472b(ihVar.mo55486f(), ikVar.mo55493a());
    }

    /* renamed from: b */
    public static C24803n m45561b(List list) {
        if (list.isEmpty()) {
            return C24803n.f67770c;
        }
        C24798i iVar = (C24798i) C24799j.f67763b.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24440ab abVar = (C24440ab) it.next();
            C24465t tVar = abVar.f66920b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            if (TextUtils.isEmpty(tVar.f66967b)) {
                ((C58970a) ((C58970a) f67010a.mo56226d()).mo56372aa(48790)).mo56386p("Empty model name in response. Skipping.");
            } else {
                iVar.copyOnWrite();
                C24799j jVar = (C24799j) iVar.instance;
                abVar.getClass();
                C62971cq cqVar = jVar.f67765a;
                if (!cqVar.mo58948c()) {
                    jVar.f67765a = C62942bv.mutableCopy(cqVar);
                }
                jVar.f67765a.add(abVar);
            }
        }
        C24802m mVar = (C24802m) C24803n.f67770c.createBuilder();
        mVar.copyOnWrite();
        C24803n nVar = (C24803n) mVar.instance;
        C24799j jVar2 = (C24799j) iVar.build();
        jVar2.getClass();
        nVar.f67773b = jVar2;
        nVar.f67772a |= 2;
        return (C24803n) mVar.build();
    }

    /* renamed from: e */
    public static C58532in m45562e(List list, C58512hu huVar) {
        C58529ik ikVar = new C58529ik();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24440ab abVar = (C24440ab) it.next();
            C24465t tVar = abVar.f66920b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            C58800sl lA = huVar.mo55423a(tVar).iterator();
            while (lA.hasNext()) {
                ikVar.mo55495c((String) lA.next(), abVar);
            }
        }
        return ikVar.mo55493a();
    }

    /* renamed from: c */
    public final C58495hd mo29915c(C58532in inVar, boolean z) {
        return (C58495hd) Collection.EL.stream(inVar.map.entrySet()).collect(C58370cn.m89403c(C24479h.f66995a, new C24481j(this, z), new C24482k(inVar)));
    }

    /* renamed from: d */
    public final C58495hd mo29916d(List list) {
        C58490gz gzVar = new C58490gz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24650eg egVar = (C24650eg) it.next();
            gzVar.mo55429h(C24657en.m45762b(egVar.getClass()), egVar);
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: f */
    public final C60870cx mo29917f(C58495hd hdVar, C24795f fVar, boolean z) {
        C24490s a = m45560a(hdVar, fVar);
        C60870cx h = mo29919h(((C24472b) a).f66985a.mo55229u(), true);
        C24485n nVar = new C24485n(this, z, a);
        return C60922j.m93044g(h, C47810es.m84963c(nVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo29918g(List list) {
        return this.f67012c.mo29905a(C58597ky.m90217h(list, C24475d.f66991a));
    }

    /* renamed from: h */
    public final C60870cx mo29919h(List list, boolean z) {
        C60870cx cxVar;
        if (z) {
            this.f67014e.mo29947f(C24805p.MODEL_RETRIEVAL_START, (C24808s) null);
            long b = this.f67015f.mo26870b();
            cxVar = mo29918g(list);
            C24487p pVar = new C24487p(this, b);
            C60856cj.m92911t(cxVar, C47810es.m84974n(pVar), C60826bg.f164896a);
        } else {
            cxVar = mo29918g(list);
        }
        C24488q qVar = new C24488q(this, list);
        C60856cj.m92911t(cxVar, C47810es.m84974n(qVar), C60826bg.f164896a);
        return cxVar;
    }

    /* renamed from: i */
    public final void mo29920i(C24805p pVar, String str) {
        C24530h hVar = this.f67014e;
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        C24811v vVar = (C24811v) C24812w.f67822c.createBuilder();
        vVar.copyOnWrite();
        C24812w wVar = (C24812w) vVar.instance;
        str.getClass();
        wVar.f67824a |= 1;
        wVar.f67825b = str;
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        C24812w wVar2 = (C24812w) vVar.build();
        wVar2.getClass();
        sVar.f67809d = wVar2;
        sVar.f67806a |= 4;
        hVar.mo29947f(pVar, (C24808s) rVar.build());
    }

    /* renamed from: j */
    public final void mo29921j() {
        this.f67011b.mo19399b(new C24480i(this));
    }

    /* renamed from: k */
    public final void mo29922k(C24803n nVar) {
        C24799j jVar = nVar.f67773b;
        if (jVar == null) {
            jVar = C24799j.f67763b;
        }
        for (C24440ab abVar : jVar.f67765a) {
            C24465t tVar = abVar.f66920b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            String str = tVar.f66967b;
            C58838bb.m90884s(!TextUtils.isEmpty(str), "Model name should not be empty");
            if (C24473a.m45549h(abVar)) {
                ((C58970a) ((C58970a) f67010a.mo56224b()).mo56372aa(48793)).mo56389s("Found available model %s", str);
                mo29920i(C24805p.DOWNLOAD_MODEL_AVAILABLE, str);
            } else {
                ((C58970a) ((C58970a) f67010a.mo56224b()).mo56372aa(48792)).mo56389s("Missing model %s", str);
            }
        }
    }
}
