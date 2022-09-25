package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.aj */
/* compiled from: PG */
final class C92875aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C52115fu f259109a;

    /* renamed from: b */
    final /* synthetic */ C92876ak f259110b;

    public C92875aj(C92876ak akVar, C52115fu fuVar) {
        this.f259110b = akVar;
        this.f259109a = fuVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f259110b.mo87475c(C62722b.CANCELLED, C92876ak.m152919b(this.f259109a));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C62722b bVar;
        C52236kg kgVar = ((C52070ec) obj).f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        C59071e eVar = C92876ak.f259111a;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                bVar = C62722b.INVALID_ARGUMENT;
            } else if (ordinal != 17) {
                if (ordinal == 14) {
                    bVar = C62722b.INTERNAL;
                } else if (ordinal != 15) {
                    bVar = C62722b.UNKNOWN;
                } else {
                    bVar = C62722b.UNAVAILABLE;
                }
            }
            this.f259110b.mo87475c(bVar, C92876ak.m152919b(this.f259109a));
        }
        bVar = C62722b.OK;
        this.f259110b.mo87475c(bVar, C92876ak.m152919b(this.f259109a));
    }
}
