package com.google.android.apps.gsa.opa;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58586kn;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.opa.g */
/* compiled from: PG */
public final /* synthetic */ class C83678g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C83722r f228099a;

    /* renamed from: b */
    public final /* synthetic */ Account f228100b;

    /* renamed from: c */
    public final /* synthetic */ C83723s f228101c;

    public /* synthetic */ C83678g(C83722r rVar, Account account, C83723s sVar) {
        this.f228099a = rVar;
        this.f228100b = account;
        this.f228101c = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C83722r rVar = this.f228099a;
        Account account = this.f228100b;
        C83723s sVar = this.f228101c;
        act act = (act) obj;
        C58976aa aaVar = C58975e.f156826a;
        String str = account.name;
        C49946ew ewVar = act.f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        String a = rVar.f228178g.a(ewVar);
        rVar.mo77039e(sVar, account, act);
        if (!ewVar.f129837l || ((C90021c) rVar.f228172a.mo27525b()).mo79746e(C90014bt.f247374fu)) {
            String d = rVar.f228178g.d();
            String c = rVar.f228178g.c(ewVar);
            C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
            faVar.copyOnWrite();
            C49952fb fbVar = (C49952fb) faVar.instance;
            fbVar.f129859a |= 8;
            fbVar.f129863e = false;
            faVar.copyOnWrite();
            C49952fb fbVar2 = (C49952fb) faVar.instance;
            fbVar2.f129859a |= 256;
            fbVar2.f129865g = true;
            if (!((C90021c) rVar.f228172a.mo27525b()).mo79746e(C90044cw.f248725D) || !((C90021c) rVar.f228172a.mo27525b()).mo79746e(C90014bt.f247174cF) ? !(rVar.f228178g.g(d) || (((C90021c) rVar.f228172a.mo27525b()).mo79746e(C90044cw.f248745t) && ((C90021c) rVar.f228172a.mo27525b()).mo79745c(C90044cw.f248726a).contains(C90772bp.m148310r(d)))) : !aa.h(d, (C90021c) rVar.f228172a.mo27525b())) {
                return rVar.mo77037b(account, (C49952fb) faVar.build(), a, false, sVar);
            }
            faVar.mo53376b(d);
            if (C90772bp.m148310r(d).equals(C90772bp.m148310r(a))) {
                boolean z = rVar.f228178g.b(ewVar) == null;
                faVar.copyOnWrite();
                C49952fb fbVar3 = (C49952fb) faVar.instance;
                fbVar3.f129859a |= 1024;
                fbVar3.f129866h = z;
                if (!TextUtils.isEmpty(c)) {
                    faVar.mo53376b(c);
                }
            } else {
                faVar.mo53376b(a);
                faVar.copyOnWrite();
                C49952fb fbVar4 = (C49952fb) faVar.instance;
                fbVar4.f129859a |= 1024;
                fbVar4.f129866h = true;
            }
            C58528ij E = C58528ij.m90005E(C58431eu.m89654f(new C58586kn(d, new String[]{a, C58837ba.m90858g(c)})).mo55246e(C83715k.f228165a).mo55248h());
            C58528ij E2 = C58528ij.m90005E(C58431eu.m89654f(Collections.unmodifiableList(((C49952fb) faVar.instance).f129862d)).mo55248h());
            return rVar.mo77037b(account, (C49952fb) faVar.build(), d, !C58758qx.m90645c(E, E2).isEmpty() || !C58758qx.m90645c(E2, E).isEmpty(), sVar);
        }
        String str2 = account.name;
        rVar.mo77038d(account, a, ewVar.f129830e, false, sVar);
        return C118826c.f331423b;
    }
}
