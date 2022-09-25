package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72288l;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.z */
/* compiled from: PG */
public final class C72190z extends C72173i {

    /* renamed from: H */
    public static final C72190z f192153H = m106190az(C72288l.f192416b, 4);

    /* renamed from: I */
    private static final ConcurrentHashMap f192154I = new ConcurrentHashMap();
    private static final long serialVersionUID = -861407383323710522L;

    private C72190z(C72132a aVar, int i) {
        super(aVar, i);
    }

    /* renamed from: az */
    public static C72190z m106190az(C72288l lVar, int i) {
        C72190z zVar;
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        ConcurrentHashMap concurrentHashMap = f192154I;
        C72190z[] zVarArr = (C72190z[]) concurrentHashMap.get(lVar);
        if (zVarArr == null) {
            zVarArr = new C72190z[7];
            C72190z[] zVarArr2 = (C72190z[]) concurrentHashMap.putIfAbsent(lVar, zVarArr);
            if (zVarArr2 != null) {
                zVarArr = zVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            C72190z zVar2 = zVarArr[i2];
            if (zVar2 == null) {
                synchronized (zVarArr) {
                    zVar2 = zVarArr[i2];
                    if (zVar2 == null) {
                        C72288l lVar2 = C72288l.f192416b;
                        if (lVar == lVar2) {
                            zVar = new C72190z((C72132a) null, i);
                        } else {
                            zVar = new C72190z(C72165ak.m105884W(m106190az(lVar2, i), lVar), i);
                        }
                        zVarArr[i2] = zVar;
                        zVar2 = zVar;
                    }
                }
            }
            return zVar2;
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
            return m106190az(C72288l.f192416b, i);
        }
        return m106190az(aVar.mo63325C(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        if (this.f192053a == null) {
            super.mo63441V(aVar);
        }
    }

    /* renamed from: ae */
    public final int mo63455ae() {
        return 292278993;
    }

    /* renamed from: ag */
    public final int mo63456ag() {
        return -292275054;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (mo63463ay(r7) != false) goto L_0x000e;
     */
    /* renamed from: am */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo63457am(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L_0x0011
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        L_0x000e:
            int r1 = r1 + -1
            goto L_0x001e
        L_0x0011:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            int r1 = r1 + r0
            boolean r0 = r6.mo63463ay(r7)
            if (r0 == 0) goto L_0x001e
            goto L_0x000e
        L_0x001e:
            long r2 = (long) r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5636b.C72190z.mo63457am(int):long");
    }

    /* renamed from: an */
    public final long mo63458an() {
        return 31083597720000L;
    }

    /* renamed from: ao */
    public final long mo63459ao() {
        return 2629746000L;
    }

    /* renamed from: ap */
    public final long mo63460ap() {
        return 31556952000L;
    }

    /* renamed from: aq */
    public final long mo63461aq() {
        return 15778476000L;
    }

    /* renamed from: ay */
    public final boolean mo63463ay(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return f192153H;
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        return m106190az(lVar, 4);
    }
}
