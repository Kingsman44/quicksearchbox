package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8252g;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7259c.C92087c;
import com.google.android.apps.gsa.smartspace.p7259c.C92088d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.g.e */
/* compiled from: PG */
public final class C106775e implements C106745c {

    /* renamed from: a */
    public final C68214a f297559a;

    /* renamed from: b */
    private final C106773c f297560b;

    public C106775e(C106773c cVar, C68214a aVar) {
        this.f297560b = cVar;
        this.f297559a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo95634a(C50706ar arVar, ViewGroup viewGroup) {
        Optional optional;
        Object obj;
        Optional empty;
        Object obj2;
        if (arVar == null) {
            optional = Optional.empty();
        } else {
            C62940bt r0 = C62942bv.checkIsLite(C92088d.f256726e);
            arVar.mo58887l(r0);
            if (!arVar.f169962ag.mo58857o(r0.f169971d)) {
                optional = Optional.empty();
            } else {
                C62940bt r02 = C62942bv.checkIsLite(C92088d.f256726e);
                arVar.mo58887l(r02);
                Object l = arVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l);
                }
                C92088d dVar = (C92088d) obj2;
                if ((dVar.f256728a & 1) != 0) {
                    optional = Optional.m71637of(dVar.f256729b);
                } else {
                    optional = Optional.empty();
                }
            }
        }
        String str = (String) optional.orElseGet(new C106774d(this));
        if (arVar == null) {
            empty = Optional.empty();
        } else {
            C62940bt r03 = C62942bv.checkIsLite(C92088d.f256726e);
            arVar.mo58887l(r03);
            if (!arVar.f169962ag.mo58857o(r03.f169971d)) {
                empty = Optional.empty();
            } else {
                C62940bt r04 = C62942bv.checkIsLite(C92088d.f256726e);
                arVar.mo58887l(r04);
                Object l2 = arVar.f169962ag.mo58854l(r04.f169971d);
                if (l2 == null) {
                    obj = r04.f169969b;
                } else {
                    obj = r04.mo58889c(l2);
                }
                C92088d dVar2 = (C92088d) obj;
                if ((dVar2.f256728a & 2) != 0) {
                    C92087c cVar = dVar2.f256730c;
                    if (cVar == null) {
                        cVar = C92087c.f256720c;
                    }
                    empty = Optional.m71637of(cVar);
                } else {
                    empty = Optional.empty();
                }
            }
        }
        Optional optional2 = empty;
        C106773c cVar2 = this.f297560b;
        C87568k kVar = (C87568k) cVar2.f297554a.mo17428b();
        kVar.getClass();
        C83564a aVar = (C83564a) cVar2.f297555b.mo17428b();
        aVar.getClass();
        C92125t tVar = (C92125t) cVar2.f297556c.mo17428b();
        tVar.getClass();
        Context context = (Context) cVar2.f297557d.mo17428b();
        context.getClass();
        str.getClass();
        optional2.getClass();
        viewGroup.getClass();
        return C60856cj.m92900i(C58485gu.m89846n(new C106772b(kVar, aVar, tVar, context, str, optional2, viewGroup)));
    }
}
