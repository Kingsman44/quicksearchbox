package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import android.location.Location;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56725a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56726b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56731g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56732h;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.f */
/* compiled from: PG */
public final /* synthetic */ class C99794f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C84410n f279193a;

    public /* synthetic */ C99794f(C84410n nVar) {
        this.f279193a = nVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C84410n nVar = this.f279193a;
        Location location = (Location) obj;
        C56725a aVar = (C56725a) C56726b.f151397h.createBuilder();
        double latitude = location.getLatitude();
        aVar.copyOnWrite();
        C56726b bVar = (C56726b) aVar.instance;
        bVar.f151399a |= 2;
        bVar.f151401c = latitude;
        double longitude = location.getLongitude();
        aVar.copyOnWrite();
        C56726b bVar2 = (C56726b) aVar.instance;
        bVar2.f151399a |= 4;
        bVar2.f151402d = longitude;
        long time = location.getTime();
        aVar.copyOnWrite();
        C56726b bVar3 = (C56726b) aVar.instance;
        bVar3.f151399a |= 1;
        bVar3.f151400b = time;
        float accuracy = location.getAccuracy();
        aVar.copyOnWrite();
        C56726b bVar4 = (C56726b) aVar.instance;
        bVar4.f151399a |= 8;
        bVar4.f151403e = accuracy;
        double altitude = location.getAltitude();
        aVar.copyOnWrite();
        C56726b bVar5 = (C56726b) aVar.instance;
        bVar5.f151399a |= 16;
        bVar5.f151404f = altitude;
        float speed = location.getSpeed();
        aVar.copyOnWrite();
        C56726b bVar6 = (C56726b) aVar.instance;
        bVar6.f151399a |= 128;
        bVar6.f151405g = (double) speed;
        C56726b bVar7 = (C56726b) aVar.build();
        C56731g gVar = (C56731g) C56732h.f151417c.createBuilder();
        gVar.copyOnWrite();
        C56732h hVar = (C56732h) gVar.instance;
        bVar7.getClass();
        hVar.f151420b = bVar7;
        hVar.f151419a |= 1;
        nVar.mo77961c((C56732h) gVar.build());
    }
}
