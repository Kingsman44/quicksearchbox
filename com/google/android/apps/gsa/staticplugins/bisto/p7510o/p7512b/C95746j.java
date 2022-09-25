package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.j */
/* compiled from: PG */
final class C95746j extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268055a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95746j(C95759w wVar) {
        super(wVar);
        this.f268055a = wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89731a(com.google.android.p10712d.C142379dd r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.bisto.o.b.w r0 = r5.f268055a
            monitor-enter(r0)
            boolean r6 = r6.f386347a     // Catch:{ all -> 0x0033 }
            if (r6 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            com.google.android.apps.gsa.staticplugins.bisto.o.b.w r6 = r5.f268055a     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.f.a r1 = r6.f268097h     // Catch:{ all -> 0x0033 }
            long r1 = r1.mo26870b()     // Catch:{ all -> 0x0033 }
            long r3 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b.C95759w.f268079b     // Catch:{ all -> 0x0033 }
            long r1 = r1 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0033 }
            r6.f268081B = r1     // Catch:{ all -> 0x0033 }
            com.google.android.apps.gsa.staticplugins.bisto.o.b.w r6 = r5.f268055a     // Catch:{ all -> 0x0033 }
            r1 = 0
            r6.f268110u = r1     // Catch:{ all -> 0x0033 }
            com.google.android.apps.gsa.staticplugins.bisto.p.d r6 = r6.f268106q     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x0031
            com.google.common.o.kk r1 = com.google.common.p4552o.C60091kk.HOTWORD_VOICEINFO_RECEIVED     // Catch:{ all -> 0x0033 }
            com.google.common.o.kl r2 = com.google.common.p4552o.C60092kl.f162479k     // Catch:{ all -> 0x0033 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0033 }
            com.google.common.o.kg r2 = (com.google.common.p4552o.C60087kg) r2     // Catch:{ all -> 0x0033 }
            r3 = 0
            r6.mo89805f(r1, r3, r2, r3)     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b.C95746j.mo89731a(com.google.android.d.dd):void");
    }

    /* renamed from: b */
    public final void mo89732b(byte[] bArr) {
        synchronized (this.f268055a) {
            if (!this.f268055a.mo89750p(bArr) && this.f268055a.f268110u >= 19200) {
                C59104x b = C95759w.f268078a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b).mo56372aa(15392)).mo56386p("1st stage times out in 500ms");
                C95759w wVar = this.f268055a;
                wVar.f268081B = Long.valueOf(wVar.f268097h.mo26870b() + 500);
                C95759w wVar2 = this.f268055a;
                int i = wVar2.f268092c;
                if (i < 5) {
                    wVar2.f268092c = i + 1;
                    wVar2.mo89747m(C95748l.RECOGNIZING_CACHING_TIMEOUT);
                } else {
                    wVar2.mo89747m(C95748l.FIRST_STAGE_TIMEOUT);
                }
            }
        }
    }
}
