package com.google.android.apps.gsa.search.core.google.p6790a;

import android.location.Location;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62962ci;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C85790ai implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C51303cs f231952a;

    public /* synthetic */ C85790ai(C51303cs csVar) {
        this.f231952a = csVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C51303cs csVar = this.f231952a;
        Location location = (Location) obj;
        C59071e eVar = C85799ar.f231968a;
        if (location != null) {
            C63178k kVar = (C63178k) C63179l.f170583h.createBuilder();
            C63174g gVar = (C63174g) C63175h.f170573d.createBuilder();
            long round = Math.round(location.getLatitude() * 1.0E7d);
            gVar.copyOnWrite();
            C63175h hVar = (C63175h) gVar.instance;
            hVar.f170575a |= 1;
            hVar.f170576b = (int) round;
            long round2 = Math.round(location.getLongitude() * 1.0E7d);
            gVar.copyOnWrite();
            C63175h hVar2 = (C63175h) gVar.instance;
            hVar2.f170575a |= 2;
            hVar2.f170577c = (int) round2;
            kVar.copyOnWrite();
            C63179l lVar = (C63179l) kVar.instance;
            C63175h hVar3 = (C63175h) gVar.build();
            hVar3.getClass();
            lVar.f170589e = hVar3;
            lVar.f170585a |= 16;
            long micros = TimeUnit.MILLISECONDS.toMicros(location.getTime());
            kVar.copyOnWrite();
            C63179l lVar2 = (C63179l) kVar.instance;
            lVar2.f170585a |= 4;
            lVar2.f170588d = micros;
            if (location.hasAccuracy()) {
                float accuracy = location.getAccuracy();
                kVar.copyOnWrite();
                C63179l lVar3 = (C63179l) kVar.instance;
                lVar3.f170585a |= 128;
                double d = (double) accuracy;
                Double.isNaN(d);
                lVar3.f170590f = (float) (d * 1000.0d);
            }
            C63179l lVar4 = (C63179l) kVar.build();
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            C62962ci ciVar = C51334dw.f133657N;
            lVar4.getClass();
            dwVar.f133700n = lVar4;
            dwVar.f133685a |= 8192;
        }
    }
}
