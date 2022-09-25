package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.util.concurrent.C60866ct;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.f */
/* compiled from: PG */
public final /* synthetic */ class C100867f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100872k f281849a;

    /* renamed from: b */
    public final /* synthetic */ Account f281850b;

    public /* synthetic */ C100867f(C100872k kVar, Account account) {
        this.f281849a = kVar;
        this.f281850b = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100872k kVar = this.f281849a;
        Account account = this.f281850b;
        act act = (act) obj;
        HashSet c = C100872k.m167105c(act);
        C49893cx cxVar = act.f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        List<C49879cj> list = (List) Collection.EL.stream(cxVar.f129690a).filter(new C100852a(c)).collect(Collectors.toCollection(C100863b.f281844a));
        if (list.isEmpty()) {
            return C60866ct.f164955a;
        }
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        for (C49879cj cjVar : list) {
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            C49875cf a = C49875cf.m85755a(cjVar.f129638i);
            if (a == null) {
                a = C49875cf.UNKNOWN;
            }
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            dgVar.f129716c = a.f129621v;
            dgVar.f129714a |= 2;
            String str = cjVar.f129631b;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            str.getClass();
            dgVar2.f129714a |= 1;
            dgVar2.f129715b = str;
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            cnVar.copyOnWrite();
            C49891cv cvVar = (C49891cv) cnVar.instance;
            cvVar.f129664b |= 67108864;
            cvVar.f129661L = false;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            C49891cv cvVar2 = (C49891cv) cnVar.build();
            cvVar2.getClass();
            dgVar3.f129719f = cvVar2;
            dgVar3.f129714a |= 32;
            daVar.mo53372c((C49903dg) dfVar.build());
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        return kVar.mo92077b((acx) acw.build(), account);
    }
}
