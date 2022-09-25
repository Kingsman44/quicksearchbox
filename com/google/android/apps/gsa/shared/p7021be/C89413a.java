package com.google.android.apps.gsa.shared.p7021be;

import com.google.android.apps.gsa.shared.p7021be.C89421i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58817ah;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.shared.be.a */
/* compiled from: PG */
public final /* synthetic */ class C89413a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C89421i f242398a;

    public /* synthetic */ C89413a(C89421i iVar) {
        this.f242398a = iVar;
    }

    public final Object apply(Object obj) {
        C89421i iVar = this.f242398a;
        AccountId accountId = (AccountId) obj;
        return (Map) Stream.CC.concat(Collection.EL.stream(((C89421i.C89422a) C47245e.m84045a(iVar.f242407b, C89421i.C89422a.class, accountId)).mo83329iV().entrySet()), Collection.EL.stream(((C89421i.C89422a) C47245e.m84045a(iVar.f242407b, C89421i.C89422a.class, accountId)).mo83330iX().entrySet())).collect(Collectors.toMap(C89416d.f242401a, C89417e.f242402a, C89418f.f242403a, C89419g.f242404a));
    }
}
