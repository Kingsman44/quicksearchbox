package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121217ab;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121218ac;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.libraries.assistant.p1594s.p1597b.C19143ad;
import com.google.android.libraries.assistant.p1594s.p1597b.C19145af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.a */
/* compiled from: PG */
public final /* synthetic */ class C121222a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C121237p f336749a;

    /* renamed from: b */
    public final /* synthetic */ C19145af f336750b;

    public /* synthetic */ C121222a(C121237p pVar, C19145af afVar) {
        this.f336749a = pVar;
        this.f336750b = afVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C121237p pVar = this.f336749a;
        C19145af afVar = this.f336750b;
        Boolean bool = (Boolean) obj;
        Instant a = pVar.f336774d.mo57444a();
        ArrayList arrayList = new ArrayList();
        for (C19143ad adVar : afVar.f53630a) {
            C48714bv a2 = C48714bv.m85265a(adVar.f53625a);
            if (a2 == null) {
                a2 = C48714bv.UNKNOWN_SIGNAL;
            }
            if (!pVar.f336776f.containsKey(a2)) {
                ((C59052c) ((C59052c) C121237p.f336771a.mo56226d()).mo56372aa(35755)).mo56387q("Unable to fetch signal: %s", a2.f126042j);
            } else {
                C121236o oVar = (C121236o) pVar.f336776f.get(a2);
                if (oVar.mo105095i(a)) {
                    oVar.mo105090d();
                }
                if (!oVar.mo105092f() && oVar.mo105093g(a)) {
                    oVar.mo105091e(C121220ae.f336741f);
                }
                if (adVar.f53626b || oVar.mo105096j(a)) {
                    C121217ab abVar = (C121217ab) C121218ac.f336737c.createBuilder();
                    abVar.copyOnWrite();
                    C121218ac acVar = (C121218ac) abVar.instance;
                    afVar.getClass();
                    acVar.f336740b = afVar;
                    acVar.f336739a |= 1;
                    C121218ac acVar2 = (C121218ac) abVar.build();
                    oVar.mo105097k(a);
                }
                Optional c = oVar.mo105089c();
                if (!c.isPresent() || ((C60870cx) c.get()).isCancelled()) {
                    synchronized (oVar) {
                        cxVar = C60922j.m93044g(C60856cj.m92900i(oVar.f336767c), C47810es.m84963c(new C121230i(oVar)), pVar.f336773c);
                    }
                } else {
                    cxVar = C60922j.m93044g((C60870cx) c.get(), C47810es.m84963c(new C121229h(oVar)), pVar.f336773c);
                }
                arrayList.add(cxVar);
            }
        }
        return C60922j.m93044g(C60856cj.m92906o(arrayList), C47810es.m84963c(C121231j.f336759a), pVar.f336773c);
    }
}
