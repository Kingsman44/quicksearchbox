package com.google.android.apps.gsa.staticplugins.p8019j;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ap */
/* compiled from: PG */
public final /* synthetic */ class C102554ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102560av f286233a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f286234b;

    /* renamed from: c */
    public final /* synthetic */ Query f286235c;

    public /* synthetic */ C102554ap(C102560av avVar, C58833ax axVar, Query query) {
        this.f286233a = avVar;
        this.f286234b = axVar;
        this.f286235c = query;
    }

    public final C60870cx apply(Object obj) {
        return C2169h.m6027a(new C102552an(this.f286233a, this.f286234b, (AccountId) obj, this.f286235c));
    }
}
