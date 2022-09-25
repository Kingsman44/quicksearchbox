package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58872ci;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.z */
/* compiled from: PG */
public final /* synthetic */ class C110838z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308803a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308804b;

    /* renamed from: c */
    public final /* synthetic */ C50738bc f308805c;

    public /* synthetic */ C110838z(C110812at atVar, C58872ci ciVar, C50738bc bcVar) {
        this.f308803a = atVar;
        this.f308804b = ciVar;
        this.f308805c = bcVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308803a;
        C58872ci ciVar = this.f308804b;
        C50738bc bcVar = this.f308805c;
        String str = (String) obj;
        atVar.f308739m.mo109923au(ciVar.mo56158a(TimeUnit.MILLISECONDS), true);
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        if (a.equals(C50701am.HEADPHONE_CONTEXT)) {
            atVar.f308738l.mo77077a("7/9: Stored media chip in content store.");
        }
        return atVar.f308730d.mo98831b(C83800p.m133473k().mo77042a());
    }
}
