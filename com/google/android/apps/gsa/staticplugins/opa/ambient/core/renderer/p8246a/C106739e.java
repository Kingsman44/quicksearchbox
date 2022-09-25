package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8246a;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83761d;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.a.e */
/* compiled from: PG */
public final class C106739e implements C106745c {

    /* renamed from: a */
    private final C106738d f297463a;

    public C106739e(C106738d dVar) {
        this.f297463a = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo95634a(C50706ar arVar, ViewGroup viewGroup) {
        C58485gu guVar;
        Object obj;
        if (arVar == null) {
            guVar = C58485gu.m89845m();
        } else {
            C106738d dVar = this.f297463a;
            C62940bt r0 = C62942bv.checkIsLite(C83761d.f228302c);
            arVar.mo58887l(r0);
            Object l = arVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C83761d dVar2 = (C83761d) obj;
            C83564a aVar = (C83564a) dVar.f297460a.mo17428b();
            aVar.getClass();
            C92125t tVar = (C92125t) dVar.f297461b.mo17428b();
            tVar.getClass();
            Context context = (Context) dVar.f297462c.mo17428b();
            context.getClass();
            dVar2.getClass();
            guVar = C58485gu.m89846n(new C106737c(aVar, tVar, context, dVar2));
        }
        return C60856cj.m92900i(guVar);
    }
}
