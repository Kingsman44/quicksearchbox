package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.titan;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9767g.p9768a.C128872b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.titan.b */
/* compiled from: PG */
public final /* synthetic */ class C82112b implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        AccountId accountId = (AccountId) obj;
        C69664n.m101061g(accountId, "accountId");
        C128872b bVar = new C128872b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
