package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.av */
/* compiled from: PG */
public final /* synthetic */ class C92947av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f259295a;

    public /* synthetic */ C92947av(C60870cx cxVar) {
        this.f259295a = cxVar;
    }

    public final void run() {
        C60870cx cxVar = this.f259295a;
        C59071e eVar = C92950ay.f259298a;
        try {
            if (((C60873d) cxVar).value instanceof C60873d.C60875b) {
                ((C59052c) ((C59052c) C92950ay.f259298a.mo56224b()).mo56372aa(13279)).mo56386p("Go-back was cancelled");
                return;
            }
            C52070ec ecVar = (C52070ec) C60856cj.m92909r(cxVar);
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            if (a != C52235kf.OK) {
                C52236kg kgVar2 = ecVar.f136654b;
                int i = (kgVar2 == null ? C52236kg.f137089d : kgVar2).f137092b;
                if (kgVar2 == null) {
                    kgVar2 = C52236kg.f137089d;
                }
                String str = kgVar2.f137093c;
            }
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C92950ay.f259298a.mo56226d()).mo56382g(th)).mo56372aa(13277)).mo56386p("Go-back finished with error");
        }
    }
}
