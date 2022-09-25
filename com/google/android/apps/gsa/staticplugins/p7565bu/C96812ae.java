package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.ae */
/* compiled from: PG */
final class C96812ae extends C96809ab {

    /* renamed from: a */
    private final Date f270744a;

    /* renamed from: b */
    private final String f270745b;

    /* renamed from: c */
    private final C58495hd f270746c;

    /* renamed from: d */
    private final Throwable f270747d;

    public C96812ae(Date date, String str, C58495hd hdVar, Throwable th) {
        this.f270744a = date;
        this.f270745b = str;
        this.f270746c = hdVar;
        this.f270747d = th;
    }

    /* renamed from: a */
    public final C58495hd mo90355a() {
        return this.f270746c;
    }

    /* renamed from: b */
    public final String mo90356b() {
        return this.f270745b;
    }

    /* renamed from: c */
    public final Throwable mo90357c() {
        return this.f270747d;
    }

    /* renamed from: d */
    public final Date mo90358d() {
        return this.f270744a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.f270747d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.p7565bu.C96809ab
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.apps.gsa.staticplugins.bu.ab r5 = (com.google.android.apps.gsa.staticplugins.p7565bu.C96809ab) r5
            java.util.Date r1 = r4.f270744a
            java.util.Date r3 = r5.mo90358d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = r4.f270745b
            java.lang.String r3 = r5.mo90356b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            com.google.common.b.hd r1 = r4.f270746c
            com.google.common.b.hd r3 = r5.mo90355a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0046
            java.lang.Throwable r1 = r4.f270747d
            if (r1 != 0) goto L_0x003a
            java.lang.Throwable r5 = r5.mo90357c()
            if (r5 != 0) goto L_0x0046
            goto L_0x0045
        L_0x003a:
            java.lang.Throwable r5 = r5.mo90357c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7565bu.C96812ae.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f270744a.hashCode() ^ 1000003) * 1000003) ^ this.f270745b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f270746c.entrySet())) * 1000003;
        Throwable th = this.f270747d;
        if (th == null) {
            i = 0;
        } else {
            i = th.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f270744a.toString();
        String str = this.f270745b;
        String obj2 = this.f270746c.toString();
        String valueOf = String.valueOf(this.f270747d);
        return "MddTaskExecution{invocationTime=" + obj + ", mddTaskTag=" + str + ", phenotypeConfigAndClients=" + obj2 + ", exception=" + valueOf + "}";
    }
}
