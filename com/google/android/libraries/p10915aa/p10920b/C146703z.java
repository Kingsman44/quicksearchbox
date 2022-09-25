package com.google.android.libraries.p10915aa.p10920b;

import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50907j;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50913p;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50919v;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.aa.b.z */
/* compiled from: PG */
public final class C146703z {

    /* renamed from: a */
    private static final C58974d f396147a = C58974d.m91136j();

    /* renamed from: a */
    public static C58495hd m238987a(C146672at atVar, C146659ag agVar) {
        Object obj;
        C50907j jVar;
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = ((C58528ij) m238988b(agVar).collect(C58370cn.f155947b)).iterator();
        while (lA.hasNext()) {
            C50913p pVar = (C50913p) lA.next();
            int i = pVar.f132556a;
            int i2 = i != 0 ? i != 1 ? 0 : 1 : 2;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    if (i == 1) {
                        jVar = (C50907j) pVar.f132557b;
                    } else {
                        jVar = C50907j.f132539c;
                    }
                    C50919v vVar = jVar.f132541a;
                    if (vVar == null) {
                        vVar = C50919v.f132564d;
                    }
                    Optional a = C146675aw.m238932a(atVar, C146660ah.m238906c(vVar));
                    if (!a.isPresent()) {
                        ((C58970a) ((C58970a) f396147a.mo56224b()).mo56372aa(48692)).mo56386p("Could not find the root node of the list");
                        obj = C58733pz.f156496a;
                    } else if (((C146672at) a.get()).mo123451a() <= jVar.f132542b) {
                        ((C58970a) ((C58970a) f396147a.mo56224b()).mo56372aa(48691)).mo56386p("Not enough elements in the list");
                        obj = C58733pz.f156496a;
                    } else {
                        obj = new C58759qy((C146672at) ((C146672at) a.get()).mo123453c(jVar.f132542b).get());
                    }
                } else if (i3 != 1) {
                    ((C58970a) ((C58970a) f396147a.mo56225c()).mo56372aa(48693)).mo56386p("Unexpected error in `getMatchesForPrecomputedCondition` method.");
                    obj = C58733pz.f156496a;
                } else {
                    ((C58970a) ((C58970a) f396147a.mo56225c()).mo56372aa(48694)).mo56386p("Precomputed condition is not set");
                    obj = C58733pz.f156496a;
                }
                gzVar.mo55429h(pVar, obj);
            } else {
                throw null;
            }
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: b */
    public static Stream m238988b(C146659ag agVar) {
        int b = agVar.mo123435b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            return Stream.CC.m71936of((T[]) new C50913p[0]);
        } else {
            if (i == 1) {
                return Collection.EL.stream(agVar.mo123434a()).flatMap(C146702y.f396146a);
            }
            if (i == 2) {
                return Collection.EL.stream(agVar.mo123437d()).flatMap(C146702y.f396146a);
            }
            if (i != 3) {
                ((C58970a) ((C58970a) f396147a.mo56225c()).mo56372aa(48695)).mo56386p("Unexpected error in `getAllPrecomputedConditions` method.");
                return Stream.CC.m71936of((T[]) new C50913p[0]);
            } else if (!agVar.mo123436c().isPresent() || !((C146654ab) agVar.mo123436c().get()).mo123431e().isPresent()) {
                return Stream.CC.m71936of((T[]) new C50913p[0]);
            } else {
                return Stream.CC.m71935of((C50913p) ((C146654ab) agVar.mo123436c().get()).mo123431e().get());
            }
        }
    }
}
