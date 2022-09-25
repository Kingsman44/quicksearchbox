package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.a.c.b.j */
/* compiled from: PG */
public final /* synthetic */ class C32185j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C32186k f86386a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f86387b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f86388c;

    public /* synthetic */ C32185j(C32186k kVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f86386a = kVar;
        this.f86387b = cxVar;
        this.f86388c = cxVar2;
    }

    public final Object call() {
        C32186k kVar = this.f86386a;
        C60870cx cxVar = this.f86387b;
        C60870cx cxVar2 = this.f86388c;
        C46215j b = ((C46108a) C60856cj.m92909r(cxVar)).mo50210b();
        if ("incognito".equals(b.f121165j)) {
            return ValidationResult.m82127d();
        }
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar.mo56113h()) {
            if (((String) axVar.mo56107c()).equals(kVar.f86389a.mo50217e(b))) {
                return ValidationResult.m82127d();
            }
            throw new C46054v(new C32209j("Selected account doesn't match the primary search account"));
        } else if (b.f121165j.equals("pseudonymous")) {
            return ValidationResult.m82127d();
        } else {
            throw new C46054v(new C32209j("Selected account is not pseudonymous even though there's no signed in search account."));
        }
    }
}
