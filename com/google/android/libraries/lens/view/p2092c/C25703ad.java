package com.google.android.libraries.lens.view.p2092c;

/* renamed from: com.google.android.libraries.lens.view.c.ad */
/* compiled from: PG */
final class C25703ad extends C25724t {

    /* renamed from: a */
    private final C25723s f69886a;

    /* renamed from: b */
    private final int f69887b;

    public C25703ad(C25723s sVar, int i) {
        if (sVar != null) {
            this.f69886a = sVar;
            this.f69887b = i;
            return;
        }
        throw new NullPointerException("Null shortcutEligibility");
    }

    /* renamed from: a */
    public final C25723s mo30835a() {
        return this.f69886a;
    }

    /* renamed from: b */
    public final int mo30836b() {
        return this.f69887b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f69887b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.p2092c.C25724t
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.lens.view.c.t r5 = (com.google.android.libraries.lens.view.p2092c.C25724t) r5
            com.google.android.libraries.lens.view.c.s r1 = r4.f69886a
            com.google.android.libraries.lens.view.c.s r3 = r5.mo30835a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002a
            int r1 = r4.f69887b
            if (r1 != 0) goto L_0x0022
            int r5 = r5.mo30836b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x0022:
            int r5 = r5.mo30836b()
            if (r1 == r5) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2092c.C25703ad.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f69886a.hashCode() ^ 1000003) * 1000003;
        int i = this.f69887b;
        if (i == 0) {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f69886a.toString();
        int i = this.f69887b;
        return "ShortcutEligibilityAndType{shortcutEligibility=" + obj + ", shortcutType=" + C25726v.m47502a(i) + "}";
    }
}
