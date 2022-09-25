package com.google.android.libraries.search.feedback.bugreport;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import java.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.g */
/* compiled from: PG */
public final /* synthetic */ class C38330g implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Map f101508a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f101509b;

    public /* synthetic */ C38330g(Map map, AccountId accountId) {
        this.f101508a = map;
        this.f101509b = accountId;
    }

    public final void accept(Object obj, Object obj2) {
        Map map = this.f101508a;
        AccountId accountId = this.f101509b;
        String str = (String) obj;
        C46675m mVar = (C46675m) obj2;
        if (!map.containsKey(str)) {
            int a = accountId.mo50068a();
            map.put(str + "_" + a, mVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
