package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9514c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.c.c */
/* compiled from: PG */
public final class C126917c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C126918d f349433a;

    public C126917c(C126918d dVar) {
        this.f349433a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (th instanceof CancellationException) {
            C59052c cVar = (C59052c) C126918d.f349434a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
            C119834cb cbVar = this.f349433a.f349436c.f333672a;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            String str = cbVar.f333767a;
            String str2 = this.f349433a.f349435b.f135936b;
            cVar.mo56379ah(new C59094n(37240));
            cVar.mo56354G("[%s] Execution of %s has been cancelled.", str, str2);
            return;
        }
        C59052c cVar2 = (C59052c) C126918d.f349434a.mo56226d();
        cVar2.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
        C119834cb cbVar2 = this.f349433a.f349436c.f333672a;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        String str3 = cbVar2.f333767a;
        String str4 = this.f349433a.f349435b.f135936b;
        cVar3.mo56379ah(new C59094n(37239));
        cVar3.mo56354G("[%s] Failed to execute %s", str3, str4);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        C69664n.m101061g(ecVar, "result");
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
            if (kgVar2 == null) {
                kgVar2 = C52236kg.f137089d;
            }
            C52235kf a2 = C52235kf.m86549a(kgVar2.f137092b);
            if (a2 == null) {
                a2 = C52235kf.OK;
            }
            if (a2 != C52235kf.IGNORE) {
                C59052c cVar = (C59052c) C126918d.f349434a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
                C119834cb cbVar = this.f349433a.f349436c.f333672a;
                if (cbVar == null) {
                    cbVar = C119834cb.f333765b;
                }
                String str = cbVar.f333767a;
                String str2 = this.f349433a.f349435b.f135936b;
                String a3 = C126916b.m207602a(ecVar);
                cVar.mo56379ah(new C59094n(37242));
                cVar.mo56359L("[%s] Failed to execute %s. Status: %s", str, str2, a3);
                return;
            }
        }
        C59052c cVar2 = (C59052c) C126918d.f349434a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C119834cb cbVar2 = this.f349433a.f349436c.f333672a;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        String str3 = cbVar2.f333767a;
        String str4 = this.f349433a.f349435b.f135936b;
        String a4 = C126916b.m207602a(ecVar);
        cVar2.mo56379ah(new C59094n(37241));
        cVar2.mo56359L("[%s] Successfully executed %s. Status: %s", str3, str4, a4);
    }
}
