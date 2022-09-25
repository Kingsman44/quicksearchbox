package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.assistant.shared.l.w;
import com.google.android.apps.gsa.assistant.shared.l.x;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.aae;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaf;
import com.google.android.apps.gsa.search.shared.service.p6935b.aag;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.aw */
/* compiled from: PG */
public final /* synthetic */ class C107871aw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107873ay f300159a;

    public /* synthetic */ C107871aw(C107873ay ayVar) {
        this.f300159a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107873ay ayVar = this.f300159a;
        List<BundledMessageNotification> list = (List) obj;
        if (list.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
        }
        aaf aaf = (aaf) aag.f237071b.createBuilder();
        for (BundledMessageNotification bundledMessageNotification : list) {
            w createBuilder = x.k.createBuilder();
            String obj2 = bundledMessageNotification.mo84116f().toString();
            createBuilder.copyOnWrite();
            x xVar = createBuilder.instance;
            obj2.getClass();
            xVar.a |= 1;
            xVar.b = obj2;
            String j = bundledMessageNotification.mo84120j();
            createBuilder.copyOnWrite();
            x xVar2 = createBuilder.instance;
            xVar2.a |= 2;
            xVar2.c = j;
            String g = bundledMessageNotification.mo84117g();
            createBuilder.copyOnWrite();
            x xVar3 = createBuilder.instance;
            xVar3.a |= 4;
            xVar3.d = g;
            String h = bundledMessageNotification.mo84118h();
            createBuilder.copyOnWrite();
            x xVar4 = createBuilder.instance;
            xVar4.a |= 16;
            xVar4.f = h;
            boolean m = bundledMessageNotification.mo84123m();
            createBuilder.copyOnWrite();
            x xVar5 = createBuilder.instance;
            xVar5.a |= 64;
            xVar5.g = m;
            if (bundledMessageNotification.mo84110a() != 0) {
                long a = bundledMessageNotification.mo84110a();
                createBuilder.copyOnWrite();
                x xVar6 = createBuilder.instance;
                xVar6.a |= 8;
                xVar6.e = a;
            }
            if (bundledMessageNotification.mo84115e() != null) {
                String obj3 = bundledMessageNotification.mo84115e().toString();
                createBuilder.copyOnWrite();
                x xVar7 = createBuilder.instance;
                obj3.getClass();
                xVar7.a |= 128;
                xVar7.h = obj3;
            }
            String i = bundledMessageNotification.mo84119i();
            if (i != null) {
                createBuilder.copyOnWrite();
                x xVar8 = createBuilder.instance;
                xVar8.a |= 256;
                xVar8.i = i;
            }
            if (bundledMessageNotification.mo84112c() != null) {
                String obj4 = bundledMessageNotification.mo84112c().f252543t.toString();
                createBuilder.copyOnWrite();
                x xVar9 = createBuilder.instance;
                obj4.getClass();
                xVar9.a |= 512;
                xVar9.j = obj4;
            }
            x build = createBuilder.build();
            aaf.copyOnWrite();
            aag aag = (aag) aaf.instance;
            build.getClass();
            C62971cq cqVar = aag.f237073a;
            if (!cqVar.mo58948c()) {
                aag.f237073a = C62942bv.mutableCopy(cqVar);
            }
            aag.f237073a.add(build);
        }
        C87684al alVar = new C87684al(C88244um.VALID_UNREAD_MESSAGES);
        alVar.mo81965b(aae.f237070a, (aag) aaf.build());
        ((C107932g) ayVar.f300163c.mo27525b()).mo96337a(alVar.mo81964a());
    }
}
