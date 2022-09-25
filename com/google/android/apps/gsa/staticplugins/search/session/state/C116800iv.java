package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.p6519al.p6713dm.C85393a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7186u.C91101a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.iv */
/* compiled from: PG */
public final class C116800iv extends C116780ib {

    /* renamed from: a */
    public static final C59071e f324047a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.iv");

    /* renamed from: b */
    public final C68214a f324048b;

    /* renamed from: c */
    public final C68214a f324049c;

    /* renamed from: d */
    public final C84691a f324050d;

    /* renamed from: e */
    public long f324051e;

    /* renamed from: f */
    public int f324052f;

    /* renamed from: g */
    public boolean f324053g;

    /* renamed from: h */
    private final C68214a f324054h;

    /* renamed from: i */
    private final C68214a f324055i;

    /* renamed from: j */
    private final C68214a f324056j;

    /* renamed from: k */
    private final C68214a f324057k;

    /* renamed from: l */
    private final C68214a f324058l;

    /* renamed from: m */
    private final C86124t f324059m;

    /* renamed from: n */
    private final C84516aa f324060n;

    /* renamed from: o */
    private final C86127w f324061o;

    /* renamed from: p */
    private final C22871g f324062p;

    /* renamed from: q */
    private final C85393a f324063q;

    /* renamed from: r */
    private int f324064r;

    /* renamed from: s */
    private Query f324065s;

    /* renamed from: t */
    private boolean f324066t;

    public C116800iv(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C84691a aVar9, C86124t tVar, C84516aa aaVar, C86127w wVar, C22871g gVar, C85393a aVar10) {
        super(aVar, 169);
        this.f324054h = aVar2;
        this.f324048b = aVar3;
        this.f324055i = aVar4;
        this.f324056j = aVar5;
        this.f324057k = aVar6;
        this.f324058l = aVar7;
        this.f324049c = aVar8;
        this.f324050d = aVar9;
        this.f324059m = tVar;
        this.f324060n = aaVar;
        this.f324061o = wVar;
        this.f324062p = gVar;
        this.f324063q = aVar10;
    }

    /* renamed from: k */
    private final int m193965k(Query query, C116836z zVar) {
        boolean z = false;
        if (!query.mo84438dS()) {
            return !query.mo84467du() ? 0 : 6;
        }
        if (zVar.mo80807f() != null || !this.f324061o.f232790a.mo79722a().getBoolean("hotword_from_lock_screen", false)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            if (this.f324060n.mo78230d()) {
                boolean isDeviceLocked = this.f324060n.f230023b.isDeviceLocked();
                C58976aa aaVar2 = C58975e.f156826a;
                if (isDeviceLocked) {
                    z = true;
                }
            }
            C58976aa aaVar3 = C58975e.f156826a;
        }
        this.f324066t = z;
        return 6;
    }

