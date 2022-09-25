package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72228r;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.ad */
/* compiled from: PG */
public final class C72158ad extends C72173i {

    /* renamed from: H */
    private static final C72158ad f192020H = m105804az(C72288l.f192416b, 4);

    /* renamed from: I */
    private static final ConcurrentHashMap f192021I = new ConcurrentHashMap();
    private static final long serialVersionUID = -8731039522547897247L;

    public C72158ad(C72132a aVar, int i) {
        super(aVar, i);
    }

    /* renamed from: az */
    public static C72158ad m105804az(C72288l lVar, int i) {
        C72158ad adVar;
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        ConcurrentHashMap concurrentHashMap = f192021I;
        C72158ad[] adVarArr = (C72158ad[]) concurrentHashMap.get(lVar);
        if (adVarArr == null) {
            adVarArr = new C72158ad[7];
            C72158ad[] adVarArr2 = (C72158ad[]) concurrentHashMap.putIfAbsent(lVar, adVarArr);
            if (adVarArr2 != null) {
                adVarArr = adVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            C72158ad adVar2 = adVarArr[i2];
            if (adVar2 == null) {
                synchronized (adVarArr) {
                    adVar2 = adVarArr[i2];
                    if (adVar2 == null) {
                        C72288l lVar2 = C72288l.f192416b;
                        if (lVar == lVar2) {
                            adVar = new C72158ad((C72132a) null, i);
                        } else {
                            adVar = new C72158ad(C72165ak.m105884W(m105804az(lVar2, i), lVar), i);
                        }
                        adVarArr[i2] = adVar;
                        adVar2 = adVar;
                    }
                }
            }
            return adVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
    }

    private Object readResolve() {
        C72132a aVar = this.f192053a;
        int i = this.f192099G;
        if (i == 0) {
            i = 4;
        }
        if (aVar == null) {
            return m105804az(C72288l.f192416b, i);
        }
        return m105804az(aVar.mo63325C(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        if (this.f192053a == null) {
            super.mo63441V(aVar);
            aVar.f191985E = new C72228r(this, aVar.f191985E);
            aVar.f191982B = new C72228r(this, aVar.f191982B);
        }
    }

    /* renamed from: ae */
    public final int mo63455ae() {
        return 292272992;
    }

    /* renamed from: ag */
    public final int mo63456ag() {
        return -292269054;
    }

    /* renamed from: am */
    public final long mo63457am(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !mo63463ay(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    /* renamed from: an */
    public final long mo63458an() {
        return 31083663600000L;
    }

    /* renamed from: ao */
    public final long mo63459ao() {
        return 2629800000L;
    }

    /* renamed from: ap */
    public final long mo63460ap() {
        return 31557600000L;
    }

    /* renamed from: aq */
    public final long mo63461aq() {
        return 15778800000L;
    }

    /* renamed from: ar */
    public final long mo63462ar(int i, int i2, int i3) {
        if (i <= 0) {
            if (i != 0) {
                i++;
            } else {
                throw new C72294r(C72283g.f192391g, 0, (Number) null, (Number) null);
            }
        }
        return super.mo63462ar(i, i2, i3);
    }

    /* renamed from: ay */
    public final boolean mo63463ay(int i) {
        return (i & 3) == 0;
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return f192020H;
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        return m105804az(lVar, 4);
    }
}
