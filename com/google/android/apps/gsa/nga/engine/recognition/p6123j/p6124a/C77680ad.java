package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.ay.p;
import com.google.android.apps.gsa.nga.engine.p5977ay.C75180c;
import com.google.android.apps.gsa.nga.engine.p5977ay.C75181f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82855cy;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C77680ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ p f213965a;

    public /* synthetic */ C77680ad(p pVar) {
        this.f213965a = pVar;
    }

    public final void run() {
        p pVar = this.f213965a;
        ((C58970a) ((C58970a) p.a.mo56224b()).mo56372aa(5531)).mo56386p("startHotwordRecognition()");
        C83334w wVar = pVar.f;
        C82887ec ecVar = C82887ec.HOTWORD_RESTART_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82855cy cyVar = C82855cy.f225927a;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        cyVar.getClass();
        eaVar.f225980b = cyVar;
        eaVar.f225979a = 81;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
        pVar.h.mo28212l("[NGA] ngaStartHotwordRecognition", new C75181f(pVar, C75180c.f209623a));
    }
}
