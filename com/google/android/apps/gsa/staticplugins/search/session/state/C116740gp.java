package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.p6930h.C87561d;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gp */
/* compiled from: PG */
public final class C116740gp extends C116780ib {

    /* renamed from: a */
    public final C68214a f323805a;

    /* renamed from: b */
    public final C68214a f323806b;

    /* renamed from: c */
    public final BitFlags f323807c = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: d */
    public int f323808d = 0;

    /* renamed from: e */
    public Query f323809e = Query.f252741b;

    /* renamed from: f */
    public ActionData f323810f;

    /* renamed from: g */
    public boolean f323811g = false;

    /* renamed from: h */
    public boolean f323812h = false;

    /* renamed from: i */
    public boolean f323813i = true;

    /* renamed from: j */
    private final C68214a f323814j;

    /* renamed from: k */
    private final C68214a f323815k;

    /* renamed from: l */
    private final C68214a f323816l;

    /* renamed from: m */
    private int f323817m = 1;

    public C116740gp(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        super(aVar, 154);
        this.f323806b = aVar2;
        this.f323805a = aVar3;
        this.f323815k = aVar4;
        this.f323814j = aVar5;
        this.f323816l = aVar6;
    }

    /* renamed from: q */
    private final int m193835q() {
        ActionData actionData;
        if (this.f323808d != 2) {
            C116836z zVar = (C116836z) this.f323815k.mo27525b();
            ActionData actionData2 = zVar.f324250j;
            if ((!((C116735gk) this.f323805a.mo27525b()).f323784p.mo84420dA() || actionData2 == null || !actionData2.mo81099j() || !zVar.mo102990U()) && (actionData = this.f323810f) != null && !actionData.mo81101l() && C87561d.m142217a(this.f323808d) && ((C116836z) this.f323815k.mo27525b()).mo102986P(((C116735gk) this.f323805a.mo27525b()).f323784p) && !((C116735gk) this.f323805a.mo27525b()).mo102874O()) {
                C58976aa aaVar = C58975e.f156826a;
                return 5;
            } else if ((((C116836z) this.f323815k.mo27525b()).mo102998ac() || ((C116819jn) this.f323816l.mo27525b()).mo102967v() || !mo102914k()) && ((C116735gk) this.f323805a.mo27525b()).f323784p.mo84433dN() && (!((C116836z) this.f323815k.mo27525b()).mo102998ac() || ((C116836z) this.f323815k.mo27525b()).mo102990U())) {
                C58976aa aaVar2 = C58975e.f156826a;
                return 6;
            } else if (this.f323813i) {
                return 1;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                return 8;
            }
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return 3;
        }
    }

