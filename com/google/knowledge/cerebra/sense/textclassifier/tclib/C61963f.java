package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.f */
/* compiled from: PG */
final class C61963f extends C61886aw {

    /* renamed from: a */
    private final C58485gu f167432a;

    /* renamed from: b */
    private final String f167433b;

    /* renamed from: c */
    private final boolean f167434c;

    public C61963f(C58485gu guVar, String str, boolean z) {
        this.f167432a = guVar;
        this.f167433b = str;
        this.f167434c = z;
    }

    /* renamed from: a */
    public final C58485gu mo58325a() {
        return this.f167432a;
    }

    /* renamed from: b */
    public final String mo58326b() {
        return this.f167433b;
    }

    /* renamed from: c */
    public final boolean mo58327c() {
        return this.f167434c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f167433b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw
            r2 = 0
            if (r1 == 0) goto L_0x0036
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw) r5
            com.google.common.b.gu r1 = r4.f167432a
            com.google.common.b.gu r3 = r5.mo58325a()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r4.f167433b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo58326b()
            if (r1 != 0) goto L_0x0036
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = r5.mo58326b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x0036
        L_0x002d:
            boolean r1 = r4.f167434c
            boolean r5 = r5.mo58327c()
            if (r1 != r5) goto L_0x0036
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61963f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f167432a.hashCode() ^ 1000003) * 1000003;
        String str = this.f167433b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (true != this.f167434c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f167432a.toString();
        String str = this.f167433b;
        boolean z = this.f167434c;
        return "ConversationActions{conversationActions=" + obj + ", id=" + str + ", sensitive=" + z + "}";
    }
}
