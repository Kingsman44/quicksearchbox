package com.google.android.libraries.search.assistant.proactive;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36297r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.assistant.p3803ag.p3809c.C49089ga;
import com.google.assistant.p3803ag.p3809c.C49096gh;
import com.google.assistant.p3803ag.p3809c.C49097gi;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p5036r.C65323i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ao */
/* compiled from: PG */
public final class C36219ao implements C36208ad {

    /* renamed from: a */
    public static final C59071e f94617a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.ao");

    /* renamed from: b */
    public boolean f94618b = false;

    /* renamed from: c */
    public final C36221aq f94619c;

    /* renamed from: d */
    public final C21370a f94620d;

    /* renamed from: e */
    public final C36297r f94621e;

    /* renamed from: f */
    public final Executor f94622f;

    /* renamed from: g */
    Map f94623g;

    /* renamed from: h */
    Map f94624h;

    /* renamed from: i */
    public final C36205aa f94625i;

    /* renamed from: j */
    private final C36275ad f94626j;

    public C36219ao(C36221aq aqVar, C36275ad adVar, C36297r rVar, C21370a aVar, Executor executor, C36205aa aaVar) {
        this.f94619c = aqVar;
        this.f94626j = adVar;
        this.f94621e = rVar;
        this.f94620d = aVar;
        this.f94622f = executor;
        this.f94625i = aaVar;
        this.f94623g = new HashMap();
        this.f94624h = new HashMap();
    }

