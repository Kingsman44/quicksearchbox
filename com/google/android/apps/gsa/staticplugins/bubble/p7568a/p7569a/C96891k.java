package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C96891k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f270874a;

    public /* synthetic */ C96891k(long j) {
        this.f270874a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f270874a;
        C96874a aVar = (C96874a) ((C96882b) obj).toBuilder();
        aVar.copyOnWrite();
        C96882b bVar = (C96882b) aVar.instance;
        bVar.f270856a |= 1;
        bVar.f270860e = j;
        return (C96882b) aVar.build();
    }
}
