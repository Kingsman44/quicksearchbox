package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.h.f */
/* compiled from: PG */
public final /* synthetic */ class C29609f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29616m f80198a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f80199b;

    public /* synthetic */ C29609f(C29616m mVar, C29409fd fdVar) {
        this.f80198a = mVar;
        this.f80199b = fdVar;
    }

    public final C60870cx apply(Object obj) {
        C29616m mVar = this.f80198a;
        C29409fd fdVar = this.f80199b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null || fVar.f80416g.size() == 0) {
            C29045l.m53930b("%s: All slices file group unavailable or empty.", "FilteringPopulator");
            return C60866ct.f164955a;
        }
        try {
            C28708an anVar = (C28708an) mVar.f80211c.mo45889c(Uri.parse(((C28595b) fVar.f80416g.get(0)).f77799c), C42789m.m75558b(C28708an.f77994l));
            C62971cq cqVar = anVar.f78003h;
            C58480gp e = C58485gu.m89837e();
            C58485gu guVar = mVar.f80209a;
            int i = ((C58724pq) guVar).f156474d;
            int i2 = 0;
            while (i2 < i) {
                try {
                    e.mo55395g(((C29614k) guVar.get(i2)).mo34749b(cqVar));
                    i2++;
                } catch (Exception e2) {
                    C29045l.m53938j(e2, "%s: Failed to apply filter", "FilteringPopulator");
                    return C60856cj.m92899h(e2);
                }
            }
            C29604c cVar = new C29604c(mVar, fdVar, anVar, e.mo55394f(), cqVar);
            return C60922j.m93045h((C60870cx) mVar.f80212d.mo6453a(), C47810es.m84966f(cVar), C60826bg.f164896a);
        } catch (IOException e3) {
            C29045l.m53938j(e3, "%s: Failed to read file using mobstore and parsing to proto", "FilteringPopulator");
            return C60856cj.m92899h(e3);
        }
    }
}
