package com.google.apps.tiktok.account.data.manager;

import android.util.Pair;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.common.base.C58817ah;
import java.util.Collection;

/* renamed from: com.google.apps.tiktok.account.data.manager.v */
/* compiled from: PG */
public final /* synthetic */ class C46314v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Collection f121304a;

    public /* synthetic */ C46314v(Collection collection) {
        this.f121304a = collection;
    }

    public final Object apply(Object obj) {
        Collection collection = this.f121304a;
        C46221b bVar = (C46221b) ((C46222c) obj).toBuilder();
        return Pair.create(C46232ae.m82475k(collection, bVar), (C46222c) bVar.build());
    }
}
