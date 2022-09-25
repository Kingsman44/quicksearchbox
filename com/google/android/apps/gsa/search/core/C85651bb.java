package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.C84519ad;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87796dx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87797dy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87798dz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91262b;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.android.apps.search.googleapp.discover.p10211q.C134529a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58598kz;
import com.google.common.p4522b.C58615lp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7697gp;
import com.google.p375ai.p378b.C7699gr;
import com.google.p375ai.p378b.C7700gs;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7887nq;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.bb */
/* compiled from: PG */
public final class C85651bb extends C86052m {

    /* renamed from: l */
    private static final C59071e f231489l = C59071e.m91332i("com.google.android.apps.gsa.search.core.bb");

    /* renamed from: a */
    public final C85653bd f231490a;

    /* renamed from: b */
    public final C86338r f231491b;

    /* renamed from: c */
    public final C68214a f231492c;

    /* renamed from: d */
    public final C21370a f231493d;

    /* renamed from: e */
    public final C86319j f231494e;

    /* renamed from: f */
    public final C68214a f231495f;

    /* renamed from: g */
    public final C91272l f231496g;

    /* renamed from: h */
    public final C86124t f231497h;

    /* renamed from: i */
    public final C68214a f231498i;

    /* renamed from: j */
    public final Set f231499j;

    /* renamed from: k */
    public final C84486a f231500k;

    /* renamed from: m */
    private final C86130z f231501m;

    /* renamed from: n */
    private final C91262b f231502n;

    /* renamed from: o */
    private final C91374d f231503o;

    /* renamed from: p */
    private final C68214a f231504p;

    /* renamed from: q */
    private final C68214a f231505q;

    /* renamed from: r */
    private final C88483e f231506r;

    /* renamed from: s */
    private final C22871g f231507s;

    /* renamed from: t */
    private final C22871g f231508t;

    /* renamed from: u */
    private final C84519ad f231509u;

    /* renamed from: v */
    private final Object f231510v = new Object();

    public C85651bb(C85653bd bdVar, C86338r rVar, C68214a aVar, C21370a aVar2, C68214a aVar3, C86130z zVar, C86319j jVar, C91272l lVar, C86124t tVar, C91262b bVar, C91374d dVar, C68214a aVar4, C68214a aVar5, C68214a aVar6, C88483e eVar, C22871g gVar, C22871g gVar2, C84519ad adVar, C84486a aVar7) {
        C58598kz kzVar = new C58598kz();
        kzVar.mo55627f(C58615lp.WEAK);
        this.f231499j = Collections.newSetFromMap(kzVar.mo55626e());
        this.f231490a = bdVar;
        this.f231491b = rVar;
        this.f231492c = aVar;
        this.f231493d = aVar2;
        this.f231495f = aVar3;
        this.f231501m = zVar;
        this.f231494e = jVar;
        this.f231496g = lVar;
        this.f231497h = tVar;
        this.f231502n = bVar;
        this.f231503o = dVar;
        this.f231504p = aVar4;
        this.f231498i = aVar5;
        this.f231505q = aVar6;
        this.f231506r = eVar;
        this.f231507s = gVar;
        this.f231508t = gVar2;
        this.f231509u = adVar;
        this.f231500k = aVar7;
    }

    /* renamed from: O */
    private static String m137441O(String str) {
        return "now_interest_feed_display_".concat(String.valueOf(str));
    }

    /* renamed from: P */
    private static String m137442P(String str) {
        return "now_interest_feed_display_with_ablation_".concat(String.valueOf(str));
    }

    /* renamed from: Q */
    private final boolean m137443Q(String str) {
        return this.f231490a.mo79173k(str) || mo79137J(str);
    }

