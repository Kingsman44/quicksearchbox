package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.p5218j.C67075kc;
import com.google.speech.p5218j.C67077ke;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.e */
/* compiled from: PG */
public final /* synthetic */ class C77659e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77663i f213901a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f213902b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f213903c;

    public /* synthetic */ C77659e(C77663i iVar, C67087ko koVar, C79856d dVar) {
        this.f213901a = iVar;
        this.f213902b = koVar;
        this.f213903c = dVar;
    }

    public final void run() {
        C67075kc kcVar;
        C77663i iVar = this.f213901a;
        C67087ko koVar = this.f213902b;
        C79856d dVar = this.f213903c;
        C67077ke keVar = koVar.f182371d;
        if (keVar == null) {
            keVar = C67077ke.f182335c;
        }
        if (keVar.f182337a == 1) {
            j a = dVar.mo74269a();
            C77889u uVar = C77889u.SODA;
            if (keVar.f182337a == 1) {
                kcVar = (C67075kc) keVar.f182338b;
            } else {
                kcVar = C67075kc.f182331b;
            }
            iVar.f213913b.mo72602c(C77557aj.m124417w(uVar, kcVar.f182333a, C77551ad.SODA_PREDICTION, C77556ai.PREFETCH, a, iVar.f213912a.mo57444a()), koVar.f182374g);
        }
    }
}
