package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.Context;
import android.view.WindowManager;
import com.google.android.apps.gsa.assistant.shared.k.b.am;
import com.google.android.apps.gsa.assistant.shared.k.j;
import com.google.android.apps.gsa.search.core.p6519al.p6602bn.C84907a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87831fe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87833fg;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ff */
/* compiled from: PG */
public final class C116703ff extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323633a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.ff");

    /* renamed from: b */
    public final C84907a f323634b;

    /* renamed from: c */
    C60870cx f323635c = null;

    /* renamed from: d */
    C60870cx f323636d = null;

    /* renamed from: e */
    public final C68214a f323637e;

    /* renamed from: f */
    public final C22871g f323638f;

    /* renamed from: g */
    public final C58881cr f323639g;

    /* renamed from: h */
    public final Context f323640h;

    /* renamed from: i */
    public final C22871g f323641i;

    /* renamed from: j */
    final j f323642j = new C116700fc(this);

    /* renamed from: k */
    am f323643k = null;

    /* renamed from: l */
    private final C68214a f323644l;

    public C116703ff(Context context, C68214a aVar, C84907a aVar2, C68214a aVar3, C22871g gVar, C68214a aVar4, C22871g gVar2) {
        super(aVar, 174);
        this.f323640h = context;
        this.f323634b = aVar2;
        this.f323637e = aVar3;
        this.f323638f = gVar;
        this.f323639g = C58886cw.m90973a(new C116694ex(context));
        this.f323644l = aVar4;
        this.f323641i = gVar2;
    }

    /* renamed from: n */
    private static void m193673n(C60870cx cxVar, String str) {
        C60856cj.m92911t(cxVar, new C116702fe(str), C60826bg.f164896a);
    }

    /* renamed from: o */
    private final boolean m193674o() {
        return (((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248462aq) && ((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248463ar)) || ((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248464as);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.APP_MOVED_TO_FOREGROUND, C87739bu.APP_MOVED_TO_BACKGROUND};
    }

    /* renamed from: e */
    public final void mo102833e(String str) {
        C60856cj.m92911t(this.f323634b.mo78580d(str), new C116701fd(), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final void mo102834g() {
        C60870cx cxVar = this.f323636d;
        if (cxVar != null && !cxVar.isDone()) {
            this.f323636d.cancel(false);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("NudgeUiState");
        String str2 = "true";
        fVar.mo85279c("mIsVisible").mo85276a(C90752i.m148229c(this.f323643k != null ? str2 : "false"));
        C91005e c = fVar.mo85279c("mPendingShowNudge");
        C60870cx cxVar = this.f323635c;
        if (cxVar == null || cxVar.isDone()) {
            str = "false";
        } else {
            str = str2;
        }
        c.mo85276a(C90752i.m148229c(str));
        C91005e c2 = fVar.mo85279c("mPendingHideNudge");
        C60870cx cxVar2 = this.f323636d;
        if (cxVar2 == null || cxVar2.isDone()) {
            str2 = "false";
        }
        c2.mo85276a(C90752i.m148229c(str2));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        if (((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248462aq) || ((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248464as)) {
            C62940bt btVar = C87831fe.f237644a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (!bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C59052c cVar = (C59052c) ((C59052c) f323633a.mo56224b()).mo56372aa(32091);
                C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a == null) {
                    a = C87739bu.UNKNOWN;
                }
                cVar.mo56389s("Event with no package name: %s", a);
                return;
            }
            C87739bu buVar = C87739bu.UNKNOWN;
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 221) {
                C62940bt btVar2 = C87831fe.f237644a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r22 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r22);
                Object l = bwVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C87833fg fgVar = (C87833fg) obj;
                if (fgVar.f237648b.equals("com.google.android.phone.lockscreen")) {
                    m193673n(this.f323634b.mo78583g(), "Show lockscreen entry point");
                } else {
                    this.f323638f.mo28212l("ShowNudge", new C116695ey(this, fgVar));
                }
            } else if (ordinal == 222) {
                C62940bt btVar3 = C87831fe.f237644a;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r23 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r23);
                Object l2 = bwVar3.f169962ag.mo58854l(r23.f169971d);
                if (l2 == null) {
                    obj2 = r23.f169969b;
                } else {
                    obj2 = r23.mo58889c(l2);
                }
                C87833fg fgVar2 = (C87833fg) obj2;
                if (fgVar2.f237648b.equals("com.google.android.phone.lockscreen")) {
                    m193673n(this.f323634b.mo78579c(), "Hide lock screen entry point");
                } else {
                    this.f323638f.mo28212l("HideNudge", new C116696ez(this, fgVar2));
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo102835i(C89849ae aeVar, String str) {
        if (m193674o()) {
            this.f323634b.mo78581e(aeVar.f245884YW, str);
        }
    }

    /* renamed from: j */
    public final void mo102836j(C89849ae aeVar) {
        if (m193674o()) {
            ((C89859i) this.f323644l.mo27525b()).mo83702b(aeVar);
        }
    }

    /* renamed from: k */
    public final void mo102837k(String str) {
        this.f323636d = this.f323638f.mo28208h("Hide Nudge", ((C86124t) this.f323637e.mo27525b()).mo79743a(C90037cp.f248480bH), new C116698fa(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo102838m(int i, String str) {
        if (((C86124t) this.f323637e.mo27525b()).mo79746e(C90037cp.f248461ap)) {
            mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_TIMEOUT, str);
            this.f323634b.mo78584h();
        } else {
            if (this.f323643k != null) {
                C87739bu buVar = C87739bu.UNKNOWN;
                int i2 = i - 1;
                if (i2 == 0) {
                    mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_TIMEOUT, str);
                } else if (i2 == 1) {
                    mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_FOREGROUND_CHANGE, str);
                } else if (i2 != 2) {
                    mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_OUTSIDE_TOUCH, str);
                } else {
                    mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_USER_DISMISSED, str);
                }
            }
            am amVar = this.f323643k;
            if (amVar != null) {
                amVar.b = null;
                ((WindowManager) this.f323639g.mo6453a()).removeView(amVar.a);
                this.f323634b.mo78582f(amVar.d, amVar.c, ((C86124t) this.f323637e.mo27525b()).mo79743a(C90037cp.f248559ch));
                this.f323643k = null;
            }
        }
        mo102834g();
        C60870cx cxVar = this.f323635c;
        if (cxVar != null && !cxVar.isDone()) {
            this.f323635c.cancel(false);
            this.f323635c = null;
        }
    }
}
