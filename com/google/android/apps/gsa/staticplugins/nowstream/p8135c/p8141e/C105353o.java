package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.o */
/* compiled from: PG */
public final class C105353o extends C105363y {

    /* renamed from: i */
    private static final C59071e f293932i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.e.o");

    /* renamed from: A */
    private final C58881cr f293933A = C58886cw.m90973a(new C105351m(this));

    /* renamed from: a */
    public final C118827a f293934a;

    /* renamed from: j */
    private final C7669fo f293935j;

    /* renamed from: k */
    private final C68214a f293936k;

    /* renamed from: l */
    private final C68214a f293937l;

    /* renamed from: m */
    private final C68214a f293938m;

    /* renamed from: n */
    private final C21370a f293939n;

    /* renamed from: o */
    private final String f293940o;

    /* renamed from: p */
    private final String f293941p;

    /* renamed from: q */
    private final C86124t f293942q;

    /* renamed from: r */
    private final C91656e f293943r;

    /* renamed from: s */
    private final C58881cr f293944s = C58886cw.m90973a(new C105343e(this));

    /* renamed from: t */
    private final C58881cr f293945t = C58886cw.m90973a(new C105344f(this));

    /* renamed from: u */
    private final C58881cr f293946u = C58886cw.m90973a(new C105345g(this));

    /* renamed from: v */
    private final C58881cr f293947v = C58886cw.m90973a(new C105346h(this));

    /* renamed from: w */
    private final C58881cr f293948w = C58886cw.m90973a(new C105347i(this));

    /* renamed from: x */
    private final C58881cr f293949x = C58886cw.m90973a(new C105348j(this));

    /* renamed from: y */
    private final C58881cr f293950y = C58886cw.m90973a(new C105349k(this));

