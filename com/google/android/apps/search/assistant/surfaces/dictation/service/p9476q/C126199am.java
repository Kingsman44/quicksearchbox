package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.am */
/* compiled from: PG */
public final /* synthetic */ class C126199am implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347734a;

    public /* synthetic */ C126199am(C126208av avVar) {
        this.f347734a = avVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C126208av avVar = this.f347734a;
        C47558bi a = C47831fm.m85006a("SD.Oration.Start");
        try {
            C58838bb.m90887v(!avVar.f347769r, "%s already stopped, cannot start again", avVar);
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36905)).mo56389s("Starting %s [SD]", avVar.f347766o);
            C126257cq cqVar = avVar.f347759h;
            synchronized (cqVar.f347888g) {
                C58838bb.m90887v(cqVar.f347890i.equals(C126250cj.PRISTINE), "ProcessingQueue initialized while %s", cqVar.f347890i);
                cqVar.f347890i = C126250cj.INITIALIZING;
            }
            C60870cx c = C126309ar.m206524c(new C126238by(cqVar), cqVar.f347885d, cqVar.f347886e);
            cqVar.f347896o.set(c);
            cqVar.mo107486f(c);
            C70862aj a2 = C47686k.m84827a(avVar.f347755d.mo107431b(avVar.f347760i));
            C60870cx i = C60856cj.m92900i(avVar.f347774w.f346990a);
            C126198al alVar = new C126198al(avVar, a2);
            C60870cx h = C60922j.m93045h(i, C47810es.m84966f(alVar), avVar.f347753b);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                C126279w.m206479a(th, th2);
            }
            throw th;
        }
    }
}
