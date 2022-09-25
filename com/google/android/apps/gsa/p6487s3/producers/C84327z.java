package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.search.core.p6809l.C86156e;
import com.google.android.apps.gsa.search.core.p6809l.C86157f;
import com.google.android.apps.gsa.search.core.p6809l.C86158g;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.s3.producers.z */
/* compiled from: PG */
public final class C84327z {

    /* renamed from: a */
    public static final C59071e f229493a = C59071e.m91332i("com.google.android.apps.gsa.s3.producers.z");

    /* renamed from: a */
    public static final List m134528a(C86159h hVar, C90021c cVar, C90931ca caVar, C9318f fVar, int i, C68214a aVar) {
        C86159h hVar2 = hVar;
        C9318f fVar2 = fVar;
        if (!((C87541c) hVar2.f232834c.mo27525b()).f236453o.mo17531h(fVar2)) {
            C59104x d = f229493a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3RequestUpdatesSchdlr");
            ((C59052c) ((C59052c) d).mo56372aa(7262)).mo56389s("The discourse context does not have the future for: %s", fVar2);
            return Collections.emptyList();
        }
        C58872ci d2 = C58872ci.m90947d(C58274c.f155808a);
        C58480gp e = C58485gu.m89837e();
        SettableFuture settableFuture = new SettableFuture();
        m134530c(hVar, cVar, settableFuture, fVar, caVar, i, aVar);
        e.mo55395g(settableFuture);
        if (fVar2 == C9318f.CONTEXTUAL) {
            SettableFuture settableFuture2 = new SettableFuture();
            m134530c(hVar, cVar, settableFuture2, C9318f.SCREENSHOT, caVar, i, aVar);
            e.mo55395g(settableFuture2);
        }
        C90931ca caVar2 = caVar;
        caVar.mo85142g(settableFuture, new C86157f(hVar));
        C58485gu f = e.mo55394f();
        if (hVar2.f232836e.isEmpty()) {
            C59104x d3 = C86159h.f232831a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "DiscourseContextHelper");
            ((C59052c) ((C59052c) d3).mo56372aa(7658)).mo56386p("Not logging AssistDataCdcCreation: monitoring event not present");
        } else {
            C60870cx a = C47638k.m84752c(f).mo51520a(new C86156e(hVar, f, fVar2), hVar2.f232835d);
            C86158g gVar = new C86158g(hVar, fVar2, d2);
            C60856cj.m92911t(a, C47810es.m84974n(gVar), hVar2.f232835d);
        }
        return f;
    }

    /* renamed from: b */
    public static final List m134529b(C86159h hVar, C90931ca caVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new SettableFuture());
        C58485gu j = C58485gu.m89842j(linkedList);
        C60870cx b = hVar.mo79793b();
        caVar.mo85143h(b, new C84325x(b, hVar, linkedList));
        return j;
    }

    /* renamed from: c */
    private static void m134530c(C86159h hVar, C90021c cVar, SettableFuture settableFuture, C9318f fVar, C90931ca caVar, int i, C68214a aVar) {
        C84322u uVar = new C84322u("assistDataUpdate-".concat(String.valueOf(String.valueOf(fVar))), hVar, fVar, settableFuture, cVar, aVar);
        C58976aa aaVar = C58975e.f156826a;
        C60870cx d = caVar.mo85139d(uVar);
        if (i >= 0) {
            caVar.mo85137b(new C84323v(settableFuture, aVar, fVar, d), (long) i);
        }
    }
}
