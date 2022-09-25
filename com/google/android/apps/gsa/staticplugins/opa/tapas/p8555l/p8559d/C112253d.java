package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121429a;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121430b;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121431c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121433e;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.assistant.p3781ad.p3787c.p3788a.C48482aa;
import com.google.assistant.p3781ad.p3787c.p3788a.C48484ac;
import com.google.assistant.p3781ad.p3787c.p3788a.C48486ae;
import com.google.assistant.p3781ad.p3787c.p3788a.C48487af;
import com.google.assistant.p3781ad.p3787c.p3788a.C48488ag;
import com.google.assistant.p3781ad.p3787c.p3788a.C48492ak;
import com.google.assistant.p3781ad.p3787c.p3788a.C48497ap;
import com.google.assistant.p3781ad.p3787c.p3788a.C48498aq;
import com.google.assistant.p3781ad.p3787c.p3788a.C48502au;
import com.google.assistant.p3781ad.p3787c.p3788a.C48535o;
import com.google.assistant.p3781ad.p3787c.p3788a.C48537q;
import com.google.assistant.p3781ad.p3787c.p3788a.C48539s;
import com.google.assistant.p3781ad.p3787c.p3788a.C48541u;
import com.google.assistant.p3781ad.p3787c.p3788a.C48545y;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.d */
/* compiled from: PG */
public final class C112253d implements C121431c {

    /* renamed from: b */
    private static final C59071e f311550b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.d");

    /* renamed from: c */
    private static final C121537f f311551c = C121537f.m200840b("Tapas/ModelWrapper", C121511c.f337208a);

    /* renamed from: a */
    public final C68214a f311552a;

    /* renamed from: d */
    private final C68214a f311553d;

    /* renamed from: e */
    private final HashMap f311554e = new HashMap();

    /* renamed from: f */
    private boolean f311555f = false;

