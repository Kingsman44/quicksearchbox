package com.google.android.apps.gsa.searchbox.client.gsa.p6951a.p6952a;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.p6952a.C88625b;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e.C137984d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C88624a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Context f239586a;

    public /* synthetic */ C88624a(Context context) {
        this.f239586a = context;
    }

    public final C60870cx apply(Object obj) {
        C58833ax ho = ((C88625b.C88626a) C47245e.m84045a(this.f239586a, C88625b.C88626a.class, (AccountId) obj)).mo82290ho();
        if (ho.mo56113h()) {
            return ((C137984d) ho.mo56107c()).mo114069a();
        }
        return C60856cj.m92900i(-1);
    }
}
