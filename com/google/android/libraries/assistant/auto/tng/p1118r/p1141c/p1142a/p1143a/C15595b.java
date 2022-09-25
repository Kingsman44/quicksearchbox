package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1143a;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15595b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15596c f46636a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46637b;

    public /* synthetic */ C15595b(C15596c cVar, C15666r rVar) {
        this.f46636a = cVar;
        this.f46637b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15596c cVar = this.f46636a;
        C15666r rVar = this.f46637b;
        if (!((Boolean) cVar.f46639b.mo17428b()).booleanValue()) {
            ((C59052c) ((C59052c) C15596c.f46638a.mo56226d()).mo56372aa(46179)).mo56386p("On device answers is not enabled");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        int b = rVar.mo22476b().mo22462b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            ((C59052c) ((C59052c) C15596c.f46638a.mo56224b()).mo56372aa(46178)).mo56386p("Handling answers fulfillment through analyzer response");
            return cVar.mo22415b();
        } else if (i == 1) {
            ((C59052c) ((C59052c) C15596c.f46638a.mo56224b()).mo56372aa(46176)).mo56386p("Handling answers fulfillment through intent query");
            return cVar.mo22415b();
        } else if (i != 2) {
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            ((C59052c) ((C59052c) C15596c.f46638a.mo56224b()).mo56372aa(46177)).mo56386p("Handling answers fulfillment through conversation delta");
            return C60856cj.m92900i(C58833ax.m90834k(C51195j.f133264n));
        }
    }
}
