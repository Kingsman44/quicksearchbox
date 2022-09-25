package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C29528ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80020a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f80021b;

    /* renamed from: c */
    public final /* synthetic */ String f80022c;

    public /* synthetic */ C29528ai(C29538as asVar, C65753ak akVar, String str) {
        this.f80020a = asVar;
        this.f80021b = akVar;
        this.f80022c = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80020a;
        C65753ak akVar = this.f80021b;
        String str = this.f80022c;
        List<Account> list = (List) obj;
        if (list.isEmpty()) {
            C29045l.m53932d("%s: Account was not provided, skipping private sync for corpus: %s, configuration: %s", "GddFileGroupPopulator", akVar.name(), str);
            return C60866ct.f164955a;
        }
        C60870cx cxVar = C60866ct.f164955a;
        ArrayList arrayList = new ArrayList();
        for (Account account : list) {
            cxVar = C29670b.m54719g(C60856cj.m92907p(cxVar)).mo34822i(new C29525af(asVar, account, akVar, str), asVar.f80054a).mo34822i(new C29526ag(asVar, account, akVar, str), asVar.f80054a);
            arrayList.add(cxVar);
        }
        return C29672d.m54726a(arrayList).mo34824b(new C29527ah(arrayList), asVar.f80054a);
    }
}
