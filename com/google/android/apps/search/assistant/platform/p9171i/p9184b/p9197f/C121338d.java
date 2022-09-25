package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48696bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48707bo;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.assistant.p3781ad.p3789d.p3791b.C48710br;
import com.google.assistant.p3781ad.p3789d.p3791b.C48711bs;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Comparator;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.f.d */
/* compiled from: PG */
public final class C121338d {

    /* renamed from: a */
    public static final Comparator f336946a = Comparator.EL.reversed(Comparator.CC.comparing(C121336b.f336944a, Comparator.CC.comparingDouble(C121337c.f336945a)));

    /* renamed from: a */
    public final C58485gu mo105112a(String str, C58485gu guVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C48708bp bpVar = (C48708bp) guVar.get(i2);
            int length = str.length();
            double d = C59203do.f157270a;
            if (length != 0) {
                C58485gu j = C58485gu.m89842j(C121335a.f336942a.mo56155i(str));
                C48710br brVar = bpVar.f126014c;
                if (brVar == null) {
                    brVar = C48710br.f126019d;
                }
                float f = 0.0f;
                if (brVar.f126021a.size() > 0) {
                    C48710br brVar2 = bpVar.f126014c;
                    if (brVar2 == null) {
                        brVar2 = C48710br.f126019d;
                    }
                    f = 0.0f + C121335a.m200594a(j, C58485gu.m89842j(brVar2.f126021a));
                    i = 1;
                } else {
                    i = 0;
                }
                C48710br brVar3 = bpVar.f126014c;
                if (brVar3 == null) {
                    brVar3 = C48710br.f126019d;
                }
                if (brVar3.f126022b.size() > 0) {
                    C48710br brVar4 = bpVar.f126014c;
                    if (brVar4 == null) {
                        brVar4 = C48710br.f126019d;
                    }
                    f += C121335a.m200594a(j, C58485gu.m89842j(brVar4.f126022b));
                    i++;
                }
                C48710br brVar5 = bpVar.f126014c;
                if (brVar5 == null) {
                    brVar5 = C48710br.f126019d;
                }
                if (brVar5.f126023c.size() > 0) {
                    C48710br brVar6 = bpVar.f126014c;
                    if (brVar6 == null) {
                        brVar6 = C48710br.f126019d;
                    }
                    f += C121335a.m200594a(j, C58485gu.m89842j(brVar6.f126023c));
                    i++;
                }
                if (i != 0) {
                    d = (double) (f / ((float) i));
                }
            }
            if (d >= 0.01d) {
                C48707bo boVar = (C48707bo) C48708bp.f126010g.createBuilder();
                C48672ag b = C48672ag.m85259b(bpVar.f126013b);
                if (b == null) {
                    b = C48672ag.UNKNOWN;
                }
                boVar.copyOnWrite();
                C48708bp bpVar2 = (C48708bp) boVar.instance;
                bpVar2.f126013b = b.f125915O;
                bpVar2.f126012a |= 1;
                C48711bs bsVar = (C48711bs) C48712bt.f126024f.createBuilder();
                bsVar.copyOnWrite();
                C48712bt btVar = (C48712bt) bsVar.instance;
                btVar.f126026a = 1 | btVar.f126026a;
                btVar.f126027b = d;
                C48712bt btVar2 = (C48712bt) bsVar.build();
                boVar.copyOnWrite();
                C48708bp bpVar3 = (C48708bp) boVar.instance;
                btVar2.getClass();
                bpVar3.f126015d = btVar2;
                bpVar3.f126012a |= 4;
                C48706bn bnVar = bpVar.f126016e;
                if (bnVar == null) {
                    bnVar = C48706bn.f126002f;
                }
                boVar.copyOnWrite();
                C48708bp bpVar4 = (C48708bp) boVar.instance;
                bnVar.getClass();
                bpVar4.f126016e = bnVar;
                bpVar4.f126012a |= 8;
                C48696bd bdVar = bpVar.f126017f;
                if (bdVar == null) {
                    bdVar = C48696bd.f125977e;
                }
                boVar.copyOnWrite();
                C48708bp bpVar5 = (C48708bp) boVar.instance;
                bdVar.getClass();
                bpVar5.f126017f = bdVar;
                bpVar5.f126012a |= 16;
                arrayList.add((C48708bp) boVar.build());
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}
