package com.google.android.apps.gsa.opa;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opa.i */
/* compiled from: PG */
public final /* synthetic */ class C83708i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C83722r f228160a;

    /* renamed from: b */
    public final /* synthetic */ C83723s f228161b;

    /* renamed from: c */
    public final /* synthetic */ Account f228162c;

    public /* synthetic */ C83708i(C83722r rVar, C83723s sVar, Account account) {
        this.f228160a = rVar;
        this.f228161b = sVar;
        this.f228162c = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C83722r rVar = this.f228160a;
        C83723s sVar = this.f228161b;
        Account account = this.f228162c;
        act act = (act) obj;
        rVar.mo77039e(sVar, account, act);
        C58976aa aaVar = C58975e.f156826a;
        String str = account.name;
        C49946ew ewVar = act.f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        String a = rVar.f228178g.a(ewVar);
        String languageTag = rVar.f228176e.d(account.name).toLanguageTag();
        String F = ((C86054o) rVar.f228173b.mo27525b()).mo79659F();
        if (((C89994f) rVar.f228175d.mo27525b()).mo83848K() && !a.equals(languageTag) && F != null && F.equals(account.name)) {
            sVar.copyOnWrite();
            C83811t tVar = C83811t.f228414h;
            ((C83811t) sVar.instance).f228420e = true;
            ((C84559s) rVar.f228177f.mo27525b()).mo78312c(a, EventForDump.m147676e(3, "OPA primary assistant language change " + a + " by syncing assistant language back to local."));
        }
        rVar.mo77041g(account, a, ewVar.f129830e, sVar);
        rVar.mo77040f(sVar);
        return C118826c.f331422a;
    }
}
