package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3745ab.C48274cb;
import com.google.assistant.p3745ab.C48275cc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.p */
/* compiled from: PG */
public final /* synthetic */ class C93284p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93286r f260124a;

    /* renamed from: b */
    public final /* synthetic */ C48274cb f260125b;

    /* renamed from: c */
    public final /* synthetic */ long f260126c;

    /* renamed from: d */
    public final /* synthetic */ ModularAction f260127d;

    public /* synthetic */ C93284p(C93286r rVar, C48274cb cbVar, long j, ModularAction modularAction) {
        this.f260124a = rVar;
        this.f260125b = cbVar;
        this.f260126c = j;
        this.f260127d = modularAction;
    }

    public final void run() {
        C93286r rVar = this.f260124a;
        C48274cb cbVar = this.f260125b;
        long j = this.f260126c;
        ModularAction modularAction = this.f260127d;
        long c = C93286r.m153397c(C93286r.f260128a);
        if (c != 0) {
            cbVar.copyOnWrite();
            C48275cc ccVar = (C48275cc) cbVar.instance;
            C48275cc ccVar2 = C48275cc.f124856g;
            ccVar.f124858a |= 2;
            ccVar.f124860c = c;
            boolean z = c != j;
            cbVar.copyOnWrite();
            C48275cc ccVar3 = (C48275cc) cbVar.instance;
            ccVar3.f124858a |= 16;
            ccVar3.f124863f = z;
        }
        rVar.mo87614e(C89849ae.OPA_APP_USAGE_REPORT_CAMERA_DONE, modularAction, (C48275cc) cbVar.build());
    }
}
