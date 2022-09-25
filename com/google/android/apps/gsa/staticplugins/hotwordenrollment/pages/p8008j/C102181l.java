package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.p6482q.p6483a.C84230c;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.assistant.p3861at.C50162mw;
import com.google.assistant.p3861at.C50163mx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.l */
/* compiled from: PG */
public final /* synthetic */ class C102181l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102186q f285056a;

    /* renamed from: b */
    public final /* synthetic */ boolean f285057b;

    public /* synthetic */ C102181l(C102186q qVar, boolean z) {
        this.f285056a = qVar;
        this.f285057b = z;
    }

    public final C60870cx apply(Object obj) {
        C102186q qVar = this.f285056a;
        boolean z = this.f285057b;
        C84230c d = C84231d.m134279d();
        d.mo77684b(((C84231d) obj).mo77688c());
        C50162mw mwVar = (C50162mw) C50163mx.f130405e.createBuilder();
        mwVar.copyOnWrite();
        C50163mx mxVar = (C50163mx) mwVar.instance;
        mxVar.f130407a |= 8;
        mxVar.f130409c = z;
        mwVar.copyOnWrite();
        C50163mx mxVar2 = (C50163mx) mwVar.instance;
        mxVar2.f130407a |= 4;
        mxVar2.f130408b = false;
        d.mo77685c((C50163mx) mwVar.build());
        return ((C84232e) qVar.f285064b.mo56107c()).mo77701j(d.mo77683a());
    }
}
