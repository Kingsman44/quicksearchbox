package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.t */
/* compiled from: PG */
public final /* synthetic */ class C31005t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ MdiOwnersLoader f83501a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f83502b;

    public /* synthetic */ C31005t(MdiOwnersLoader mdiOwnersLoader, C58817ah ahVar) {
        this.f83501a = mdiOwnersLoader;
        this.f83502b = ahVar;
    }

    public final C60870cx apply(Object obj) {
        MdiOwnersLoader mdiOwnersLoader = this.f83501a;
        C58817ah ahVar = this.f83502b;
        List<Account> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (Account a : list) {
            arrayList.add((C60870cx) ahVar.apply(mdiOwnersLoader.f83458a.mo34308a(a)));
        }
        return C47638k.m84750a(arrayList).mo51520a(new C31008w(mdiOwnersLoader, list, arrayList), C60826bg.f164896a);
    }
}
