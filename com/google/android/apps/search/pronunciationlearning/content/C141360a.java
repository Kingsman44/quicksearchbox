package com.google.android.apps.search.pronunciationlearning.content;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.a */
/* compiled from: PG */
public final /* synthetic */ class C141360a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f383756a;

    public /* synthetic */ C141360a(String str) {
        this.f383756a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f383756a;
        C141372m mVar = (C141372m) obj;
        if (mVar == null) {
            mVar = C141372m.f383778b;
        }
        if (mVar.f383780a.contains(str)) {
            return mVar;
        }
        C141371l lVar = (C141371l) mVar.toBuilder();
        lVar.copyOnWrite();
        C141372m mVar2 = (C141372m) lVar.instance;
        str.getClass();
        mVar2.mo116391a();
        mVar2.f383780a.add(str);
        return (C141372m) lVar.build();
    }
}
