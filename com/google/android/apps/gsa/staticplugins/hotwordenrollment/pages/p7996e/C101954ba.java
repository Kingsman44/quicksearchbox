package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.text.TextUtils;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C67008hq;
import com.google.speech.p5218j.C67009hr;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67017hz;
import com.google.speech.p5218j.C67179x;
import com.google.speech.p5218j.C67180y;
import com.google.speech.p5218j.C67181z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ba */
/* compiled from: PG */
public final /* synthetic */ class C101954ba implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101959bf f284450a;

    public /* synthetic */ C101954ba(C101959bf bfVar) {
        this.f284450a = bfVar;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C21370a aVar = this.f284450a.f284471g;
        if (TextUtils.isEmpty(str)) {
            return C101959bf.m168726l("Empty auth token.");
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(C101959bf.f284456b + aVar.mo26870b());
        C67181z zVar = (C67181z) C66760aa.f181571b.createBuilder();
        C67179x xVar = (C67179x) C67180y.f182596f.createBuilder();
        str.getClass();
        xVar.copyOnWrite();
        C67180y yVar = (C67180y) xVar.instance;
        yVar.f182598a |= 1;
        yVar.f182599b = str;
        xVar.copyOnWrite();
        C67180y yVar2 = (C67180y) xVar.instance;
        yVar2.f182598a |= 4;
        yVar2.f182601d = "oauth2:https://www.googleapis.com/auth/googlenow";
        xVar.copyOnWrite();
        C67180y yVar3 = (C67180y) xVar.instance;
        yVar3.f182598a |= 8;
        yVar3.f182602e = micros;
        zVar.mo59775a(xVar);
        C66760aa aaVar = (C66760aa) zVar.build();
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67008hq hqVar = (C67008hq) C67009hr.f182157c.createBuilder();
        hqVar.copyOnWrite();
        C67009hr hrVar = (C67009hr) hqVar.instance;
        aaVar.getClass();
        hrVar.f182160b = aaVar;
        hrVar.f182159a |= 1;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67009hr hrVar2 = (C67009hr) hqVar.build();
        hrVar2.getClass();
        hzVar.f182177b = hrVar2;
        hzVar.f182176a = 2;
        return (C67017hz) hsVar.build();
    }
}
