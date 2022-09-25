package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Window;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.metrics.p2404b.p2405a.C31297b;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71283dl;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71284dm;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71285dn;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71286do;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71293dv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71294dw;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.m */
/* compiled from: PG */
public final class C31390m extends C31399t implements C31209a.C31217h, C31313p {

    /* renamed from: a */
    private static final C59071e f84507a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.d.m");

    /* renamed from: b */
    private final Application f84508b;

    /* renamed from: c */
    private final C31220b f84509c;

    /* renamed from: d */
    private final C31386i f84510d;

    /* renamed from: e */
    private final C31379b f84511e;

    /* renamed from: f */
    private final ArrayMap f84512f;

    /* renamed from: g */
    private final C31310m f84513g;

    /* renamed from: h */
    private final C69464a f84514h;

    /* renamed from: i */
    private final C31297b f84515i;

    /* renamed from: j */
    private final C58881cr f84516j;

    /* renamed from: k */
    private final C69464a f84517k;

    /* renamed from: com.google.android.libraries.performance.primes.metrics.d.m$a */
    /* compiled from: PG */
    final class C31391a implements C31386i, C31209a.C31210a, C31209a.C31211b {

        /* renamed from: a */
        private final Window.OnFrameMetricsAvailableListener f84518a;

        /* renamed from: b */
        private final C68214a f84519b;

        public C31391a(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, C68214a aVar) {
            this.f84518a = onFrameMetricsAvailableListener;
            this.f84519b = aVar;
        }

        /* renamed from: a */
        public void mo36939a(Activity activity) {
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f84518a);
        }

