package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4412k.p4413a.C57836d;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.h */
/* compiled from: PG */
public final /* synthetic */ class C99736h implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99747s f279080a;

    /* renamed from: b */
    public final /* synthetic */ int f279081b;

    public /* synthetic */ C99736h(C99747s sVar, int i) {
        this.f279080a = sVar;
        this.f279081b = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C99747s sVar = this.f279080a;
        int i = this.f279081b;
        int i2 = sVar.f279101j;
        if (i2 == 0) {
            throw null;
        } else if (i2 == 2) {
            C60870cx cxVar = sVar.f279096e;
            if (cxVar != null && !cxVar.isCancelled()) {
                sVar.f279096e.cancel(false);
            }
            C37404bi biVar = sVar.f279095d;
            biVar.getClass();
            C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
            C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
            C57836d dVar = sVar.f279099h;
            dVar.getClass();
            int i3 = dVar.f154530a;
            avVar.copyOnWrite();
            C37360ay ayVar = (C37360ay) avVar.instance;
            ayVar.f99226a = 2 | ayVar.f99226a;
            ayVar.f99228c = i3;
            bnVar.copyOnWrite();
            C37410bo boVar = (C37410bo) bnVar.instance;
            C37360ay ayVar2 = (C37360ay) avVar.build();
            ayVar2.getClass();
            boVar.f99337f = ayVar2;
            boVar.f99332a |= 1;
            sVar.f279100i = biVar.mo40935a((C37410bo) bnVar.build());
            C60870cx j = sVar.f279094c.mo28210j(sVar.f279100i.mo20357d(), "startListeningResult", new C99739k(sVar));
            return sVar.f279094c.mo28209i(sVar.f279094c.mo28210j(sVar.f279094c.mo28210j(j, "shouldStopRecording", new C99740l(sVar, i)), "stopListening", new C99741m(sVar)), "buildRecordResult", new C99730b(sVar, j));
        } else {
            throw new C99745q();
        }
    }
}
