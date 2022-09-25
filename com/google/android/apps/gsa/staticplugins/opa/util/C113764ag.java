package com.google.android.apps.gsa.staticplugins.opa.util;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ag */
/* compiled from: PG */
public final class C113764ag {
    /* renamed from: a */
    public static boolean m188330a(String str, C86124t tVar) {
        C58485gu c = tVar.mo79745c(C90014bt.f247586ju);
        C58976aa aaVar = C58975e.f156826a;
        return C90772bp.m148274A(c, str);
    }

    /* renamed from: b */
    public static void m188331b(ae aeVar, l lVar, Account account, String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        aeVar.f(account.name, forLanguageTag);
        aeVar.e(account.name, C58485gu.m89846n(forLanguageTag));
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
        lVar.n(account, (acx) acw.build(), new C113763af(), "LanguageUtils");
    }
}
