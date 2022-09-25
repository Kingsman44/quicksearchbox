package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.protobuf.C62917ay;
import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bc */
/* compiled from: PG */
public final class C34247bc implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f91107a;

    /* renamed from: b */
    final /* synthetic */ C34043bf f91108b;

    /* renamed from: c */
    final /* synthetic */ C62917ay f91109c;

    public C34247bc(C71588o oVar, C34043bf bfVar, C62917ay ayVar) {
        this.f91107a = oVar;
        this.f91108b = bfVar;
        this.f91109c = ayVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34246bb
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.invocation.o.f.a.bb r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34246bb) r0
            int r1 = r0.f91105b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91105b = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.f.a.bb r0 = new com.google.android.libraries.search.assistant.invocation.o.f.a.bb
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f91104a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91105b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r10)
            goto L_0x0091
        L_0x0027:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002f:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.b.o r10 = r8.f91107a
            com.google.protobuf.MessageLite r9 = (com.google.protobuf.MessageLite) r9
            com.google.android.libraries.search.assistant.invocation.o.f.a.w r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34313w.f91242e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.f.a.o r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34305o) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.f.a.ct r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.assistant.invocation.o.a.bf r5 = r8.f91108b
            r2.mo39306b(r5)
            com.google.android.libraries.search.assistant.invocation.o.a.bl r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl.f90749a
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.a.bk r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.bn r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.protobuf.ay r6 = r8.f91109c
            java.lang.String r7 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r7)
            com.google.android.libraries.search.assistant.invocation.o.a.bk r7 = r5.f90752a
            r7.mo58885m(r6, r9)
            com.google.android.libraries.search.assistant.invocation.o.a.bl r9 = r5.mo39196a()
            r2.mo39307c(r9)
            com.google.android.libraries.search.assistant.invocation.o.f.a.v r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34312v.f91240a
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.f.a.u r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34311u) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r4)
            com.google.android.libraries.search.assistant.invocation.o.f.a.cv r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.libraries.search.assistant.invocation.o.f.a.v r9 = r9.mo39309a()
            r2.mo39308d(r9)
            com.google.android.libraries.search.assistant.invocation.o.f.a.w r9 = r2.mo39305a()
            r0.f91105b = r3
            java.lang.Object r9 = r10.mo20883a(r9, r0)
            if (r9 != r1) goto L_0x0091
            return r1
        L_0x0091:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34247bc.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