    /* renamed from: m */
    private final Map m193966m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mActivityToSwitchToForResults", Integer.valueOf(this.f324064r));
        linkedHashMap.put("mUiToLaunchForVoiceSearch", Integer.valueOf(this.f324052f));
        return linkedHashMap;
    }

    /* renamed from: n */
    private static boolean m193967n(C116569ag agVar) {
        return agVar.f323267a.mo81900r() && agVar.f323267a.mo81888f();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013b A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102947e(com.google.android.apps.gsa.staticplugins.search.session.state.C116836z r6, com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag r7, com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv r8, com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk r9) {
        /*
            r5 = this;
            com.google.android.apps.gsa.shared.search.Query r9 = r9.f323784p
            boolean r0 = r5.mo102949i(r9)
            r1 = 6
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = m193967n(r7)
            if (r0 != 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            boolean r0 = r9.mo84410cq()
            if (r0 == 0) goto L_0x001a
        L_0x0017:
            r6 = 0
            goto L_0x010e
        L_0x001a:
            com.google.android.apps.gsa.search.shared.actions.SearchError r8 = r8.f323415e
            if (r8 == 0) goto L_0x0041
            r3 = 512(0x200, double:2.53E-321)
            boolean r6 = r8.mo81138R(r3)
            if (r6 == 0) goto L_0x0029
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x0029:
            dagger.a r6 = r5.f324048b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r6
            com.google.android.apps.gsa.search.shared.service.ClientConfig r6 = r6.f323267a
            boolean r6 = r6.mo81888f()
            if (r6 == 0) goto L_0x003c
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x003c:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x003e:
            r6 = 6
            goto L_0x010e
        L_0x0041:
            boolean r8 = r9.mo84337bV()
            if (r8 == 0) goto L_0x004a
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x004a:
            boolean r8 = r9.mo84418cy()
            if (r8 == 0) goto L_0x0054
            r6 = 10
            goto L_0x010e
        L_0x0054:
            boolean r8 = r9.mo84420dA()
            if (r8 != 0) goto L_0x007c
            boolean r8 = r9.mo84391cX()
            if (r8 == 0) goto L_0x0068
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r6 = r5.m193965k(r9, r6)
            goto L_0x010e
        L_0x0068:
            boolean r8 = r9.mo84468dv()
            if (r8 == 0) goto L_0x0017
            boolean r8 = r6.mo102986P(r9)
            if (r8 == 0) goto L_0x0017
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r6 = r5.m193965k(r9, r6)
            goto L_0x010e
        L_0x007c:
            boolean r8 = r6.mo102986P(r9)
            if (r8 == 0) goto L_0x010a
            com.google.android.apps.gsa.search.shared.actions.ActionData r8 = r6.f324250j
            if (r8 == 0) goto L_0x00cd
            boolean r8 = r8.mo81098i()
            if (r8 == 0) goto L_0x00cd
            com.google.android.apps.gsa.search.core.i.t r8 = r5.f324059m
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250663bH
            boolean r8 = r8.mo79746e(r0)
            if (r8 == 0) goto L_0x00c6
            boolean r8 = r9.mo84438dS()
            if (r8 == 0) goto L_0x00c6
            boolean r8 = r9.mo84420dA()
            if (r8 == 0) goto L_0x00c6
            com.google.android.apps.gsa.search.core.i.t r8 = r5.f324059m
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250705k
            com.google.common.b.gu r8 = r8.mo79745c(r0)
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f324059m
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250636ah
            com.google.common.b.gu r0 = r0.mo79745c(r3)
            boolean r8 = r9.mo84395cb(r8, r0)
            if (r8 != 0) goto L_0x00be
            boolean r8 = r9.mo84461do()
            if (r8 == 0) goto L_0x00c6
        L_0x00be:
            boolean r8 = r9.mo84391cX()
            if (r8 != 0) goto L_0x00c6
            goto L_0x0017
        L_0x00c6:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r6 = r5.m193965k(r9, r6)
            goto L_0x010e
        L_0x00cd:
            boolean r8 = r6.mo102998ac()
            if (r8 != 0) goto L_0x00d7
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x00d7:
            boolean r8 = r6.mo102990U()
            if (r8 != 0) goto L_0x00e4
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r6 = r5.m193965k(r9, r6)
            goto L_0x010e
        L_0x00e4:
            com.google.android.apps.gsa.search.core.aj.aa r8 = r5.f324060n
            boolean r8 = r8.mo78228b()
            if (r8 != 0) goto L_0x00f6
            boolean r8 = r6.mo103003ai()
            if (r8 == 0) goto L_0x00f6
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x00f6:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r6.mo80807f()
            if (r6 == 0) goto L_0x0106
            boolean r6 = r6.mo81080s()
            if (r6 == 0) goto L_0x0106
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x0106:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x003e
        L_0x010a:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0017
        L_0x010e:
            boolean r7 = m193967n(r7)
            if (r7 == 0) goto L_0x0119
            if (r6 == r1) goto L_0x0118
            r6 = 0
            goto L_0x0119
        L_0x0118:
            r6 = 6
        L_0x0119:
            int r7 = r5.f324064r
            if (r6 == r7) goto L_0x013b
            r5.f324064r = r6
            r5.f324065s = r9
            boolean r6 = r5.mo102950j()
            if (r6 == 0) goto L_0x0130
            int r6 = r5.f324064r
            if (r6 != r1) goto L_0x0130
            com.google.android.apps.gsa.search.core.al.dm.a r6 = r5.f324063q
            r6.mo78918c()
        L_0x0130:
            int r6 = r5.f324064r
            r7 = 1
            if (r6 == 0) goto L_0x0136
            r2 = 1
        L_0x0136:
            r5.f324053g = r2
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r7
        L_0x013b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116800iv.mo102947e(com.google.android.apps.gsa.staticplugins.search.session.state.z, com.google.android.apps.gsa.staticplugins.search.session.state.ag, com.google.android.apps.gsa.staticplugins.search.session.state.bv, com.google.android.apps.gsa.staticplugins.search.session.state.gk):boolean");
    }

    /* renamed from: g */
    public final boolean mo102948g() {
        return ((C116569ag) this.f324048b.mo27525b()).f323267a.mo81876F();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("UiLaunchState");
        for (Map.Entry entry : m193966m().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148228b((Boolean) value));
            } else if (value instanceof Number) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148230d((Number) value));
            } else {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148233g(String.valueOf(value)));
            }
        }
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if (str.equals("hotword_from_lock_screen")) {
            C58976aa aaVar = C58975e.f156826a;
            if (mo102947e((C116836z) this.f324054h.mo27525b(), (C116569ag) this.f324048b.mo27525b(), (C116611bv) this.f324057k.mo27525b(), (C116735gk) this.f324049c.mo27525b())) {
                mo80591ar();
            }
        }
    }

    /* renamed from: ho */
    public final void mo80748ho() {
        if (((C116572aj) this.f324056j.mo27525b()).f323290a == ((C86792g) this.f324055i.mo27525b()).mo80447f().mo81991a()) {
            int i = this.f324052f;
            if (i != 0) {
                this.f324052f = 0;
            } else {
                i = 0;
            }
            if (i == 0) {
                C116619cc ccVar = (C116619cc) this.f324058l.mo27525b();
                if (((C116735gk) ccVar.f323431d.mo27525b()).f323784p.mo84383cP(ccVar.f323435h) && !ccVar.f323436i && mo102950j() && this.f324053g) {
                    this.f324053g = false;
                    new C90873ag(this.f324063q.mo78916a(((C116569ag) this.f324048b.mo27525b()).f323267a, this.f324064r, ((C116735gk) this.f324049c.mo27525b()).f323784p, ((C116572aj) this.f324056j.mo27525b()).f323290a, this.f324064r == 6 && this.f324066t), this.f324062p, "Switch to results activity.", new C116798it(this, this.f324065s)).mo85223a(new C116799iu(this));
                    return;
                }
                return;
            }
            this.f324063q.mo78917b(i, ((C116735gk) this.f324049c.mo27525b()).f323784p, ((C116572aj) this.f324056j.mo27525b()).f323290a);
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"hotword_from_lock_screen"};
    }

    /* renamed from: i */
    public final boolean mo102949i(Query query) {
        ClientConfig clientConfig = ((C116569ag) this.f324048b.mo27525b()).f323267a;
        if (!clientConfig.mo81877G()) {
            return false;
        }
        if (query.mo84418cy()) {
            if (!clientConfig.mo81894l()) {
                return true;
            }
            return false;
        } else if (query.mo84392cY() && query.mo84339bX()) {
            return true;
        } else {
            if (!C91101a.m148849a(((C116569ag) this.f324048b.mo27525b()).f323267a) && query.mo84438dS() && !clientConfig.mo81888f()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j */
    public final boolean mo102950j() {
        if (this.f324065s != ((C116735gk) this.f324049c.mo27525b()).f323784p && mo102947e((C116836z) this.f324054h.mo27525b(), (C116569ag) this.f324048b.mo27525b(), (C116611bv) this.f324057k.mo27525b(), (C116735gk) this.f324049c.mo27525b())) {
            mo80591ar();
        }
        return this.f324064r != 0;
    }

    public final String toString() {
        String obj = m193966m().toString();
        return "UiLaunchState(state=" + obj + ")";
    }
}
