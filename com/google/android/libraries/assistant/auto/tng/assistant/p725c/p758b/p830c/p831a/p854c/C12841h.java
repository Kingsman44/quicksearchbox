package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import androidx.p104d.p105a.C2164c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4552o.C59799g;
import com.google.common.p4552o.C60003j;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.h */
/* compiled from: PG */
final class C12841h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C59799g f40075a;

    /* renamed from: b */
    final /* synthetic */ C2164c f40076b;

    public C12841h(C59799g gVar, C2164c cVar) {
        this.f40075a = gVar;
        this.f40076b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59799g gVar = this.f40075a;
            gVar.copyOnWrite();
            C60003j jVar = (C60003j) gVar.instance;
            C60003j jVar2 = C60003j.f162165g;
            jVar.f162170d = 3;
            jVar.f162167a |= 4;
            int i = C52235kf.CANCELLED.f137088t;
            gVar.copyOnWrite();
            C60003j jVar3 = (C60003j) gVar.instance;
            jVar3.f162167a = 2 | jVar3.f162167a;
            jVar3.f162169c = i;
        } else {
            C59799g gVar2 = this.f40075a;
            gVar2.copyOnWrite();
            C60003j jVar4 = (C60003j) gVar2.instance;
            C60003j jVar5 = C60003j.f162165g;
            jVar4.f162170d = 2;
            jVar4.f162167a |= 4;
            int i2 = C52235kf.UNKNOWN.f137088t;
            gVar2.copyOnWrite();
            C60003j jVar6 = (C60003j) gVar2.instance;
            jVar6.f162167a = 2 | jVar6.f162167a;
            jVar6.f162169c = i2;
        }
        this.f40076b.mo5437b((C60003j) this.f40075a.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int i;
        C52070ec ecVar = (C52070ec) obj;
        C59799g gVar = this.f40075a;
        gVar.copyOnWrite();
        C60003j jVar = (C60003j) gVar.instance;
        C60003j jVar2 = C60003j.f162165g;
        jVar.f162170d = 1;
        jVar.f162167a |= 4;
        C2164c cVar = this.f40076b;
        C59799g gVar2 = this.f40075a;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        if (a == C52235kf.IGNORE) {
            i = 0;
        } else {
            C52236kg kgVar2 = ecVar.f136654b;
            if (kgVar2 == null) {
                kgVar2 = C52236kg.f137089d;
            }
            C52235kf a2 = C52235kf.m86549a(kgVar2.f137092b);
            if (a2 == null) {
                a2 = C52235kf.OK;
            }
            i = a2.f137088t;
        }
        gVar2.copyOnWrite();
        C60003j jVar3 = (C60003j) gVar2.instance;
        jVar3.f162167a |= 2;
        jVar3.f162169c = i;
        cVar.mo5437b((C60003j) gVar2.build());
    }
}
