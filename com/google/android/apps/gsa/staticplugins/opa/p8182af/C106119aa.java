package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.C108783dq;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.aa */
/* compiled from: PG */
public final /* synthetic */ class C106119aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106122ad f296136a;

    /* renamed from: b */
    public final /* synthetic */ C106124af f296137b;

    public /* synthetic */ C106119aa(C106122ad adVar, C106124af afVar) {
        this.f296136a = adVar;
        this.f296137b = afVar;
    }

    public final void onClick(View view) {
        C106122ad adVar = this.f296136a;
        C106124af afVar = this.f296137b;
        ((SharedPreferences) adVar.f296147d.mo27525b()).edit().putBoolean("opa_blocking_language_picker_has_been_clicked", true).apply();
        String str = afVar.f296165a;
        if (adVar.f296145b.mo79746e(C90044cw.f248740o) && adVar.f296154k.containsKey(str)) {
            C108783dq dqVar = adVar.f296155l;
            C59071e eVar = C109040fj.f303210a;
            C58976aa aaVar = C58975e.f156826a;
            C113855cj k = C113858cm.m188476k();
            dqVar.f302510a.f303324be.mo95320a();
            dqVar.f302510a.mo97453aO();
            k.mo100705c((String) adVar.f296154k.get(str));
            k.mo100706d(QueryTriggerType.INTENT);
            k.mo100704b(true);
            dqVar.f302510a.mo97548u(k.mo100703a());
        } else if (!adVar.f296151h) {
            adVar.f296151h = true;
            if (str != null && !str.isEmpty()) {
                acw acw = (acw) acx.f128971H.createBuilder();
                C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
                faVar.copyOnWrite();
                C49952fb fbVar = (C49952fb) faVar.instance;
                fbVar.f129859a |= 8;
                fbVar.f129863e = false;
                acw.copyOnWrite();
                acx acx = (acx) acw.instance;
                C49952fb fbVar2 = (C49952fb) faVar.build();
                fbVar2.getClass();
                acx.f128999p = fbVar2;
                acx.f128984a |= 65536;
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                C49952fb fbVar3 = ((acx) acw.instance).f128999p;
                if (fbVar3 == null) {
                    fbVar3 = C49952fb.f129857j;
                }
                C49951fa faVar2 = (C49951fa) fbVar3.toBuilder();
                faVar2.mo53375a(arrayList);
                acw.copyOnWrite();
                acx acx2 = (acx) acw.instance;
                C49952fb fbVar4 = (C49952fb) faVar2.build();
                fbVar4.getClass();
                acx2.f128999p = fbVar4;
                acx2.f128984a |= 65536;
                adVar.f296148e.n(adVar.f296149f, (acx) acw.build(), new C106120ab(adVar, str), adVar.getClass().getSimpleName());
            }
        }
    }
}
