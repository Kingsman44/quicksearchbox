package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C29526ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80015a;

    /* renamed from: b */
    public final /* synthetic */ Account f80016b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f80017c;

    /* renamed from: d */
    public final /* synthetic */ String f80018d;

    public /* synthetic */ C29526ag(C29538as asVar, Account account, C65753ak akVar, String str) {
        this.f80015a = asVar;
        this.f80016b = account;
        this.f80017c = akVar;
        this.f80018d = str;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80015a;
        Account account = this.f80016b;
        C65753ak akVar = this.f80017c;
        String str = this.f80018d;
        C29045l.m53932d("%s: Performing private sync for corpus: %s, account: %s", "GddFileGroupPopulator", akVar.name(), account.name);
        return asVar.mo34764a(C29670b.m54719g((C60870cx) asVar.f80056c.mo6453a()).mo34822i(new C29521ab(asVar, account, (String) obj, akVar), asVar.f80054a).mo34822i(new C29522ac(asVar, C58872ci.m90947d(asVar.f80064k), account, akVar), asVar.f80054a).mo34822i(new C29523ad(asVar, akVar, str), asVar.f80054a), C28737bo.GDD_FAIL_IN_SYNC_RUNNER_PRIVATE, akVar, str);
    }
}
