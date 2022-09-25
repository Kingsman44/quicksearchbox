package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C106459ay implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106460az f296942a;

    public /* synthetic */ C106459ay(C106460az azVar) {
        this.f296942a = azVar;
    }

    public final Object apply(Object obj) {
        C106460az azVar = this.f296942a;
        Boolean bool = (Boolean) obj;
        boolean z = false;
        if (!C83794j.m133428E(azVar.f296943a)) {
            ((C58970a) ((C58970a) azVar.f296944b.mo56226d()).mo56372aa(23090)).mo56386p("Missing WAA permission.");
        } else if (bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
