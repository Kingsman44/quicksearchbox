package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a;

import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.p10453e.C138079a;
import com.google.common.base.C58890d;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.a.f */
/* compiled from: PG */
public final class C138373f {
    /* renamed from: a */
    public static C138678v m224788a(String str, List list) {
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        uVar.copyOnWrite();
        C138678v vVar = (C138678v) uVar.instance;
        str.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str;
        Iterator it = list.iterator();
        int i = 10;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
            asVar.copyOnWrite();
            C138030av avVar = (C138030av) asVar.instance;
            str2.getClass();
            avVar.f375538a |= 1;
            avVar.f375539b = str2;
            String a = C138079a.m224412a(str, str2);
            asVar.copyOnWrite();
            C138030av avVar2 = (C138030av) asVar.instance;
            avVar2.f375538a |= 2;
            avVar2.f375540c = a;
            C138029au auVar = C138029au.QUERY;
            asVar.copyOnWrite();
            C138030av avVar3 = (C138030av) asVar.instance;
            avVar3.f375541d = auVar.f375534n;
            avVar3.f375538a |= 4;
            asVar.mo114079a(C64369b.SUBTYPE_SUGGEST_2G_LITE);
            C138032ax axVar = C138032ax.PRIMARY;
            asVar.copyOnWrite();
            C138030av avVar4 = (C138030av) asVar.instance;
            avVar4.f375547k = axVar.f375579B;
            avVar4.f375538a |= 128;
            C138034az azVar = C138034az.SUGGEST_2G_LITE;
            asVar.copyOnWrite();
            C138030av avVar5 = (C138030av) asVar.instance;
            avVar5.f375545i = azVar.f375590i;
            avVar5.f375538a |= 32;
            String c = C58890d.m90988c(str2);
            asVar.copyOnWrite();
            C138030av avVar6 = (C138030av) asVar.instance;
            c.getClass();
            avVar6.f375538a |= 16;
            avVar6.f375544h = c;
            asVar.copyOnWrite();
            C138030av avVar7 = (C138030av) asVar.instance;
            avVar7.f375538a |= 64;
            avVar7.f375546j = i;
            uVar.mo114310b(asVar);
            i--;
            if (i <= 0) {
                break;
            }
        }
        return (C138678v) uVar.build();
    }
}
