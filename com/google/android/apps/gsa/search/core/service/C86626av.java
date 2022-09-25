package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.search.core.p6494aa.p6495a.p6496a.C84385b;
import com.google.android.apps.gsa.search.core.p6494aa.p6497b.C84390b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6846c.C86662b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86682d;
import com.google.android.apps.gsa.search.core.service.p6848e.C86684f;
import com.google.android.apps.gsa.search.core.service.p6848e.p6850b.C86680a;
import com.google.android.apps.gsa.search.core.service.p6859i.C86749a;
import com.google.android.apps.gsa.search.shared.service.AttachClientResponse;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.C87685am;
import com.google.android.apps.gsa.search.shared.service.C88498s;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87666a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.keepalive.C91051c;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58334be;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.service.av */
/* compiled from: PG */
public final class C86626av implements C91007g, C87666a {

    /* renamed from: a */
    public static final C59071e f234016a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.av");

    /* renamed from: A */
    private final C91051c f234017A;

    /* renamed from: B */
    private final C90476a f234018B;

    /* renamed from: C */
    private final C118827a f234019C;

    /* renamed from: D */
    private final C68214a f234020D;

    /* renamed from: E */
    private C86775r f234021E;

    /* renamed from: F */
    private long f234022F;

    /* renamed from: G */
    private final C90821bm f234023G;

    /* renamed from: b */
    public final LongSparseArray f234024b = new LongSparseArray();

    /* renamed from: c */
    public final Context f234025c;

    /* renamed from: d */
    public final C22871g f234026d;

    /* renamed from: e */
    public final C86124t f234027e;

    /* renamed from: f */
    public final C68214a f234028f;

    /* renamed from: g */
    public final C68214a f234029g;

    /* renamed from: h */
    public final C68214a f234030h;

    /* renamed from: i */
    public final C68214a f234031i;

    /* renamed from: j */
    public final C68214a f234032j;

    /* renamed from: k */
    public final C68214a f234033k;

    /* renamed from: l */
    public final C68214a f234034l;

    /* renamed from: m */
    public final C58833ax f234035m;

    /* renamed from: n */
    public final C58833ax f234036n;

    /* renamed from: o */
    public final C68214a f234037o;

    /* renamed from: p */
    public final C68214a f234038p;

    /* renamed from: q */
    public volatile int f234039q;

    /* renamed from: r */
    public boolean f234040r;

    /* renamed from: s */
    public C60870cx f234041s = C60866ct.f164955a;

    /* renamed from: t */
    private final C22871g f234042t;

    /* renamed from: u */
    private final SharedPreferences f234043u;

    /* renamed from: v */
    private final C91022f f234044v;

    /* renamed from: w */
    private final C86662b f234045w;

    /* renamed from: x */
    private final C68214a f234046x;

    /* renamed from: y */
    private final C68214a f234047y;

    /* renamed from: z */
    private final C68214a f234048z;

    public C86626av(Context context, C22871g gVar, C22871g gVar2, C90821bm bmVar, C86124t tVar, SharedPreferences sharedPreferences, C91022f fVar, C86662b bVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C58833ax axVar, C58833ax axVar2, C91051c cVar, C90476a aVar11, C68214a aVar12, C68214a aVar13, C118827a aVar14, C68214a aVar15) {
        this.f234025c = context;
        this.f234026d = gVar;
        this.f234042t = gVar2;
        this.f234023G = bmVar;
        this.f234027e = tVar;
        this.f234043u = sharedPreferences;
        this.f234044v = fVar;
        this.f234045w = bVar;
        this.f234028f = aVar;
        this.f234029g = aVar2;
        this.f234030h = aVar3;
        this.f234031i = aVar4;
        this.f234032j = aVar5;
        this.f234046x = aVar6;
        this.f234047y = aVar7;
        this.f234033k = aVar8;
        this.f234034l = aVar9;
        this.f234048z = aVar10;
        this.f234035m = axVar;
        this.f234036n = axVar2;
        this.f234017A = cVar;
        this.f234018B = aVar11;
        this.f234037o = aVar12;
        this.f234038p = aVar13;
        this.f234019C = aVar14;
        this.f234020D = aVar15;
    }

