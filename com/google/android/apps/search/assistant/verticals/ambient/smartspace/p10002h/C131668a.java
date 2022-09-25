package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10002h;

import android.content.Intent;
import android.net.Uri;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.h.a */
/* compiled from: PG */
public final /* synthetic */ class C131668a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C50790cn f359757a;

    public /* synthetic */ C131668a(C50790cn cnVar) {
        this.f359757a = cnVar;
    }

    public final Object apply(Object obj) {
        C50790cn cnVar = this.f359757a;
        C63088z zVar = (C63088z) obj;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://www.airbnb.com/reservation/itinerary"));
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        C50731p pVar = C50731p.START_ACTIVITY;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri = intent.toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        C50818do doVar2 = C50818do.f132293H;
        rVar3.getClass();
        doVar.f132316m = rVar3;
        doVar.f132304a |= 2048;
        C50729n nVar = ((C50818do) cnVar.instance).f132314k;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        C50728m mVar = (C50728m) nVar.toBuilder();
        mVar.copyOnWrite();
        C50729n nVar2 = (C50729n) mVar.instance;
        zVar.getClass();
        nVar2.f132009a |= 16;
        nVar2.f132013e = zVar;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        C50729n nVar3 = (C50729n) mVar.build();
        nVar3.getClass();
        doVar3.f132314k = nVar3;
        doVar3.f132304a |= 512;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
