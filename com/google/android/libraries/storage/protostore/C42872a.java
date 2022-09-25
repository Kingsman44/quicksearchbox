package com.google.android.libraries.storage.protostore;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;

/* renamed from: com.google.android.libraries.storage.protostore.a */
/* compiled from: PG */
public final class C42872a extends C43009l {

    /* renamed from: b */
    private final C42882ah f112176b;

    /* renamed from: c */
    private final C63691b f112177c;

    /* renamed from: d */
    private final C60888db f112178d;

    /* renamed from: e */
    private final C21370a f112179e;

    /* renamed from: f */
    private final C42985du f112180f;

    /* renamed from: g */
    private final C58833ax f112181g;

    /* renamed from: h */
    private final C58833ax f112182h;

    public C42872a(C42882ah ahVar, C63691b bVar, C60888db dbVar, C21370a aVar, C42985du duVar, C58833ax axVar, C58833ax axVar2) {
        this.f112176b = ahVar;
        this.f112177c = bVar;
        this.f112178d = dbVar;
        this.f112179e = aVar;
        this.f112180f = duVar;
        this.f112181g = axVar;
        this.f112182h = axVar2;
    }

    /* renamed from: a */
    public final C21370a mo45953a() {
        return this.f112179e;
    }

    /* renamed from: b */
    public final C42882ah mo45954b() {
        return this.f112176b;
    }

    /* renamed from: c */
    public final C42985du mo45955c() {
        return this.f112180f;
    }

    /* renamed from: d */
    public final C58833ax mo45956d() {
        return this.f112181g;
    }

    /* renamed from: e */
    public final C58833ax mo45957e() {
        return this.f112182h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f112177c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.storage.protostore.C43009l
            r2 = 0
            if (r1 == 0) goto L_0x0072
            com.google.android.libraries.storage.protostore.l r5 = (com.google.android.libraries.storage.protostore.C43009l) r5
            com.google.android.libraries.storage.protostore.ah r1 = r4.f112176b
            com.google.android.libraries.storage.protostore.ah r3 = r5.mo45954b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            com.google.protos.ap.b.a.b r1 = r4.f112177c
            if (r1 != 0) goto L_0x0022
            com.google.protos.ap.b.a.b r1 = r5.mo45960g()
            if (r1 != 0) goto L_0x0072
            goto L_0x002d
        L_0x0022:
            com.google.protos.ap.b.a.b r3 = r5.mo45960g()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x0072
        L_0x002d:
            com.google.common.util.concurrent.db r1 = r4.f112178d
            com.google.common.util.concurrent.db r3 = r5.mo45959f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            com.google.android.libraries.f.a r1 = r4.f112179e
            com.google.android.libraries.f.a r3 = r5.mo45953a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            int r1 = r5.mo45961h()
            r3 = 52
            if (r1 != r3) goto L_0x0072
            com.google.android.libraries.storage.protostore.du r1 = r4.f112180f
            com.google.android.libraries.storage.protostore.du r3 = r5.mo45955c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            com.google.common.base.ax r1 = r4.f112181g
            com.google.common.base.ax r3 = r5.mo45956d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            com.google.common.base.ax r1 = r4.f112182h
            com.google.common.base.ax r5 = r5.mo45957e()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0072
            return r0
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.protostore.C42872a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C60888db mo45959f() {
        return this.f112178d;
    }

    /* renamed from: g */
    public final C63691b mo45960g() {
        return this.f112177c;
    }

    /* renamed from: h */
    public final int mo45961h() {
        return 52;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f112176b.hashCode() ^ 1000003) * 1000003;
        C63691b bVar = this.f112177c;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        return ((((((((((((hashCode ^ i) * 1000003) ^ this.f112178d.hashCode()) * 1000003) ^ this.f112179e.hashCode()) * 1000003) ^ 52) * 1000003) ^ this.f112180f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String obj = this.f112176b.toString();
        String valueOf = String.valueOf(this.f112177c);
        String obj2 = this.f112178d.toString();
        String obj3 = this.f112179e.toString();
        String num = Integer.toString(51);
        String obj4 = this.f112180f.toString();
        return "LamsConfig{adapter=" + obj + ", stub=" + valueOf + ", scheduledExecutor=" + obj2 + ", clock=" + obj3 + ", clientId=" + num + ", subConfig=" + obj4 + ", minSyncPeriod=Optional.absent(), minSyncTimeUnit=Optional.absent()}";
    }
}
