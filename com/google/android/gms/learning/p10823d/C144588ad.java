package com.google.android.gms.learning.p10823d;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.gms.learning.dynamite.training.C144691bg;
import com.google.android.gms.learning.dynamite.training.C144706bv;
import com.google.android.gms.learning.p10820a.C144547dk;
import com.google.android.gms.learning.p10825e.p10826a.C144750m;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29716h;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29702l;
import com.google.android.libraries.micore.learning.p2258a.C29703m;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.p2258a.C29707q;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.android.libraries.micore.learning.training.C29728d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4552o.p4554b.p4555a.C59608ad;
import com.google.common.p4552o.p4554b.p4555a.C59610af;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59637q;
import com.google.common.p4552o.p4554b.p4555a.C59638r;
import com.google.common.p4552o.p4554b.p4555a.C59642v;
import com.google.common.p4552o.p4554b.p4555a.C59644x;
import com.google.common.p4552o.p4554b.p4555a.C59645y;
import com.google.common.p4552o.p4554b.p4555a.C59646z;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p3728as.p3729a.p3730a.p3731a.C48021b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.d.ad */
/* compiled from: PG */
public final class C144588ad {

    /* renamed from: a */
    public static final Pattern f391244a = Pattern.compile("(output|init|result|slice)\\d+\\.ckp");

    /* renamed from: b */
    public static final Pattern f391245b = Pattern.compile("learning_transient\\d+artifact($|\\d+\\.sha1)");

    /* renamed from: c */
    public static final Pattern f391246c = Pattern.compile("secagg\\d+\\.pb");

    /* renamed from: d */
    public static final C29719k f391247d = C29712d.m54802b("brella", "InAppTrngSchdlr");

    /* renamed from: j */
    private static final Executor f391248j = C60826bg.f164896a;

    /* renamed from: e */
    public final Context f391249e;

    /* renamed from: f */
    public final C144573b f391250f;

    /* renamed from: g */
    public final C144827n f391251g;

    /* renamed from: h */
    public final C29716h f391252h;

    /* renamed from: i */
    public final C144582a f391253i;

    /* renamed from: k */
    private final C42876ab f391254k;

    /* renamed from: l */
    private final Random f391255l;

    public C144588ad(Context context, C144573b bVar, C144827n nVar, C42876ab abVar, C29716h hVar, C144582a aVar) {
        Random random = new Random();
        this.f391249e = context;
        this.f391250f = bVar;
        this.f391251g = nVar;
        this.f391254k = abVar;
        this.f391252h = hVar;
        this.f391253i = aVar;
        this.f391255l = random;
    }

    /* renamed from: b */
    public static long m235080b(C29697g gVar) {
        if (m235086p(gVar)) {
            return 0;
        }
        C29703m mVar = gVar.f80435d;
        if (mVar == null) {
            mVar = C29703m.f80444c;
        }
        C62910ar arVar = mVar.f80447b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        return C62948a.m95453d(arVar);
    }

    /* renamed from: d */
    public static C29706p m235081d(C29707q qVar, int i) {
        return m235082e(qVar, new C144613z(i));
    }

    /* renamed from: e */
    public static C29706p m235082e(C29707q qVar, C58839bc bcVar) {
        int i = 0;
        for (C29706p pVar : Collections.unmodifiableList(((C29708r) qVar.instance).f80467a)) {
            if (bcVar.mo5941a(pVar)) {
                qVar.copyOnWrite();
                C29708r rVar = (C29708r) qVar.instance;
                rVar.mo34849a();
                rVar.f80467a.remove(i);
                return pVar;
            }
            i++;
        }
        return null;
    }

    /* renamed from: f */
    public static C29706p m235083f(C29707q qVar, String str) {
        return m235082e(qVar, new C144612y(str));
    }

