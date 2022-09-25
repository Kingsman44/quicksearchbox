package com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1722b;

import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20983o;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a.C20936c;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.google.protos.youtube.elements.p5166b.C66086at;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5499b.C69840i;

/* renamed from: com.google.android.libraries.elements.d.e.a.b.d */
/* compiled from: PG */
public final class C20967d extends CommandHandler {

    /* renamed from: a */
    public final long f58766a;

    /* renamed from: b */
    private final C58485gu f58767b;

    /* renamed from: c */
    private final C58528ij f58768c;

    /* renamed from: d */
    private final boolean f58769d;

    /* renamed from: e */
    private final C70128t f58770e;

    /* renamed from: f */
    private final C20983o f58771f;

    /* renamed from: g */
    private final Optional f58772g;

    /* renamed from: h */
    private final C69464a f58773h;

    public C20967d(Map map, Set set, C21259bb bbVar, Optional optional, Optional optional2, C70128t tVar, C69464a aVar, Optional optional3, C20983o oVar, C69464a aVar2) {
        C58485gu guVar;
        C69464a aVar3 = aVar;
        Set set2 = set;
        C58431eu<C21312s> c = C58431eu.m89653c(map.values(), set);
        HashSet hashSet = new HashSet();
        C58526ih ihVar = new C58526ih();
        for (C21312s a : c) {
            C62917ay a2 = a.mo25802a();
            if (!hashSet.add(a2)) {
                ihVar.mo55373c(a2);
                C66260r rVar = C66260r.LOG_TYPE_CONFIGURATION_ERROR;
                int a3 = a2.mo58810a();
                C21259bb bbVar2 = bbVar;
                bbVar.mo25782a(rVar, "Multiple command handlers found for extension " + a3, C21319z.f59680u, (Throwable) null);
            } else {
                C21259bb bbVar3 = bbVar;
            }
        }
        C58528ij f = ihVar.mo55486f();
        this.f58768c = f;
        if (f.isEmpty()) {
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(c);
            m39418d(e, aVar3);
            guVar = e.mo55394f();
        } else {
            C58480gp e2 = C58485gu.m89837e();
            for (C21312s sVar : c) {
                if (!f.contains(sVar.mo25802a())) {
                    e2.mo55395g(sVar);
                }
            }
            m39418d(e2, aVar3);
            guVar = e2.mo55394f();
        }
        this.f58767b = guVar;
        Optional optional4 = optional;
        this.f58769d = ((Boolean) optional.orElse(false)).booleanValue();
        this.f58772g = optional2;
        this.f58770e = tVar;
        this.f58766a = ((Long) optional3.orElse(0L)).longValue();
        this.f58771f = oVar;
        this.f58773h = aVar2;
    }

