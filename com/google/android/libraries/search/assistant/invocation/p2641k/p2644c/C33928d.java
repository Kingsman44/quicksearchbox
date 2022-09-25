package com.google.android.libraries.search.assistant.invocation.p2641k.p2644c;

import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.c.d */
/* compiled from: PG */
public final class C33928d implements C46675m {

    /* renamed from: a */
    private final C68214a f90495a;

    /* renamed from: b */
    private final C60950i f90496b;

    /* renamed from: c */
    private final C71422aw f90497c;

    public C33928d(C68214a aVar, C60950i iVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "dumpers");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f90495a = aVar;
        this.f90496b = iVar;
        this.f90497c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104692e(this.f90497c, (C71424ay) null, new C33927c(oVar, this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39136b(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33926b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.assistant.invocation.k.c.b r0 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33926b) r0
            int r1 = r0.f90490g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90490g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.k.c.b r0 = new com.google.android.libraries.search.assistant.invocation.k.c.b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f90488e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90490g
            java.lang.String r3 = "append('\\n')"
            java.lang.String r4 = "append(value)"
            r5 = 1
            r6 = 10
            if (r2 == 0) goto L_0x003e
            if (r2 != r5) goto L_0x0036
            java.lang.Object r2 = r0.f90487d
            java.lang.Object r7 = r0.f90486c
            java.lang.Object r8 = r0.f90485b
            java.lang.Object r9 = r0.f90484a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00b2
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003e:
            p5462h.C69714l.m101134b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "APA Invocation:\n"
            r13.append(r2)
            com.google.common.v.i r2 = r12.f90496b
            j$.time.Instant r2 = r2.mo57444a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Current timestamp: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r8.concat(r2)
            r13.append(r2)
            r13.append(r6)
            dagger.a r2 = r12.f90495a
            java.lang.Object r2 = r2.mo27525b()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
            r9 = r13
            r7 = r2
            r2 = r9
        L_0x0078:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00c6
            java.lang.Object r13 = r7.next()
            com.google.android.libraries.search.assistant.invocation.k.c.a r13 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33925a) r13
            java.lang.String r8 = r13.mo39135b()
            r10 = r2
            java.lang.StringBuilder r10 = (java.lang.StringBuilder) r10
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = ":"
            java.lang.String r8 = r8.concat(r11)
            r10.append(r8)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r10.append(r6)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r0.f90484a = r9
            r0.f90485b = r2
            r0.f90486c = r7
            r0.f90487d = r2
            r0.f90490g = r5
            java.lang.Object r13 = r13.mo39134a(r0)
            if (r13 == r1) goto L_0x00c5
            r8 = r2
        L_0x00b2:
            java.lang.String r13 = (java.lang.String) r13
            r10 = r2
            java.lang.StringBuilder r10 = (java.lang.StringBuilder) r10
            r10.append(r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r10.append(r6)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r2 = r8
            goto L_0x0078
        L_0x00c5:
            return r1
        L_0x00c6:
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r13 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33928d.mo39136b(h.c.g):java.lang.Object");
    }
}
