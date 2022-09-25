package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.c.b;
import com.google.android.apps.gsa.c.f.a.j;
import com.google.android.apps.gsa.c.f.ap;
import com.google.android.apps.gsa.c.f.av;
import com.google.android.apps.gsa.c.f.aw;
import com.google.android.apps.gsa.c.f.bd;
import com.google.android.apps.gsa.c.f.be;
import com.google.android.apps.gsa.c.f.c;
import com.google.android.apps.gsa.c.f.s;
import com.google.android.apps.gsa.c.f.t;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.c.l;
import com.google.android.apps.gsa.p5836c.C74462i;
import com.google.android.apps.gsa.p5836c.p5838d.C74451c;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118950d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90147z;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.p7140b.C90531a;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.audio.C92206q;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.C92530c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.p7261a.p7262a.C92134a;
import com.google.android.apps.gsa.speech.p7261a.p7262a.C92136c;
import com.google.android.apps.gsa.speech.p7261a.p7262a.C92137d;
import com.google.android.apps.gsa.speech.p7298l.C92456a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92462c;
import com.google.android.apps.gsa.speech.p7298l.C92472e;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.C37661hh;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37702ie;
import com.google.android.libraries.search.p2904c.C37703if;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37716j;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.ac */
/* compiled from: PG */
public final class C102792ac {

    /* renamed from: a */
    public static final C59071e f287014a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.ac");

    /* renamed from: b */
    public final C90747d f287015b;

    /* renamed from: c */
    public final C68214a f287016c;

    /* renamed from: d */
    public final C68214a f287017d;

    /* renamed from: e */
    public final C68214a f287018e;

    /* renamed from: f */
    final C68214a f287019f;

    /* renamed from: g */
    public C102790aa f287020g;

    /* renamed from: h */
    public boolean f287021h;

    /* renamed from: i */
    public C58833ax f287022i = C58836b.f156633a;

    /* renamed from: j */
    private final C68214a f287023j;

    /* renamed from: k */
    private final C90021c f287024k;

    /* renamed from: l */
    private final C89331a f287025l;

    /* renamed from: m */
    private final C102802b f287026m;

    /* renamed from: n */
    private final C69464a f287027n;

    /* renamed from: o */
    private final C69464a f287028o;

    /* renamed from: p */
    private final C22871g f287029p;

    /* renamed from: q */
    private final C69464a f287030q;

    /* renamed from: r */
    private final C68214a f287031r;

    /* renamed from: s */
    private final C68214a f287032s;

    /* renamed from: t */
    private final Context f287033t;

    /* renamed from: u */
    private final l f287034u;

    /* renamed from: v */
    private C102791ab f287035v;

    /* renamed from: w */
    private boolean f287036w;

