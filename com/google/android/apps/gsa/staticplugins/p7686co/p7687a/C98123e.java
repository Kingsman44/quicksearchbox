package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.e */
/* compiled from: PG */
final class C98123e extends C98063ar {

    /* renamed from: a */
    public final int f273990a;

    /* renamed from: b */
    public final C58485gu f273991b;

    /* renamed from: c */
    public final C7744ii f273992c;

    /* renamed from: d */
    private final boolean f273993d;

    public C98123e(int i, C58485gu guVar, boolean z, C7744ii iiVar) {
        this.f273990a = i;
        if (guVar != null) {
            this.f273991b = guVar;
            this.f273993d = z;
            this.f273992c = iiVar;
            return;
        }
        throw new NullPointerException("Null addedEntries");
    }

    /* renamed from: a */
    public final int mo90913a() {
        return this.f273990a;
    }

    /* renamed from: b */
    public final C58485gu mo90914b() {
        return this.f273991b;
    }

    /* renamed from: c */
    public final C7744ii mo90915c() {
        return this.f273992c;
    }

    /* renamed from: d */
    public final boolean mo90916d() {
        return this.f273993d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = r4.f273992c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98063ar
            r2 = 0
            if (r1 == 0) goto L_0x003e
            com.google.android.apps.gsa.staticplugins.co.a.ar r5 = (com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98063ar) r5
            int r1 = r4.f273990a
            int r3 = r5.mo90913a()
            if (r1 != r3) goto L_0x003e
            com.google.common.b.gu r1 = r4.f273991b
            com.google.common.b.gu r3 = r5.mo90914b()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x003e
            boolean r1 = r4.f273993d
            boolean r3 = r5.mo90916d()
            if (r1 != r3) goto L_0x003e
            com.google.ai.b.ii r1 = r4.f273992c
            if (r1 != 0) goto L_0x0032
            com.google.ai.b.ii r5 = r5.mo90915c()
            if (r5 != 0) goto L_0x003e
            goto L_0x003d
        L_0x0032:
            com.google.ai.b.ii r5 = r5.mo90915c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            return r0
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98123e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f273990a ^ 1000003) * 1000003) ^ this.f273991b.hashCode()) * 1000003) ^ (true != this.f273993d ? 1237 : 1231)) * 1000003;
        C7744ii iiVar = this.f273992c;
        if (iiVar == null) {
            i = 0;
        } else {
            i = iiVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        int i = this.f273990a;
        String obj = this.f273991b.toString();
        boolean z = this.f273993d;
        String valueOf = String.valueOf(this.f273992c);
        return "UpdatePushedEntryChangesResult{updatedCount=" + i + ", addedEntries=" + obj + ", hasEntryTree=" + z + ", entryTree=" + valueOf + "}";
    }
}
