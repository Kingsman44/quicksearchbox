package com.google.apps.tiktok.account.data.manager;

import android.util.Pair;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import java.util.Collection;

/* renamed from: com.google.apps.tiktok.account.data.manager.ad */
/* compiled from: PG */
public final /* synthetic */ class C46231ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Collection f121197a;

    public /* synthetic */ C46231ad(Collection collection) {
        this.f121197a = collection;
    }

    public final Object apply(Object obj) {
        Collection collection = this.f121197a;
        C46221b bVar = (C46221b) ((C46222c) obj).toBuilder();
        C58495hd j = C46232ae.m82474j(collection, bVar);
        C46232ae.m82477o(collection, bVar);
        return Pair.create(j, (C46222c) bVar.build());
    }
}
