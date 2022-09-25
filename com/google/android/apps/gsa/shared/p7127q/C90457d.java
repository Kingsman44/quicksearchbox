package com.google.android.apps.gsa.shared.p7127q;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.q.d */
/* compiled from: PG */
public final class C90457d extends C90455b {

    /* renamed from: b */
    private static final C59071e f252686b = C59071e.m91332i("com.google.android.apps.gsa.shared.q.d");

    /* renamed from: a */
    public final int f252687a;

    public C90457d(int i) {
        super("Error code: " + i);
        m147165e(i);
        this.f252687a = i;
    }

    /* renamed from: e */
    private static void m147165e(int i) {
        if (i <= 0) {
            C59052c cVar = (C59052c) f252686b.mo56224b();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(10577)).mo56387q("Error code (%d) must be greater than 0", i);
        }
    }

    /* renamed from: a */
    public final int mo79843a() {
        return this.f252687a;
    }

    /* renamed from: b */
    public final int mo79844b() {
        return 211;
    }

    /* renamed from: c */
    public final Exception mo79845c() {
        return this;
    }

    /* renamed from: d */
    public final boolean mo79846d() {
        return false;
    }

    public C90457d(String str, int i) {
        super("Error code: " + i + " | " + str);
        m147165e(i);
        this.f252687a = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90457d(java.lang.String r4, java.lang.Throwable r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " | "
            r1.append(r2)
            r1.append(r4)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4, r5)
            m147165e(r6)
            r3.f252687a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7127q.C90457d.<init>(java.lang.String, java.lang.Throwable, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90457d(java.lang.Throwable r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " | "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0, r4)
            m147165e(r5)
            r3.f252687a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7127q.C90457d.<init>(java.lang.Throwable, int):void");
    }
}
