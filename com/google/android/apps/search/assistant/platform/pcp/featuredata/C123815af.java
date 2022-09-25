package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.af */
/* compiled from: PG */
public final /* synthetic */ class C123815af implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123819aj f342043a;

    public /* synthetic */ C123815af(C123819aj ajVar) {
        this.f342043a = ajVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C123624c.m202992a(this.f342043a.f342050d, (AccountId) obj).mo106074a(C58495hd.m89900n(100002, C58485gu.m89846n("tips_data_id")));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