    /* renamed from: n */
    static List m235085n(C29707q qVar, C58839bc bcVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C29706p pVar : Collections.unmodifiableList(((C29708r) qVar.instance).f80467a)) {
            if (bcVar.mo5941a(pVar)) {
                arrayList2.add(pVar);
            } else {
                arrayList.add(pVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            qVar.copyOnWrite();
            ((C29708r) qVar.instance).f80467a = C29708r.emptyProtobufList();
            qVar.copyOnWrite();
            C29708r rVar = (C29708r) qVar.instance;
            rVar.mo34849a();
            C62947c.addAll((Iterable) arrayList, (List) rVar.f80467a);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public static boolean m235086p(C29697g gVar) {
        C29703m mVar = gVar.f80435d;
        if (mVar == null) {
            mVar = C29703m.f80444c;
        }
        int a = C29702l.m54787a(mVar.f80446a);
        return a != 0 && a == 4;
    }

    /* renamed from: s */
    public static boolean m235087s(Uri uri, String str) {
        if (uri == null) {
            return str.isEmpty();
        }
        return str.equals(uri.toString());
    }

    /* renamed from: v */
    private final synchronized C60838bs m235088v(int i, String str, C144706bv bvVar, C48021b bVar, int i2) {
        return m235090x(new C144597j(this, str, bvVar, i, i2, bVar));
    }

    /* renamed from: w */
    private final synchronized C60838bs m235089w(int i, String str, C144706bv bvVar, int i2) {
        return m235090x(new C144598k(this, str, bvVar, i, i2));
    }

    /* renamed from: x */
    private final C60838bs m235090x(C144587ac acVar) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        C42876ab abVar = this.f391254k;
        C144602o oVar = new C144602o(this, acVar, atomicReference);
        Executor executor = f391248j;
        return (C60838bs) C60846c.m92879h(C60922j.m93044g(C60838bs.m92859i(abVar.mo46040b(oVar, executor)), new C144603p(atomicReference), executor), IOException.class, new C144604q(this), executor);
    }

    /* renamed from: a */
    public final long mo120065a(long j, long j2) {
        long max = Math.max(0, j);
        double max2 = (double) (Math.max(max, j2) - max);
        double nextDouble = this.f391255l.nextDouble();
        Double.isNaN(max2);
        return max + ((long) (max2 * nextDouble));
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.micore.learning.p2258a.C29699i mo120066c(com.google.android.gms.learning.InAppTrainerOptions r6, java.lang.String r7) {
        /*
            r5 = this;
            com.google.android.gms.learning.InAppTrainingConstraints r0 = r6.f391076h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0074
            boolean r3 = r0.f391082a
            if (r3 != 0) goto L_0x0011
            com.google.android.gms.learning.n r3 = r5.f391251g
            r4 = 1150(0x47e, float:1.611E-42)
            r3.mo120056h(r4)
        L_0x0011:
            boolean r3 = r0.f391083b
            if (r3 != 0) goto L_0x001c
            com.google.android.gms.learning.n r3 = r5.f391251g
            r4 = 1149(0x47d, float:1.61E-42)
            r3.mo120056h(r4)
        L_0x001c:
            boolean r3 = r0.f391084c
            if (r3 != 0) goto L_0x0027
            com.google.android.gms.learning.n r3 = r5.f391251g
            r4 = 1148(0x47c, float:1.609E-42)
            r3.mo120056h(r4)
        L_0x0027:
            com.google.android.libraries.micore.learning.a.j r3 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.micore.learning.a.i r3 = (com.google.android.libraries.micore.learning.p2258a.C29699i) r3
            com.google.android.gms.learning.b r4 = r5.f391250f
            boolean r4 = r4.mo119982aP()
            if (r4 != 0) goto L_0x0040
            com.google.android.gms.learning.b r4 = r5.f391250f
            boolean r7 = r4.mo120004al(r7)
            if (r7 != 0) goto L_0x0040
            r1 = 1
        L_0x0040:
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.libraries.micore.learning.a.j r7 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r7
            r7.f80440b = r1
            boolean r7 = r0.f391083b
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.libraries.micore.learning.a.j r1 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r1
            r1.f80441c = r7
            boolean r7 = r0.f391084c
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.android.libraries.micore.learning.a.j r0 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r0
            r0.f80442d = r7
            com.google.android.gms.learning.InAppTrainingConstraints r6 = r6.f391076h
            boolean r6 = r6.f391082a
            com.google.protobuf.o r6 = com.google.protobuf.C63077o.m96099a(r6)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.libraries.micore.learning.a.j r7 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r7
            r6.getClass()
            r7.f80443e = r6
            goto L_0x00c0
        L_0x0074:
            com.google.android.libraries.micore.learning.a.j r6 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
            com.google.protobuf.bn r6 = r6.createBuilder()
            r3 = r6
            com.google.android.libraries.micore.learning.a.i r3 = (com.google.android.libraries.micore.learning.p2258a.C29699i) r3
            com.google.android.gms.learning.b r6 = r5.f391250f
            boolean r6 = r6.mo119982aP()
            if (r6 != 0) goto L_0x008e
            com.google.android.gms.learning.b r6 = r5.f391250f
            boolean r6 = r6.mo120004al(r7)
            if (r6 != 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.micore.learning.a.j r6 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r6
            r6.f80440b = r1
            com.google.android.gms.learning.b r6 = r5.f391250f
            boolean r6 = r6.mo119968aB()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.libraries.micore.learning.a.j r7 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r7
            r6 = r6 ^ r2
            r7.f80441c = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.micore.learning.a.j r6 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r6
            r6.f80442d = r2
            com.google.protobuf.o r6 = com.google.protobuf.C63077o.m96099a(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.libraries.micore.learning.a.j r7 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r7
            r6.getClass()
            r7.f80443e = r6
        L_0x00c0:
            com.google.android.gms.learning.b r6 = r5.f391250f
            long r6 = r6.mo120043w()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00dc
            com.google.protobuf.ar r6 = com.google.protobuf.p4750c.C62948a.m95459j(r6)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.android.libraries.micore.learning.a.j r7 = (com.google.android.libraries.micore.learning.p2258a.C29700j) r7
            r6.getClass()
            r7.f80439a = r6
        L_0x00dc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10823d.C144588ad.mo120066c(com.google.android.gms.learning.InAppTrainerOptions, java.lang.String):com.google.android.libraries.micore.learning.a.i");
    }

    /* renamed from: h */
    public final synchronized C60870cx mo120067h(int i) {
        return m235090x(new C144610w(this, i));
    }

    /* renamed from: i */
    public final synchronized C60870cx mo120068i(InAppTrainerOptions inAppTrainerOptions) {
        C60838bs x;
        InAppTrainerOptions inAppTrainerOptions2 = inAppTrainerOptions;
        synchronized (this) {
            int i = inAppTrainerOptions2.f391071b;
            String packageName = this.f391249e.getPackageName();
            String str = inAppTrainerOptions2.f391070a;
            String a = C29728d.m54829a(packageName + "/" + str, C58837ba.m90858g(inAppTrainerOptions2.f391073d));
            String str2 = inAppTrainerOptions2.f391070a;
            String str3 = inAppTrainerOptions2.f391073d;
            int e = C144691bg.m235196e(inAppTrainerOptions2.f391074e);
            Uri uri = inAppTrainerOptions2.f391075g;
            Uri uri2 = inAppTrainerOptions2.f391078j;
            Uri uri3 = inAppTrainerOptions2.f391081m;
            long j = this.f391250f.mo119964Y() ? inAppTrainerOptions2.f391077i : 0;
            if (j > 0) {
                this.f391251g.mo120056h(1153);
            }
            boolean z = true;
            boolean z2 = inAppTrainerOptions2.f391073d != null;
            if (!z2) {
                if (uri2 == null || uri3 == null) {
                    z = false;
                }
            }
            C58838bb.m90868c(z);
            C144600m mVar = r1;
            C144600m mVar2 = new C144600m(this, str2, z2, i, str3, uri, uri2, uri3, inAppTrainerOptions, a, e, j);
            x = m235090x(mVar);
        }
        return x;
    }

    /* renamed from: j */
    public final synchronized C60870cx mo120069j(String str) {
        return m235090x(new C144611x(this, str));
    }

    /* renamed from: k */
    public final synchronized C60870cx mo120070k(int i, String str, C144706bv bvVar, C48021b bVar, int i2) {
        C60838bs bsVar;
        if (bvVar.mo120140b() == 1) {
            bsVar = m235088v(i, str, bvVar, bVar, i2);
        } else {
            bsVar = m235089w(i, str, bvVar, i2);
        }
        C144590c cVar = new C144590c(this);
        Executor executor = f391248j;
        C60870cx g = C60846c.m92878g(C60922j.m93044g(bsVar, cVar, executor), IOException.class, C144591d.f391259a, executor);
        if (!this.f391250f.mo119965Z()) {
            return g;
        }
        return C60922j.m93044g(g, new C144592e(this), executor);
    }

    /* renamed from: l */
    public final synchronized C60870cx mo120071l(int i) {
        return C60846c.m92878g(m235090x(new C144589b(this, i)), IOException.class, C144599l.f391276a, f391248j);
    }

    /* renamed from: m */
    public final C63042fg mo120072m(long j, long j2, InAppTrainerOptions inAppTrainerOptions, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(this.f391250f.mo119941B()) + j;
        TrainingInterval trainingInterval = inAppTrainerOptions.f391079k;
        if (trainingInterval == null || C144691bg.m235197f(trainingInterval.f391085a) != 3) {
            return C62953e.m95484i(millis);
        }
        long t = mo120076t(inAppTrainerOptions.f391079k.f391086b, 3, z);
        long min = Math.min(j + t, millis);
        if (j2 == 0) {
            return C62953e.m95484i(min);
        }
        return C62953e.m95484i(Math.max(j2 + t, min));
    }

    /* renamed from: o */
    public final void mo120073o(int i, C29707q qVar) {
        if (m235081d(qVar, i) != null) {
            this.f391251g.mo120056h(1166);
        }
    }

    /* renamed from: q */
    public final boolean mo120074q(C29697g gVar) {
        if (gVar.f80434c.isEmpty()) {
            return true;
        }
        try {
            return C144547dk.m234922a(new File(C144750m.m235265c(this.f391249e, gVar.f80434c)));
        } catch (ErrorStatusException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: r */
    public final boolean mo120075r(C29697g gVar) {
        boolean q = mo120074q(gVar);
        if (!q) {
            this.f391251g.mo120056h(1134);
        }
        return q;
    }

    /* renamed from: t */
    public final long mo120076t(long j, int i, boolean z) {
        long j2;
        long j3;
        if (!z) {
            j2 = TimeUnit.SECONDS.toMillis(this.f391250f.mo119952M());
            j3 = TimeUnit.SECONDS.toMillis(this.f391250f.mo119947H());
        } else if (i == 3) {
            j2 = TimeUnit.SECONDS.toMillis(this.f391250f.mo119951L());
            j3 = TimeUnit.SECONDS.toMillis(this.f391250f.mo119948I());
        } else {
            j3 = TimeUnit.SECONDS.toMillis(this.f391250f.mo119943D());
            j2 = 0;
        }
        return Math.max(j2, Math.min(j3, j));
    }

    /* renamed from: u */
    public final void mo120077u(int i, C58833ax axVar, C58833ax axVar2) {
        if (this.f391250f.mo119977aK()) {
            C59637q qVar = (C59637q) C59638r.f159899d.createBuilder();
            qVar.copyOnWrite();
            C59638r rVar = (C59638r) qVar.instance;
            rVar.f159902b = i - 1;
            rVar.f159901a |= 1;
            if (axVar.mo56113h()) {
                qVar.copyOnWrite();
                C59638r rVar2 = (C59638r) qVar.instance;
                rVar2.f159903c = ((C59644x) axVar.mo56107c()).f159916f;
                rVar2.f159901a |= 2;
            }
            C59642v vVar = (C59642v) C59610af.f159830g.createBuilder();
            vVar.copyOnWrite();
            C59610af afVar = (C59610af) vVar.instance;
            C59638r rVar3 = (C59638r) qVar.build();
            rVar3.getClass();
            afVar.f159836e = rVar3;
            afVar.f159835d = 4;
            if (axVar2.mo56113h()) {
                String str = ((InAppTrainerOptions) axVar2.mo56107c()).f391070a;
                vVar.copyOnWrite();
                C59610af afVar2 = (C59610af) vVar.instance;
                str.getClass();
                afVar2.f159832a |= 32;
                afVar2.f159837f = str;
                if (((InAppTrainerOptions) axVar2.mo56107c()).f391073d != null) {
                    C59645y yVar = (C59645y) C59646z.f159917c.createBuilder();
                    String str2 = ((InAppTrainerOptions) axVar2.mo56107c()).f391073d;
                    yVar.copyOnWrite();
                    C59646z zVar = (C59646z) yVar.instance;
                    str2.getClass();
                    zVar.f159919a |= 1;
                    zVar.f159920b = str2;
                    vVar.copyOnWrite();
                    C59610af afVar3 = (C59610af) vVar.instance;
                    C59646z zVar2 = (C59646z) yVar.build();
                    zVar2.getClass();
                    afVar3.f159834c = zVar2;
                    afVar3.f159833b = 1;
                } else {
                    C59608ad adVar = C59608ad.f159827a;
                    vVar.copyOnWrite();
                    C59610af afVar4 = (C59610af) vVar.instance;
                    adVar.getClass();
                    afVar4.f159834c = adVar;
                    afVar4.f159833b = 2;
                }
            }
            C144827n nVar = this.f391251g;
            C59627g gVar = (C59627g) C59628h.f159873h.createBuilder();
            gVar.copyOnWrite();
            C59628h hVar = (C59628h) gVar.instance;
            C59610af afVar5 = (C59610af) vVar.build();
            afVar5.getClass();
            hVar.f159881g = afVar5;
            hVar.f159875a |= 8192;
            nVar.mo120050c((C59628h) gVar.build());
        }
    }

    /* renamed from: g */
    public static C29706p m235084g(C29707q qVar, String str, C144706bv bvVar, int i) {
        int b = bvVar.mo120140b();
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            return m235082e(qVar, new C144607t(str, bvVar, i));
        } else {
            if (i2 != 1) {
                return null;
            }
            return m235082e(qVar, new C144608u(str, bvVar, i));
        }
    }
}
