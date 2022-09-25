package com.google.android.libraries.social.populous.android;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.social.populous.AutocompleteSession;
import com.google.android.libraries.social.populous.AutocompleteSessionBase;
import com.google.android.libraries.social.populous.C42151ae;
import com.google.android.libraries.social.populous.C42182ao;
import com.google.android.libraries.social.populous.C42197bb;
import com.google.android.libraries.social.populous.C42205bj;
import com.google.android.libraries.social.populous.C42558i;
import com.google.android.libraries.social.populous.C42598s;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42267at;
import com.google.android.libraries.social.populous.core.C42269av;
import com.google.android.libraries.social.populous.core.C42276bb;
import com.google.android.libraries.social.populous.core.C42334df;
import com.google.android.libraries.social.populous.core.C42355p;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42563aa;
import com.google.android.libraries.social.populous.logging.C42569d;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42580o;
import com.google.android.libraries.social.populous.logging.C42582q;
import com.google.android.libraries.social.populous.logging.C42586u;
import com.google.android.libraries.social.populous.logging.C42588w;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3289c.p3291b.C42212a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42433l;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.android.libraries.social.populous.storage.C42701v;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69291ak;
import p5602o.p5604b.p5605a.C71862a;
import p5602o.p5607c.C71901a;

/* renamed from: com.google.android.libraries.social.populous.android.t */
/* compiled from: PG */
public final class C42181t implements C42598s {

    /* renamed from: a */
    public static final String f110467a = "t";

    /* renamed from: b */
    protected final Context f110468b;

    /* renamed from: c */
    protected final ClientConfigInternal f110469c;

    /* renamed from: d */
    protected final C60887da f110470d;

    /* renamed from: e */
    protected final String f110471e;

    /* renamed from: f */
    protected final String f110472f;

    /* renamed from: g */
    protected final C60870cx f110473g;

    /* renamed from: h */
    protected final ClientVersion f110474h;

    /* renamed from: i */
    protected final C42586u f110475i = new C42586u();

    /* renamed from: j */
    protected final C42586u f110476j = new C42586u();

    /* renamed from: k */
    protected final C42151ae f110477k;

    /* renamed from: l */
    public final C42591z f110478l;

    /* renamed from: m */
    public final C42403a f110479m;

    /* renamed from: n */
    final C42701v f110480n;

    /* renamed from: o */
    public final C42355p f110481o;

    /* renamed from: p */
    public C42433l f110482p;

    /* renamed from: q */
    public final AtomicReference f110483q = new AtomicReference((Object) null);

    /* renamed from: r */
    final C60870cx f110484r;

    /* renamed from: s */
    protected final C42211b f110485s;

    /* renamed from: t */
    private final C42591z f110486t;

    /* renamed from: u */
    private final C58889cz f110487u;

    /* renamed from: v */
    private final C60870cx f110488v;