    /* renamed from: z */
    private final C58881cr f293951z = C58886cw.m90973a(new C105350l(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105353o(C91391c cVar, C8142xb xbVar, C7669fo foVar, String str, C22871g gVar, C22871g gVar2, String str2, C68214a aVar, C68214a aVar2, C68214a aVar3, C21370a aVar4, C105359u uVar, C86124t tVar, C118827a aVar5, C91656e eVar) {
        super("CreateNowCardsStreamTask", cVar, xbVar, gVar, gVar2, uVar);
        this.f293940o = str;
        this.f293941p = str2;
        this.f293936k = aVar;
        this.f293937l = aVar2;
        this.f293938m = aVar3;
        this.f293939n = aVar4;
        this.f293935j = foVar;
        this.f293942q = tVar;
        this.f293934a = aVar5;
        this.f293943r = eVar;
    }

    /* renamed from: h */
    private static long m175019h(C91396h hVar) {
        C7726hr hrVar = hVar.mo85712b().f27057b;
        if (hrVar == null) {
            hrVar = C7726hr.f27008i;
        }
        long size = (long) hrVar.f27013d.size();
        for (C7726hr hrVar2 : hrVar.f27012c) {
            size += (long) hrVar2.f27013d.size();
            for (C7726hr hrVar3 : hrVar2.f27012c) {
                size += (long) hrVar3.f27013d.size();
            }
        }
        return size;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: com.google.android.apps.gsa.sidekick.main.g.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: com.google.android.apps.gsa.sidekick.main.g.h} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|73|74|79|80) */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0238, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023f, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0237 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0165 A[Catch:{ all -> 0x0214 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b3 A[SYNTHETIC, Splitter:B:55:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105352n mo94733b() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "CreateNowCardsStreamTsk"
            r3 = 0
            r4 = 0
            r5 = 1
            r7 = 0
            com.google.common.base.cr r0 = r1.f293948w     // Catch:{ InterruptedException -> 0x02a4, TimeoutException -> 0x02a2, ExecutionException -> 0x0242 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ InterruptedException -> 0x02a4, TimeoutException -> 0x02a2, ExecutionException -> 0x0242 }
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0     // Catch:{ InterruptedException -> 0x02a4, TimeoutException -> 0x02a2, ExecutionException -> 0x0242 }
            com.google.android.apps.gsa.y.c r9 = com.google.android.apps.gsa.p8885y.C118837d.m197248b(r0)     // Catch:{ InterruptedException -> 0x02a4, TimeoutException -> 0x02a2, ExecutionException -> 0x0242 }
            r10 = 1
            com.google.ai.b.eo r0 = com.google.p375ai.p378b.C7642eo.OTHER     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r1.f293940o     // Catch:{ all -> 0x0217 }
            r11 = 20
            if (r0 == 0) goto L_0x0073
            com.google.ai.b.eo r13 = com.google.p375ai.p378b.C7642eo.REFRESH_FROM_NOTIFICATION_TOKEN     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.g.c r14 = r1.f293963c     // Catch:{ all -> 0x0217 }
            com.google.common.util.concurrent.cx r0 = r14.mo85727c(r13, r0)     // Catch:{ all -> 0x0217 }
            com.google.common.util.concurrent.cx r0 = r1.mo94758d(r0, r13)     // Catch:{ all -> 0x0217 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r0, r11, r13)     // Catch:{ all -> 0x0217 }
            r18 = r0
            com.google.android.apps.gsa.sidekick.main.g.h r18 = (com.google.android.apps.gsa.sidekick.main.p7204g.C91396h) r18     // Catch:{ all -> 0x0217 }
            boolean r15 = r1.mo94757c(r7)     // Catch:{ all -> 0x006c }
            if (r18 != 0) goto L_0x0040
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x006c }
        L_0x003d:
            r17 = r0
            goto L_0x004e
        L_0x0040:
            boolean r0 = r18.mo85714d()     // Catch:{ all -> 0x006c }
            r0 = r0 ^ r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x006c }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x006c }
            goto L_0x003d
        L_0x004e:
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.b r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.b     // Catch:{ all -> 0x006c }
            r13 = 0
            r16 = 0
            r11 = r0
            r12 = r18
            r11.<init>(r12, r13, r15, r16, r17)     // Catch:{ all -> 0x006c }
            r9.close()     // Catch:{ InterruptedException -> 0x0066, TimeoutException -> 0x0064, ExecutionException -> 0x005e }
            return r0
        L_0x005e:
            r0 = move-exception
            r9 = r7
            r8 = r18
            goto L_0x0246
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            r9 = r7
            r8 = r18
            goto L_0x02a8
        L_0x006c:
            r0 = move-exception
            r3 = r0
            r13 = r7
            r7 = r18
            goto L_0x021c
        L_0x0073:
            java.lang.String r0 = r1.f293941p     // Catch:{ all -> 0x0217 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x0095
            dagger.a r0 = r1.f293936k     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.b.b r0 = (com.google.android.apps.gsa.sidekick.main.p7199b.C91262b) r0     // Catch:{ all -> 0x0217 }
            java.lang.String r13 = r1.f293941p     // Catch:{ all -> 0x0217 }
            r0.mo85533d(r13)     // Catch:{ all -> 0x0217 }
            com.google.ai.b.eo r0 = com.google.p375ai.p378b.C7642eo.BACKEND_DATA_VERSION_CHANGED_MONET     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.shared.c.e r13 = r1.f293943r     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.shared.logger.d.b r14 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_DATA_INVALIDATED     // Catch:{ all -> 0x0217 }
            r13.mo86043h(r14)     // Catch:{ all -> 0x0217 }
        L_0x0091:
            r13 = r7
        L_0x0092:
            r7 = 1
            goto L_0x0163
        L_0x0095:
            dagger.a r0 = r1.f293937l     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.ac r0 = (com.google.android.apps.gsa.sidekick.main.entry.C91298ac) r0     // Catch:{ all -> 0x0217 }
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.w r14 = new com.google.android.apps.gsa.sidekick.main.entry.w     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfEntryTreeNotPresent"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.x r14 = new com.google.android.apps.gsa.sidekick.main.entry.x     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfConfigurationChanged"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.y r14 = new com.google.android.apps.gsa.sidekick.main.entry.y     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfLocaleChanged"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.z r14 = new com.google.android.apps.gsa.sidekick.main.entry.z     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfGetEntriesAreStale"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.aa r14 = new com.google.android.apps.gsa.sidekick.main.entry.aa     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfTalkbackEnabled"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.ab r14 = new com.google.android.apps.gsa.sidekick.main.entry.ab     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfUserSessionIsExpired"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.entry.l r14 = new com.google.android.apps.gsa.sidekick.main.entry.l     // Catch:{ all -> 0x0217 }
            r14.<init>(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r15 = "invalidateIfGestaltVersionChanged"
            com.google.common.util.concurrent.cx r13 = r0.mo85582a(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            com.google.android.libraries.gsa.k.g r0 = r0.f254813i     // Catch:{ all -> 0x0217 }
            java.lang.String r14 = "getClientTraceFuture"
            com.google.android.apps.gsa.sidekick.main.entry.m r15 = com.google.android.apps.gsa.sidekick.main.entry.C91357m.f254918a     // Catch:{ all -> 0x0217 }
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r13, r14, r15)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ all -> 0x0217 }
            com.google.ai.b.eo r0 = (com.google.p375ai.p378b.C7642eo) r0     // Catch:{ all -> 0x0217 }
            com.google.ai.b.eo r13 = com.google.p375ai.p378b.C7642eo.SERVICE_NOT_INVALIDATED     // Catch:{ all -> 0x0217 }
            if (r0 == r13) goto L_0x0108
            com.google.android.apps.gsa.sidekick.shared.c.e r13 = r1.f293943r     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.shared.logger.d.b r14 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_DATA_INVALIDATED     // Catch:{ all -> 0x0217 }
            r13.mo86043h(r14)     // Catch:{ all -> 0x0217 }
            goto L_0x0091
        L_0x0108:
            com.google.common.base.cr r13 = r1.f293951z     // Catch:{ all -> 0x0217 }
            java.lang.Object r13 = r13.mo6453a()     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.y.a.d r13 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r13     // Catch:{ all -> 0x0217 }
            r13.mo104025g(r5)     // Catch:{ all -> 0x0217 }
            com.google.ai.b.fo r13 = r1.f293935j     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.search.core.i.t r14 = r1.f293942q     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246994f     // Catch:{ all -> 0x0217 }
            boolean r14 = r14.mo79746e(r15)     // Catch:{ all -> 0x0217 }
            if (r10 == r14) goto L_0x0121
            r14 = 1
            goto L_0x0122
        L_0x0121:
            r14 = 3
        L_0x0122:
            com.google.android.apps.gsa.sidekick.main.g.h r3 = r1.mo94760f(r4, r0, r13, r14)     // Catch:{ all -> 0x0217 }
            com.google.android.apps.gsa.sidekick.main.g.c r13 = r1.f293963c     // Catch:{ all -> 0x0217 }
            com.google.common.util.concurrent.cx r13 = r13.mo85726b()     // Catch:{ all -> 0x0217 }
            java.lang.Object r13 = com.google.common.util.concurrent.C60856cj.m92910s(r13)     // Catch:{ all -> 0x0217 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0217 }
            long r13 = r13.longValue()     // Catch:{ all -> 0x0217 }
            if (r3 == 0) goto L_0x014e
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x013d
            goto L_0x014e
        L_0x013d:
            com.google.common.base.cr r15 = r1.f293949x     // Catch:{ all -> 0x0214 }
            java.lang.Object r15 = r15.mo6453a()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.y.a.d r15 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r15     // Catch:{ all -> 0x0214 }
            long r7 = m175019h(r3)     // Catch:{ all -> 0x0214 }
            r15.mo104025g(r7)     // Catch:{ all -> 0x0214 }
            r7 = 0
            goto L_0x0163
        L_0x014e:
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r1.f293943r     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.shared.logger.d.b r7 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_EMPTY_SESSION     // Catch:{ all -> 0x0214 }
            r0.mo86043h(r7)     // Catch:{ all -> 0x0214 }
            com.google.ai.b.xb r0 = r1.f293962b     // Catch:{ all -> 0x0214 }
            com.google.ai.b.xb r7 = com.google.p375ai.p378b.C8142xb.ACETONE_OVERLAY_MOMO     // Catch:{ all -> 0x0214 }
            if (r0 != r7) goto L_0x015f
            com.google.ai.b.eo r0 = com.google.p375ai.p378b.C7642eo.NO_CARDS_NOW_CONTROLLER_MOMO     // Catch:{ all -> 0x0214 }
            goto L_0x0092
        L_0x015f:
            com.google.ai.b.eo r0 = com.google.p375ai.p378b.C7642eo.NO_CARDS_NOW_CONTROLLER     // Catch:{ all -> 0x0214 }
            goto L_0x0092
        L_0x0163:
            if (r7 == 0) goto L_0x01b3
            com.google.common.base.cr r7 = r1.f293933A     // Catch:{ all -> 0x0214 }
            java.lang.Object r7 = r7.mo6453a()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.y.a.d r7 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r7     // Catch:{ all -> 0x0214 }
            r7.mo104025g(r5)     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.sidekick.main.g.c r7 = r1.f293963c     // Catch:{ all -> 0x0214 }
            com.google.common.util.concurrent.cx r7 = r7.mo85725a(r0)     // Catch:{ all -> 0x0214 }
            com.google.common.util.concurrent.cx r0 = r1.mo94758d(r7, r0)     // Catch:{ all -> 0x0214 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0214 }
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r0, r11, r7)     // Catch:{ all -> 0x0214 }
            r7 = r0
            com.google.android.apps.gsa.sidekick.main.g.h r7 = (com.google.android.apps.gsa.sidekick.main.p7204g.C91396h) r7     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.sidekick.main.g.c r0 = r1.f293963c     // Catch:{ all -> 0x01b1 }
            com.google.common.util.concurrent.cx r0 = r0.mo85726b()     // Catch:{ all -> 0x01b1 }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ all -> 0x01b1 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01b1 }
            long r13 = r0.longValue()     // Catch:{ all -> 0x01b1 }
            com.google.common.base.cr r0 = r1.f293945t     // Catch:{ all -> 0x01b1 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x01b1 }
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0     // Catch:{ all -> 0x01b1 }
            r0.mo104025g(r5)     // Catch:{ all -> 0x01b1 }
            if (r7 == 0) goto L_0x01af
            com.google.common.base.cr r0 = r1.f293950y     // Catch:{ all -> 0x01b1 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x01b1 }
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0     // Catch:{ all -> 0x01b1 }
            long r11 = m175019h(r7)     // Catch:{ all -> 0x01b1 }
            r0.mo104025g(r11)     // Catch:{ all -> 0x01b1 }
        L_0x01af:
            r3 = r7
            goto L_0x01ea
        L_0x01b1:
            r0 = move-exception
            goto L_0x021b
        L_0x01b3:
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r1.f293943r     // Catch:{ all -> 0x0214 }
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.f255619f     // Catch:{ all -> 0x0214 }
            boolean r7 = r7.getAndSet(r4)     // Catch:{ all -> 0x0214 }
            if (r7 == 0) goto L_0x01dd
            com.google.android.apps.gsa.shared.logger.b.f r7 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x0214 }
            r7.<init>()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_CACHE_HIT     // Catch:{ all -> 0x0214 }
            r7.f246201a = r8     // Catch:{ all -> 0x0214 }
            boolean r8 = r0.f255622i     // Catch:{ all -> 0x0214 }
            com.google.common.o.aj r8 = com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e.m149938b(r8)     // Catch:{ all -> 0x0214 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0214 }
            com.google.common.o.cb r8 = (com.google.common.p4552o.C59687cb) r8     // Catch:{ all -> 0x0214 }
            r7.f246203c = r8     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.shared.logger.b.g r7 = r7.mo83699a()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.shared.logger.b.i r0 = r0.f255616c     // Catch:{ all -> 0x0214 }
            r0.mo74236a(r7)     // Catch:{ all -> 0x0214 }
        L_0x01dd:
            com.google.common.base.cr r0 = r1.f293945t     // Catch:{ all -> 0x0214 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0     // Catch:{ all -> 0x0214 }
            r7 = 0
            r0.mo104025g(r7)     // Catch:{ all -> 0x0214 }
        L_0x01ea:
            com.google.common.base.cr r0 = r1.f293944s     // Catch:{ all -> 0x0214 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0     // Catch:{ all -> 0x0214 }
            r0.mo104025g(r5)     // Catch:{ all -> 0x0214 }
            boolean r22 = r1.mo94757c(r13)     // Catch:{ all -> 0x0214 }
            com.google.common.base.b r24 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0214 }
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.b r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.b     // Catch:{ all -> 0x0214 }
            r23 = 0
            r18 = r0
            r19 = r3
            r20 = r13
            r18.<init>(r19, r20, r22, r23, r24)     // Catch:{ all -> 0x0214 }
            r9.close()     // Catch:{ InterruptedException -> 0x0211, TimeoutException -> 0x020f, ExecutionException -> 0x020c }
            return r0
        L_0x020c:
            r0 = move-exception
            r8 = r3
            goto L_0x023a
        L_0x020f:
            r0 = move-exception
            goto L_0x0212
        L_0x0211:
            r0 = move-exception
        L_0x0212:
            r8 = r3
            goto L_0x0240
        L_0x0214:
            r0 = move-exception
            r7 = r3
            goto L_0x021b
        L_0x0217:
            r0 = move-exception
            r7 = r3
            r13 = 0
        L_0x021b:
            r3 = r0
        L_0x021c:
            r9.close()     // Catch:{ all -> 0x0220 }
            goto L_0x0237
        L_0x0220:
            r0 = move-exception
            r8 = r0
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0237 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r0[r4] = r9     // Catch:{ Exception -> 0x0237 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.String r11 = "addSuppressed"
            java.lang.reflect.Method r0 = r9.getDeclaredMethod(r11, r0)     // Catch:{ Exception -> 0x0237 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0237 }
            r9[r4] = r8     // Catch:{ Exception -> 0x0237 }
            r0.invoke(r3, r9)     // Catch:{ Exception -> 0x0237 }
        L_0x0237:
            throw r3     // Catch:{ InterruptedException -> 0x023e, TimeoutException -> 0x023c, ExecutionException -> 0x0238 }
        L_0x0238:
            r0 = move-exception
            r8 = r7
        L_0x023a:
            r9 = r13
            goto L_0x0246
        L_0x023c:
            r0 = move-exception
            goto L_0x023f
        L_0x023e:
            r0 = move-exception
        L_0x023f:
            r8 = r7
        L_0x0240:
            r9 = r13
            goto L_0x02a8
        L_0x0242:
            r0 = move-exception
            r8 = r3
            r9 = 0
        L_0x0246:
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof com.google.android.apps.gsa.sidekick.main.p7204g.C91400l
            if (r3 == 0) goto L_0x026d
            java.lang.Throwable r3 = r0.getCause()
            com.google.android.apps.gsa.sidekick.main.g.l r3 = (com.google.android.apps.gsa.sidekick.main.p7204g.C91400l) r3
            int r3 = r3.f254980a
            r7 = 13
            if (r3 != r7) goto L_0x026d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r0)
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.b r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.b
            r11 = 0
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13)
            return r0
        L_0x026d:
            com.google.common.f.e r3 = f293932i
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r2 = "Failed to access data from EntryProvider. ExecutionException."
            r4 = 22305(0x5721, float:3.1256E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.cr r0 = r1.f293944s
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0
            r2 = 0
            r0.mo104025g(r2)
            com.google.common.base.cr r0 = r1.f293947v
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0
            r0.mo104025g(r5)
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.b r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.b
            r11 = 0
            r12 = 1
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13)
            return r0
        L_0x02a2:
            r0 = move-exception
            goto L_0x02a5
        L_0x02a4:
            r0 = move-exception
        L_0x02a5:
            r8 = r3
            r9 = 0
        L_0x02a8:
            com.google.common.f.e r3 = f293932i
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r2 = "Failed to access data from EntryProvider."
            r4 = 22304(0x5720, float:3.1255E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r4)).mo56386p(r2)
            com.google.common.base.cr r0 = r1.f293944s
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0
            r2 = 0
            r0.mo104025g(r2)
            com.google.common.base.cr r0 = r1.f293946u
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.y.a.d r0 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r0
            r0.mo104025g(r5)
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            com.google.android.apps.gsa.staticplugins.nowstream.c.e.b r0 = new com.google.android.apps.gsa.staticplugins.nowstream.c.e.b
            r11 = 1
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105353o.mo94733b():com.google.android.apps.gsa.staticplugins.nowstream.c.e.n");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo94757c(long j) {
        C90748e.m148224b();
        if (!((C89062r) C60856cj.m92910s(((C89037bh) this.f293938m.mo27525b()).mo27378c())).mo83040a() && this.f293939n.mo26870b() - j > 180000) {
            return true;
        }
        return false;
    }
}
