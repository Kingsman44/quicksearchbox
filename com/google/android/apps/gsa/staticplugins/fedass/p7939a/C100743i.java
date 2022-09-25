package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.speech.p5199c.p5200a.C66457b;
import com.google.speech.p5199c.p5200a.C66469n;
import com.google.speech.p5199c.p5200a.C66475t;
import com.google.speech.p5199c.p5200a.C66476u;
import com.google.speech.p5199c.p5200a.C66477v;
import com.google.speech.p5228m.C67276ag;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67280ak;
import com.google.speech.p5228m.C67349m;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.i */
/* compiled from: PG */
public final class C100743i {
    /* renamed from: a */
    public static C66477v m166953a(Optional optional, C66457b bVar) {
        long j;
        long j2;
        long j3;
        long j4;
        C66457b bVar2 = bVar;
        C66469n nVar = (C66469n) C66477v.f180755j.createBuilder();
        if (optional.isEmpty()) {
            nVar.copyOnWrite();
            C66477v vVar = (C66477v) nVar.instance;
            bVar.getClass();
            vVar.f180758b = bVar2;
            vVar.f180757a |= 1;
            return (C66477v) nVar.build();
        }
        C67349m mVar = (C67349m) optional.get();
        long j5 = 0;
        if (mVar.f183063b.size() > 0) {
            Iterator it = mVar.f183063b.iterator();
            j4 = 0;
            j3 = 0;
            j2 = 0;
            j = 0;
            while (it.hasNext()) {
                C67280ak akVar = (C67280ak) it.next();
                C66475t tVar = (C66475t) C66476u.f180749e.createBuilder();
                int b = C67278ai.m97449b(akVar.f182884a);
                if (b == 0) {
                    b = 1;
                }
                tVar.copyOnWrite();
                Iterator it2 = it;
                C66476u uVar = (C66476u) tVar.instance;
                uVar.f180752b = b - 1;
                uVar.f180751a |= 1;
                C67276ag agVar = akVar.f182885b;
                if (agVar == null) {
                    agVar = C67276ag.f182875c;
                }
                long j6 = agVar.f182877a;
                tVar.copyOnWrite();
                long j7 = j5;
                C66476u uVar2 = (C66476u) tVar.instance;
                uVar2.f180751a |= 2;
                uVar2.f180753c = j6;
                C67276ag agVar2 = akVar.f182885b;
                if (agVar2 == null) {
                    agVar2 = C67276ag.f182875c;
                }
                long j8 = agVar2.f182878b;
                tVar.copyOnWrite();
                C66476u uVar3 = (C66476u) tVar.instance;
                uVar3.f180751a |= 4;
                uVar3.f180754d = j8 / 1024;
                nVar.mo59633a(tVar);
                int b2 = C67278ai.m97449b(akVar.f182884a);
                if (b2 == 0) {
                    b2 = 1;
                }
                int i = b2 - 1;
                if (i != 1) {
                    if (i == 1000 || i == 1004 || i == 1005) {
                        C67276ag agVar3 = akVar.f182885b;
                        j4 += (agVar3 == null ? C67276ag.f182875c : agVar3).f182877a;
                        if (agVar3 == null) {
                            agVar3 = C67276ag.f182875c;
                        }
                        j3 += agVar3.f182878b;
                    } else {
                        C67276ag agVar4 = akVar.f182885b;
                        j2 += (agVar4 == null ? C67276ag.f182875c : agVar4).f182877a;
                        if (agVar4 == null) {
                            agVar4 = C67276ag.f182875c;
                        }
                        j += agVar4.f182878b;
                    }
                    j5 = j7;
                } else {
                    C67276ag agVar5 = akVar.f182885b;
                    j5 = (agVar5 == null ? C67276ag.f182875c : agVar5).f182877a;
                    if (agVar5 == null) {
                        agVar5 = C67276ag.f182875c;
                    }
                    j += agVar5.f182878b;
                }
                it = it2;
            }
            long j9 = j5;
        } else {
            j4 = 0;
            j3 = 0;
            j2 = 0;
            j = 0;
        }
        nVar.copyOnWrite();
        C66477v vVar2 = (C66477v) nVar.instance;
        bVar.getClass();
        vVar2.f180758b = bVar2;
        vVar2.f180757a |= 1;
        int i2 = mVar.f183062a;
        nVar.copyOnWrite();
        C66477v vVar3 = (C66477v) nVar.instance;
        vVar3.f180757a |= 512;
        vVar3.f180764h = i2;
        nVar.copyOnWrite();
        C66477v vVar4 = (C66477v) nVar.instance;
        vVar4.f180757a |= 8;
        vVar4.f180761e = (int) j5;
        nVar.copyOnWrite();
        C66477v vVar5 = (C66477v) nVar.instance;
        vVar5.f180757a |= 32;
        vVar5.f180762f = (int) j4;
        nVar.copyOnWrite();
        C66477v vVar6 = (C66477v) nVar.instance;
        vVar6.f180757a |= 64;
        vVar6.f180763g = j3 / 1024;
        nVar.copyOnWrite();
        C66477v vVar7 = (C66477v) nVar.instance;
        vVar7.f180757a |= 4;
        vVar7.f180760d = j2;
        nVar.copyOnWrite();
        C66477v vVar8 = (C66477v) nVar.instance;
        vVar8.f180757a |= 2;
        vVar8.f180759c = j / 1024;
        return (C66477v) nVar.build();
    }
}
