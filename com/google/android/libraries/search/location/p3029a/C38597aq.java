package com.google.android.libraries.search.location.p3029a;

import android.accounts.Account;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p3094q.p3095a.C39901f;
import com.google.android.libraries.search.p3094q.p3095a.C39902g;
import com.google.android.libraries.search.p3094q.p3095a.C39903h;
import com.google.android.libraries.search.p3094q.p3095a.C39904i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.location.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C38597aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102023a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f102024b;

    public /* synthetic */ C38597aq(C38622bn bnVar, C58833ax axVar) {
        this.f102023a = bnVar;
        this.f102024b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C38622bn bnVar = this.f102023a;
        C58833ax axVar = this.f102024b;
        Account account = (Account) obj;
        if (Objects.equals(account, C38622bn.f102054b)) {
            bnVar.mo41523c(C37173a.f96788h.mo40779c(), axVar);
            C39904i iVar = bnVar.f102059g;
            return C47633f.m84733g(C47633f.m84733g(C47633f.m84733g(iVar.f104919f.mo46990b()).mo51516i(new C39902g(iVar), iVar.f104915b).mo51514f(Throwable.class, C39903h.f104913a, iVar.f104915b)).mo51515h(C39901f.f104911a, iVar.f104915b)).mo51514f(Throwable.class, new C38595ao(bnVar, axVar), bnVar.f102055c).mo51516i(new C38596ap(bnVar, axVar), bnVar.f102055c);
        } else if (bnVar.f102063k.mo119362j(bnVar.f102057e, 212600000) != 0) {
            return bnVar.mo41521a(false);
        } else {
            bnVar.mo41523c(C37173a.f96789i.mo40779c(), axVar);
            return C47633f.m84733g(C47633f.m84733g(bnVar.mo41525e(account, false)).mo51516i(C38614bf.f102050a, bnVar.f102055c).mo51514f(C38616bh.class, C38615bg.f102051a, bnVar.f102055c)).mo51514f(Throwable.class, new C38603aw(bnVar, axVar), bnVar.f102055c).mo51516i(new C38604ax(bnVar, axVar), bnVar.f102055c);
        }
    }
}