    public C112253d(C68214a aVar, C68214a aVar2) {
        this.f311553d = aVar;
        this.f311552a = aVar2;
        C121537f fVar = f311551c;
        C121509q l = fVar.mo105243l("curvesLoading");
        try {
            m186109c();
            if (this.f311555f) {
                fVar.mo105240i("CurveLoad_success");
                ((C59052c) ((C59052c) f311550b.mo56224b()).mo56372aa(27653)).mo56387q("Loaded %d curves", ((C48492ak) aVar.mo27525b()).f125268a.size());
            } else {
                fVar.mo105240i("CurveLoad_fail");
            }
            l.close();
            return;
        } catch (Throwable th) {
            C112251b.m186108a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private final synchronized void m186109c() {
        if (!this.f311555f) {
            for (C48539s sVar : ((C48492ak) this.f311553d.mo27525b()).f125268a) {
                int i = sVar.f125386a;
                C48541u uVar = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                try {
                    C48545y yVar = sVar.f125387b;
                    if (yVar == null) {
                        yVar = C48545y.f125417c;
                    }
                    C121429a aVar = new C121429a(yVar);
                    HashMap hashMap = this.f311554e;
                    C48541u a = C48541u.m85233a(sVar.f125386a);
                    if (a == null) {
                        a = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                    }
                    hashMap.put(a, aVar);
                } catch (IllegalArgumentException e) {
                    C59052c cVar = (C59052c) ((C59052c) ((C59052c) f311550b.mo56225c()).mo56382g(e)).mo56372aa(27656);
                    C48541u a2 = C48541u.m85233a(sVar.f125386a);
                    if (a2 == null) {
                        a2 = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                    }
                    cVar.mo56387q("Could not load curve: %d", a2.f125415y);
                    this.f311555f = false;
                    return;
                }
            }
            this.f311555f = true;
        }
    }

    /* renamed from: a */
    public final C48488ag mo99476a(C48486ae aeVar) {
        C121509q qVar;
        C121509q l;
        C121509q qVar2;
        Throwable th;
        C121509q l2;
        Throwable th2;
        C121509q l3;
        Throwable th3;
        Iterator it;
        double d;
        double d2;
        C48486ae aeVar2 = aeVar;
        C121537f fVar = f311551c;
        C121509q l4 = fVar.mo105243l("runModel");
        try {
            C48484ac acVar = (C48484ac) fVar.mo105235d("SignalFetcher.computeFeatures", new C112252c(this, aeVar2));
            C48487af afVar = (C48487af) C48488ag.f125253d.createBuilder();
            afVar.copyOnWrite();
            C48488ag agVar = (C48488ag) afVar.instance;
            acVar.getClass();
            agVar.f125256b = acVar;
            agVar.f125255a |= 1;
            String str = aeVar2.f125251b;
            int i = 0;
            while (i < aeVar2.f125252c.size()) {
                String str2 = ((C48502au) aeVar2.f125252c.get(i)).f125294b;
                String str3 = ((C48502au) aeVar2.f125252c.get(i)).f125295c;
                C121537f fVar2 = f311551c;
                l = fVar2.mo105243l("computeSuggestionScore");
                try {
                    l2 = fVar2.mo105243l("continuousFeatureInference");
                    Iterator it2 = ((C48492ak) this.f311553d.mo27525b()).f125268a.iterator();
                    double d3 = C59203do.f157270a;
                    while (it2.hasNext()) {
                        C48539s sVar = (C48539s) it2.next();
                        C48541u a = C48541u.m85233a(sVar.f125386a);
                        if (a == null) {
                            try {
                                a = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                            } catch (Throwable th4) {
                                th2 = th4;
                                qVar = l4;
                            }
                        }
                        try {
                            float a2 = C121433e.m200674a(a, acVar, i);
                            int i2 = sVar.f125386a;
                            HashMap hashMap = this.f311554e;
                            C48541u a3 = C48541u.m85233a(i2);
                            if (a3 == null) {
                                a3 = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                            }
                            C121429a aVar = (C121429a) hashMap.get(a3);
                            if (aVar == null) {
                                C48541u a4 = C48541u.m85233a(sVar.f125386a);
                                if (a4 == null) {
                                    a4 = C48541u.CONTINUOUS_FEATURE_UNKNOWN;
                                }
                                throw new AssertionError("Curve " + a4.f125415y + " not loaded.");
                            }
                            double d4 = (double) a2;
                            qVar = l4;
                            C48487af afVar2 = afVar;
                            try {
                                if (d4 <= ((C48482aa) aVar.f337080a.f125420b.get(0)).f125241b) {
                                    try {
                                        d2 = ((C48482aa) aVar.f337080a.f125420b.get(0)).f125242c;
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                    }
                                } else if (d4 >= ((C48482aa) C58557jl.m90131l(aVar.f337080a.f125420b)).f125241b) {
                                    d2 = ((C48482aa) C58557jl.m90131l(aVar.f337080a.f125420b)).f125242c;
                                } else {
                                    double a5 = aVar.mo105137a(d4);
                                    Iterator it3 = aVar.f337081b.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            qVar2 = l;
                                            it = it2;
                                            d = ((C48482aa) C58557jl.m90131l(aVar.f337080a.f125420b)).f125242c;
                                            break;
                                        }
                                        C121430b bVar = (C121430b) it3.next();
                                        qVar2 = l;
                                        it = it2;
                                        try {
                                            if (a5 < bVar.f337082a) {
                                                d = (bVar.f337083b * a5) + bVar.f337084c;
                                                break;
                                            }
                                            l = qVar2;
                                            it2 = it;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th2 = th;
                                            try {
                                                l2.close();
                                            } catch (Throwable th7) {
                                                C112251b.m186108a(th2, th7);
                                            }
                                            throw th2;
                                        }
                                    }
                                    int i3 = sVar.f125386a;
                                    d3 += d;
                                    afVar = afVar2;
                                    l = qVar2;
                                    l4 = qVar;
                                    it2 = it;
                                    C48486ae aeVar3 = aeVar;
                                }
                                it = it2;
                                d = d2;
                                qVar2 = l;
                                int i32 = sVar.f125386a;
                                d3 += d;
                                afVar = afVar2;
                                l = qVar2;
                                l4 = qVar;
                                it2 = it;
                                C48486ae aeVar32 = aeVar;
                            } catch (Throwable th8) {
                                th = th8;
                                qVar2 = l;
                                th2 = th;
                                l2.close();
                                throw th2;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            qVar = l4;
                            qVar2 = l;
                            th2 = th;
                            l2.close();
                            throw th2;
                        }
                    }
                    qVar = l4;
                    C48487af afVar3 = afVar;
                    qVar2 = l;
                    try {
                        l2.close();
                        l3 = f311551c.mo105243l("categoricalFeatureInference");
                        for (C48535o oVar : ((C48492ak) this.f311553d.mo27525b()).f125269b) {
                            int a6 = C48537q.m85232a(oVar.f125379a);
                            if (a6 == 0) {
                                a6 = 1;
                            }
                            String c = C121433e.m200676c(a6, acVar, i);
                            int i4 = oVar.f125379a;
                            double d5 = oVar.f125381c;
                            c.getClass();
                            C62995dn dnVar = oVar.f125380b;
                            if (dnVar.containsKey(c)) {
                                d5 = ((Double) dnVar.get(c)).doubleValue();
                            }
                            int i5 = oVar.f125379a;
                            d3 += d5;
                        }
                        l3.close();
                        try {
                            qVar2.close();
                            C48497ap apVar = (C48497ap) C48498aq.f125279c.createBuilder();
                            apVar.copyOnWrite();
                            C48498aq aqVar = (C48498aq) apVar.instance;
                            aqVar.f125281a |= 1;
                            aqVar.f125282b = (float) d3;
                            C48498aq aqVar2 = (C48498aq) apVar.build();
                            afVar3.copyOnWrite();
                            C48488ag agVar2 = (C48488ag) afVar3.instance;
                            aqVar2.getClass();
                            C62971cq cqVar = agVar2.f125257c;
                            if (!cqVar.mo58948c()) {
                                agVar2.f125257c = C62942bv.mutableCopy(cqVar);
                            }
                            agVar2.f125257c.add(aqVar2);
                            i++;
                            afVar = afVar3;
                            l4 = qVar;
                            aeVar2 = aeVar;
                        } catch (Throwable th10) {
                            th = th10;
                            Throwable th11 = th;
                            try {
                                qVar.close();
                            } catch (Throwable th12) {
                                C112251b.m186108a(th11, th12);
                            }
                            throw th11;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        th = th;
                        qVar2.close();
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    qVar = l4;
                    qVar2 = l;
                    th = th;
                    qVar2.close();
                    throw th;
                }
            }
            C121509q qVar3 = l4;
            C48488ag agVar3 = (C48488ag) afVar.build();
            qVar3.close();
            return agVar3;
            qVar2 = l;
            l2.close();
            throw th2;
            throw th3;
        } catch (Throwable th15) {
            th = th15;
            qVar = l4;
            Throwable th112 = th;
            qVar.close();
            throw th112;
        }
    }

    /* renamed from: b */
    public final boolean mo99477b() {
        return this.f311555f;
    }
}
