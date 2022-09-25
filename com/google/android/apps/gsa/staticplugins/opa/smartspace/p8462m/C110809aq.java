package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58872ci;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.aq */
/* compiled from: PG */
public final /* synthetic */ class C110809aq implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308720a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308721b;

    /* renamed from: c */
    public final /* synthetic */ C83800p f308722c;

    public /* synthetic */ C110809aq(C110812at atVar, C58872ci ciVar, C83800p pVar) {
        this.f308720a = atVar;
        this.f308721b = ciVar;
        this.f308722c = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308720a;
        C58872ci ciVar = this.f308721b;
        C83800p pVar = this.f308722c;
        String str = (String) obj;
        atVar.f308739m.mo109923au(ciVar.mo56158a(TimeUnit.MILLISECONDS), false);
        atVar.f308737k.mo77192a(C118569b.SMARTSPACE_WEATHER_UPDATE_STORAGE, 1);
        return atVar.f308731e.mo98916a(pVar);
    }
}
