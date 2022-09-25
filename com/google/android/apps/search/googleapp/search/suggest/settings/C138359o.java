package com.google.android.apps.search.googleapp.search.suggest.settings;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.o */
/* compiled from: PG */
public final /* synthetic */ class C138359o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f376418a;

    public /* synthetic */ C138359o(boolean z) {
        this.f376418a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f376418a;
        C138361q qVar = (C138361q) ((C138362r) obj).toBuilder();
        qVar.copyOnWrite();
        C138362r rVar = (C138362r) qVar.instance;
        rVar.f376424a |= 1;
        rVar.f376425b = z;
        return (C138362r) qVar.build();
    }
}
