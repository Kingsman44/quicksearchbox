package com.google.android.apps.gsa.sidekick.main.p7200c;

import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.sidekick.shared.renderingcontext.NavigationContext;
import com.google.p375ai.p378b.C7651ex;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8080uu;
import com.google.p375ai.p378b.C8098vl;
import com.google.p375ai.p378b.C8169yb;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.c.d */
/* compiled from: PG */
public final class C91279d implements C91278c {

    /* renamed from: a */
    private final C91281f f254752a;

    /* renamed from: b */
    private final List f254753b;

    public C91279d(C91281f fVar) {
        this.f254752a = fVar;
        this.f254753b = Collections.emptyList();
    }

    public C91279d(C91281f fVar, C7726hr hrVar) {
        this.f254752a = fVar;
        this.f254753b = hrVar.f27013d;
    }

    /* renamed from: a */
    public final void mo85553a(CardRenderingContext cardRenderingContext, C91276a aVar) {
        int i;
        int i2;
        C91278c cVar;
        C8169yb ybVar;
        C91280e eVar = aVar.f254748a;
        C86317h a = eVar.f254754a.mo80040a();
        synchronized (a.f233379b) {
            C8098vl b = a.mo80034b();
            i = 1;
            if (b == null || (b.f28474a & 512) == 0) {
                i2 = 0;
            } else {
                i2 = C8080uu.m22933a(b.f28480g);
                if (i2 == 0) {
                    i2 = 1;
                }
            }
        }
        if (i2 != 0) {
            i = i2;
        }
        NavigationContext navigationContext = (NavigationContext) cardRenderingContext.mo49307c(NavigationContext.f118465a, new NavigationContext(i));
        if (navigationContext != null) {
            C86317h a2 = eVar.f254754a.mo80040a();
            synchronized (a2.f233379b) {
                C8098vl b2 = a2.mo80034b();
                if (b2 == null) {
                    ybVar = C8169yb.DRIVE;
                } else if ((b2.f28474a & 64) != 0) {
                    ybVar = C8169yb.m22959a(b2.f28477d);
                    if (ybVar == null) {
                        ybVar = C8169yb.DRIVE;
                    }
                } else {
                    ybVar = C8169yb.DRIVE;
                }
            }
            navigationContext.f118466b.put(C7651ex.OTHER, ybVar);
        }
        for (C7718hj hjVar : this.f254753b) {
            C7746ik a3 = C7746ik.m22834a(hjVar.f26966g);
            if (a3 == null) {
                a3 = C7746ik.UNKNOWN;
            }
            if (!(a3 == C7746ik.MODULE || (cVar = (C91278c) this.f254752a.mo85661e(hjVar)) == null)) {
                cVar.mo85553a(cardRenderingContext, aVar);
            }
        }
    }
}
