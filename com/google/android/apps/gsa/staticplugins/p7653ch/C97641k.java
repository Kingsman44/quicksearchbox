package com.google.android.apps.gsa.staticplugins.p7653ch;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C85653bd;
import com.google.android.apps.gsa.search.core.C85661bl;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85663bn;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87828fb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87830fd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88096p;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88150r;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58820ak;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C7878nh;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.k */
/* compiled from: PG */
public final class C97641k extends C86734a implements C85022a {

    /* renamed from: j */
    private static final C59071e f272704j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ch.k");

    /* renamed from: k */
    private static final C58495hd f272705k;

    /* renamed from: a */
    public final C68214a f272706a;

    /* renamed from: b */
    public final C68214a f272707b;

    /* renamed from: c */
    public final C68214a f272708c;

    /* renamed from: f */
    public final C68214a f272709f;

    /* renamed from: g */
    public final C68214a f272710g;

    /* renamed from: h */
    public final C68214a f272711h;

    /* renamed from: i */
    public final C68214a f272712i;

    /* renamed from: l */
    private final C21370a f272713l;

    /* renamed from: m */
    private final C86124t f272714m;

    /* renamed from: n */
    private final C85664bo f272715n;

    /* renamed from: o */
    private final C86610af f272716o;

    /* renamed from: p */
    private final C22871g f272717p;

    /* renamed from: q */
    private final UserManager f272718q;

    /* renamed from: r */
    private final C97634d f272719r;

    /* renamed from: s */
    private final C68214a f272720s;

