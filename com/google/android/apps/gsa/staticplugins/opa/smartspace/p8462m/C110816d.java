package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.d */
/* compiled from: PG */
public final /* synthetic */ class C110816d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110818f f308749a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f308750b;

    /* renamed from: c */
    public final /* synthetic */ String f308751c;

    public /* synthetic */ C110816d(C110818f fVar, C50794cr crVar, String str) {
        this.f308749a = fVar;
        this.f308750b = crVar;
        this.f308751c = str;
    }

    public final C60870cx apply(Object obj) {
        C110818f fVar = this.f308749a;
        C50794cr crVar = this.f308750b;
        String str = this.f308751c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C50794cr a = C50794cr.m85938a(((C83809y) axVar.mo56107c()).f228412b);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a == crVar) {
                ((C58970a) ((C58970a) fVar.f308762e.mo56224b()).mo56372aa(26785)).mo56354G("The card should be dismissed. DismissalMetadata: %s, cardId: %s", axVar.mo56107c(), str);
                return C60856cj.m92900i(true);
            }
        }
        return C60856cj.m92900i(false);
    }
}
