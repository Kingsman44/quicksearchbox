package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9514c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119667j;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.c.a */
/* compiled from: PG */
final class C126915a implements C119667j {

    /* renamed from: a */
    final /* synthetic */ C119667j f349432a;

    public C126915a(C119667j jVar) {
        this.f349432a = jVar;
    }

    /* renamed from: a */
    public final C119908e mo104425a(C51809dy dyVar, C119793ao aoVar) {
        C59052c cVar = (C59052c) C126918d.f349434a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C119834cb cbVar = aoVar.f333672a;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str = cbVar.f333767a;
        String str2 = dyVar.f135936b;
        cVar.mo56379ah(new C59094n(37237));
        cVar.mo56354G("[%s] startPrefetch: %s", str, str2);
        C119908e a = this.f349432a.mo104425a(dyVar, aoVar);
        C69664n.m101060f(a, "delegate.startPrefetch(clientOp, context)");
        C69664n.m101060f(dyVar, "clientOp");
        C69664n.m101060f(aoVar, "context");
        return new C126918d(a, dyVar, aoVar);
    }
}
