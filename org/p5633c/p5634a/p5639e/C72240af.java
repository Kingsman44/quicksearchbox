package org.p5633c.p5634a.p5639e;

import org.p5633c.p5634a.C72152aj;

/* renamed from: org.c.a.e.af */
/* compiled from: PG */
final class C72240af implements C72244aj, C72243ai {

    /* renamed from: a */
    public volatile C72244aj f192220a;

    /* renamed from: b */
    public volatile C72243ai f192221b;

    /* renamed from: c */
    private final String f192222c = "T";

    /* renamed from: d */
    private final String[] f192223d = {"T"};

    /* renamed from: e */
    private final C72244aj f192224e;

    /* renamed from: f */
    private final C72243ai f192225f;

    public C72240af(C72244aj ajVar, C72243ai aiVar) {
        this.f192224e = ajVar;
        this.f192225f = aiVar;
    }

    /* renamed from: a */
    public final int mo63582a(C72152aj ajVar) {
        C72244aj ajVar2 = this.f192224e;
        C72244aj ajVar3 = this.f192220a;
        int a = ajVar2.mo63582a(ajVar) + ajVar3.mo63582a(ajVar);
        return ajVar3.mo63583b(ajVar, 1) > 0 ? a + this.f192222c.length() : a;
    }

    /* renamed from: b */
    public final int mo63583b(C72152aj ajVar, int i) {
        int b = this.f192224e.mo63583b(ajVar, i);
        return b < i ? b + this.f192220a.mo63583b(ajVar, i) : b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r11.regionMatches(true, r0, r12, 0, r12.length()) != false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63584c(org.p5633c.p5634a.C72144ab r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            org.c.a.e.ai r0 = r9.f192225f
            int r0 = r0.mo63584c(r10, r11, r12)
            if (r0 >= 0) goto L_0x0009
            return r0
        L_0x0009:
            r7 = -1
            r8 = 0
            if (r0 <= r12) goto L_0x0034
            java.lang.String[] r12 = r9.f192223d
            r12 = r12[r8]
            if (r12 == 0) goto L_0x0028
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0028
            r2 = 1
            r5 = 0
            int r6 = r12.length()
            r1 = r11
            r3 = r0
            r4 = r12
            boolean r1 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0034
        L_0x0028:
            if (r12 != 0) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            int r8 = r12.length()
        L_0x002f:
            int r0 = r0 + r8
            r12 = 1
            r12 = r8
            r8 = 1
            goto L_0x0035
        L_0x0034:
            r12 = -1
        L_0x0035:
            org.c.a.e.ai r1 = r9.f192221b
            int r10 = r1.mo63584c(r10, r11, r0)
            if (r10 >= 0) goto L_0x003e
            return r10
        L_0x003e:
            if (r8 == 0) goto L_0x0048
            if (r10 != r0) goto L_0x0048
            if (r12 > 0) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            r10 = r0 ^ -1
            return r10
        L_0x0048:
            if (r10 <= r0) goto L_0x004e
            if (r8 != 0) goto L_0x004e
            r10 = r0 ^ -1
        L_0x004e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72240af.mo63584c(org.c.a.ab, java.lang.String, int):int");
    }

    /* renamed from: d */
    public final void mo63585d(StringBuffer stringBuffer, C72152aj ajVar) {
        C72244aj ajVar2 = this.f192224e;
        C72244aj ajVar3 = this.f192220a;
        ajVar2.mo63585d(stringBuffer, ajVar);
        if (ajVar3.mo63583b(ajVar, 1) > 0) {
            stringBuffer.append(this.f192222c);
        }
        ajVar3.mo63585d(stringBuffer, ajVar);
    }
}
