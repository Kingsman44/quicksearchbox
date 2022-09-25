package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107984ak;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114968s;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C115082t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53265hm;
import com.google.assistant.p3994s.p3995a.C53267ho;
import com.google.assistant.p3994s.p3995a.C53300iu;
import com.google.assistant.p3994s.p3995a.C53301iv;
import com.google.assistant.p3994s.p3995a.C53309jc;
import com.google.assistant.p3994s.p3995a.C53310jd;
import com.google.assistant.p3994s.p3995a.C53318jl;
import com.google.assistant.p3994s.p3995a.C53319jm;
import com.google.assistant.p3994s.p3995a.C53341kh;
import com.google.assistant.p3994s.p3995a.C53342ki;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58843bg;
import com.google.common.base.C58846bj;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.at */
/* compiled from: PG */
public final class C114796at {

    /* renamed from: a */
    public static final C59071e f318532a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.at");

    /* renamed from: b */
    public final C108013bm f318533b;

    /* renamed from: c */
    public final C22871g f318534c;

    /* renamed from: d */
    public List f318535d = new ArrayList();

    /* renamed from: e */
    public List f318536e = new ArrayList();

    /* renamed from: f */
    public C53267ho f318537f = C53267ho.f139638b;

    /* renamed from: g */
    private final C21370a f318538g;

    /* renamed from: h */
    private final C114795as f318539h;

    /* renamed from: i */
    private final C86124t f318540i;

    /* renamed from: j */
    private final C107698i f318541j;

    /* renamed from: k */
    private C58528ij f318542k;

    public C114796at(C86054o oVar, SharedPreferences sharedPreferences, C108013bm bmVar, C22871g gVar, C21370a aVar, C68214a aVar2, C86124t tVar, C107698i iVar) {
        this.f318533b = bmVar;
        this.f318534c = gVar;
        this.f318538g = aVar;
        C114795as asVar = new C114795as(oVar, sharedPreferences, aVar2);
        this.f318539h = asVar;
        this.f318542k = C58528ij.m90006F(asVar.f318529a.getStringSet(asVar.mo101592a(), C58733pz.f156496a));
        this.f318540i = tVar;
        this.f318541j = iVar;
        new C90873ag(bmVar.f300493i.mo96376e(3, 9, C58836b.f156633a, C107984ak.f300453a), gVar, "getZeroStateCardImpressionCountList", new C114779ac(this)).mo85223a(new C114786aj(this));
        new C90873ag(bmVar.mo76927b(), gVar, "getAllZeroStateClientDismissedCards", new C114782af(this)).mo85223a(C114783ag.f318514a);
        new C90873ag(bmVar.mo76928c(), gVar, "getAllZeroStateClientDismissedElements", new C114784ah(this)).mo85223a(C114785ai.f318516a);
    }

    /* renamed from: j */
    private final long m190297j(C63042fg fgVar) {
        long b = this.f318538g.mo26870b();
        long c = C62953e.m95478c(fgVar);
        if (c == 0) {
            return 0;
        }
        if (c <= b) {
            return -1;
        }
        return TimeUnit.MILLISECONDS.toMinutes(c - b);
    }

    /* renamed from: k */
    private static C115082t m190298k(C53265hm hmVar) {
        C114968s sVar = (C114968s) C115082t.f319452d.createBuilder();
        if ((hmVar.f139633a & 1) != 0) {
            long j = hmVar.f139634b;
            sVar.copyOnWrite();
            C115082t tVar = (C115082t) sVar.instance;
            tVar.f319454a |= 1;
            tVar.f319455b = j;
        }
        if ((hmVar.f139633a & 2) != 0) {
            String str = hmVar.f139635c;
            sVar.copyOnWrite();
            C115082t tVar2 = (C115082t) sVar.instance;
            str.getClass();
            tVar2.f319454a |= 2;
            tVar2.f319456c = str;
        }
        return (C115082t) sVar.build();
    }

    /* renamed from: l */
    private static C115082t m190299l(String str) {
        C114968s sVar = (C114968s) C115082t.f319452d.createBuilder();
        sVar.copyOnWrite();
        C115082t tVar = (C115082t) sVar.instance;
        str.getClass();
        tVar.f319454a |= 2;
        tVar.f319456c = str;
        return (C115082t) sVar.build();
    }

    /* renamed from: m */
    private static C63042fg m190300m(C53265hm hmVar, Intent intent) {
        if (intent != null && intent.hasExtra("dismissal_expiration_timestamp_millis")) {
            return C62953e.m95484i(intent.getLongExtra("dismissal_expiration_timestamp_millis", 0));
        }
        if ((hmVar.f139633a & 8) == 0) {
            return null;
        }
        C63042fg fgVar = hmVar.f139637e;
        return fgVar == null ? C63042fg.f170152c : fgVar;
    }

