package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.text.TextUtils;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60944c;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C67008hq;
import com.google.speech.p5218j.C67009hr;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67017hz;
import com.google.speech.p5218j.C67179x;
import com.google.speech.p5218j.C67180y;
import com.google.speech.p5218j.C67181z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ci */
/* compiled from: PG */
public final /* synthetic */ class C103714ci implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C103717cl f288848a;

    public /* synthetic */ C103714ci(C103717cl clVar) {
        this.f288848a = clVar;
    }

    public final Object apply(Object obj) {
        C103717cl clVar = this.f288848a;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return C103717cl.m171685b("Empty auth token.");
        }
        long b = C60944c.m93089b(C103717cl.f288851a.plusMillis(clVar.f288852b.mo26870b()));
        C67179x xVar = (C67179x) C67180y.f182596f.createBuilder();
        xVar.copyOnWrite();
        C67180y yVar = (C67180y) xVar.instance;
        str.getClass();
        yVar.f182598a |= 1;
        yVar.f182599b = str;
        xVar.copyOnWrite();
        C67180y yVar2 = (C67180y) xVar.instance;
        yVar2.f182598a |= 4;
        yVar2.f182601d = "oauth2:https://www.googleapis.com/auth/googlenow";
        xVar.copyOnWrite();
        C67180y yVar3 = (C67180y) xVar.instance;
        yVar3.f182598a |= 8;
        yVar3.f182602e = b;
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67008hq hqVar = (C67008hq) C67009hr.f182157c.createBuilder();
        C67181z zVar = (C67181z) C66760aa.f181571b.createBuilder();
        zVar.mo59776b((C67180y) xVar.build());
        hqVar.copyOnWrite();
        C67009hr hrVar = (C67009hr) hqVar.instance;
        C66760aa aaVar = (C66760aa) zVar.build();
        aaVar.getClass();
        hrVar.f182160b = aaVar;
        hrVar.f182159a |= 1;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67009hr hrVar2 = (C67009hr) hqVar.build();
        hrVar2.getClass();
        hzVar.f182177b = hrVar2;
        hzVar.f182176a = 2;
        return C103717cl.m171686c((C67017hz) hsVar.build());
    }
}
