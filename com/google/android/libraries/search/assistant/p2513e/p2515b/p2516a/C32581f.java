package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import com.google.speech.micro.GoogleEndpointer;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69647ad;
import p5462h.p5473f.p5475b.C69648ae;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a.f */
/* compiled from: PG */
final class C32581f implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69647ad f87252a;

    /* renamed from: b */
    final /* synthetic */ long f87253b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f87254c;

    /* renamed from: d */
    final /* synthetic */ C32587l f87255d;

    /* renamed from: e */
    final /* synthetic */ C69648ae f87256e;

    /* renamed from: f */
    final /* synthetic */ C69626l f87257f;

    /* renamed from: g */
    final /* synthetic */ C71588o f87258g;

    /* renamed from: h */
    final /* synthetic */ C69648ae f87259h;

    /* renamed from: i */
    final /* synthetic */ GoogleEndpointer f87260i;

    public C32581f(C69647ad adVar, long j, C69648ae aeVar, C32587l lVar, C69648ae aeVar2, C69626l lVar2, C71588o oVar, C69648ae aeVar3, GoogleEndpointer googleEndpointer) {
        this.f87252a = adVar;
        this.f87253b = j;
        this.f87254c = aeVar;
        this.f87255d = lVar;
        this.f87256e = aeVar2;
        this.f87257f = lVar2;
        this.f87258g = oVar;
        this.f87259h = aeVar3;
        this.f87260i = googleEndpointer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.google.android.libraries.search.assistant.e.b.a.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.android.libraries.search.assistant.e.b.a.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(byte[] r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32579d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.assistant.e.b.a.d r3 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32579d) r3
            int r4 = r3.f87249f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f87249f = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.e.b.a.d r3 = new com.google.android.libraries.search.assistant.e.b.a.d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f87247d
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f87249f
            r6 = 0
            r7 = 4
            java.lang.String r8 = "audioProcessedOffset"
            r9 = 3
            r10 = 2
            r11 = 1
            if (r5 == 0) goto L_0x0069
            if (r5 == r11) goto L_0x005c
            if (r5 == r10) goto L_0x0051
            if (r5 == r9) goto L_0x0046
            if (r5 != r7) goto L_0x003e
            java.lang.Object r1 = r3.f87245b
            java.lang.Object r3 = r3.f87244a
            p5462h.C69714l.m101134b(r2)
            goto L_0x01df
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            java.lang.Object r1 = r3.f87246c
            java.lang.Object r5 = r3.f87245b
            java.lang.Object r9 = r3.f87244a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0190
        L_0x0051:
            java.lang.Object r1 = r3.f87246c
            java.lang.Object r5 = r3.f87245b
            java.lang.Object r10 = r3.f87244a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0168
        L_0x005c:
            java.lang.Object r1 = r3.f87245b
            java.lang.Object r5 = r3.f87244a
            p5462h.C69714l.m101134b(r2)
            r16 = r5
            r5 = r1
            r1 = r16
            goto L_0x009e
        L_0x0069:
            p5462h.C69714l.m101134b(r2)
            h.f.b.ad r2 = r0.f87252a
            long r12 = r2.f186026a
            int r5 = r1.length
            long r14 = (long) r5
            long r12 = r12 + r14
            r2.f186026a = r12
            long r14 = r0.f87253b
            long r12 = r12 / r14
            j$.time.Duration r2 = p3186j$.time.Duration.ofMillis(r12)
            h.f.b.ae r5 = r0.f87254c
            java.lang.Object r5 = r5.f186027a
            com.google.android.libraries.search.assistant.e.b.a.c r12 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.FINISHED
            if (r5 == r12) goto L_0x01a5
            com.google.android.libraries.search.assistant.e.b.a.l r5 = r0.f87255d
            h.c.o r5 = r5.f87279b
            com.google.android.libraries.search.assistant.e.b.a.e r12 = new com.google.android.libraries.search.assistant.e.b.a.e
            com.google.speech.micro.GoogleEndpointer r13 = r0.f87260i
            r12.<init>(r13, r1, r6)
            r3.f87244a = r0
            r3.f87245b = r2
            r3.f87249f = r11
            java.lang.Object r1 = kotlinx.coroutines.C71803m.m105040a(r5, r12, r3)
            if (r1 == r4) goto L_0x01a4
            r5 = r2
            r2 = r1
            r1 = r0
        L_0x009e:
            com.google.speech.micro.GoogleEndpointer$GoogleEndpointerResult r2 = (com.google.speech.micro.GoogleEndpointer.GoogleEndpointerResult) r2
            com.google.speech.micro.a r12 = r2.getEvent()
            if (r12 == 0) goto L_0x019e
            com.google.android.libraries.search.assistant.e.b.a.c r13 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.INITIAL
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00d6
            if (r12 != r11) goto L_0x019e
            r12 = r1
            com.google.android.libraries.search.assistant.e.b.a.f r12 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r12
            h.f.b.ae r13 = r12.f87254c
            java.lang.Object r13 = r13.f186027a
            com.google.android.libraries.search.assistant.e.b.a.c r13 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x00d3
            if (r13 == r11) goto L_0x00d3
            if (r13 == r10) goto L_0x00cc
            if (r13 != r9) goto L_0x00c6
            goto L_0x00d3
        L_0x00c6:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x00cc:
            h.f.b.ae r11 = r12.f87254c
            java.lang.Object r11 = r11.f186027a
            com.google.android.libraries.search.assistant.e.b.a.c r11 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c) r11
            goto L_0x0131
        L_0x00d3:
            com.google.android.libraries.search.assistant.e.b.a.c r11 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.SPEAKING
            goto L_0x0131
        L_0x00d6:
            r12 = r1
            com.google.android.libraries.search.assistant.e.b.a.f r12 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r12
            h.f.b.ae r13 = r12.f87254c
            java.lang.Object r13 = r13.f186027a
            com.google.android.libraries.search.assistant.e.b.a.c r13 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x012b
            if (r13 == r11) goto L_0x0108
            if (r13 == r10) goto L_0x012b
            if (r13 != r9) goto L_0x0102
            h.f.a.l r11 = r12.f87257f
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            java.lang.Object r11 = r11.mo5761a(r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00ff
            com.google.android.libraries.search.assistant.e.b.a.c r11 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.FINISHED
            goto L_0x0131
        L_0x00ff:
            com.google.android.libraries.search.assistant.e.b.a.c r11 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.DEBOUNCING
            goto L_0x0131
        L_0x0102:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x0108:
            h.f.b.ae r11 = r12.f87256e
            long r13 = r2.getEventTimestampMs()
            j$.time.Duration r13 = p3186j$.time.Duration.ofMillis(r13)
            r11.f186027a = r13
            h.f.a.l r11 = r12.f87257f
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            java.lang.Object r11 = r11.mo5761a(r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0128
            com.google.android.libraries.search.assistant.e.b.a.c r11 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.FINISHED
            goto L_0x0131
        L_0x0128:
            com.google.android.libraries.search.assistant.e.b.a.c r11 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.DEBOUNCING
            goto L_0x0131
        L_0x012b:
            h.f.b.ae r11 = r12.f87254c
            java.lang.Object r11 = r11.f186027a
            com.google.android.libraries.search.assistant.e.b.a.c r11 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c) r11
        L_0x0131:
            r12 = r1
            com.google.android.libraries.search.assistant.e.b.a.f r12 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r12
            h.f.b.ae r13 = r12.f87254c
            java.lang.Object r13 = r13.f186027a
            if (r11 == r13) goto L_0x019c
            com.google.android.libraries.search.assistant.e.b.a.c r14 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.SPEAKING
            if (r11 != r14) goto L_0x0166
            com.google.android.libraries.search.assistant.e.b.a.c r14 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.INITIAL
            if (r13 != r14) goto L_0x0166
            kotlinx.coroutines.b.o r12 = r12.f87258g
            com.google.android.libraries.search.assistant.e.b.d r13 = new com.google.android.libraries.search.assistant.e.b.d
            long r14 = r2.getEventTimestampMs()
            j$.time.Duration r2 = p3186j$.time.Duration.ofMillis(r14)
            java.lang.String r14 = "ofMillis(result.eventTimestampMs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)
            r13.<init>(r2)
            r3.f87244a = r1
            r3.f87245b = r5
            r3.f87246c = r11
            r3.f87249f = r10
            java.lang.Object r2 = r12.mo20883a(r13, r3)
            if (r2 == r4) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            return r4
        L_0x0166:
            r10 = r1
            r1 = r11
        L_0x0168:
            com.google.android.libraries.search.assistant.e.b.a.c r2 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.FINISHED
            if (r1 != r2) goto L_0x0193
            r2 = r10
            com.google.android.libraries.search.assistant.e.b.a.f r2 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r2
            kotlinx.coroutines.b.o r11 = r2.f87258g
            com.google.android.libraries.search.assistant.e.b.a r12 = new com.google.android.libraries.search.assistant.e.b.a
            h.f.b.ae r2 = r2.f87256e
            java.lang.Object r2 = r2.f186027a
            java.lang.String r13 = "speechEndOffset"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r13)
            j$.time.Duration r2 = (p3186j$.time.Duration) r2
            r12.<init>(r2)
            r3.f87244a = r10
            r3.f87245b = r5
            r3.f87246c = r1
            r3.f87249f = r9
            java.lang.Object r2 = r11.mo20883a(r12, r3)
            if (r2 == r4) goto L_0x0192
            r9 = r10
        L_0x0190:
            r10 = r9
            goto L_0x0193
        L_0x0192:
            return r4
        L_0x0193:
            r2 = r10
            com.google.android.libraries.search.assistant.e.b.a.f r2 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r2
            h.f.b.ae r2 = r2.f87254c
            r2.f186027a = r1
        L_0x019a:
            r1 = r5
            goto L_0x01a7
        L_0x019c:
            r10 = r1
            goto L_0x019a
        L_0x019e:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x01a4:
            return r4
        L_0x01a5:
            r10 = r0
            r1 = r2
        L_0x01a7:
            r2 = r10
            com.google.android.libraries.search.assistant.e.b.a.f r2 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r2
            h.f.b.ae r5 = r2.f87259h
            java.lang.Object r5 = r5.f186027a
            j$.time.Duration r5 = (p3186j$.time.Duration) r5
            r9 = r1
            j$.time.Duration r9 = (p3186j$.time.Duration) r9
            j$.time.Duration r5 = r9.minus(r5)
            com.google.android.libraries.search.assistant.e.b.a.l r11 = r2.f87255d
            com.google.android.libraries.search.assistant.e.b.a.b r11 = r11.f87278a
            j$.time.Duration r11 = r11.f87237b
            int r5 = r5.compareTo((p3186j$.time.Duration) r11)
            if (r5 < 0) goto L_0x01e7
            r9.toMillis()
            kotlinx.coroutines.b.o r2 = r2.f87258g
            com.google.android.libraries.search.assistant.e.b.c r5 = new com.google.android.libraries.search.assistant.e.b.c
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            r5.<init>(r9)
            r3.f87244a = r10
            r3.f87245b = r1
            r3.f87246c = r6
            r3.f87249f = r7
            java.lang.Object r2 = r2.mo20883a(r5, r3)
            if (r2 == r4) goto L_0x01e6
            r3 = r10
        L_0x01df:
            com.google.android.libraries.search.assistant.e.b.a.f r3 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f) r3
            h.f.b.ae r2 = r3.f87259h
            r2.f186027a = r1
            goto L_0x01e7
        L_0x01e6:
            return r4
        L_0x01e7:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32581f.mo20883a(byte[], h.c.g):java.lang.Object");
    }
}
