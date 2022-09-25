package com.google.android.apps.gsa.sidekick.main.optin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountsException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserManager;
import android.support.p031v4.app.C0154a;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.C85640ay;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C85660bk;
import com.google.android.apps.gsa.search.core.C85661bl;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85663bn;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86021bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.udc.C87215k;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88157rg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23959i;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.p4575r.C60757n;
import com.google.p375ai.p378b.C7875ne;
import com.google.p375ai.p378b.C7876nf;
import com.google.p375ai.p378b.C7878nh;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7885no;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7887nq;
import com.google.p375ai.p378b.C7888nr;
import com.google.p375ai.p378b.C7889ns;
import com.google.p375ai.p378b.C7891nu;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class OptInActivity extends C91558c {

    /* renamed from: P */
    private static final C58495hd f255356P;

    /* renamed from: Q */
    private static final C58495hd f255357Q;

    /* renamed from: l */
    public static final C59071e f255358l = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.optin.OptInActivity");

    /* renamed from: m */
    static final ClientConfig f255359m;

    /* renamed from: A */
    public AccountManager f255360A;

    /* renamed from: B */
    public C84413ad f255361B;

    /* renamed from: C */
    public C85664bo f255362C;

    /* renamed from: D */
    public C91748d f255363D;

    /* renamed from: E */
    public C86124t f255364E;

    /* renamed from: F */
    public UserManager f255365F;

    /* renamed from: G */
    public C87215k f255366G;

    /* renamed from: H */
    public C85637av f255367H;

    /* renamed from: I */
    public C88483e f255368I;

    /* renamed from: J */
    public C89012aj f255369J;

    /* renamed from: K */
    public C68214a f255370K;

    /* renamed from: L */
    public C86021bb f255371L;

    /* renamed from: M */
    public int f255372M = 1;

    /* renamed from: N */
    public int f255373N = 1;

    /* renamed from: R */
    private Intent f255374R;

    /* renamed from: S */
    private List f255375S;

    /* renamed from: T */
    private boolean f255376T;

    /* renamed from: U */
    private boolean f255377U;

    /* renamed from: V */
    private boolean f255378V = false;

    /* renamed from: W */
    private boolean f255379W = false;

    /* renamed from: X */
    private int f255380X = -1;

    /* renamed from: Y */
    private View f255381Y;

    /* renamed from: n */
    public C7891nu f255382n = C7891nu.UNKNOWN_OPT_IN_SOURCE;

    /* renamed from: o */
    public String f255383o;

    /* renamed from: p */
    boolean f255384p = false;

    /* renamed from: q */
    ClientEventData f255385q;

    /* renamed from: r */
    C91574s f255386r;

    /* renamed from: s */
    int f255387s = 1;

    /* renamed from: t */
    public Context f255388t;

    /* renamed from: u */
    public C90929bz f255389u;

    /* renamed from: v */
    public C22871g f255390v;

    /* renamed from: w */
    public C22871g f255391w;

    /* renamed from: x */
    public C86054o f255392x;

    /* renamed from: z */
    public C85651bb f255393z;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.NOW_OPTIN;
        gVar.f239204f = "now_opt_in";
        f255359m = new ClientConfig(gVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C7891nu.UNKNOWN_OPT_IN_SOURCE, C55960bg.AGSA_UNKNOWN_OPT_IN_SOURCE);
        gzVar.mo55429h(C7891nu.FIRST_RUN, C55960bg.AGSA_FIRST_RUN);
        gzVar.mo55429h(C7891nu.SETUP_WIZARD, C55960bg.AGSA_SETUP_WIZARD);
        gzVar.mo55429h(C7891nu.SETTINGS_MASTER_SWITCH, C55960bg.AGSA_SETTINGS_MASTER_SWITCH);
        gzVar.mo55429h(C7891nu.SETTINGS_SELECT_ACCOUNT, C55960bg.AGSA_SETTINGS_SELECT_ACCOUNT);
        gzVar.mo55429h(C7891nu.GET_NOW_PROMO, C55960bg.AGSA_GET_NOW_PROMO);
        gzVar.mo55429h(C7891nu.VOICE_SEARCH_ADD_REMINDER, C55960bg.AGSA_VOICE_SEARCH_ADD_REMINDER);
        gzVar.mo55429h(C7891nu.VOICE_SEARCH_COMMUNICATION, C55960bg.AGSA_VOICE_SEARCH_COMMUNICATION);
        gzVar.mo55429h(C7891nu.ACCOUNT_SWITCHER_DRAWER, C55960bg.AGSA_ACCOUNT_SWITCHER_DRAWER);
        gzVar.mo55429h(C7891nu.GEL, C55960bg.AGSA_GEL);
        gzVar.mo55429h(C7891nu.CLOCKWORK, C55960bg.AGSA_CLOCKWORK);
        gzVar.mo55429h(C7891nu.GEARHEAD, C55960bg.AGSA_GEARHEAD);
        gzVar.mo55429h(C7891nu.NOW_WIDGET, C55960bg.AGSA_NOW_WIDGET);
        gzVar.mo55429h(C7891nu.LOCATION_HISTORY_PROMO_CARD, C55960bg.AGSA_LOCATION_HISTORY_PROMO_CARD);
        gzVar.mo55429h(C7891nu.WEB_APP_ACTIVITY_PROMO_CARD, C55960bg.AGSA_WEB_APP_ACTIVITY_PROMO_CARD);
        gzVar.mo55429h(C7891nu.THIRD_PARTY_PROMO_CARD, C55960bg.AGSA_THIRD_PARTY_PROMO_CARD);
        gzVar.mo55429h(C7891nu.PHONELINK_SRP, C55960bg.AGSA_PHONELINK_SRP);
        gzVar.mo55429h(C7891nu.NP_REMINDERS_DRAWER_ITEM, C55960bg.AGSA_NP_REMINDERS_DRAWER_ITEM);
        gzVar.mo55429h(C7891nu.NP_CUSTOMIZE_DRAWER_ITEM, C55960bg.AGSA_NP_CUSTOMIZE_DRAWER_ITEM);
        gzVar.mo55429h(C7891nu.NP_CUSTOMIZE_STREAM, C55960bg.AGSA_NP_CUSTOMIZE_STREAM);
        gzVar.mo55429h(C7891nu.NP_WARM_WELCOME_CARD, C55960bg.AGSA_NP_WARM_WELCOME_CARD);
        gzVar.mo55429h(C7891nu.SCREEN_ASSIST_OPT_IN, C55960bg.AGSA_SCREEN_ASSIST_OPT_IN);
        gzVar.mo55429h(C7891nu.NOW_OPT_IN_PROMO_CARD, C55960bg.AGSA_NOW_OPT_IN_PROMO_CARD);
        gzVar.mo55429h(C7891nu.CARDSYNC, C55960bg.AGSA_CARDSYNC);
        gzVar.mo55429h(C7891nu.SETTINGS_SCREEN_ASSIST, C55960bg.AGSA_SETTINGS_SCREEN_ASSIST);
        gzVar.mo55429h(C7891nu.AUTO_ACTIVATION_TASK, C55960bg.AGSA_AUTO_ACTIVATION_TASK);
        gzVar.mo55429h(C7891nu.SCREEN_ASSIST_SELECTION_MENU, C55960bg.AGSA_SCREEN_ASSIST_SELECTION_MENU);
        gzVar.mo55429h(C7891nu.SCREEN_ASSIST_CCT, C55960bg.AGSA_SCREEN_ASSIST_CCT);
        gzVar.mo55429h(C7891nu.OLYMPICS_ONEBOX_UPDATES_BUTTON, C55960bg.AGSA_OLYMPICS_ONEBOX_UPDATES_BUTTON);
        gzVar.mo55429h(C7891nu.OPA_ELIGIBLE_DEVICES, C55960bg.AGSA_OPA_ELIGIBLE_DEVICES);
        gzVar.mo55429h(C7891nu.OPA_INELIGIBLE_DEVICES, C55960bg.AGSA_OPA_INELIGIBLE_DEVICES);
        gzVar.mo55429h(C7891nu.WEB_AND_APP_ACTIVITY_WITH_LOCATION_HISTORY_CARD, C55960bg.AGSA_WEB_AND_APP_ACTIVITY_WITH_LOCATION_HISTORY_CARD);
        gzVar.mo55429h(C7891nu.OPT_IN_WORKER, C55960bg.AGSA_OPT_IN_WORKER);
        gzVar.mo55429h(C7891nu.APP_OPEN_REFRESH, C55960bg.AGSA_APP_OPEN_REFRESH);
        gzVar.mo55429h(C7891nu.PODCAST_PLAYER_PROMO_CARD, C55960bg.AGSA_PODCAST_PLAYER_PROMO_CARD);
        gzVar.mo55429h(C7891nu.GOOGLE_LENS_ONBOARDING, C55960bg.AGSA_GOOGLE_LENS_ONBOARDING);
        gzVar.mo55429h(C7891nu.MINUS_ONE, C55960bg.AGSA_MINUS_ONE);
        gzVar.mo55429h(C7891nu.COLLECTIONS_SIGN_IN, C55960bg.AGSA_COLLECTIONS_SIGN_IN);
        f255356P = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C7886np.DEVICE_CONTACTS, C55912b.DEVICE_CONTACTS);
        gzVar2.mo55429h(C7886np.DEVICE_APPS, C55912b.DEVICE_APPS);
        gzVar2.mo55429h(C7886np.WEB_AND_APP_HISTORY, C55912b.WEB_AND_APP_ACTIVITY);
        gzVar2.mo55429h(C7886np.AUDIO_HISTORY, C55912b.VOICE_AND_AUDIO_ACTIVITY);
        gzVar2.mo55429h(C7886np.WEB_HISTORY, C55912b.WEB_AND_APP_ACTIVITY);
        f255357Q = gzVar2.mo55427f(false);
    }

    /* renamed from: G */
    private final void m149786G() {
        int i = this.f255372M;
        if (!(i == 1 || i == 4 || this.f255383o != null)) {
            String F = this.f255392x.mo79659F();
            this.f255383o = F;
            if (F == null) {
                mo85937E(0, 4);
                return;
            }
        }
        String str = this.f255383o;
        if (str != null) {
            try {
                this.f255392x.mo79686t(str);
            } catch (AccountsException unused) {
                C59104x c = f255358l.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OptInActivity");
                ((C59052c) ((C59052c) c).mo56372aa(11710)).mo56389s("Invalid account: %s", this.f255383o);
                mo85937E(0, 4);
                return;
            }
        }
        if (!mo85941x()) {
            mo85935C(1);
        }
    }

    /* renamed from: H */
    private final void m149787H() {
        Toast.makeText(this, R.string.optin_generic_error, 0).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo85934B() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f255384p) {
            C88489j jVar = new C88489j(C87739bu.BACKGROUND_NOW_OPT_IN);
            C62940bt btVar = C88156rf.f238317a;
            C88157rg rgVar = (C88157rg) C88158rh.f238318f.createBuilder();
            C7891nu nuVar = this.f255382n;
            rgVar.copyOnWrite();
            C88158rh rhVar = (C88158rh) rgVar.instance;
            rhVar.f238321b = nuVar.f27730O;
            rhVar.f238320a |= 1;
            String F = this.f255392x.mo79659F();
            F.getClass();
            rgVar.copyOnWrite();
            C88158rh rhVar2 = (C88158rh) rgVar.instance;
            rhVar2.f238320a |= 4;
            rhVar2.f238323d = F;
            jVar.mo82014b(btVar, (C88158rh) rgVar.build());
            ClientEventData a = jVar.mo82013a();
            this.f255385q = a;
            this.f255368I.mo82004b(f255359m, a, 50000);
            if (this.f255374R != null) {
                mo85935C(0);
                return;
            }
            this.f255393z.mo79154q(false);
            mo85937E(-1, 0);
            return;
        }
        mo85935C(0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85935C(int r5) {
        /*
            r4 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r4.mo85941x()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r2 = 1
            if (r5 != r2) goto L_0x000e
            r5 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            com.google.android.apps.gsa.search.core.bb r3 = r4.f255393z
            r3.mo79154q(r2)
            if (r2 == 0) goto L_0x001f
            r0 = 9
            r4.mo85942z(r0)
            r4.m149787H()
            goto L_0x0036
        L_0x001f:
            if (r0 != 0) goto L_0x0031
            r0 = 46
            r4.mo85942z(r0)
            r0 = 2132092389(0x7f1525e5, float:1.9825173E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            goto L_0x0036
        L_0x0031:
            r0 = 32
            r4.mo85942z(r0)
        L_0x0036:
            android.content.Intent r0 = r4.f255374R
            if (r0 == 0) goto L_0x003d
            r4.startActivity(r0)
        L_0x003d:
            r0 = 2
            if (r5 != r0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = -1
        L_0x0042:
            r4.mo85937E(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.optin.OptInActivity.mo85935C(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo85936D(String str) {
        try {
            this.f255392x.mo79686t(str);
            mo85938F();
        } catch (AccountsException unused) {
            C59104x c = f255358l.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OptInActivity");
            ((C59052c) ((C59052c) c).mo56372aa(11718)).mo56389s("Invalid account: %s", str);
            mo85937E(0, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo85937E(int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f255380X = i2;
        Intent intent = new Intent();
        intent.putExtra("opt_in_result", i2);
        setResult(i, intent);
        finish();
        overridePendingTransition(17432576, 0);
    }

    /* renamed from: F */
    public final void mo85938F() {
        C58485gu<C7886np> guVar;
        C55912b bVar;
        C58976aa aaVar = C58975e.f156826a;
        Account a = this.f255392x.mo79668a();
        a.getClass();
        List<C7886np> list = this.f255375S;
        int i = 0;
        if (list.isEmpty()) {
            guVar = C58485gu.m89845m();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (C7886np npVar : list) {
                if (npVar == C7886np.WEB_AND_APP_HISTORY) {
                    this.f255378V = true;
                }
                try {
                    C85662bm a2 = C85662bm.m137512a(npVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (IllegalArgumentException e) {
                    C59104x d = f255358l.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "OptInActivity");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11698)).mo56389s("Invalid setting: %s", npVar);
                }
            }
            if (arrayList.isEmpty()) {
                guVar = C58485gu.m89845m();
            } else {
                C85661bl b = this.f255362C.mo79190b((C85662bm[]) arrayList.toArray(new C85662bm[arrayList.size()]));
                this.f255376T = true;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C85662bm bmVar = (C85662bm) arrayList.get(i2);
                    C85663bn a3 = b.mo79175a(bmVar);
                    if (a3.mo79184b()) {
                        this.f255376T = false;
                        if (!a3.f231553b) {
                            arrayList2.add(bmVar.f231548j);
                        }
                    } else if (bmVar == C85662bm.NOW_CARDS && a3.f231552a == C85660bk.INELIGIBLE_OTHER) {
                        arrayList2.add(bmVar.f231548j);
                    }
                }
                guVar = C58485gu.m89842j(arrayList2);
            }
        }
        this.f255375S = guVar;
        for (C7886np npVar2 : guVar) {
            if (npVar2 == C7886np.WEB_AND_APP_HISTORY) {
                this.f255379W = true;
            }
        }
        if (this.f255378V && !this.f255379W) {
            C85640ay.m137424a(a, C7880nj.WAA_ON, this.f255372M, this.f255382n, this.f255389u, this.f255367H);
        }
        if (this.f255375S.isEmpty()) {
            if (true == this.f255376T) {
                i = 3;
            }
            mo85935C(i);
        } else if (this.f255375S.size() == 1 && this.f255375S.get(0) == C7886np.GOOGLE_NOW_CARDS) {
            this.f255384p = true;
            mo85934B();
        } else {
            this.f255381Y.setVisibility(0);
            C7875ne neVar = (C7875ne) C7876nf.f27615b.createBuilder();
            List<C7886np> list2 = this.f255375S;
            neVar.copyOnWrite();
            ((C7876nf) neVar.instance).f27617a = C7876nf.emptyProtobufList();
            for (C7886np npVar3 : list2) {
                C7888nr nrVar = (C7888nr) C7889ns.f27684c.createBuilder();
                C7885no noVar = (C7885no) C7887nq.f27680c.createBuilder();
                int i3 = npVar3.f27679o;
                noVar.copyOnWrite();
                C7887nq nqVar = (C7887nq) noVar.instance;
                nqVar.f27682a |= 1;
                nqVar.f27683b = i3;
                nrVar.copyOnWrite();
                C7889ns nsVar = (C7889ns) nrVar.instance;
                C7887nq nqVar2 = (C7887nq) noVar.build();
                nqVar2.getClass();
                nsVar.f27687b = nqVar2;
                nsVar.f27686a |= 1;
                C7889ns nsVar2 = (C7889ns) nrVar.build();
                neVar.copyOnWrite();
                C7876nf nfVar = (C7876nf) neVar.instance;
                nsVar2.getClass();
                C62971cq cqVar = nfVar.f27617a;
                if (!cqVar.mo58948c()) {
                    nfVar.f27617a = C62942bv.mutableCopy(cqVar);
                }
                nfVar.f27617a.add(nsVar2);
                if (npVar3 == C7886np.GOOGLE_NOW_CARDS) {
                    this.f255384p = true;
                }
            }
            Bundle extras = getIntent().getExtras();
            if (extras == null || (bVar = C55912b.m87801a(extras.getInt("requested_activity_controls_setting", 0))) == C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN) {
                bVar = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
                for (C7886np npVar4 : this.f255375S) {
                    C55912b bVar2 = (C55912b) f255357Q.getOrDefault(npVar4, C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN);
                    if (bVar2 != C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN) {
                        C59104x d2 = f255358l.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "OptInActivity");
                        ((C59052c) ((C59052c) d2).mo56372aa(11701)).mo56389s("#getActivityControlsSetting: found setting = %s", npVar4);
                        i++;
                        bVar = bVar2;
                    }
                }
                if (i != 1) {
                    bVar = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
                }
            }
            if (bVar == C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN) {
                mo85935C(1);
                return;
            }
            Account a4 = this.f255392x.mo79668a();
            a4.getClass();
            C55960bg bgVar = (C55960bg) f255356P.getOrDefault(this.f255382n, C55960bg.AGSA_UNKNOWN_OPT_IN_SOURCE);
            C91563h hVar = new C91563h(this, a4);
            Context context = this.f255388t;
            C147488c cVar = (C147488c) this.f255370K.mo27525b();
            C89012aj ajVar = this.f255369J;
            try {
                C31760t.m59102i(context);
            } catch (Exception unused) {
            }
            C23959i.f65516b = new C91565j(ajVar);
            C23959i.f65517c = cVar;
            C91566k kVar = new C91566k();
            kVar.f255408b = hVar;
            kVar.mo29376m(a4, bVar, bgVar);
            C0154a aVar = new C0154a(mo545jw());
            aVar.mo685r(kVar, "OptInActivity");
            aVar.mo509f();
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(17432576, 0);
    }

    public final void onCreate(Bundle bundle) {
        List<Integer> list;
        C74504a.m120462a(f.K);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        if (extras.containsKey("opt_in_first_party_bundle") && (extras = C90772bp.m148298f(extras.getString("opt_in_first_party_bundle"))) == null) {
            extras = new Bundle();
        }
        this.f255374R = (Intent) extras.getParcelable("opt_in_completion_intent");
        this.f255383o = extras.getString("account_name");
        int a = C7878nh.m22883a(extras.getInt("opt_in_mode", 1));
        this.f255372M = a;
        if (a == 0) {
            this.f255372M = 1;
        }
        int[] intArray = extras.getIntArray("requested_settings");
        if (intArray == null) {
            list = null;
        } else {
            list = new ArrayList<>(C60757n.m92749j(intArray));
        }
        if (list == null || list.isEmpty()) {
            list = this.f255364E.mo79749o(C90013bs.f247033q);
        } else if (this.f255383o == null && this.f255392x.mo79668a() == null) {
            this.f255372M = 1;
            list.addAll(this.f255364E.mo79749o(C90013bs.f247033q));
        } else {
            this.f255372M = 3;
        }
        this.f255375S = new ArrayList(list.size());
        for (Integer intValue : list) {
            int intValue2 = intValue.intValue();
            C7886np a2 = C7886np.m22886a(intValue2);
            if (a2 == null) {
                C59104x d = f255358l.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OptInActivity");
                ((C59052c) ((C59052c) d).mo56372aa(11709)).mo56387q("Could not find opt in setting ID for %d", intValue2);
            } else {
                this.f255375S.add(a2);
            }
        }
        if (extras.containsKey("opt_in_source")) {
            C7891nu a3 = C7891nu.m22887a(extras.getInt("opt_in_source", 0));
            this.f255382n = a3;
            if (a3 == null) {
                a3 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
            }
            this.f255382n = a3;
        }
        this.f255377U = "com.google.android.sidekick.main.optin.NowOptInFirstPartyActivity".equals(getIntent().getComponent().getClassName()) || "com.google.android.apps.now.OPT_IN_1P".equals(getIntent().getAction());
        if (!this.f255364E.mo79746e(C90013bs.f247031o) || !this.f255365F.isDemoUser()) {
            if (this.f255377U) {
                C90476a aVar = C91018d.f254254a;
                if (!this.f255361B.mo77970g(this)) {
                    mo85937E(0, 4);
                    return;
                }
            }
            try {
                setContentView((int) R.layout.opt_in);
            } catch (NumberFormatException unused) {
                mo85935C(1);
            }
            this.f255381Y = findViewById(R.id.progress_container);
            if (bundle == null) {
                m149786G();
                if (!isFinishing()) {
                    mo85942z(27);
                } else {
                    return;
                }
            }
            int a4 = this.f255361B.mo77964a();
            this.f255387s = a4;
            if (a4 == 0) {
                this.f255393z.mo79151n();
                if (this.f255392x.mo79668a() != null) {
                    mo85938F();
                } else {
                    this.f255390v.mo28211k(this.f255391w.mo28209i(this.f255371L.mo79694b(Arrays.asList(this.f255392x.mo79684r())), "Remove all restricted accounts based on SAA status received from Geller", new C91559d(this)), "Get available accounts asynchronously for OptInActivity", new C91561f(this, this));
                }
            } else {
                C143875g gVar = C143875g.f389987a;
                if (C143700ab.m233447i(this.f255387s)) {
                    C91574s sVar = new C91574s(this, this.f255361B, 2, Arrays.asList(this.f255392x.mo79684r()));
                    this.f255386r = sVar;
                    sVar.show();
                    return;
                }
                mo85935C(1);
            }
        } else {
            m149787H();
            mo85937E(0, 4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f255380X;
        if (i == -1 || i == 2) {
            C85640ay.m137425b(48, mo85939w(), mo85940y(), this.f255373N);
        }
        int i2 = this.f255380X;
        if (i2 == -1 || i2 == 4 || i2 == 1) {
            C85640ay.m137424a(this.f255392x.mo79668a(), C7880nj.CANCEL, this.f255372M, this.f255382n, this.f255389u, this.f255367H);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        if (!isFinishing()) {
            this.f255373N = 2;
        }
        super.onUserLeaveHint();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C7891nu mo85939w() {
        return this.f255382n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final int mo85940y() {
        return this.f255372M;
    }
}
