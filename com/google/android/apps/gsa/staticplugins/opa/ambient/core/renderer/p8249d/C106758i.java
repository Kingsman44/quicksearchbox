package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83773p;
import com.google.android.apps.gsa.p8839t.p8840a.C118340b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.i */
/* compiled from: PG */
public final class C106758i implements C106745c {

    /* renamed from: a */
    private final C106757h f297524a;

    public C106758i(C106757h hVar) {
        this.f297524a = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo95634a(C50706ar arVar, ViewGroup viewGroup) {
        Object obj;
        if (arVar == null) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C106757h hVar = this.f297524a;
        C62940bt r1 = C62942bv.checkIsLite(C83773p.f228328c);
        arVar.mo58887l(r1);
        Object l = arVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C83773p pVar = (C83773p) obj;
        C107698i iVar = (C107698i) hVar.f297516a.mo17428b();
        iVar.getClass();
        Query query = (Query) hVar.f297517b.mo17428b();
        query.getClass();
        C118340b bVar = (C118340b) hVar.f297518c.mo17428b();
        bVar.getClass();
        C86124t tVar = (C86124t) hVar.f297519d.mo17428b();
        tVar.getClass();
        Context context = (Context) hVar.f297520e.mo17428b();
        context.getClass();
        C92125t tVar2 = (C92125t) hVar.f297521f.mo17428b();
        tVar2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) hVar.f297522g).f184585a);
        a.getClass();
        C83564a aVar = (C83564a) hVar.f297523h.mo17428b();
        aVar.getClass();
        pVar.getClass();
        viewGroup.getClass();
        return C60856cj.m92900i(C58485gu.m89846n(new C106756g(iVar, query, bVar, tVar, context, tVar2, a, aVar, pVar, viewGroup)));
    }
}
