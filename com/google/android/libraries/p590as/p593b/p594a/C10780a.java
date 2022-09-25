package com.google.android.libraries.p590as.p593b.p594a;

import android.location.Location;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28723ba;
import com.google.android.libraries.mdi.download.C28724bb;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59224r;
import com.google.common.p4535g.C59225s;
import com.google.common.p4535g.C59226t;
import com.google.common.p4543n.p4551g.C59443c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.speech.p5213i.p5214a.p5215a.p5216a.p5217a.C66694b;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.as.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C10780a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C10783b f35787a;

    /* renamed from: b */
    public final /* synthetic */ C28728bf f35788b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f35789c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f35790d;

    public /* synthetic */ C10780a(C10783b bVar, C28728bf bfVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f35787a = bVar;
        this.f35788b = bfVar;
        this.f35789c = cxVar;
        this.f35790d = cxVar2;
    }

    public final Object call() {
        C59127at atVar;
        C10783b bVar = this.f35787a;
        C28728bf bfVar = this.f35788b;
        C60870cx cxVar = this.f35789c;
        C60870cx cxVar2 = this.f35790d;
        C62971cq<C28725bc> cqVar = bfVar.f78046b;
        Locale locale = (Locale) C60856cj.m92909r(cxVar);
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        C58480gp e = C58485gu.m89837e();
        C58833ax axVar2 = (C58833ax) ((C58885cv) bVar.f35798b).f156729a;
        if (axVar2.mo56113h()) {
            Location location = (Location) axVar2.mo56107c();
            atVar = C59127at.m91610b(location.getLatitude(), location.getLongitude());
        } else {
            atVar = null;
        }
        for (C28725bc bcVar : cqVar) {
            if (!((bcVar.f78036a & 1) == 0 || locale == null)) {
                C28724bb bbVar = bcVar.f78037b;
                if (bbVar == null) {
                    bbVar = C28724bb.f78028e;
                }
                C63070h hVar = bbVar.f78032c;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                try {
                    C62971cq cqVar2 = ((C66694b) C62942bv.parseFrom((C62942bv) C66694b.f181433b, hVar.f170218b, C62921ba.m95368a())).f181435a;
                    if ((cqVar2.isEmpty() || (axVar.mo56113h() && !C58837ba.m90859h((String) axVar.mo56107c()) && cqVar2.contains(axVar.mo56107c()))) && bbVar.f78031b.contains(locale.toLanguageTag())) {
                        if ((bbVar.f78030a & 2) == 0) {
                            e.mo55395g(bcVar);
                        } else if (axVar2.mo56113h() && atVar != null) {
                            C28723ba baVar = bbVar.f78033d;
                            if (baVar == null) {
                                baVar = C28723ba.f78024b;
                            }
                            C59226t tVar = new C59226t(baVar.f78026a);
                            if (atVar.mo56454e() && C59224r.m91905c(atVar.mo56453d(), new C59218l(new C59443c(100000.0d).mo56958a() / 6371010.0d)).mo56467g(new C59225s(tVar))) {
                                e.mo55395g(bcVar);
                            }
                        }
                    }
                } catch (C62974ct e2) {
                    ((C58970a) ((C58970a) ((C58970a) C10783b.f35797a.mo56226d()).mo56382g(e2)).mo56372aa(53951)).mo56386p("Could not parse contextual model modifier.");
                }
            }
        }
        C58485gu f = e.mo55394f();
        HashMap hashMap = new HashMap();
        C58801sm G = f.listIterator(0);
        while (G.hasNext()) {
            C28708an anVar = ((C28725bc) G.next()).f78038c;
            if (anVar == null) {
                anVar = C28708an.f77994l;
            }
            C28707am amVar = (C28707am) hashMap.get(anVar.f77997b);
            if (amVar == null) {
                hashMap.put(anVar.f77997b, (C28707am) anVar.toBuilder());
            } else {
                amVar.mo34327a(anVar.f78003h);
            }
        }
        C58480gp e3 = C58485gu.m89837e();
        for (C28707am build : hashMap.values()) {
            e3.mo55395g((C28708an) build.build());
        }
        return e3.mo55394f();
    }
}
