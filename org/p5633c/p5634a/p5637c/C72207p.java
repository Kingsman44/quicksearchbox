package org.p5633c.p5634a.p5637c;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.c.p */
/* compiled from: PG */
final class C72207p extends C72192a implements C72202k {

    /* renamed from: a */
    static final C72207p f192174a = new C72207p();

    protected C72207p() {
    }

    /* renamed from: b */
    public final C72132a mo63530b(Object obj, C72288l lVar) {
        return mo63534f(obj).mo63348e(lVar);
    }

    /* renamed from: d */
    public final int[] mo63532d(C72151ai aiVar, Object obj, C72132a aVar) {
        C72151ai aiVar2 = (C72151ai) obj;
        int e = aiVar.mo63438e();
        int[] iArr = new int[e];
        for (int i = 0; i < e; i++) {
            iArr[i] = aiVar2.mo63392b(aiVar.mo63399r(i));
        }
        aVar.mo63338P(aiVar, iArr);
        return iArr;
    }

    /* renamed from: f */
    public final C72132a mo63534f(Object obj) {
        return C72285i.m106775c(((C72151ai) obj).mo63439f());
    }

    /* renamed from: g */
    public final Class mo63536g() {
        return C72151ai.class;
    }
}
