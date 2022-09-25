package com.google.android.apps.search.googleapp.search.p10418j;

import android.databinding.C0118a;
import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.libraries.search.assistant.p2704m.C34818m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61819l;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61822o;
import com.google.knowledge.p4671b.C61826s;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.googleapp.search.j.b */
/* compiled from: PG */
public final /* synthetic */ class C137528b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C137531e f374054a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f374055b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f374056c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f374057d;

    public /* synthetic */ C137528b(C137531e eVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f374054a = eVar;
        this.f374055b = cxVar;
        this.f374056c = cxVar2;
        this.f374057d = cxVar3;
    }

    public final Object call() {
        C61822o oVar;
        C61826s sVar;
        C137531e eVar = this.f374054a;
        C60870cx cxVar = this.f374055b;
        C60870cx cxVar2 = this.f374056c;
        C60870cx cxVar3 = this.f374057d;
        synchronized (eVar.f374062b) {
            eVar.f374063c = true;
        }
        C61819l lVar = (C61819l) C61820m.f167020J.createBuilder();
        try {
            for (C41389e d : (List) C60856cj.m92909r(cxVar)) {
                C137531e.m223408d(lVar, d);
            }
        } catch (ExecutionException e) {
            ExecutionException executionException = e;
            lVar = C137531e.m223407b();
            C0118a.m116x(C137531e.f374060a.mo56226d(), "Fail to fetch udc setting status", 41009, executionException, C38505d.f101864b, 180707701);
        }
        C34807b a = C34807b.m63566a(((C34818m) C60856cj.m92909r(cxVar2)).f92357b);
        if (a == null) {
            a = C34807b.NOT_ELIGIBLE;
        }
        C41387c cVar = C41387c.DEFAULT;
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            oVar = C61822o.ELIGIBLE_PREBUILT;
        } else if (ordinal == 2) {
            oVar = C61822o.ELIGIBLE_FOR_UPGRADE;
        } else if (ordinal == 3) {
            oVar = C61822o.ELIGIBLE_UPGRADING;
        } else if (ordinal == 4) {
            oVar = C61822o.ELIGIBLE_UPGRADED;
        } else if (ordinal != 5) {
            oVar = C61822o.NOT_ELIGIBLE;
        } else {
            oVar = C61822o.ELIGIBLE_UPGRADED_BYPASS;
        }
        if (oVar == C61822o.NOT_ELIGIBLE) {
            sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar = (C61826s) C60856cj.m92909r(cxVar3);
        }
        lVar.copyOnWrite();
        C61820m mVar = (C61820m) lVar.instance;
        mVar.f167044n = oVar.f167065g;
        mVar.f167031a |= 4096;
        lVar.copyOnWrite();
        C61820m mVar2 = (C61820m) lVar.instance;
        mVar2.f167045o = sVar.f167079d;
        mVar2.f167031a |= 8192;
        return (C61820m) lVar.build();
    }
}
