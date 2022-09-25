package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.p8262a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a.h */
/* compiled from: PG */
public final /* synthetic */ class C107027h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107035p f298045a;

    public /* synthetic */ C107027h(C107035p pVar) {
        this.f298045a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C107035p pVar = this.f298045a;
        Optional optional = (Optional) obj;
        if (optional != null && !optional.isEmpty()) {
            return pVar.f298061c.mo95725a((C106596h) optional.get());
        }
        ((C58970a) ((C58970a) pVar.f298064f.mo56224b()).mo56372aa(23453)).mo56386p("No UserContext was restored.");
        return C118826c.f331423b;
    }
}
