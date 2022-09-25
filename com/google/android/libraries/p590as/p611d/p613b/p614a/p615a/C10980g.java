package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.as.d.b.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C10980g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f36117a;

    public /* synthetic */ C10980g(boolean z) {
        this.f36117a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f36117a;
        C10975b bVar = (C10975b) ((C10976c) obj).toBuilder();
        bVar.copyOnWrite();
        C10976c cVar = (C10976c) bVar.instance;
        cVar.f36109a |= 1;
        cVar.f36110b = z;
        return (C10976c) bVar.build();
    }
}