    public C102792ac(C68214a aVar, C89331a aVar2, C90021c cVar, C102802b bVar, C68214a aVar3, C69464a aVar4, C68214a aVar5, C69464a aVar6, C22871g gVar, C69464a aVar7, C68214a aVar8, C68214a aVar9, Context context, C68214a aVar10, l lVar, C68214a aVar11) {
        this.f287023j = aVar;
        this.f287015b = C90748e.m148223a(false);
        this.f287025l = aVar2;
        this.f287024k = cVar;
        this.f287026m = bVar;
        this.f287016c = aVar3;
        this.f287027n = aVar4;
        this.f287017d = aVar5;
        this.f287028o = aVar6;
        this.f287029p = gVar;
        this.f287030q = aVar7;
        this.f287031r = aVar8;
        this.f287032s = aVar9;
        this.f287033t = context;
        this.f287018e = aVar10;
        this.f287034u = lVar;
        this.f287019f = aVar11;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0105, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0167, code lost:
        return r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.base.C58833ax mo93453a(com.google.android.apps.gsa.shared.speech.p7140b.C90531a r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r20
            monitor-enter(r16)
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0168 }
            boolean r4 = r1.f287021h     // Catch:{ all -> 0x0168 }
            com.google.common.base.C58838bb.m90883r(r4)     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.b r4 = r1.f287026m     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.util.b.d r5 = r4.f287053b     // Catch:{ all -> 0x0168 }
            r5.mo85091a()     // Catch:{ all -> 0x0168 }
            java.util.concurrent.Future r5 = r4.f287055d     // Catch:{ all -> 0x0168 }
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0020
            r5.cancel(r7)     // Catch:{ all -> 0x0168 }
            r4.f287055d = r6     // Catch:{ all -> 0x0168 }
        L_0x0020:
            com.google.android.apps.gsa.staticplugins.microdetection.aa r4 = r1.f287020g     // Catch:{ all -> 0x0168 }
            r1.f287020g = r6     // Catch:{ all -> 0x0168 }
            r1.f287036w = r2     // Catch:{ all -> 0x0168 }
            com.google.common.f.e r5 = f287014a     // Catch:{ all -> 0x0168 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0168 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0168 }
            java.lang.String r8 = "MicroDetector"
            r5.mo56378ag(r6, r8)     // Catch:{ all -> 0x0168 }
            java.lang.String r6 = "Keeping mic open: %b"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0168 }
            r9 = 21146(0x529a, float:2.9632E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56389s(r6, r8)     // Catch:{ all -> 0x0168 }
            r5 = 0
            if (r2 == 0) goto L_0x00a0
            dagger.a r6 = r1.f287032s     // Catch:{ all -> 0x0168 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.c.f.u r6 = (com.google.android.apps.gsa.c.f.u) r6     // Catch:{ all -> 0x0168 }
            com.google.common.base.ax r8 = r1.f287022i     // Catch:{ all -> 0x0168 }
            boolean r9 = r8.mo56113h()     // Catch:{ all -> 0x0168 }
            if (r9 == 0) goto L_0x0090
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.c.f.bd r8 = (com.google.android.apps.gsa.c.f.bd) r8     // Catch:{ all -> 0x0168 }
            r6.d(r8, r5)     // Catch:{ all -> 0x0168 }
            dagger.a r6 = r8.d     // Catch:{ all -> 0x0168 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x0168 }
            r9 = r6
            com.google.android.apps.gsa.shared.logger.b.i r9 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.speech.l.b r6 = r8.g     // Catch:{ all -> 0x0168 }
            long r12 = r6.mo87197h()     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.c.b r6 = com.google.android.apps.gsa.c.b.j     // Catch:{ all -> 0x0168 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUDIO_STOP_LISTENING_SEAMLESS_REQUESTED     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUDIO_STOP_LISTENING_SEAMLESS_REQUESTED_WITH_CROSSFLOW_REQUEST_ID     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.c.f.a.d r14 = com.google.android.apps.gsa.c.f.a.d.a     // Catch:{ all -> 0x0168 }
            com.google.common.base.ax r14 = r6.mo56106b(r14)     // Catch:{ all -> 0x0168 }
            com.google.common.base.b r15 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.c.f.a.j.b(r9, r10, r11, r12, r14, r15)     // Catch:{ all -> 0x0168 }
            com.google.android.libraries.search.c.hf r6 = r8.b     // Catch:{ all -> 0x0168 }
            com.google.android.libraries.search.c.he r6 = r6.mo41059c()     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r9 = r6.mo41056c()     // Catch:{ all -> 0x0168 }
            r8.g(r9)     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r6 = r6.mo41055b()     // Catch:{ all -> 0x0168 }
            goto L_0x009b
        L_0x0090:
            java.lang.String r6 = "MicroDetector"
            com.google.android.apps.gsa.c.f.u.e(r6)     // Catch:{ all -> 0x0168 }
            com.google.android.libraries.search.c.hq r6 = com.google.android.libraries.search.p2904c.C37670hq.f100052c     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)     // Catch:{ all -> 0x0168 }
        L_0x009b:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ all -> 0x0168 }
            goto L_0x00a4
        L_0x00a0:
            r16.mo93455c()     // Catch:{ all -> 0x0168 }
            r6 = r3
        L_0x00a4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0168 }
            dagger.a r9 = r1.f287016c     // Catch:{ all -> 0x0168 }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.speech.microdetection.a r9 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r9     // Catch:{ all -> 0x0168 }
            r9.mo87236j(r2)     // Catch:{ all -> 0x0168 }
            r1.f287021h = r5     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.ay.a r9 = r1.f287025l     // Catch:{ all -> 0x0168 }
            r10 = 1
            r9.mo83276c(r10, r5)     // Catch:{ all -> 0x0168 }
            if (r4 != 0) goto L_0x00c0
            monitor-exit(r16)
            return r6
        L_0x00c0:
            if (r18 == 0) goto L_0x0106
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a     // Catch:{ all -> 0x0168 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0168 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "MicroDetectionWorker"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "#onError(%b)"
            r3 = 21067(0x524b, float:2.9521E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r8)     // Catch:{ all -> 0x0168 }
            if (r19 == 0) goto L_0x00e2
            com.google.android.apps.gsa.staticplugins.microdetection.s r4 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r4     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r0 = r4.f287292a     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.search.core.state.a.m r0 = r0.f286971b     // Catch:{ all -> 0x0168 }
            r0.mo80466a(r7)     // Catch:{ all -> 0x0168 }
            goto L_0x0104
        L_0x00e2:
            r0 = r4
            com.google.android.apps.gsa.staticplugins.microdetection.s r0 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r0     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r0 = r0.f287292a     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r0 = r0.f286948T     // Catch:{ all -> 0x0168 }
            r0.cancel(r5)     // Catch:{ all -> 0x0168 }
            r0 = r4
            com.google.android.apps.gsa.staticplugins.microdetection.s r0 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r0     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r0 = r0.f287292a     // Catch:{ all -> 0x0168 }
            com.google.android.libraries.gsa.k.g r2 = r0.f286978k     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.q r3 = new com.google.android.apps.gsa.staticplugins.microdetection.q     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.s r4 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r4     // Catch:{ all -> 0x0168 }
            r3.<init>(r4)     // Catch:{ all -> 0x0168 }
            java.lang.String r4 = "Notify hotword state of an error"
            r7 = 500(0x1f4, double:2.47E-321)
            com.google.common.util.concurrent.cx r2 = r2.mo28208h(r4, r7, r3)     // Catch:{ all -> 0x0168 }
            r0.f286948T = r2     // Catch:{ all -> 0x0168 }
        L_0x0104:
            monitor-exit(r16)
            return r6
        L_0x0106:
            if (r21 == 0) goto L_0x0131
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a     // Catch:{ all -> 0x0168 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0168 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "MicroDetectionWorker"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "#onForceStopped()"
            r3 = 21068(0x524c, float:2.9523E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0168 }
            r0 = r4
            com.google.android.apps.gsa.staticplugins.microdetection.s r0 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r0     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r0 = r0.f287292a     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r0 = r0.f286948T     // Catch:{ all -> 0x0168 }
            r0.cancel(r5)     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.s r4 = (com.google.android.apps.gsa.staticplugins.microdetection.C102863s) r4     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r0 = r4.f287292a     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.search.core.state.a.m r0 = r0.f286971b     // Catch:{ all -> 0x0168 }
            r0.mo80467c()     // Catch:{ all -> 0x0168 }
            monitor-exit(r16)
            return r6
        L_0x0131:
            if (r0 == 0) goto L_0x0166
            dagger.a r5 = r1.f287019f     // Catch:{ all -> 0x0168 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGERED_IN_SEARCHSERVICE     // Catch:{ all -> 0x0168 }
            r5.mo83702b(r7)     // Catch:{ all -> 0x0168 }
            boolean r5 = r6.mo56113h()     // Catch:{ all -> 0x0168 }
            if (r5 == 0) goto L_0x0163
            java.lang.Object r3 = r6.mo56107c()     // Catch:{ all -> 0x0168 }
            com.google.common.util.concurrent.cx r3 = (com.google.common.util.concurrent.C60870cx) r3     // Catch:{ all -> 0x0168 }
            com.google.android.libraries.gsa.k.g r5 = r1.f287029p     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.y r7 = new com.google.android.apps.gsa.staticplugins.microdetection.y     // Catch:{ all -> 0x0168 }
            r7.<init>(r1, r0, r2, r4)     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.shared.util.c.ag r8 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ all -> 0x0168 }
            java.lang.String r9 = "stopListeningSeamlessHotwordData"
            r8.<init>(r3, r5, r9, r7)     // Catch:{ all -> 0x0168 }
            com.google.android.apps.gsa.staticplugins.microdetection.z r3 = new com.google.android.apps.gsa.staticplugins.microdetection.z     // Catch:{ all -> 0x0168 }
            r3.<init>(r1, r0, r2, r4)     // Catch:{ all -> 0x0168 }
            r8.mo85223a(r3)     // Catch:{ all -> 0x0168 }
            goto L_0x0166
        L_0x0163:
            r1.mo93458f(r0, r2, r4, r3)     // Catch:{ all -> 0x0168 }
        L_0x0166:
            monitor-exit(r16)
            return r6
        L_0x0168:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.C102792ac.mo93453a(com.google.android.apps.gsa.shared.speech.b.a, boolean, boolean, boolean, boolean):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final synchronized void mo93454b(C90582d dVar, C92530c cVar, C92157ac acVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        byte[] bArr;
        C37703if ifVar;
        C58833ax axVar;
        C37703if ifVar2;
        C90582d dVar2 = dVar;
        int i2 = i;
        boolean z5 = z4;
        synchronized (this) {
            C58838bb.m90883r(!this.f287021h);
            this.f287021h = true;
            this.f287036w = false;
            this.f287025l.mo83276c(1, true);
            if (z5) {
                bArr = ((C92504i) this.f287030q.mo17428b()).mo87271l();
            } else {
                bArr = ((C92504i) this.f287030q.mo17428b()).mo87270k();
            }
            C92136c g = C92137d.m151247g();
            g.mo86781b(cVar.mo87300a());
            g.mo86782c(true);
            ((C92134a) g).f256865a = ((C92206q) this.f287027n.mo17428b()).f257081a;
            ((C92134a) g).f256866b = bArr;
            g.mo86784e(true);
            g.mo86783d(z5);
            Query u = Query.f252741b.mo84493u();
            C92456a l = C92460b.m151978l();
            l.mo87164h(false);
            l.mo87173q(false);
            l.mo87179w(C38120a.m67297a(this.f287033t));
            l.mo87175s(16000);
            l.mo87176t(true);
            l.mo87174r(z2);
            l.mo87158b(g.mo86780a());
            ((C92462c) l).f257911e = dVar2;
            l.mo87177u(z3);
            l.mo87161e(z);
            l.mo87171o(u.f252749G);
            int a = (int) this.f287024k.mo79743a(C90082eg.f250028cl);
            if (a > 1) {
                if (i2 != 0) {
                    if (i2 == 2) {
                        i2 = 2;
                    }
                }
                if (a == 2) {
                    l.mo87160d(12);
                    C58976aa aaVar = C58975e.f156826a;
                    l.mo87165i(a);
                } else {
                    throw new RuntimeException("Invalid channel count");
                }
            }
            C92472e eVar = (C92472e) this.f287028o.mo17428b();
            eVar.f257979b = l.mo87157a();
            eVar.f257981d = dVar2.f253249c;
            eVar.f257978a = C90536a.HOTWORD;
            eVar.f257987j = i2;
            eVar.f257999v = Long.valueOf(u.f252749G);
            eVar.f257988k = acVar;
            C58976aa aaVar2 = C58975e.f156826a;
            C92473f a2 = eVar.mo87218a();
            if (this.f287035v == null) {
                this.f287035v = new C102791ab(this);
            }
            this.f287022i = C58836b.f156633a;
            if (((C58833ax) this.f287031r.mo27525b()).mo56113h()) {
                C118950d dVar3 = (C118950d) this.f287023j.mo27525b();
                C102791ab abVar = this.f287035v;
                abVar.getClass();
                if (!dVar3.mo91290c(a2, abVar)) {
                    this.f287026m.mo93459b(this);
                    return;
                }
                u uVar = (u) this.f287032s.mo27525b();
                C37660hg hgVar = (C37660hg) ((C58833ax) this.f287031r.mo27525b()).mo56107c();
                C92460b bVar = a2.f258015c;
                C22871g gVar = this.f287029p;
                Query aH = Query.f252741b.mo84271aH(a2.f258032t);
                C102791ab abVar2 = this.f287035v;
                abVar2.getClass();
                C37661hh hhVar = (C37661hh) C37662hi.f100030g.createBuilder();
                C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
                C37716j jVar = C37716j.f100144a;
                aVar.copyOnWrite();
                C37773c cVar2 = (C37773c) aVar.instance;
                jVar.getClass();
                cVar2.f100246b = jVar;
                cVar2.f100245a = 25;
                hhVar.copyOnWrite();
                C37662hi hiVar = (C37662hi) hhVar.instance;
                C37773c cVar3 = (C37773c) aVar.build();
                cVar3.getClass();
                hiVar.f100037f = cVar3;
                hiVar.f100032a |= 16;
                C37661hh hhVar2 = (C37661hh) ((C37662hi) hhVar.build()).toBuilder();
                Uri i3 = bVar.mo87198i();
                if (i3 != null) {
                    C37702ie ieVar = (C37702ie) C37703if.f100132c.createBuilder();
                    String uri = i3.toString();
                    ieVar.copyOnWrite();
                    C37703if ifVar3 = (C37703if) ieVar.instance;
                    uri.getClass();
                    ifVar3.f100134a |= 1;
                    ifVar3.f100135b = uri;
                    hhVar2.copyOnWrite();
                    C37662hi hiVar2 = (C37662hi) hhVar2.instance;
                    C37703if ifVar4 = (C37703if) ieVar.build();
                    ifVar4.getClass();
                    hiVar2.f100034c = ifVar4;
                    hiVar2.f100033b = 13;
                }
                C37360ay b = uVar.b(bVar);
                if (((C74451c) uVar.c.mo27525b()).mo70770b()) {
                    hhVar2.copyOnWrite();
                    C37662hi hiVar3 = (C37662hi) hhVar2.instance;
                    hiVar3.f100032a |= 8;
                    hiVar3.f100036e = true;
                    C37357av avVar = (C37357av) b.toBuilder();
                    avVar.copyOnWrite();
                    C37360ay ayVar = (C37360ay) avVar.instance;
                    ayVar.f99226a |= 1;
                    ayVar.f99227b = 1999;
                    b = (C37360ay) avVar.build();
                }
                hhVar2.copyOnWrite();
                C37662hi hiVar4 = (C37662hi) hhVar2.instance;
                b.getClass();
                hiVar4.f100035d = b;
                hiVar4.f100032a |= 1;
                C37662hi hiVar5 = (C37662hi) hhVar2.build();
                C37659hf a3 = hgVar.mo41061a(hiVar5);
                be beVar = uVar.b;
                ap apVar = (ap) uVar.d.mo27525b();
                if (hiVar5.f100033b == 13) {
                    ifVar = (C37703if) hiVar5.f100034c;
                } else {
                    ifVar = C37703if.f100132c;
                }
                if ((1 & ifVar.f100134a) != 0) {
                    if (hiVar5.f100033b == 13) {
                        ifVar2 = (C37703if) hiVar5.f100034c;
                    } else {
                        ifVar2 = C37703if.f100132c;
                    }
                    axVar = C58833ax.m90834k(ifVar2.f100135b);
                } else {
                    axVar = C58836b.f156633a;
                }
                int a4 = apVar.a(axVar);
                C37360ay ayVar2 = hiVar5.f100035d;
                if (ayVar2 == null) {
                    ayVar2 = C37360ay.f99224l;
                }
                C37360ay ayVar3 = ayVar2;
                a3.getClass();
                gVar.getClass();
                bVar.getClass();
                ayVar3.getClass();
                c cVar4 = (c) beVar.a.mo17428b();
                cVar4.getClass();
                C68214a a5 = C68219e.m98518a(((C68226l) beVar.b).f184585a);
                a5.getClass();
                Context context = (Context) beVar.c.mo17428b();
                context.getClass();
                String str = (String) beVar.d.mo17428b();
                str.getClass();
                C68214a a6 = C68219e.m98518a(((C68226l) beVar.e).f184585a);
                a6.getClass();
                C92473f fVar = a2;
                bd bdVar = new bd(a3, gVar, abVar2, a4, bVar, ayVar3, cVar4, a5, context, str, a6);
                j.d((C89859i) uVar.a.mo27525b(), aH.f252749G, C58833ax.m90834k(b.j));
                C60888db c = uVar.h.mo85210c("audio source status callbacks");
                C60836bq bqVar = uVar.g;
                Objects.requireNonNull(bdVar);
                bqVar.mo57305b(new s(bdVar), c);
                C60836bq bqVar2 = uVar.g;
                Objects.requireNonNull(bdVar);
                bqVar2.mo57305b(new t(bdVar), c);
                new C90873ag(bdVar.b.mo41057a().mo41053a(), bdVar.c, "getStopListeningStatus", new av(bdVar)).mo85223a(aw.a);
                C58833ax k = C58833ax.m90834k(bdVar);
                this.f287022i = k;
                if (z5) {
                    l lVar = this.f287034u;
                    bd bdVar2 = (bd) k.mo56107c();
                    if (lVar.f && lVar.j.mo85390b()) {
                        lVar.e.mo28212l("Set hotwordListeningSessionAdapter", new C74462i(lVar, bdVar2));
                    }
                }
                ((C118950d) this.f287023j.mo27525b()).mo91289b(fVar, this.f287035v, this.f287029p, this.f287022i.mo56106b(C102868x.f287301a));
                this.f287026m.mo93459b(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo93455c() {
        C59104x b = f287014a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDetector");
        ((C59052c) ((C59052c) b).mo56372aa(21154)).mo56386p("#shutdownAudioWithAudioLibrary");
        if (this.f287022i.mo56113h()) {
            ((u) this.f287032s.mo27525b()).g("MicroDetector", this.f287022i.mo56106b(C102865u.f287297a), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo93456d() {
        return this.f287021h;
    }

    /* renamed from: e */
    public final boolean mo93457e(Query query) {
        this.f287015b.mo85091a();
        synchronized (this) {
            if (this.f287021h) {
                C58833ax a = mo93453a((C90531a) null, false, true, ((C92486a) this.f287016c.mo27525b()).mo87252z(query), false);
                if (this.f287024k.mo79746e(C90147z.f251899c) && query.mo84412cs() && this.f287022i.mo56113h() && a.mo56113h()) {
                    new C90873ag((C60870cx) a.mo56107c(), this.f287029p, "stopListeningSeamlessHotwordData", new C102866v(this, query)).mo85223a(C102867w.f287300a);
                }
            }
        }
        return this.f287036w;
    }

    /* renamed from: f */
    public final void mo93458f(C90531a aVar, boolean z, C102790aa aaVar, C58833ax axVar) {
        C89857g a = aaVar.mo93452a((HotwordResult) aVar, (Uri) null, axVar, this.f287022i);
        ((C89859i) this.f287019f.mo27525b()).mo74236a(a);
        if (z && a.f246206a != C89849ae.HOTWORD_QUERY_COMMITTED) {
            mo93455c();
            C58976aa aaVar2 = C58975e.f156826a;
            this.f287022i = C58836b.f156633a;
            ((C92486a) this.f287016c.mo27525b()).mo87236j(false);
            C59104x b = f287014a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetector");
            ((C59052c) ((C59052c) b).mo56372aa(21156)).mo56386p("Closing mic");
        }
    }
}
