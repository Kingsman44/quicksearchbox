package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114732b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115009bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115010bn;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115033cj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.u */
/* compiled from: PG */
public final class C115083u extends C114966q {
    public C115083u(Context context, C114709cj cjVar, C114604by byVar, C114712cm cmVar, C114742l lVar, C68214a aVar, C22871g gVar, C114732b bVar, C114748b bVar2, C114839ci ciVar, C114796at atVar, C68214a aVar2, C114865dh dhVar, C108226ax axVar, boolean z, C114119ax axVar2) {
        super(context, cjVar, byVar, cmVar, lVar, aVar, gVar, bVar, bVar2, ciVar, atVar, aVar2, dhVar, axVar, z, axVar2);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C58485gu mo101757i(C58485gu guVar, C87546b bVar) {
        C58480gp e = C58485gu.m89837e();
        int i = 0;
        while (i < guVar.size()) {
            C114758l lVar = (C114758l) guVar.get(i);
            if (lVar instanceof C115033cj) {
                if (i < guVar.size() - 1) {
                    int i2 = i + 1;
                    if (guVar.get(i2) instanceof C115033cj) {
                        mo101759p(e, (C114758l) null, C58485gu.m89847o(lVar, (C114758l) guVar.get(i2)), bVar);
                        i = i2;
                    }
                }
                mo101759p(e, (C114758l) null, C58485gu.m89846n(lVar), bVar);
            } else {
                mo101759p(e, lVar, (C58485gu) null, bVar);
            }
            i++;
        }
        C114604by byVar = this.f319043h;
        C91097g gVar = this.f319054s;
        C58976aa aaVar = C58975e.f156826a;
        C115010bn bnVar = byVar.f317886a;
        Context context = (Context) bnVar.f319216a.mo17428b();
        context.getClass();
        Activity activity = (Activity) bnVar.f319217b.mo17428b();
        activity.getClass();
        C58833ax axVar = (C58833ax) bnVar.f319218c.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) bnVar.f319219d.mo17428b();
        axVar2.getClass();
        gVar.getClass();
        e.mo55395g((C114757k) ((C58847bk) C58833ax.m90834k(new C115009bm(context, activity, axVar, axVar2, gVar))).f156646a);
        return e.mo55394f();
    }
}
