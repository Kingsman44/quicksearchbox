package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.p489g.C9136d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C8142xb;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C98054ai implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f273793a;

    public /* synthetic */ C98054ai(C98064as asVar) {
        this.f273793a = asVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C7744ii iiVar;
        C60870cx cxVar;
        C98064as asVar = this.f273793a;
        C118826c cVar = (C118826c) obj;
        asVar.f273820p.mo85270f("internalMarkAllCardsRendered", C90996e.f254198a);
        synchronized (asVar.f273819o) {
            if (asVar.f273816l.mo79746e(C90010bp.f246923S)) {
                iiVar = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85614c(false, C8142xb.UNKNOWN_SURFACE))).mo56111f();
            } else {
                iiVar = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85612a())).mo56111f();
            }
            C98127i iVar = asVar.f273824t;
            C98121cv cvVar = new C98121cv(iVar);
            cvVar.mo86660l(iiVar);
            if (cvVar.f273984a) {
                C0978h hVar = new C0978h((C0979i) cvVar.f273985b);
                while (hVar.hasNext()) {
                    C7669fo foVar = (C7669fo) hVar.next();
                    synchronized (iVar.f274021a) {
                        iVar.f274022b.remove(foVar);
                    }
                }
                for (Map.Entry entry : cvVar.f273986c.entrySet()) {
                    C7669fo foVar2 = (C7669fo) entry.getKey();
                    C9136d dVar = (C9136d) entry.getValue();
                    synchronized (iVar.f274021a) {
                        iVar.f274022b.put(foVar2, dVar);
                    }
                }
                cxVar = asVar.f273823s.mo85626l();
            } else {
                cxVar = C118826c.f331423b;
            }
        }
        return cxVar;
    }
}
