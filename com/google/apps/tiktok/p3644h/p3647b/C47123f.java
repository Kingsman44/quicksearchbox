package com.google.apps.tiktok.p3644h.p3647b;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import com.google.frameworks.client.data.android.p4632a.C61333a;

/* renamed from: com.google.apps.tiktok.h.b.f */
/* compiled from: PG */
public final /* synthetic */ class C47123f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46128f f122728a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f122729b;

    public /* synthetic */ C47123f(C46128f fVar, C58833ax axVar) {
        this.f122728a = fVar;
        this.f122729b = axVar;
    }

    public final Object apply(Object obj) {
        C46128f fVar = this.f122728a;
        C58833ax axVar = this.f122729b;
        C46108a aVar = (C46108a) obj;
        if (aVar.mo50210b().f121165j.equals("pseudonymous")) {
            return C61333a.m93822c();
        }
        if (aVar.mo50210b().f121165j.equals("incognito")) {
            return C61333a.m93821b();
        }
        C58838bb.m90890y(((String) ((C58847bk) axVar).f156646a).equals(aVar.mo50210b().f121165j), "OAuth authentication failed because account type did not match the @GcoreAccountType that was bound, @GcoreAccountType: %s, account: %s", aVar, axVar);
        String e = fVar.mo50217e(aVar.mo50210b());
        if (e != null) {
            return C61333a.m93820a(e);
        }
        throw new IllegalStateException("Attempting to get context for unrecognized account type: ".concat(String.valueOf(aVar.mo50210b().f121165j)));
    }
}
