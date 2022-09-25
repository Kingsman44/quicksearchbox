package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.gsa.conversation.g.l */
/* compiled from: PG */
public final class C22668l {

    /* renamed from: a */
    public static final C22668l f62437a = new C22668l(C60856cj.m92900i(C22667k.NORMAL), C58485gu.m89845m());

    /* renamed from: b */
    public final C60870cx f62438b;

    /* renamed from: c */
    public final C58485gu f62439c;

    public C22668l(C60870cx cxVar, C58485gu guVar) {
        this.f62438b = cxVar;
        this.f62439c = guVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58485gu mo27778a() {
        return C58485gu.m89842j(C58597ky.m90217h(this.f62439c, C22664h.f62432a));
    }

    /* renamed from: b */
    public final C60870cx mo27779b() {
        return C60922j.m93044g(this.f62438b, C22662f.f62430a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo27780c() {
        return C60922j.m93044g(C60856cj.m92896e((Iterable) Collection.EL.stream(this.f62439c).map(C22660d.f62428a).collect(C58370cn.f155946a)), C22661e.f62429a, C60826bg.f164896a);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.protobuf.bv] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo27781d(boolean r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.b.gu r1 = r9.f62439c
            int r2 = r1.size()
            r3 = 0
        L_0x000c:
            if (r3 >= r2) goto L_0x0085
            java.lang.Object r4 = r1.get(r3)
            com.google.android.libraries.gsa.conversation.g.j r4 = (com.google.android.libraries.gsa.conversation.p1853g.C22666j) r4
            com.google.common.util.concurrent.cx r5 = r4.mo27710b()
            boolean r5 = r5.isDone()
            r6 = 0
            if (r5 == 0) goto L_0x002f
            com.google.common.util.concurrent.cx r5 = r4.mo27710b()     // Catch:{ CancellationException | ExecutionException -> 0x002e }
            java.lang.Object r5 = com.google.common.util.concurrent.C60856cj.m92909r(r5)     // Catch:{ CancellationException | ExecutionException -> 0x002e }
            com.google.android.libraries.gsa.conversation.h.s r5 = (com.google.android.libraries.gsa.conversation.p1855h.C22715s) r5     // Catch:{ CancellationException | ExecutionException -> 0x002e }
            com.google.assistant.e.j.ec r6 = r5.mo27849d()     // Catch:{ CancellationException | ExecutionException -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            if (r10 == 0) goto L_0x0075
            if (r6 != 0) goto L_0x0075
            com.google.assistant.e.j.ec r5 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.dz r5 = (com.google.assistant.p3897e.p3921j.C51810dz) r5
            com.google.assistant.e.j.kg r6 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.kd r6 = (com.google.assistant.p3897e.p3921j.C52233kd) r6
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.CANCELLED
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.kg r8 = (com.google.assistant.p3897e.p3921j.C52236kg) r8
            int r7 = r7.f137088t
            r8.f137092b = r7
            int r7 = r8.f137091a
            r7 = r7 | 1
            r8.f137091a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.ec r7 = (com.google.assistant.p3897e.p3921j.C52070ec) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.kg r6 = (com.google.assistant.p3897e.p3921j.C52236kg) r6
            r6.getClass()
            r7.f136654b = r6
            int r6 = r7.f136653a
            r6 = r6 | 1
            r7.f136653a = r6
            com.google.protobuf.bv r5 = r5.build()
            r6 = r5
            com.google.assistant.e.j.ec r6 = (com.google.assistant.p3897e.p3921j.C52070ec) r6
        L_0x0075:
            if (r6 == 0) goto L_0x0082
            com.google.assistant.e.j.ep r4 = r4.mo27709a()
            android.util.Pair r4 = android.util.Pair.create(r4, r6)
            r0.add(r4)
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.p1853g.C22668l.mo27781d(boolean):java.util.List");
    }
}