    /* renamed from: t */
    private boolean f272721t = false;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, C7880nj.IN_MOE_CONTROL);
        gzVar.mo55429h(2, C7880nj.IN_MOE_NO_VALUE_PROP_EXPERIMENT);
        gzVar.mo55429h(3, C7880nj.IN_MOE_UOS_EXPERIMENT);
        gzVar.mo55429h(4, C7880nj.IN_MOE_DEFERRED_BY_DAYS_EXPERIMENT);
        gzVar.mo55429h(5, C7880nj.IN_MOE_DEFERRED_BY_SEARCH_NUM_EXPERIMENT);
        gzVar.mo55429h(6, C7880nj.IN_MOE_NO_ONBOARDING_EXPERIMENT);
        f272705k = gzVar.mo55427f(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97641k(C21370a aVar, C86124t tVar, C85664bo boVar, C86610af afVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C22871g gVar, UserManager userManager, C68214a aVar8, C97634d dVar, C68214a aVar9) {
        super(C118575h.WORKER_OPT_IN, "optin");
        this.f272713l = aVar;
        this.f272714m = tVar;
        this.f272715n = boVar;
        this.f272716o = afVar;
        this.f272706a = aVar2;
        this.f272710g = aVar4;
        this.f272707b = aVar5;
        this.f272709f = aVar3;
        this.f272708c = aVar6;
        this.f272711h = aVar7;
        this.f272717p = gVar;
        this.f272718q = userManager;
        this.f272712i = aVar8;
        this.f272719r = dVar;
        this.f272720s = aVar9;
    }

    /* renamed from: f */
    private final void m161872f(C7891nu nuVar, String str, C7880nj njVar) {
        this.f272717p.mo28212l("Log Moe Experiment Arm", new C97636f(this, njVar, nuVar, str));
    }

    /* renamed from: a */
    public final C60870cx mo78656a(String str, C7891nu nuVar) {
        return this.f272717p.mo28207g("Opt user into Now", new C97638h(this, str, nuVar));
    }

    /* renamed from: b */
    public final C60870cx mo78657b(String str) {
        Account w = ((C86054o) this.f272707b.mo27525b()).mo79689w(str);
        if (str == null || w == null) {
            return C60856cj.m92900i(2);
        }
        C58833ax h = ((C85651bb) this.f272710g.mo27525b()).mo79147h(str);
        if (h.mo56113h()) {
            return C60856cj.m92900i((Integer) h.mo56107c());
        }
        C97634d dVar = this.f272719r;
        SettableFuture settableFuture = (SettableFuture) dVar.f272688g.get(str);
        if (settableFuture == null) {
            settableFuture = new SettableFuture();
            SettableFuture settableFuture2 = (SettableFuture) dVar.f272688g.putIfAbsent(str, settableFuture);
            if (settableFuture2 == null) {
                new C90873ag(C90877ak.m148471e(settableFuture, 10, TimeUnit.SECONDS, dVar.f272685d), dVar.f272685d, "Remove pending fetch", new C97626a(dVar, str)).mo85223a(new C97632b(dVar, str));
                dVar.f272684c.mo28207g("Fetch configuration", new C97633c(dVar, str, settableFuture));
            } else {
                settableFuture = settableFuture2;
            }
        }
        return C60922j.m93044g(C60922j.m93044g(settableFuture, C58820ak.f156611a, C60826bg.f164896a), new C97637g(this, str), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo78658c(ClientEventData clientEventData) {
        Object obj;
        C62940bt btVar = C88096p.f238183a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r0);
        Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C88150r rVar = (C88150r) obj;
        StartActivityForResultEventCompoundParcelable startActivityForResultEventCompoundParcelable = (StartActivityForResultEventCompoundParcelable) clientEventData.mo81912b(StartActivityForResultEventCompoundParcelable.class);
        if (rVar != null && this.f272716o.mo80227h()) {
            boolean z = false;
            int i = 5;
            if (startActivityForResultEventCompoundParcelable != null && startActivityForResultEventCompoundParcelable.mo81922b(Bundle.class)) {
                Bundle bundle = (Bundle) startActivityForResultEventCompoundParcelable.mo81921a(Bundle.class);
                int a = C7878nh.m22883a(bundle.getInt("opt_in_mode", 5));
                if (a != 0) {
                    i = a;
                }
                z = bundle.getBoolean("close-activity-on-full-cancel", false);
            }
            if (rVar.f238285c == 0 && z && i == 1) {
                C87684al alVar = new C87684al(C88244um.FORCE_CLOSE);
                alVar.mo81965b(C87828fb.f237641a, C87830fd.f237642a);
                ServiceEventData a2 = alVar.mo81964a();
                C86775r rVar2 = this.f272716o.f233977l;
                rVar2.getClass();
                rVar2.f234383e.mo80379b(a2);
            }
        }
    }

    /* renamed from: e */
    public final void mo78659e(C88158rh rhVar, int i) {
        int c;
        String F = ((C86054o) this.f272707b.mo27525b()).mo79659F();
        if (this.f272714m.mo79746e(C90013bs.f247025i) && F != null && !this.f272721t && ((C85651bb) this.f272710g.mo27525b()).mo79146g() < 0) {
            this.f272721t = true;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1549;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        if (this.f272714m.mo79746e(C90013bs.f247022f) && !((C85653bd) this.f272709f.mo27525b()).mo79171i() && F != null) {
            C7880nj njVar = (C7880nj) f272705k.get(Integer.valueOf((int) this.f272714m.mo79743a(C90013bs.f247018b)));
            if (njVar == null) {
                njVar = C7880nj.RESET_NOW_PREFERENCES;
                ((C59052c) ((C59052c) f272704j.mo56226d()).mo56372aa(30186)).mo56387q("Could not find Action for integer %d", (int) this.f272714m.mo79743a(C90013bs.f247018b));
                int i2 = C90755l.f253831a;
            }
            C7891nu a = C7891nu.m22887a(rhVar.f238321b);
            if (a == null) {
                a = C7891nu.UNKNOWN_OPT_IN_SOURCE;
            }
            m161872f(a, F, njVar);
        }
        if (!this.f272714m.mo79746e(C90013bs.f247019c)) {
            if (this.f272714m.mo79746e(C90013bs.f247032p)) {
                int c2 = ((C85651bb) this.f272710g.mo27525b()).mo79142c(F);
                if (c2 != 1 && c2 != 2) {
                    this.f272717p.mo28212l("Fetch eligibility on the fly", new C97639i(this, F));
                } else if (((C85651bb) this.f272710g.mo27525b()).mo79135H(F)) {
                    ((C91306ak) this.f272712i.mo27525b()).mo85590b();
                    return;
                } else {
                    return;
                }
            }
            if (!this.f272714m.mo79746e(C90013bs.f247031o) || !this.f272718q.isDemoUser()) {
                if (!this.f272714m.mo79746e(C90013bs.f247020d) && F != null) {
                    C85651bb bbVar = (C85651bb) this.f272710g.mo27525b();
                    Account w = ((C86054o) this.f272707b.mo27525b()).mo79689w(F);
                    if (w != null && !bbVar.mo79131D() && !bbVar.mo79161x(w) && ((c = bbVar.mo79142c(F)) == 1 || c == 0)) {
                        C7880nj njVar2 = (C7880nj) f272705k.get(Integer.valueOf((int) this.f272714m.mo79743a(C90013bs.f247026j)));
                        if (njVar2 == null) {
                            njVar2 = C7880nj.RESET_NOW_PREFERENCES;
                            ((C59052c) ((C59052c) f272704j.mo56226d()).mo56372aa(30179)).mo56387q("Could not find Action for integer %d", (int) this.f272714m.mo79743a(C90013bs.f247026j));
                            int i3 = C90755l.f253831a;
                        }
                        C7891nu a2 = C7891nu.m22887a(rhVar.f238321b);
                        if (a2 == null) {
                            a2 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
                        }
                        m161872f(a2, F, njVar2);
                    }
                }
                rhVar.getClass();
                boolean L = ((C85651bb) this.f272710g.mo27525b()).mo79139L();
                boolean K = ((C85651bb) this.f272710g.mo27525b()).mo79138K();
                if (L || K || rhVar.f238324e) {
                    if (F != null && this.f272714m.mo79746e(C90013bs.f247020d)) {
                        C7880nj njVar3 = (C7880nj) f272705k.get(Integer.valueOf((int) this.f272714m.mo79743a(C90013bs.f247026j)));
                        if (njVar3 == null) {
                            njVar3 = C7880nj.RESET_NOW_PREFERENCES;
                            ((C59052c) ((C59052c) f272704j.mo56226d()).mo56372aa(30182)).mo56387q("Could not find Action for integer %d", (int) this.f272714m.mo79743a(C90013bs.f247026j));
                            int i4 = C90755l.f253831a;
                        }
                        C7891nu a3 = C7891nu.m22887a(rhVar.f238321b);
                        if (a3 == null) {
                            a3 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
                        }
                        m161872f(a3, F, njVar3);
                    }
                    if (this.f272714m.mo79746e(C90013bs.f247017a) && F != null) {
                        C58485gu<Integer> o = this.f272714m.mo79749o(C90013bs.f247033q);
                        ArrayList<C85662bm> arrayList = new ArrayList<>(o.size());
                        for (Integer intValue : o) {
                            int intValue2 = intValue.intValue();
                            C7886np a4 = C7886np.m22886a(intValue2);
                            if (a4 == null) {
                                ((C59052c) ((C59052c) C85664bo.f231554a.mo56226d()).mo56372aa(7435)).mo56387q("Invalid setting id %s", intValue2);
                            } else {
                                try {
                                    C85662bm a5 = C85662bm.m137512a(a4);
                                    if (a5 != null) {
                                        arrayList.add(a5);
                                    }
                                } catch (IllegalArgumentException e) {
                                    ((C59052c) ((C59052c) ((C59052c) C85664bo.f231554a.mo56226d()).mo56382g(e)).mo56372aa(7434)).mo56389s("Invalid setting: %s", a4.name());
                                }
                            }
                        }
                        C85661bl a6 = this.f272715n.mo79189a(arrayList);
                        boolean z = false;
                        for (C85662bm bmVar : arrayList) {
                            if (bmVar == C85662bm.NOW_CARDS) {
                                z = true;
                            } else {
                                C85663bn a7 = a6.mo79175a(bmVar);
                                if (!a7.f231553b && a7.mo79184b()) {
                                }
                            }
                        }
                        C7891nu a8 = C7891nu.m22887a(rhVar.f238321b);
                        if (a8 == null) {
                            a8 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
                        }
                        m161872f(a8, F, C7880nj.WAA_ON);
                        if (z) {
                            mo78656a(F, C7891nu.OPT_IN_WORKER);
                            return;
                        }
                        return;
                    }
                    this.f272717p.mo28212l("Maybe start opt-in", new C97640j(this, rhVar, F, i));
                }
            }
        } else if (!((C85653bd) this.f272709f.mo27525b()).mo79171i()) {
            long b = this.f272713l.mo26870b();
            ((SharedPreferences) this.f272711h.mo27525b()).edit().putLong(C90507o.f253034x, b).apply();
            ((C134238a) this.f272720s.mo27525b()).mo111658a(Instant.ofEpochMilli(b));
            ((C91306ak) this.f272712i.mo27525b()).mo85590b();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OptInWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
