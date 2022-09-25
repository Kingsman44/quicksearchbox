package com.google.android.apps.search.googleapp.search.settings.p10425b;

import android.content.Intent;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.b.a */
/* compiled from: PG */
public final /* synthetic */ class C137588a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137590c f374239a;

    /* renamed from: b */
    public final /* synthetic */ C137589b f374240b;

    public /* synthetic */ C137588a(C137590c cVar, C137589b bVar) {
        this.f374239a = cVar;
        this.f374240b = bVar;
    }

    public final Object apply(Object obj) {
        C137590c cVar = this.f374239a;
        C137589b bVar = this.f374240b;
        Intent intent = (Intent) obj;
        intent.addFlags(8454144);
        intent.setClassName(cVar.f374247a, bVar.f374246e);
        return intent;
    }
}
