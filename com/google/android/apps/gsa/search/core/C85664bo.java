package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C10000o;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bp;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.opaonboarding.C83897bc;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.search.core.udc.C87229y;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91266f;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61819l;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61822o;
import com.google.knowledge.p4671b.C61824q;
import com.google.knowledge.p4671b.C61826s;
import com.google.knowledge.p4671b.C61828u;
import com.google.knowledge.p4671b.C61832y;
import com.google.p375ai.p378b.C7859mp;
import com.google.p375ai.p378b.C8098vl;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import dagger.C68214a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.bo */
/* compiled from: PG */
public final class C85664bo implements C90991b {

    /* renamed from: a */
    public static final C59071e f231554a = C59071e.m91332i("com.google.android.apps.gsa.search.core.bo");

    /* renamed from: A */
    private final C113787bc f231555A;

    /* renamed from: B */
    private final C91123v f231556B;

    /* renamed from: b */
    public final AtomicReference f231557b = new AtomicReference(C9855w.STANDBY);

    /* renamed from: c */
    public final AtomicBoolean f231558c = new AtomicBoolean(false);

    /* renamed from: d */
    public final AtomicReference f231559d = new AtomicReference(C58733pz.f156496a);

    /* renamed from: e */
    private final C85653bd f231560e;

    /* renamed from: f */
    private final C86054o f231561f;

    /* renamed from: g */
    private final C91272l f231562g;

    /* renamed from: h */
    private final C91266f f231563h;

    /* renamed from: i */
    private final C86319j f231564i;

    /* renamed from: j */
    private final C68214a f231565j;

    /* renamed from: k */
    private final SharedPreferences f231566k;

    /* renamed from: l */
    private final C68214a f231567l;

    /* renamed from: m */
    private final C68214a f231568m;

    /* renamed from: n */
    private final C68214a f231569n;

    /* renamed from: o */
    private final C68214a f231570o;

    /* renamed from: p */
    private final C68214a f231571p;

    /* renamed from: q */
    private final C68214a f231572q;

    /* renamed from: r */
    private final C87204ah f231573r;

    /* renamed from: s */
    private final C86124t f231574s;

    /* renamed from: t */
    private final bm f231575t;

    /* renamed from: u */
    private final bg f231576u;

    /* renamed from: v */
    private final C9388a f231577v;

    /* renamed from: w */
    private final String f231578w;

    /* renamed from: x */
    private final C68214a f231579x;

    /* renamed from: y */
    private final C68214a f231580y;

    /* renamed from: z */
    private final C68214a f231581z;

    public C85664bo(C85653bd bdVar, C86054o oVar, C91272l lVar, C91266f fVar, C86319j jVar, C68214a aVar, SharedPreferences sharedPreferences, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C87204ah ahVar, C68214a aVar7, C91022f fVar2, C86124t tVar, bm bmVar, bg bgVar, C9388a aVar8, C113787bc bcVar, C91123v vVar, C68214a aVar9, C68214a aVar10, C68214a aVar11) {
        this.f231560e = bdVar;
        this.f231561f = oVar;
        this.f231562g = lVar;
        this.f231563h = fVar;
        this.f231564i = jVar;
        this.f231565j = aVar;
        this.f231566k = sharedPreferences;
        this.f231567l = aVar2;
        this.f231568m = aVar3;
        this.f231569n = aVar4;
        this.f231570o = aVar5;
        this.f231571p = aVar6;
        this.f231572q = aVar7;
        this.f231573r = ahVar;
        this.f231574s = tVar;
        this.f231575t = bmVar;
        this.f231576u = bgVar;
        this.f231577v = aVar8;
        this.f231555A = bcVar;
        this.f231556B = vVar;
        fVar2.mo85301a(this);
        this.f231579x = aVar9;
        this.f231580y = aVar10;
        this.f231581z = aVar11;
        bp c = C73845bq.m108430c();
        c.b(true);
        this.f231578w = c.c().mo65330d();
    }

