package com.google.android.libraries.gsa.conversation.clientop;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60930r;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.g */
/* compiled from: PG */
public final /* synthetic */ class C22495g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C22528i f62074a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f62075b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f62076c;

    /* renamed from: d */
    public final /* synthetic */ C22434e f62077d;

    /* renamed from: e */
    public final /* synthetic */ int f62078e;

    public /* synthetic */ C22495g(C22528i iVar, C68214a aVar, int i, C51809dy dyVar, C22434e eVar) {
        this.f62074a = iVar;
        this.f62075b = aVar;
        this.f62078e = i;
        this.f62076c = dyVar;
        this.f62077d = eVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = com.google.android.libraries.gsa.conversation.p1855h.C22715s.m42323f();
        r0.mo27842c(r4.f135936b);
        r0.mo27843d(com.google.android.libraries.gsa.conversation.p1855h.C22714r.f62529c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return com.google.common.util.concurrent.C60856cj.m92900i(r0.mo27840a());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r10 = this;
            java.lang.String r0 = "Unrecognized ExecutionMode: %s"
            com.google.android.libraries.gsa.conversation.clientop.i r1 = r10.f62074a
            dagger.a r2 = r10.f62075b
            int r3 = r10.f62078e
            com.google.assistant.e.j.dy r4 = r10.f62076c
            com.google.android.libraries.gsa.conversation.clientop.e r5 = r10.f62077d
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.gsa.conversation.clientop.o r2 = (com.google.android.libraries.gsa.conversation.clientop.C22538o) r2     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.f.a r6 = r1.f62133d     // Catch:{ Exception -> 0x0075 }
            long r6 = r6.mo26872d()     // Catch:{ Exception -> 0x0075 }
            int r8 = r3 + -2
            if (r3 == 0) goto L_0x0073
            r9 = 1
            if (r8 == r9) goto L_0x0056
            r9 = 2
            if (r8 == r9) goto L_0x0046
            r2 = 4
            if (r8 == r2) goto L_0x003f
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0075 }
            int r2 = com.google.android.libraries.gsa.conversation.p1855h.C22690ac.m42221a(r3)     // Catch:{ Exception -> 0x0075 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0075 }
            r3.append(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0075 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0075 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x007a
        L_0x003f:
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b     // Catch:{ Exception -> 0x0075 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x004a
        L_0x0046:
            com.google.common.util.concurrent.cx r0 = r2.mo20765a(r4, r5)     // Catch:{ Exception -> 0x0075 }
        L_0x004a:
            com.google.android.libraries.gsa.conversation.clientop.h r2 = new com.google.android.libraries.gsa.conversation.clientop.h     // Catch:{ Exception -> 0x0075 }
            r2.<init>(r1, r4, r6)     // Catch:{ Exception -> 0x0075 }
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ Exception -> 0x0075 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r2, r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x007a
        L_0x0056:
            com.google.android.libraries.gsa.conversation.clientop.m r0 = new com.google.android.libraries.gsa.conversation.clientop.m     // Catch:{ m -> 0x005c }
            r0.<init>()     // Catch:{ m -> 0x005c }
            throw r0     // Catch:{ m -> 0x005c }
        L_0x005c:
            com.google.android.libraries.gsa.conversation.h.q r0 = com.google.android.libraries.gsa.conversation.p1855h.C22715s.m42323f()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r1 = r4.f135936b     // Catch:{ Exception -> 0x0075 }
            r0.mo27842c(r1)     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.gsa.conversation.h.r r1 = com.google.android.libraries.gsa.conversation.p1855h.C22714r.POSTPONED     // Catch:{ Exception -> 0x0075 }
            r0.mo27843d(r1)     // Catch:{ Exception -> 0x0075 }
            com.google.android.libraries.gsa.conversation.h.s r0 = r0.mo27840a()     // Catch:{ Exception -> 0x0075 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x007a
        L_0x0073:
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.C22495g.mo18058a():com.google.common.util.concurrent.cx");
    }
}