    /* renamed from: w */
    private final C60870cx f110489w;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x02b0 A[LOOP:0: B:17:0x02aa->B:19:0x02b0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42181t(android.content.Context r25, com.google.android.libraries.social.populous.core.ClientVersion r26, com.google.android.libraries.social.populous.p3289c.C42211b r27, com.google.android.libraries.social.populous.core.C42352m r28, java.util.Locale r29, java.util.concurrent.ExecutorService r30, java.util.concurrent.ScheduledExecutorService r31, com.google.android.libraries.social.populous.core.Experiments r32, com.google.android.libraries.social.populous.core.ClientConfigInternal r33, com.google.common.base.C58889cz r34, com.google.android.libraries.social.populous.logging.C42591z r35, boolean r36, java.util.List r37, com.google.android.libraries.social.populous.p3286a.C42146a r38, com.google.common.p4522b.C58495hd r39) {
        /*
            r24 = this;
            r8 = r24
            r9 = r26
            r10 = r27
            r0 = r28
            r1 = r29
            r11 = r37
            r24.<init>()
            com.google.android.libraries.social.populous.logging.u r2 = new com.google.android.libraries.social.populous.logging.u
            r2.<init>()
            r8.f110475i = r2
            com.google.android.libraries.social.populous.logging.u r2 = new com.google.android.libraries.social.populous.logging.u
            r2.<init>()
            r8.f110476j = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r12 = 0
            r2.<init>(r12)
            r8.f110483q = r2
            com.google.common.base.cz r2 = com.google.common.android.p4521a.C58274c.f155808a
            com.google.common.base.ci r13 = com.google.common.base.C58872ci.m90947d(r2)
            android.content.Context r14 = r25.getApplicationContext()
            r8.f110468b = r14
            r8.f110474h = r9
            r8.f110485s = r10
            java.lang.String r15 = r0.f111089a
            r8.f110471e = r15
            java.lang.String r2 = r0.f111090b
            r8.f110472f = r2
            com.google.common.util.concurrent.da r7 = com.google.common.util.concurrent.C60895di.m92995a(r30)
            r8.f110470d = r7
            r3 = r32
            r4 = r33
            com.google.android.libraries.social.populous.core.ClientConfigInternal r6 = m74107j(r4, r3)
            r8.f110469c = r6
            r3 = r34
            r8.f110487u = r3
            e.a.a.w.a.ae r4 = p5304e.p5305a.p5306a.p5442w.p5443a.C69285ae.f185398a
            e.a.a.w.a.af r4 = r4.mo6453a()
            boolean r4 = r4.mo60941a()
            if (r4 != 0) goto L_0x0074
            com.google.android.libraries.social.populous.core.Experiments r4 = r6.f110705G
            com.google.android.libraries.social.populous.core.bu r5 = com.google.android.libraries.social.populous.core.C42295bu.f110922c
            com.google.android.libraries.social.populous.core.ar r4 = r4.f110773a
            int r5 = r5.f110923d
            java.util.BitSet r4 = r4.f110851a
            boolean r4 = r4.get(r5)
            if (r4 == 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            r8.f110477k = r12
            r5 = r2
            r36 = r13
            goto L_0x008c
        L_0x0074:
            com.google.android.libraries.social.populous.ae r4 = new com.google.android.libraries.social.populous.ae
            r36 = r13
            long r12 = r6.f110728n
            r5 = r2
            long r1 = r6.f110729o
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS
            r16 = r4
            r17 = r34
            r18 = r12
            r20 = r1
            r16.<init>(r17, r18, r20, r22)
            r8.f110477k = r4
        L_0x008c:
            com.google.android.libraries.social.populous.core.l r1 = r0.f111091c
            com.google.android.libraries.social.populous.core.l r2 = com.google.android.libraries.social.populous.core.C42351l.SUCCESS_LOGGED_IN
            if (r1 != r2) goto L_0x0097
            com.google.android.libraries.social.populous.c.a.b r1 = r10.f110541f
            r1.mo44908a(r0)
        L_0x0097:
            r1 = 0
            r8.f110486t = r1
            com.google.android.libraries.social.populous.logging.z r12 = r8.m74108k(r14, r15, r6, r9)
            r8.f110478l = r12
            com.google.android.libraries.social.populous.c.a.b r1 = r10.f110541f
            com.google.android.libraries.social.populous.c.a.a r2 = new com.google.android.libraries.social.populous.c.a.a
            r3 = r5
            r2.<init>(r1, r15, r3)
            com.google.common.util.concurrent.cx r13 = r7.mo19399b(r2)
            r8.f110473g = r13
            com.google.android.libraries.social.populous.android.l r1 = new com.google.android.libraries.social.populous.android.l
            r1.<init>(r8)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r13, r1, r2)
            com.google.android.libraries.social.populous.android.i r1 = new com.google.android.libraries.social.populous.android.i
            r1.<init>(r10)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r13, r1, r2)
            r8.f110484r = r5
            com.google.android.libraries.social.populous.e.e.b r1 = new com.google.android.libraries.social.populous.e.e.b
            r2 = r29
            r1.<init>(r2)
            com.google.android.libraries.social.populous.e.e.c r4 = new com.google.android.libraries.social.populous.e.e.c
            r4.<init>(r1, r6)
            com.google.android.libraries.social.populous.e.b.a r3 = new com.google.android.libraries.social.populous.e.b.a
            r3.<init>(r2)
            r8.f110479m = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "peopleCache_"
            r2.<init>(r3)
            java.lang.String r3 = r0.f111089a
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            java.lang.String r0 = r0.f111090b
            r2.append(r0)
            r2.append(r3)
            int r0 = r6.f110718T
            int r0 = com.google.android.libraries.social.populous.core.C42263ap.m74420a(r0)
            r2.append(r0)
            java.lang.String r0 = ".db"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            com.google.android.libraries.social.populous.storage.RoomDatabaseManager r0 = com.google.android.libraries.social.populous.storage.C42703x.m75424b(r14, r3, r12, r7)
            r8.f110480n = r0
            com.google.android.libraries.social.populous.storage.a r2 = new com.google.android.libraries.social.populous.storage.a
            r2.<init>(r0)
            com.google.android.libraries.social.populous.storage.b r0 = new com.google.android.libraries.social.populous.storage.b
            r0.<init>(r12)
            r25 = r3
            com.google.android.libraries.social.populous.core.dl r3 = new com.google.android.libraries.social.populous.core.dl
            r3.<init>(r2, r0, r7)
            r8.f110481o = r3
            r3.mo45325d()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r2 = 10
            r0.toMillis(r2)
            com.google.android.libraries.social.populous.core.ca r0 = new com.google.android.libraries.social.populous.core.ca
            r0.<init>()
            r0 = 59
            com.google.common.base.C58827ar.m90818c(r0)
            com.google.android.libraries.social.populous.storage.dc r3 = new com.google.android.libraries.social.populous.storage.dc
            r3.<init>(r1)
            r2 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r2]
            r1 = 0
            r0[r1] = r5
            r16 = 1
            r0[r16] = r13
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92895d(r0)
            r31 = r5
            com.google.android.libraries.social.populous.android.j r5 = new com.google.android.libraries.social.populous.android.j
            r17 = 0
            r9 = r0
            r0 = r5
            r1 = r24
            r2 = r27
            r18 = r25
            r19 = r3
            r3 = r26
            r20 = r4
            r4 = r19
            r19 = r31
            r11 = r5
            r5 = r17
            r23 = r6
            r6 = r20
            r38 = r14
            r14 = r7
            r7 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx r0 = r9.mo57334a(r11, r14)
            r8.f110488v = r0
            com.google.android.libraries.social.populous.android.m r1 = new com.google.android.libraries.social.populous.android.m
            r1.<init>(r8)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r2)
            com.google.android.libraries.social.populous.an r6 = new com.google.android.libraries.social.populous.an
            java.lang.String r0 = ""
            r1 = 0
            r7 = r23
            r6.<init>(r7, r0, r1)
            r9 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r9]
            r11 = 0
            r0[r11] = r19
            r0[r16] = r13
            com.google.common.util.concurrent.cf r13 = com.google.common.util.concurrent.C60856cj.m92895d(r0)
            com.google.android.libraries.social.populous.android.k r5 = new com.google.android.libraries.social.populous.android.k
            r0 = r5
            r1 = r24
            r2 = r27
            r4 = r39
            r9 = r5
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r13.mo57334a(r9, r0)
            r8.f110489w = r0
            com.google.android.libraries.social.populous.android.n r1 = new com.google.android.libraries.social.populous.android.n
            r1.<init>(r8)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r1, r2)
            com.google.android.libraries.social.populous.c.c.g r0 = r10.f110537b
            com.google.common.base.ci r1 = r12.mo45632b()
            com.google.android.libraries.social.populous.c.c.e r0 = (com.google.android.libraries.social.populous.p3289c.p3292c.C42218e) r0
            android.content.Context r2 = r0.f110549b
            com.google.android.libraries.phenotype.client.C31654aj.m58985d(r2)
            com.google.android.gms.phenotype.z r2 = r0.mo44911a()
            java.lang.String r0 = r0.f110550c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = r7.f110734t
            r3.add(r4)
            java.lang.String r4 = r7.f110735u
            r3.add(r4)
            java.lang.String r4 = "SENDKIT"
            r3.add(r4)
            com.google.common.b.ij r4 = r7.f110736v
            r3.addAll(r4)
            java.lang.String[] r4 = new java.lang.String[r11]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r4 = 475194430(0x1c52e43e, float:6.977817E-22)
            r5 = 0
            com.google.android.gms.tasks.ab r0 = r2.mo121905e(r0, r4, r3, r5)
            com.google.common.util.concurrent.cx r0 = com.google.android.libraries.p3339v.C43205e.m76192b(r0)
            com.google.android.libraries.social.populous.android.o r2 = new com.google.android.libraries.social.populous.android.o
            r2.<init>(r8, r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r1)
            com.google.android.libraries.social.populous.c.c.g r0 = r10.f110537b
            com.google.common.base.ci r1 = r12.mo45632b()
            com.google.android.libraries.social.populous.c.c.c r2 = new com.google.android.libraries.social.populous.c.c.c
            com.google.android.libraries.social.populous.c.c.e r0 = (com.google.android.libraries.social.populous.p3289c.p3292c.C42218e) r0
            r2.<init>(r0, r15)
            com.google.common.util.concurrent.cx r0 = androidx.p104d.p105a.C2169h.m6027a(r2)
            com.google.android.libraries.social.populous.android.p r2 = new com.google.android.libraries.social.populous.android.p
            r2.<init>(r8, r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r1)
            boolean r0 = r37.isEmpty()
            if (r0 == 0) goto L_0x02a4
            com.google.android.libraries.f.a r0 = r10.f110538c
            java.io.File r1 = r38.getCacheDir()
            com.google.android.libraries.social.populous.storage.aj r2 = com.google.android.libraries.social.populous.storage.C42609aj.f111807a
            com.google.android.libraries.social.populous.storage.ak r3 = com.google.android.libraries.social.populous.storage.C42610ak.f111808a
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            com.google.android.libraries.social.populous.storage.ai r4 = new com.google.android.libraries.social.populous.storage.ai
            r28 = r4
            r29 = r1
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r14
            r34 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r0 = r37
            r0.add(r4)
            e.a.a.w.a.ak r1 = p5304e.p5305a.p5306a.p5442w.p5443a.C69291ak.f185408a
            e.a.a.w.a.al r1 = r1.mo6453a()
            boolean r1 = r1.mo60952d()
            if (r1 == 0) goto L_0x0281
            com.google.android.libraries.f.a r1 = r10.f110538c
            java.io.File r2 = r38.getFilesDir()
            com.google.android.libraries.social.populous.storage.al r3 = com.google.android.libraries.social.populous.storage.C42611al.f111809a
            com.google.android.libraries.social.populous.storage.am r4 = com.google.android.libraries.social.populous.storage.C42612am.f111810a
            com.google.android.libraries.social.populous.storage.an r5 = com.google.android.libraries.social.populous.storage.C42613an.f111811a
            com.google.android.libraries.social.populous.storage.ao r6 = com.google.android.libraries.social.populous.storage.C42614ao.f111812a
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89848p(r4, r5, r6)
            com.google.android.libraries.social.populous.storage.ai r5 = new com.google.android.libraries.social.populous.storage.ai
            r28 = r5
            r29 = r2
            r30 = r4
            r31 = r3
            r32 = r1
            r33 = r14
            r34 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r0.add(r5)
        L_0x0281:
            com.google.common.base.C58893dc.m90997b(r16)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r18)
            com.google.android.libraries.f.a r2 = r10.f110538c
            com.google.android.libraries.social.populous.storage.ap r3 = new com.google.android.libraries.social.populous.storage.ap
            r3.<init>(r1)
            com.google.android.libraries.social.populous.storage.t r1 = new com.google.android.libraries.social.populous.storage.t
            r25 = r1
            r26 = r38
            r27 = r3
            r28 = r2
            r29 = r14
            r30 = r12
            r25.<init>(r26, r27, r28, r29, r30)
            r0.add(r1)
            goto L_0x02a6
        L_0x02a4:
            r0 = r37
        L_0x02a6:
            java.util.Iterator r0 = r37.iterator()
        L_0x02aa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02c6
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.social.populous.storage.af r1 = (com.google.android.libraries.social.populous.storage.C42605af) r1
            e.a.a.w.a.ak r2 = p5304e.p5305a.p5306a.p5442w.p5443a.C69291ak.f185408a
            e.a.a.w.a.al r2 = r2.mo6453a()
            long r2 = r2.mo60951c()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.HOURS
            r1.mo45707a(r2, r4)
            goto L_0x02aa
        L_0x02c6:
            com.google.android.libraries.social.populous.logging.z r0 = r8.f110478l
            com.google.android.libraries.social.populous.logging.k r1 = com.google.android.libraries.social.populous.logging.C42576k.f111734a
            r2 = 2
            r3 = 0
            r0.mo45634d(r2, r11, r3, r1)
            com.google.android.libraries.social.populous.logging.z r0 = r8.f110478l
            r1 = 42
            com.google.android.libraries.social.populous.logging.k r2 = com.google.android.libraries.social.populous.logging.C42576k.f111734a
            r3 = r36
            r0.mo45638h(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.android.C42181t.<init>(android.content.Context, com.google.android.libraries.social.populous.core.ClientVersion, com.google.android.libraries.social.populous.c.b, com.google.android.libraries.social.populous.core.m, java.util.Locale, java.util.concurrent.ExecutorService, java.util.concurrent.ScheduledExecutorService, com.google.android.libraries.social.populous.core.Experiments, com.google.android.libraries.social.populous.core.ClientConfigInternal, com.google.common.base.cz, com.google.android.libraries.social.populous.logging.z, boolean, java.util.List, com.google.android.libraries.social.populous.a.a, com.google.common.b.hd):void");
    }

    /* renamed from: f */
    static AutocompleteSession m74106f(ClientConfigInternal clientConfigInternal, String str, SessionContext sessionContext, C60870cx cxVar, C42586u uVar) {
        String str2 = f110467a;
        if (Log.isLoggable(str2, 3)) {
            if (str.endsWith("@google.com")) {
                Log.d(str2, "Account used to start the session: ".concat(String.valueOf(str)));
            } else {
                Log.d(str2, "Account used to start the session is not a @google.com account");
            }
        }
        return new AndroidLibAutocompleteSession(str, clientConfigInternal, new C42205bj(), new C42558i(), sessionContext, cxVar, uVar);
    }

    /* renamed from: j */
    private static ClientConfigInternal m74107j(ClientConfigInternal clientConfigInternal, Experiments experiments) {
        C42269av avVar = new C42269av(clientConfigInternal);
        avVar.mo45227c(experiments);
        return avVar.mo45225a();
    }

    /* renamed from: k */
    private final C42591z m74108k(Context context, String str, ClientConfigInternal clientConfigInternal, ClientVersion clientVersion) {
        C42582q a = C42582q.m75152a(str, clientConfigInternal, clientVersion, new C42334df().mo45315a());
        C42212a aVar = this.f110485s.f110540e;
        C42165d dVar = new C42165d(this);
        return new C42563aa(aVar.mo44909a(a.f111749a, a.f111750b.f110735u), a, this.f110487u, dVar, C24006d.m44596b(context, new C71862a()));
    }

    /* renamed from: a */
    public final /* synthetic */ AutocompleteSessionBase mo44861a(Context context, SessionContext sessionContext, C42182ao aoVar) {
        return mo44866g(context, this.f110469c, sessionContext, aoVar);
    }

    /* renamed from: b */
    public final C42276bb mo44862b() {
        return mo44868i(mo44867h()) ? C42276bb.EMPTY : C42276bb.FULL;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AutocompleteSessionBase mo44863c(Context context, C42266as asVar, SessionContext sessionContext) {
        return mo44866g(context, asVar, sessionContext, (C42182ao) null);
    }

    /* renamed from: d */
    public final void mo44864d(List list, C42197bb bbVar) {
        C60856cj.m92911t(this.f110489w, new C42180s(list, bbVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo44865e() {
        C58872ci d = this.f110478l.mo45634d(11, 0, (Integer) null, C42576k.f111734a);
        int a = mo44862b().mo45231a();
        C60870cx h = C60922j.m93045h(this.f110488v, new C42167f(), this.f110470d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        if (C69280a.m100466c()) {
            arrayList.add(C60922j.m93045h(this.f110484r, C42168g.f110438a, this.f110470d));
        }
        C60856cj.m92911t(C60856cj.m92892a(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a), new C42179r(this, d, a), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final AndroidLibAutocompleteSession mo44866g(Context context, C42266as asVar, SessionContext sessionContext, C42182ao aoVar) {
        C58838bb.m90868c(asVar instanceof ClientConfigInternal);
        ClientConfigInternal j = m74107j((ClientConfigInternal) asVar, this.f110469c.f110705G);
        C42591z k = m74108k(context.getApplicationContext(), this.f110471e, j, this.f110474h);
        C60870cx cxVar = null;
        k.mo45634d(3, 0, (Integer) null, C42576k.f111734a);
        ClientConfigInternal clientConfigInternal = this.f110469c;
        if (j.f110722h != clientConfigInternal.f110722h || !j.f110731q.equals(clientConfigInternal.f110731q) || j.f110732r != clientConfigInternal.f110732r || !j.f110706H.equals(clientConfigInternal.f110706H) || j.f110707I != clientConfigInternal.f110707I || !j.f110705G.equals(clientConfigInternal.f110705G) || j.f110708J != clientConfigInternal.f110708J || !C58832aw.m90831a(j.f110709K, clientConfigInternal.f110709K)) {
            throw new C42267at((byte[]) null);
        }
        if (j.f110701C && !AndroidLibAutocompleteSession.m74073r(sessionContext)) {
            cxVar = C60922j.m93044g(this.f110473g, C42166e.f110437a, this.f110470d);
        }
        AutocompleteSession f = m74106f(j, this.f110471e, sessionContext, cxVar, this.f110475i);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = (AndroidLibAutocompleteSession) f;
        C42582q a = C42582q.m75152a(androidLibAutocompleteSession.f110427x, androidLibAutocompleteSession.f110340a, this.f110474h, f.f110351l.mo45315a());
        f.f110343d = this.f110488v;
        C42355p pVar = this.f110481o;
        f.f110344e = pVar;
        if (pVar != null) {
            pVar.mo45325d();
        }
        f.f110342c = k;
        f.f110341b = new C42588w(new C42569d(this.f110485s.f110540e.mo44909a(a.f111749a, a.f111750b.f110734t), a, C24006d.m44596b(context.getApplicationContext(), new C71901a())), new C42580o());
        f.f110345f = this.f110477k;
        androidLibAutocompleteSession.f110425v = context.getApplicationContext();
        androidLibAutocompleteSession.f110359t = new C42169h(this);
        androidLibAutocompleteSession.f110426w = this.f110470d;
        f.f110347h = this.f110476j;
        if (aoVar != null) {
            f.mo44817f(aoVar);
        }
        C60856cj.m92911t(this.f110488v, new C42178q(j), C60826bg.f164896a);
        return androidLibAutocompleteSession;
    }

    /* renamed from: h */
    public final C58833ax mo44867h() {
        C58833ax a = this.f110481o.mo45322a();
        return a.mo56113h() ? (C58833ax) a.mo56107c() : C58836b.f156633a;
    }

    /* renamed from: i */
    public final boolean mo44868i(C58833ax axVar) {
        long b = this.f110485s.f110538c.mo26870b();
        if (!axVar.mo56113h()) {
            return true;
        }
        return b - ((C42680d) axVar.mo56107c()).f111893b > (C69291ak.m100495d() ? C69291ak.m100494b() : this.f110469c.f110729o);
    }
}
