package org.p5633c.p5634a.p5640f;

import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.c */
/* compiled from: PG */
final class C72273c extends C72288l {
    private static final long serialVersionUID = 6941492635554961361L;

    /* renamed from: a */
    final int f192362a;

    /* renamed from: f */
    final C72276f f192363f;

    /* renamed from: g */
    final C72276f f192364g;

    public C72273c(String str, int i, C72276f fVar, C72276f fVar2) {
        super(str);
        this.f192362a = i;
        this.f192363f = fVar;
        this.f192364g = fVar2;
    }

    /* renamed from: a */
    public final int mo37823a(long j) {
        return this.f192362a + mo63654c(j).f192378c;
    }

    /* renamed from: b */
    public final int mo37824b(long j) {
        return this.f192362a;
    }

    /* renamed from: c */
    public final C72276f mo63654c(long j) {
        long j2;
        int i = this.f192362a;
        C72276f fVar = this.f192363f;
        C72276f fVar2 = this.f192364g;
        try {
            j2 = fVar.f192376a.mo63655a(j, i, fVar2.f192378c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = fVar2.f192376a.mo63655a(j, i, fVar.f192378c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return j2 > j ? fVar : fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 < 0) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo37826d(long r9) {
        /*
            r8 = this;
            int r0 = r8.f192362a
            org.c.a.f.f r1 = r8.f192363f
            org.c.a.f.f r2 = r8.f192364g
            r3 = 0
            int r5 = r2.f192378c     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
            org.c.a.f.d r6 = r1.f192376a     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
            long r5 = r6.mo63655a(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0019
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0019
        L_0x0018:
            r5 = r9
        L_0x0019:
            int r1 = r1.f192378c     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
            org.c.a.f.d r2 = r2.f192376a     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
            long r0 = r2.mo63655a(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x002a
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r9 = r0
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            return r9
        L_0x0032:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5640f.C72273c.mo37826d(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r5 > 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo37827e(long r9) {
        /*
            r8 = this;
            r0 = 1
            long r9 = r9 + r0
            int r0 = r8.f192362a
            org.c.a.f.f r1 = r8.f192363f
            org.c.a.f.f r2 = r8.f192364g
            r3 = 0
            int r5 = r2.f192378c     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
            org.c.a.f.d r6 = r1.f192376a     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
            long r5 = r6.mo63656b(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x001c
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x001c
        L_0x001b:
            r5 = r9
        L_0x001c:
            int r1 = r1.f192378c     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
            org.c.a.f.d r2 = r2.f192376a     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
            long r0 = r2.mo63656b(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002d
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r9 = r0
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r9
        L_0x0036:
            r9 = -1
            long r5 = r5 + r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5640f.C72273c.mo37827e(long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72273c) {
            C72273c cVar = (C72273c) obj;
            return this.f192423d.equals(cVar.f192423d) && this.f192362a == cVar.f192362a && this.f192363f.equals(cVar.f192363f) && this.f192364g.equals(cVar.f192364g);
        }
    }

    /* renamed from: g */
    public final String mo37830g(long j) {
        return mo63654c(j).f192377b;
    }

    /* renamed from: h */
    public final boolean mo37831h() {
        return false;
    }
}