        /* renamed from: b */
        public void mo36938b(Activity activity, Bundle bundle) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f84518a, (Handler) this.f84519b.mo27525b());
        }

        /* renamed from: c */
        public void mo37089c() {
        }

        /* renamed from: d */
        public void mo37090d() {
        }
    }

    /* renamed from: com.google.android.libraries.performance.primes.metrics.d.m$b */
    /* compiled from: PG */
    final class C31392b implements C31209a.C31213d, C31209a.C31212c, C31386i {

        /* renamed from: a */
        private final Window.OnFrameMetricsAvailableListener f84520a;

        /* renamed from: b */
        private final C68214a f84521b;

        /* renamed from: c */
        private Activity f84522c;

        /* renamed from: d */
        private boolean f84523d;

        public C31392b(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, C68214a aVar) {
            this.f84520a = onFrameMetricsAvailableListener;
            this.f84521b = aVar;
        }

        /* renamed from: e */
        private final void m58528e() {
            Activity activity = this.f84522c;
            if (activity != null) {
                activity.getWindow().addOnFrameMetricsAvailableListener(this.f84520a, (Handler) this.f84521b.mo27525b());
            }
        }

        /* renamed from: f */
        private final void m58529f() {
            Activity activity = this.f84522c;
            if (activity != null) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f84520a);
                } catch (RuntimeException unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo36926a(Activity activity) {
            synchronized (this) {
                this.f84522c = activity;
                if (this.f84523d) {
                    m58528e();
                }
            }
        }

        /* renamed from: b */
        public void mo36940b(Activity activity) {
            synchronized (this) {
                if (this.f84523d) {
                    m58529f();
                }
                this.f84522c = null;
            }
        }

        /* renamed from: c */
        public void mo37089c() {
            synchronized (this) {
                this.f84523d = true;
                if (this.f84522c != null) {
                    m58528e();
                }
            }
        }

        /* renamed from: d */
        public void mo37090d() {
            synchronized (this) {
                this.f84523d = false;
                m58529f();
            }
        }
    }

    public C31390m(C31311n nVar, Context context, C31220b bVar, C68214a aVar, C31379b bVar2, C69464a aVar2, C69464a aVar3, Executor executor, C68214a aVar4, C31297b bVar3, C69464a aVar5, C69464a aVar6, boolean z) {
        C31386i iVar;
        ArrayMap arrayMap = new ArrayMap();
        this.f84512f = arrayMap;
        this.f84513g = nVar.mo37026a(executor, aVar, aVar3);
        Application application = (Application) context;
        this.f84508b = application;
        this.f84509c = bVar;
        this.f84514h = aVar2;
        this.f84511e = bVar2;
        this.f84515i = bVar3;
        this.f84516j = C58886cw.m90973a(new C31385h(this, aVar5));
        this.f84517k = aVar5;
        C31388k kVar = new C31388k(application, arrayMap, aVar6);
        if (z) {
            iVar = new C31391a(kVar, aVar4);
        } else {
            iVar = new C31392b(kVar, aVar4);
        }
        this.f84510d = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m58515i(com.google.android.libraries.performance.primes.metrics.p2409d.C31389l r5) {
        /*
            r4 = this;
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r4.f84513g
            java.lang.String r1 = r5.mo37093f()
            boolean r0 = r0.mo37024d(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            android.util.ArrayMap r0 = r4.f84512f
            monitor-enter(r0)
            android.util.ArrayMap r1 = r4.f84512f     // Catch:{ all -> 0x008c }
            int r1 = r1.size()     // Catch:{ all -> 0x008c }
            r2 = 25
            if (r1 < r2) goto L_0x0032
            com.google.common.f.e r1 = f84507a     // Catch:{ all -> 0x008c }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x008c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008c }
            r2 = 50386(0xc4d2, float:7.0606E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x008c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Too many concurrent measurements, ignoring %s"
            r1.mo56389s(r2, r5)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            return
        L_0x0032:
            android.util.ArrayMap r1 = r4.f84512f     // Catch:{ all -> 0x008c }
            g.a.a r2 = r4.f84514h     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x008c }
            com.google.android.libraries.performance.primes.metrics.d.o r2 = (com.google.android.libraries.performance.primes.metrics.p2409d.C31394o) r2     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.put(r5, r2)     // Catch:{ all -> 0x008c }
            com.google.android.libraries.performance.primes.metrics.d.o r1 = (com.google.android.libraries.performance.primes.metrics.p2409d.C31394o) r1     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0061
            android.util.ArrayMap r2 = r4.f84512f     // Catch:{ all -> 0x008c }
            r2.put(r5, r1)     // Catch:{ all -> 0x008c }
            com.google.common.f.e r1 = f84507a     // Catch:{ all -> 0x008c }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x008c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008c }
            r2 = 50385(0xc4d1, float:7.0604E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x008c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "measurement already started: %s"
            r1.mo56389s(r2, r5)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            return
        L_0x0061:
            android.util.ArrayMap r1 = r4.f84512f     // Catch:{ all -> 0x008c }
            int r1 = r1.size()     // Catch:{ all -> 0x008c }
            r2 = 1
            if (r1 != r2) goto L_0x006f
            com.google.android.libraries.performance.primes.metrics.d.i r1 = r4.f84510d     // Catch:{ all -> 0x008c }
            r1.mo37089c()     // Catch:{ all -> 0x008c }
        L_0x006f:
            boolean r1 = android.os.Trace.isEnabled()     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "J<%s>"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x008c }
            java.lang.String r5 = r5.mo37093f()     // Catch:{ all -> 0x008c }
            r3 = 0
            r2[r3] = r5     // Catch:{ all -> 0x008c }
            java.lang.String r5 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x008c }
            r1 = 352691800(0x1505a658, float:2.6990358E-26)
            android.os.Trace.beginAsyncSection(r5, r1)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2409d.C31390m.m58515i(com.google.android.libraries.performance.primes.metrics.d.l):void");
    }

    /* renamed from: j */
    private final C60870cx m58516j(C31389l lVar) {
        C31394o oVar;
        C71294dw dwVar;
        int i;
        if (!this.f84513g.mo37025e()) {
            return C60866ct.f164955a;
        }
        synchronized (this.f84512f) {
            oVar = (C31394o) this.f84512f.remove(lVar);
            if (this.f84512f.isEmpty()) {
                this.f84510d.mo37090d();
            }
        }
        if (oVar == null) {
            ((C59052c) ((C59052c) f84507a.mo56226d()).mo56372aa(50383)).mo56389s("Measurement not found: %s", lVar);
            return C60866ct.f164955a;
        }
        String f = lVar.mo37093f();
        if (Trace.isEnabled()) {
            for (C31403x xVar : ((C31372aa) this.f84517k.mo17428b()).f84472b) {
                int a = C31405z.m58547a(xVar.f84559a);
                if (a == 0) {
                    a = 1;
                }
                switch (a - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = oVar.f84543g;
                        break;
                    case 3:
                        i = oVar.f84545i;
                        break;
                    case 4:
                        i = oVar.f84546j;
                        break;
                    case 5:
                        i = oVar.f84547k;
                        break;
                    case 6:
                        i = oVar.f84548l;
                        break;
                    case 7:
                        i = oVar.f84550n;
                        break;
                    default:
                        String str = xVar.f84560b;
                        continue;
                }
                Trace.setCounter(xVar.f84560b.replace("%EVENT_NAME%", f), (long) i);
            }
            Trace.endAsyncSection(String.format("J<%s>", new Object[]{f}), 352691800);
        }
        if (oVar.f84545i == 0) {
            return C60866ct.f164955a;
        }
        if (((C31372aa) this.f84517k.mo17428b()).f84473c && ((long) oVar.f84550n) <= TimeUnit.SECONDS.toMillis(9) && oVar.f84543g != 0) {
            this.f84515i.mo37005a((String) this.f84516j.mo6453a());
        }
        long c = oVar.f84539c.mo26871c();
        long j = oVar.f84540d;
        C71285dn dnVar = (C71285dn) C71286do.f190335o.createBuilder();
        dnVar.copyOnWrite();
        C71286do doVar = (C71286do) dnVar.instance;
        doVar.f190337a |= 16;
        doVar.f190342f = ((int) (c - j)) + 1;
        int i2 = oVar.f84543g;
        dnVar.copyOnWrite();
        C71286do doVar2 = (C71286do) dnVar.instance;
        doVar2.f190337a |= 1;
        doVar2.f190338b = i2;
        int i3 = oVar.f84545i;
        dnVar.copyOnWrite();
        C71286do doVar3 = (C71286do) dnVar.instance;
        doVar3.f190337a |= 2;
        doVar3.f190339c = i3;
        int i4 = oVar.f84546j;
        dnVar.copyOnWrite();
        C71286do doVar4 = (C71286do) dnVar.instance;
        doVar4.f190337a |= 4;
        doVar4.f190340d = i4;
        int i5 = oVar.f84548l;
        dnVar.copyOnWrite();
        C71286do doVar5 = (C71286do) dnVar.instance;
        doVar5.f190337a |= 32;
        doVar5.f190343g = i5;
        int i6 = oVar.f84550n;
        dnVar.copyOnWrite();
        C71286do doVar6 = (C71286do) dnVar.instance;
        doVar6.f190337a |= 64;
        doVar6.f190344h = i6;
        int i7 = oVar.f84547k;
        dnVar.copyOnWrite();
        C71286do doVar7 = (C71286do) dnVar.instance;
        doVar7.f190337a |= 8;
        doVar7.f190341e = i7;
        int i8 = oVar.f84551o;
        if (i8 != Integer.MIN_VALUE) {
            int[] iArr = C31394o.f84538b;
            int[] iArr2 = oVar.f84542f;
            C71293dv dvVar = (C71293dv) C71294dw.f190376c.createBuilder();
            int i9 = 0;
            while (true) {
                if (i9 >= 52) {
                    if (iArr2[51] > 0) {
                        dvVar.mo62664a(i8 + 1);
                        dvVar.mo62665b(0);
                    }
                    dwVar = (C71294dw) dvVar.build();
                } else if (iArr[i9] > i8) {
                    dvVar.mo62665b(0);
                    dvVar.mo62664a(i8 + 1);
                    dwVar = (C71294dw) dvVar.build();
                } else {
                    int i10 = iArr2[i9];
                    if (i10 > 0 || (i9 > 0 && iArr2[i9 - 1] > 0)) {
                        dvVar.mo62665b(i10);
                        dvVar.mo62664a(iArr[i9]);
                    }
                    i9++;
                }
            }
            dnVar.copyOnWrite();
            C71286do doVar8 = (C71286do) dnVar.instance;
            dwVar.getClass();
            doVar8.f190350n = dwVar;
            doVar8.f190337a |= 2048;
            int i11 = oVar.f84544h;
            dnVar.copyOnWrite();
            C71286do doVar9 = (C71286do) dnVar.instance;
            doVar9.f190337a |= 512;
            doVar9.f190348l = i11;
            int i12 = oVar.f84549m;
            dnVar.copyOnWrite();
            C71286do doVar10 = (C71286do) dnVar.instance;
            doVar10.f190337a |= 1024;
            doVar10.f190349m = i12;
        }
        for (int i13 = 0; i13 < 28; i13++) {
            if (oVar.f84541e[i13] > 0) {
                C71283dl dlVar = (C71283dl) C71284dm.f190329e.createBuilder();
                int i14 = oVar.f84541e[i13];
                dlVar.copyOnWrite();
                C71284dm dmVar = (C71284dm) dlVar.instance;
                dmVar.f190331a |= 1;
                dmVar.f190332b = i14;
                int i15 = C31394o.f84537a[i13];
                dlVar.copyOnWrite();
                C71284dm dmVar2 = (C71284dm) dlVar.instance;
                dmVar2.f190331a |= 2;
                dmVar2.f190333c = i15;
                int i16 = i13 + 1;
                if (i16 < 28) {
                    int i17 = C31394o.f84537a[i16];
                    dlVar.copyOnWrite();
                    C71284dm dmVar3 = (C71284dm) dlVar.instance;
                    dmVar3.f190331a |= 4;
                    dmVar3.f190334d = i17 - 1;
                }
                dnVar.copyOnWrite();
                C71286do doVar11 = (C71286do) dnVar.instance;
                C71284dm dmVar4 = (C71284dm) dlVar.build();
                dmVar4.getClass();
                C62971cq cqVar = doVar11.f190346j;
                if (!cqVar.mo58948c()) {
                    doVar11.f190346j = C62942bv.mutableCopy(cqVar);
                }
                doVar11.f190346j.add(dmVar4);
            }
        }
        C71286do doVar12 = (C71286do) dnVar.build();
        C58833ax a2 = C31384g.m58504a(this.f84508b);
        if (a2.mo56113h()) {
            C71285dn dnVar2 = (C71285dn) doVar12.toBuilder();
            int intValue = ((Float) a2.mo56107c()).intValue();
            dnVar2.copyOnWrite();
            C71286do doVar13 = (C71286do) dnVar2.instance;
            doVar13.f190337a |= 256;
            doVar13.f190347k = intValue;
            doVar12 = (C71286do) dnVar2.build();
        }
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        doVar12.getClass();
        ejVar.f190426k = doVar12;
        ejVar.f190416a |= 1024;
        C31310m mVar = this.f84513g;
        C31301d j2 = C31302e.m58363j();
        j2.mo37004e((C71308ej) eiVar.build());
        C31295a aVar = (C31295a) j2;
        String str2 = null;
        aVar.f84270c = null;
        if (true == ((C31381d) lVar).f84490b) {
            str2 = "Activity";
        }
        aVar.f84271d = str2;
        aVar.f84268a = lVar.mo37093f();
        j2.mo37002c(true);
        return mVar.mo37023b(j2.mo37000a());
    }

    /* renamed from: b */
    public C60870cx mo37095b(Activity activity) {
        return m58516j(C31389l.m58509d(activity));
    }

    /* renamed from: c */
    public C60870cx mo37076c(C31164au auVar, C71207aq aqVar) {
        return m58516j(C31389l.m58510e(auVar));
    }

    /* renamed from: d */
    public void mo36944d(Activity activity) {
        synchronized (this.f84512f) {
            this.f84512f.clear();
        }
    }

    /* renamed from: e */
    public /* synthetic */ String mo37096e(C69464a aVar) {
        return ((C31372aa) aVar.mo17428b()).f84471a.replace("%PACKAGE_NAME%", this.f84508b.getPackageName());
    }

    /* renamed from: f */
    public void mo37097f(Activity activity) {
        m58515i(C31389l.m58509d(activity));
    }

    /* renamed from: g */
    public void mo37077g(C31164au auVar) {
        m58515i(C31389l.m58510e(auVar));
    }

    /* renamed from: ln */
    public void mo29159ln() {
        C31220b bVar = this.f84509c;
        bVar.f84117a.mo36957a(this.f84510d);
        C31220b bVar2 = this.f84509c;
        bVar2.f84117a.mo36957a(this.f84511e);
    }
}
