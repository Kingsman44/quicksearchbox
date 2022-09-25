package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

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

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.z */
/* compiled from: PG */
public final /* synthetic */ class C77821z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77752af f214376a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f214377b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f214378c;

    public /* synthetic */ C77821z(C77752af afVar, C67087ko koVar, C79856d dVar) {
        this.f214376a = afVar;
        this.f214377b = koVar;
        this.f214378c = dVar;
    }

    public final void run() {
        C67075kc kcVar;
        C77752af afVar = this.f214376a;
        C67087ko koVar = this.f214377b;
        C79856d dVar = this.f214378c;
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
            afVar.f214184b.mo72602c(C77557aj.m124417w(uVar, kcVar.f182333a, C77551ad.SODA_PREDICTION, C77556ai.PREFETCH, a, afVar.f214183a.mo57444a()), koVar.f182374g);
        }
    }
}