    /* renamed from: e */
    public final void mo102910e(Query query, boolean z) {
        if (((C116735gk) this.f323805a.mo27525b()).f323784p.mo84383cP(query) && z != this.f323811g) {
            this.f323811g = z;
            if (z) {
                this.f323812h = true;
            }
            boolean o = mo102917o() | mo102918p();
            if (z) {
                ((C116625ci) this.f323806b.mo27525b()).mo102803e();
            }
            if (o) {
                mo80591ar();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo102911g() {
        return mo102914k() && !mo102912i();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("ResultsUiState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323807c.toString()));
        fVar.mo85279c("effect on web results").mo85276a(C90752i.m148230d(Integer.valueOf(this.f323808d)));
        C91005e c = fVar.mo85279c("WebView hidden reason");
        int i = this.f323817m;
        switch (i) {
            case 1:
                str = "WEB_RESULTS_NOT_HIDDEN";
                break;
            case 2:
                str = "WEB_RESULTS_ACTION_NOT_READY";
                break;
            case 3:
                str = "WEB_RESULTS_EFFECTS_PREVENT";
                break;
            case 4:
                str = "WEB_RESULTS_STREAM_PARSING";
                break;
            case 5:
                str = "WEB_RESULTS_PENDING_NETWORK_ACTION";
                break;
            case 6:
                str = "WEB_RESULTS_HIDE_FOR_DEMAND_SPACE";
                break;
            case 7:
                str = "WEB_RESULTS_HIDE_FOR_SEARCH_GRAPH";
                break;
            case 8:
                str = "WEB_RESULTS_HIDE_FOR_FIRST_SEARCH";
                break;
            case 9:
                str = "WEB_RESULTS_CLIENT_NOT_READY";
                break;
            case 10:
                str = "WEB_VIEW_NOT_LOADING";
                break;
            case 11:
                str = "WEB_VIEW_NOT_READY";
                break;
            case 12:
                str = "WEB_VIEW_HAS_STATE_ERROR";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            c.mo85276a(C90752i.m148229c(str));
            return;
        }
        throw null;
    }

    /* renamed from: i */
    public final boolean mo102912i() {
        return BitFlags.m148144f(this.f323807c.f253762b, 4);
    }

    /* renamed from: j */
    public final boolean mo102913j() {
        return BitFlags.m148144f(this.f323807c.f253762b, 1);
    }

    /* renamed from: k */
    public final boolean mo102914k() {
        return BitFlags.m148144f(this.f323807c.f253762b, 2);
    }

    /* renamed from: m */
    public final boolean mo102915m() {
        return this.f323807c.mo85049c(8, 0);
    }

    /* renamed from: n */
    public final boolean mo102916n(boolean z, int i, int i2) {
        if (!this.f323807c.mo85055h((long) i, z)) {
            return false;
        }
        if (!z) {
            return true;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i2;
        String b = C39191a.m68623b(this.f323809e.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return true;
    }

    /* renamed from: o */
    public final boolean mo102917o() {
        int i;
        boolean z = true;
        if (this.f323809e.mo84435dP()) {
            i = true != this.f323812h ? 7 : 1;
        } else {
            i = m193835q();
        }
        BitFlags bitFlags = this.f323807c;
        if (i != 1) {
            z = false;
        }
        return bitFlags.mo85055h(1, z);
    }

    /* renamed from: p */
    public final boolean mo102918p() {
        int i;
        int i2 = 7;
        boolean z = true;
        if (!this.f323809e.mo84435dP() || ActionData.m141430o(this.f323810f)) {
            C116819jn jnVar = (C116819jn) this.f323816l.mo27525b();
            switch (m193835q() - 1) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    break;
                case 7:
                    i2 = 8;
                    break;
                default:
                    if (jnVar.f324183s) {
                        if (jnVar.f324160W != 5) {
                            if (jnVar.f324181q != 0 && jnVar.mo102965t(jnVar.f324182r) && ((i = jnVar.f324160W) == 3 || i == 4)) {
                                i2 = 1;
                                break;
                            } else {
                                C58976aa aaVar = C58975e.f156826a;
                                i2 = 10;
                                break;
                            }
                        } else {
                            C58976aa aaVar2 = C58975e.f156826a;
                            i2 = 12;
                            break;
                        }
                    } else {
                        C58976aa aaVar3 = C58975e.f156826a;
                        i2 = 11;
                        break;
                    }
            }
            this.f323817m = i2;
        } else {
            C58838bb.m90883r(this.f323809e.mo84435dP());
            if (this.f323809e.mo84328bM() || (this.f323811g && ((C116742gr) this.f323814j.mo27525b()).mo102920m(this.f323809e) == null)) {
                i2 = 1;
            }
            this.f323817m = i2;
        }
        C58976aa aaVar4 = C58975e.f156826a;
        if (this.f323817m != 1) {
            z = false;
        }
        return mo102916n(z, 2, 171);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f323809e);
        int i = this.f323808d;
        String valueOf2 = String.valueOf(this.f323810f);
        String b = this.f323807c.mo85048b();
        return "ResultsUiState[query=" + valueOf + ", effects=" + i + ", actionData=" + valueOf2 + ", flags=" + b + "]";
    }
}
