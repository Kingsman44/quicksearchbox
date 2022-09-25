package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.hardware.SensorEvent;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.m */
/* compiled from: PG */
public final /* synthetic */ class C107362m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107363n f298802a;

    /* renamed from: b */
    public final /* synthetic */ SensorEvent f298803b;

    public /* synthetic */ C107362m(C107363n nVar, SensorEvent sensorEvent) {
        this.f298802a = nVar;
        this.f298803b = sensorEvent;
    }

    public final void run() {
        C107354e eVar;
        C107363n nVar = this.f298802a;
        boolean z = false;
        float f = this.f298803b.values[0];
        C107364o oVar = nVar.f298804a;
        float floatValue = oVar.f298810f.floatValue();
        if (f >= 0.0f && f < floatValue) {
            z = true;
        }
        int i = true != z ? 2 : 1;
        if (oVar.f298811g == 1 && i == 2 && (eVar = oVar.f298812h) != null) {
            C107359j jVar = eVar.f298768a;
            C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
            C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder();
            C17920v vVar = C17920v.f51335j;
            pVar.copyOnWrite();
            C17881ak akVar = (C17881ak) pVar.instance;
            vVar.getClass();
            akVar.f51234b = vVar;
            akVar.f51233a |= 1;
            C17873ac acVar = (C17873ac) C17880aj.f51221i.createBuilder();
            acVar.copyOnWrite();
            C17880aj ajVar = (C17880aj) acVar.instance;
            ajVar.f51224b = 1;
            ajVar.f51223a |= 1;
            pVar.copyOnWrite();
            C17881ak akVar2 = (C17881ak) pVar.instance;
            C17880aj ajVar2 = (C17880aj) acVar.build();
            ajVar2.getClass();
            akVar2.f51235c = ajVar2;
            akVar2.f51233a = 2 | akVar2.f51233a;
            alVar.copyOnWrite();
            C17883am amVar = (C17883am) alVar.instance;
            C17881ak akVar3 = (C17881ak) pVar.build();
            akVar3.getClass();
            amVar.f51246c = akVar3;
            amVar.f51245b = 3;
            synchronized (jVar.f298785h) {
                C107357h hVar = jVar.f298781d;
                if (hVar != null) {
                    String str = hVar.f298773b;
                    alVar.copyOnWrite();
                    C17883am amVar2 = (C17883am) alVar.instance;
                    str.getClass();
                    amVar2.f51244a = 1 | amVar2.f51244a;
                    amVar2.f51247d = str;
                }
                jVar.mo95978g((C17883am) alVar.build());
            }
        }
        oVar.f298811g = i;
    }
}