    /* renamed from: a */
    public final int mo80236a() {
        return (int) this.f234027e.mo79743a(C90071dw.f249756a);
    }

    /* renamed from: b */
    public final int mo80237b(Intent intent) {
        if (intent != null) {
            C58976aa aaVar = C58975e.f156826a;
        }
        if (intent == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            C89949q.m146523g(557);
        } else {
            this.f234026d.mo28212l("SearchServiceCore [processIntent]", new C86621aq(this, intent));
        }
        return this.f234027e.mo79746e(C89996bb.f246775e) ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C86610af mo80238c() {
        return (C86610af) this.f234028f.mo27525b();
    }

    /* renamed from: e */
    public final AttachClientResponse mo80239e(long j, C88498s sVar, ClientConfig clientConfig, long j2) {
        C58976aa aaVar = C58975e.f156826a;
        C86775r rVar = new C86775r(j, this, sVar, clientConfig, this.f234026d, this.f234023G, this.f234047y, j2, this.f234018B);
        this.f234026d.mo28212l("SearchServiceCore [attachClient]", new C86613ai(this, j, rVar));
        return new AttachClientResponse(rVar, new C87685am(rVar.f234386h, mo80254t(rVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo80240f(C86775r rVar) {
        if (rVar.f234392n) {
            if (mo80254t(rVar)) {
                ((C86779v) this.f234037o.mo27525b()).mo80395a(rVar, this.f234024b);
            } else if (!rVar.f234393o) {
                if ((this.f234021E == null || !rVar.f234384f.mo81902t()) && !mo80255u(rVar)) {
                    C86775r rVar2 = this.f234021E;
                    if (rVar2 != null) {
                        C59104x d = f234016a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "SearchServiceCore");
                        ((C59052c) ((C59052c) d).mo56372aa(8413)).mo56354G("Abort, client [%s] has too low priority against [%s].", rVar.f234384f.f236951d, rVar2.f234384f.f236951d);
                    } else {
                        C59104x d2 = f234016a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "SearchServiceCore");
                        ((C59052c) ((C59052c) d2).mo56372aa(8412)).mo56389s("Abort, client [%s] has too low priority.", rVar.f234384f.f236951d);
                    }
                    rVar.f234383e.mo80379b(new C87684al(C88244um.CLIENT_NOT_ACTIVATED).mo81964a());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80241g(com.google.android.apps.gsa.search.core.service.C86775r r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            if (r8 == 0) goto L_0x0166
            android.util.LongSparseArray r2 = r7.f234024b
            long r3 = r8.f234381c
            java.lang.Object r2 = r2.get(r3)
            if (r2 == r8) goto L_0x0053
            com.google.common.f.e r9 = f234016a
            com.google.common.f.x r10 = r9.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "SearchServiceCore"
            r10.mo56378ag(r2, r3)
            java.lang.String r2 = "Ignoring already detached client"
            r4 = 8422(0x20e6, float:1.1802E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r2)
            boolean r10 = r7.mo80254t(r8)
            if (r10 == 0) goto L_0x0034
            boolean r10 = r8.f234387i
            if (r10 != 0) goto L_0x0038
        L_0x0034:
            com.google.android.apps.gsa.search.core.service.r r10 = r7.f234021E
            if (r10 != r8) goto L_0x0052
        L_0x0038:
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r3)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r10 = 8423(0x20e7, float:1.1803E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r10 = "Unexpected state on deactivation: client=%s, detach=%b, new=%b"
            r9.mo56359L(r10, r8, r0, r1)
            int r8 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r7.mo80254t(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005f
            boolean r0 = r8.f234387i
            if (r0 != 0) goto L_0x0063
        L_0x005f:
            com.google.android.apps.gsa.search.core.service.r r0 = r7.f234021E
            if (r8 != r0) goto L_0x00da
        L_0x0063:
            com.google.common.f.ad r0 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r3 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r0, r3)
            boolean r0 = r7.mo80254t(r8)
            if (r0 == 0) goto L_0x009f
            dagger.a r0 = r7.f234037o
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.service.v r0 = (com.google.android.apps.gsa.search.core.service.C86779v) r0
            dagger.a r3 = r0.f234410b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.service.cg r3 = (com.google.android.apps.gsa.search.core.service.C86669cg) r3
            r3.mo80272g(r8)
            com.google.android.apps.gsa.search.core.service.a r3 = r0.f234411c
            com.google.common.b.be r3 = r0.f234409a
            long r4 = r8.f234389k
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            if (r3 != r8) goto L_0x00bb
            com.google.common.b.be r0 = r0.f234409a
            long r3 = r8.f234389k
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.remove(r3)
            goto L_0x00bb
        L_0x009f:
            dagger.a r0 = r7.f234033k
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.service.cg r0 = (com.google.android.apps.gsa.search.core.service.C86669cg) r0
            r0.mo80272g(r8)
            com.google.android.apps.gsa.search.core.service.r r0 = r7.f234021E
            if (r8 != r0) goto L_0x00bb
            dagger.a r0 = r7.f234028f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.service.af r0 = (com.google.android.apps.gsa.search.core.service.C86610af) r0
            r0.mo80226g(r2)
            r7.f234021E = r2
        L_0x00bb:
            boolean r0 = r8.f234393o
            if (r0 == 0) goto L_0x00da
            dagger.a r0 = r7.f234030h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.d.bo r0 = (com.google.android.apps.gsa.search.core.state.p6872d.C86948bo) r0
            r0.f234849g = r1
            com.google.android.libraries.gsa.k.g r0 = r7.f234026d
            com.google.android.apps.gsa.search.core.service.aj r3 = new com.google.android.apps.gsa.search.core.service.aj
            r3.<init>(r7)
            java.lang.String r4 = "beginKeepAliveForHandover"
            r0.mo28212l(r4, r3)
            com.google.android.apps.gsa.shared.util.keepalive.c r0 = r7.f234017A
            r0.mo85323d()
        L_0x00da:
            if (r9 == 0) goto L_0x0140
            dagger.a r9 = r7.f234033k
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.service.cg r9 = (com.google.android.apps.gsa.search.core.service.C86669cg) r9
            boolean r0 = r8.mo80392n()
            if (r0 != 0) goto L_0x00ff
            com.google.common.f.e r9 = com.google.android.apps.gsa.search.core.service.C86669cg.f234137a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "SessionLifecycleManager"
            r9.mo56378ag(r0, r1)
            java.lang.String r0 = "Client : %s has no associated SessionController"
            r1 = 8473(0x2119, float:1.1873E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56389s(r0, r8)
            goto L_0x0134
        L_0x00ff:
            boolean r0 = r9.mo80277l(r8)
            if (r0 == 0) goto L_0x010b
            com.google.android.apps.gsa.search.core.service.e.f r0 = r8.f234397s
        L_0x0107:
            r9.mo80270e(r8, r0)
            goto L_0x0134
        L_0x010b:
            long r3 = r8.f234381c
            com.google.android.apps.gsa.search.core.service.e.f r0 = r8.f234397s
            if (r0 == 0) goto L_0x011e
            com.google.common.b.be r2 = r9.f234142f
            com.google.common.b.be r2 = r2.mo55027e()
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
        L_0x011e:
            r0 = 0
            if (r2 == 0) goto L_0x012a
            long r5 = r2.longValue()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r1 = 0
        L_0x012b:
            boolean r0 = r8.f234393o
            if (r0 != 0) goto L_0x0134
            if (r1 == 0) goto L_0x0134
            com.google.android.apps.gsa.search.core.service.e.f r0 = r8.f234397s
            goto L_0x0107
        L_0x0134:
            android.util.LongSparseArray r9 = r7.f234024b
            long r0 = r8.f234381c
            r9.delete(r0)
            com.google.android.apps.gsa.search.core.service.n r9 = r8.f234383e
            r9.mo80381e()
        L_0x0140:
            r7.mo80252r()
            if (r10 == 0) goto L_0x0166
            boolean r9 = r7.mo80254t(r8)
            if (r9 == 0) goto L_0x0163
            dagger.a r9 = r7.f234037o
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.service.v r9 = (com.google.android.apps.gsa.search.core.service.C86779v) r9
            android.util.LongSparseArray r10 = r7.f234024b
            long r0 = r8.f234389k
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            r9.mo80396b(r10, r8)
            return
        L_0x0163:
            r7.mo80246l()
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.C86626av.mo80241g(com.google.android.apps.gsa.search.core.service.r, boolean, boolean):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchServiceCore");
        fVar.mo85279c("Attached Clients").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234024b.size())));
        C91006f e = fVar.mo85281e((Object) null);
        for (int i = 0; i < this.f234024b.size(); i++) {
            C86775r rVar = (C86775r) this.f234024b.valueAt(i);
            if (rVar == this.f234021E) {
                e.mo85292s(C90752i.m148229c("Active:"));
            }
            e.mo85287n(rVar);
        }
        fVar.mo85287n((C91007g) this.f234037o.mo27525b());
        fVar.mo85287n((C91007g) this.f234028f.mo27525b());
        fVar.mo85287n((C91007g) this.f234033k.mo27525b());
    }

    /* renamed from: h */
    public final void mo80242h(long j, boolean z) {
        this.f234026d.mo28212l("SearchServiceCore [detachClient]", new C86623as(this, j, z));
    }

    /* renamed from: i */
    public final void mo80243i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f234026d.mo28212l("SearchServiceCore [disposeEventBus]", new C86622ar(this));
        this.f234043u.edit().putBoolean("service_created", false).apply();
        this.f234044v.mo85302b(this.f234045w);
        C86662b bVar = this.f234045w;
        synchronized (bVar.f234117a) {
            bVar.f234117a.remove(this);
        }
        C89949q.m146523g(553);
        C118837d.m197251e(this.f234019C.mo77944g(C118569b.SEARCH_SERVICE_LIFETIME_SECS, C118575h.SEARCH_SERVICE_LIFETIME), this.f234022F);
        ((C84390b) this.f234046x.mo27525b()).mo77951c();
        ((C84385b) this.f234020D.mo27525b()).mo77948c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo80244j(C86625au auVar) {
        auVar.mo80235b(this, (C86610af) this.f234028f.mo27525b(), true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo80245k(C86625au auVar) {
        auVar.mo80235b(this, (C86610af) this.f234028f.mo27525b(), false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo80246l() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f234021E == null) {
            int i = 0;
            C86775r rVar = null;
            for (int i2 = 0; i2 < this.f234024b.size(); i2++) {
                C86775r rVar2 = (C86775r) this.f234024b.valueAt(i2);
                if (!mo80254t(rVar2) && rVar2.f234394p && !rVar2.f234393o && (rVar == null || rVar2.f234395q > rVar.f234395q)) {
                    rVar = rVar2;
                }
            }
            if (rVar == null || !mo80255u(rVar)) {
                while (i < this.f234024b.size()) {
                    C86775r rVar3 = (C86775r) this.f234024b.valueAt(i);
                    if (mo80254t(rVar3) || rVar3.f234393o || !mo80255u(rVar3)) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo80247m() {
        C60856cj.m92911t(((C86749a) this.f234038p.mo27525b()).mo80361b("service"), new C86624at(this), C60826bg.f164896a);
        this.f234022F = this.f234019C.mo77944g(C118569b.SEARCH_SERVICE_LIFETIME_SECS, C118575h.SEARCH_SERVICE_LIFETIME).mo104019a();
        if (this.f234043u.getBoolean("service_created", false)) {
            C59104x b = f234016a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SearchServiceCore");
            ((C59052c) ((C59052c) b).mo56372aa(8429)).mo56386p("We were killed and are starting back!");
            C89949q.m146523g(257);
        }
        this.f234043u.edit().putBoolean("service_created", true).apply();
        this.f234044v.mo85301a(this.f234045w);
        this.f234045w.mo80265b(this);
        this.f234026d.mo28212l("SearchServiceCore [onCreateEventBus]", new C86617am(this));
        this.f234042t.mo28212l("Maybe Reset Consecutive Crash Count", new C86618an(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo80248n(C86775r rVar, boolean z) {
        C58836b bVar;
        C58836b bVar2;
        C86775r rVar2 = rVar;
        C86669cg cgVar = (C86669cg) this.f234033k.mo27525b();
        long j = rVar2.f234389k;
        C58976aa aaVar = C58975e.f156826a;
        C58334be beVar = cgVar.f234141e;
        Long valueOf = Long.valueOf(j);
        C86684f fVar = (C86684f) beVar.get(valueOf);
        boolean z2 = true;
        if (fVar == null) {
            String str = rVar2.f234384f.f236953f;
            if (j != 0) {
                if (!z) {
                    C59104x d = C86669cg.f234137a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SessionLifecycleManager");
                    ((C59052c) ((C59052c) d).mo56372aa(8477)).mo56386p("Handover failed. Creating new session controller.");
                }
                C86684f b = cgVar.mo80268b(j, str);
                C88431bb e = rVar.mo80383e();
                if (!cgVar.f234139c.mo56113h() || "search".equals(str) || z) {
                    bVar2 = C58836b.f156633a;
                } else {
                    if (((C86680a) ((C68214a) cgVar.f234139c.mo56107c()).mo27525b()).mo80287d(j)) {
                        bVar = ((C86680a) ((C68214a) cgVar.f234139c.mo56107c()).mo27525b()).mo80284a(j);
                    } else {
                        C90476a aVar = C91018d.f254254a;
                        bVar = ((C86680a) ((C68214a) cgVar.f234139c.mo56107c()).mo27525b()).mo80284a(j);
                    }
                    if (!bVar.mo56113h()) {
                        bVar2 = C58836b.f156633a;
                    } else {
                        C88433bd bdVar = (C88433bd) bVar.mo56107c();
                        if (!str.equals(bdVar.f239092d)) {
                            C59104x d2 = C86669cg.f234137a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "SessionLifecycleManager");
                            ((C59052c) ((C59052c) d2).mo56372aa(8465)).mo56359L("readSessionData(): session types mismatch. Expected '%s' and found '%s'. [sessionId] = [%d]", str, bdVar.f239092d, valueOf);
                            bVar2 = C58836b.f156633a;
                        }
                        cgVar.mo80276k(b, j, e, bVar, cgVar.mo80277l(rVar2));
                        fVar = b;
                    }
                }
                bVar = bVar2;
                cgVar.mo80276k(b, j, e, bVar, cgVar.mo80277l(rVar2));
                fVar = b;
            } else {
                C58838bb.m90883r(!z);
                long a = cgVar.mo80267a();
                C86684f b2 = cgVar.mo80268b(a, str);
                long j2 = a;
                cgVar.mo80276k(b2, a, rVar.mo80383e(), C58836b.f156633a, cgVar.mo80277l(rVar2));
                if (rVar2.f234389k != 0 && !"search".equals(rVar2.f234384f.f236953f)) {
                    z2 = false;
                }
                C58838bb.m90883r(z2);
                rVar2.f234389k = j2;
                fVar = b2;
            }
        } else {
            if (z && Math.abs(j - cgVar.mo80267a()) < 100) {
                ((C89911f) cgVar.f234140d.mo27525b()).mo83755a((Throwable) null, 140580984, 29).mo83721a();
            }
            C58838bb.m90884s(!z, "Cannot reuse SessionContainer for newly generated Session ID.");
            C58838bb.m90884s(fVar.f234163f.equals(rVar2.f234384f.f236953f), "Cannot reuse SessionContainer with wrong session type");
        }
        C86684f fVar2 = rVar2.f234397s;
        if (!(fVar2 == null || fVar2 == fVar)) {
            String str2 = rVar2.f234384f.f236953f;
            if (str2.equals("search") || str2.equals("clockwork") || str2.equals("opa") || str2.equals("lens") || str2.equals("monet") || str2.equals("monet_multi_client") || str2.equals("now_stream") || str2.equals("quartz") || str2.equals("voice_access") || str2.equals("deeplink") || str2.equals("customtabs") || str2.equals("now_opt_in") || str2.equals("car_assistant") || str2.equals("rss_gmm_commute_update")) {
                cgVar.mo80270e(rVar2, fVar2);
            } else {
                C59104x c = C86669cg.f234137a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SessionLifecycleManager");
                ((C59052c) ((C59052c) c).mo56372aa(8478)).mo56351D("Trying to override already set SessionContainer (sessionId: %d, client: %s)", rVar2.f234389k, rVar2);
                throw new IllegalStateException("Trying to override already set SessionContainer for '" + str2 + "' session");
            }
        }
        rVar2.f234397s = fVar;
        if (!cgVar.f234142f.containsValue(fVar)) {
            cgVar.mo80274i(rVar2, fVar);
        }
    }

    /* renamed from: o */
    public final void mo80249o(int i) {
        Context context = this.f234025c;
        if ((context != null && C90772bp.m148283J(context) && i >= 15) || i >= 40) {
            C22871g gVar = this.f234026d;
            C86610af afVar = (C86610af) this.f234028f.mo27525b();
            Objects.requireNonNull(afVar);
            gVar.mo28212l("SearchController.onTrimMemory", new C86615ak(afVar));
        }
        Context context2 = this.f234025c;
        if ((context2 != null && C90772bp.m148283J(context2) && i >= 20) || i >= 60 || (i >= 10 && i <= 15)) {
            this.f234039q = i;
            this.f234026d.mo28212l("setMemoryTrimLevel", new C86616al(this));
            ((C86749a) this.f234038p.mo27525b()).mo80363e();
        }
        if (i == 20 || i == 40) {
            C84390b bVar = (C84390b) this.f234046x.mo27525b();
            if (bVar != null) {
                bVar.mo77951c();
            }
            ((C84385b) this.f234020D.mo27525b()).mo77948c();
        }
    }

    /* renamed from: p */
    public final void mo80250p() {
        this.f234026d.mo28212l("SearchServiceCore [pingClients]", new C86619ao(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo80251q(C86625au auVar) {
        auVar.mo80235b(this, (C86610af) this.f234028f.mo27525b(), true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo80252r() {
        int i = 0;
        while (i < this.f234024b.size()) {
            C86775r rVar = (C86775r) this.f234024b.valueAt(i);
            if (!rVar.f234383e.f234370a.asBinder().pingBinder()) {
                rVar.f234383e.mo80381e();
                this.f234024b.removeAt(i);
            } else {
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo80253s(long j, long j2, Bundle bundle, C88431bb bbVar) {
        boolean z;
        C86775r rVar = (C86775r) this.f234024b.get(j);
        if (rVar == this.f234021E) {
            C59104x d = f234016a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchServiceCore");
            ((C59052c) ((C59052c) d).mo56372aa(8434)).mo56386p("Attempting to re-start already active client.");
        }
        if (rVar != null) {
            boolean z2 = false;
            if (!bbVar.equals(C88431bb.f239082a) && j2 != 1) {
                if (j2 == 0) {
                    j2 = 0;
                } else {
                    z = false;
                    C58838bb.m90884s(z, "SessionContext can only be provided when you are starting a fresh session");
                    rVar.f234392n = true;
                    rVar.f234388j = j2;
                    rVar.f234390l = bundle;
                    rVar.f234391m = bbVar;
                    C58976aa aaVar = C58975e.f156826a;
                    long j3 = rVar.f234389k;
                    if (j2 == 1 || j2 == 100) {
                        z2 = true;
                    }
                    mo80248n(rVar, z2);
                    mo80240f(rVar);
                }
            }
            z = true;
            C58838bb.m90884s(z, "SessionContext can only be provided when you are starting a fresh session");
            rVar.f234392n = true;
            rVar.f234388j = j2;
            rVar.f234390l = bundle;
            rVar.f234391m = bbVar;
            C58976aa aaVar2 = C58975e.f156826a;
            long j32 = rVar.f234389k;
            z2 = true;
            mo80248n(rVar, z2);
            mo80240f(rVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo80254t(C86775r rVar) {
        return ((C86682d) this.f234048z.mo27525b()).mo80288a(rVar.f234384f.f236953f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo80255u(C86775r rVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!rVar.f234392n || this.f234024b.get(rVar.f234381c) != rVar) {
            C59104x d = f234016a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchServiceCore");
            ((C59052c) ((C59052c) d).mo56372aa(8436)).mo56386p("Abort, client detached.");
            return false;
        }
        C86775r rVar2 = this.f234021E;
        if (rVar != rVar2) {
            C86684f fVar = rVar2 != null ? rVar2.f234397s : null;
            if (this.f234027e.mo79746e(C90071dw.f249758c)) {
                C58833ax k = (rVar2 == null || rVar == null || (this.f234035m.mo56113h() && ((C74720bx) this.f234035m.mo56107c()).mo71089f().b())) ? C58836b.f156633a : (!rVar2.f234384f.mo81899q() || !rVar.f234384f.mo81904u() || !rVar.f234384f.mo81910z()) ? (!rVar.f234384f.mo81899q() || !rVar2.f234384f.mo81904u() || !rVar2.f234384f.mo81910z()) ? C58836b.f156633a : C58833ax.m90834k(rVar2) : C58833ax.m90834k(rVar);
                if (k.mo56113h()) {
                    C59104x d2 = f234016a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "SearchServiceCore");
                    ((C59052c) ((C59052c) d2).mo56372aa(8440)).mo56386p("Suppress Opa UI client, because bisto client has higher priority.");
                    ((C86775r) k.mo56107c()).f234383e.mo80379b(new C87684al(C88244um.GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION).mo81964a());
                    if (!((C86775r) k.mo56107c()).equals(rVar)) {
                        return true;
                    }
                    return false;
                }
            }
            if (!(rVar2 == null || fVar == null)) {
                if (!fVar.f234158a.mo80298k(rVar2.f234384f, rVar.f234384f)) {
                    C59104x d3 = f234016a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "SearchServiceCore");
                    ((C59052c) ((C59052c) d3).mo56372aa(8439)).mo56386p("Abort, client has too low priority.");
                    return false;
                }
            }
            if (rVar.f234392n) {
                C86775r rVar3 = this.f234021E;
                if (rVar3 != null) {
                    ((C86669cg) this.f234033k.mo27525b()).mo80272g(rVar3);
                }
                this.f234021E = rVar;
                ((C86669cg) this.f234033k.mo27525b()).mo80271f(rVar);
                ((C86610af) this.f234028f.mo27525b()).mo80226g(this.f234021E);
            } else {
                C59104x c = f234016a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SearchServiceCore");
                ((C59052c) ((C59052c) c).mo56372aa(8411)).mo56389s("Trying to activate client, %s and it is not started", rVar);
            }
        }
        return true;
    }
}
