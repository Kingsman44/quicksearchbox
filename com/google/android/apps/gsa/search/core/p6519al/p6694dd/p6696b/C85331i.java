package com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119097af;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119098ag;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119099ah;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119101aj;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119102ak;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.p11016ak.C147622ac;
import com.google.android.libraries.p11016ak.C147624ae;
import com.google.android.libraries.p11016ak.C147625af;
import com.google.android.libraries.p11016ak.C147626ag;
import com.google.android.libraries.p11016ak.C147627ah;
import com.google.android.libraries.p11016ak.C147628ai;
import com.google.android.libraries.p11016ak.C147635c;
import com.google.android.libraries.p11016ak.C147702d;
import com.google.android.libraries.p11016ak.C147742x;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5285d.p5290b.p5291a.p5292a.C68140ac;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5285d.p5290b.p5291a.p5292a.C68199l;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.b.i */
/* compiled from: PG */
public final class C85331i {
    /* renamed from: a */
    public static C119103al m136799a(C52174hz hzVar, boolean z) {
        C52583xc xcVar;
        C52583xc xcVar2;
        C119097af afVar = (C119097af) C119103al.f332227e.createBuilder();
        afVar.copyOnWrite();
        ((C119103al) afVar.instance).f332232d = z;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        if (xcVar.f138074j.size() > 0) {
            C119099ah ahVar = (C119099ah) C119100ai.f332220c.createBuilder();
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            if (woVar2.f137996c == 26) {
                xcVar2 = (C52583xc) woVar2.f137997d;
            } else {
                xcVar2 = C52583xc.f138063o;
            }
            ahVar.mo104187a(xcVar2.f138074j);
            afVar.copyOnWrite();
            C119103al alVar = (C119103al) afVar.instance;
            C119100ai aiVar = (C119100ai) ahVar.build();
            aiVar.getClass();
            alVar.f332230b = aiVar;
            alVar.f332229a = 2;
            return (C119103al) afVar.build();
        }
        C119101aj ajVar = (C119101aj) C119102ak.f332224b.createBuilder();
        String str = hzVar.f136895b;
        ajVar.copyOnWrite();
        str.getClass();
        ((C119102ak) ajVar.instance).f332226a = str;
        afVar.copyOnWrite();
        C119103al alVar2 = (C119103al) afVar.instance;
        C119102ak akVar = (C119102ak) ajVar.build();
        akVar.getClass();
        alVar2.f332230b = akVar;
        alVar2.f332229a = 1;
        return (C119103al) afVar.build();
    }

    /* renamed from: b */
    public static C147743y m136800b(C85343l lVar) {
        C147628ai aiVar;
        C119102ak akVar;
        C119100ai aiVar2;
        C68199l lVar2;
        C147742x xVar = (C147742x) C147743y.f398676f.createBuilder();
        C119103al alVar = lVar.f231130b;
        if (alVar == null) {
            alVar = C119103al.f332227e;
        }
        C147622ac acVar = (C147622ac) C147628ai.f398454d.createBuilder();
        int b = C68140ac.m98489b(alVar.f332231c);
        if (b == 0) {
            b = 1;
        }
        acVar.copyOnWrite();
        ((C147628ai) acVar.instance).f398458c = C68140ac.m98488a(b);
        int i = alVar.f332229a;
        int a = C119098ag.m197805a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 == 0) {
                C147626ag agVar = (C147626ag) C147627ah.f398451b.createBuilder();
                if (alVar.f332229a == 1) {
                    akVar = (C119102ak) alVar.f332230b;
                } else {
                    akVar = C119102ak.f332224b;
                }
                String str = akVar.f332226a;
                agVar.copyOnWrite();
                str.getClass();
                ((C147627ah) agVar.instance).f398453a = str;
                acVar.copyOnWrite();
                C147628ai aiVar3 = (C147628ai) acVar.instance;
                C147627ah ahVar = (C147627ah) agVar.build();
                ahVar.getClass();
                aiVar3.f398457b = ahVar;
                aiVar3.f398456a = 1;
                aiVar = (C147628ai) acVar.build();
            } else if (i2 == 1) {
                C147624ae aeVar = (C147624ae) C147625af.f398447c.createBuilder();
                if (alVar.f332229a == 2) {
                    aiVar2 = (C119100ai) alVar.f332230b;
                } else {
                    aiVar2 = C119100ai.f332220c;
                }
                C62971cq cqVar = aiVar2.f332222a;
                aeVar.copyOnWrite();
                C147625af afVar = (C147625af) aeVar.instance;
                C62971cq cqVar2 = afVar.f398449a;
                if (!cqVar2.mo58948c()) {
                    afVar.f398449a = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) afVar.f398449a);
                acVar.copyOnWrite();
                C147628ai aiVar4 = (C147628ai) acVar.instance;
                C147625af afVar2 = (C147625af) aeVar.build();
                afVar2.getClass();
                aiVar4.f398457b = afVar2;
                aiVar4.f398456a = 2;
                aiVar = (C147628ai) acVar.build();
            } else if (i2 != 2) {
                aiVar = (C147628ai) acVar.build();
            } else {
                if (i == 3) {
                    lVar2 = (C68199l) alVar.f332230b;
                } else {
                    lVar2 = C68199l.f184537d;
                }
                acVar.copyOnWrite();
                C147628ai aiVar5 = (C147628ai) acVar.instance;
                lVar2.getClass();
                aiVar5.f398457b = lVar2;
                aiVar5.f398456a = 3;
                aiVar = (C147628ai) acVar.build();
            }
            xVar.copyOnWrite();
            aiVar.getClass();
            ((C147743y) xVar.instance).f398678a = aiVar;
            C147635c cVar = (C147635c) C147702d.f398613c.createBuilder();
            int i3 = lVar.f231131c;
            cVar.copyOnWrite();
            ((C147702d) cVar.instance).f398616b = i3;
            C119103al alVar2 = lVar.f231130b;
            if (alVar2 == null) {
                alVar2 = C119103al.f332227e;
            }
            boolean z = alVar2.f332232d;
            cVar.copyOnWrite();
            ((C147702d) cVar.instance).f398615a = z;
            C147702d dVar = (C147702d) cVar.build();
            xVar.copyOnWrite();
            dVar.getClass();
            ((C147743y) xVar.instance).f398682e = dVar;
            C68189by byVar = lVar.f231134f;
            if (byVar == null) {
                byVar = C68189by.f184505b;
            }
            xVar.copyOnWrite();
            byVar.getClass();
            ((C147743y) xVar.instance).f398680c = byVar;
            return (C147743y) xVar.build();
        }
        throw null;
    }

    /* renamed from: c */
    public static C60870cx m136801c(C85349r rVar, boolean z) {
        C60870cx g = C60922j.m93044g(rVar.mo78864a(), new C85330h(z), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
