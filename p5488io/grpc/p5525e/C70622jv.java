package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.jv */
/* compiled from: PG */
final class C70622jv implements C70374aq {

    /* renamed from: a */
    final C70623jw f188233a;

    /* renamed from: b */
    final /* synthetic */ C70625jy f188234b;

    public C70622jv(C70625jy jyVar, C70623jw jwVar) {
        this.f188234b = jyVar;
        this.f188233a = jwVar;
    }

    /* renamed from: b */
    private static final Integer m103194b(C70334de deVar) {
        String str = (String) deVar.mo62027b(C70625jy.f188244f);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c7, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62080a(p5488io.grpc.Status r21, p5488io.grpc.p5525e.C70373ap r22, p5488io.grpc.C70334de r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            io.grpc.e.jy r4 = r1.f188234b
            java.lang.Object r4 = r4.f188260p
            monitor-enter(r4)
            io.grpc.e.jy r5 = r1.f188234b     // Catch:{ all -> 0x0324 }
            io.grpc.e.jl r6 = r5.f188266v     // Catch:{ all -> 0x0324 }
            io.grpc.e.jw r7 = r1.f188233a     // Catch:{ all -> 0x0324 }
            r8 = 1
            r7.f188236b = r8     // Catch:{ all -> 0x0324 }
            java.util.Collection r9 = r6.f188206c     // Catch:{ all -> 0x0324 }
            boolean r9 = r9.contains(r7)     // Catch:{ all -> 0x0324 }
            if (r9 == 0) goto L_0x0049
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0324 }
            java.util.Collection r10 = r6.f188206c     // Catch:{ all -> 0x0324 }
            r9.<init>(r10)     // Catch:{ all -> 0x0324 }
            r9.remove(r7)     // Catch:{ all -> 0x0324 }
            java.util.Collection r13 = java.util.Collections.unmodifiableCollection(r9)     // Catch:{ all -> 0x0324 }
            io.grpc.e.jl r7 = new io.grpc.e.jl     // Catch:{ all -> 0x0324 }
            java.util.List r12 = r6.f188205b     // Catch:{ all -> 0x0324 }
            java.util.Collection r14 = r6.f188207d     // Catch:{ all -> 0x0324 }
            io.grpc.e.jw r15 = r6.f188209f     // Catch:{ all -> 0x0324 }
            boolean r9 = r6.f188210g     // Catch:{ all -> 0x0324 }
            boolean r10 = r6.f188204a     // Catch:{ all -> 0x0324 }
            boolean r11 = r6.f188211h     // Catch:{ all -> 0x0324 }
            int r6 = r6.f188208e     // Catch:{ all -> 0x0324 }
            r18 = r11
            r11 = r7
            r16 = r9
            r17 = r10
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0324 }
            r6 = r7
        L_0x0049:
            r5.f188266v = r6     // Catch:{ all -> 0x0324 }
            io.grpc.e.jy r5 = r1.f188234b     // Catch:{ all -> 0x0324 }
            io.grpc.e.ed r5 = r5.f188265u     // Catch:{ all -> 0x0324 }
            io.grpc.Status$Code r6 = r21.getCode()     // Catch:{ all -> 0x0324 }
            r5.mo62189a(r6)     // Catch:{ all -> 0x0324 }
            monitor-exit(r4)     // Catch:{ all -> 0x0324 }
            io.grpc.e.jw r4 = r1.f188233a
            boolean r5 = r4.f188237c
            if (r5 == 0) goto L_0x007e
            io.grpc.e.jy r5 = r1.f188234b
            r5.mo62368u(r4)
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jl r4 = r4.f188266v
            io.grpc.e.jw r4 = r4.f188209f
            io.grpc.e.jw r5 = r1.f188233a
            if (r4 != r5) goto L_0x007d
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.Executor r4 = r4.f188255k
            io.grpc.e.jp r5 = new io.grpc.e.jp
            r5.<init>(r1, r0, r2, r3)
            io.grpc.ff r4 = (p5488io.grpc.C70766ff) r4
            r4.mo62446c(r5)
            r4.mo62445b()
        L_0x007d:
            return
        L_0x007e:
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.MISCARRIED
            if (r2 != r4) goto L_0x00c3
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f188268x
            int r4 = r4.incrementAndGet()
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r4 <= r5) goto L_0x00c3
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jw r5 = r1.f188233a
            r4.mo62368u(r5)
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jl r4 = r4.f188266v
            io.grpc.e.jw r4 = r4.f188209f
            io.grpc.e.jw r5 = r1.f188233a
            if (r4 != r5) goto L_0x00c2
            io.grpc.Status r4 = p5488io.grpc.Status.f186915m
            java.lang.String r5 = "Too many transparent retries. Might be a bug in gRPC"
            io.grpc.Status r4 = r4.withDescription(r5)
            io.grpc.fa r5 = new io.grpc.fa
            r6 = 0
            r5.<init>(r0, r6, r8)
            io.grpc.Status r0 = r4.mo61678e(r5)
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.Executor r4 = r4.f188255k
            io.grpc.e.jq r5 = new io.grpc.e.jq
            r5.<init>(r1, r0, r2, r3)
            io.grpc.ff r4 = (p5488io.grpc.C70766ff) r4
            r4.mo62446c(r5)
            r4.mo62445b()
        L_0x00c2:
            return
        L_0x00c3:
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jl r4 = r4.f188266v
            io.grpc.e.jw r4 = r4.f188209f
            if (r4 != 0) goto L_0x0301
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.MISCARRIED
            r5 = 0
            if (r2 == r4) goto L_0x027f
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.REFUSED
            if (r2 != r4) goto L_0x00e0
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f188267w
            boolean r4 = r4.compareAndSet(r5, r8)
            if (r4 == 0) goto L_0x00e0
            goto L_0x027f
        L_0x00e0:
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.DROPPED
            if (r2 != r4) goto L_0x00ef
            io.grpc.e.jy r4 = r1.f188234b
            boolean r5 = r4.f188259o
            if (r5 == 0) goto L_0x0301
            r4.mo62371x()
            goto L_0x0301
        L_0x00ef:
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f188267w
            r4.set(r8)
            io.grpc.e.jy r4 = r1.f188234b
            boolean r6 = r4.f188259o
            if (r6 == 0) goto L_0x01ce
            java.lang.Integer r4 = m103194b(r23)
            io.grpc.e.jy r6 = r1.f188234b
            io.grpc.e.dw r6 = r6.f188258n
            java.util.Set r6 = r6.f187804c
            io.grpc.Status$Code r7 = r21.getCode()
            boolean r6 = r6.contains(r7)
            r6 = r6 ^ r8
            io.grpc.e.jy r7 = r1.f188234b
            io.grpc.e.jx r7 = r7.f188264t
            if (r7 == 0) goto L_0x0129
            if (r6 == 0) goto L_0x011f
            if (r4 == 0) goto L_0x0129
            int r7 = r4.intValue()
            if (r7 >= 0) goto L_0x0129
        L_0x011f:
            io.grpc.e.jy r7 = r1.f188234b
            io.grpc.e.jx r7 = r7.f188264t
            boolean r7 = r7.mo62363b()
            r7 = r7 ^ r8
            goto L_0x012a
        L_0x0129:
            r7 = 0
        L_0x012a:
            if (r6 != 0) goto L_0x012f
            if (r7 != 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r8 = 0
        L_0x0130:
            if (r8 == 0) goto L_0x0176
            io.grpc.e.jy r6 = r1.f188234b
            if (r4 != 0) goto L_0x0137
            goto L_0x0176
        L_0x0137:
            int r7 = r4.intValue()
            if (r7 >= 0) goto L_0x0141
            r6.mo62371x()
            goto L_0x0176
        L_0x0141:
            java.lang.Object r7 = r6.f188260p
            monitor-enter(r7)
            io.grpc.e.jh r9 = r6.f188248B     // Catch:{ all -> 0x0173 }
            if (r9 != 0) goto L_0x014a
            monitor-exit(r7)     // Catch:{ all -> 0x0173 }
            goto L_0x0176
        L_0x014a:
            java.util.concurrent.Future r9 = r9.mo62347a()     // Catch:{ all -> 0x0173 }
            io.grpc.e.jh r10 = new io.grpc.e.jh     // Catch:{ all -> 0x0173 }
            java.lang.Object r11 = r6.f188260p     // Catch:{ all -> 0x0173 }
            r10.<init>(r11)     // Catch:{ all -> 0x0173 }
            r6.f188248B = r10     // Catch:{ all -> 0x0173 }
            monitor-exit(r7)     // Catch:{ all -> 0x0173 }
            if (r9 == 0) goto L_0x015d
            r9.cancel(r5)
        L_0x015d:
            java.util.concurrent.ScheduledExecutorService r5 = r6.f188256l
            io.grpc.e.jj r7 = new io.grpc.e.jj
            r7.<init>(r6, r10)
            int r4 = r4.intValue()
            long r11 = (long) r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r4 = r5.schedule(r7, r11, r4)
            r10.mo62348b(r4)
            goto L_0x0176
        L_0x0173:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0173 }
            throw r0
        L_0x0176:
            io.grpc.e.jy r4 = r1.f188234b
            java.lang.Object r6 = r4.f188260p
            monitor-enter(r6)
            io.grpc.e.jy r4 = r1.f188234b     // Catch:{ all -> 0x01cb }
            io.grpc.e.jl r5 = r4.f188266v     // Catch:{ all -> 0x01cb }
            io.grpc.e.jw r7 = r1.f188233a     // Catch:{ all -> 0x01cb }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01cb }
            java.util.Collection r10 = r5.f188207d     // Catch:{ all -> 0x01cb }
            r9.<init>(r10)     // Catch:{ all -> 0x01cb }
            r9.remove(r7)     // Catch:{ all -> 0x01cb }
            java.util.Collection r14 = java.util.Collections.unmodifiableCollection(r9)     // Catch:{ all -> 0x01cb }
            io.grpc.e.jl r7 = new io.grpc.e.jl     // Catch:{ all -> 0x01cb }
            java.util.List r12 = r5.f188205b     // Catch:{ all -> 0x01cb }
            java.util.Collection r13 = r5.f188206c     // Catch:{ all -> 0x01cb }
            io.grpc.e.jw r15 = r5.f188209f     // Catch:{ all -> 0x01cb }
            boolean r9 = r5.f188210g     // Catch:{ all -> 0x01cb }
            boolean r10 = r5.f188204a     // Catch:{ all -> 0x01cb }
            boolean r11 = r5.f188211h     // Catch:{ all -> 0x01cb }
            int r5 = r5.f188208e     // Catch:{ all -> 0x01cb }
            r18 = r11
            r11 = r7
            r16 = r9
            r17 = r10
            r19 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01cb }
            r4.f188266v = r7     // Catch:{ all -> 0x01cb }
            if (r8 == 0) goto L_0x01c8
            io.grpc.e.jy r4 = r1.f188234b     // Catch:{ all -> 0x01cb }
            io.grpc.e.jl r5 = r4.f188266v     // Catch:{ all -> 0x01cb }
            boolean r4 = r4.mo62372y(r5)     // Catch:{ all -> 0x01cb }
            if (r4 != 0) goto L_0x01c6
            io.grpc.e.jy r4 = r1.f188234b     // Catch:{ all -> 0x01cb }
            io.grpc.e.jl r4 = r4.f188266v     // Catch:{ all -> 0x01cb }
            java.util.Collection r4 = r4.f188207d     // Catch:{ all -> 0x01cb }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            monitor-exit(r6)     // Catch:{ all -> 0x01cb }
            return
        L_0x01c8:
            monitor-exit(r6)     // Catch:{ all -> 0x01cb }
            goto L_0x0301
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01cb }
            throw r0
        L_0x01ce:
            io.grpc.e.jz r4 = r4.f188257m
            r6 = 0
            if (r4 != 0) goto L_0x01d6
            goto L_0x0256
        L_0x01d6:
            java.util.Set r4 = r4.f188276f
            io.grpc.Status$Code r9 = r21.getCode()
            boolean r4 = r4.contains(r9)
            java.lang.Integer r9 = m103194b(r23)
            io.grpc.e.jy r10 = r1.f188234b
            io.grpc.e.jx r10 = r10.f188264t
            if (r10 == 0) goto L_0x01fe
            if (r4 != 0) goto L_0x01f4
            if (r9 == 0) goto L_0x01fe
            int r10 = r9.intValue()
            if (r10 >= 0) goto L_0x01fe
        L_0x01f4:
            io.grpc.e.jy r10 = r1.f188234b
            io.grpc.e.jx r10 = r10.f188264t
            boolean r10 = r10.mo62363b()
            r10 = r10 ^ r8
            goto L_0x01ff
        L_0x01fe:
            r10 = 0
        L_0x01ff:
            io.grpc.e.jy r11 = r1.f188234b
            io.grpc.e.jz r12 = r11.f188257m
            int r12 = r12.f188271a
            io.grpc.e.jw r13 = r1.f188233a
            int r13 = r13.f188238d
            int r13 = r13 + r8
            if (r12 <= r13) goto L_0x0254
            if (r10 != 0) goto L_0x0254
            if (r9 != 0) goto L_0x0239
            if (r4 == 0) goto L_0x0254
            long r4 = r11.f188249C
            double r4 = (double) r4
            java.util.Random r6 = p5488io.grpc.p5525e.C70625jy.f188246h
            double r6 = r6.nextDouble()
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r6
            long r4 = (long) r4
            io.grpc.e.jy r6 = r1.f188234b
            long r9 = r6.f188249C
            io.grpc.e.jz r7 = r6.f188257m
            double r9 = (double) r9
            double r11 = r7.f188274d
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r11
            long r9 = (long) r9
            long r11 = r7.f188273c
            long r9 = java.lang.Math.min(r9, r11)
            r6.f188249C = r9
            goto L_0x0252
        L_0x0239:
            int r4 = r9.intValue()
            if (r4 < 0) goto L_0x0254
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r5 = r9.intValue()
            long r5 = (long) r5
            long r4 = r4.toNanos(r5)
            io.grpc.e.jy r6 = r1.f188234b
            io.grpc.e.jz r7 = r6.f188257m
            long r9 = r7.f188272b
            r6.f188249C = r9
        L_0x0252:
            r6 = r4
            goto L_0x0255
        L_0x0254:
            r8 = 0
        L_0x0255:
            r5 = r8
        L_0x0256:
            if (r5 == 0) goto L_0x0301
            io.grpc.e.jy r0 = r1.f188234b
            java.lang.Object r4 = r0.f188260p
            monitor-enter(r4)
            io.grpc.e.jy r0 = r1.f188234b     // Catch:{ all -> 0x027c }
            io.grpc.e.jh r2 = new io.grpc.e.jh     // Catch:{ all -> 0x027c }
            java.lang.Object r3 = r0.f188260p     // Catch:{ all -> 0x027c }
            r2.<init>(r3)     // Catch:{ all -> 0x027c }
            r0.f188247A = r2     // Catch:{ all -> 0x027c }
            monitor-exit(r4)     // Catch:{ all -> 0x027c }
            io.grpc.e.jy r0 = r1.f188234b
            java.util.concurrent.ScheduledExecutorService r0 = r0.f188256l
            io.grpc.e.jo r3 = new io.grpc.e.jo
            r3.<init>(r1)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r3, r6, r4)
            r2.mo62348b(r0)
            return
        L_0x027c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x027c }
            throw r0
        L_0x027f:
            io.grpc.e.jy r0 = r1.f188234b
            io.grpc.e.jw r2 = r1.f188233a
            int r2 = r2.f188238d
            io.grpc.e.jw r0 = r0.mo62366s(r2, r8)
            io.grpc.e.jy r2 = r1.f188234b
            boolean r3 = r2.f188259o
            if (r3 == 0) goto L_0x02e9
            java.lang.Object r3 = r2.f188260p
            monitor-enter(r3)
            io.grpc.e.jy r2 = r1.f188234b     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jl r4 = r2.f188266v     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jw r6 = r1.f188233a     // Catch:{ all -> 0x02e6 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02e6 }
            java.util.Collection r9 = r4.f188207d     // Catch:{ all -> 0x02e6 }
            r7.<init>(r9)     // Catch:{ all -> 0x02e6 }
            r7.remove(r6)     // Catch:{ all -> 0x02e6 }
            r7.add(r0)     // Catch:{ all -> 0x02e6 }
            java.util.Collection r13 = java.util.Collections.unmodifiableCollection(r7)     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jl r6 = new io.grpc.e.jl     // Catch:{ all -> 0x02e6 }
            java.util.List r11 = r4.f188205b     // Catch:{ all -> 0x02e6 }
            java.util.Collection r12 = r4.f188206c     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jw r14 = r4.f188209f     // Catch:{ all -> 0x02e6 }
            boolean r15 = r4.f188210g     // Catch:{ all -> 0x02e6 }
            boolean r7 = r4.f188204a     // Catch:{ all -> 0x02e6 }
            boolean r9 = r4.f188211h     // Catch:{ all -> 0x02e6 }
            int r4 = r4.f188208e     // Catch:{ all -> 0x02e6 }
            r10 = r6
            r16 = r7
            r17 = r9
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02e6 }
            r2.f188266v = r6     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jy r2 = r1.f188234b     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jl r4 = r2.f188266v     // Catch:{ all -> 0x02e6 }
            boolean r2 = r2.mo62372y(r4)     // Catch:{ all -> 0x02e6 }
            if (r2 != 0) goto L_0x02dc
            io.grpc.e.jy r2 = r1.f188234b     // Catch:{ all -> 0x02e6 }
            io.grpc.e.jl r2 = r2.f188266v     // Catch:{ all -> 0x02e6 }
            java.util.Collection r2 = r2.f188207d     // Catch:{ all -> 0x02e6 }
            int r2 = r2.size()     // Catch:{ all -> 0x02e6 }
            if (r2 != r8) goto L_0x02dc
            goto L_0x02dd
        L_0x02dc:
            r8 = 0
        L_0x02dd:
            monitor-exit(r3)     // Catch:{ all -> 0x02e6 }
            if (r8 == 0) goto L_0x02f4
            io.grpc.e.jy r2 = r1.f188234b
            r2.mo62368u(r0)
            goto L_0x02f4
        L_0x02e6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02e6 }
            throw r0
        L_0x02e9:
            io.grpc.e.jz r3 = r2.f188257m
            if (r3 == 0) goto L_0x02f1
            int r3 = r3.f188271a
            if (r3 != r8) goto L_0x02f4
        L_0x02f1:
            r2.mo62368u(r0)
        L_0x02f4:
            io.grpc.e.jy r2 = r1.f188234b
            java.util.concurrent.Executor r2 = r2.f188254j
            io.grpc.e.jr r3 = new io.grpc.e.jr
            r3.<init>(r1, r0)
            r2.execute(r3)
            return
        L_0x0301:
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jw r5 = r1.f188233a
            r4.mo62368u(r5)
            io.grpc.e.jy r4 = r1.f188234b
            io.grpc.e.jl r4 = r4.f188266v
            io.grpc.e.jw r4 = r4.f188209f
            io.grpc.e.jw r5 = r1.f188233a
            if (r4 != r5) goto L_0x0323
            io.grpc.e.jy r4 = r1.f188234b
            java.util.concurrent.Executor r4 = r4.f188255k
            io.grpc.e.js r5 = new io.grpc.e.js
            r5.<init>(r1, r0, r2, r3)
            io.grpc.ff r4 = (p5488io.grpc.C70766ff) r4
            r4.mo62446c(r5)
            r4.mo62445b()
        L_0x0323:
            return
        L_0x0324:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0324 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70622jv.mo62080a(io.grpc.Status, io.grpc.e.ap, io.grpc.de):void");
    }

    /* renamed from: c */
    public final void mo62082c(C70334de deVar) {
        int i;
        int i2;
        this.f188234b.mo62368u(this.f188233a);
        if (this.f188234b.f188266v.f188209f == this.f188233a) {
            C70624jx jxVar = this.f188234b.f188264t;
            if (jxVar != null) {
                do {
                    i = jxVar.f188242d.get();
                    i2 = jxVar.f188239a;
                    if (i == i2) {
                        break;
                    }
                } while (!jxVar.f188242d.compareAndSet(i, Math.min(jxVar.f188241c + i, i2)));
            }
            C70766ff ffVar = (C70766ff) this.f188234b.f188255k;
            ffVar.mo62446c(new C70613jm(this, deVar));
            ffVar.mo62445b();
        }
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        C70612jl jlVar = this.f188234b.f188266v;
        C58838bb.m90884s(jlVar.f188209f != null, "Headers should be received prior to messages.");
        if (jlVar.f188209f == this.f188233a) {
            C70766ff ffVar = (C70766ff) this.f188234b.f188255k;
            ffVar.mo62446c(new C70620jt(this, lrVar));
            ffVar.mo62445b();
        }
    }

    /* renamed from: e */
    public final void mo62084e() {
        if (this.f188234b.mo61769o()) {
            C70766ff ffVar = (C70766ff) this.f188234b.f188255k;
            ffVar.mo62446c(new C70621ju(this));
            ffVar.mo62445b();
        }
    }
}
