package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.p10712d.C142500hq;
import com.google.android.p10712d.C142510i;
import com.google.android.p10712d.C142522n;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.e */
/* compiled from: PG */
public final class C95806e {

    /* renamed from: a */
    public static final C59071e f268255a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.e");

    /* renamed from: e */
    private static final C58495hd f268256e;

    /* renamed from: b */
    public final C95724ao f268257b;

    /* renamed from: c */
    public final C142510i f268258c;

    /* renamed from: d */
    public final C142522n f268259d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C142500hq.UNKNOWN_SERVICE, C142510i.GENERIC_ACTION);
        gzVar.mo55429h(C142500hq.TRANSLATE, C142510i.TRANSLATE_ACTION);
        gzVar.mo55429h(C142500hq.HOTLINE, C142510i.ACTION_NOT_SET);
        gzVar.mo55429h(C142500hq.DUO, C142510i.DUO_ACTION);
        f268256e = gzVar.mo55427f(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f2, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95806e(com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95724ao r12, com.google.android.p10712d.C142360cl r13) {
        /*
            r11 = this;
            r11.<init>()
            r11.f268257b = r12
            com.google.common.b.hd r0 = f268256e
            java.util.concurrent.atomic.AtomicReference r12 = r12.f267985c
            java.lang.Object r12 = r12.get()
            com.google.android.apps.gsa.staticplugins.bisto.ae.c r12 = (com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95110c) r12
            if (r12 == 0) goto L_0x0014
            com.google.android.d.hq r12 = r12.f266100a
            goto L_0x0016
        L_0x0014:
            com.google.android.d.hq r12 = com.google.android.p10712d.C142500hq.UNKNOWN_SERVICE
        L_0x0016:
            com.google.android.d.i r1 = com.google.android.p10712d.C142510i.GENERIC_ACTION
            java.lang.Object r12 = r0.getOrDefault(r12, r1)
            com.google.android.d.i r12 = (com.google.android.p10712d.C142510i) r12
            r11.f268258c = r12
            int r0 = r13.f386305a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0163
            com.google.protobuf.z r13 = r13.f386307d     // Catch:{ IllegalArgumentException -> 0x014b }
            byte[] r13 = r13.mo59174N()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.n r0 = com.google.android.p10712d.C142522n.f386743b     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.m r0 = (com.google.android.p10712d.C142521m) r0     // Catch:{ IllegalArgumentException -> 0x014b }
            r2 = 0
            r3 = 0
        L_0x0036:
            int r4 = r13.length     // Catch:{ IllegalArgumentException -> 0x014b }
            r5 = 5
            if (r3 >= r4) goto L_0x00f3
            byte r6 = r13[r3]     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r6 != 0) goto L_0x0040
            goto L_0x00f3
        L_0x0040:
            int r3 = r3 + 1
            int r6 = com.google.android.libraries.gsa.p1825a.p1826a.C22019a.m41267a(r6)     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r3 >= r4) goto L_0x00ed
            byte r4 = r13[r3]     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r4 == 0) goto L_0x00ed
            int r3 = r3 + 1
            int r4 = com.google.android.libraries.gsa.p1825a.p1826a.C22019a.m41267a(r4)     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.i r6 = com.google.android.p10712d.C142510i.m231093a(r6)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.l r7 = com.google.android.p10712d.C142520l.f386739c     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.j r7 = (com.google.android.p10712d.C142518j) r7     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            if (r6 == 0) goto L_0x00e7
            int r6 = r6.ordinal()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            if (r6 == 0) goto L_0x00bd
            r8 = 4
            r9 = 3
            r10 = 2
            if (r6 == r1) goto L_0x0098
            if (r6 == r10) goto L_0x0077
            if (r6 == r9) goto L_0x0071
            goto L_0x00d4
        L_0x0071:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.<init>()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            throw r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
        L_0x0077:
            if (r4 == 0) goto L_0x0085
            if (r4 == r1) goto L_0x0083
            if (r4 == r10) goto L_0x0081
            if (r4 == r9) goto L_0x0086
            r5 = 0
            goto L_0x0086
        L_0x0081:
            r5 = 4
            goto L_0x0086
        L_0x0083:
            r5 = 3
            goto L_0x0086
        L_0x0085:
            r5 = 2
        L_0x0086:
            r7.copyOnWrite()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.protobuf.bv r4 = r7.instance     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.l r4 = (com.google.android.p10712d.C142520l) r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            int r5 = r5 + -2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.f386742b = r5     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.f386741a = r9     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            goto L_0x00d4
        L_0x0098:
            if (r4 == 0) goto L_0x00aa
            if (r4 == r1) goto L_0x00a8
            if (r4 == r10) goto L_0x00a6
            if (r4 == r9) goto L_0x00ab
            if (r4 == r8) goto L_0x00a4
            r5 = 0
            goto L_0x00ab
        L_0x00a4:
            r5 = 6
            goto L_0x00ab
        L_0x00a6:
            r5 = 4
            goto L_0x00ab
        L_0x00a8:
            r5 = 3
            goto L_0x00ab
        L_0x00aa:
            r5 = 2
        L_0x00ab:
            r7.copyOnWrite()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.protobuf.bv r4 = r7.instance     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.l r4 = (com.google.android.p10712d.C142520l) r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            int r5 = r5 + -2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.f386742b = r5     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.f386741a = r10     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            goto L_0x00d4
        L_0x00bd:
            int r4 = com.google.android.p10712d.C142519k.m231094a(r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r7.copyOnWrite()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.l r5 = (com.google.android.p10712d.C142520l) r5     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            if (r4 == r1) goto L_0x00df
            int r4 = r4 + -2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r5.f386742b = r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r5.f386741a = r1     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
        L_0x00d4:
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            com.google.android.d.l r4 = (com.google.android.p10712d.C142520l) r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r0.mo117139a(r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            goto L_0x0036
        L_0x00df:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            java.lang.String r5 = "Can't get the number of an unknown enum value."
            r4.<init>(r5)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            throw r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
        L_0x00e7:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            r4.<init>()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
            throw r4     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0036 }
        L_0x00ed:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x014b }
            r12.<init>()     // Catch:{ IllegalArgumentException -> 0x014b }
            throw r12     // Catch:{ IllegalArgumentException -> 0x014b }
        L_0x00f3:
            com.google.protobuf.bv r13 = r0.build()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.n r13 = (com.google.android.p10712d.C142522n) r13     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.n r0 = com.google.android.p10712d.C142522n.f386743b     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.m r0 = (com.google.android.p10712d.C142521m) r0     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.protobuf.cq r13 = r13.f386745a     // Catch:{ IllegalArgumentException -> 0x014b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IllegalArgumentException -> 0x014b }
        L_0x0107:
            boolean r2 = r13.hasNext()     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r13.next()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.l r2 = (com.google.android.p10712d.C142520l) r2     // Catch:{ IllegalArgumentException -> 0x014b }
            int r3 = r2.f386741a     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r3 != r1) goto L_0x0134
            java.lang.Object r3 = r2.f386742b     // Catch:{ IllegalArgumentException -> 0x014b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x014b }
            int r3 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x014b }
            int r3 = com.google.android.p10712d.C142519k.m231094a(r3)     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r3 != 0) goto L_0x0126
            goto L_0x0134
        L_0x0126:
            if (r3 != r5) goto L_0x0134
            com.google.android.d.i r3 = com.google.android.p10712d.C142510i.GENERIC_ACTION     // Catch:{ IllegalArgumentException -> 0x014b }
            boolean r3 = r3.equals(r12)     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r3 != 0) goto L_0x0107
            r0.mo117139a(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            goto L_0x0107
        L_0x0134:
            int r3 = r2.f386741a     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.i r3 = com.google.android.p10712d.C142510i.m231093a(r3)     // Catch:{ IllegalArgumentException -> 0x014b }
            boolean r3 = r3.equals(r12)     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r3 == 0) goto L_0x0107
            r0.mo117139a(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            goto L_0x0107
        L_0x0144:
            com.google.protobuf.bv r12 = r0.build()     // Catch:{ IllegalArgumentException -> 0x014b }
            com.google.android.d.n r12 = (com.google.android.p10712d.C142522n) r12     // Catch:{ IllegalArgumentException -> 0x014b }
            goto L_0x0165
        L_0x014b:
            r12 = move-exception
            com.google.common.f.e r13 = f268255a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "CustomActionsHandler"
            r13.mo56378ag(r0, r1)
            java.lang.String r0 = "Invalid custom action"
            r1 = 15141(0x3b25, float:2.1217E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r12)).mo56372aa(r1)).mo56386p(r0)
            com.google.android.d.n r12 = com.google.android.p10712d.C142522n.f386743b
            goto L_0x0165
        L_0x0163:
            com.google.android.d.n r12 = com.google.android.p10712d.C142522n.f386743b
        L_0x0165:
            r11.f268259d = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95806e.<init>(com.google.android.apps.gsa.staticplugins.bisto.o.ao, com.google.android.d.cl):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo89780a() {
        return !this.f268259d.f386745a.isEmpty();
    }
}
