package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79004ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.t */
/* compiled from: PG */
public abstract class C77426t {
    /* renamed from: h */
    public static C77426t m124197h(C78983aj ajVar, C80401n nVar, C80379i iVar, C82838ch chVar, boolean z, C79004ba baVar) {
        C76760e eVar = new C76760e();
        if (ajVar != null) {
            eVar.f212126a = ajVar;
            eVar.mo72326c(nVar);
            if (iVar != null) {
                eVar.f212127b = iVar;
                if (chVar != null) {
                    eVar.f212128c = chVar;
                    eVar.mo72325b(z);
                    if (baVar != null) {
                        eVar.f212129d = baVar;
                        return eVar.mo72324a();
                    }
                    throw new NullPointerException("Null understandingStreamzEventsBuilder");
                }
                throw new NullPointerException("Null fulfillmentCandidateInfo");
            }
            throw new NullPointerException("Null preFulfillmentRankingFeatures");
        }
        throw new NullPointerException("Null queryUnderstandingResult");
    }

    /* renamed from: a */
    public abstract C77425s mo72524a();

    /* renamed from: b */
    public abstract C78983aj mo72525b();

    /* renamed from: c */
    public abstract C79004ba mo72526c();

    /* renamed from: d */
    public abstract C82838ch mo72527d();

    /* renamed from: e */
    public abstract C80401n mo72528e();

    /* renamed from: f */
    public abstract C80379i mo72530f();

    /* renamed from: g */
    public abstract boolean mo72531g();

    /* renamed from: i */
    public final C77426t mo72566i(C80363t tVar) {
        if (mo72525b().mo73746a().mo71152e().mo71143b() == 1) {
            return mo72567j(C81442m.m129542d(mo72525b().mo73746a().mo71152e().mo71141c().mo71147d(), tVar));
        }
        throw new IllegalArgumentException("Trying to convert non-voice query to cloud handover");
    }

    /* renamed from: j */
    public final C77426t mo72567j(C80401n nVar) {
        C77425s a = mo72524a();
        a.mo72326c(nVar);
        return a.mo72324a();
    }
}
