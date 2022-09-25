package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110602bg;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.ar */
/* compiled from: PG */
public final /* synthetic */ class C110810ar implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308723a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308724b;

    /* renamed from: c */
    public final /* synthetic */ C83800p f308725c;

    public /* synthetic */ C110810ar(C110812at atVar, C58872ci ciVar, C83800p pVar) {
        this.f308723a = atVar;
        this.f308724b = ciVar;
        this.f308725c = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308723a;
        C58872ci ciVar = this.f308724b;
        C83800p pVar = this.f308725c;
        String str = (String) obj;
        atVar.f308739m.mo109923au(ciVar.mo56158a(TimeUnit.MILLISECONDS), false);
        atVar.f308737k.mo77192a(C118569b.SMARTSPACE_WEATHER_UPDATE_STORAGE, 1);
        C110602bg bgVar = atVar.f308728b;
        ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26614)).mo56386p("CrossProfileServiceManagerMediator#handleWeatherCardUpdate");
        return bgVar.f308276a.mo98791c(pVar);
    }
}
