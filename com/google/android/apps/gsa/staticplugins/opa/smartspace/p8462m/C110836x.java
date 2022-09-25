package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58872ci;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.x */
/* compiled from: PG */
public final /* synthetic */ class C110836x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308797a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308798b;

    /* renamed from: c */
    public final /* synthetic */ C50818do f308799c;

    /* renamed from: d */
    public final /* synthetic */ C83800p f308800d;

    public /* synthetic */ C110836x(C110812at atVar, C58872ci ciVar, C50818do doVar, C83800p pVar) {
        this.f308797a = atVar;
        this.f308798b = ciVar;
        this.f308799c = doVar;
        this.f308800d = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308797a;
        C58872ci ciVar = this.f308798b;
        C50818do doVar = this.f308799c;
        C83800p pVar = this.f308800d;
        String str = (String) obj;
        atVar.f308739m.mo109923au(ciVar.mo56158a(TimeUnit.MILLISECONDS), false);
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (a.equals(C50794cr.CALENDAR)) {
            atVar.f308737k.mo77192a(C118569b.SMARTSPACE_CALENDAR_UPDATE_STORAGE, 1);
        }
        return atVar.f308731e.mo98916a(pVar);
    }
}
