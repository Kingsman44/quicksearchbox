package com.google.android.libraries.search.silk.p3162a.p3174l;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.silk.p3205a.p3227p.C41730a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56790h;

/* renamed from: com.google.android.libraries.search.silk.a.l.a */
/* compiled from: PG */
public final class C40619a implements C41730a {

    /* renamed from: a */
    private final C37215b f106592a;

    /* renamed from: b */
    private final C21370a f106593b;

    /* renamed from: c */
    private final C38750am f106594c;

    public C40619a(C21370a aVar, C37215b bVar, C38750am amVar) {
        this.f106592a = bVar;
        this.f106593b = aVar;
        this.f106594c = amVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ff A[LOOP:1: B:40:0x00f9->B:42:0x00ff, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo42555a(com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56788f r15) {
        /*
            r14 = this;
            com.google.bv.b.a.a.p.b r0 = r15.f151539b
            if (r0 != 0) goto L_0x0006
            com.google.bv.b.a.a.p.b r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56784b.f151520j
        L_0x0006:
            com.google.protobuf.ch r1 = r0.f151526e
            int r1 = r1.size()
            int[] r8 = new int[r1]
            r1 = 0
        L_0x000f:
            com.google.protobuf.ch r2 = r0.f151526e
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0022
            com.google.protobuf.ch r2 = r0.f151526e
            int r2 = r2.mo58914d(r1)
            r8[r1] = r2
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0022:
            int r1 = r0.f151522a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0033
            int r1 = r0.f151529h
            com.google.s.a.a.a.a.a.b r1 = com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b.m97202a(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0035
        L_0x0033:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0035:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.bv.b.a.a.p.d r3 = r0.f151530i
            if (r3 != 0) goto L_0x003d
            com.google.bv.b.a.a.p.d r3 = com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56786d.f151531d
        L_0x003d:
            int r3 = r3.f151533a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0053
            com.google.bv.b.a.a.p.d r2 = r0.f151530i
            if (r2 != 0) goto L_0x0049
            com.google.bv.b.a.a.p.d r2 = com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56786d.f151531d
        L_0x0049:
            int r2 = r2.f151534b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x0053:
            int r3 = r0.f151524c
            com.google.s.a.a.a.a.a.b r4 = com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b.UNKNOWN
            java.lang.Object r4 = r1.mo56109e(r4)
            com.google.s.a.a.a.a.a.b r4 = (com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b) r4
            com.google.android.libraries.search.b.e.b r9 = new com.google.android.libraries.search.b.e.b
            r9.<init>(r3, r4)
            com.google.android.libraries.search.b.i.b r10 = new com.google.android.libraries.search.b.i.b
            com.google.android.libraries.search.b.b.a r11 = new com.google.android.libraries.search.b.b.a
            int r3 = r0.f151523b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "EXTERNAL_EVENT_"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            boolean r4 = r0.f151527f
            int r5 = r0.f151522a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0089
            long r5 = r0.f151528g
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x008b
        L_0x0089:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
        L_0x008b:
            int r6 = r0.f151523b
            com.google.android.libraries.search.b.i.m r7 = new com.google.android.libraries.search.b.i.m
            int r12 = r0.f151525d
            int r13 = r0.f151524c
            com.google.s.a.a.a.a.a.b r13 = com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b.UNKNOWN
            java.lang.Object r1 = r1.mo56109e(r13)
            com.google.s.a.a.a.a.a.b r1 = (com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b) r1
            com.google.bv.b.a.a.p.d r0 = r0.f151530i
            if (r0 != 0) goto L_0x00a1
            com.google.bv.b.a.a.p.d r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56786d.f151531d
        L_0x00a1:
            int r0 = r0.f151535c
            r7.<init>(r12, r2, r0)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r11)
            int r0 = r15.f151538a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00d2
            com.google.android.libraries.f.a r0 = r14.f106593b
            long r0 = r0.mo26872d()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r3 = r14.f106593b
            long r3 = r3.mo26870b()
            long r2 = r2.toNanos(r3)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r15.f151540c
            long r4 = r4.toNanos(r5)
            long r2 = r2 - r0
            long r4 = r4 - r2
            r10.mo40791o(r4)
        L_0x00d2:
            int r0 = r15.f151538a
            r1 = r0 & 4
            if (r1 == 0) goto L_0x00f0
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00e4
            int r0 = r15.f151541d
            java.lang.String r1 = r15.f151542e
            r10.mo40780d(r0, r1)
            goto L_0x00f3
        L_0x00e4:
            int r0 = r15.f151541d
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.m94931a(r0)
            if (r0 == 0) goto L_0x00f0
            r10.mo40781e(r0)
            goto L_0x00f3
        L_0x00f0:
            r10.mo40787k()
        L_0x00f3:
            com.google.protobuf.cq r15 = r15.f151543f
            java.util.Iterator r15 = r15.iterator()
        L_0x00f9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r15.next()
            com.google.bv.b.a.a.p.j r0 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56792j) r0
            java.lang.String r1 = r0.f151550a
            java.lang.String r0 = r0.f151551b
            r10.mo40795s(r1, r0)
            goto L_0x00f9
        L_0x010d:
            com.google.android.libraries.search.b.b r15 = r14.f106592a
            com.google.common.util.concurrent.cx r15 = r15.mo19974a(r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.silk.p3162a.p3174l.C40619a.mo42555a(com.google.bv.b.a.a.p.f):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo42556b(C56790h hVar) {
        if ((hVar.f151546a & 1) != 0) {
            return this.f106594c.mo41596h(hVar.f151547b);
        }
        return C60856cj.m92899h(new IllegalArgumentException("No testcode value!"));
    }
}