    /* renamed from: R */
    private final boolean m137444R(String str) {
        C58485gu l = C58485gu.m89844l(this.f231501m.mo79770k(R.array.domain_whitelist, false));
        int indexOf = str.indexOf(64);
        if (indexOf < 0 || !l.contains(str.substring(indexOf + 1).toLowerCase(Locale.US))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static String m137445k(String str) {
        return "now_interest_feed_ack_".concat(String.valueOf(str));
    }

    /* renamed from: l */
    public static String m137446l(String str) {
        return "now_interest_feed_timestamp_".concat(String.valueOf(str));
    }

    /* renamed from: A */
    public final boolean mo79128A(String str) {
        C7699gr grVar;
        int a;
        if (str != null && !mo79130C(str)) {
            C7661fg j = mo79149j(str);
            C7886np npVar = C7886np.GOOGLE_NOW_AUTO_ACTIVATION_FOR_EXISTING_USERS;
            if (j != null) {
                C7700gs gsVar = j.f26598l;
                if (gsVar == null) {
                    gsVar = C7700gs.f26874c;
                }
                if (gsVar.f26877b.size() != 0) {
                    C7700gs gsVar2 = j.f26598l;
                    if (gsVar2 == null) {
                        gsVar2 = C7700gs.f26874c;
                    }
                    Iterator it = gsVar2.f26877b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            grVar = null;
                            break;
                        }
                        grVar = (C7699gr) it.next();
                        C7887nq nqVar = grVar.f26871b;
                        if (nqVar == null) {
                            nqVar = C7887nq.f27680c;
                        }
                        if ((nqVar.f27682a & 1) != 0) {
                            C7887nq nqVar2 = grVar.f26871b;
                            if (nqVar2 == null) {
                                nqVar2 = C7887nq.f27680c;
                            }
                            if (nqVar2.f27683b == npVar.f27679o) {
                                break;
                            }
                        }
                    }
                    if (grVar == null || (a = C7697gp.m22808a(grVar.f26872c)) == 0 || a != 1) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo79129B(String str) {
        if (str == null || this.f231491b.getInt(C90507o.f253025o.concat(str), 0) == mo79144e()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean mo79130C(String str) {
        if (mo79145f(str) != -1 || mo79160w(str)) {
            return false;
        }
        return !this.f231500k.mo78205l() || !this.f231490a.mo79171i();
    }

    /* renamed from: D */
    public final boolean mo79131D() {
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        if (a == null || mo79145f(a.name) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean mo79132E() {
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        if (a == null) {
            return false;
        }
        return this.f231490a.mo79172j(a.name);
    }

    /* renamed from: F */
    public final boolean mo79133F() {
        return mo79142c(((C86054o) this.f231495f.mo27525b()).mo79659F()) == 1;
    }

    /* renamed from: G */
    public final boolean mo79134G() {
        return mo79161x(((C86054o) this.f231495f.mo27525b()).mo79668a());
    }

    /* renamed from: H */
    public final boolean mo79135H(String str) {
        if (str != null && this.f231497h.mo79746e(C90013bs.f247029m)) {
            int a = this.f231490a.mo79164a(str);
            int a2 = (int) this.f231497h.mo79743a(C90013bs.f247027k);
            if (a == 1) {
                if (!this.f231490a.mo79173k(str) && a2 > 0) {
                    C58976aa aaVar = C58975e.f156826a;
                    mo79152o(str, a2, true);
                    return true;
                }
            } else if (this.f231497h.mo79746e(C90013bs.f247028l)) {
                C58976aa aaVar2 = C58975e.f156826a;
                mo79153p(str);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo79137J(String str) {
        if (str != null && mo79142c(str) == 1 && !this.f231490a.mo79173k(str)) {
            return mo79128A(str);
        }
        return false;
    }

    /* renamed from: K */
    public final boolean mo79138K() {
        String F = ((C86054o) this.f231495f.mo27525b()).mo79659F();
        return F != null && !mo79162y() && m137443Q(F) && this.f231491b.getInt(C90507o.f253028r.concat(F), -1) <= 0;
    }

    /* renamed from: L */
    public final boolean mo79139L() {
        String F = ((C86054o) this.f231495f.mo27525b()).mo79659F();
        if (!this.f231491b.getBoolean(C90507o.f253014d, false) && !m137443Q(F) && (F == null || !mo79160w(F))) {
            int c = mo79142c(F);
            if (F == null || c == 1 || c == 0) {
                int f = mo79145f(F);
                int a = (int) this.f231497h.mo79743a(C90120fr.f250812ad);
                int a2 = (int) this.f231497h.mo79743a(C90120fr.f250811ac);
                if (a2 <= a) {
                    a = a2;
                }
                if (f < a) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: M */
    public final boolean mo79140M() {
        String str;
        if (this.f231497h.mo79746e(C90010bp.f246931a)) {
            C59104x b = f231489l.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NowOptInSettings");
            ((C59052c) ((C59052c) b).mo56372aa(7421)).mo56386p("Ablating discover.");
            return false;
        }
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        if (a != null && a.name != null) {
            str = a.name;
        } else if (!this.f231509u.mo78233a()) {
            return true;
        } else {
            str = null;
        }
        if (this.f231500k.mo78198e()) {
            return ((C86338r) this.f231492c.mo27525b()).getBoolean(m137442P(str), false);
        }
        return ((C86338r) this.f231492c.mo27525b()).getBoolean(m137441O(str), true);
    }

    /* renamed from: N */
    public final boolean mo79141N() {
        String F = ((C86054o) this.f231495f.mo27525b()).mo79659F();
        return (this.f231509u.mo78233a() && F == null) || this.f231490a.mo79173k(F) || mo79137J(F);
    }

    /* renamed from: c */
    public final int mo79142c(String str) {
        this.f231507s.mo28211k(mo79148i(str), "notify session controller", new C90952r("NowOptInSettings", "notify session controller", "failure"));
        return this.f231490a.mo79164a(str);
    }

    /* renamed from: d */
    public final int mo79143d(String str) {
        C90748e.m148224b();
        return ((Integer) C60856cj.m92910s(mo79148i(str))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo79144e() {
        return Arrays.hashCode(new Object[]{this.f231501m.mo79764c(R.string.device_country), Locale.getDefault().toString(), this.f231505q.mo27525b()});
    }

    /* renamed from: f */
    public final int mo79145f(String str) {
        return this.f231491b.getInt(C90507o.f253027q.concat(String.valueOf(str)), -1);
    }

    /* renamed from: g */
    public final int mo79146g() {
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        if (a == null) {
            return -1;
        }
        return this.f231490a.mo79165b(a.name);
    }

    /* renamed from: h */
    public final C58833ax mo79147h(String str) {
        int i;
        int a = this.f231490a.mo79164a(str);
        if (m137444R(str)) {
            i = this.f231501m.mo79762a(R.integer.saved_whitelisted_configuration_expiry_seconds);
        } else {
            i = this.f231501m.mo79762a(R.integer.saved_configuration_expiry_seconds);
        }
        long j = this.f231491b.getLong(C90507o.f253026p.concat(str), 0) + (((long) i) * 1000);
        long b = this.f231493d.mo26870b();
        boolean B = mo79129B(str);
        if (a != 0 && a != 3 && b <= j && !B) {
            return C58833ax.m90834k(Integer.valueOf(a));
        }
        C58976aa aaVar = C58975e.f156826a;
        return C58836b.f156633a;
    }

    /* renamed from: i */
    public final C60870cx mo79148i(String str) {
        if (str == null) {
            return C60856cj.m92900i(2);
        }
        C58833ax h = mo79147h(str);
        if (h.mo56113h()) {
            return C60856cj.m92900i((Integer) h.mo56107c());
        }
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.NOW_OPTIN;
        gVar.f239204f = "now_opt_in";
        ClientConfig clientConfig = new ClientConfig(gVar);
        C88489j jVar = new C88489j(C87739bu.FETCH_NOW_ELIGIBILITY);
        C62940bt btVar = C87796dx.f237586a;
        C87797dy dyVar = (C87797dy) C87798dz.f237587c.createBuilder();
        dyVar.copyOnWrite();
        C87798dz dzVar = (C87798dz) dyVar.instance;
        dzVar.f237589a |= 1;
        dzVar.f237590b = str;
        jVar.mo82014b(btVar, (C87798dz) dyVar.build());
        return C60922j.m93044g(this.f231506r.mo82005d(clientConfig, jVar.mo82013a(), C88244um.NOW_ELIGIBILITY_RESPONSE, 50000), C85650ba.f231488a, C60826bg.f164896a);
    }

    /* renamed from: j */
    public final C7661fg mo79149j(String str) {
        if (str == null) {
            return null;
        }
        C7661fg c = this.f231494e.f233392c.mo79166c(str);
        if (c == null) {
            mo79155r(str, 0, 0);
        }
        return c;
    }

    /* renamed from: m */
    public final void mo79150m() {
        ((C91480f) this.f231498i.mo27525b()).mo85822a();
        this.f231503o.mo85687h();
        ((C91189au) this.f231504p.mo27525b()).mo85430t();
        ((SharedPreferences) this.f231502n.f254707a.mo17428b()).edit().remove("com.google.android.apps.sidekick.KANSAS_VERSION_INFO").remove("com.google.android.apps.sidekick.KANSAS_VERSION_INFO_EXPIRATION").remove("com.google.android.apps.sidekick.FP_VERSION_INFO").remove("com.google.android.apps.sidekick.FP_VERSION_INFO_EXPIRATION").apply();
    }

    /* renamed from: n */
    public final void mo79151n() {
        for (String str : ((C86054o) this.f231495f.mo27525b()).mo79685s()) {
            int c = mo79142c(str);
            if (!(c == 1 || c == 2)) {
                this.f231508t.mo28212l("Update canAccountRunNow", new C85641az(this, str));
            }
        }
    }

    /* renamed from: o */
    public final void mo79152o(String str, int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f231510v) {
            if (str != null) {
                C86337q b = this.f231491b.mo80076b();
                b.mo80070e(C90507o.f253022l.concat(str), i);
                b.mo80067b(C90507o.f253024n.concat(str), z);
                b.mo80075j(C90507o.f253023m.concat(str));
                b.apply();
                C86337q b2 = this.f231491b.mo80076b();
                b2.mo80067b(C90507o.f253030t, false);
                b2.apply();
            }
        }
    }

    /* renamed from: p */
    public final void mo79153p(String str) {
        synchronized (this.f231510v) {
            if (str != null) {
                if (this.f231490a.mo79173k(str)) {
                    C86337q b = this.f231491b.mo80076b();
                    b.mo80067b(C90507o.f253023m.concat(str), true);
                    b.mo80075j(C90507o.f253022l.concat(str));
                    b.mo80075j(C90507o.f253024n.concat(str));
                    b.apply();
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo79154q(boolean z) {
        long b = z ? this.f231493d.mo26870b() : 0;
        C86337q b2 = this.f231491b.mo80076b();
        b2.mo80072g(C90507o.f253029s, b);
        b2.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo79155r(String str, long j, int i) {
        C86337q b = this.f231491b.mo80076b();
        b.mo80072g(C90507o.f253026p.concat(str), j);
        b.mo80070e(C90507o.f253025o.concat(str), i);
        b.apply();
    }

    /* renamed from: s */
    public final void mo79156s(String str, int i) {
        C86337q b = this.f231491b.mo80076b();
        b.mo80070e(C90507o.f253028r.concat(String.valueOf(str)), i);
        b.apply();
    }

    /* renamed from: t */
    public final void mo79157t(String str, int i) {
        C86337q b = this.f231491b.mo80076b();
        b.mo80070e(C90507o.f253027q.concat(String.valueOf(str)), i);
        b.apply();
    }

    /* renamed from: u */
    public final void mo79158u() {
        String F = ((C86054o) this.f231495f.mo27525b()).mo79659F();
        mo79157t(((C86054o) this.f231495f.mo27525b()).mo79659F(), (int) this.f231497h.mo79743a(C90120fr.f250812ad));
        if (F != null && m137443Q(F)) {
            mo79156s(F, 2);
        }
    }

    /* renamed from: v */
    public final void mo79159v(boolean z) {
        String str;
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        if (a != null && a.name != null) {
            str = a.name;
        } else if (this.f231509u.mo78233a()) {
            str = null;
        } else {
            return;
        }
        long b = this.f231493d.mo26870b();
        C86337q b2 = ((C86338r) this.f231492c.mo27525b()).mo80076b();
        b2.putBoolean(m137441O(str), z);
        b2.putString(m137446l(str), new Date(b).toString());
        b2.putString(m137445k(str), String.format("%b %s", new Object[]{Boolean.valueOf(z), new Date(b)}));
        if (this.f231500k.mo78198e()) {
            b2.putBoolean(m137442P(str), z);
        }
        b2.apply();
        for (C134529a c : this.f231499j) {
            c.mo85805c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo79160w(String str) {
        return str != null && this.f231491b.getBoolean(C90507o.f253023m.concat(str), false);
    }

    /* renamed from: x */
    public final boolean mo79161x(Account account) {
        if (account == null) {
            return false;
        }
        return this.f231490a.mo79173k(account.name);
    }

    /* renamed from: y */
    public final boolean mo79162y() {
        Account a = ((C86054o) this.f231495f.mo27525b()).mo79668a();
        return a != null && mo79163z(a.name);
    }

    /* renamed from: z */
    public final boolean mo79163z(String str) {
        return str != null && this.f231491b.getBoolean(C90507o.f253024n.concat(str), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x030d, code lost:
        if (r0 != 1) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0324, code lost:
        if (r3.f26641a == false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0335, code lost:
        if (r0.f27282a == false) goto L_0x030b;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79136I(com.google.p375ai.p378b.C7661fg r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r18.getClass()
            com.google.android.apps.gsa.search.core.preferences.j r3 = r1.f231494e
            java.lang.Object r4 = r3.f233390a
            monitor-enter(r4)
            com.google.android.apps.gsa.search.core.bd r5 = r3.f233392c     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r5 = r5.mo79166c(r2)     // Catch:{ all -> 0x035c }
            if (r5 != 0) goto L_0x0018
            com.google.ai.b.fg r5 = com.google.p375ai.p378b.C7661fg.f26585n     // Catch:{ all -> 0x035c }
        L_0x0018:
            com.google.ai.b.fg r6 = com.google.p375ai.p378b.C7661fg.f26585n     // Catch:{ all -> 0x035c }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x035c }
            com.google.ai.b.ff r6 = (com.google.p375ai.p378b.C7660ff) r6     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0037
            boolean r7 = r0.f26588b     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r9 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r9 = (com.google.p375ai.p378b.C7661fg) r9     // Catch:{ all -> 0x035c }
            int r10 = r9.f26587a     // Catch:{ all -> 0x035c }
            r10 = r10 | r8
            r9.f26587a = r10     // Catch:{ all -> 0x035c }
            r9.f26588b = r7     // Catch:{ all -> 0x035c }
            goto L_0x004c
        L_0x0037:
            int r7 = r5.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & r8
            if (r7 == 0) goto L_0x004c
            boolean r7 = r5.f26588b     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r9 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r9 = (com.google.p375ai.p378b.C7661fg) r9     // Catch:{ all -> 0x035c }
            int r10 = r9.f26587a     // Catch:{ all -> 0x035c }
            r10 = r10 | r8
            r9.f26587a = r10     // Catch:{ all -> 0x035c }
            r9.f26588b = r7     // Catch:{ all -> 0x035c }
        L_0x004c:
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r9 = 2
            r7 = r7 & r9
            if (r7 == 0) goto L_0x0063
            boolean r7 = r0.f26589c     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | r9
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26589c = r7     // Catch:{ all -> 0x035c }
            goto L_0x0078
        L_0x0063:
            int r7 = r5.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & r9
            if (r7 == 0) goto L_0x0078
            boolean r7 = r5.f26589c     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | r9
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26589c = r7     // Catch:{ all -> 0x035c }
        L_0x0078:
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0090
            boolean r7 = r0.f26590d     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | 4
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26590d = r7     // Catch:{ all -> 0x035c }
            goto L_0x00a7
        L_0x0090:
            int r7 = r5.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 4
            if (r7 == 0) goto L_0x00a7
            boolean r7 = r5.f26590d     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | 4
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26590d = r7     // Catch:{ all -> 0x035c }
        L_0x00a7:
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00b4
            com.google.ai.b.vl r7 = r0.f26591e     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x00ba
            com.google.ai.b.vl r7 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x035c }
            goto L_0x00ba
        L_0x00b4:
            com.google.ai.b.vl r7 = r5.f26591e     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x00ba
            com.google.ai.b.vl r7 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x035c }
        L_0x00ba:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26591e = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 8
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00d9
            com.google.ai.b.og r7 = r0.f26592f     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x00df
            com.google.ai.b.og r7 = com.google.p375ai.p378b.C7904og.f27779a     // Catch:{ all -> 0x035c }
            goto L_0x00df
        L_0x00d9:
            com.google.ai.b.og r7 = r5.f26592f     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x00df
            com.google.ai.b.og r7 = com.google.p375ai.p378b.C7904og.f27779a     // Catch:{ all -> 0x035c }
        L_0x00df:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26592f = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 16
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 32
            if (r7 == 0) goto L_0x00fe
            com.google.ai.b.zo r7 = r0.f26593g     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0104
            com.google.ai.b.zo r7 = com.google.p375ai.p378b.C8209zo.f28835a     // Catch:{ all -> 0x035c }
            goto L_0x0104
        L_0x00fe:
            com.google.ai.b.zo r7 = r5.f26593g     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0104
            com.google.ai.b.zo r7 = com.google.p375ai.p378b.C8209zo.f28835a     // Catch:{ all -> 0x035c }
        L_0x0104:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26593g = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 32
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 64
            if (r7 == 0) goto L_0x0123
            com.google.ai.b.fq r7 = r0.f26594h     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0129
            com.google.ai.b.fq r7 = com.google.p375ai.p378b.C7671fq.f26639b     // Catch:{ all -> 0x035c }
            goto L_0x0129
        L_0x0123:
            com.google.ai.b.fq r7 = r5.f26594h     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0129
            com.google.ai.b.fq r7 = com.google.p375ai.p378b.C7671fq.f26639b     // Catch:{ all -> 0x035c }
        L_0x0129:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26594h = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 64
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0148
            com.google.ai.b.kn r7 = r0.f26595i     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x014e
            com.google.ai.b.kn r7 = com.google.p375ai.p378b.C7803kn.f27280b     // Catch:{ all -> 0x035c }
            goto L_0x014e
        L_0x0148:
            com.google.ai.b.kn r7 = r5.f26595i     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x014e
            com.google.ai.b.kn r7 = com.google.p375ai.p378b.C7803kn.f27280b     // Catch:{ all -> 0x035c }
        L_0x014e:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26595i = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x016d
            com.google.ai.b.ge r7 = r0.f26596j     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0173
            com.google.ai.b.ge r7 = com.google.p375ai.p378b.C7686ge.f26856a     // Catch:{ all -> 0x035c }
            goto L_0x0173
        L_0x016d:
            com.google.ai.b.ge r7 = r5.f26596j     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0173
            com.google.ai.b.ge r7 = com.google.p375ai.p378b.C7686ge.f26856a     // Catch:{ all -> 0x035c }
        L_0x0173:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            r10.f26596j = r7     // Catch:{ all -> 0x035c }
            int r7 = r10.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r10.f26587a = r7     // Catch:{ all -> 0x035c }
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x01a0
            com.google.protobuf.z r7 = r0.f26597k     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26597k = r7     // Catch:{ all -> 0x035c }
            goto L_0x01ba
        L_0x01a0:
            int r7 = r5.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x01ba
            com.google.protobuf.z r7 = r5.f26597k     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r10 = (com.google.p375ai.p378b.C7661fg) r10     // Catch:{ all -> 0x035c }
            r7.getClass()     // Catch:{ all -> 0x035c }
            int r11 = r10.f26587a     // Catch:{ all -> 0x035c }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f26587a = r11     // Catch:{ all -> 0x035c }
            r10.f26597k = r7     // Catch:{ all -> 0x035c }
        L_0x01ba:
            int r7 = r0.f26587a     // Catch:{ all -> 0x035c }
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x01c7
            com.google.ai.b.gs r5 = r0.f26598l     // Catch:{ all -> 0x035c }
            if (r5 != 0) goto L_0x01cd
            com.google.ai.b.gs r5 = com.google.p375ai.p378b.C7700gs.f26874c     // Catch:{ all -> 0x035c }
            goto L_0x01cd
        L_0x01c7:
            com.google.ai.b.gs r5 = r5.f26598l     // Catch:{ all -> 0x035c }
            if (r5 != 0) goto L_0x01cd
            com.google.ai.b.gs r5 = com.google.p375ai.p378b.C7700gs.f26874c     // Catch:{ all -> 0x035c }
        L_0x01cd:
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r7 = (com.google.p375ai.p378b.C7661fg) r7     // Catch:{ all -> 0x035c }
            r5.getClass()     // Catch:{ all -> 0x035c }
            r7.f26598l = r5     // Catch:{ all -> 0x035c }
            int r5 = r7.f26587a     // Catch:{ all -> 0x035c }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r7.f26587a = r5     // Catch:{ all -> 0x035c }
            com.google.protobuf.ch r5 = r0.f26599m     // Catch:{ all -> 0x035c }
            r6.copyOnWrite()     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r7 = (com.google.p375ai.p378b.C7661fg) r7     // Catch:{ all -> 0x035c }
            com.google.protobuf.ch r10 = r7.f26599m     // Catch:{ all -> 0x035c }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x035c }
            if (r11 != 0) goto L_0x01f6
            com.google.protobuf.ch r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r10)     // Catch:{ all -> 0x035c }
            r7.f26599m = r10     // Catch:{ all -> 0x035c }
        L_0x01f6:
            com.google.protobuf.ch r7 = r7.f26599m     // Catch:{ all -> 0x035c }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r7)     // Catch:{ all -> 0x035c }
            com.google.protobuf.bv r5 = r6.build()     // Catch:{ all -> 0x035c }
            com.google.ai.b.fg r5 = (com.google.p375ai.p378b.C7661fg) r5     // Catch:{ all -> 0x035c }
            com.google.android.apps.gsa.search.core.bd r6 = r3.f233392c     // Catch:{ all -> 0x035c }
            r6.mo79167e(r2, r5)     // Catch:{ all -> 0x035c }
            android.content.Context r6 = r3.f233393d     // Catch:{ all -> 0x035c }
            dagger.a r7 = r3.f233391b     // Catch:{ all -> 0x035c }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ all -> 0x035c }
            com.google.android.apps.gsa.sidekick.main.f.o r7 = (com.google.android.apps.gsa.sidekick.main.p7203f.C91385o) r7     // Catch:{ all -> 0x035c }
            com.google.ai.b.vl r10 = r5.f26591e     // Catch:{ all -> 0x035c }
            if (r10 != 0) goto L_0x0216
            com.google.ai.b.vl r10 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x035c }
        L_0x0216:
            com.google.ai.b.ve r10 = r10.f28483j     // Catch:{ all -> 0x035c }
            if (r10 != 0) goto L_0x021c
            com.google.ai.b.ve r10 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x035c }
        L_0x021c:
            com.google.protobuf.cq r10 = r10.f28458b     // Catch:{ all -> 0x035c }
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x035c }
            if (r11 == 0) goto L_0x0227
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x035c }
            goto L_0x022b
        L_0x0227:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ all -> 0x035c }
        L_0x022b:
            android.content.res.Resources r11 = r6.getResources()     // Catch:{ all -> 0x035c }
            r12 = 2132089411(0x7f151a43, float:1.9819133E38)
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x035c }
            android.app.NotificationChannel r12 = r7.mo85699a(r11)     // Catch:{ all -> 0x035c }
            if (r12 == 0) goto L_0x024e
            int r12 = r12.getImportance()     // Catch:{ all -> 0x035c }
            r7.mo85702e(r11)     // Catch:{ all -> 0x035c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x035c }
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)     // Catch:{ all -> 0x035c }
            com.google.android.apps.gsa.search.core.preferences.C86315f.m139021c(r6, r7, r11)     // Catch:{ all -> 0x035c }
        L_0x024e:
            boolean r11 = r10.mo56113h()     // Catch:{ all -> 0x035c }
            r12 = 0
            if (r11 == 0) goto L_0x02dd
            java.lang.Object r11 = r10.mo56107c()     // Catch:{ all -> 0x035c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x035c }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x035c }
            if (r11 == 0) goto L_0x0263
            goto L_0x02dd
        L_0x0263:
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ all -> 0x035c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x035c }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x035c }
            r11.<init>()     // Catch:{ all -> 0x035c }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x035c }
            r13 = 1
        L_0x0273:
            boolean r14 = r10.hasNext()     // Catch:{ all -> 0x035c }
            if (r14 == 0) goto L_0x029f
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x035c }
            com.google.ai.b.vd r14 = (com.google.p375ai.p378b.C8090vd) r14     // Catch:{ all -> 0x035c }
            if (r14 == 0) goto L_0x0273
            java.lang.String r13 = com.google.android.apps.gsa.search.core.preferences.C86315f.m139020b(r14)     // Catch:{ all -> 0x035c }
            java.lang.String r15 = r14.f28453c     // Catch:{ all -> 0x035c }
            int r14 = r14.f28454d     // Catch:{ all -> 0x035c }
            int r14 = com.google.p375ai.p378b.C8089vc.m22934a(r14)     // Catch:{ all -> 0x035c }
            if (r14 != 0) goto L_0x0291
            r14 = 1007(0x3ef, float:1.411E-42)
        L_0x0291:
            int r14 = r14 + -1001
            android.app.NotificationChannel r14 = com.google.android.apps.gsa.search.core.preferences.C86315f.m139019a(r13, r15, r14)     // Catch:{ all -> 0x035c }
            r7.mo85701c(r14)     // Catch:{ all -> 0x035c }
            r11.add(r13)     // Catch:{ all -> 0x035c }
            r13 = 0
            goto L_0x0273
        L_0x029f:
            java.util.List r10 = r7.mo85700b()     // Catch:{ all -> 0x035c }
            if (r10 == 0) goto L_0x02d6
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x035c }
        L_0x02a9:
            boolean r14 = r10.hasNext()     // Catch:{ all -> 0x035c }
            if (r14 == 0) goto L_0x02d6
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x035c }
            android.app.NotificationChannel r14 = (android.app.NotificationChannel) r14     // Catch:{ all -> 0x035c }
            java.lang.String r14 = r14.getId()     // Catch:{ all -> 0x035c }
            int r15 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x02d4 }
            if (r15 < 0) goto L_0x02a9
            r9 = 27
            if (r15 == r9) goto L_0x02d4
            boolean r9 = r11.contains(r14)     // Catch:{ all -> 0x035c }
            if (r9 != 0) goto L_0x02d4
            java.lang.String r9 = "miscellaneous"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x035c }
            if (r9 != 0) goto L_0x02d4
            r7.mo85702e(r14)     // Catch:{ all -> 0x035c }
        L_0x02d4:
            r9 = 2
            goto L_0x02a9
        L_0x02d6:
            if (r13 == 0) goto L_0x02dd
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x035c }
            com.google.android.apps.gsa.search.core.preferences.C86315f.m139021c(r6, r7, r9)     // Catch:{ all -> 0x035c }
        L_0x02dd:
            if (r5 == 0) goto L_0x02f2
            int r6 = r5.f26587a     // Catch:{ all -> 0x035c }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x02f2
            com.google.android.apps.gsa.search.core.preferences.h r3 = r3.mo80041b(r2)     // Catch:{ all -> 0x035c }
            com.google.ai.b.vl r5 = r5.f26591e     // Catch:{ all -> 0x035c }
            if (r5 != 0) goto L_0x02ef
            com.google.ai.b.vl r5 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x035c }
        L_0x02ef:
            r3.mo80035c(r5)     // Catch:{ all -> 0x035c }
        L_0x02f2:
            monitor-exit(r4)     // Catch:{ all -> 0x035c }
            if (r0 != 0) goto L_0x02f7
            r9 = 3
            goto L_0x0339
        L_0x02f7:
            int r3 = r0.f26587a
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0310
            com.google.ai.b.gs r0 = r0.f26598l
            if (r0 != 0) goto L_0x0303
            com.google.ai.b.gs r0 = com.google.p375ai.p378b.C7700gs.f26874c
        L_0x0303:
            int r0 = r0.f26876a
            int r0 = com.google.p375ai.p378b.C7697gp.m22808a(r0)
            if (r0 != 0) goto L_0x030d
        L_0x030b:
            r9 = 2
            goto L_0x0339
        L_0x030d:
            if (r0 == r8) goto L_0x0338
            goto L_0x030b
        L_0x0310:
            boolean r3 = r1.m137444R(r2)
            if (r3 != 0) goto L_0x0327
            int r3 = r0.f26587a
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0327
            com.google.ai.b.fq r3 = r0.f26594h
            if (r3 != 0) goto L_0x0322
            com.google.ai.b.fq r3 = com.google.p375ai.p378b.C7671fq.f26639b
        L_0x0322:
            boolean r3 = r3.f26641a
            if (r3 != 0) goto L_0x0327
            goto L_0x030b
        L_0x0327:
            int r3 = r0.f26587a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0338
            com.google.ai.b.kn r0 = r0.f26595i
            if (r0 != 0) goto L_0x0333
            com.google.ai.b.kn r0 = com.google.p375ai.p378b.C7803kn.f27280b
        L_0x0333:
            boolean r0 = r0.f27282a
            if (r0 != 0) goto L_0x0338
            goto L_0x030b
        L_0x0338:
            r9 = 1
        L_0x0339:
            com.google.android.apps.gsa.search.core.bd r0 = r1.f231490a
            r0.mo79168f(r2, r9)
            com.google.android.libraries.f.a r0 = r1.f231493d
            long r3 = r0.mo26870b()
            int r0 = r16.mo79144e()
            r1.mo79155r(r2, r3, r0)
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f231497h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90013bs.f247034r
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0358
            r1.mo79135H(r2)
        L_0x0358:
            if (r9 != r8) goto L_0x035b
            return r8
        L_0x035b:
            return r12
        L_0x035c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x035c }
            goto L_0x0360
        L_0x035f:
            throw r0
        L_0x0360:
            goto L_0x035f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85651bb.mo79136I(com.google.ai.b.fg, java.lang.String):boolean");
    }
}