    /* renamed from: b */
    public static C69794a m39417b(C21312s sVar, CommandOuterClass$Command commandOuterClass$Command, C21311r rVar, long j) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(sVar.mo25802a());
        commandOuterClass$Command.mo58887l(r0);
        Object l = commandOuterClass$Command.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        if (j > 0) {
            do {
            } while (System.nanoTime() < System.nanoTime() + (j * 1000000));
        }
        return sVar.mo25804c(obj, rVar);
    }

    /* renamed from: d */
    private static void m39418d(C58480gp gpVar, C69464a aVar) {
        C58485gu f = gpVar.mo55394f();
        int i = ((C58724pq) f).f156474d;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (((C21312s) f.get(i2)).mo25802a().mo58810a() != 342268478) {
                i2 = i3;
            } else {
                return;
            }
        }
        gpVar.mo55395g((C21312s) aVar.mo17428b());
    }

    /* renamed from: a */
    public final C66086at mo26079a(C21311r rVar) {
        C21319z zVar;
        if (!((C21233ac) this.f58773h.mo17428b()).mo26165b()) {
            return null;
        }
        if (rVar == null) {
            zVar = C21319z.f59680u;
        } else {
            zVar = rVar.mo26734d();
        }
        return C21168q.m39752f(zVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.p5490b.C69794a mo26080c(com.google.protos.youtube.elements.CommandOuterClass$Command r13, com.google.android.libraries.elements.interfaces.C21311r r14) {
        /*
            r12 = this;
            com.google.common.b.gu r0 = r12.f58767b
            r1 = r0
            com.google.common.b.pq r1 = (com.google.common.p4522b.C58724pq) r1
            int r1 = r1.f156474d
            r2 = 0
            r3 = 0
            r5 = r3
            r4 = 0
        L_0x000b:
            if (r4 >= r1) goto L_0x002e
            java.lang.Object r5 = r0.get(r4)
            com.google.android.libraries.elements.interfaces.s r5 = (com.google.android.libraries.elements.interfaces.C21312s) r5
            com.google.protobuf.ay r6 = r5.mo25802a()
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r13.mo58887l(r7)
            int r4 = r4 + 1
            com.google.protobuf.bf r8 = r13.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x002c
            r11 = r6
            goto L_0x0030
        L_0x002c:
            r5 = r6
            goto L_0x000b
        L_0x002e:
            r11 = r5
            r5 = r3
        L_0x0030:
            r0 = -1
            if (r5 != 0) goto L_0x00b1
            com.google.common.b.ij r14 = r12.f58768c
            com.google.common.b.sl r14 = r14.iterator()
        L_0x0039:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r14.next()
            com.google.protobuf.ay r1 = (com.google.protobuf.C62917ay) r1
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r13.mo58887l(r3)
            com.google.protobuf.bf r4 = r13.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x0039
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            int r14 = r1.mo58810a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Suppressed command with extension "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " due to multiple conflicting handlers."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            io.b.a r13 = p5488io.p5490b.C69794a.m101254f(r13)
            goto L_0x00b0
        L_0x0077:
            byte[] r13 = r13.toByteArray()     // Catch:{ IOException -> 0x0090 }
            int r14 = com.google.protobuf.C62897ae.f169827g     // Catch:{ IOException -> 0x0090 }
            int r14 = r13.length     // Catch:{ IOException -> 0x0090 }
            com.google.protobuf.ae r13 = com.google.protobuf.C62897ae.m95112O(r13, r2, r14)     // Catch:{ IOException -> 0x0090 }
            boolean r14 = r13.mo58661D()     // Catch:{ IOException -> 0x0090 }
            if (r14 == 0) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            int r13 = r13.mo58678m()     // Catch:{ IOException -> 0x0090 }
            int r2 = r13 >>> 3
            goto L_0x0092
        L_0x0090:
            r2 = -1
        L_0x0092:
            if (r2 != 0) goto L_0x0099
            io.b.a r13 = p5488io.p5490b.p5497e.p5502e.p5503a.C69874i.f186267a
            io.b.d.d r14 = p5488io.p5490b.p5517i.C70101a.f186847o
            goto L_0x00b0
        L_0x0099:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Unrecognized command with extension id: "
            r14.<init>(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            io.b.a r13 = p5488io.p5490b.C69794a.m101254f(r13)
        L_0x00b0:
            return r13
        L_0x00b1:
            boolean r1 = r12.f58769d
            if (r1 == 0) goto L_0x0122
            if (r11 == 0) goto L_0x0122
            int r1 = r11.mo58810a()
            com.google.protos.youtube.elements.au r2 = r5.mo25803b()
            j$.util.Optional r4 = r12.f58772g
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x00dd
            j$.util.Optional r4 = r12.f58772g
            java.lang.Object r4 = r4.get()
            com.google.common.base.ah r4 = (com.google.common.base.C58817ah) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.apply(r1)
            com.google.protos.youtube.elements.au r1 = (com.google.protos.youtube.elements.C66059au) r1
            if (r1 != 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            if (r2 != 0) goto L_0x00e1
        L_0x00df:
            r0 = r3
            goto L_0x0110
        L_0x00e1:
            int r1 = r2.f179647b
            int r1 = com.google.protos.youtube.elements.C66057as.m96834a(r1)
            r2 = 1
            if (r1 != 0) goto L_0x00eb
            r1 = 1
        L_0x00eb:
            int r1 = r1 + r0
            if (r1 == r2) goto L_0x0100
            r0 = 2
            if (r1 == r0) goto L_0x00f2
            goto L_0x00df
        L_0x00f2:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x00fd
            goto L_0x00df
        L_0x00fd:
            io.b.t r0 = r12.f58770e
            goto L_0x0110
        L_0x0100:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x010b
            goto L_0x00df
        L_0x010b:
            io.b.t r0 = p5488io.p5490b.p5491a.p5493b.C69797b.f186184a
            p5488io.p5490b.p5491a.p5492a.C69795a.m101266a(r0)
        L_0x0110:
            if (r0 == 0) goto L_0x0122
            com.google.android.libraries.elements.d.e.a.b.c r1 = new com.google.android.libraries.elements.d.e.a.b.c
            r1.<init>(r12, r5, r13, r14)
            io.b.e.e.a.l r2 = new io.b.e.e.a.l
            r2.<init>(r1)
            io.b.d.d r1 = p5488io.p5490b.p5517i.C70101a.f186847o
            io.b.a r3 = r2.mo61452j(r0)
        L_0x0122:
            if (r3 != 0) goto L_0x012c
            long r0 = r12.f58766a
            io.b.a r0 = m39417b(r5, r13, r14, r0)
            r7 = r0
            goto L_0x012d
        L_0x012c:
            r7 = r3
        L_0x012d:
            com.google.protos.youtube.elements.b.at r10 = r12.mo26079a(r14)
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r9 = r14.mo26739h()
            com.google.android.libraries.elements.d.e.a.o r6 = r12.f58771f
            r8 = r13
            io.b.a r13 = r6.mo26094a(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1722b.C20967d.mo26080c(com.google.protos.youtube.elements.CommandOuterClass$Command, com.google.android.libraries.elements.interfaces.r):io.b.a");
    }

    public final void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
        C21311r rVar;
        if (commandRunContext instanceof C20936c) {
            rVar = ((C20936c) commandRunContext).f58709a;
        } else if (commandRunContext != null) {
            C21309p k = C21311r.m40252k();
            ((C21230a) k).f59563d = commandRunContext.senderState();
            rVar = k.mo26698a();
        } else {
            C21309p k2 = C21311r.m40252k();
            ((C21230a) k2).f59563d = SenderStateOuterClass$SenderState.f179521a;
            rVar = k2.mo26698a();
        }
        C69794a c = mo26080c(commandOuterClass$Command, rVar);
        if (commandRunCompletionCallback != null) {
            C20964a aVar = new C20964a(commandRunCompletionCallback);
            C69821c cVar = C69840i.f186211d;
            c = c.mo61455m(cVar, cVar, aVar).mo61449d(new C20965b(commandRunCompletionCallback));
        }
        c.mo61453k();
    }
}