    /* renamed from: n */
    private static boolean m190301n(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("dismissal_on_client_only", false);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo101594a(C53420nf nfVar, Intent intent) {
        C53265hm hmVar = nfVar.f140170d;
        if (hmVar == null) {
            hmVar = C53265hm.f139631f;
        }
        if (!(hmVar.f139634b == 0 && (hmVar.f139633a & 2) == 0)) {
            mo101595b(hmVar, intent);
        }
        C53267ho hoVar = nfVar.f140171e;
        if (hoVar == null) {
            hoVar = C53267ho.f139638b;
        }
        C62971cq<C53265hm> cqVar = hoVar.f139640a;
        if (!cqVar.isEmpty()) {
            for (C53265hm hmVar2 : cqVar) {
                if (this.f318540i.mo79746e(C90014bt.f247803nz)) {
                    mo101595b(hmVar2, intent);
                }
                if (this.f318540i.mo79746e(C90014bt.f247752nA)) {
                    mo101596c(hmVar2, intent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo101595b(C53265hm hmVar, Intent intent) {
        long j;
        C53265hm hmVar2 = hmVar;
        C63042fg m = m190300m(hmVar, intent);
        if (m == null || m190297j(m) != -1) {
            boolean n = m190301n(intent);
            if ((hmVar2.f139633a & 1) != 0) {
                if (!this.f318540i.mo79746e(C90014bt.f247286eL) || n) {
                    C58526ih ihVar = new C58526ih();
                    ihVar.mo55489i(this.f318542k);
                    ihVar.mo55373c(Long.toString(hmVar2.f139634b));
                    C58528ij f = ihVar.mo55486f();
                    this.f318542k = f;
                    this.f318539h.mo101593b(f);
                } else {
                    mo101601h((int) hmVar2.f139634b, m);
                }
            }
            if ((hmVar2.f139633a & 2) != 0) {
                String str = hmVar2.f139635c;
                if (m != null) {
                    j = m190297j(m);
                    if (j == -1) {
                        ((C59052c) ((C59052c) f318532a.mo56226d()).mo56372aa(29548)).mo56386p("#addDismissedCard(): dismissal timestamp already expired.");
                        return;
                    }
                } else {
                    j = 0;
                }
                long j2 = j;
                if (!this.f318540i.mo79746e(C90014bt.f247286eL) || n) {
                    C115082t l = m190299l(str);
                    new C90873ag(this.f318533b.f300493i.mo96378g(3, 12, C58833ax.m90834k(l.f319456c.getBytes()), l.toByteArray(), j2), this.f318534c, "putZeroStateClientDismissedCard", new C114793aq(this, l)).mo85223a(C114794ar.f318528a);
                    return;
                }
                mo101602i(str, m, 1);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f318532a.mo56226d()).mo56372aa(29546)).mo56386p("#addDismissedCard(): dismissal timestamp already expired.");
    }

    /* renamed from: c */
    public final void mo101596c(C53265hm hmVar, Intent intent) {
        long j;
        C63042fg m = m190300m(hmVar, intent);
        if (m == null) {
            j = 0;
        } else {
            j = m190297j(m);
        }
        long j2 = j;
        if (j2 == -1) {
            ((C59052c) ((C59052c) f318532a.mo56226d()).mo56372aa(29550)).mo56386p("#addDismissedElement(): dismissal timestamp already expired.");
        } else if ((hmVar.f139633a & 2) == 0) {
        } else {
            if (!this.f318540i.mo79746e(C90014bt.f247286eL) || m190301n(intent)) {
                C115082t k = m190298k(hmVar);
                new C90873ag(this.f318533b.f300493i.mo96378g(3, 13, C58833ax.m90834k(k.f319456c.getBytes()), k.toByteArray(), j2), this.f318534c, "putZeroStateClientDismissedElement", new C114780ad(this, k)).mo85223a(C114781ae.f318512a);
                return;
            }
            mo101602i(hmVar.f139635c, m, 1);
        }
    }

    /* renamed from: d */
    public final void mo101597d(C53265hm hmVar, C53267ho hoVar) {
        mo101595b(hmVar, (Intent) null);
        if (hoVar != null) {
            for (C53265hm c : hoVar.f139640a) {
                mo101596c(c, (Intent) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo101598e(C53420nf nfVar) {
        C53265hm hmVar = nfVar.f140170d;
        if (hmVar == null) {
            hmVar = C53265hm.f139631f;
        }
        if (!(hmVar.f139634b == 0 && (hmVar.f139633a & 2) == 0)) {
            mo101599f(hmVar);
        }
        C53267ho hoVar = nfVar.f140171e;
        if (hoVar == null) {
            hoVar = C53267ho.f139638b;
        }
        C62971cq<C53265hm> cqVar = hoVar.f139640a;
        if (!cqVar.isEmpty()) {
            for (C53265hm hmVar2 : cqVar) {
                if (this.f318540i.mo79746e(C90014bt.f247803nz)) {
                    mo101599f(hmVar2);
                }
                if (this.f318540i.mo79746e(C90014bt.f247752nA) && (hmVar2.f139633a & 2) != 0) {
                    C115082t k = m190298k(hmVar2);
                    new C90873ag(this.f318533b.f300493i.mo96374c(3, 13, C58833ax.m90834k(k.f319456c.getBytes())), this.f318534c, "deleteZeroStateClientDismissedElement", new C114787ak(this, k)).mo85223a(C114788al.f318520a);
                    if (this.f318540i.mo79746e(C90014bt.f247286eL)) {
                        mo101602i(hmVar2.f139635c, (C63042fg) null, 2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo101599f(C53265hm hmVar) {
        if ((hmVar.f139633a & 1) != 0) {
            C58528ij E = C58528ij.m90005E(C58557jl.m90124e(this.f318542k, new C58843bg(C58846bj.m90900b(Long.toString(hmVar.f139634b)))));
            this.f318542k = E;
            this.f318539h.mo101593b(E);
            if (this.f318540i.mo79746e(C90014bt.f247286eL)) {
                mo101601h((int) hmVar.f139634b, (C63042fg) null);
            }
        }
        if ((hmVar.f139633a & 2) != 0) {
            String str = hmVar.f139635c;
            C115082t l = m190299l(str);
            new C90873ag(this.f318533b.f300493i.mo96374c(3, 12, C58833ax.m90834k(l.f319456c.getBytes())), this.f318534c, "deleteZeroStateClientDismissedCard", new C114791ao(this, l)).mo85223a(C114792ap.f318525a);
            if (this.f318540i.mo79746e(C90014bt.f247286eL)) {
                mo101602i(str, (C63042fg) null, 2);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo101600g(C53265hm hmVar, C53267ho hoVar) {
        if ((hmVar.f139633a & 1) != 0) {
            if (this.f318542k.contains(Long.toString(hmVar.f139634b))) {
                return true;
            }
        }
        if ((hmVar.f139633a & 2) != 0) {
            String str = hmVar.f139635c;
            for (C115082t tVar : this.f318535d) {
                if (tVar.f319456c.equals(str)) {
                    return true;
                }
            }
        }
        if (hoVar.f139640a.isEmpty()) {
            return false;
        }
        loop1:
        for (C53265hm hmVar2 : hoVar.f139640a) {
            if ((hmVar2.f139633a & 2) != 0) {
                String str2 = hmVar2.f139635c;
                Iterator it = this.f318536e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break loop1;
                    } else if (((C115082t) it.next()).f319456c.equals(str2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo101601h(int i, C63042fg fgVar) {
        char c;
        String str;
        switch (i) {
            case 0:
                c = 1;
                break;
            case 1:
                c = 2;
                break;
            case 2:
                c = 3;
                break;
            case 3:
                c = 4;
                break;
            case 4:
                c = 5;
                break;
            case 8:
                c = 9;
                break;
            case 9:
                c = 10;
                break;
            case 10:
                c = 11;
                break;
            case 11:
                c = 12;
                break;
            case 12:
                c = 13;
                break;
            case 14:
                c = 15;
                break;
            case 16:
                c = 17;
                break;
            case 17:
                c = 18;
                break;
            case 18:
                c = 19;
                break;
            case 20:
                c = 21;
                break;
            case 21:
                c = 22;
                break;
            case 22:
                c = 23;
                break;
            case 23:
                c = 24;
                break;
            case 24:
                c = 25;
                break;
            case 25:
                c = 26;
                break;
            case 26:
                c = 27;
                break;
            case 27:
                c = 28;
                break;
            case 28:
                c = 29;
                break;
            case 29:
                c = 30;
                break;
            case 30:
                c = 31;
                break;
            case 31:
                c = ' ';
                break;
            case 32:
                c = '!';
                break;
            default:
                c = 0;
                break;
        }
        if (c != 0) {
            switch (c) {
                case 1:
                    str = "UNSET";
                    break;
                case 2:
                    str = "WELCOME_CARD";
                    break;
                case 3:
                    str = "OPT_OUT_CARD";
                    break;
                case 4:
                    str = "HOME_WORK_CARD";
                    break;
                case 5:
                    str = "THIRD_PARTY_DISCLOSURE_CARD";
                    break;
                case 9:
                    str = "PARKING_LOCATION_CARD";
                    break;
                case 10:
                    str = "GREETING_CARD_MINDFULNESS_CARD";
                    break;
                case 11:
                    str = "GREETING_CARD_THANKSGIVING_CARD";
                    break;
                case 12:
                    str = "GREETING_CARD_BIRTHDAY_CARD";
                    break;
                case 13:
                    str = "LOCATION_HISTORY_CARD";
                    break;
                case 15:
                    str = "GREETING_CARD_NEW_YEAR_CARD";
                    break;
                case 17:
                    str = "WARMER_WELCOME_EXPERIMENT_CARD";
                    break;
                case 18:
                    str = "SHORTCUTS_ATTENTION_CARD";
                    break;
                case 19:
                    str = "PKG_CREATE_RELATIONSHIP_CARD";
                    break;
                case 21:
                    str = "TTD_ONBOARDING_CARD";
                    break;
                case 22:
                    str = "BIRTHDAY_ONBOARDING_CARD";
                    break;
                case 23:
                    str = "PKG_CREATE_LOCATION_ALIAS_CARD";
                    break;
                case 24:
                    str = "WHERE_IS_MY_FAMILY_ACCOUNT_LINK_CARD";
                    break;
                case 25:
                    str = "HOMESCREEN_SHORTCUT_CARD";
                    break;
                case 26:
                    str = "INFERRED_CONFIRMED_HOME_WORK_CARD";
                    break;
                case 27:
                    str = "PHOTO_DICOVERABILITY_OPT_IN";
                    break;
                case 28:
                    str = "FAMILY_BELL_CARD";
                    break;
                case 29:
                    str = "DONATIONS_CARD";
                    break;
                case 30:
                    str = "DONATIONS_RETARGET_CARD";
                    break;
                case 31:
                    str = "CUSTOMISATION_CARD";
                    break;
                case ' ':
                    str = "PHOTO_INDEX_OPT_IN_CARD";
                    break;
                case '!':
                    str = "TELL_MY_FAMILY_CARD";
                    break;
                default:
                    str = "null";
                    break;
            }
            mo101602i(str, fgVar, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo101602i(String str, C63042fg fgVar, int i) {
        C53300iu iuVar = (C53300iu) C53301iv.f139734d.createBuilder();
        iuVar.copyOnWrite();
        C53301iv ivVar = (C53301iv) iuVar.instance;
        str.getClass();
        ivVar.f139736a |= 1;
        ivVar.f139737b = str;
        if (fgVar != null) {
            iuVar.copyOnWrite();
            C53301iv ivVar2 = (C53301iv) iuVar.instance;
            ivVar2.f139738c = fgVar;
            ivVar2.f139736a |= 4;
        }
        C59326i iVar = C59326i.f157517e;
        C53309jc jcVar = (C53309jc) C53310jd.f139802c.createBuilder();
        C53318jl jlVar = (C53318jl) C53319jm.f139814d.createBuilder();
        jlVar.copyOnWrite();
        C53319jm jmVar = (C53319jm) jlVar.instance;
        jmVar.f139818c = i - 1;
        jmVar.f139816a |= 2;
        jlVar.copyOnWrite();
        C53319jm jmVar2 = (C53319jm) jlVar.instance;
        C53301iv ivVar3 = (C53301iv) iuVar.build();
        ivVar3.getClass();
        jmVar2.f139817b = ivVar3;
        jmVar2.f139816a |= 1;
        jcVar.copyOnWrite();
        C53310jd jdVar = (C53310jd) jcVar.instance;
        C53319jm jmVar3 = (C53319jm) jlVar.build();
        jmVar3.getClass();
        jdVar.f139805b = jmVar3;
        jdVar.f139804a = 2;
        byte[] byteArray = ((C53310jd) jcVar.build()).toByteArray();
        String l = iVar.mo56837l(byteArray, byteArray.length);
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = true;
        C53341kh khVar = (C53341kh) C53342ki.f139973d.createBuilder();
        khVar.copyOnWrite();
        C53342ki kiVar = (C53342ki) khVar.instance;
        kiVar.f139975a |= 4;
        kiVar.f139977c = l;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53342ki kiVar2 = (C53342ki) khVar.build();
        kiVar2.getClass();
        aeVar2.f237141h = kiVar2;
        aeVar2.f237134a |= 128;
        C107698i iVar2 = this.f318541j;
        C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        jVar.mo82014b(C87694ac.f237131a, (C87696ae) adVar.build());
        iVar2.mo96219b(jVar.mo82013a());
    }
}
