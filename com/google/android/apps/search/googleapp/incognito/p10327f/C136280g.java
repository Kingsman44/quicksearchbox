package com.google.android.apps.search.googleapp.incognito.p10327f;

import com.google.android.apps.search.googleapp.incognito.p10327f.p10328a.C136273a;
import com.google.android.apps.search.googleapp.incognito.p10327f.p10328a.C136274b;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.g */
/* compiled from: PG */
public final /* synthetic */ class C136280g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Optional f371100a;

    public /* synthetic */ C136280g(Optional optional) {
        this.f371100a = optional;
    }

    public final Object apply(Object obj) {
        Optional optional = this.f371100a;
        C136273a aVar = (C136273a) ((C136274b) obj).toBuilder();
        String str = (String) optional.get();
        aVar.copyOnWrite();
        C136274b bVar = (C136274b) aVar.instance;
        str.getClass();
        bVar.f371088a |= 1;
        bVar.f371089b = str;
        return (C136274b) aVar.build();
    }
}
