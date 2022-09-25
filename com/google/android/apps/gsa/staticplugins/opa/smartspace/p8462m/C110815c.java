package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83808x;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.c */
/* compiled from: PG */
public final /* synthetic */ class C110815c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110818f f308745a;

    /* renamed from: b */
    public final /* synthetic */ C83741am f308746b;

    /* renamed from: c */
    public final /* synthetic */ long f308747c;

    /* renamed from: d */
    public final /* synthetic */ String f308748d;

    public /* synthetic */ C110815c(C110818f fVar, C83741am amVar, long j, String str) {
        this.f308745a = fVar;
        this.f308746b = amVar;
        this.f308747c = j;
        this.f308748d = str;
    }

    public final C60870cx apply(Object obj) {
        C110818f fVar = this.f308745a;
        C83741am amVar = this.f308746b;
        long j = this.f308747c;
        String str = this.f308748d;
        C58833ax axVar = (C58833ax) obj;
        C50818do doVar = amVar.f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        long j2 = doVar.f132318o;
        if (axVar.mo56113h()) {
            C50794cr a = C50794cr.m85938a(((C83809y) axVar.mo56107c()).f228412b);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a == C50794cr.STOCK_PRICE_CHANGE && j2 - ((C83809y) axVar.mo56107c()).f228413c > Duration.ofMinutes(j).toMillis()) {
                ((C58970a) ((C58970a) fVar.f308762e.mo56224b()).mo56372aa(26784)).mo56389s("The stock price change card should be dismissed. DismissalMetadata: %s", axVar.mo56107c());
                return C60856cj.m92900i(true);
            }
        }
        C83808x xVar = (C83808x) C83809y.f228409d.createBuilder();
        C50794cr crVar = C50794cr.STOCK_PRICE_CHANGE;
        xVar.copyOnWrite();
        C83809y yVar = (C83809y) xVar.instance;
        yVar.f228412b = crVar.f132222T;
        yVar.f228411a |= 1;
        xVar.copyOnWrite();
        C83809y yVar2 = (C83809y) xVar.instance;
        yVar2.f228411a |= 2;
        yVar2.f228413c = j2;
        fVar.mo77112k(str, (C83809y) xVar.build(), Duration.ofHours(10).toMinutes());
        return C60856cj.m92900i(false);
    }
}
