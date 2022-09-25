package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95697c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94636a;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94638b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94644h;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae */
/* compiled from: PG */
public abstract class C95515ae extends C94636a {

    /* renamed from: c */
    private boolean f267273c;

    /* renamed from: d */
    private boolean f267274d;

    /* renamed from: e */
    private int f267275e = 0;

    /* renamed from: j */
    public final C95706l f267276j;

    /* renamed from: k */
    public final C60237lk f267277k;

    /* renamed from: l */
    public boolean f267278l;

    /* renamed from: m */
    public C95516af f267279m;

    public C95515ae(C95307m mVar, C21370a aVar, C95706l lVar) {
        super(mVar, aVar);
        this.f267276j = lVar;
        this.f267277k = super.mo88569c();
    }

    /* renamed from: A */
    private final void m157972A(int i) {
        for (C90421b bVar : mo89414r()) {
            C95706l lVar = this.f267276j;
            C95516af afVar = this.f267279m;
            boolean z = false;
            if (afVar != null && afVar.f267286g) {
                z = true;
            }
            lVar.mo89661c(bVar, i, z);
        }
    }

    /* renamed from: T */
    static String m157973T(List list) {
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C90421b) it.next()).f252584e;
            if (str2 == null) {
                return null;
            }
            if (str == null) {
                str = str2;
            } else if (!str.equals(str2)) {
                return null;
            }
        }
        return str;
    }

    /* renamed from: C */
    public boolean mo89399C() {
        return false;
    }

    /* renamed from: D */
    public boolean mo89400D() {
        return false;
    }

    /* renamed from: G */
    public boolean mo89401G() {
        return false;
    }

    /* renamed from: K */
    public Integer mo89402K() {
        return null;
    }

    /* renamed from: L */
    public String mo89403L() {
        if (!mo89405R()) {
            return BuildConfig.FLAVOR;
        }
        this.f264705a.mo83544b("Message must yield a sender/group name.");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: Q */
    public boolean mo89404Q() {
        return false;
    }

    /* renamed from: R */
    public boolean mo89405R() {
        return false;
    }

    /* renamed from: U */
    public final void mo89406U(C95285o oVar, C95284n nVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            this.f264705a.mo83544b("Playback settings not set yet!");
            nVar.mo88601a();
            return;
        }
        int i = this.f267275e;
        if (i == 4) {
            this.f264705a.mo83544b("Already at the final stage.");
            nVar.mo88601a();
            return;
        }
        boolean z = true;
        int i2 = i + 1;
        this.f267275e = i2;
        if (i2 == 1) {
            Uri p = mo89412p();
            if (p != null || !mo89399C()) {
                z = false;
            }
            if (!afVar.f267280a || (p == null && !z)) {
                C58976aa aaVar = C58975e.f156826a;
                mo89406U(oVar, nVar);
            } else if (p == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                C95311q.m157570d(this.f267277k, oVar.mo89202b(4, new C95514ad(this, oVar, nVar)));
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                C95311q.m157570d(this.f267277k, oVar.mo89204d(p, new C95511aa(this, oVar, nVar)));
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                C58976aa aaVar4 = C58975e.f156826a;
                m157972A(mo89411o());
                mo89407V();
                this.f267273c = false;
                nVar.mo88601a();
            } else if (!afVar.f267284e || mo89402K() == null) {
                C58976aa aaVar5 = C58975e.f156826a;
                mo89406U(oVar, nVar);
            } else {
                C58976aa aaVar6 = C58975e.f156826a;
                Integer K = mo89402K();
                if (K == null) {
                    this.f264705a.mo83544b("No action window");
                    nVar.mo88601a();
                    return;
                }
                C94644h.m156133b(K.intValue(), oVar, new C95513ac(this, oVar, nVar));
            }
        } else if (afVar.f267281b || afVar.f267282c || afVar.f267283d) {
            C58976aa aaVar7 = C58975e.f156826a;
            mo89415s(oVar, new C95512ab(this, oVar, nVar));
        } else {
            C58976aa aaVar8 = C58975e.f156826a;
            mo89406U(oVar, nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo89407V() {
        if (this.f267274d || !mo89417u()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!mo89418v()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            this.f267274d = true;
            Context context = this.f267276j.f267947e;
            for (C90421b bVar : mo89414r()) {
                Intent intent = bVar.f252590k;
                if (intent != null) {
                    if (context.getPackageManager().resolveService(intent, 0) != null) {
                        context.startService(intent);
                    } else {
                        context.sendBroadcast(intent);
                    }
                }
            }
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* renamed from: W */
    public final void mo89408W(C95516af afVar) {
        if (mo89410Y()) {
            this.f264705a.mo83544b("Already set!");
        } else {
            this.f267279m = afVar;
        }
    }

    /* renamed from: Y */
    public final boolean mo89410Y() {
        return this.f267279m != null;
    }

    /* renamed from: a */
    public final C94638b mo88567a() {
        if (!mo88576j()) {
            return new C94638b(false, false, false);
        }
        this.f267273c = false;
        this.f267275e = 0;
        this.f267279m = C95516af.m158009a(mo89405R(), mo89404Q(), false);
        m157972A(11);
        return new C94638b(true, true, true);
    }

    /* renamed from: b */
    public C94639c mo88568b(C95455a aVar, C95065ab abVar, Runnable runnable) {
        if (!mo88577k()) {
            return new C94639c(false, false);
        }
        this.f267273c = false;
        m157972A(mo89411o());
        return new C94639c(true, false);
    }

    /* renamed from: c */
    public final C60237lk mo88569c() {
        return this.f267277k;
    }

    /* renamed from: d */
    public final String mo88570d() {
        String str = null;
        for (C90421b bVar : mo89414r()) {
            if (str == null) {
                str = bVar.mo84145c();
            } else if (!str.equals(bVar.mo84145c())) {
                return null;
            }
        }
        return str;
    }

    /* renamed from: f */
    public final void mo88572f(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            mo88573g(true);
        } else {
            m157972A(8);
        }
    }

    /* renamed from: g */
    public final void mo88573g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f267273c = false;
        if (mo89405R() && z && mo89413q() != null) {
            C95706l lVar = this.f267276j;
            lVar.f267948f.mo89592o(new C95697c(lVar, mo89413q()));
        }
        C60237lk lkVar = this.f267277k;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 4194304;
        loVar.f162999r = z;
        m157972A(7);
    }

    /* renamed from: i */
    public final void mo88575i() {
        if (this.f267273c) {
            C58976aa aaVar = C58975e.f156826a;
            m157972A(6);
        }
        this.f267273c = false;
    }

    /* renamed from: j */
    public boolean mo88576j() {
        C95516af afVar = this.f267279m;
        return afVar != null && !afVar.f267282c;
    }

    /* renamed from: l */
    public final boolean mo88578l(C94647k kVar, C94637a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f267279m != null) {
            return mo89416t(kVar, aVar);
        }
        this.f264705a.mo83544b("Playback settings not set yet!");
        aVar.mo88580a(false);
        return false;
    }

    /* renamed from: m */
    public boolean mo88579m() {
        if (!mo88577k()) {
            return false;
        }
        this.f267273c = false;
        m157972A(mo89411o());
        return true;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        Integer num;
        if (this.f267273c) {
            this.f264705a.mo83544b("Can't reset when currently delivering!");
            nVar.mo88601a();
            return;
        }
        this.f267273c = true;
        C58976aa aaVar = C58975e.f156826a;
        if (!mo89422z()) {
            C60237lk lkVar = this.f267277k;
            C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
            String x = mo89420x();
            npVar.copyOnWrite();
            C60305nr nrVar = (C60305nr) npVar.instance;
            x.getClass();
            nrVar.f163181a |= 2;
            nrVar.f163183c = x;
            String y = mo89421y();
            npVar.copyOnWrite();
            C60305nr nrVar2 = (C60305nr) npVar.instance;
            y.getClass();
            nrVar2.f163181a |= 4;
            nrVar2.f163184d = y;
            lkVar.mo57078b((C60305nr) npVar.build());
        }
        String T = m157973T(mo89414r());
        if (T != null) {
            C60237lk lkVar2 = this.f267277k;
            lkVar2.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar2.instance;
            C60241lo loVar2 = C60241lo.f162980w;
            loVar.f162982a |= 128;
            loVar.f162988g = T;
        }
        C60237lk lkVar3 = this.f267277k;
        lkVar3.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar3.instance;
        C60241lo loVar4 = C60241lo.f162980w;
        loVar3.f162982a |= 2048;
        loVar3.f162990i = mo89401G();
        for (C90421b bVar : mo89414r()) {
            C90433n nVar2 = bVar.f252594o;
            if (nVar2 != null && nVar2.mo84172g()) {
                this.f264705a.mo83544b("Notification is already playing: ".concat(String.valueOf(String.valueOf(bVar))));
            }
        }
        int i = C95873a.f268446a;
        C60305nr nrVar3 = ((C60241lo) this.f267277k.instance).f162987f;
        if (nrVar3 == null) {
            nrVar3 = C60305nr.f163179e;
        }
        if ((nrVar3.f163181a & 2) != 0) {
            C95307m mVar = this.f264705a;
            C60305nr nrVar4 = ((C60241lo) this.f267277k.instance).f162987f;
            if (nrVar4 == null) {
                nrVar4 = C60305nr.f163179e;
            }
            String str = nrVar4.f163183c;
            long c = mVar.f266680a.mo26871c();
            Long l = (Long) C95311q.f266691a.get(str);
            if (l == null) {
                num = null;
            } else {
                num = Integer.valueOf((int) (c - l.longValue()));
            }
            if (num != null) {
                C60237lk lkVar4 = this.f267277k;
                int intValue = num.intValue();
                lkVar4.copyOnWrite();
                C60241lo loVar5 = (C60241lo) lkVar4.instance;
                loVar5.f162982a |= 1024;
                loVar5.f162989h = intValue;
            }
            C95307m mVar2 = this.f264705a;
            C60305nr nrVar5 = ((C60241lo) this.f267277k.instance).f162987f;
            if (nrVar5 == null) {
                nrVar5 = C60305nr.f163179e;
            }
            C95311q.f266691a.put(nrVar5.f163183c, Long.valueOf(mVar2.f266680a.mo26871c()));
        }
        m157972A(2);
        this.f267275e = 0;
        mo89406U(oVar, nVar);
    }

    /* renamed from: o */
    public abstract int mo89411o();

    /* renamed from: p */
    public Uri mo89412p() {
        return null;
    }

    /* renamed from: q */
    public C90427h mo89413q() {
        return null;
    }

    /* renamed from: r */
    public abstract List mo89414r();

    /* renamed from: s */
    public abstract void mo89415s(C95285o oVar, C95284n nVar);

    /* renamed from: t */
    public abstract boolean mo89416t(C94647k kVar, C94637a aVar);

    /* renamed from: u */
    public boolean mo89417u() {
        return true;
    }

    /* renamed from: v */
    public abstract boolean mo89418v();

    /* renamed from: w */
    public abstract boolean mo89419w();

    /* renamed from: x */
    public String mo89420x() {
        List r = mo89414r();
        if (!r.isEmpty()) {
            return ((C90421b) r.get(0)).f252581b;
        }
        this.f264705a.mo83544b("Empty notification list!");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: y */
    public String mo89421y() {
        List r = mo89414r();
        if (!r.isEmpty()) {
            return ((C90421b) r.get(0)).f252591l;
        }
        this.f264705a.mo83544b("Empty notification list!");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: z */
    public boolean mo89422z() {
        return false;
    }

    /* renamed from: X */
    public final void mo89409X(boolean z, boolean z2) {
        if (mo89422z()) {
            if (!z) {
                this.f264705a.mo83544b("Shouldn't have bundles for interruptive playback.");
            }
            C58976aa aaVar = C58975e.f156826a;
            mo89408W(new C95516af(false, true, false, true, true, false, false, false));
        } else if (this.f267278l) {
            C58976aa aaVar2 = C58975e.f156826a;
            mo89408W(new C95516af(false, true, true, true, true, false, true, false));
        } else if (z) {
            C58976aa aaVar3 = C58975e.f156826a;
            mo89408W(new C95516af(false, true, true, true, true, false, false, false));
        } else {
            for (C90421b bVar : mo89414r()) {
                C90433n nVar = bVar.f252594o;
                if (nVar != null) {
                    Integer num = nVar.f252643c;
                    if (nVar.mo84173i() && num != null && num.intValue() == 0) {
                        boolean G = mo89401G();
                        boolean Q = mo89404Q();
                        C58976aa aaVar4 = C58975e.f156826a;
                        mo89408W(new C95516af(G || !Q, G || !Q, true, true, true, false, false, true));
                        return;
                    }
                }
            }
            C58976aa aaVar5 = C58975e.f156826a;
            mo89408W(new C95516af(true, true, false, z2, false, false, false, true));
        }
    }
}
