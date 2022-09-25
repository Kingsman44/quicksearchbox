package com.google.android.libraries.lens.view.p2174v;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.libraries.lens.view.p2174v.C28144f;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.v.c */
/* compiled from: PG */
public final /* synthetic */ class C28141c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28144f f76558a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f76559b;

    /* renamed from: c */
    public final /* synthetic */ String f76560c;

    /* renamed from: d */
    public final /* synthetic */ C65813cq f76561d;

    public /* synthetic */ C28141c(C28144f fVar, Iterable iterable, String str, C65813cq cqVar) {
        this.f76558a = fVar;
        this.f76559b = iterable;
        this.f76560c = str;
        this.f76561d = cqVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C28144f fVar = this.f76558a;
        Iterable<C65753ak> iterable = this.f76559b;
        String str = this.f76560c;
        C65813cq cqVar = this.f76561d;
        AccountId accountId = (AccountId) obj;
        C38469m fM = ((C28144f.C28145a) C47245e.m84045a(fVar.f76567a, C28144f.C28145a.class, accountId)).mo33579fM();
        ArrayList arrayList = new ArrayList();
        for (C65753ak f : iterable) {
            arrayList.add(fM.mo41435f(f));
        }
        C47633f h = C47633f.m84733g(C60856cj.m92896e(arrayList)).mo51515h(C28142d.f76562a, fVar.f76568b);
        C29551bd bdVar = fVar.f76569c;
        if (TextUtils.isEmpty(str)) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(new Account(str, "com.google"));
        }
        C60870cx a = bdVar.mo34767a(axVar, iterable);
        C60870cx a2 = fVar.f76570d.mo41421a(accountId);
        return C47638k.m84753d(a, h, a2).mo51520a(new C28143e(a2, a, h, cqVar), fVar.f76568b);
    }
}
