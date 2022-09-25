package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.a */
/* compiled from: PG */
public final /* synthetic */ class C110876a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110886k f308887a;

    /* renamed from: b */
    public final /* synthetic */ String f308888b;

    public /* synthetic */ C110876a(C110886k kVar, String str) {
        this.f308887a = kVar;
        this.f308888b = str;
    }

    public final C60870cx apply(Object obj) {
        C110886k kVar = this.f308887a;
        String str = this.f308888b;
        C118826c cVar = (C118826c) obj;
        ((C58970a) ((C58970a) kVar.f308909e.mo56224b()).mo56372aa(26818)).mo56389s("removeFromCardStore %s", str);
        if (!kVar.f308905a.mo77183v()) {
            return kVar.f308907c.mo77108g(str);
        }
        return kVar.f308906b.mo98832c(str);
    }
}
