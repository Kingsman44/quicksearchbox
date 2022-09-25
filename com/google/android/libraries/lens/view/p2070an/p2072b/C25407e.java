package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.RectF;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56221ab;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56225af;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56232am;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56234ao;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56236aq;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56237ar;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56238as;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.an.b.e */
/* compiled from: PG */
public final class C25407e {
    /* renamed from: b */
    public static final C56225af m46813b(C56226ag agVar, RectF rectF) {
        C56225af afVar = (C56225af) agVar.toBuilder();
        for (int i = 0; i < agVar.f149765b.size(); i++) {
            C56221ab a = m46812a((C56224ae) agVar.f149765b.get(i), rectF);
            afVar.copyOnWrite();
            C56226ag agVar2 = (C56226ag) afVar.instance;
            C56224ae aeVar = (C56224ae) a.build();
            aeVar.getClass();
            agVar2.mo54336a();
            agVar2.f149765b.set(i, aeVar);
        }
        return afVar;
    }

    /* renamed from: c */
    public static final C56234ao m46814c(C56235ap apVar, RectF rectF) {
        C56234ao aoVar = (C56234ao) apVar.toBuilder();
        if ((apVar.f149782a & 1) != 0) {
            C56224ae aeVar = apVar.f149784c;
            if (aeVar == null) {
                aeVar = C56224ae.f149753h;
            }
            C56221ab a = m46812a(aeVar, rectF);
            aoVar.copyOnWrite();
            C56235ap apVar2 = (C56235ap) aoVar.instance;
            C56224ae aeVar2 = (C56224ae) a.build();
            aeVar2.getClass();
            apVar2.f149784c = aeVar2;
            apVar2.f149782a |= 1;
        }
        for (int i = 0; i < apVar.f149783b.size(); i++) {
            C56233an anVar = (C56233an) apVar.f149783b.get(i);
            C56232am amVar = (C56232am) anVar.toBuilder();
            if ((anVar.f149777a & 1) != 0) {
                C56224ae aeVar3 = anVar.f149779c;
                if (aeVar3 == null) {
                    aeVar3 = C56224ae.f149753h;
                }
                C56221ab a2 = m46812a(aeVar3, rectF);
                amVar.copyOnWrite();
                C56233an anVar2 = (C56233an) amVar.instance;
                C56224ae aeVar4 = (C56224ae) a2.build();
                aeVar4.getClass();
                anVar2.f149779c = aeVar4;
                anVar2.f149777a |= 1;
            }
            for (int i2 = 0; i2 < anVar.f149778b.size(); i2++) {
                C56238as d = m46815d((C56241av) anVar.f149778b.get(i2), rectF);
                amVar.copyOnWrite();
                C56233an anVar3 = (C56233an) amVar.instance;
                C56241av avVar = (C56241av) d.build();
                avVar.getClass();
                anVar3.mo54341a();
                anVar3.f149778b.set(i2, avVar);
            }
            aoVar.copyOnWrite();
            C56235ap apVar3 = (C56235ap) aoVar.instance;
            C56233an anVar4 = (C56233an) amVar.build();
            anVar4.getClass();
            apVar3.mo54343a();
            apVar3.f149783b.set(i, anVar4);
        }
        return aoVar;
    }

    /* renamed from: d */
    public static final C56238as m46815d(C56241av avVar, RectF rectF) {
        C56238as asVar = (C56238as) avVar.toBuilder();
        if ((avVar.f149793a & 4) != 0) {
            C56224ae aeVar = avVar.f149797e;
            if (aeVar == null) {
                aeVar = C56224ae.f149753h;
            }
            C56221ab a = m46812a(aeVar, rectF);
            asVar.copyOnWrite();
            C56241av avVar2 = (C56241av) asVar.instance;
            C56224ae aeVar2 = (C56224ae) a.build();
            aeVar2.getClass();
            avVar2.f149797e = aeVar2;
            avVar2.f149793a |= 4;
        }
        for (int i = 0; i < avVar.f149794b.size(); i++) {
            C56237ar arVar = (C56237ar) avVar.f149794b.get(i);
            C56236aq aqVar = (C56236aq) arVar.toBuilder();
            if ((arVar.f149788a & 1) != 0) {
                C56224ae aeVar3 = arVar.f149789b;
                if (aeVar3 == null) {
                    aeVar3 = C56224ae.f149753h;
                }
                C56221ab a2 = m46812a(aeVar3, rectF);
                aqVar.copyOnWrite();
                C56237ar arVar2 = (C56237ar) aqVar.instance;
                C56224ae aeVar4 = (C56224ae) a2.build();
                aeVar4.getClass();
                arVar2.f149789b = aeVar4;
                arVar2.f149788a |= 1;
            }
            asVar.copyOnWrite();
            C56241av avVar3 = (C56241av) asVar.instance;
            C56237ar arVar3 = (C56237ar) aqVar.build();
            arVar3.getClass();
            C62971cq cqVar = avVar3.f149794b;
            if (!cqVar.mo58948c()) {
                avVar3.f149794b = C62942bv.mutableCopy(cqVar);
            }
            avVar3.f149794b.set(i, arVar3);
        }
        return asVar;
    }

    /* renamed from: a */
    static final C56221ab m46812a(C56224ae aeVar, RectF rectF) {
        int a;
        if ((aeVar.f149755a & 32) == 0 || ((a = C56223ad.m87941a(aeVar.f149761g)) != 0 && a != 1)) {
            return (C56221ab) aeVar.toBuilder();
        }
        float width = rectF.width();
        float height = rectF.height();
        float f = rectF.left;
        float f2 = rectF.top;
        C56221ab abVar = (C56221ab) aeVar.toBuilder();
        float f3 = aeVar.f149757c;
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a |= 2;
        aeVar2.f149757c = (f3 * width) + f;
        float f4 = aeVar.f149756b;
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a = 1 | aeVar3.f149755a;
        aeVar3.f149756b = (f4 * height) + f2;
        float f5 = aeVar.f149758d;
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 4;
        aeVar4.f149758d = f5 * width;
        float f6 = aeVar.f149759e;
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149755a |= 8;
        aeVar5.f149759e = f6 * height;
        return abVar;
    }
}
