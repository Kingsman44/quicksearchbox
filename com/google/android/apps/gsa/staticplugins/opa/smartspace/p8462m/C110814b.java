package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83808x;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.b */
/* compiled from: PG */
public final /* synthetic */ class C110814b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110818f f308743a;

    /* renamed from: b */
    public final /* synthetic */ String f308744b;

    public /* synthetic */ C110814b(C110818f fVar, String str) {
        this.f308743a = fVar;
        this.f308744b = str;
    }

    public final C60870cx apply(Object obj) {
        C110818f fVar = this.f308743a;
        String str = this.f308744b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C50794cr a = C50794cr.m85938a(((C83809y) axVar.mo56107c()).f228412b);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a == C50794cr.WEATHER_ALERT) {
                ((C58970a) ((C58970a) fVar.f308762e.mo56224b()).mo56372aa(26783)).mo56389s("The weather alert card should be dismissed. DismissalMetadata: %s", axVar.mo56107c());
                return C60856cj.m92900i(true);
            }
        }
        ((C58970a) ((C58970a) fVar.f308762e.mo56224b()).mo56372aa(26782)).mo56386p("The weather alert card should not be dismissed.");
        C83808x xVar = (C83808x) C83809y.f228409d.createBuilder();
        C50794cr crVar = C50794cr.WEATHER_ALERT;
        xVar.copyOnWrite();
        C83809y yVar = (C83809y) xVar.instance;
        yVar.f228412b = crVar.f132222T;
        yVar.f228411a |= 1;
        fVar.f308760c.mo96357H(str.getBytes(), ((C83809y) xVar.build()).toByteArray(), C110818f.f308757b);
        return C60856cj.m92900i(false);
    }
}