    /* renamed from: l */
    private final void m64626l(int i, int i2, int i3, boolean z, int i4) {
        C60922j.m93045h(C60838bs.m92859i(this.f94621e.mo40097c(i, i2, i3, z, i4)), new C36215ak(this), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo40013a(int i, aas aas) {
        if (!this.f94625i.f94585c) {
            return C60856cj.m92900i(new C36207ac(1, 0));
        }
        C60870cx i2 = mo40026i();
        C36209ae aeVar = new C36209ae(this, aas, i);
        return C60922j.m93045h(i2, C47810es.m84966f(aeVar), this.f94622f);
    }

    /* renamed from: b */
    public final C60870cx mo40014b() {
        if (!this.f94625i.f94585c) {
            return C60856cj.m92900i(true);
        }
        C60870cx e = this.f94626j.mo40080e();
        C36213ai aiVar = new C36213ai(this);
        return C60922j.m93044g(e, C47810es.m84963c(aiVar), this.f94622f);
    }

    /* renamed from: c */
    public final C60870cx mo40015c() {
        if (!this.f94625i.f94585c) {
            return C60866ct.f164955a;
        }
        return C60922j.m93045h(C60838bs.m92859i(mo40026i()), new C36211ag(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo40016d(int i, int i2, int i3, int i4) {
        m64626l(i, i2, i3, false, i4 == 0 ? 3 : 4);
    }

    /* renamed from: e */
    public final void mo40017e(int i, int i2, int i3) {
        m64626l(i, i2, i3, false, 5);
    }

    /* renamed from: f */
    public final void mo40018f(int i, int i2, int i3, boolean z) {
        m64626l(i, i2, i3, false, true != z ? 7 : 6);
    }

    /* renamed from: g */
    public final void mo40019g(int i, aas aas) {
        Object obj;
        Object obj2;
        int i2;
        if (this.f94625i.f94585c) {
            C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
            aas.mo58887l(r0);
            Object l = aas.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            if (((abc) obj).f134703j || !C36206ab.m64610f(this.f94619c, i)) {
                C62940bt r7 = C62942bv.checkIsLite(abc.f134692p);
                aas.mo58887l(r7);
                Object l2 = aas.f169962ag.mo58854l(r7.f169971d);
                if (l2 == null) {
                    obj2 = r7.f169969b;
                } else {
                    obj2 = r7.mo58889c(l2);
                }
                int i3 = ((abc) obj2).f134700g;
                aap aap = aas.f134676n;
                if (aap == null) {
                    aap = aap.f134650h;
                }
                int i4 = aap.f134655d;
                C65323i iVar = aas.f134681s;
                if (iVar == null) {
                    iVar = C65323i.f176655c;
                }
                if (iVar.f176657a > 0) {
                    C65323i iVar2 = aas.f134681s;
                    if (iVar2 == null) {
                        iVar2 = C65323i.f176655c;
                    }
                    i2 = iVar2.f176657a;
                } else {
                    C65323i iVar3 = aas.f134681s;
                    if (iVar3 == null) {
                        iVar3 = C65323i.f176655c;
                    }
                    i2 = iVar3.f176658b;
                }
                m64626l(i4, i3, i2, aas.f134677o, 1);
            }
        }
    }

    /* renamed from: h */
    public final void mo40020h(int i, int i2, int i3) {
        m64626l(i, i2, i3, false, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C60870cx mo40026i() {
        if (this.f94618b) {
            return C60856cj.m92900i(true);
        }
        C60870cx e = this.f94626j.mo40080e();
        C36210af afVar = new C36210af(this);
        return C60922j.m93044g(e, C47810es.m84963c(afVar), this.f94622f);
    }

    /* renamed from: j */
    public final boolean mo40027j(abc abc, C49097gi giVar) {
        if (giVar.f126980i > this.f94620d.mo26870b()) {
            return false;
        }
        long j = giVar.f126979h;
        if (j > 0 && j < this.f94620d.mo26870b()) {
            return false;
        }
        if (giVar.f126978g.isEmpty()) {
            return true;
        }
        for (String equals : abc.f134705l) {
            if (equals.equals(giVar.f126978g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo40028k(C49078fq fqVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C49097gi giVar : fqVar.f126941c) {
            C49096gh ghVar = giVar.f126973b;
            if (ghVar == null) {
                ghVar = C49096gh.f126964d;
            }
            if (ghVar.f126966a != 0) {
                C49096gh ghVar2 = giVar.f126973b;
                if (ghVar2 == null) {
                    ghVar2 = C49096gh.f126964d;
                }
                if (!hashMap.containsKey(Integer.valueOf(ghVar2.f126966a))) {
                    C49096gh ghVar3 = giVar.f126973b;
                    if (ghVar3 == null) {
                        ghVar3 = C49096gh.f126964d;
                    }
                    hashMap.put(Integer.valueOf(ghVar3.f126966a), new C36218an());
                }
                C49096gh ghVar4 = giVar.f126973b;
                if (ghVar4 == null) {
                    ghVar4 = C49096gh.f126964d;
                }
                C36218an anVar = (C36218an) hashMap.get(Integer.valueOf(ghVar4.f126966a));
                if (anVar != null) {
                    anVar.mo40025b(giVar);
                }
            }
            C49096gh ghVar5 = giVar.f126973b;
            if ((ghVar5 == null ? C49096gh.f126964d : ghVar5).f126967b != 0) {
                if (ghVar5 == null) {
                    ghVar5 = C49096gh.f126964d;
                }
                if (!hashMap2.containsKey(Integer.valueOf(ghVar5.f126967b))) {
                    C49096gh ghVar6 = giVar.f126973b;
                    if (ghVar6 == null) {
                        ghVar6 = C49096gh.f126964d;
                    }
                    hashMap2.put(Integer.valueOf(ghVar6.f126967b), new C36218an());
                }
                C49096gh ghVar7 = giVar.f126973b;
                if (ghVar7 == null) {
                    ghVar7 = C49096gh.f126964d;
                }
                C36218an anVar2 = (C36218an) hashMap2.get(Integer.valueOf(ghVar7.f126967b));
                if (anVar2 != null) {
                    anVar2.mo40025b(giVar);
                }
            }
        }
        for (C49089ga gaVar : fqVar.f126940b) {
            for (C49097gi giVar2 : gaVar.f126954e) {
                C49096gh ghVar8 = giVar2.f126973b;
                if (ghVar8 == null) {
                    ghVar8 = C49096gh.f126964d;
                }
                if (ghVar8.f126966a != 0) {
                    C49096gh ghVar9 = giVar2.f126973b;
                    if (ghVar9 == null) {
                        ghVar9 = C49096gh.f126964d;
                    }
                    if (!hashMap.containsKey(Integer.valueOf(ghVar9.f126966a))) {
                        C49096gh ghVar10 = giVar2.f126973b;
                        if (ghVar10 == null) {
                            ghVar10 = C49096gh.f126964d;
                        }
                        hashMap.put(Integer.valueOf(ghVar10.f126966a), new C36218an());
                    }
                    C49096gh ghVar11 = giVar2.f126973b;
                    if (ghVar11 == null) {
                        ghVar11 = C49096gh.f126964d;
                    }
                    C36218an anVar3 = (C36218an) hashMap.get(Integer.valueOf(ghVar11.f126966a));
                    if (anVar3 != null) {
                        anVar3.mo40024a(gaVar.f126951b, giVar2);
                    }
                }
                C49096gh ghVar12 = giVar2.f126973b;
                if ((ghVar12 == null ? C49096gh.f126964d : ghVar12).f126967b != 0) {
                    if (ghVar12 == null) {
                        ghVar12 = C49096gh.f126964d;
                    }
                    if (!hashMap2.containsKey(Integer.valueOf(ghVar12.f126967b))) {
                        C49096gh ghVar13 = giVar2.f126973b;
                        if (ghVar13 == null) {
                            ghVar13 = C49096gh.f126964d;
                        }
                        hashMap2.put(Integer.valueOf(ghVar13.f126967b), new C36218an());
                    }
                    C49096gh ghVar14 = giVar2.f126973b;
                    if (ghVar14 == null) {
                        ghVar14 = C49096gh.f126964d;
                    }
                    C36218an anVar4 = (C36218an) hashMap2.get(Integer.valueOf(ghVar14.f126967b));
                    if (anVar4 != null) {
                        anVar4.mo40024a(gaVar.f126951b, giVar2);
                    }
                }
            }
        }
        this.f94623g = hashMap;
        this.f94624h = hashMap2;
    }
}