    /* renamed from: g */
    public static C61826s m137517g(C9855w wVar) {
        C9855w wVar2 = C9855w.STANDBY;
        C85662bm bmVar = C85662bm.AUDIO_HISTORY;
        C56116b bVar = C56116b.UNKNOWN_ID;
        int ordinal = wVar.ordinal();
        if (ordinal == 1) {
            return C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        if (ordinal != 2) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        return C61826s.OPA_OPT_IN_STATUS_ENABLED;
    }

    /* renamed from: h */
    public static C61826s m137518h(boolean z) {
        if (z) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_DISABLED;
    }

    /* renamed from: m */
    private static C87229y m137519m(C87229y yVar, Map map) {
        if (yVar == null || map == null) {
            return null;
        }
        C9855w wVar = C9855w.STANDBY;
        C85662bm bmVar = C85662bm.AUDIO_HISTORY;
        C56116b bVar = C56116b.UNKNOWN_ID;
        C56116b a = C56116b.m87897a(yVar.f235652b);
        if (a == null) {
            a = C56116b.UNKNOWN_ID;
        }
        int ordinal = a.ordinal();
        if (ordinal == 4) {
            return (C87229y) map.get(C56116b.LOCATION_HISTORY);
        }
        if (ordinal != 8) {
            return null;
        }
        return (C87229y) map.get(C56116b.SUPPL_WEB_AND_APP);
    }

    /* renamed from: n */
    private final C61826s m137520n(C60870cx cxVar) {
        if (!this.f231574s.mo79746e(C90014bt.f247391gK)) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (!((C58833ax) this.f231579x.mo27525b()).mo56113h()) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        C61826s sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        if (cxVar.isDone()) {
            C91018d.m148680c();
            try {
                sVar = m137517g((C9855w) C60856cj.m92909r(cxVar));
            } catch (NullPointerException | CancellationException | ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) f231554a.mo56226d()).mo56382g(e)).mo56372aa(7431)).mo56386p("AOL Future failed");
            }
        } else {
            sVar = m137517g((C9855w) this.f231557b.get());
        }
        C60856cj.m92911t(cxVar, new C85657bh(this), C60826bg.f164896a);
        return sVar;
    }

    /* renamed from: o */
    private final C61826s m137521o() {
        int i = this.f231566k.getInt("opa_email_opt_in_status", 0);
        if (i == 1) {
            return C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        if (i != 2) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        return C61826s.OPA_OPT_IN_STATUS_ENABLED;
    }

    /* renamed from: p */
    private final C61826s m137522p(Account account) {
        if (account == null) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (this.f231576u.c(account.name)) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_DISABLED;
    }

    /* renamed from: q */
    private final C61826s m137523q() {
        if (this.f231577v.mo17583e()) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        if (this.f231577v.mo17585g()) {
            return C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
    }

    /* renamed from: r */
    private final C61826s m137524r(C60870cx cxVar) {
        if (!this.f231574s.mo79746e(C90014bt.f247391gK)) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (!((C58833ax) this.f231579x.mo27525b()).mo56113h()) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        C61826s sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        if (cxVar.isDone()) {
            C91018d.m148680c();
            try {
                sVar = m137518h(((Boolean) C60856cj.m92909r(cxVar)).booleanValue());
            } catch (NullPointerException | CancellationException | ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) f231554a.mo56226d()).mo56382g(e)).mo56372aa(7432)).mo56386p("SVR Future failed");
            }
        } else {
            sVar = m137518h(this.f231558c.get());
        }
        C60856cj.m92911t(cxVar, new C85658bi(this), C60826bg.f164896a);
        return sVar;
    }

    /* renamed from: s */
    private final C61826s m137525s(C60870cx cxVar, C58528ij ijVar) {
        Collection collection;
        if (!((C58833ax) this.f231581z.mo27525b()).mo56113h() || !((C81006b) ((C58833ax) this.f231581z.mo27525b()).mo56107c()).mo74780f()) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (cxVar.isDone()) {
            try {
                this.f231559d.set((C58528ij) C60856cj.m92909r(cxVar));
            } catch (CancellationException | ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) f231554a.mo56226d()).mo56382g(e)).mo56372aa(7433)).mo56386p("WarmActions opt-in future failed");
            }
        } else {
            C60856cj.m92911t(cxVar, new C85659bj(this), C60826bg.f164896a);
        }
        Collection collection2 = (Collection) this.f231559d.get();
        try {
            collection = (C58528ij) Collection.EL.stream(C89988b.m146549b(this.f231574s.mo79758x(C90126fx.f251780pk))).map(C85654be.f231520a).filter(C85655bf.f231521a).filter(new C85656bg(ijVar)).collect(C58370cn.f155947b);
        } catch (NumberFormatException unused) {
            collection = C58733pz.f156496a;
        }
        if (Collections.disjoint(collection2, collection)) {
            return C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_ENABLED;
    }

    /* renamed from: t */
    private final boolean m137526t(String str) {
        int i;
        C86317h b = this.f231564i.mo80041b(str);
        synchronized (b.f233379b) {
            C8098vl b2 = b.mo80034b();
            if (b2 != null) {
                if ((b2.f28474a & 4096) == 0 || (i = C7859mp.m22879a(b2.f28481h)) == 0) {
                    i = 1;
                }
                if (i == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C85661bl mo79189a(List list) {
        return mo79190b((C85662bm[]) list.toArray(new C85662bm[list.size()]));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027e, code lost:
        if (r0.f231574s.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b) != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0280, code lost:
        r7 = r0.f231562g.mo85548a(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0287, code lost:
        if (r7 == null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028d, code lost:
        if (r7.mo79718b() == false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0297, code lost:
        if (android.text.TextUtils.isEmpty(r2.name) != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a8, code lost:
        if (android.text.TextUtils.equals(r2.name, r0.f231566k.getString("chrome_history_sync_account", (java.lang.String) null)) == false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02aa, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02c5, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ea, code lost:
        if (r0.f231574s.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b) != false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ec, code lost:
        r7 = r0.f231563h.mo85538a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f2, code lost:
        if (r7 == null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02f6, code lost:
        if (r7.f31405b == false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fa, code lost:
        if (r7.f31406c == false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02fd, code lost:
        r14 = r0.f231560e.mo79173k(r2.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0305, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3.mo56224b()).mo56372aa(7445)).mo56355H("Setting = %s, optedInt = %s", r12, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.core.C85661bl mo79190b(com.google.android.apps.gsa.search.core.C85662bm[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r0.f231561f
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 == 0) goto L_0x000f
            java.lang.String r4 = r2.name
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            com.google.android.apps.gsa.search.core.bd r5 = r0.f231560e
            com.google.ai.b.fg r5 = r5.mo79166c(r4)
            if (r5 != 0) goto L_0x001a
            r5 = 0
            goto L_0x0020
        L_0x001a:
            com.google.ai.b.gs r5 = r5.f26598l
            if (r5 != 0) goto L_0x0020
            com.google.ai.b.gs r5 = com.google.p375ai.p378b.C7700gs.f26874c
        L_0x0020:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            if (r5 != 0) goto L_0x002a
            com.google.common.b.hd r7 = com.google.common.p4522b.C58729pv.f156485a
            goto L_0x0073
        L_0x002a:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<com.google.ai.b.np> r8 = com.google.p375ai.p378b.C7886np.class
            r7.<init>(r8)
            com.google.protobuf.cq r8 = r5.f26877b
            java.util.Iterator r8 = r8.iterator()
        L_0x0037:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0073
            java.lang.Object r9 = r8.next()
            com.google.ai.b.gr r9 = (com.google.p375ai.p378b.C7699gr) r9
            com.google.ai.b.nq r10 = r9.f26871b
            if (r10 != 0) goto L_0x0049
            com.google.ai.b.nq r10 = com.google.p375ai.p378b.C7887nq.f27680c
        L_0x0049:
            int r10 = r10.f27683b
            com.google.ai.b.np r10 = com.google.p375ai.p378b.C7886np.m22886a(r10)
            if (r10 != 0) goto L_0x006f
            com.google.common.f.e r10 = f231554a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r11 = 7443(0x1d13, float:1.043E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r11)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.ai.b.nq r9 = r9.f26871b
            if (r9 != 0) goto L_0x0067
            com.google.ai.b.nq r9 = com.google.p375ai.p378b.C7887nq.f27680c
        L_0x0067:
            java.lang.String r11 = "Could not find OptInSettingId for number %s"
            int r9 = r9.f27683b
            r10.mo56387q(r11, r9)
            goto L_0x0037
        L_0x006f:
            r7.put(r10, r9)
            goto L_0x0037
        L_0x0073:
            if (r2 == 0) goto L_0x0091
            com.google.android.apps.gsa.search.core.udc.ah r8 = r0.f231573r
            boolean r8 = r8.mo80840h()
            if (r8 == 0) goto L_0x0091
            com.google.common.f.e r8 = f231554a
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r9 = "getSettingsStatusMap(): udcCacheApi is available."
            r10 = 7441(0x1d11, float:1.0427E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            com.google.android.apps.gsa.search.core.udc.ah r8 = r0.f231573r
            java.util.Map r8 = r8.mo80836b(r2)
            goto L_0x0092
        L_0x0091:
            r8 = 0
        L_0x0092:
            int r9 = r1.length
            r10 = 0
            r11 = 0
        L_0x0095:
            if (r11 >= r9) goto L_0x0342
            r12 = r1[r11]
            com.google.android.apps.gsa.shared.util.v r13 = r0.f231556B
            boolean r13 = r13.mo85390b()
            r14 = 1
            if (r13 == 0) goto L_0x00be
            com.google.android.apps.gsa.search.core.i.t r13 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250374bt
            boolean r13 = r13.mo79746e(r15)
            if (r13 == 0) goto L_0x00be
            com.google.android.apps.gsa.search.core.bn r13 = new com.google.android.apps.gsa.search.core.bn
            com.google.android.apps.gsa.search.core.bk r15 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            r13.<init>(r15, r14)
            r6.put(r12, r13)
            r12.name()
            r16 = r7
            r1 = 0
            goto L_0x0339
        L_0x00be:
            com.google.android.apps.gsa.search.core.bn r13 = new com.google.android.apps.gsa.search.core.bn
            com.google.android.apps.gsa.search.core.bk r15 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
            r13.<init>(r15, r10)
            r6.put(r12, r13)
            if (r8 == 0) goto L_0x00da
            com.google.bn.b.a.a.a.b r15 = r12.f231550l
            com.google.bn.b.a.a.a.b r3 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.UNKNOWN_ID
            if (r15 != r3) goto L_0x00d1
            goto L_0x00da
        L_0x00d1:
            com.google.bn.b.a.a.a.b r3 = r12.f231550l
            java.lang.Object r3 = r8.get(r3)
            com.google.android.apps.gsa.search.core.udc.y r3 = (com.google.android.apps.gsa.search.core.udc.C87229y) r3
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            r15 = 2
            if (r3 == 0) goto L_0x0104
            com.google.android.apps.gsa.search.core.udc.y r14 = m137519m(r3, r8)
            int r3 = r3.f235654d
            int r3 = com.google.android.apps.gsa.search.core.udc.C87226v.m141057a(r3)
            if (r3 != 0) goto L_0x00eb
            goto L_0x00fc
        L_0x00eb:
            if (r3 != r15) goto L_0x00fc
            if (r14 == 0) goto L_0x00f9
            int r3 = r14.f235654d
            int r3 = com.google.android.apps.gsa.search.core.udc.C87226v.m141057a(r3)
            if (r3 == 0) goto L_0x00fc
            if (r3 != r15) goto L_0x00fc
        L_0x00f9:
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            goto L_0x00fe
        L_0x00fc:
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
        L_0x00fe:
            r13.f231552a = r3
        L_0x0100:
            r16 = r7
            goto L_0x0193
        L_0x0104:
            dagger.a r3 = r0.f231572q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.udc.k r3 = (com.google.android.apps.gsa.search.core.udc.C87215k) r3
            boolean r3 = r3.mo80847h()
            if (r3 == 0) goto L_0x0130
            boolean r3 = r12.mo79182c()
            if (r3 == 0) goto L_0x0130
            dagger.a r3 = r0.f231572q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.udc.k r3 = (com.google.android.apps.gsa.search.core.udc.C87215k) r3
            com.google.bj.c.a.b r14 = r12.f231551m
            boolean r3 = r3.mo80845f(r2, r14)
            if (r3 == 0) goto L_0x012b
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            goto L_0x012d
        L_0x012b:
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
        L_0x012d:
            r13.f231552a = r3
            goto L_0x0100
        L_0x0130:
            if (r8 == 0) goto L_0x013f
            com.google.common.f.e r3 = f231554a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r14 = "Missing cached UDC setting for %s"
            r15 = 7437(0x1d0d, float:1.0421E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r15)).mo56389s(r14, r12)
        L_0x013f:
            com.google.ai.b.np r3 = r12.f231548j
            java.lang.Object r3 = r7.get(r3)
            com.google.ai.b.gr r3 = (com.google.p375ai.p378b.C7699gr) r3
            if (r3 != 0) goto L_0x0150
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
            r13.f231552a = r3
            r16 = r7
            goto L_0x0176
        L_0x0150:
            int r3 = r3.f26872c
            int r3 = com.google.p375ai.p378b.C7697gp.m22808a(r3)
            if (r3 != 0) goto L_0x0159
            r3 = 2
        L_0x0159:
            com.google.android.apps.gsa.search.core.bk[] r14 = com.google.android.apps.gsa.search.core.C85660bk.values()
            int r15 = r14.length
        L_0x015e:
            if (r10 >= r15) goto L_0x0170
            r1 = r14[r10]
            r16 = r7
            int r7 = r1.f231532f
            if (r7 != r3) goto L_0x0169
            goto L_0x0174
        L_0x0169:
            int r10 = r10 + 1
            r1 = r18
            r7 = r16
            goto L_0x015e
        L_0x0170:
            r16 = r7
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
        L_0x0174:
            r13.f231552a = r1
        L_0x0176:
            com.google.android.apps.gsa.search.core.bm r1 = com.google.android.apps.gsa.search.core.C85662bm.LOCATION_HISTORY_AND_REPORTING
            if (r12 != r1) goto L_0x0193
            com.google.android.apps.gsa.search.core.bk r1 = r13.f231552a
            com.google.android.apps.gsa.search.core.bk r3 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            if (r1 != r3) goto L_0x0193
            com.google.android.apps.gsa.sidekick.main.b.f r1 = r0.f231563h
            com.google.android.apps.g.b r1 = r1.mo85538a(r2)
            if (r1 == 0) goto L_0x0193
            boolean r1 = r1.f31407d
            if (r1 == 0) goto L_0x018f
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            goto L_0x0191
        L_0x018f:
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
        L_0x0191:
            r13.f231552a = r1
        L_0x0193:
            com.google.android.apps.gsa.search.core.bm r1 = com.google.android.apps.gsa.search.core.C85662bm.CHROME_HISTORY_SYNC
            if (r12 != r1) goto L_0x019b
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            r13.f231552a = r1
        L_0x019b:
            com.google.android.apps.gsa.search.core.bm r1 = com.google.android.apps.gsa.search.core.C85662bm.NOW_NOTIFICATIONS
            if (r12 != r1) goto L_0x01a3
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.ELIGIBLE
            r13.f231552a = r1
        L_0x01a3:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250569k
            boolean r1 = r1.mo79746e(r3)
            if (r1 == 0) goto L_0x01b7
            boolean r1 = r12.mo79182c()
            if (r1 == 0) goto L_0x01b7
            com.google.android.apps.gsa.search.core.bk r1 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_OTHER
            r13.f231552a = r1
        L_0x01b7:
            r1 = 0
            r13.f231553b = r1
            if (r2 != 0) goto L_0x01bf
            r1 = 0
            goto L_0x0336
        L_0x01bf:
            if (r8 == 0) goto L_0x01f6
            com.google.bn.b.a.a.a.b r3 = r12.f231550l
            com.google.bn.b.a.a.a.b r7 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.UNKNOWN_ID
            if (r3 == r7) goto L_0x01f6
            com.google.bn.b.a.a.a.b r3 = r12.f231550l
            java.lang.Object r3 = r8.get(r3)
            com.google.android.apps.gsa.search.core.udc.y r3 = (com.google.android.apps.gsa.search.core.udc.C87229y) r3
            com.google.android.apps.gsa.search.core.udc.y r7 = m137519m(r3, r8)
            if (r3 == 0) goto L_0x01f2
            int r3 = r3.f235653c
            int r3 = com.google.android.apps.gsa.search.core.udc.C87228x.m141058a(r3)
            if (r3 != 0) goto L_0x01de
            goto L_0x01f2
        L_0x01de:
            r10 = 2
            if (r3 != r10) goto L_0x01f2
            if (r7 == 0) goto L_0x01ee
            int r3 = r7.f235653c
            int r3 = com.google.android.apps.gsa.search.core.udc.C87228x.m141058a(r3)
            if (r3 != 0) goto L_0x01ec
            goto L_0x01f2
        L_0x01ec:
            if (r3 != r10) goto L_0x01f2
        L_0x01ee:
            r1 = 0
            r14 = 1
            goto L_0x0318
        L_0x01f2:
            r1 = 0
            r14 = 0
            goto L_0x0318
        L_0x01f6:
            dagger.a r3 = r0.f231572q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.udc.k r3 = (com.google.android.apps.gsa.search.core.udc.C87215k) r3
            boolean r3 = r3.mo80847h()
            if (r3 == 0) goto L_0x021b
            boolean r3 = r12.mo79182c()
            if (r3 == 0) goto L_0x021b
            dagger.a r3 = r0.f231572q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.udc.k r3 = (com.google.android.apps.gsa.search.core.udc.C87215k) r3
            com.google.bj.c.a.b r7 = r12.f231551m
            boolean r14 = r3.mo80846g(r2, r7)
            r1 = 0
            goto L_0x0318
        L_0x021b:
            boolean r3 = r12.mo79182c()
            if (r3 == 0) goto L_0x022d
            dagger.a r3 = r0.f231572q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.udc.k r3 = (com.google.android.apps.gsa.search.core.udc.C87215k) r3
            r7 = 6
            r3.mo80848i(r7)
        L_0x022d:
            com.google.common.f.e r3 = f231554a
            com.google.common.f.x r7 = r3.mo56224b()
            java.lang.String r10 = "Falling back to non-UDC sources"
            r14 = 7444(0x1d14, float:1.0431E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r14)).mo56386p(r10)
            com.google.android.apps.gsa.assistant.settings.features.ad.w r7 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY
            com.google.bn.b.a.a.a.b r7 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.UNKNOWN_ID
            int r7 = r12.ordinal()
            switch(r7) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x02c4;
                case 2: goto L_0x02c4;
                case 3: goto L_0x02c1;
                case 4: goto L_0x02bf;
                case 5: goto L_0x02ac;
                case 6: goto L_0x025b;
                case 7: goto L_0x0276;
                case 8: goto L_0x0259;
                default: goto L_0x0245;
            }
        L_0x0245:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unknown setting: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x0259:
            r10 = 1
            goto L_0x0291
        L_0x025b:
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b
            boolean r7 = r7.mo79746e(r10)
            if (r7 != 0) goto L_0x0276
            dagger.a r7 = r0.f231565j
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.s.i r7 = (com.google.android.apps.gsa.search.core.p6841s.C86590i) r7
            com.google.android.apps.gsa.search.core.s.h r10 = com.google.android.apps.gsa.search.core.p6841s.C86589h.WEB
            boolean r14 = r7.mo80206b(r2, r10)
            r1 = 0
            goto L_0x0305
        L_0x0276:
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b
            boolean r7 = r7.mo79746e(r10)
            if (r7 != 0) goto L_0x0259
            com.google.android.apps.gsa.sidekick.main.b.l r7 = r0.f231562g
            r10 = 1
            com.google.android.apps.gsa.search.core.h r7 = r7.mo85548a(r2, r10)
            if (r7 == 0) goto L_0x02c4
            boolean r7 = r7.mo79718b()
            if (r7 == 0) goto L_0x02c4
            r1 = 0
            goto L_0x02aa
        L_0x0291:
            java.lang.String r7 = r2.name
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x02c4
            java.lang.String r7 = r2.name
            android.content.SharedPreferences r14 = r0.f231566k
            java.lang.String r15 = "chrome_history_sync_account"
            r1 = 0
            java.lang.String r14 = r14.getString(r15, r1)
            boolean r7 = android.text.TextUtils.equals(r7, r14)
            if (r7 == 0) goto L_0x02c5
        L_0x02aa:
            r14 = 1
            goto L_0x0305
        L_0x02ac:
            r1 = 0
            r10 = 1
            java.lang.String r7 = r2.name
            boolean r7 = r0.m137526t(r7)
            if (r7 != 0) goto L_0x02bd
            boolean r14 = r13.mo79184b()
            if (r14 == 0) goto L_0x02bd
            goto L_0x02aa
        L_0x02bd:
            r14 = r7
            goto L_0x0305
        L_0x02bf:
            r1 = 0
            goto L_0x02fd
        L_0x02c1:
            r1 = 0
            r10 = 1
            goto L_0x02e2
        L_0x02c4:
            r1 = 0
        L_0x02c5:
            r14 = 0
            goto L_0x0305
        L_0x02c7:
            r1 = 0
            r10 = 1
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b
            boolean r7 = r7.mo79746e(r14)
            if (r7 != 0) goto L_0x02e2
            dagger.a r7 = r0.f231565j
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.s.i r7 = (com.google.android.apps.gsa.search.core.p6841s.C86590i) r7
            com.google.android.apps.gsa.search.core.s.h r10 = com.google.android.apps.gsa.search.core.p6841s.C86589h.AUDIO
            boolean r14 = r7.mo80206b(r2, r10)
            goto L_0x0305
        L_0x02e2:
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f231574s
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90109fg.f250560b
            boolean r7 = r7.mo79746e(r14)
            if (r7 != 0) goto L_0x02fd
            com.google.android.apps.gsa.sidekick.main.b.f r7 = r0.f231563h
            com.google.android.apps.g.b r7 = r7.mo85538a(r2)
            if (r7 == 0) goto L_0x02c5
            boolean r14 = r7.f31405b
            if (r14 == 0) goto L_0x02c5
            boolean r7 = r7.f31406c
            if (r7 == 0) goto L_0x02c5
            goto L_0x02aa
        L_0x02fd:
            com.google.android.apps.gsa.search.core.bd r7 = r0.f231560e
            java.lang.String r10 = r2.name
            boolean r14 = r7.mo79173k(r10)
        L_0x0305:
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r7 = 7445(0x1d15, float:1.0433E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r7)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r7 = "Setting = %s, optedInt = %s"
            r3.mo56355H(r7, r12, r14)
        L_0x0318:
            boolean r3 = r13.mo79184b()
            if (r3 != 0) goto L_0x0334
            com.google.android.apps.gsa.search.core.bk r3 = r13.f231552a
            com.google.android.apps.gsa.search.core.bk r7 = com.google.android.apps.gsa.search.core.C85660bk.INELIGIBLE_UNICORN
            if (r3 == r7) goto L_0x0334
            if (r14 == 0) goto L_0x0333
            com.google.common.f.e r3 = f231554a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r7 = "Setting %s reported on but not eligible"
            r10 = 7446(0x1d16, float:1.0434E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56389s(r7, r12)
        L_0x0333:
            r14 = 0
        L_0x0334:
            r13.f231553b = r14
        L_0x0336:
            r12.name()
        L_0x0339:
            int r11 = r11 + 1
            r1 = r18
            r7 = r16
            r10 = 0
            goto L_0x0095
        L_0x0342:
            com.google.android.apps.gsa.search.core.bd r1 = r0.f231560e
            int r1 = r1.mo79165b(r4)
            com.google.android.apps.gsa.search.core.bl r3 = new com.google.android.apps.gsa.search.core.bl
            r3.<init>(r2, r5, r6, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85664bo.mo79190b(com.google.android.apps.gsa.search.core.bm[]):com.google.android.apps.gsa.search.core.bl");
    }

    /* renamed from: c */
    public final C61820m mo79191c() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C61826s sVar;
        C61826s sVar2;
        C61826s sVar3;
        C61826s sVar4;
        C61826s sVar5;
        C61826s sVar6;
        C61826s sVar7;
        C61826s sVar8;
        C61826s sVar9;
        C85661bl b = mo79190b(new C85662bm[]{C85662bm.AUDIO_HISTORY, C85662bm.LOCATION_HISTORY_AND_REPORTING, C85662bm.NOW_CARDS, C85662bm.NOW_NOTIFICATIONS, C85662bm.WEB_HISTORY, C85662bm.WEB_AND_APP_HISTORY, C85662bm.CHROME_HISTORY_SYNC, C85662bm.DEVICE_APPS, C85662bm.DEVICE_CONTACTS});
        Map map = b.f231535b;
        int i = b.f231536c;
        C61819l lVar = (C61819l) C61820m.f167020J.createBuilder();
        C85663bn bnVar = (C85663bn) map.get(C85662bm.AUDIO_HISTORY);
        if (!this.f231574s.mo79746e(C90014bt.f247391gK)) {
            cxVar = C60856cj.m92898g();
        } else if (!((C58833ax) this.f231579x.mo27525b()).mo56113h()) {
            cxVar = C60856cj.m92898g();
        } else {
            cxVar = ((C9799ae) ((C58833ax) this.f231579x.mo27525b()).mo56107c()).mo18041a();
        }
        if (!this.f231574s.mo79746e(C90014bt.f247391gK)) {
            cxVar2 = C60856cj.m92898g();
        } else if (!((C58833ax) this.f231579x.mo27525b()).mo56113h()) {
            cxVar2 = C60856cj.m92898g();
        } else {
            cxVar2 = ((C9799ae) ((C58833ax) this.f231579x.mo27525b()).mo56107c()).mo18045e();
        }
        C58833ax axVar = (C58833ax) this.f231580y.mo27525b();
        if (!axVar.mo56113h()) {
            cxVar3 = C60856cj.m92900i(C58733pz.f156496a);
        } else {
            cxVar3 = ((C10000o) axVar.mo56107c()).mo18176b();
        }
        if (bnVar != null) {
            C61832y a = bnVar.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar = (C61820m) lVar.instance;
            a.getClass();
            mVar.f167039i = a;
            mVar.f167031a |= 64;
        }
        C85663bn bnVar2 = (C85663bn) map.get(C85662bm.NOW_CARDS);
        if (bnVar2 != null) {
            C61832y a2 = bnVar2.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar2 = (C61820m) lVar.instance;
            a2.getClass();
            mVar2.f167033c = a2;
            mVar2.f167031a |= 1;
        }
        lVar.copyOnWrite();
        C61820m mVar3 = (C61820m) lVar.instance;
        mVar3.f167031a |= 2;
        mVar3.f167034d = i;
        C85663bn bnVar3 = (C85663bn) map.get(C85662bm.NOW_NOTIFICATIONS);
        if (bnVar3 != null) {
            C61832y a3 = bnVar3.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar4 = (C61820m) lVar.instance;
            a3.getClass();
            mVar4.f167035e = a3;
            mVar4.f167031a |= 4;
        }
        C85663bn bnVar4 = (C85663bn) map.get(C85662bm.WEB_HISTORY);
        if (bnVar4 != null) {
            C61832y a4 = bnVar4.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar5 = (C61820m) lVar.instance;
            a4.getClass();
            mVar5.f167037g = a4;
            mVar5.f167031a |= 16;
        }
        C85663bn bnVar5 = (C85663bn) map.get(C85662bm.WEB_AND_APP_HISTORY);
        if (bnVar5 != null) {
            C61832y a5 = bnVar5.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar6 = (C61820m) lVar.instance;
            a5.getClass();
            mVar6.f167038h = a5;
            mVar6.f167031a |= 32;
        }
        C85663bn bnVar6 = (C85663bn) map.get(C85662bm.CHROME_HISTORY_SYNC);
        if (bnVar6 != null) {
            C61832y a6 = bnVar6.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar7 = (C61820m) lVar.instance;
            a6.getClass();
            mVar7.f167040j = a6;
            mVar7.f167031a |= 128;
        }
        C85663bn bnVar7 = (C85663bn) map.get(C85662bm.LOCATION_HISTORY_AND_REPORTING);
        if (bnVar7 != null) {
            C61832y a7 = bnVar7.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar8 = (C61820m) lVar.instance;
            a7.getClass();
            mVar8.f167043m = a7;
            mVar8.f167031a |= 2048;
        }
        C85663bn bnVar8 = (C85663bn) map.get(C85662bm.DEVICE_APPS);
        if (bnVar8 != null) {
            C61832y a8 = bnVar8.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar9 = (C61820m) lVar.instance;
            a8.getClass();
            mVar9.f167041k = a8;
            mVar9.f167031a |= 512;
        }
        C85663bn bnVar9 = (C85663bn) map.get(C85662bm.DEVICE_CONTACTS);
        if (bnVar9 != null) {
            C61832y a9 = bnVar9.mo79183a();
            lVar.copyOnWrite();
            C61820m mVar10 = (C61820m) lVar.instance;
            a9.getClass();
            mVar10.f167042l = a9;
            mVar10.f167031a |= 1024;
        }
        C61822o e = mo79192e();
        lVar.copyOnWrite();
        C61820m mVar11 = (C61820m) lVar.instance;
        mVar11.f167044n = e.f167065g;
        mVar11.f167031a |= 4096;
        C61826s j = mo79195j();
        lVar.copyOnWrite();
        C61820m mVar12 = (C61820m) lVar.instance;
        mVar12.f167045o = j.f167079d;
        mVar12.f167031a |= 8192;
        C61826s p = m137522p(this.f231561f.mo79668a());
        lVar.copyOnWrite();
        C61820m mVar13 = (C61820m) lVar.instance;
        mVar13.f167046p = p.f167079d;
        mVar13.f167031a |= 16384;
        C61826s q = m137523q();
        lVar.copyOnWrite();
        C61820m mVar14 = (C61820m) lVar.instance;
        mVar14.f167047q = q.f167079d;
        mVar14.f167031a |= 32768;
        C61826s o = m137521o();
        lVar.copyOnWrite();
        C61820m mVar15 = (C61820m) lVar.instance;
        mVar15.f167048r = o.f167079d;
        mVar15.f167031a |= 65536;
        C61828u k = mo79196k();
        lVar.copyOnWrite();
        C61820m mVar16 = (C61820m) lVar.instance;
        mVar16.f167049s = k.f167085d;
        mVar16.f167031a |= C89885b.S3REQUEST_VALUE;
        C61824q f = mo79193f();
        lVar.copyOnWrite();
        C61820m mVar17 = (C61820m) lVar.instance;
        mVar17.f167050t = f.f167073f;
        mVar17.f167031a |= C89885b.HTTP_VALUE;
        Account a10 = this.f231561f.mo79668a();
        if (a10 == null || !((C89994f) this.f231567l.mo27525b()).mo83823l()) {
            sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar = ((C89994f) this.f231567l.mo27525b()).mo83847J(a10.name) ? C61826s.OPA_OPT_IN_STATUS_ENABLED : C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar18 = (C61820m) lVar.instance;
        mVar18.f167051u = sVar.f167079d;
        mVar18.f167031a |= 524288;
        if (((C83897bc) this.f231568m.mo27525b()).mo77283a(this.f231561f.mo79668a(), 3)) {
            sVar2 = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else {
            sVar2 = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar19 = (C61820m) lVar.instance;
        mVar19.f167054x = sVar2.f167079d;
        mVar19.f167031a |= 4194304;
        if (((C89994f) this.f231567l.mo27525b()).mo83835A()) {
            sVar3 = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else {
            sVar3 = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar20 = (C61820m) lVar.instance;
        mVar20.f167052v = sVar3.f167079d;
        mVar20.f167031a |= 1048576;
        if (!((C58833ax) this.f231569n.mo27525b()).mo56113h()) {
            sVar4 = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar4 = ((C110425l) ((C58833ax) this.f231569n.mo27525b()).mo56107c()).mo98664b() ? C61826s.OPA_OPT_IN_STATUS_ENABLED : C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar21 = (C61820m) lVar.instance;
        mVar21.f167053w = sVar4.f167079d;
        mVar21.f167031a |= C89885b.NOW_VALUE;
        Account a11 = this.f231561f.mo79668a();
        if (a11 == null || !((C58833ax) this.f231571p.mo27525b()).mo56113h()) {
            sVar5 = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar5 = ((v) ((C58833ax) this.f231571p.mo27525b()).mo56107c()).c(a11.name) ? C61826s.OPA_OPT_IN_STATUS_ENABLED : C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar22 = (C61820m) lVar.instance;
        mVar22.f167055y = sVar5.f167079d;
        mVar22.f167031a |= 8388608;
        Account a12 = this.f231561f.mo79668a();
        if (a12 == null || !((C58833ax) this.f231570o.mo27525b()).mo56113h()) {
            sVar6 = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        } else {
            sVar6 = ((C110361bt) ((C58833ax) this.f231570o.mo27525b()).mo56107c()).mo98594k(a12.name, this.f231578w) ? C61826s.OPA_OPT_IN_STATUS_ENABLED : C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar23 = (C61820m) lVar.instance;
        mVar23.f167056z = sVar6.f167079d;
        mVar23.f167031a |= 16777216;
        C61826s n = m137520n(cxVar);
        lVar.copyOnWrite();
        C61820m mVar24 = (C61820m) lVar.instance;
        mVar24.f167022A = n.f167079d;
        mVar24.f167031a |= 33554432;
        C61826s r = m137524r(cxVar2);
        lVar.copyOnWrite();
        C61820m mVar25 = (C61820m) lVar.instance;
        mVar25.f167023B = r.f167079d;
        mVar25.f167031a |= 67108864;
        C61826s s = m137525s(cxVar3, C58733pz.f156496a);
        lVar.copyOnWrite();
        C61820m mVar26 = (C61820m) lVar.instance;
        mVar26.f167024C = s.f167079d;
        mVar26.f167031a |= 134217728;
        C61826s s2 = m137525s(cxVar3, C58528ij.m90011K(C79570b.ALARM, C79570b.TIMER));
        lVar.copyOnWrite();
        C61820m mVar27 = (C61820m) lVar.instance;
        mVar27.f167025D = s2.f167079d;
        mVar27.f167031a |= 268435456;
        C61826s s3 = m137525s(cxVar3, C58528ij.m90013M(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER, C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2));
        lVar.copyOnWrite();
        C61820m mVar28 = (C61820m) lVar.instance;
        mVar28.f167026E = s3.f167079d;
        mVar28.f167031a |= 536870912;
        C61826s i2 = mo79194i();
        lVar.copyOnWrite();
        C61820m mVar29 = (C61820m) lVar.instance;
        mVar29.f167027F = i2.f167079d;
        mVar29.f167031a |= 1073741824;
        if (((C89994f) this.f231567l.mo27525b()).mo83869aF()) {
            sVar7 = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else {
            sVar7 = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar30 = (C61820m) lVar.instance;
        mVar30.f167028G = sVar7.f167079d;
        mVar30.f167031a |= LinearLayoutManager.INVALID_OFFSET;
        if (((C89994f) this.f231567l.mo27525b()).mo83866aC()) {
            sVar8 = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else {
            sVar8 = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar31 = (C61820m) lVar.instance;
        mVar31.f167029H = sVar8.f167079d;
        mVar31.f167032b |= 1;
        if (((C89994f) this.f231567l.mo27525b()).mo83867aD()) {
            sVar9 = C61826s.OPA_OPT_IN_STATUS_ENABLED;
        } else {
            sVar9 = C61826s.OPA_OPT_IN_STATUS_DISABLED;
        }
        lVar.copyOnWrite();
        C61820m mVar32 = (C61820m) lVar.instance;
        mVar32.f167030I = sVar9.f167079d;
        mVar32.f167032b |= 2;
        return (C61820m) lVar.build();
    }

    /* renamed from: e */
    public final C61822o mo79192e() {
        int a = this.f231575t.a();
        if (a == 0) {
            return C61822o.NOT_ELIGIBLE;
        }
        if (a == 1) {
            return C61822o.ELIGIBLE_PREBUILT;
        }
        if (a == 2) {
            return C61822o.ELIGIBLE_FOR_UPGRADE;
        }
        if (a == 3) {
            return C61822o.ELIGIBLE_UPGRADING;
        }
        if (a == 4) {
            return C61822o.ELIGIBLE_UPGRADED;
        }
        if (a != 5) {
            return C61822o.NOT_ELIGIBLE;
        }
        return C61822o.ELIGIBLE_UPGRADED_BYPASS;
    }

    /* renamed from: f */
    public final C61824q mo79193f() {
        if (!this.f231575t.u()) {
            return C61824q.OPA_EXPERIENCE_INELIGIBLE;
        }
        if (this.f231555A.mo100632l()) {
            return C61824q.OPA_EXPERIENCE_TRY_BEFORE_YOU_BUY;
        }
        if (this.f231555A.mo100635o(this.f231561f.mo79668a())) {
            return C61824q.OPA_EXPERIENCE_COMPLETED_ONBOARDING;
        }
        if (this.f231575t.l()) {
            return C61824q.OPA_EXPERIENCE_COMPLETED_ONBOARDING;
        }
        return C61824q.OPA_EXPERIENCE_NOT_STARTED;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OptInChecker");
        C85661bl b = mo79190b(C85662bm.values());
        fVar.mo85279c("account").mo85276a(C90752i.m148235i(b.f231534a));
        if (b.f231534a != null) {
            Account[] r = this.f231561f.mo79684r();
            int i = 0;
            while (true) {
                if (i >= r.length) {
                    break;
                } else if (r[i].equals(b.f231534a)) {
                    fVar.mo85279c("accountidx").mo85276a(C90752i.m148230d(Integer.valueOf(i)));
                    break;
                } else {
                    i++;
                }
            }
            for (C85662bm bmVar : C85662bm.values()) {
                C85663bn a = b.mo79175a(bmVar);
                String bnVar = a.toString();
                if (bmVar == C85662bm.NOW_NOTIFICATIONS && a.f231553b && !m137526t(b.f231534a.name)) {
                    bnVar = bnVar.concat("[IGNORED/DEPRECATED]");
                }
                fVar.mo85279c(bmVar.toString()).mo85276a(C90752i.m148229c(bnVar));
            }
        }
        fVar.mo85279c("OpaEligibility").mo85276a(C90752i.m148229c(mo79192e().name()));
        fVar.mo85279c("OpaUserEnabledStatus").mo85276a(C90752i.m148229c(mo79195j().name()));
        fVar.mo85279c("OpaUdcConsentStatus").mo85276a(C90752i.m148229c(m137522p(this.f231561f.mo79668a()).name()));
        fVar.mo85279c("ScreenContextOptInStatus").mo85276a(C90752i.m148229c(m137523q().name()));
        fVar.mo85279c("OpaEmailOptInStatus").mo85276a(C90752i.m148229c(m137521o().name()));
        fVar.mo85279c("OpaPartialExperienceReason").mo85276a(C90752i.m148229c(mo79196k().name()));
        fVar.mo85279c("OpaExperienceType").mo85276a(C90752i.m148229c(mo79193f().name()));
    }

    /* renamed from: i */
    public final C61826s mo79194i() {
        if (((C89994f) this.f231567l.mo27525b()).mo83840z()) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_DISABLED;
    }

    /* renamed from: j */
    public final C61826s mo79195j() {
        if (!this.f231575t.u()) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (this.f231575t.w()) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_DISABLED;
    }

    /* renamed from: k */
    public final C61828u mo79196k() {
        C113787bc bcVar = this.f231555A;
        Account a = this.f231561f.mo79668a();
        if (a != null && a.name != null && bcVar.f315134c.getBoolean(C113787bc.m188359c(a.name), false)) {
            return C61828u.OPA_UDC_OPT_OUT_FLOW;
        }
        if (this.f231555A.mo100635o(this.f231561f.mo79668a())) {
            return C61828u.OPA_TRY_BEFORE_YOU_BUY;
        }
        return C61828u.OPA_PARTIAL_EXPERIENCE_REASON_UNKNOWN;
    }

    /* renamed from: l */
    public final boolean mo79197l(C85662bm bmVar) {
        return mo79190b(new C85662bm[]{bmVar}).mo79181g(bmVar);
    }
}
