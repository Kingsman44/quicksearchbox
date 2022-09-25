package com.google.android.apps.gsa.search.core.state;

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

/* renamed from: com.google.android.apps.gsa.search.core.state.hu */
/* compiled from: PG */
public final class C87126hu extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235391a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.hu");

    /* renamed from: b */
    public final C68214a f235392b;

    /* renamed from: c */
    public final C68214a f235393c;

    /* renamed from: d */
    public final C84691a f235394d;

    /* renamed from: e */
    public final C86124t f235395e;

    /* renamed from: f */
    public long f235396f;

    /* renamed from: g */
    public int f235397g;

    /* renamed from: h */
    public boolean f235398h;

    /* renamed from: i */
    private final C68214a f235399i;

    /* renamed from: j */
    private final C68214a f235400j;

    /* renamed from: k */
    private final C68214a f235401k;

    /* renamed from: l */
    private final C68214a f235402l;

    /* renamed from: m */
    private final C84516aa f235403m;

    /* renamed from: n */
    private final C86127w f235404n;

    /* renamed from: o */
    private final C22871g f235405o;

    /* renamed from: p */
    private final C85393a f235406p;

    /* renamed from: q */
    private int f235407q;

    /* renamed from: r */
    private Query f235408r;

    /* renamed from: s */
    private boolean f235409s;

    public C87126hu(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C84691a aVar8, C86124t tVar, C84516aa aaVar, C86127w wVar, C22871g gVar, C85393a aVar9) {
        super(aVar, 64);
        this.f235399i = aVar2;
        this.f235392b = aVar3;
        this.f235400j = aVar4;
        this.f235401k = aVar5;
        this.f235402l = aVar6;
        this.f235393c = aVar7;
        this.f235394d = aVar8;
        this.f235395e = tVar;
        this.f235403m = aaVar;
        this.f235404n = wVar;
        this.f235405o = gVar;
        this.f235406p = aVar9;
    }

    /* renamed from: m */
    private final int m140791m(Query query, C87171z zVar) {
        boolean z = false;
        if (!query.mo84438dS()) {
            return !query.mo84467du() ? 0 : 6;
        }
        if (zVar.mo80807f() == null && this.f235404n.f232790a.mo79722a().getBoolean("hotword_from_lock_screen", false) && this.f235403m.mo78230d()) {
            boolean isDeviceLocked = this.f235403m.f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
            if (isDeviceLocked) {
                z = true;
            }
        }
        this.f235409s = z;
        return 6;
    }

    /* renamed from: n */
    private final Map m140792n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mActivityToSwitchToForResults", Integer.valueOf(this.f235407q));
        linkedHashMap.put("mUiToLaunchForVoiceSearch", Integer.valueOf(this.f235397g));
        return linkedHashMap;
    }

    /* renamed from: e */
    public final boolean mo80746e(C86842bk... bkVarArr) {
        for (C86842bk bkVar : bkVarArr) {
            if (bkVar.f234552a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (true != r8.mo81138R(512)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d1 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80747g(com.google.android.apps.gsa.search.core.state.C87171z r7, com.google.android.apps.gsa.search.core.state.C86893co r8, com.google.android.apps.gsa.search.core.state.C87052fn r9) {
        /*
            r6 = this;
            com.google.android.apps.gsa.shared.search.Query r9 = r9.f235177m
            boolean r0 = r6.mo80750j(r9)
            r1 = 1
            r2 = 6
            r3 = 0
            if (r0 != 0) goto L_0x000e
        L_0x000b:
            r7 = 0
            goto L_0x00b2
        L_0x000e:
            boolean r0 = r9.mo84410cq()
            if (r0 == 0) goto L_0x0015
            goto L_0x000b
        L_0x0015:
            com.google.android.apps.gsa.search.shared.actions.SearchError r8 = r8.f234656d
            if (r8 == 0) goto L_0x0024
            r4 = 512(0x200, double:2.53E-321)
            boolean r7 = r8.mo81138R(r4)
            if (r1 == r7) goto L_0x000b
        L_0x0021:
            r7 = 6
            goto L_0x00b2
        L_0x0024:
            boolean r8 = r9.mo84337bV()
            if (r8 == 0) goto L_0x002b
            goto L_0x000b
        L_0x002b:
            boolean r8 = r9.mo84420dA()
            java.lang.String r0 = "and.opa"
            if (r8 != 0) goto L_0x005b
            java.lang.String r8 = r9.mo84355bn()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x003e
            goto L_0x005b
        L_0x003e:
            boolean r8 = r9.mo84391cX()
            if (r8 == 0) goto L_0x004a
            int r7 = r6.m140791m(r9, r7)
            goto L_0x00b2
        L_0x004a:
            boolean r8 = r9.mo84468dv()
            if (r8 == 0) goto L_0x000b
            boolean r8 = r7.mo80781M(r9)
            if (r8 == 0) goto L_0x000b
            int r7 = r6.m140791m(r9, r7)
            goto L_0x00b2
        L_0x005b:
            boolean r8 = r7.mo80781M(r9)
            if (r8 == 0) goto L_0x000b
            com.google.android.apps.gsa.search.shared.actions.ActionData r8 = r7.f235555j
            if (r8 == 0) goto L_0x0070
            boolean r8 = r8.mo81098i()
            if (r8 == 0) goto L_0x0070
            int r7 = r6.m140791m(r9, r7)
            goto L_0x00b2
        L_0x0070:
            boolean r8 = r7.mo80791X()
            if (r8 != 0) goto L_0x0077
            goto L_0x000b
        L_0x0077:
            boolean r8 = r7.mo80784Q()
            if (r8 != 0) goto L_0x0082
            int r7 = r6.m140791m(r9, r7)
            goto L_0x00b2
        L_0x0082:
            com.google.android.apps.gsa.search.core.aj.aa r8 = r6.f235403m
            boolean r8 = r8.mo78228b()
            if (r8 != 0) goto L_0x0092
            boolean r8 = r7.mo80797ac()
            if (r8 == 0) goto L_0x0092
            goto L_0x000b
        L_0x0092:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r8 = r7.mo80807f()
            if (r8 == 0) goto L_0x00a0
            boolean r8 = r8.mo81080s()
            if (r8 == 0) goto L_0x00a0
            goto L_0x000b
        L_0x00a0:
            java.lang.String r8 = r9.mo84355bn()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0021
            boolean r7 = r7.mo80779K(r9)
            if (r7 == 0) goto L_0x0021
            r7 = 9
        L_0x00b2:
            int r8 = r6.f235407q
            if (r7 == r8) goto L_0x00d1
            r6.f235407q = r7
            r6.f235408r = r9
            boolean r7 = r6.mo80751k()
            if (r7 == 0) goto L_0x00c9
            int r7 = r6.f235407q
            if (r7 != r2) goto L_0x00c9
            com.google.android.apps.gsa.search.core.al.dm.a r7 = r6.f235406p
            r7.mo78918c()
        L_0x00c9:
            int r7 = r6.f235407q
            if (r7 == 0) goto L_0x00ce
            r3 = 1
        L_0x00ce:
            r6.f235398h = r3
            return r1
        L_0x00d1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87126hu.mo80747g(com.google.android.apps.gsa.search.core.state.z, com.google.android.apps.gsa.search.core.state.co, com.google.android.apps.gsa.search.core.state.fn):boolean");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("UiLaunchState");
        for (Map.Entry entry : m140792n().entrySet()) {
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
        if (str.equals("hotword_from_lock_screen") && mo80747g((C87171z) this.f235399i.mo27525b(), (C86893co) this.f235402l.mo27525b(), (C87052fn) this.f235393c.mo27525b())) {
            mo80591ar();
        }
    }

    /* renamed from: ho */
    public final void mo80748ho() {
        if (((C86815al) this.f235401k.mo27525b()).f234493a == ((C86792g) this.f235400j.mo27525b()).mo80447f().mo81991a()) {
            int i = this.f235397g;
            if (i != 0) {
                this.f235397g = 0;
            } else {
                i = 0;
            }
            if (i != 0) {
                this.f235406p.mo78917b(i, ((C87052fn) this.f235393c.mo27525b()).f235177m, ((C86815al) this.f235401k.mo27525b()).f234493a);
            } else if (mo80751k() && this.f235398h) {
                this.f235398h = false;
                new C90873ag(this.f235406p.mo78916a(((C86812ai) this.f235392b.mo27525b()).f234471a, this.f235407q, ((C87052fn) this.f235393c.mo27525b()).f235177m, ((C86815al) this.f235401k.mo27525b()).f234493a, this.f235407q == 6 && this.f235409s), this.f235405o, "Switch to results activity.", new C87124hs(this, this.f235408r)).mo85223a(new C87125ht(this));
            }
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"hotword_from_lock_screen"};
    }

    /* renamed from: i */
    public final boolean mo80749i() {
        return ((C86812ai) this.f235392b.mo27525b()).f234471a.mo81876F();
    }

    /* renamed from: j */
    public final boolean mo80750j(Query query) {
        ClientConfig clientConfig = ((C86812ai) this.f235392b.mo27525b()).f234471a;
        if (!clientConfig.mo81877G()) {
            return false;
        }
        if (!"and.opa".equals(query.mo84355bn()) || !((C87171z) this.f235399i.mo27525b()).mo80779K(query)) {
            if (query.mo84392cY() && query.mo84339bX()) {
                return true;
            }
            if (!C91101a.m148849a(((C86812ai) this.f235392b.mo27525b()).f234471a) && query.mo84438dS()) {
                return true;
            }
            return false;
        } else if (!clientConfig.mo81904u()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo80751k() {
        if (this.f235408r != ((C87052fn) this.f235393c.mo27525b()).f235177m && mo80747g((C87171z) this.f235399i.mo27525b(), (C86893co) this.f235402l.mo27525b(), (C87052fn) this.f235393c.mo27525b())) {
            mo80591ar();
        }
        return this.f235407q != 0;
    }

    public final String toString() {
        String obj = m140792n().toString();
        return "UiLaunchState(state=" + obj + ")";
    }
}
