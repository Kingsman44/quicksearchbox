package com.google.android.libraries.assistant.auto.tng.p945f.p946a.p949b;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.a.b.c */
/* compiled from: PG */
final class C13358c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C13359d f41090a;

    public C13358c(C13359d dVar) {
        this.f41090a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C13360e) this.f41090a.f41093a.get()).mo21046a();
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
                ((C13360e) this.f41090a.f41093a.get()).mo21046a();
                return;
            }
        }
        ((C13360e) this.f41090a.f41093a.get()).mo21047b();
    }
}
