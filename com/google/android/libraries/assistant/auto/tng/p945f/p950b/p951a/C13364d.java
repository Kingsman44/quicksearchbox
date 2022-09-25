package com.google.android.libraries.assistant.auto.tng.p945f.p950b.p951a;

import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f.p842b.p843a.C12764a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.b.a.d */
/* compiled from: PG */
final class C13364d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13365e f41106a;

    public C13364d(C13365e eVar) {
        this.f41106a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        for (C12764a aVar : this.f41106a.f41110b) {
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        if (!a.equals(C52235kf.OK)) {
            C52236kg kgVar2 = ecVar.f136654b;
            if (kgVar2 == null) {
                kgVar2 = C52236kg.f137089d;
            }
            C52235kf a2 = C52235kf.m86549a(kgVar2.f137092b);
            if (a2 == null) {
                a2 = C52235kf.OK;
            }
            if (!a2.equals(C52235kf.IGNORE)) {
                for (C12764a aVar : this.f41106a.f41110b) {
                }
                return;
            }
        }
        for (C12764a aVar2 : this.f41106a.f41110b) {
            C46459k.m82829b(aVar2.f39923a.mo20101f(new Intent("com.google.android.voicesearch.SEND_MESSAGE_VIA_COMPOSE_GEARHEAD")), "Could not find activity for Gearhead intent", new Object[0]);
        }
    }
}
