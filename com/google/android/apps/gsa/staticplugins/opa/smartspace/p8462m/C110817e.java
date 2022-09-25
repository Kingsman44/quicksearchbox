package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.e */
/* compiled from: PG */
public final /* synthetic */ class C110817e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110818f f308752a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f308753b;

    /* renamed from: c */
    public final /* synthetic */ C83741am f308754c;

    /* renamed from: d */
    public final /* synthetic */ String f308755d;

    public /* synthetic */ C110817e(C110818f fVar, C50794cr crVar, C83741am amVar, String str) {
        this.f308752a = fVar;
        this.f308753b = crVar;
        this.f308754c = amVar;
        this.f308755d = str;
    }

    public final C60870cx apply(Object obj) {
        C110818f fVar = this.f308752a;
        C50794cr crVar = this.f308753b;
        C83741am amVar = this.f308754c;
        String str = this.f308755d;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        if (C83794j.f228390c.contains(crVar)) {
            C83794j jVar = fVar.f308761d;
            if (crVar != C50794cr.CALENDAR || !jVar.mo77184w() || !jVar.mo77185x()) {
                return C60922j.m93045h(fVar.mo77109h(crVar), new C110792a(fVar, amVar, str, crVar), C60826bg.f164896a);
            }
        }
        return fVar.f308760c.mo96355F(amVar, C110818f.f308756a, str.getBytes(), crVar);
    }
}
