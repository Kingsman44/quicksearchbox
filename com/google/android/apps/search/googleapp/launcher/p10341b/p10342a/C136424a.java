package com.google.android.apps.search.googleapp.launcher.p10341b.p10342a;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136425b;
import com.google.android.libraries.search.logging.C38828b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C136424a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C136425b f371397a;

    public /* synthetic */ C136424a(C136425b bVar) {
        this.f371397a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((C136425b.C136426a) C47245e.m84045a(this.f371397a.f371400c, C136425b.C136426a.class, (AccountId) obj)).mo113015ge().mo41619a(C38828b.GOOGLE_APP);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
