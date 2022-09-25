package com.google.android.apps.search.assistant.surfaces.bisto.p9389b;

import android.content.ComponentName;
import android.content.Intent;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.b.b */
/* compiled from: PG */
public final /* synthetic */ class C124534b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124535c f343605a;

    public /* synthetic */ C124534b(C124535c cVar) {
        this.f343605a = cVar;
    }

    public final Object apply(Object obj) {
        C124535c cVar = this.f343605a;
        Intent intent = (Intent) obj;
        ComponentName component = intent.getComponent();
        if (component != null && cVar.f343608c.f343614e.getPackageName().equals(component.getPackageName())) {
            cVar.f343608c.f343614e.getPackageManager().setComponentEnabledSetting(component, 1, 1);
        }
        return GatewayHandler.GatewayDestination.m84514b(intent);
    }
}
