package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C49924ea;
import com.google.assistant.p3861at.C49925eb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dg */
/* compiled from: PG */
public final /* synthetic */ class C96157dg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96162dl f269180a;

    public /* synthetic */ C96157dg(C96162dl dlVar) {
        this.f269180a = dlVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96162dl dlVar = this.f269180a;
        if (((C124548d) obj).mo106513k() != C124719q.GACS_DEVICE) {
            C89636g.m145900f(dlVar.f269186b, dlVar.f269189e, C124633az.OOBE_FINISHED);
            return ((C89496ch) dlVar.f269187c.mo27525b()).mo83410p(dlVar.f269189e, C96156df.f269179a, dlVar.f269195k);
        } else if (dlVar.f269192h) {
            C58833ax a = ((C83893b) dlVar.f269193i.mo27525b()).mo77278a();
            if (!a.mo56113h() || C58837ba.m90859h(((Account) a.mo56107c()).name)) {
                C59104x c = C96162dl.f269185a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "EnableDeviceSequence");
                ((C59052c) ((C59052c) c).mo56372aa(16969)).mo56386p("Account sync enabled, but no account present");
                return C60856cj.m92899h(new TimeoutException());
            }
            C58833ax j = C58833ax.m90833j(((C86106b) dlVar.f269194j.mo27525b()).mo79728c(((Account) a.mo56107c()).name));
            C60870cx cxVar = C60866ct.f164955a;
            C63138d dVar = dlVar.f269196l;
            if (!(dVar == null || (dVar.f170496a & 4) == 0)) {
                Account account = (Account) a.mo56107c();
                C63138d dVar2 = dlVar.f269196l;
                C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
                if (j.mo56113h()) {
                    C49924ea eaVar = (C49924ea) C49925eb.f129768c.createBuilder();
                    String str = (String) j.mo56107c();
                    eaVar.copyOnWrite();
                    C49925eb ebVar = (C49925eb) eaVar.instance;
                    str.getClass();
                    ebVar.f129770a |= 1;
                    ebVar.f129771b = str;
                    cnVar.copyOnWrite();
                    C49891cv cvVar = (C49891cv) cnVar.instance;
                    C49925eb ebVar2 = (C49925eb) eaVar.build();
                    ebVar2.getClass();
                    cvVar.f129660K = ebVar2;
                    cvVar.f129664b |= C89885b.NOW_VALUE;
                }
                if ((dVar2.f170496a & 8) != 0) {
                    String str2 = dVar2.f170501f;
                    cnVar.copyOnWrite();
                    C49891cv cvVar2 = (C49891cv) cnVar.instance;
                    str2.getClass();
                    cvVar2.f129663a |= 1;
                    cvVar2.f129665c = str2;
                }
                acw acw = (acw) acx.f128971H.createBuilder();
                C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
                C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
                C49875cf cfVar = C49875cf.ASSISTANT_SDK;
                dfVar.copyOnWrite();
                C49903dg dgVar = (C49903dg) dfVar.instance;
                dgVar.f129716c = cfVar.f129621v;
                dgVar.f129714a |= 2;
                String str3 = dVar2.f170500e;
                dfVar.copyOnWrite();
                C49903dg dgVar2 = (C49903dg) dfVar.instance;
                str3.getClass();
                dgVar2.f129714a |= 1;
                dgVar2.f129715b = str3;
                dfVar.copyOnWrite();
                C49903dg dgVar3 = (C49903dg) dfVar.instance;
                C49891cv cvVar3 = (C49891cv) cnVar.build();
                cvVar3.getClass();
                dgVar3.f129719f = cvVar3;
                dgVar3.f129714a |= 32;
                daVar.mo53372c((C49903dg) dfVar.build());
                acw.copyOnWrite();
                acx acx = (acx) acw.instance;
                C49898db dbVar = (C49898db) daVar.build();
                dbVar.getClass();
                acx.f128991h = dbVar;
                acx.f128984a |= 32;
                cxVar = ((l) dlVar.f269191g.mo27525b()).d(account, (acx) acw.build(), dlVar.f269195k, TimeUnit.MILLISECONDS, "Bisto-".concat(String.valueOf(dlVar.getClass().getSimpleName())));
                C60856cj.m92911t(cxVar, new C96161dk(dlVar), dlVar.f269190f);
            }
            return C60922j.m93045h(cxVar, new C96154dd(dlVar, a, j), dlVar.f269190f);
        } else {
            Context context = dlVar.f269186b;
            String str4 = dlVar.f269189e;
            C58836b bVar = C58836b.f156633a;
            C89636g.m145901g(context, str4, false, bVar, bVar);
            return ((C89496ch) dlVar.f269187c.mo27525b()).mo83410p(dlVar.f269189e, C96160dj.f269183a, dlVar.f269195k);
        }
    }
}
