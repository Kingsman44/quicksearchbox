package com.google.android.libraries.search.silk.p3162a.p3164b;

import android.app.Activity;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39229e;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4283bv.p4412k.p4413a.C57836d;

/* renamed from: com.google.android.libraries.search.silk.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C40551a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C40562l f106429a;

    /* renamed from: b */
    public final /* synthetic */ int f106430b;

    public /* synthetic */ C40551a(C40562l lVar, int i) {
        this.f106429a = lVar;
        this.f106430b = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C40562l lVar = this.f106429a;
        int i = this.f106430b;
        int i2 = lVar.f106462r;
        C39226b bVar = null;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 2) {
            return C60856cj.m92899h(new C41742a(C40562l.f106446b));
        } else {
            C60872cz czVar = lVar.f106456l;
            if (czVar != null && !czVar.isCancelled()) {
                lVar.f106456l.cancel(false);
            }
            C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
            C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
            C57836d dVar = lVar.f106460p;
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
            if (lVar.f106454j.mo56113h()) {
                bVar = (C39226b) C39229e.f103352a.get(((Activity) lVar.f106454j.mo56107c()).getClass().getName());
            }
            if (bVar != null) {
                bnVar.copyOnWrite();
                C37410bo boVar2 = (C37410bo) bnVar.instance;
                boVar2.f99336e = Integer.valueOf(bVar.getNumber());
                boVar2.f99335d = 14;
            }
            C37404bi biVar = lVar.f106455k;
            biVar.getClass();
            lVar.f106461q = biVar.mo40935a((C37410bo) bnVar.build());
            C60870cx h = C60922j.m93045h(lVar.f106461q.mo20357d(), C47810es.m84966f(new C40552b(lVar)), lVar.f106453i);
            lVar.f106458n = C60922j.m93045h(h, C47810es.m84966f(new C40553c(lVar, i)), lVar.f106453i);
            return C47633f.m84733g(lVar.f106458n).mo51516i(new C40554d(lVar), lVar.f106453i).mo51516i(new C40555e(lVar, h), lVar.f106453i);
        }
    }
}
