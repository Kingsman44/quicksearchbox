package com.google.android.apps.search.googleapp.config;

import com.google.android.apps.search.googleapp.config.p10148a.C133661a;
import com.google.android.apps.search.googleapp.config.p10148a.C133662b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.config.c */
/* compiled from: PG */
public final /* synthetic */ class C133664c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f364077a;

    public /* synthetic */ C133664c(String str) {
        this.f364077a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f364077a;
        C133661a aVar = (C133661a) ((C133662b) obj).toBuilder();
        aVar.copyOnWrite();
        C133662b bVar = (C133662b) aVar.instance;
        str.getClass();
        bVar.f364074a |= 1;
        bVar.f364075b = str;
        return (C133662b) aVar.build();
    }
}
