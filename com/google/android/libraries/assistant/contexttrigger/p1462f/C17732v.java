package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.assistant.p3803ag.p3807b.p3808a.C48887ab;
import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import com.google.assistant.p3803ag.p3807b.p3808a.C48898am;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48920v;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.v */
/* compiled from: PG */
public final /* synthetic */ class C17732v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C17695aa f50950a;

    /* renamed from: b */
    public final /* synthetic */ List f50951b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f50952c;

    public /* synthetic */ C17732v(C17695aa aaVar, List list, C58480gp gpVar) {
        this.f50950a = aaVar;
        this.f50951b = list;
        this.f50952c = gpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58801sm smVar;
        C17695aa aaVar = this.f50950a;
        List list = this.f50951b;
        C58480gp gpVar = this.f50952c;
        C48892ag agVar = (C48892ag) obj;
        C58976aa aaVar2 = C58975e.f156826a;
        agVar.getClass();
        C17712d dVar = new C17712d(agVar);
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            String str = (String) G.next();
            if (!agVar.mo53191d(str)) {
                C59104x d = C17695aa.f50875a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CtfReceiver");
                ((C59052c) ((C59052c) d).mo56372aa(47027)).mo56386p("Cannot find the ContextTriggerNode");
            } else {
                str.getClass();
                C62995dn dnVar = agVar.f126521b;
                if (dnVar.containsKey(str)) {
                    C48888ac acVar = (C48888ac) dnVar.get(str);
                    C48922x a = C48922x.m85306a(acVar.f126513e);
                    if (a == null) {
                        a = C48922x.UNKNOWN;
                    }
                    C48922x a2 = C48922x.m85306a(acVar.f126514f);
                    if (a2 == null) {
                        a2 = C48922x.UNKNOWN;
                    }
                    if (!a.equals(a2)) {
                        str.getClass();
                        C62995dn dnVar2 = agVar.f126521b;
                        if (dnVar2.containsKey(str)) {
                            C48888ac acVar2 = (C48888ac) dnVar2.get(str);
                            String str2 = acVar2.f126511c;
                            if (!agVar.mo53189b(str2)) {
                                C59104x d2 = C17695aa.f50875a.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "CtfReceiver");
                                ((C59052c) ((C59052c) d2).mo56372aa(47025)).mo56386p("Cannot find the InternalContextTriggerRequest");
                            } else {
                                C48892ag agVar2 = dVar.f50910a;
                                str2.getClass();
                                C62995dn dnVar3 = agVar2.f126520a;
                                if (dnVar3.containsKey(str2)) {
                                    C48897al alVar = ((C48899an) dnVar3.get(str2)).f126538e;
                                    if (alVar == null) {
                                        alVar = C48897al.f126526e;
                                    }
                                    C48922x a3 = dVar.mo23445a(alVar);
                                    str2.getClass();
                                    C62995dn dnVar4 = agVar.f126520a;
                                    if (dnVar4.containsKey(str2)) {
                                        C48899an anVar = (C48899an) dnVar4.get(str2);
                                        C17741a aVar = aaVar.f50879e;
                                        C48917s sVar = anVar.f126535b;
                                        if (sVar == null) {
                                            sVar = C48917s.f126578f;
                                        }
                                        C48919u uVar = sVar.f126581b;
                                        if (uVar == null) {
                                            uVar = C48919u.f126586g;
                                        }
                                        C48900b a4 = C48900b.m85301a(uVar.f126589b);
                                        if (a4 == null) {
                                            a4 = C48900b.UNSPECIFIED;
                                        }
                                        int b = C48887ab.m85291b(acVar2.f126515g);
                                        if (b == 0) {
                                            b = 1;
                                        }
                                        C48922x a5 = C48922x.m85306a(acVar2.f126513e);
                                        if (a5 == null) {
                                            a5 = C48922x.UNKNOWN;
                                        }
                                        smVar = G;
                                        ((C19567d) aVar.f50964a.f102867ay.mo6453a()).mo24822a(1, aVar.f50965b, a4.name(), C48887ab.m85290a(b), Boolean.valueOf(a5 == C48922x.ACTIVE));
                                        int i = acVar2.f126515g;
                                        int b2 = C48887ab.m85291b(i);
                                        if (!(b2 == 0 || b2 != 2 || (anVar.f126534a & 16) == 0)) {
                                            C17741a aVar2 = aaVar.f50879e;
                                            C48917s sVar2 = anVar.f126535b;
                                            if (sVar2 == null) {
                                                sVar2 = C48917s.f126578f;
                                            }
                                            C48919u uVar2 = sVar2.f126581b;
                                            if (uVar2 == null) {
                                                uVar2 = C48919u.f126586g;
                                            }
                                            C48900b a6 = C48900b.m85301a(uVar2.f126589b);
                                            if (a6 == null) {
                                                a6 = C48900b.UNSPECIFIED;
                                            }
                                            int b3 = C48887ab.m85291b(i);
                                            if (b3 == 0) {
                                                b3 = 1;
                                            }
                                            C48922x a7 = C48922x.m85306a(acVar2.f126513e);
                                            if (a7 == null) {
                                                a7 = C48922x.UNKNOWN;
                                            }
                                            boolean z = a7 == C48922x.ACTIVE;
                                            long b4 = aaVar.f50881g.mo26870b();
                                            C63042fg fgVar = anVar.f126539f;
                                            if (fgVar == null) {
                                                fgVar = C63042fg.f170152c;
                                            }
                                            ((C19569f) aVar2.f50964a.f102868az.mo6453a()).mo24824b((double) (b4 - C62953e.m95478c(fgVar)), aVar2.f50965b, a6.name(), C48887ab.m85290a(b3), Boolean.valueOf(z));
                                        }
                                        C48922x a8 = C48922x.m85306a(anVar.f126536c);
                                        if (a8 == null) {
                                            a8 = C48922x.UNKNOWN;
                                        }
                                        C48898am amVar = (C48898am) anVar.toBuilder();
                                        amVar.copyOnWrite();
                                        C48899an anVar2 = (C48899an) amVar.instance;
                                        anVar2.f126537d = a8.f126599d;
                                        anVar2.f126534a |= 4;
                                        amVar.copyOnWrite();
                                        C48899an anVar3 = (C48899an) amVar.instance;
                                        anVar3.f126536c = a3.f126599d;
                                        anVar3.f126534a |= 2;
                                        C48899an anVar4 = (C48899an) amVar.build();
                                        C48889ad adVar = (C48889ad) agVar.toBuilder();
                                        adVar.mo53187b(str2, anVar4);
                                        agVar = (C48892ag) adVar.build();
                                        if (!a3.equals(a8)) {
                                            C48920v vVar = (C48920v) C48923y.f126600f.createBuilder();
                                            vVar.copyOnWrite();
                                            C48923y yVar = (C48923y) vVar.instance;
                                            yVar.f126606e = a8.f126599d;
                                            yVar.f126602a |= 8;
                                            vVar.copyOnWrite();
                                            C48923y yVar2 = (C48923y) vVar.instance;
                                            yVar2.f126605d = a3.f126599d;
                                            yVar2.f126602a |= 4;
                                            C48917s sVar3 = anVar4.f126535b;
                                            if (sVar3 == null) {
                                                sVar3 = C48917s.f126578f;
                                            }
                                            C48919u uVar3 = sVar3.f126581b;
                                            if (uVar3 == null) {
                                                uVar3 = C48919u.f126586g;
                                            }
                                            vVar.copyOnWrite();
                                            C48923y yVar3 = (C48923y) vVar.instance;
                                            uVar3.getClass();
                                            yVar3.f126603b = uVar3;
                                            yVar3.f126602a |= 1;
                                            C48917s sVar4 = anVar4.f126535b;
                                            if (sVar4 == null) {
                                                sVar4 = C48917s.f126578f;
                                            }
                                            C48904f fVar = sVar4.f126583d;
                                            if (fVar == null) {
                                                fVar = C48904f.f126552a;
                                            }
                                            vVar.copyOnWrite();
                                            C48923y yVar4 = (C48923y) vVar.instance;
                                            fVar.getClass();
                                            yVar4.f126604c = fVar;
                                            yVar4.f126602a |= 2;
                                            gpVar.mo55395g((C48923y) vVar.build());
                                            C48917s sVar5 = anVar4.f126535b;
                                            if (sVar5 == null) {
                                                sVar5 = C48917s.f126578f;
                                            }
                                            C48919u uVar4 = sVar5.f126581b;
                                            if (uVar4 == null) {
                                                uVar4 = C48919u.f126586g;
                                            }
                                            C36314g gVar = aaVar.f50880f;
                                            C48900b a9 = C48900b.m85301a(uVar4.f126589b);
                                            if (a9 == null) {
                                                a9 = C48900b.UNSPECIFIED;
                                            }
                                            String name = a9.name();
                                            String str3 = uVar4.f126593f;
                                            C48897al alVar2 = anVar4.f126538e;
                                            if (alVar2 == null) {
                                                alVar2 = C48897al.f126526e;
                                            }
                                            gVar.mo40100b(name, str3, alVar2.f126531d, 4);
                                        }
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        smVar = G;
                        C59104x d3 = C17695aa.f50875a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "CtfReceiver");
                        ((C59052c) ((C59052c) d3).mo56372aa(47026)).mo56386p("The node's status has not changed.");
                    }
                    G = smVar;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            smVar = G;
            G = smVar;
        }
        return agVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
