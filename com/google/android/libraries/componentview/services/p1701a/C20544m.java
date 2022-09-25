package com.google.android.libraries.componentview.services.p1701a;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20475f;
import com.google.android.libraries.componentview.p1699f.C20511a;
import com.google.android.libraries.componentview.p1699f.C20514b;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.componentview.services.a.m */
/* compiled from: PG */
public final class C20544m implements C20537f {

    /* renamed from: a */
    private final C20514b f57703a;

    /* renamed from: b */
    private final C20601ca f57704b;

    public C20544m(C69464a aVar, C20601ca caVar) {
        this.f57703a = (C20514b) aVar.mo17428b();
        this.f57704b = caVar;
    }

    /* renamed from: d */
    private final C20470a m38540d(C56425d dVar) {
        C20511a a = this.f57703a.mo25100a(dVar);
        if (a != null) {
            return a.mo25109a(dVar);
        }
        int i = dVar.f150539a;
        if (!((i & 2) == 0 || (i & 4) == 0)) {
            C56429h hVar = dVar.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            if (!BuildConfig.FLAVOR.equals(hVar.f150556h)) {
                C56429h hVar2 = dVar.f150542d;
                if (hVar2 == null) {
                    hVar2 = C56429h.f150547k;
                }
                C56425d dVar2 = dVar.f150541c;
                if (dVar2 == null) {
                    dVar2 = C56425d.f150537g;
                }
                C56429h hVar3 = dVar2.f150542d;
                if (hVar3 == null) {
                    hVar3 = C56429h.f150547k;
                }
                if (hVar2.equals(hVar3)) {
                    C56425d dVar3 = dVar.f150541c;
                    if (dVar3 == null) {
                        dVar3 = C56425d.f150537g;
                    }
                    C56424c cVar = (C56424c) dVar3.toBuilder();
                    String str = dVar.f150544f;
                    cVar.copyOnWrite();
                    C56425d dVar4 = (C56425d) cVar.instance;
                    str.getClass();
                    dVar4.f150539a |= 8;
                    dVar4.f150544f = str;
                    return m38540d((C56425d) cVar.build());
                }
                C56425d dVar5 = dVar.f150541c;
                if (((dVar5 == null ? C56425d.f150537g : dVar5).f150539a & 4) == 0) {
                    if (dVar5 == null) {
                        dVar5 = C56425d.f150537g;
                    }
                    C56424c cVar2 = (C56424c) dVar5.toBuilder();
                    C56429h hVar4 = dVar.f150542d;
                    if (hVar4 == null) {
                        hVar4 = C56429h.f150547k;
                    }
                    cVar2.copyOnWrite();
                    C56425d dVar6 = (C56425d) cVar2.instance;
                    hVar4.getClass();
                    dVar6.f150542d = hVar4;
                    dVar6.f150539a |= 4;
                    String str2 = dVar.f150544f;
                    cVar2.copyOnWrite();
                    C56425d dVar7 = (C56425d) cVar2.instance;
                    str2.getClass();
                    dVar7.f150539a |= 8;
                    dVar7.f150544f = str2;
                    return m38540d((C56425d) cVar2.build());
                }
                C20614e eVar = new C20614e();
                eVar.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
                eVar.f57822b = String.format("Server side component: %s and its implRoot both have logInfo. Component not created.", new Object[]{dVar.f150540b});
                C20520h.m38498c("SimpleComponentInflator", eVar.mo25531a(), this.f57704b, new Object[0]);
                return null;
            }
        }
        C20614e eVar2 = new C20614e();
        eVar2.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
        eVar2.f57822b = String.format("Unrecognized element: %s. Component not created.", new Object[]{dVar.f150540b});
        C20520h.m38498c("SimpleComponentInflator", eVar2.mo25531a(), this.f57704b, new Object[0]);
        return null;
    }

    /* renamed from: e */
    private final C20470a m38541e(C56425d dVar) {
        C20470a d = m38540d(dVar);
        if (d == null) {
            return null;
        }
        if (d instanceof C20475f) {
            ((C20475f) d).mo25240kB();
        }
        return d;
    }

    /* renamed from: f */
    private static void m38542f(C20470a aVar, C20536e eVar) {
        View kH = aVar.mo25098kH();
        if (kH != null) {
            kH.getViewTreeObserver().addOnPreDrawListener(new C20543l(aVar, kH, eVar));
        }
    }

    /* renamed from: a */
    public final C20470a mo25450a(C20470a aVar, C56425d dVar) {
        if (aVar.mo25420I() != null) {
            C56424c cVar = (C56424c) dVar.toBuilder();
            String I = aVar.mo25420I();
            I.getClass();
            cVar.copyOnWrite();
            C56425d dVar2 = (C56425d) cVar.instance;
            dVar2.f150539a |= 8;
            dVar2.f150544f = I;
            dVar = (C56425d) cVar.build();
        }
        C20470a e = m38541e(dVar);
        if (e != null) {
            e.f57587y = aVar;
        }
        return e;
    }

    /* renamed from: b */
    public final C20470a mo25451b(C20470a aVar, C56425d dVar, C20536e eVar) {
        C20470a a = mo25450a(aVar, dVar);
        if (a != null) {
            m38542f(a, eVar);
        }
        return a;
    }

    /* renamed from: c */
    public final C20470a mo25452c(C56425d dVar) {
        C20470a e = m38541e(dVar);
        if (e != null) {
            if (e instanceof C20475f) {
                ((C20475f) e).mo25239kA().isEmpty();
            }
            m38542f(e, (C20536e) null);
        }
        return e;
    }
}
